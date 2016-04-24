import * as path from "path";
import * as fs from "fs";

/**
	* The different types referred to in the JSON API file
	*/
class Types {
    static Class = "class";
    static Methods = "methods";
    static MethodsStatic = "methods-static";
    static Method = "method";
    static Constructor = "constructor";
    static Properties = "properties"
    static Property = "property";
    static Return = "return";
    static Types = "types";
    static Entry = "entry";
    static Param = "param";
}

/**
  * The possbile attributes keys
  */
interface Attributes {
    packageName?: string;
    name?: string;
    fromProperty?: string;
    access?: string;
    check?: string;
    allowNull?: string;
    superClass?: string;
    type?: string;
    overriddenFrom?: string;
    mixins?: string;
    event?: string;
    dimensions?: number;
    optional?: boolean;
    interfaces?: string;
    docFrom?: string;
}

/**
	* This is the format of the Qooxdoo JSON API file.
	*/
interface Fmt {
    attributes: Attributes;
    children: Array<Fmt>;
    type: string;
}

enum ClassType {
    "interface",
    "class"
}


var indent = "    ";


// This is the string that contains the full declaration
var time = new Date();
var output = `// Generated declaration file at ${time}\n`


/**
  * Write a piece of code to the declaration file
  */
function write(msg) {
    output += msg;
}


/**
	* This class loads the Qooxdoo API files that are passed to the cosntructur
	* and generates a declaration file out of that.
	*/
class Parser {

    // Check for missing classes and add those files if required.
    static HANDLE_DEPENDECIES = true;

    // Don't put private methods and properties in the declaration
    static EXCLUDE_PRIVATE = true;

    // The level of logging
    static LOG_LEVEL = 3;

    // Include Mixins
    static HANLDE_MIXINS = true;

    // Sometime methods are duplicated. 
    static AVOID_DUPLICATES = true;

    // Where to find the API documentation json files
    static BASE_DIR = "api_5.0/";

    // Contains the mapping from Qooxdoo types to TypeScript types
    private typeMappings: Map<string, string>;

    private fileNames: string[];

    private processedMethods = {};

    private properties = {};

    private fromProperty: string = null;

    constructor() {
        this.loadTypeMappings();
        this.loadFileNames();
    }

    public run() {
        this.writeBase();

        this.fileNames.forEach((fileName) => {
            if ((!fileName) || (fileName.indexOf("//") === 0)) return;
            try {
                var src: Fmt = this.loadAPIFile(fileName);

                // Reset the golbal methods list.
                this.processedMethods = {};
                this.properties = {};

                this.writeModule(src);
            } catch (err) {
                if (Parser.LOG_LEVEL > 1) console.error("processed file: " + fileName + " error: " + err);
            }
        });
    }

	/**
		* Load the type mappings from the config file
		*/
    private loadTypeMappings() {
        var content = fs.readFileSync("type_mapping.json", "UTF-8");
        this.typeMappings = JSON.parse(content);
    }

	/**
		* Load the type mappings from the config file
		*/
    private loadFileNames() {
        var content = fs.readFileSync("files.txt", "UTF-8");
        this.fileNames = content.split("\n");
    }


	/**
		* Load a single API file
		*/
    private loadAPIFile(name): Fmt {
        if (Parser.LOG_LEVEL > 3) console.info("Parsing API file" + name);
        var fileName = path.join(Parser.BASE_DIR, name);
        var content = fs.readFileSync(fileName, "UTF-8");
        var result = JSON.parse(content);
        return result;
    }

	/**
	  * Write some util declarations out that will help with the rest
	  */
    private writeBase() {
        var content = fs.readFileSync("base_declaration.txt", "UTF-8");
        write(content);
    }


	/**
	  * Check if q qx type is yet unknown and add it then to the 
	  * file list to be parsed. This way dependecies are resolved
	  * and added to the declaration file.
	  * 
	  */
    addIfNewDependency(t: string) {
        if (!t) return;
        t = t.trim();
        if (t.substring(0, 2) === "qx") {
            var fileName = t + ".json";
            if (files.indexOf(fileName) === -1) {
                files.push(fileName);
                if (Parser.LOG_LEVEL > 3) console.info("adding dependency: " + fileName);
            }
        }
    }

	/**
	  * Do the mapping of types from Qooxdoo to TypeScript
	  */
    getType(t: string) {
        var defaultType = "any";
        if (!t) return defaultType;

        // Check if we have a mpping for this type
        if (this.typeMappings.hasOwnProperty(t)) {
            var result = this.typeMappings[ t ];
            this.addIfNewDependency(result);
            return result;
        }

        // Check if we talk about a qx type here
        if (t.substring(0, 2) === "qx") {
            this.addIfNewDependency(t);
            return t;
        }

        // We don't know the type
        if (Parser.LOG_LEVEL > 2) console.error("Unknow type: " + t);
        return defaultType;
    }


	/**
	  * Write a constructor
	  */
    writeConstructor(d: Fmt[]) {
        d.forEach((m) => {
            if (m.type === Types.Method) {
                write(indent + "constructor (");
                this.writeParameters(m, true);
                write(");\n");
            }
        });
    }

	/**
		* Utiltiy function to find the child of a a certain type
		*/
    findChildByType(t: string, parent: Fmt): Fmt {
        if (!parent) return null;
        if (!parent.children) return null;
        var result = null;
        for (var i = 0; i < parent.children.length; i++) {
            var child = parent.children[ i ];
            if (child.type === t) return child
        }
        if (1 == 1) return null;

        parent.children.forEach((c) => {
            if (c.type === t) {
                result = c;
            }
        });
        return result;
    }

	/**
		* Write all the methods of a type
		*/
    writeMethods(d: Fmt[], isStatic = false, isMixin = false) {
        d.forEach((m) => {
            if (m.type === Types.Method) {
                this.fromProperty = null;
                if (m.attributes && m.attributes.fromProperty) {
                    this.fromProperty = m.attributes.fromProperty
                }

                // Is this really a method in a based class
                if (m.attributes.overriddenFrom) return;

                // Check if we already processed this method as part of mixin or interface
                if (this.processedMethods[ m.attributes.name ]) return;

                // var modifier = "public";
                var staticClause = isStatic ? "static " : "";

                // Seems access when defined is private, protected and internal
                // We all map this to private
                // if ((!m.attributes.access) || (m.attributes.access === "protected")) {

                if (Parser.LOG_LEVEL > 3) console.info("Processing method " + m.attributes.name);

                var modifier = "";
                this.processedMethods[ m.attributes.name ] = true;

                if (m.attributes.access) {
                    if (m.attributes.access === "protected") modifier = "protected ";
                    if (m.attributes.access === "private") return;
                }

                if (isMixin && (modifier == "protected ")) return;

                write(indent + modifier + staticClause + m.attributes.name + "(");
                this.writeParameters(m);
                write(")");
                this.writeReturnType(m);
                write("\n");
                // }
            }
        });
    }

	/**
		* Determine the return type of a method and write it
		*/
    writeReturnType(d: Fmt) {
        var returnType = "void";
        var a = this.findChildByType(Types.Return, d);
        a = this.findChildByType(Types.Types, a);
        a = this.findChildByType(Types.Entry, a);
        if (a && a.attributes.type) {
            var type = a.attributes.type;
            if (type === "var") {
                type = this.properties[ this.fromProperty ];
                console.log("Type determined for " + this.fromProperty + ":" + type);
            }
            returnType = this.getType(type);
            if (a.attributes.dimensions) returnType += "[]";
        }
        write(":" + returnType + ";");
    }

	/**
		* Write the specific type of one parameter. 
		*/
    writeParam(p: Fmt, forceOptional: boolean): boolean {
        var type = "any";
        write(p.attributes.name);
        if (p.attributes.name == "varargs") forceOptional = true;
        if (p.attributes.optional || forceOptional) write("?");
        write(":");
        var a = this.findChildByType(Types.Types, p);
        a = this.findChildByType(Types.Entry, a);
        if (a && a.attributes.type) {
            type = this.getType(a.attributes.type);
            if (a.attributes.dimensions) type += "[]";
        }
        write(type);
        return p.attributes.optional || forceOptional;
    }

	/**
		* Write out all the arguments of a method. Once one paramter is optional,
		* the remaining ones are also optional (is a TypeScript requirement)
		*/
    writeParameters(d: Fmt, optional = false) {
        var params = this.findChildByType("params", d);
        var first = true;
        if (params) {
            params.children.forEach((c) => {
                if (c.type === Types.Param) {
                    if (!first) write(","); else first = false;
                    optional = this.writeParam(c, optional);
                }
            });
        }
    }

	/**
		* Write all the properties of a class, interface or mixin
		*/
    writeProperties(d: Fmt[]) {
        // return; // lets not write properties
        d.forEach((p) => {

            if ((p.type == Types.Property) && p.attributes.check) {
                console.log("Setting property " + p.attributes.name + ":" + p.attributes.check);
                if (p.attributes.check !== "var") this.properties[ p.attributes.name ] = p.attributes.check;
            }
            if (1 == 1) return;

            if (p.type !== Types.Property) return;
            if (p.attributes.overriddenFrom) return; // property already defined in base class
            if (p.attributes.check === "var") return; // not a real property. use getter/setter
            if (p.attributes.event) return;  // if there is a event defined, use getter/setter

            if ((!p.attributes.check) && (Parser.LOG_LEVEL > 2)) console.error("No type for attribute " + p.attributes.name);

            var modifier = "";
            if (p.attributes.access) {
                if (p.attributes.access === "private") modifier = "private";
                if (p.attributes.access === "protected") modifier = "protected";
            }
            var type = this.getType(p.attributes.check);
            write(modifier + " " + p.attributes.name + ":" + type + ";\n");
        });
    }

	/**
	  * Write the mixin methods and properties, thereby mixin it into a class. This method
	  * is used for including methods from both mixins and interfaces
	  */
    includeMixin(name: string) {
        name = name.trim();
        if (!name) return;
        this.addIfNewDependency(name);

        var d: Fmt = this.loadAPIFile(name + ".json");

        this.runChildrenOfType(d, Types.Properties, (c) => {
            this.writeProperties(c.children);
        });

        this.runChildrenOfType(d, Types.MethodsStatic, (c) => {
            this.writeMethods(c.children, true, true);
        });

        this.runChildrenOfType(d, Types.Methods, (c) => {
            this.writeMethods(c.children, false, true);
        });

    }

	/**
	 * Implements used 
	 */
    writeImplementsClause(a: Attributes) {
        var interfaces = a.interfaces || "";
        var mixins = a.mixins || "";

        if ((!interfaces) && (!mixins)) {
            write(" {\n");
            return;
        }

        // var impl = interfaces.split(",").concat(mixins.split(","));

        if (interfaces) write(" implements " + interfaces);
        write(" {\n");


        interfaces.split(",").forEach((name) => {
            this.includeMixin(name);
        });


        mixins.split(",").forEach((name) => {
            this.includeMixin(name);
        });
    }

    writeExtendsClause(a: Attributes) {
        var superClassType = "";
        if (!a.superClass || a.superClass === "Object") {
            superClassType = "js.Object";
        }
        else {
            superClassType = this.getType(a.superClass);
        }
        write(` extends ${superClassType}`);
    }

    runChildrenOfType(d: Fmt, type: string, fn: (param: Fmt) => void) {
        d.children.forEach((c) => {
            if (c.type === type) fn(c);
        });
    }

	/**
		* Write the class or interface declaration
		*/
    writeClass(d: Fmt) {

        var a = d.attributes;
        if (Parser.LOG_LEVEL > 2) console.info("Processing class " + d.attributes.packageName + "." + a.name);

        write(`@js.native\n`);
        
        if (a.type === "interface") {
          write(`trait ${a.name}`);  
        } else {
          write(`@JSName("${a.packageName}.${a.name}")\n`);
          write (`class ${a.name}`);
        }

        this.writeExtendsClause(a);
        this.writeImplementsClause(a);

        this.runChildrenOfType(d, Types.Properties, (c) => {
            this.writeProperties(c.children);
        });

        this.runChildrenOfType(d, Types.Constructor, (c) => {
            this.writeConstructor(c.children);
        });
        this.runChildrenOfType(d, Types.MethodsStatic, (c) => {
            this.writeMethods(c.children, true);
        });

        this.runChildrenOfType(d, Types.Methods, (c) => {
            this.writeMethods(c.children);
        });

        write("\n}\n");
    }


	/**
		* Write the module declaration if any.
		*/
    writeModule(d: Fmt) {
        var moduleName = d.attributes.packageName;

        if (moduleName) {
            write(`package ${moduleName} {\n`);
        } else {
            write("package ");
        }
        this.writeClass(d);

        if (moduleName) write("}\n");
    }

}

/****************************************************************************
		Here is where the processing is kicked of, reading the files from the 
		command arguments and start parsing them.
*****************************************************************************/

var files = process.argv.slice(2);

var parser = new Parser();
parser.run();
fs.writeFileSync("qooxdoo.scala", output);


