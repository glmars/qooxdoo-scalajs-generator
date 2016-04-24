// Generated declaration file at Sun Apr 24 2016 14:20:37 GMT+0600 (RTZ 5 (зима))

import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

@js.native
trait IMap extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.Any = js.native
  @JSBracketAccess
  def update(key: String, v: js.Any): Unit = js.native
}

package qx {

package registry {

@JSName("qx.registry")
@js.native
object Registry extends js.Object {
  def registerMainMethod(fn: js.Function1[qx.application.Standalone, Unit]): Unit = js.native
}

}

}
package qx {
@js.native
@JSName("qx.Bootstrap")
class Bootstrap extends js.Object {
    static base(args:any,varargs?:any):any;
    static bind(func:js.Function,self?:any,varargs?:any):js.Function;
    static createNamespace(name:String,object:any):String;
    static debug(object:any,message:any):Unit;
    static define(name?:String,config?:IMap):qx.Class;
    static error(object:any,message:any):Unit;
    static extendClass(clazz:js.Function,construct:js.Function,superClass:js.Function,name:js.Function,basename:js.Function):Unit;
    static firstLow(str:String):String;
    static firstUp(str:String):String;
    static genericToString():String;
    static getByName(name:String):qx.Class;
    static getClass(value:any):String;
    static getEnvironmentSetting(key:String):any;
    static info(object:any,message:any):Unit;
    static isArray(value:any):Boolean;
    static isFunction(value:any):Boolean;
    static isObject(value:any):Boolean;
    static isString(value:any):Boolean;
    static keys(map:any):qx.data.Array;
    static objectGetLength(map:any):Int;
    static objectMergeWith(target:any,source:any,overwrite?:Boolean):any;
    static setDisplayName(fcn:js.Function,classname:String,name:String):Unit;
    static setDisplayNames(functionMap:any,classname:String):Unit;
    static setEnvironmentSetting(key:String,value:any):Unit;
    static setRoot(root:any):Unit;
    static trace(object:any):Unit;
    static warn(object:any,message:any):Unit;

}
}
package qx {
@js.native
@JSName("qx.Class")
class Class extends js.Object {
    static define(name?:String,config?:IMap):qx.Class;
    static genericToString():String;
    static getByInterface(clazz:qx.Class,iface:qx.Interface):qx.Class;
    static getByMixin(clazz:qx.Class,mixin:qx.Mixin):qx.Class;
    static getByName(name:String):qx.Class;
    static getByProperty(clazz:qx.Class,name:String):qx.Class;
    static getEventType(clazz:qx.Class,name:String):String;
    static getInstance():any;
    static getInterfaces(clazz:qx.Class):qx.Interface[];
    static getMixins(clazz:qx.Class):qx.Mixin[];
    static getProperties(clazz:qx.Class):String[];
    static getPropertyDefinition(clazz:qx.Class,name:String):IMap;
    static getTotalNumber():Long;
    static hasInterface(clazz:qx.Class,iface:qx.Interface):Boolean;
    static hasMixin(clazz:qx.Class,mixin:qx.Mixin):Boolean;
    static hasOwnInterface(clazz:qx.Class,iface:qx.Interface):Boolean;
    static hasOwnMixin(clazz:qx.Class,mixin:qx.Mixin):Boolean;
    static hasProperty(clazz:qx.Class,name:String):Boolean;
    static implementsInterface(obj:any,iface:qx.Interface):Boolean;
    static include(clazz:qx.Class,mixin:qx.Mixin):Unit;
    static isDefined(name:String):Boolean;
    static isSubClassOf(clazz:qx.Class,superClass:qx.Class):Boolean;
    static patch(clazz:qx.Class,mixin:qx.Mixin):Unit;
    static supportsEvent(clazz:qx.Class,name:String):Boolean;
    static undefine(name:String):Unit;

}
}
package qx {
@js.native
@JSName("qx.Interface")
class Interface extends js.Object {
    static assert(clazz:qx.Class,iface:qx.Interface,wrap?:Boolean):Unit;
    static assertObject(object:qx.core.Object,iface:qx.Interface):Unit;
    static classImplements(clazz:qx.Class,iface:qx.Interface):Boolean;
    static define(name:String,config?:IMap):qx.Interface;
    static flatten(ifaces?:qx.Interface[]):qx.data.Array;
    static genericToString():String;
    static getByName(name:String):qx.Class;
    static getTotalNumber():Long;
    static isDefined(name:String):Boolean;
    static objectImplements(object:qx.core.Object,iface:qx.Interface):Boolean;

}
}
package qx {
@js.native
@JSName("qx.Mixin")
class Mixin extends js.Object {
    static checkCompatibility(mixins:qx.Mixin[]):Boolean;
    static define(name:String,config?:IMap):qx.Mixin;
    static flatten(mixins?:qx.Mixin[]):qx.data.Array;
    static genericToString():String;
    static getByName(name:String):qx.Class;
    static getTotalNumber():Long;
    static isCompatible(mixin:qx.Mixin,clazz:qx.Class):Boolean;
    static isDefined(name:String):Boolean;

}
}
package qx {
@js.native
@JSName("qx.Part")
class Part extends js.Object {
    constructor (loader?:any);
    static $$notifyLoad(id:String,closure:js.Function):Unit;
    static getInstance():qx.Part;
    static preload(partNames:String[]):Unit;
    static require(partNames:String[],callback:js.Function,self?:any):Unit;
    addPackageListener(pkg:any,callback:any):Unit;
    addPartListener(part:any,callback:any):Unit;
    addToPackage(pkg:qx.io.part.Package):Unit;
    getParts():qx.data.Array;
    notifyPackageResult(pkg:any):Unit;
    notifyPartResult(part:any):Unit;
    saveClosure(id:String,closure:js.Function):Unit;

}
}
package qx {
@js.native
@JSName("qx.Theme")
class Theme extends js.Object {
    static define(name:String,config:IMap):Unit;
    static genericToString():String;
    static getAll():IMap;
    static getByName(name:String):any;
    static getTotalNumber():Long;
    static include(theme:qx.Theme,mixinTheme:qx.Theme):Unit;
    static isDefined(name:String):Boolean;
    static patch(theme:qx.Theme,mixinTheme:qx.Theme):Unit;

}
}
package qx.application {
@js.native
@JSName("qx.application.AbstractGui")
class AbstractGui extends qx.core.Object implements qx.application.IApplication {
    close():String;
    finalize():Unit;
    main():Unit;
    terminate():Unit;
    marktr(messageId:String):String;
    tr(messageId:String,varargs?:any):String;
    trc(hint:String,messageId:String,varargs?:any):String;
    trn(singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    trnc(hint:String,singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    protected _createRootWidget():qx.ui.core.Widget;
    getRoot():qx.ui.core.Widget;
    render():Unit;

}
}
package qx.application {
@js.native
@JSName("qx.application.Basic")
class Basic extends qx.core.Object implements qx.application.IApplication {
    close():String;
    finalize():Unit;
    main():Unit;
    terminate():Unit;

}
}
package qx.application {
@js.native
trait IApplication extends js.Object {
    close():String;
    finalize():Unit;
    main():Unit;
    terminate():Unit;

}
}
package qx.application {
@js.native
@JSName("qx.application.Native")
class Native extends qx.core.Object implements qx.application.IApplication {
    close():String;
    finalize():Unit;
    main():Unit;
    terminate():Unit;

}
}
package qx.application {
@js.native
@JSName("qx.application.Routing")
class Routing extends js.Object {
    constructor ();
    protected _executeGet(path:String,customData:any,fromEvent:any):Unit;
    protected _getPathOrFallback(path:String,defaultPath?:String):String;
    back(customData?:IMap):Unit;
    dispose():Unit;
    execute(path:String,customData:any):Unit;
    executeDelete(path:String,params:IMap,customData:any):Unit;
    executeGet(path:String,customData:any):Unit;
    executePost(path:String,params:IMap,customData:any):Unit;
    executePut(path:String,params:IMap,customData:any):Unit;
    getState():String;
    init(defaultPath?:String):Unit;
    on(route:String,handler:js.Function,scope:any):String;
    onAny(route:String,handler:js.Function,scope:any):String;
    onDelete(route:String,handler:js.Function,scope:any):String;
    onGet(route:String,handler:js.Function,scope:any):String;
    onPost(route:String,handler:js.Function,scope:any):String;
    onPut(route:String,handler:js.Function,scope:any):String;
    remove(id:String):Unit;

}
}
package qx.application {
@js.native
@JSName("qx.application.Standalone")
class Standalone extends qx.application.AbstractGui {

}
}
package qx.bom {
@js.native
@JSName("qx.bom.AnimationFrame")
class AnimationFrame extends qx.event.Emitter {
    static calculateTiming(func:String,x:Int):Int;
    static request(callback:js.Function,context:any):Long;
    cancelSequence():Unit;
    startSequence(duration:Long):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Blocker")
class Blocker extends qx.core.Object {
    constructor ();
    block(element?:any):Unit;
    getBlockerColor():String;
    getBlockerElement():HTMLElement;
    getBlockerOpacity():Int;
    getBlockerZIndex():Int;
    isBlocked():Boolean;
    setBlockerColor(color:String):Unit;
    setBlockerOpacity(opacity:String):Unit;
    setBlockerZIndex(zIndex:Int):Unit;
    unblock():Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Cookie")
class Cookie extends js.Object {
    static del(key:String,path?:String,domain?:String):Unit;
    static get(key:String):any;
    static set(key:String,value:String,expires?:Long,path?:String,domain?:String,secure?:Boolean):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Document")
class Document extends js.Object {
    static getHeight(win?:Window):Int;
    static getWidth(win?:Window):Int;
    static isQuirksMode(win?:Window):Boolean;
    static isStandardMode(win?:Window):Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Element")
class Element extends js.Object {
    static activate(element:HTMLElement):Unit;
    static addListener(element:HTMLElement,type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    static blur(element:HTMLElement):Unit;
    static capture(element:HTMLElement,containerCapture?:Boolean):Unit;
    static clone(element:HTMLElement,events?:Boolean):HTMLElement;
    static deactivate(element:HTMLElement):Unit;
    static focus(element:HTMLElement):Unit;
    static hasListener(element:HTMLElement,type:String,capture?:Boolean):Boolean;
    static releaseCapture(element:HTMLElement):Unit;
    static removeListener(element:HTMLElement,type:String,listener:js.Function,self?:any,capture?:Boolean):Boolean;
    static removeListenerById(target:any,id:String):Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Event")
class Event extends js.Object {
    static addNativeListener(target:any,type:String,listener:js.Function,useCapture?:Boolean):Unit;
    static fire(target:HTMLElement,type:String):Boolean;
    static getEventName(target:any,type:String):String;
    static getRelatedTarget(e:qx.event.type.Event):HTMLElement;
    static getTarget(e:qx.event.type.Event):any;
    static preventDefault(e:qx.event.type.Event):Unit;
    static removeNativeListener(target:any,type:String,listener:js.Function,useCapture?:Boolean):Unit;
    static stopPropagation(e:qx.event.type.Event):Unit;
    static supportsEvent(target:any,type:String):Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.FileReader")
class FileReader extends qx.core.Object {
    constructor ();
    static getFile(inputElement:HTMLElement,index:Int):any;
    static getNumFiles(inputElement:HTMLElement):Int;
    protected _handleAbort(e:any):Unit;
    protected _handleError(e:any):Unit;
    protected _handleLoad(e:any):Unit;
    protected _handleLoadEnd(e:any):Unit;
    protected _handleLoadStart(e:any):Unit;
    protected _handleProgress(e:any):Unit;
    readAsBinaryString(fileObj:any):Unit;
    readAsDataURL(fileObj:any):Unit;
    readAsText(fileObj:any,encoding?:String):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Flash")
class Flash extends js.Object {
    static create(element:HTMLElement,attributes:IMap,variables?:IMap,params?:IMap,win?:Window):HTMLElement;
    static destroy(element:HTMLElement,win?:Window):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Font")
class Font extends qx.core.Object {
    constructor (size?:String,family?:String[]);
    static fromConfig(config:IMap):qx.bom.Font;
    static fromString(str:String):qx.bom.Font;
    static getDefaultStyles():IMap;
    protected _applyBold(value:Boolean,old:Boolean):Unit;
    protected _applyColor(value:String,old:String):Unit;
    protected _applyDecoration(value:any,old:any):Unit;
    protected _applyFamily(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _applyItalic(value:Boolean,old:Boolean):Unit;
    protected _applyLineHeight(value:Long,old:Long):Unit;
    protected _applySize(value:Int,old:Int):Unit;
    protected _applyTextShadow(value:String,old:String):Unit;
    getBold():Boolean;
    getColor():String;
    getDecoration():any;
    getFamily():qx.data.Array;
    getItalic():Boolean;
    getLineHeight():Long;
    getSize():Int;
    getStyles():IMap;
    getTextShadow():String;
    protected initBold(value:any):Boolean;
    protected initColor(value:any):String;
    protected initDecoration(value:any):any;
    protected initFamily(value:any):qx.data.Array;
    protected initItalic(value:any):Boolean;
    protected initLineHeight(value:any):Long;
    protected initSize(value:any):Int;
    protected initTextShadow(value:any):String;
    isBold():Boolean;
    isItalic():Boolean;
    resetBold():Unit;
    resetColor():Unit;
    resetDecoration():Unit;
    resetFamily():Unit;
    resetItalic():Unit;
    resetLineHeight():Unit;
    resetSize():Unit;
    resetTextShadow():Unit;
    setBold(value:any):Boolean;
    setColor(value:any):String;
    setDecoration(value:any):any;
    setFamily(value:any):qx.data.Array;
    setItalic(value:any):Boolean;
    setLineHeight(value:any):Long;
    setSize(value:any):Int;
    setTextShadow(value:any):String;
    toggleBold():Boolean;
    toggleItalic():Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.GeoLocation")
class GeoLocation extends qx.core.Object {
    constructor ();
    static getInstance():qx.bom.GeoLocation;
    protected _errorHandler(error:any):Unit;
    protected _successHandler(position:any):Unit;
    getCurrentPosition(enableHighAccuracy:Boolean,timeout:Int,maximumAge:Int):Unit;
    startWatchPosition(enableHighAccuracy:Boolean,timeout:Int,maximumAge:Int):Unit;
    stopWatchPosition():Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.HashHistory")
class HashHistory extends qx.bom.History {
    constructor ();

}
}
package qx.bom {
@js.native
@JSName("qx.bom.History")
class History extends qx.core.Object {
    constructor ();
    static getInstance():any;
    protected _applyState(value:String,old:String):Unit;
    protected _applyTitle(title:String,old:String):Unit;
    protected _decode(value:String):String;
    protected _encode(value:String):String;
    protected _getHash():String;
    protected _onHistoryLoad(state:String):Unit;
    protected _readState():String;
    protected _setHash(value:String):Unit;
    protected _setInitialState():Unit;
    protected _writeState():Unit;
    addToHistory(state:String,newTitle?:String):Unit;
    getState():String;
    getTitle():String;
    protected initState(value:any):String;
    protected initTitle(value:any):String;
    navigateBack():Unit;
    navigateForward():Unit;
    resetState():Unit;
    resetTitle():Unit;
    setState(value:any):String;
    setTitle(value:any):String;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Html")
class Html extends js.Object {
    static clean(objs:HTMLElement[],context?:Document,fragment?:HTMLElement):HTMLElement[];
    static extractScripts(elements:HTMLElement[],fragment?:Document):HTMLElement[];
    static fixEmptyTags(html:String):String;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Iframe")
class Iframe extends js.Object {
    static create(attributes?:IMap,win?:Window):HTMLElement;
    static getBody(iframe:HTMLElement):HTMLElement;
    static getDocument(iframe:HTMLElement):Document;
    static getWindow(iframe:HTMLElement):Window;
    static queryCurrentUrl(iframe:HTMLElement):String;
    static setSource(iframe:HTMLElement,source:String):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.IframeHistory")
class IframeHistory extends qx.bom.History {
    constructor ();
    protected _setState(state:String):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Input")
class Input extends js.Object {
    static create(type:String,attributes:IMap,win:Window):HTMLElement;
    static getValue(element:HTMLElement):String;
    static setValue(element:HTMLElement,value:String):Unit;
    static setWrap(element:HTMLElement,wrap:Boolean):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Label")
class Label extends js.Object {
    static create(content:String,html?:Boolean,win?:Window):HTMLElement;
    static getHtmlSize(content:String,styles?:IMap,width?:Int):IMap;
    static getTextSize(text:String,styles:IMap):IMap;
    static getValue(element:HTMLElement):String;
    static setSanitizer(func:js.Function):Unit;
    static setValue(element:HTMLElement,value:String):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Lifecycle")
class Lifecycle extends js.Object {
    static onReady(callback:js.Function,context?:any):Unit;
    static onShutdown(callback:js.Function,context?:any):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.MediaQuery")
class MediaQuery extends qx.event.Emitter {
    constructor (query?:String);
    getQuery():String;
    isMatching():Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.NativeHistory")
class NativeHistory extends qx.bom.History {
    constructor ();

}
}
package qx.bom {
@js.native
@JSName("qx.bom.PageVisibility")
class PageVisibility extends qx.event.Emitter {
    constructor (document?:Document);
    static getInstance():qx.bom.PageVisibility;
    getVisibilityState():String;
    isHidden():Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Range")
class Range extends js.Object {
    static get(node:Node):any;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selection")
class Selection extends js.Object {
    static get(node:Node):String;
    static getEnd(node:Node):Int;
    static getLength(node:Node):Int;
    static getSelectionObject(documentNode:Document):any;
    static getStart(node:Node):Int;
    static set(node:Node,start:Int,end:Int):Boolean;
    static setAll(node:Node):Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selector")
class Selector extends js.Object {
    static matches(selector:String,set:qx.data.Array):qx.data.Array;
    static query(selector:String,context:HTMLElement):qx.data.Array;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Shortcut")
class Shortcut extends qx.core.Object {
    constructor (shortcut?:String);
    protected _applyEnabled(value:Boolean,old:Boolean):Unit;
    protected _applyShortcut(value:String,old:String):Unit;
    execute(target:any):Unit;
    getAutoRepeat():Boolean;
    getEnabled():Boolean;
    getShortcut():String;
    protected initAutoRepeat(value:any):Boolean;
    protected initEnabled(value:any):Boolean;
    protected initShortcut(value:any):String;
    isAutoRepeat():Boolean;
    isEnabled():Boolean;
    resetAutoRepeat():Unit;
    resetEnabled():Unit;
    resetShortcut():Unit;
    setAutoRepeat(value:any):Boolean;
    setEnabled(value:any):Boolean;
    setShortcut(value:any):String;
    toggleAutoRepeat():Boolean;
    toggleEnabled():Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Storage")
class Storage extends js.Object {
    static getLocal():qx.bom.storage.Web;
    static getSession():qx.bom.storage.Web;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.String")
class String extends js.Object {
    static escape(str:String):String;
    static fromText(str:String):String;
    static toText(str:String):String;
    static unescape(str:String):any;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Style")
class Style extends js.Object {
    static getAppliedStyle(element:HTMLElement,propertyName:String,value:String,prefixed?:Boolean):String;
    static getCssName(propertyName:String):String;
    static getPropertyName(propertyName:String):String;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Stylesheet")
class Stylesheet extends js.Object {
    static addImport(sheet:any,url:String):Unit;
    static addRule(sheet:any,selector:String,entry:String):Unit;
    static createElement(text?:String):StyleSheet;
    static includeFile(href:String,doc?:Document):Unit;
    static removeAllImports(sheet:any):Unit;
    static removeAllRules(sheet:any):Unit;
    static removeImport(sheet:any,url:String):Unit;
    static removeRule(sheet:any,selector:String):Unit;
    static removeSheet(sheet:any):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Template")
class Template extends js.Object {
    protected static _createNodeFromTemplate(template:String):HTMLElement;
    static get(id:String,view:any,partials:any):HTMLElement;
    static render(template:String,view:any,partials:any):String;
    static renderToNode(template:String,view:any,partials:any):HTMLElement;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Viewport")
class Viewport extends js.Object {
    static getHeight(win?:Window):Int;
    static getOrientation(win?:Window):Int;
    static getScrollLeft(win?:Window):Int;
    static getScrollTop(win?:Window):Int;
    static getWidth(win?:Window):Int;
    static isLandscape(win?:Window):Boolean;
    static isPortrait(win?:Window):Boolean;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Vml")
class Vml extends js.Object {
    static create(type:String,attributes?:IMap,win?:any):HTMLElement;
    static createImage(source?:String,width?:Int,height?:Int,xOffset?:Int,yOffset?:Int,imageWidth?:Int,imageHeight?:Int):HTMLElement;
    static updateImage(image:HTMLElement,source:String,width:Int,height:Int,xOffset?:Int,yOffset?:Int,imageWidth?:Int,imageHeight?:Int):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.WebWorker")
class WebWorker extends qx.core.Object {
    constructor (src?:String);
    protected _handleError(e:qx.event.type.Event):Unit;
    protected _handleMessage(e:qx.event.type.Event):Unit;
    postMessage(msg:String):Unit;

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Window")
class Window extends js.Object {
    static close(win:Window):any;
    static getBlocker():qx.bom.Blocker;
    static isClosed(win:Window):Boolean;
    static moveTo(win:Window,top:Int,left:Int):Unit;
    static open(url:String,name:String,options:IMap,modal:Boolean,useNativeModalDialog:Boolean,listener?:js.Function,self?:any):Window;
    static resizeTo(win:Window,width:Int,height:Int):Unit;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Browser")
class Browser extends js.Object {
    static getDocumentMode():Long;
    static getName():String;
    static getQuirksMode():Boolean;
    static getVersion():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Css")
class Css extends js.Object {
    static getAlphaImageLoaderNeeded():Boolean;
    static getAppearance():String;
    static getBorderImage():String;
    static getBorderImageSyntax():Boolean;
    static getBorderRadius():String;
    static getBoxModel():String;
    static getBoxShadow():String;
    static getBoxSizing():String;
    static getFilterGradient():Boolean;
    static getFilterTextShadow():Boolean;
    static getFlexboxSyntax():String;
    static getFloat():String;
    static getInlineBlock():String;
    static getLegacyWebkitGradient():Boolean;
    static getLinearGradient():String;
    static getOpacity():Boolean;
    static getPlaceholder():Boolean;
    static getPointerEvents():Boolean;
    static getRadialGradient():String;
    static getRgba():Boolean;
    static getTextOverflow():String;
    static getTextShadow():Boolean;
    static getUserModify():String;
    static getUserSelect():String;
    static getUserSelectNone():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssAnimation")
class CssAnimation extends js.Object {
    static getAnimationEnd():String;
    static getAnimationIteration():String;
    static getAnimationStart():String;
    static getFillMode():String;
    static getKeyFrames():String;
    static getName():String;
    static getPlayState():String;
    static getRequestAnimationFrame():String;
    static getSupport():any;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransform")
class CssTransform extends js.Object {
    static get3D():Boolean;
    static getBackFaceVisibility():String;
    static getName():String;
    static getOrigin():String;
    static getPerspective():String;
    static getPerspectiveOrigin():String;
    static getStyle():String;
    static getSupport():any;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransition")
class CssTransition extends js.Object {
    static getSupport():any;
    static getTransitionName():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Device")
class Device extends js.Object {
    static detectDeviceType(userAgentString:String):String;
    static detectMobileDevice(userAgentString:String):Boolean;
    static detectTabletDevice(userAgentString:String):Boolean;
    static getDevicePixelRatio():Long;
    static getName():String;
    static getTouch():Boolean;
    static getType():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.EcmaScript")
class EcmaScript extends js.Object {
    static getArrayEvery():Boolean;
    static getArrayFilter():Boolean;
    static getArrayForEach():Boolean;
    static getArrayIndexOf():Boolean;
    static getArrayLastIndexOf():Boolean;
    static getArrayMap():Boolean;
    static getArrayReduce():Boolean;
    static getArrayReduceRight():Boolean;
    static getArraySome():Boolean;
    static getDateNow():Boolean;
    static getErrorToString():Boolean;
    static getFunctionBind():Boolean;
    static getObjectKeys():Boolean;
    static getStackTrace():String;
    static getStringTrim():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Engine")
class Engine extends js.Object {
    static getName():String;
    static getVersion():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Event")
class Event extends js.Object {
    static getCustomEvent():Boolean;
    static getDispatchEvent():Boolean;
    static getHashChange():Boolean;
    static getHelp():Boolean;
    static getMouseEvent():Boolean;
    static getMouseWheel(win?:Window):IMap;
    static getMsPointer():Boolean;
    static getTouch():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Flash")
class Flash extends js.Object {
    static getExpressInstall():Boolean;
    static getStrictSecurityModel():Boolean;
    static getVersion():String;
    static isAvailable():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Html")
class Html extends js.Object {
    static getAudio():Boolean;
    static getAudioAif():String;
    static getAudioAu():String;
    static getAudioMp3():String;
    static getAudioOgg():String;
    static getAudioWav():String;
    static getCanvas():Boolean;
    static getClassList():Boolean;
    static getCompareDocumentPosition():Boolean;
    static getConsole():Boolean;
    static getContains():Boolean;
    static getDataset():Boolean;
    static getDataUrl(callback:js.Function):Unit;
    static getFileReader():Boolean;
    static getFullScreen():Boolean;
    static getGeoLocation():Boolean;
    static getHistoryState():Boolean;
    static getIsEqualNode():Boolean;
    static getLocalStorage():Boolean;
    static getNaturalDimensions():Boolean;
    static getSelection():String;
    static getSessionStorage():Boolean;
    static getSvg():Boolean;
    static getTextContent():Boolean;
    static getUserDataStorage():Boolean;
    static getVideo():Boolean;
    static getVideoH264():String;
    static getVideoOgg():String;
    static getVideoWebm():String;
    static getVml():Boolean;
    static getWebWorker():Boolean;
    static getXPath():Boolean;
    static getXul():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Locale")
class Locale extends js.Object {
    static getLocale():String;
    static getVariant():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.OperatingSystem")
class OperatingSystem extends js.Object {
    static getName():String;
    static getVersion():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Pdfjs")
class Pdfjs extends js.Object {
    static getPdfjs(callback:js.Function,context:any):Unit;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.PhoneGap")
class PhoneGap extends js.Object {
    static getNotification():Boolean;
    static getPhoneGap():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Plugin")
class Plugin extends js.Object {
    static getActiveX():Boolean;
    static getDivX():Boolean;
    static getDivXVersion():String;
    static getGears():Boolean;
    static getPdf():Boolean;
    static getPdfVersion():String;
    static getQuicktime():Boolean;
    static getQuicktimeVersion():String;
    static getSilverlight():Boolean;
    static getSilverlightVersion():String;
    static getSkype():Boolean;
    static getWindowsMedia():Boolean;
    static getWindowsMediaVersion():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Runtime")
class Runtime extends js.Object {
    static getName():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Scroll")
class Scroll extends js.Object {
    static getNativeScroll():Boolean;
    static scrollBarOverlayed():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Stylesheet")
class Stylesheet extends js.Object {
    static getAddImport():Boolean;
    static getCreateStyleSheet():Boolean;
    static getDeleteRule():Boolean;
    static getInsertRule():Boolean;
    static getRemoveImport():Boolean;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Transport")
class Transport extends js.Object {
    static getMaxConcurrentRequestCount():Int;
    static getSsl():Boolean;
    static getXmlHttpRequest():String;

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Xml")
class Xml extends js.Object {
    static getAttributeNS():Boolean;
    static getCreateElementNS():Boolean;
    static getCreateNode():Boolean;
    static getDomParser():Boolean;
    static getDomProperties():Boolean;
    static getElementsByTagNameNS():Boolean;
    static getImplementation():Boolean;
    static getQualifiedItem():Boolean;
    static getSelectNodes():Boolean;
    static getSelectSingleNode():Boolean;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Animation")
class Animation extends js.Object {
    static animate(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;
    static animateReverse(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationCss")
class AnimationCss extends js.Object {
    protected static _animate(el:HTMLElement,desc:IMap,duration?:Int,reverse?:Boolean):qx.bom.element.AnimationHandle;
    static animate(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;
    static animateReverse(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationHandle")
class AnimationHandle extends qx.event.Emitter {
    constructor ();
    isEnded():Boolean;
    isPaused():Boolean;
    isPlaying():Boolean;
    pause():Unit;
    play():Unit;
    stop():Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationJs")
class AnimationJs extends js.Object {
    protected static _animate(el:HTMLElement,desc:IMap,duration?:Int,reverse?:Boolean):qx.bom.element.AnimationHandle;
    static animate(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;
    static animateReverse(el:HTMLElement,desc:IMap,duration?:Int):qx.bom.element.AnimationHandle;
    static pause(handle:qx.bom.element.AnimationHandle):qx.bom.element.AnimationHandle;
    static play(handle:qx.bom.element.AnimationHandle):qx.bom.element.AnimationHandle;
    static stop(handle:qx.bom.element.AnimationHandle):qx.bom.element.AnimationHandle;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Attribute")
class Attribute extends js.Object {
    static compile(map:IMap):String;
    static get(element:HTMLElement,name:String):any;
    static reset(element:HTMLElement,name:String):Unit;
    static set(element:HTMLElement,name:String,value:any):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Background")
class Background extends js.Object {
    static compile(source?:String,repeat?:String,left?:Int,top?:Int):String;
    static getStyles(source:String,repeat?:String,left?:Int,top?:Int):IMap;
    static set(element:HTMLElement,source?:String,repeat?:String,left?:Int,top?:Int):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.BoxSizing")
class BoxSizing extends js.Object {
    static compile(value:String):String;
    static get(element:HTMLElement):String;
    static reset(element:HTMLElement):Unit;
    static set(element:HTMLElement,value:String):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Class")
class Class extends js.Object {
    static add(element:HTMLElement,name:String):String;
    static addClasses(element:HTMLElement,classes:String[]):String;
    static get(element:HTMLElement):String;
    static has(element:HTMLElement,name:String):Boolean;
    static remove(element:HTMLElement,name:String):String;
    static removeClasses(element:HTMLElement,classes:String[]):String;
    static replace(element:HTMLElement,oldName:String,newName:String):String;
    static toggle(element:HTMLElement,name:String,toggle?:Boolean):String;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Clip")
class Clip extends js.Object {
    static compile(map:IMap):String;
    static get(element:HTMLElement,mode:Long):IMap;
    static reset(element:HTMLElement):Unit;
    static set(element:HTMLElement,map:IMap):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Cursor")
class Cursor extends js.Object {
    static compile(cursor:String):String;
    static get(element:HTMLElement,mode:Long):String;
    static reset(element:HTMLElement):Unit;
    static set(element:HTMLElement,value:String):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dataset")
class Dataset extends js.Object {
    static get(element:HTMLElement,name:String):any;
    static getAll(element:HTMLElement):IMap;
    static hasData(element:HTMLElement):Boolean;
    static remove(element:HTMLElement,name:String):Unit;
    static set(element:HTMLElement,name:String,value:any):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Decoration")
class Decoration extends js.Object {
    static create(source:String,repeat:String,style:IMap):String;
    static getAttributes(source:String,repeat:String,style:IMap):String;
    static getTagName(repeat:String,source?:String):String;
    static processAlphaFix(style:IMap,repeat:String,source:String):IMap;
    static update(element:HTMLElement,source:String,repeat:String,style:IMap):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dimension")
class Dimension extends js.Object {
    protected static _getBoundingClientRect(element:HTMLElement):IMap;
    static getContentHeight(element:HTMLElement):Int;
    static getContentSize(element:HTMLElement):IMap;
    static getContentWidth(element:HTMLElement):Int;
    static getHeight(element:HTMLElement):Int;
    static getSize(element:HTMLElement):IMap;
    static getWidth(element:HTMLElement):Int;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Location")
class Location extends js.Object {
    static get(elem:HTMLElement,mode?:String):IMap;
    static getBottom(elem:HTMLElement,mode:String):Int;
    static getLeft(elem:HTMLElement,mode:String):Int;
    static getOffsetParent(element:HTMLElement):HTMLElement;
    static getPosition(elem:HTMLElement):IMap;
    static getRelative(elem1:HTMLElement,elem2:HTMLElement,mode1?:String,mode2?:String):IMap;
    static getRight(elem:HTMLElement,mode:String):Int;
    static getTop(elem:HTMLElement,mode:String):Int;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Opacity")
class Opacity extends js.Object {
    static compile(opacity:Float):String;
    static get(element:HTMLElement,mode:Long):Float;
    static reset(element:HTMLElement):Unit;
    static set(element:HTMLElement,opacity:Float):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Scroll")
class Scroll extends js.Object {
    static getScrollbarWidth():Long;
    static intoView(element:HTMLElement,stop?:HTMLElement,alignX?:String,alignY?:String):Unit;
    static intoViewX(element:HTMLElement,stop?:HTMLElement,align?:String):Unit;
    static intoViewY(element:HTMLElement,stop?:HTMLElement,align?:String):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Style")
class Style extends js.Object {
    static compile(map:IMap):String;
    static get(element:HTMLElement,name:String,mode:Long,smart?:Boolean):any;
    static getCss(element:HTMLElement):String;
    static isPropertySupported(propertyName:String):Boolean;
    static reset(element:HTMLElement,name:String,smart?:Boolean):Unit;
    static set(element:HTMLElement,name:String,value:any,smart?:Boolean):Unit;
    static setCss(element:HTMLElement,value:String):Unit;
    static setStyles(element:HTMLElement,styles:IMap,smart?:Boolean):Unit;

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Transform")
class Transform extends js.Object {
    protected static _compute3dProperty(property:String,params:qx.data.Array):String;
    protected static _computeAxisProperties(property:String,params:qx.data.Array):String;
    static getBackfaceVisibility(el:HTMLElement):Boolean;
    static getCss(transforms:IMap):String;
    static getOrigin(el:HTMLElement):String;
    static getPerspective(el:HTMLElement):String;
    static getPerspectiveOrigin(el:HTMLElement):String;
    static getStyle(el:HTMLElement):String;
    static getTransformValue(transforms:IMap):String;
    static rotate(el:HTMLElement,value:String):Unit;
    static scale(el:HTMLElement,value:Long):Unit;
    static setBackfaceVisibility(el:HTMLElement,value:Boolean):Unit;
    static setOrigin(el:HTMLElement,value:String):Unit;
    static setPerspective(el:HTMLElement,value:Long):Unit;
    static setPerspectiveOrigin(el:HTMLElement,value:String):Unit;
    static setStyle(el:HTMLElement,value:String):Unit;
    static skew(el:HTMLElement,value:String):Unit;
    static transform(el:HTMLElement,transforms:IMap):Unit;
    static translate(el:HTMLElement,value:String):Unit;

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Abstract")
class Abstract extends qx.core.Object {
    constructor (media?:any);
    protected _handleEndedEvent():Unit;
    protected _handleLoadedDataEvent():Unit;
    protected _handleLoadedMetaDataEvent():Unit;
    protected _handlePauseEvent():Unit;
    protected _handlePlayEvent():Unit;
    protected _handleTimeUpdateEvent():Unit;
    protected _handleVolumeChangeEvent():Unit;
    canPlayType(type:String):Boolean;
    getAutoplay():Boolean;
    getCurrentTime():Long;
    getDuration():Long;
    getId():String;
    getMediaObject():any;
    getPreload():String;
    getSource():String;
    getVolume():Long;
    hasControls():Boolean;
    hideControls():Unit;
    isEnded():Boolean;
    isLoop():Boolean;
    isMuted():Boolean;
    isPaused():Boolean;
    pause():Unit;
    play():Unit;
    setAutoplay(autoplay:Boolean):Unit;
    setCurrentTime(value:Long):Unit;
    setId(id:String):Unit;
    setLoop(value:Boolean):Unit;
    setMuted(muted:Boolean):Unit;
    setPreload(preload:String):Unit;
    setSource(source:String):Unit;
    setVolume(volume:Long):Unit;
    showControls():Unit;

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Audio")
class Audio extends qx.bom.media.Abstract {
    constructor (source?:String);

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Video")
class Video extends qx.bom.media.Abstract {
    constructor (source?:String);
    getHeight():Long;
    getPoster():String;
    getVideoHeight():Long;
    getVideoWidth():Long;
    getWidth():Long;
    setHeight(value:Long):Unit;
    setPoster(value:String):Unit;
    setWidth(value:Long):Unit;

}
}
package qx.bom.request {
@js.native
trait IRequest extends js.Object {
    abort():Unit;
    getAllResponseHeaders():String;
    getResponseHeader(header:String):String;
    onabort():Unit;
    onerror():Unit;
    onload():Unit;
    onloadend():Unit;
    onreadystatechange():Unit;
    ontimeout():Unit;
    open(method:String,url:String,async?:Boolean):Unit;
    send(data?:String):Unit;
    setRequestHeader(key:String,value:String):Unit;

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Jsonp")
class Jsonp extends qx.bom.request.Script {
    constructor ();
    callback(data:any):Unit;
    getGeneratedUrl():String;
    setCallbackName(name:String):qx.bom.request.Jsonp;
    setCallbackParam(param:String):qx.bom.request.Jsonp;
    setPrefix(prefix:String):Unit;

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Script")
class Script extends js.Object {
    constructor ();
    protected _emit(event:String):Unit;
    protected _getScriptElement():HTMLElement;
    protected _getUrl():String;
    protected _onNativeError():Unit;
    protected _onNativeLoad():Unit;
    protected _onTimeout():Unit;
    protected _readyStateChange(readyState:Long):Unit;
    protected _success():Unit;
    abort():qx.bom.request.Script;
    dispose():Unit;
    getAllResponseHeaders():String;
    getResponseHeader(key:String):String;
    isDisposed():Boolean;
    on(name:String,listener:js.Function,ctx?:any):qx.bom.request.Script;
    onabort():Unit;
    onerror():Unit;
    onload():Unit;
    onloadend():Unit;
    onreadystatechange():Unit;
    ontimeout():Unit;
    open(method:String,url:String):Unit;
    send():qx.bom.request.Script;
    setDetermineSuccess(check:js.Function):Unit;
    setRequestHeader(key:String,value:String):qx.bom.request.Script;

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.SimpleXhr")
class SimpleXhr extends qx.event.Emitter {
    constructor (url?:String,method?:String);
    protected _createResponseParser():qx.util.ResponseParser;
    protected _createTransport():qx.bom.request.IRequest;
    protected _onAbort():Unit;
    protected _onError():Unit;
    protected _onLoadEnd():Unit;
    protected _onReadyStateChange():Unit;
    protected _onTimeout():Unit;
    protected _registerTransportListener(transport:qx.bom.request.IRequest):qx.bom.request.IRequest;
    protected _serializeData(data:String,contentType?:String):String;
    protected _setResponse(response:String):Unit;
    abort():qx.bom.request.SimpleXhr;
    dispose():Boolean;
    getAllResponseHeaders():String;
    getMethod():String;
    getRequestData():String;
    getRequestHeader(key:String):String;
    getResponse():String;
    getResponseHeader(header:String):String;
    getTimeout():Long;
    getTransport():any;
    getUrl():String;
    isCaching():Boolean;
    isDisposed():Boolean;
    isDone():Boolean;
    send():Unit;
    setMethod(method:String):qx.bom.request.SimpleXhr;
    setParser(parser:String):js.Function;
    setRequestData(data:String):qx.bom.request.SimpleXhr;
    setRequestHeader(key:String,value:String):qx.bom.request.SimpleXhr;
    setTimeout(millis:Long):qx.bom.request.SimpleXhr;
    setUrl(url:String):qx.bom.request.SimpleXhr;
    toHashCode():Int;
    useCaching(value:Boolean):qx.bom.request.SimpleXhr;

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Xhr")
class Xhr extends js.Object {
    constructor ();
    protected _createNativeXhr():any;
    protected _emit(event:String):Unit;
    protected _getProtocol():String;
    abort():qx.bom.request.Xhr;
    dispose():Boolean;
    getAllResponseHeaders():String;
    getRequest():any;
    getResponseHeader(header:String):String;
    isDisposed():Boolean;
    on(name:String,listener:js.Function,ctx?:any):qx.bom.request.Xhr;
    onabort():Unit;
    onerror():Unit;
    onload():Unit;
    onloadend():Unit;
    onreadystatechange():Unit;
    ontimeout():Unit;
    open(method?:String,url?:String,async?:Boolean,user?:String,password?:String):Unit;
    overrideMimeType(mimeType:String):qx.bom.request.Xhr;
    send(data?:String):qx.bom.request.Xhr;
    setRequestHeader(key:String,value:String):qx.bom.request.Xhr;

}
}
package qx.bom.rest {
@js.native
@JSName("qx.bom.rest.Resource")
class Resource extends qx.event.Emitter {
    constructor (description?:IMap);
    static placeholdersFromUrl(url:String):qx.data.Array;
    protected _getRequest():qx.bom.request.SimpleXhr;
    protected _getRequestConfig(action:String,params:IMap):IMap;
    protected _getRequestHandler():IMap;
    protected _getThrottleCount():Int;
    protected _getThrottleLimit():Int;
    protected _startPoll(action:String,listener:js.Function,interval:Long):Unit;
    abort(varargs?:String):Unit;
    configureRequest(callback:js.Function):Unit;
    destruct():Unit;
    dispose():Unit;
    getRequestsByAction(action:String):qx.data.Array;
    invoke(action:String,params:IMap,data:IMap):Long;
    isDisposed():Boolean;
    longPoll(action:String):String;
    map(action:String,method:String,url:String,check?:IMap):Unit;
    poll(action:String,interval:Long,params?:IMap,immediately?:Boolean):Unit;
    refresh(action:String):Unit;
    restartPollByAction(action:String):Unit;
    setBaseUrl(baseUrl:String):Unit;
    setRequestFactory(fn:js.Function):Unit;
    setRequestHandler(handler:IMap):Unit;
    stopPollByAction(action:String):Unit;

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Memory")
class Memory extends js.Object {
    constructor ();
    static getLocal():qx.bom.storage.Memory;
    static getSession():qx.bom.storage.Memory;
    clear():Unit;
    forEach(callback:js.Function,scope:any):Unit;
    getItem(key:String):any;
    getKey(index:Int):String;
    getLength():Int;
    getStorage():IMap;
    removeItem(key:String):Unit;
    setItem(key:String,value:any):Unit;

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.UserData")
class UserData extends js.Object {
    constructor (storeName?:String);
    static getLocal():qx.bom.storage.UserData;
    static getSession():qx.bom.storage.UserData;
    clear():Unit;
    forEach(callback:js.Function,scope:any):Unit;
    getItem(key:String):any;
    getKey(index:Int):String;
    getLength():Int;
    getStorage():IMap;
    removeItem(key:String):Unit;
    setItem(key:String,value:any):Unit;

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Web")
class Web extends js.Object {
    constructor (type?:String);
    static getLocal():qx.bom.storage.Web;
    static getSession():qx.bom.storage.Web;
    clear():Unit;
    forEach(callback:js.Function,scope:any):Unit;
    getItem(key:String):any;
    getKey(index:Int):String;
    getLength():Int;
    getStorage():any;
    removeItem(key:String):Unit;
    setItem(key:String,value:any):Unit;

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static getInstance():qx.bom.webfonts.Manager;
    getPreferredFormats():String[];
    remove(familyName:String):Unit;
    removeStyleSheet():Unit;
    require(familyName:String,sourcesList:String[],callback?:js.Function,context?:any):Unit;

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Validator")
class Validator extends qx.core.Object {
    constructor (fontFamily?:String);
    static removeDefaultHelperElements():Unit;
    protected _applyFontFamily(value:any,old:any):Unit;
    protected _getHelperElement(fontFamily:String):HTMLElement;
    protected _getRequestedHelpers():IMap;
    protected _isFontValid():Boolean;
    protected _reset():Unit;
    getFontFamily():any;
    getTimeout():Int;
    protected initFontFamily(value:any):any;
    protected initTimeout(value:any):Int;
    resetFontFamily():Unit;
    resetTimeout():Unit;
    setFontFamily(value:any):any;
    setTimeout(value:any):Int;
    validate():Unit;

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.WebFont")
class WebFont extends qx.bom.Font {
    protected _applySources(value:any,old:any):Unit;
    protected _onWebFontChangeStatus(ev:qx.event.type.Data):Unit;
    protected _quoteFontFamily(familyName:String):String;
    getSources():any;
    protected initSources(value:any):any;
    resetSources():Unit;
    setSources(value:any):any;

}
}
package qx.core {
@js.native
@JSName("qx.core.Aspect")
class Aspect extends js.Object {
    static addAdvice(fcn:js.Function,position?:String,type?:String,name?:String):Unit;
    static wrap(fullName:String,fcn:js.Function,type:String):js.Function;

}
}
package qx.core {
@js.native
@JSName("qx.core.Assert")
class Assert extends js.Object {
    static assert(condition:any,msg:String):Unit;
    static assertArgumentsCount(args:any,minCount:Int,maxCount:Int,msg:String):Unit;
    static assertArray(value:any,msg:String):Unit;
    static assertArrayEquals(expected:qx.data.Array,found:qx.data.Array,msg:String):Unit;
    static assertBoolean(value:any,msg:String):Unit;
    static assertCssColor(expected:String,value:String,msg:String):Unit;
    static assertElement(value:any,msg:String):Unit;
    static assertEquals(expected:any,found:any,msg:String):Unit;
    static assertEventFired(obj:any,event:String,invokeFunc:js.Function,listenerFunc?:js.Function,msg?:String):Unit;
    static assertEventNotFired(obj:any,event:String,invokeFunc:js.Function,msg:String):Unit;
    static assertException(callback:js.Function,exception?:js.Error,re?:String,msg?:String):Unit;
    static assertFalse(value:Boolean,msg:String):Unit;
    static assertFunction(value:any,msg:String):Unit;
    static assertIdentical(expected:any,found:any,msg:String):Unit;
    static assertInArray(value:any,array:qx.data.Array,msg:String):Unit;
    static assertInRange(value:any,min:Long,max:Long,msg:String):Unit;
    static assertInstance(value:any,clazz:qx.Class,msg:String):Unit;
    static assertInteger(value:any,msg:String):Unit;
    static assertInterface(value:any,iface:qx.Class,msg:String):Unit;
    static assertJsonEquals(expected:any,found:any,msg:String):Unit;
    static assertKeyInMap(value:any,map:IMap,msg:String):Unit;
    static assertMap(value:any,msg:String):Unit;
    static assertMatch(str:String,re:String,msg:String):Unit;
    static assertNotEquals(expected:any,found:any,msg:String):Unit;
    static assertNotIdentical(expected:any,found:any,msg:String):Unit;
    static assertNotNull(value:any,msg:String):Unit;
    static assertNotUndefined(value:any,msg:String):Unit;
    static assertNull(value:any,msg:String):Unit;
    static assertNumber(value:any,msg:String):Unit;
    static assertObject(value:any,msg:String):Unit;
    static assertPositiveInteger(value:any,msg:String):Unit;
    static assertPositiveNumber(value:any,msg:String):Unit;
    static assertQxObject(value:any,msg:String):Unit;
    static assertQxWidget(value:any,msg:String):Unit;
    static assertRegExp(value:any,msg:String):Unit;
    static assertString(value:any,msg:String):Unit;
    static assertTrue(value:Boolean,msg:String):Unit;
    static assertType(value:any,type:String,msg:String):Unit;
    static assertUndefined(value:any,msg:String):Unit;
    static fail(msg:String,compact:Boolean):Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.AssertionError")
class AssertionError extends qx.type.BaseError {
    constructor (comment?:String,failMessage?:String);
    getStackTrace():String[];

}
}
package qx.core {
@js.native
@JSName("qx.core.BaseInit")
class BaseInit extends js.Object {
    static getApplication():qx.core.Object;
    static ready():Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.Environment")
class Environment extends js.Object {
    protected static _getClassNameFromEnvKey(key:String):qx.data.Array;
    protected static _initDefaultQxValues():Unit;
    static add(key:String,check:any):Unit;
    static addAsync(key:String,check:js.Function):Unit;
    static filter(map:IMap):qx.data.Array;
    static get(key:String):any;
    static getAsync(key:String,callback:js.Function,self:any):Unit;
    static getAsyncChecks():IMap;
    static getChecks():IMap;
    static invalidateCacheKey(key:String):Unit;
    static select(key:String,values:IMap):any;
    static selectAsync(key:String,values:IMap,self:any):Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.GlobalError")
class GlobalError extends js.Error {
    constructor (exc?:js.Error,args?:qx.data.Array);
    getArguments():any;
    getSourceException():js.Error;

}
}
package qx.core {
@js.native
@JSName("qx.core.Init")
class Init extends js.Object {

}
}
package qx.core {
@js.native
@JSName("qx.core.MAssert")
class MAssert extends js.Object {
    assert(condition:any,msg:String):Unit;
    assertArgumentsCount(args:any,minCount:Int,maxCount:Int,msg:String):Unit;
    assertArray(value:any,msg:String):Unit;
    assertArrayEquals(expected:qx.data.Array,found:qx.data.Array,msg:String):Unit;
    assertBoolean(value:any,msg:String):Unit;
    assertCssColor(expected:String,value:String,msg:String):Unit;
    assertElement(value:any,msg:String):Unit;
    assertEquals(expected:any,found:any,msg:String):Unit;
    assertEventFired(obj:any,event:String,invokeFunc:js.Function,listener?:js.Function,msg?:String):Unit;
    assertEventNotFired(obj:any,event:String,invokeFunc:js.Function,msg:String):Unit;
    assertException(callback:js.Function,exception?:js.Error,re?:String,msg?:String):Unit;
    assertFalse(value:Boolean,msg:String):Unit;
    assertFunction(value:any,msg:String):Unit;
    assertIdentical(expected:any,found:any,msg:String):Unit;
    assertInArray(value:any,array:qx.data.Array,msg:String):Unit;
    assertInRange(value:any,min:Long,max:Long,msg:String):Unit;
    assertInstance(value:any,clazz:qx.Class,msg:String):Unit;
    assertInteger(value:any,msg:String):Unit;
    assertInterface(value:any,iface:qx.Class,msg:String):Unit;
    assertJsonEquals(expected:any,found:any,msg:String):Unit;
    assertKeyInMap(value:any,map:IMap,msg:String):Unit;
    assertMap(value:any,msg:String):Unit;
    assertMatch(str:String,re:js.RegExp,msg:String):Unit;
    assertNotEquals(expected:any,found:any,msg:String):Unit;
    assertNotIdentical(expected:any,found:any,msg:String):Unit;
    assertNotNull(value:any,msg:String):Unit;
    assertNotUndefined(value:any,msg:String):Unit;
    assertNull(value:any,msg:String):Unit;
    assertNumber(value:any,msg:String):Unit;
    assertObject(value:any,msg:String):Unit;
    assertPositiveInteger(value:any,msg:String):Unit;
    assertPositiveNumber(value:any,msg:String):Unit;
    assertQxObject(value:any,msg:String):Unit;
    assertQxWidget(value:any,msg:String):Unit;
    assertRegExp(value:any,msg:String):Unit;
    assertString(value:any,msg:String):Unit;
    assertTrue(value:Boolean,msg:String):Unit;
    assertType(value:any,type:String,msg:String):Unit;
    assertUndefined(value:any,msg:String):Unit;
    fail(msg:String,compact:Boolean):Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.MBindTo")
class MBindTo extends js.Object {
    bindTo(func:js.Function,varargs?:any):js.Function;

}
}
package qx.core {
@js.native
@JSName("qx.core.MEvent")
class MEvent extends js.Object {
    addListener(type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    addListenerOnce(type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    dispatchEvent(evt:qx.event.type.Event):Boolean;
    fireDataEvent(type:String,data:any,oldData?:any,cancelable?:Boolean):Boolean;
    fireEvent(type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    fireNonBubblingEvent(type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    hasListener(type:String,capture?:Boolean):Boolean;
    removeListener(type:String,listener:js.Function,self?:any,capture?:Boolean):Boolean;
    removeListenerById(id:String):Boolean;

}
}
package qx.core {
@js.native
@JSName("qx.core.MLogging")
class MLogging extends js.Object {
    debug(varargs?:any):Unit;
    error(varargs?:any):Unit;
    info(varargs?:any):Unit;
    trace():Unit;
    warn(varargs?:any):Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.MProperty")
class MProperty extends js.Object {
    get(prop:String):any;
    reset(prop:String):Unit;
    set(data:IMap,value?:any):any;

}
}
package qx.core {
@js.native
@JSName("qx.core.Object")
class Object extends js.Object {
    addListener(type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    addListenerOnce(type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    dispatchEvent(evt:qx.event.type.Event):Boolean;
    fireDataEvent(type:String,data:any,oldData?:any,cancelable?:Boolean):Boolean;
    fireEvent(type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    fireNonBubblingEvent(type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    hasListener(type:String,capture?:Boolean):Boolean;
    removeListener(type:String,listener:js.Function,self?:any,capture?:Boolean):Boolean;
    removeListenerById(id:String):Boolean;
    assert(condition:any,msg:String):Unit;
    assertArgumentsCount(args:any,minCount:Int,maxCount:Int,msg:String):Unit;
    assertArray(value:any,msg:String):Unit;
    assertArrayEquals(expected:qx.data.Array,found:qx.data.Array,msg:String):Unit;
    assertBoolean(value:any,msg:String):Unit;
    assertCssColor(expected:String,value:String,msg:String):Unit;
    assertElement(value:any,msg:String):Unit;
    assertEquals(expected:any,found:any,msg:String):Unit;
    assertEventFired(obj:any,event:String,invokeFunc:js.Function,listener?:js.Function,msg?:String):Unit;
    assertEventNotFired(obj:any,event:String,invokeFunc:js.Function,msg:String):Unit;
    assertException(callback:js.Function,exception?:js.Error,re?:String,msg?:String):Unit;
    assertFalse(value:Boolean,msg:String):Unit;
    assertFunction(value:any,msg:String):Unit;
    assertIdentical(expected:any,found:any,msg:String):Unit;
    assertInArray(value:any,array:qx.data.Array,msg:String):Unit;
    assertInRange(value:any,min:Long,max:Long,msg:String):Unit;
    assertInstance(value:any,clazz:qx.Class,msg:String):Unit;
    assertInteger(value:any,msg:String):Unit;
    assertInterface(value:any,iface:qx.Class,msg:String):Unit;
    assertJsonEquals(expected:any,found:any,msg:String):Unit;
    assertKeyInMap(value:any,map:IMap,msg:String):Unit;
    assertMap(value:any,msg:String):Unit;
    assertMatch(str:String,re:js.RegExp,msg:String):Unit;
    assertNotEquals(expected:any,found:any,msg:String):Unit;
    assertNotIdentical(expected:any,found:any,msg:String):Unit;
    assertNotNull(value:any,msg:String):Unit;
    assertNotUndefined(value:any,msg:String):Unit;
    assertNull(value:any,msg:String):Unit;
    assertNumber(value:any,msg:String):Unit;
    assertObject(value:any,msg:String):Unit;
    assertPositiveInteger(value:any,msg:String):Unit;
    assertPositiveNumber(value:any,msg:String):Unit;
    assertQxObject(value:any,msg:String):Unit;
    assertQxWidget(value:any,msg:String):Unit;
    assertRegExp(value:any,msg:String):Unit;
    assertString(value:any,msg:String):Unit;
    assertTrue(value:Boolean,msg:String):Unit;
    assertType(value:any,type:String,msg:String):Unit;
    assertUndefined(value:any,msg:String):Unit;
    fail(msg:String,compact:Boolean):Unit;
    get(prop:String):any;
    reset(prop:String):Unit;
    set(data:IMap,value?:any):any;
    debug(varargs?:any):Unit;
    error(varargs?:any):Unit;
    info(varargs?:any):Unit;
    trace():Unit;
    warn(varargs?:any):Unit;
    bind(sourcePropertyChain:String,targetObject:qx.core.Object,targetProperty:String,options:IMap):any;
    getBindings():qx.data.Array;
    removeAllBindings():Unit;
    removeBinding(id:any):Unit;
    removeRelatedBindings(relatedObject:qx.core.Object):Unit;
    constructor ();
    protected _disposeArray(field:String):Unit;
    protected _disposeMap(field:String):Unit;
    protected _disposeObjects(varargs?:any):Unit;
    protected _disposeSingletonObjects(varargs?:any):Unit;
    base(args:any,varargs?:any):any;
    clone():qx.core.Object;
    dispose():Unit;
    getUserData(key:String):any;
    isDisposed():Boolean;
    self(args:any):any;
    setUserData(key:String,value:any):Unit;
    toHashCode():Int;

}
}
package qx.core {
@js.native
@JSName("qx.core.ObjectRegistry")
class ObjectRegistry extends js.Object {
    static clearHashCode(obj:any):Unit;
    static fromHashCode(hash:String):qx.core.Object;
    static getNextHash():Int;
    static getPostId():Int;
    static getRegistry():any;
    static getStackTraces():IMap;
    static register(obj:any):Unit;
    static shutdown():Unit;
    static toHashCode(obj:any):String;
    static unregister(obj:any):Unit;

}
}
package qx.core {
@js.native
@JSName("qx.core.Property")
class Property extends js.Object {
    static attachMethods(clazz:qx.Class,name:String,config:IMap):Unit;
    static attachRefreshInheritables(clazz:qx.Class):Unit;
    static error(obj:qx.core.Object,id:Int,property:String,variant:String,value:any):Unit;
    static executeOptimizedGetter(instance:any,clazz:qx.Class,name:String,variant:String):any;
    static executeOptimizedSetter(instance:any,clazz:qx.Class,name:String,variant:String,args:any):any;

}
}
package qx.core {
@js.native
@JSName("qx.core.ValidationError")
class ValidationError extends qx.type.BaseError {

}
}
package qx.core {
@js.native
@JSName("qx.core.WindowError")
class WindowError extends js.Error {
    constructor (failMessage?:String,uri?:String,lineNumber?:Int);
    getLineNumber():Int;
    getUri():String;

}
}
package qx.data {
@js.native
@JSName("qx.data.Array")
class Array extends qx.core.Object implements qx.data.IListData {
    contains(item:any):Boolean;
    getItem(index:Long):any;
    getLength():Long;
    setItem(index:Long,item:any):Unit;
    splice(startIndex:Int,amount:Int,varargs?:any):qx.data.Array;
    toArray():qx.data.Array;
    constructor (param?:any);
    append(array:qx.data.Array):Unit;
    concat(array:qx.data.Array):qx.data.Array;
    copy():qx.data.Array;
    equals(array:qx.data.Array):Boolean;
    every(callback:js.Function,self?:any):Boolean;
    filter(callback:js.Function,self?:any):qx.data.Array;
    forEach(callback:js.Function,context:any):Unit;
    getAutoDisposeItems():Boolean;
    indexOf(item:any):Long;
    protected initAutoDisposeItems(value:any):Boolean;
    insertAfter(after:any,item:any):Unit;
    insertAt(index:Int,item:any):Unit;
    insertBefore(before:any,item:any):Unit;
    isAutoDisposeItems():Boolean;
    join(connector:String):String;
    lastIndexOf(item:any):Long;
    map(callback:js.Function,self?:any):qx.data.Array;
    max():Long;
    min():Long;
    pop():any;
    push(varargs?:any):Long;
    reduce(callback:js.Function,initValue?:any):any;
    reduceRight(callback:js.Function,initValue?:any):any;
    remove(item:any):any;
    removeAll():qx.data.Array;
    removeAt(index:Int):any;
    resetAutoDisposeItems():Unit;
    reverse():Unit;
    setAutoDisposeItems(value:any):Boolean;
    shift():any;
    slice(from:Long,to?:Long):qx.data.Array;
    some(callback:js.Function,self?:any):Boolean;
    sort(func:js.Function):Unit;
    sum():Long;
    toggleAutoDisposeItems():Boolean;
    unshift(varargs?:any):Int;

}
}
package qx.data {
@js.native
@JSName("qx.data.Conversion")
class Conversion extends js.Object {
    static toBoolean(value:any):Boolean;
    static toNumber(value:any):Long;

}
}
package qx.data {
@js.native
trait IListData extends js.Object {
    contains(item:any):Boolean;
    getItem(index:Long):any;
    getLength():Long;
    setItem(index:Long,item:any):Unit;
    splice(startIndex:Int,amount:Int,varargs?:any):qx.data.Array;
    toArray():qx.data.Array;

}
}
package qx.data {
@js.native
@JSName("qx.data.MBinding")
class MBinding extends js.Object {
    constructor ();
    bind(sourcePropertyChain:String,targetObject:qx.core.Object,targetProperty:String,options:IMap):any;
    getBindings():qx.data.Array;
    removeAllBindings():Unit;
    removeBinding(id:any):Unit;
    removeRelatedBindings(relatedObject:qx.core.Object):Unit;

}
}
package qx.data {
@js.native
@JSName("qx.data.SingleValueBinding")
class SingleValueBinding extends js.Object {
    static bind(sourceObject:qx.core.Object,sourcePropertyChain:String,targetObject:qx.core.Object,targetPropertyChain:String,options?:IMap):any;
    static getAllBindings():IMap;
    static getAllBindingsForObject(object:qx.core.Object):qx.data.Array;
    static removeAllBindings():Unit;
    static removeAllBindingsForObject(object:qx.core.Object):Unit;
    static removeBindingFromObject(sourceObject:qx.core.Object,id:any):Unit;
    static removeRelatedBindings(object:qx.core.Object,relatedObject:qx.core.Object):Unit;
    static resolvePropertyChain(o:qx.core.Object,propertyChain:String):any;
    static showAllBindingsInLog():Unit;
    static showBindingInLog(object:qx.core.Object,id:any):Unit;
    static updateTarget(sourceObject:qx.core.Object,sourcePropertyChain:String,targetObject:qx.core.Object,targetPropertyChain:String,options:IMap):Unit;

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Form")
class Form extends qx.core.Object {
    constructor (model?:qx.core.Object,target?:qx.ui.form.Form,selfUpdate?:Boolean);
    protected _applyModel(value:qx.core.Object,old:qx.core.Object):Unit;
    protected _applyTarget(value:qx.ui.form.Form,old:qx.ui.form.Form):Unit;
    addBindingOptions(name:String,model2target:IMap,target2model:IMap):Unit;
    createModel(includeBubbleEvents:Boolean):qx.core.Object;
    getModel():qx.core.Object;
    getTarget():qx.ui.form.Form;
    protected initModel(value:any):qx.core.Object;
    protected initTarget(value:any):qx.ui.form.Form;
    resetModel():Unit;
    resetTarget():Unit;
    setModel(value:any):qx.core.Object;
    setTarget(value:any):qx.ui.form.Form;
    updateModel():Unit;

}
}
package qx.data.controller {
@js.native
trait IControllerDelegate extends js.Object {
    bindItem(controller:any,item:qx.ui.core.Widget,id:any):Unit;
    configureItem(item:any):Unit;
    createItem():qx.ui.core.Widget;
    filter(data:any):Boolean;

}
}
package qx.data.controller {
@js.native
trait ISelection extends js.Object {
    getSelection():qx.data.IListData;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.List")
class List extends qx.core.Object implements qx.data.controller.ISelection {
    getSelection():qx.data.IListData;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;
    constructor (model?:qx.data.Array,target?:qx.ui.core.Widget,labelPath?:String);
    protected _applyDelegate(value:qx.core.Object,old:qx.core.Object):Unit;
    protected _applyIconOptions(value:IMap,old:IMap):Unit;
    protected _applyIconPath(value:String,old:String):Unit;
    protected _applyLabelOptions(value:IMap,old:IMap):Unit;
    protected _applyLabelPath(value:String,old:String):Unit;
    protected _applyModel(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _applyTarget(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _bindListItem(item:qx.ui.form.ListItem,index:Long):Unit;
    protected _createItem():qx.ui.form.ListItem;
    protected _onBindingSet(index:Long,sourceObject:qx.core.Object,targetObject:qx.core.Object):Unit;
    protected _removeBindingsFrom(item:Long):Unit;
    protected _setBindItem(value:any,old:any):Unit;
    protected _setConfigureItem(value:any,old:any):Unit;
    protected _setCreateItem(value:any,old:any):Unit;
    protected _setFilter(value:js.Function,old:js.Function):Unit;
    bindDefaultProperties(item:qx.ui.form.ListItem,index:Long):Unit;
    bindProperty(sourcePath:String,targetProperty:String,options:IMap,targetWidget:qx.ui.core.Widget,index:Long):Unit;
    bindPropertyReverse(targetPath:String,sourcePath:String,options:IMap,sourceWidget:qx.ui.core.Widget,index:Long):Unit;
    getDelegate():any;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    getModel():qx.data.IListData;
    getTarget():any;
    getVisibleModels():qx.data.Array;
    protected initDelegate(value:any):any;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    protected initModel(value:any):qx.data.IListData;
    protected initTarget(value:any):any;
    resetDelegate():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    resetModel():Unit;
    resetTarget():Unit;
    setDelegate(value:any):any;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;
    setModel(value:any):qx.data.IListData;
    setTarget(value:any):any;
    syncWidget():Unit;
    update():Unit;

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.MSelection")
class MSelection extends js.Object {
    constructor ();
    protected _addChangeTargetListener(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _applySelection(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _changeTargetSelection():Unit;
    protected _endSelectionModification():Unit;
    protected _inSelectionModification():Boolean;
    protected _startSelectionModification():Unit;
    protected _updateSelection():Unit;
    getSelection():qx.data.Array;
    protected initSelection(value:any):qx.data.Array;
    resetSelection():Unit;
    setSelection(value:any):qx.data.Array;

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Object")
class Object extends qx.core.Object {
    constructor (model?:qx.core.Object);
    protected _applyModel(value:qx.core.Object,old:qx.core.Object):Unit;
    addTarget(targetObject:qx.core.Object,targetProperty:String,sourceProperty:String,bidirectional?:Boolean,options?:IMap,reverseOptions?:IMap):Unit;
    getModel():qx.core.Object;
    protected initModel(value:any):qx.core.Object;
    removeTarget(targetObject:qx.core.Object,targetProperty:String,sourceProperty:String):Unit;
    resetModel():Unit;
    setModel(value:any):qx.core.Object;

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Tree")
class Tree extends qx.core.Object implements qx.data.controller.ISelection {
    getSelection():qx.data.IListData;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;
    constructor (model?:qx.core.Object,target?:qx.ui.tree.Tree,childPath?:String,labelPath?:String);
    protected _applyChildPath(value:String,old:String):Unit;
    protected _applyDelegate(value:qx.core.Object,old:qx.core.Object):Unit;
    protected _applyIconOptions(value:IMap,old:IMap):Unit;
    protected _applyIconPath(value:String,old:String):Unit;
    protected _applyLabelOptions(value:IMap,old:IMap):Unit;
    protected _applyLabelPath(value:String,old:String):Unit;
    protected _applyModel(value:qx.core.Object,old:qx.core.Object):Unit;
    protected _applyTarget(value:qx.ui.tree.Tree,old:qx.ui.tree.Tree):Unit;
    protected _createItem():qx.ui.tree.core.AbstractTreeItem;
    protected _setBindItem(value:any,old:any):Unit;
    protected _setConfigureItem(value:any,old:any):Unit;
    protected _setCreateItem(value:any,old:any):Unit;
    bindDefaultProperties(treeNode:qx.ui.tree.core.AbstractTreeItem,modelNode:qx.core.Object):Unit;
    bindProperty(sourcePath:String,targetPath:String,options:IMap,targetWidget:qx.ui.tree.core.AbstractTreeItem,modelNode:any):Unit;
    bindPropertyReverse(targetPath:String,sourcePath:String,options:IMap,sourceWidget:qx.ui.tree.core.AbstractTreeItem,modelNode:any):Unit;
    getChildPath():String;
    getDelegate():any;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    getModel():qx.core.Object;
    getTarget():any;
    protected initChildPath(value:any):String;
    protected initDelegate(value:any):any;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    protected initModel(value:any):qx.core.Object;
    protected initTarget(value:any):any;
    resetChildPath():Unit;
    resetDelegate():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    resetModel():Unit;
    resetTarget():Unit;
    setChildPath(value:any):String;
    setDelegate(value:any):any;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;
    setModel(value:any):qx.core.Object;
    setTarget(value:any):any;

}
}
package qx.data.marshal {
@js.native
trait IMarshaler extends js.Object {
    toClass(data:any,includeBubbleEvents:Boolean):Unit;
    toModel(data:any):qx.core.Object;

}
}
package qx.data.marshal {
@js.native
trait IMarshalerDelegate extends js.Object {
    getArrayClass(parentProperty:String,depth:Long):qx.Class;
    getModelClass(properties:String,object:IMap,parentProperty:String,depth:Long):qx.Class;
    getModelMixins(properties:String,parentProperty:String,depth:Long):qx.data.Array;
    getModelSuperClass(properties:String,parentProperty:String,depth:Long):qx.Class;
    getPropertyMapping(property:String,properties:String):String;
    getValidationRule(properties:String,propertyName:String):js.Function;
    ignore(properties:String,parentProperty:String,depth:Long):Boolean;

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.Json")
class Json extends qx.core.Object implements qx.data.marshal.IMarshaler {
    toClass(data:any,includeBubbleEvents:Boolean):Unit;
    toModel(data:any):qx.core.Object;
    constructor (delegate?:any);
    static createModel(data:any,includeBubbleEvents:Boolean):qx.core.Object;

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.MEventBubbling")
class MEventBubbling extends js.Object {
    protected _applyEventPropagation(value:any,old:any,name:String):Unit;
    protected _registerEventChaining(value:any,old:any,name:String):Unit;

}
}
package qx.data.store {
@js.native
trait IStoreDelegate extends js.Object {
    configureRequest(request:any):Unit;
    manipulateData(data:any):any;

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Json")
class Json extends qx.core.Object {
    constructor (url?:String,delegate?:any);
    protected _applyUrl(value:String,old:String):Unit;
    protected _createRequest(url:String):Unit;
    protected _getRequest():any;
    protected _onChangePhase(ev:qx.event.type.Data):Unit;
    protected _onFail(ev:qx.event.type.Event):Unit;
    protected _onSuccess(ev:qx.event.type.Event):Unit;
    protected _setRequest(request:any):Unit;
    getModel():any;
    getState():any;
    getUrl():String;
    protected initModel(value:any):any;
    protected initState(value:any):any;
    protected initUrl(value:any):String;
    reload():Unit;
    resetModel():Unit;
    resetState():Unit;
    resetUrl():Unit;
    setModel(value:any):any;
    setState(value:any):any;
    setUrl(value:any):String;

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Jsonp")
class Jsonp extends qx.data.store.Json {
    constructor (url?:String,delegate?:any,callbackParam?:String);
    getCallbackName():String;
    getCallbackParam():String;
    protected initCallbackName(value:any):String;
    protected initCallbackParam(value:any):String;
    resetCallbackName():Unit;
    resetCallbackParam():Unit;
    setCallbackName(value:any):String;
    setCallbackParam(value:any):String;

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Offline")
class Offline extends qx.core.Object {
    constructor (key?:String,storage?:String,delegate?:any);
    protected _applyModel(value:any,old:any):Unit;
    protected _initializeModel():Unit;
    protected _setModel(data:any):Unit;
    protected _storeModel():Unit;
    getKey():String;
    getModel():any;
    protected initModel(value:any):any;
    resetModel():Unit;
    setModel(value:any):any;

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Rest")
class Rest extends qx.core.Object {
    constructor (resource?:qx.io.rest.Resource,actionName?:String,delegate?:any);
    getActionName():String;
    getModel():any;
    getResource():qx.io.rest.Resource;
    protected initActionName(value:any):String;
    protected initModel(value:any):any;
    protected initResource(value:any):qx.io.rest.Resource;
    resetActionName():Unit;
    resetModel():Unit;
    resetResource():Unit;
    setActionName(value:any):String;
    setModel(value:any):any;
    setResource(value:any):qx.io.rest.Resource;

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Yql")
class Yql extends qx.data.store.Jsonp {
    constructor (query?:String,delegate?:any,https?:Boolean);

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Element")
class Element extends js.Object {
    static create(name:String,attributes?:IMap,win?:Window):HTMLElement;
    static empty(element:HTMLElement):String;
    static getHelperElement(win?:Window):HTMLElement;
    static getParentElement(element:HTMLElement):HTMLElement;
    static hasChild(parent:HTMLElement,child:Node):Boolean;
    static hasChildElements(element:HTMLElement):Boolean;
    static hasChildren(element:HTMLElement):Boolean;
    static insertAfter(node:Node,ref:Node):Boolean;
    static insertAt(node:Node,parent:HTMLElement,index:Int):Boolean;
    static insertBefore(node:Node,ref:Node):Boolean;
    static insertBegin(node:Node,parent:HTMLElement):Boolean;
    static insertEnd(node:Node,parent:HTMLElement):Boolean;
    static isInDom(element:HTMLElement,win:Window):Boolean;
    static remove(node:Node):Boolean;
    static removeChild(node:Node,parent:HTMLElement):Boolean;
    static removeChildAt(index:Int,parent:HTMLElement):Boolean;
    static replaceAt(newNode:Node,index:Int,parent:HTMLElement):Boolean;
    static replaceChild(newNode:Node,oldNode:Node):Boolean;

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Hierarchy")
class Hierarchy extends js.Object {
    protected static _recursivelyCollect(element:HTMLElement,property:String):qx.data.Array;
    static cleanWhitespace(element:HTMLElement):Unit;
    static contains(element:HTMLElement,target:Node):Boolean;
    static getAncestors(element:HTMLElement):qx.data.Array;
    static getChildElements(element:HTMLElement):qx.data.Array;
    static getCommonParent(element1:HTMLElement,element2:HTMLElement):HTMLElement;
    static getDescendants(element:HTMLElement):qx.data.Array;
    static getElementIndex(element:HTMLElement):Int;
    static getFirstDescendant(element:HTMLElement):HTMLElement;
    static getLastDescendant(element:HTMLElement):HTMLElement;
    static getNextElementSibling(element:HTMLElement):HTMLElement;
    static getNextSiblings(element:HTMLElement):qx.data.Array;
    static getNodeIndex(node:Node):Int;
    static getPreviousElementSibling(element:HTMLElement):HTMLElement;
    static getPreviousSiblings(element:HTMLElement):qx.data.Array;
    static getSiblings(element:any):qx.data.Array;
    static isDescendantOf(element:HTMLElement,ancestor:HTMLElement):Boolean;
    static isEmpty(element:HTMLElement):Boolean;
    static isRendered(element:HTMLElement):Boolean;

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Node")
class Node extends js.Object {
    static getBodyElement(node:Node):HTMLElement;
    static getDocument(node:Node):Document;
    static getDocumentElement(node:Node):HTMLElement;
    static getName(node:Node):String;
    static getText(node:Node):String;
    static getWindow(node:Node):Window;
    static isBlockNode(node:Node):Boolean;
    static isDocument(node:Node):Boolean;
    static isDocumentFragment(node:Node):Boolean;
    static isElement(node:Node):Boolean;
    static isNode(node:Node):Boolean;
    static isNodeName(node:Node,nodeName:String):Boolean;
    static isText(node:Node):Boolean;
    static isWindow(obj:any):Boolean;

}
}
package qx.event {
@js.native
@JSName("qx.event.AcceleratingTimer")
class AcceleratingTimer extends qx.core.Object {
    constructor ();
    protected _onInterval():Unit;
    getDecrease():Int;
    getFirstInterval():Int;
    getInterval():Int;
    getMinimum():Int;
    protected initDecrease(value:any):Int;
    protected initFirstInterval(value:any):Int;
    protected initInterval(value:any):Int;
    protected initMinimum(value:any):Int;
    resetDecrease():Unit;
    resetFirstInterval():Unit;
    resetInterval():Unit;
    resetMinimum():Unit;
    setDecrease(value:any):Int;
    setFirstInterval(value:any):Int;
    setInterval(value:any):Int;
    setMinimum(value:any):Int;
    start():Unit;
    stop():Unit;

}
}
package qx.event {
@js.native
@JSName("qx.event.Emitter")
class Emitter extends js.Object {
    addListener(name:String,listener:js.Function,ctx?:any):Int;
    addListenerOnce(name:String,listener:js.Function,ctx?:any):Int;
    emit(name:String,data?:any):Unit;
    getEntryById(id:Long):IMap;
    getListeners():IMap;
    off(name:String,listener:js.Function,ctx?:any):Int;
    offById(id:Int):Int;
    on(name:String,listener:js.Function,ctx?:any):Int;
    once(name:String,listener:js.Function,ctx?:any):Int;
    removeListener(name:String,listener:js.Function,ctx?:any):Unit;
    removeListenerById(id:Int):Unit;

}
}
package qx.event {
@js.native
@JSName("qx.event.GlobalError")
class GlobalError extends js.Object {
    static handleError(ex:qx.core.WindowError):Unit;
    static observeMethod(method:js.Function):js.Function;
    static setErrorHandler(callback?:js.Function,context?:any):Unit;

}
}
package qx.event {
@js.native
trait IEventDispatcher extends js.Object {
    canDispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Boolean;
    dispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Unit;

}
}
package qx.event {
@js.native
trait IEventHandler extends js.Object {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;

}
}
package qx.event {
@js.native
@JSName("qx.event.Idle")
class Idle extends qx.core.Object {
    constructor ();
    static getInstance():qx.event.Idle;
    protected _applyTimeoutInterval(value:Long,old:Long):Unit;
    protected _onInterval():Unit;
    getTimeoutInterval():Long;
    protected initTimeoutInterval(value:any):Long;
    resetTimeoutInterval():Unit;
    setTimeoutInterval(value:any):Long;

}
}
package qx.event {
@js.native
@JSName("qx.event.Manager")
class Manager extends js.Object {
    constructor (win?:Window,registration?:qx.event.Registration);
    static getNextUniqueId():String;
    addListener(target:any,type:String,listener:js.Function,self?:any,capture?:Boolean):String;
    deleteAllListeners(targetKey:String):Unit;
    dispatchEvent(target:any,event:qx.event.type.Event):Boolean;
    dispose():Unit;
    findHandler(target:any,type:String):qx.event.IEventHandler;
    getAllListeners():IMap;
    getDispatcher(clazz:qx.Class):any;
    getHandler(clazz:qx.Class):any;
    getListeners(target:any,type:String,capture?:Boolean):qx.data.Array;
    getWindow():Window;
    getWindowId():String;
    hasListener(target:any,type:String,capture?:Boolean):Boolean;
    importListeners(target:any,list:IMap):Unit;
    removeAllListeners(target:any):Boolean;
    removeListener(target:any,type:String,listener:js.Function,self?:any,capture?:Boolean):Boolean;
    removeListenerById(target:any,id:String):Boolean;
    serializeListeners(target:any):IMap[];
    toggleAttachedEvents(target:any,enable:Boolean):Unit;

}
}
package qx.event {
@js.native
@JSName("qx.event.Messaging")
class Messaging extends js.Object {
    constructor ();
    protected _addListener(channel:String,type:String,handler:js.Function,scope?:any):String;
    protected _emit(channel:String,path:String,params:IMap,customData:any):Unit;
    protected _emitListeners(channel:String,path:String,listeners:IMap[],params:IMap,customData:any):Boolean;
    protected _emitRoute(channel:String,path:String,listener:IMap,params:IMap,customData:any):Boolean;
    emit(channel:String,path:String,params:IMap,customData:any):Unit;
    has(channel:String,path:String):Boolean;
    on(channel:String,type:String,handler:js.Function,scope?:any):String;
    onAny(type:String,handler:js.Function,scope?:any):String;
    remove(id:String):Unit;

}
}
package qx.event {
@js.native
@JSName("qx.event.Pool")
class Pool extends qx.util.ObjectPool {
    constructor ();
    static getInstance():qx.event.Pool;

}
}
package qx.event {
@js.native
@JSName("qx.event.Registration")
class Registration extends js.Object {
    static addDispatcher(dispatcher:qx.event.IEventDispatcher,priority:Int):Unit;
    static addHandler(handler:qx.event.IEventHandler):Unit;
    static addListener(target:any,type:String,listener:js.Function,self?:any,capture?:Boolean):any;
    static createEvent(type:String,clazz?:any,args?:qx.data.Array):qx.event.type.Event;
    static deleteAllListeners(target:any):Unit;
    static dispatchEvent(target:any,event:qx.event.type.Event):Boolean;
    static fireEvent(target:any,type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    static fireNonBubblingEvent(target:any,type:String,clazz?:qx.Class,args?:qx.data.Array):Boolean;
    static getDispatchers():qx.event.IEventDispatcher[];
    static getHandlers():qx.event.IEventHandler[];
    static getManager(target:any):qx.event.Manager;
    static hasListener(target:any,type:String,capture?:Boolean):Boolean;
    static removeAllListeners(target:any):Boolean;
    static removeListener(target:any,type:String,listener:js.Function,self?:any,capture?:Boolean):Boolean;
    static removeListenerById(target:any,id:any):Boolean;
    static removeManager(mgr:qx.event.Manager):Unit;
    static serializeListeners(target:any):IMap[];

}
}
package qx.event {
@js.native
@JSName("qx.event.Timer")
class Timer extends qx.core.Object {
    constructor (interval?:Long);
    static once(func:js.Function,obj:any,timeout:Long):qx.event.Timer;
    protected _applyEnabled(value:any,old:any):Unit;
    protected _applyInterval(value:any,old:any):Unit;
    protected _oninterval():Unit;
    getEnabled():Boolean;
    getInterval():Int;
    protected initEnabled(value:any):Boolean;
    protected initInterval(value:any):Int;
    isEnabled():Boolean;
    resetEnabled():Unit;
    resetInterval():Unit;
    restart():Unit;
    restartWith(interval:Int):Unit;
    setEnabled(value:any):Boolean;
    setInterval(value:any):Int;
    start():Unit;
    startWith(interval:Int):Unit;
    stop():Unit;
    toggleEnabled():Boolean;

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.AbstractBubbling")
class AbstractBubbling extends qx.core.Object implements qx.event.IEventDispatcher {
    canDispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Boolean;
    dispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Unit;
    constructor (manager?:qx.event.Manager);
    protected _getParent(target:any):any;

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.Direct")
class Direct extends qx.core.Object implements qx.event.IEventDispatcher {
    canDispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Boolean;
    dispatchEvent(target:HTMLElement,event:qx.event.type.Event,type:String):Unit;
    constructor (manager?:qx.event.Manager);

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.DomBubbling")
class DomBubbling extends qx.event.dispatch.AbstractBubbling {

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.MouseCapture")
class MouseCapture extends qx.event.dispatch.AbstractBubbling {
    constructor (manager?:qx.event.Manager,registration?:qx.event.Registration);
    activateCapture(element:HTMLElement,containerCapture?:Boolean):Unit;
    getCaptureElement():HTMLElement;
    nativeReleaseCapture(element:HTMLElement):Unit;
    nativeSetCapture(element:HTMLElement,containerCapture?:Boolean):Unit;
    releaseCapture():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Appear")
class Appear extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    static refresh():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Application")
class Application extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    static onScriptLoaded():Unit;
    protected _initObserver():Unit;
    protected _onNativeLoad():Unit;
    protected _onNativeUnload():Unit;
    protected _stopObserver():Unit;
    isApplicationReady():Boolean;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Capture")
class Capture extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.DragDrop")
class DragDrop extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _getDelta(e:qx.event.type.Pointer):IMap;
    protected _onKeyDown(e:qx.event.type.KeySequence):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onKeyUp(e:qx.event.type.KeySequence):Unit;
    protected _onLongtap(e:qx.event.type.Tap):Unit;
    protected _onPointerdown(e:qx.event.type.Pointer):Unit;
    protected _onPointermove(e:qx.event.type.Pointer):Unit;
    protected _onPointerup(e:qx.event.type.Pointer):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _onWindowBlur(e:qx.event.type.Event):Unit;
    protected _start(e:qx.event.type.Pointer):Boolean;
    addAction(action:String):Unit;
    addData(type:String,data:any):Unit;
    addType(type:String):Unit;
    clearSession():Unit;
    getCurrentAction():String;
    getCurrentType():String;
    getCursor():qx.ui.core.Widget;
    getData(type:String):any;
    getDragTarget():qx.ui.core.Widget;
    protected initCursor(value:any):qx.ui.core.Widget;
    isSessionActive():Boolean;
    resetCursor():Unit;
    setCursor(value:any):qx.ui.core.Widget;
    setDropAllowed(isAllowed:Boolean):Unit;
    supportsAction(type:String):Boolean;
    supportsType(type:String):Boolean;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Element")
class Element extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _onNative(nativeEvent:qx.event.type.Event,eventId:Int):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.ElementResize")
class ElementResize extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _onInterval(e:qx.event.type.Data):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Focus")
class Focus extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _applyActive(value:any,old:any):Unit;
    protected _applyFocus(value:any,old:any):Unit;
    protected _initObserver():Unit;
    protected _stopObserver():Unit;
    activate(element:HTMLElement):Unit;
    blur(element:HTMLElement):Unit;
    deactivate(element:HTMLElement):Unit;
    focus(element:HTMLElement):Unit;
    getActive():any;
    getFocus():any;
    protected initActive(value:any):any;
    protected initFocus(value:any):any;
    resetActive():Unit;
    resetFocus():Unit;
    setActive(value:any):any;
    setFocus(value:any):any;
    tryActivate(element:HTMLElement):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Gesture")
class Gesture extends qx.event.handler.GestureCore implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.GestureCore")
class GestureCore extends js.Object {
    constructor (target?:HTMLElement,emitter?:qx.event.Emitter);
    protected _calcAngle():Long;
    protected _calcDistance():Long;
    protected _fireEvent(domEvent:qx.event.type.Event,type:String,target?:HTMLElement):Unit;
    protected _fireRoll(domEvent:qx.event.type.Event,type:String,target:HTMLElement):Unit;
    protected _getDeltaCoordinates(domEvent:qx.event.type.Event):IMap;
    protected _hasIntermediaryHandler(target:HTMLElement):Boolean;
    protected _initObserver():Unit;
    protected _isBelowTapMaxDistance(domEvent:qx.event.type.Event):Boolean;
    protected _onDblClick(domEvent:qx.event.type.Event):Unit;
    protected _stopObserver():Unit;
    checkAndFireGesture(domEvent:qx.event.type.Event,type?:String,target?:HTMLElement):Unit;
    dispose():Unit;
    gestureBegin(domEvent:qx.event.type.Event,target:HTMLElement):Unit;
    gestureCancel(id:Long):Unit;
    gestureFinish(domEvent:qx.event.type.Event,target:HTMLElement):Unit;
    gestureMove(domEvent:qx.event.type.Event,target:HTMLElement):Unit;
    isBelowTapMaxDistance(event:qx.event.type.Event):Boolean;
    stopMomentum(id:Int):Unit;
    updateGestureTarget(id:String,target:HTMLElement):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Iframe")
class Iframe extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    static onevent(target:HTMLElement):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Input")
class Input extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor ();
    protected _inputFix(e:qx.event.type.Event,target:HTMLElement):Unit;
    protected _onChangeChecked(e:qx.event.type.Event):Unit;
    protected _onChangeValue(e:qx.event.type.Event):Unit;
    protected _onInput(e:qx.event.type.Event):Unit;
    protected _onKeyDown(e:qx.event.type.Event):Unit;
    protected _onKeyPress(e:qx.event.type.Event,target:HTMLElement):Unit;
    protected _onKeyUp(e:qx.event.type.Event):Unit;
    protected _onProperty(e:qx.event.type.Event):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Keyboard")
class Keyboard extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    __onKeyUpDown(domEvent:qx.event.type.Event):Unit;
    protected _fireInputEvent(domEvent:qx.event.type.Event,charCode:Int):Unit;
    protected _fireSequenceEvent(domEvent:qx.event.type.Event,type:String,keyIdentifier:String):Unit;
    protected _idealKeyHandler(keyCode:String,charCode:String,eventType:String,domEvent:HTMLElement):Unit;
    protected _identifierToKeyCode(keyIdentifier:String):Int;
    protected _initKeyObserver():Unit;
    protected _stopKeyObserver():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Mouse")
class Mouse extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _initButtonObserver():Unit;
    protected _initMoveObserver():Unit;
    protected _initWheelObserver():Unit;
    protected _onButtonEvent(domEvent:qx.event.type.Event):Unit;
    protected _onMoveEvent(domEvent:qx.event.type.Event):Unit;
    protected _onWheelEvent(domEvent:qx.event.type.Event):Unit;
    protected _stopButtonObserver():Unit;
    protected _stopMoveObserver():Unit;
    protected _stopWheelObserver():Unit;
    preventNextClick():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Object")
class Object extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Offline")
class Offline extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _initObserver():Unit;
    protected _onNative(domEvent:qx.event.type.Event):Unit;
    protected _stopObserver():Unit;
    isOnline():Boolean;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Orientation")
class Orientation extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _initObserver():Unit;
    protected _onNative(domEvent:qx.event.type.Event):Unit;
    protected _onOrientationChange(domEvent:qx.event.type.Event):Unit;
    protected _stopObserver():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.OrientationCore")
class OrientationCore extends js.Object {
    constructor (targetWindow?:Window,emitter?:qx.event.Emitter);
    protected _initObserver():Unit;
    protected _onNative(domEvent:qx.event.type.Event):Unit;
    protected _stopObserver():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Pointer")
class Pointer extends qx.event.handler.PointerCore implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.PointerCore")
class PointerCore extends js.Object {
    constructor (target?:HTMLElement,emitter?:qx.event.Emitter);
    protected _determineActiveTouches(type:String,changedTouches:qx.data.Array):Unit;
    protected _fireEvent(domEvent:qx.event.type.Event,type?:String,target?:HTMLElement):Unit;
    protected _initObserver(callback:js.Function,useEmitter:Boolean):Unit;
    protected _initPointerObserver():Unit;
    protected _isSimulatedMouseEvent(x:Int,y:Int):Boolean;
    protected _onMouseEvent(domEvent:qx.event.type.Event):Unit;
    protected _onPointerEvent(domEvent:qx.event.type.Event):Unit;
    protected _onTouchEvent(domEvent:qx.event.type.Event):Unit;
    protected _stopObserver():Unit;
    dispose():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Touch")
class Touch extends qx.event.handler.TouchCore implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.TouchCore")
class TouchCore extends js.Object {
    constructor (target?:HTMLElement,emitter?:qx.event.Emitter);
    protected _calcSingleTouchDelta(touch:qx.event.type.Event):IMap;
    protected _calcTouchesDelta(touches:qx.data.Array):qx.data.Array;
    protected _commonTouchEventHandler(domEvent:qx.event.type.Event,type?:String):Unit;
    protected _detectTouchesByPointer(domEvent:qx.event.type.Event,type?:String):qx.data.Array;
    protected _fireEvent(domEvent:qx.event.type.Event,type?:String,target?:HTMLElement):Unit;
    protected _getRotationAngle(touch0:qx.event.type.Event,touch1:qx.event.type.Event):Long;
    protected _getScalingDistance(touch0:qx.event.type.Event,touch1:qx.event.type.Event):Long;
    protected _getTarget(domEvent:qx.event.type.Event):HTMLElement;
    protected _initTouchObserver():Unit;
    protected _mapPointerEvent(type:String):String;
    protected _onTouchEvent(domEvent:qx.event.type.Event):Unit;
    protected _stopTouchObserver():Unit;
    dispose():Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Transition")
class Transition extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _onNative(domEvent:qx.event.type.Event):Unit;

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.UserAction")
class UserAction extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Window")
class Window extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor (manager?:qx.event.Manager);
    protected _initWindowObserver():Unit;
    protected _onNative():Unit;
    protected _stopWindowObserver():Unit;

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Bus")
class Bus extends qx.core.Object {
    constructor ();
    static checkSubscription(message:String,subscriber:js.Function,context:any):Boolean;
    static dispatch(msg:qx.event.message.Message):Boolean;
    static dispatchByName(name:String,data:any):Boolean;
    static getInstance():qx.event.message.Bus;
    static getSubscriptions():IMap;
    static subscribe(message:String,subscriber:js.Function,context:any):Boolean;
    static unsubscribe(message:String,subscriber:js.Function,context:any):Boolean;

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Message")
class Message extends qx.core.Object {
    constructor (name?:String,data?:any);
    getData():any;
    getName():String;
    getSender():any;
    protected initData(value:any):any;
    protected initName(value:any):String;
    protected initSender(value:any):any;
    resetData():Unit;
    resetName():Unit;
    resetSender():Unit;
    setData(value:any):any;
    setName(value:any):String;
    setSender(value:any):any;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Data")
class Data extends qx.event.type.Event {
    getData():any;
    getOldData():any;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Dom")
class Dom extends qx.event.type.Native {
    getModifiers():Int;
    isAltPressed():Boolean;
    isCtrlOrCommandPressed():Boolean;
    isCtrlPressed():Boolean;
    isMetaPressed():Boolean;
    isShiftPressed():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Drag")
class Drag extends qx.event.type.Event {
    addAction(action:String):Unit;
    addData(type:String,data:any):Unit;
    addType(type:String):Unit;
    getCurrentAction():String;
    getCurrentType():String;
    getData(type:String):any;
    getDocumentLeft():Int;
    getDocumentTop():Int;
    getDragTarget():qx.ui.core.Widget;
    getManager():qx.event.handler.DragDrop;
    setDropAllowed(isAllowed:Boolean):Unit;
    stopSession():Unit;
    supportsAction(action:String):Boolean;
    supportsType(type:String):Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Event")
class Event extends qx.core.Object {
    getBubbles():Boolean;
    getCurrentTarget():HTMLElement;
    getDefaultPrevented():Boolean;
    getEventPhase():Int;
    getOriginalTarget():HTMLElement;
    getPropagationStopped():Boolean;
    getRelatedTarget():HTMLElement;
    getTarget():HTMLElement;
    getTimeStamp():Int;
    getType():String;
    init(canBubble?:Boolean,cancelable?:Boolean):qx.event.type.Event;
    isCancelable():Boolean;
    preventDefault():Unit;
    setBubbles(bubbles:Boolean):Unit;
    setCancelable(cancelable:Boolean):Unit;
    setCurrentTarget(currentTarget:HTMLElement):Unit;
    setEventPhase(eventPhase:Int):Unit;
    setOriginalTarget(originalTarget:HTMLElement):Unit;
    setRelatedTarget(relatedTarget:HTMLElement):Unit;
    setTarget(target:HTMLElement):Unit;
    setType(type:String):Unit;
    stop():Unit;
    stopPropagation():Unit;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Focus")
class Focus extends qx.event.type.Event {

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.GeoPosition")
class GeoPosition extends qx.event.type.Event {
    constructor ();
    getAccuracy():Long;
    getAltitude():Long;
    getAltitudeAccuracy():Long;
    getHeading():any;
    getLatitude():Long;
    getLongitude():Long;
    getSpeed():any;
    getTimestamp():Long;
    protected initAccuracy(value:any):Long;
    protected initAltitude(value:any):Long;
    protected initAltitudeAccuracy(value:any):Long;
    protected initHeading(value:any):any;
    protected initLatitude(value:any):Long;
    protected initLongitude(value:any):Long;
    protected initSpeed(value:any):any;
    protected initTimestamp(value:any):Long;
    resetAccuracy():Unit;
    resetAltitude():Unit;
    resetAltitudeAccuracy():Unit;
    resetHeading():Unit;
    resetLatitude():Unit;
    resetLongitude():Unit;
    resetSpeed():Unit;
    resetTimestamp():Unit;
    setAccuracy(value:any):Long;
    setAltitude(value:any):Long;
    setAltitudeAccuracy(value:any):Long;
    setHeading(value:any):any;
    setLatitude(value:any):Long;
    setLongitude(value:any):Long;
    setSpeed(value:any):any;
    setTimestamp(value:any):Long;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.KeyInput")
class KeyInput extends qx.event.type.Dom {
    getChar():String;
    getCharCode():Int;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.KeySequence")
class KeySequence extends qx.event.type.Dom {
    getKeyCode():Long;
    getKeyIdentifier():String;
    isPrintable():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Mouse")
class Mouse extends qx.event.type.Dom {
    getButton():String;
    getDocumentLeft():Int;
    getDocumentTop():Int;
    getScreenLeft():Int;
    getScreenTop():Int;
    getViewportLeft():Int;
    getViewportTop():Int;
    isLeftPressed():Boolean;
    isMiddlePressed():Boolean;
    isRightPressed():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.MouseWheel")
class MouseWheel extends qx.event.type.Mouse {
    getWheelDelta(axis?:String):Int;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Native")
class Native extends qx.event.type.Event {
    protected _cloneNativeEvent(nativeEvent:qx.event.type.Event,clone:any):any;
    getNativeEvent():qx.event.type.Event;
    getReturnValue():String;
    setReturnValue(returnValue?:String):Unit;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Orientation")
class Orientation extends qx.event.type.Event {
    getOrientation():Int;
    isLandscape():Boolean;
    isPortrait():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Pinch")
class Pinch extends qx.event.type.Pointer {
    getScale():Float;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Pointer")
class Pointer extends qx.event.type.Mouse {
    getHeight():Long;
    getPointerId():Long;
    getPointerType():String;
    getPressure():Long;
    getTiltX():Long;
    getTiltY():Long;
    getWidth():Long;
    isPrimary():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Rest")
class Rest extends qx.event.type.Data {
    getAction():String;
    getId():Long;
    getPhase():String;
    getRequest():qx.io.request.AbstractRequest;
    protected initAction(value:any):String;
    protected initId(value:any):Long;
    protected initPhase(value:any):String;
    protected initRequest(value:any):qx.io.request.AbstractRequest;
    resetAction():Unit;
    resetId():Unit;
    resetPhase():Unit;
    resetRequest():Unit;
    setAction(value:any):String;
    setId(value:any):Long;
    setPhase(value:any):String;
    setRequest(value:any):qx.io.request.AbstractRequest;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Roll")
class Roll extends qx.event.type.Pointer {
    getDelta():IMap;
    getMomentum():Boolean;
    stopMomentum():Unit;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Rotate")
class Rotate extends qx.event.type.Pointer {
    getAngle():Long;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Swipe")
class Swipe extends qx.event.type.Pointer {
    getAxis():String;
    getDirection():String;
    getDistance():Int;
    getDuration():Int;
    getStartTime():Int;
    getVelocity():Long;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Tap")
class Tap extends qx.event.type.Pointer {

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Touch")
class Touch extends qx.event.type.Dom {
    protected _isTouchEnd():Boolean;
    getAllTouches():any[];
    getChangedTargetTouches():any[];
    getDelta():qx.data.Array;
    getDocumentLeft(touchIndex?:Int):Int;
    getDocumentTop(touchIndex?:Int):Int;
    getIdentifier(touchIndex?:Int):Int;
    getRotation():Float;
    getScale():Float;
    getScreenLeft(touchIndex?:Int):Int;
    getScreenTop(touchIndex?:Int):Int;
    getTargetTouches():any[];
    getViewportLeft(touchIndex?:Int):Int;
    getViewportTop(touchIndex?:Int):Int;
    isMultiTouch():Boolean;

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Track")
class Track extends qx.event.type.Pointer {
    getDelta():IMap;

}
}
package qx.event.type.dom {
@js.native
@JSName("qx.event.type.dom.Custom")
class Custom extends js.Object {
    constructor (type?:String,domEvent?:qx.event.type.Event,customProps?:IMap);
    protected _createEvent():qx.event.type.Event;
    protected _initEvent(domEvent:qx.event.type.Event,customProps?:IMap):Unit;

}
}
package qx.event.type.dom {
@js.native
@JSName("qx.event.type.dom.Pointer")
class Pointer extends qx.event.type.dom.Custom {
    constructor (type?:any,domEvent?:any,customProps?:any);
    static getDocumentLeft():Long;
    static getDocumentTop():Long;
    static getPointerType():String;
    static getScreenLeft():Long;
    static getScreenTop():Long;
    static getViewportLeft():Long;
    static getViewportTop():Long;
    static normalize(event:qx.event.type.Event):Unit;

}
}
package qx.event.util {
@js.native
@JSName("qx.event.util.Keyboard")
class Keyboard extends js.Object {
    static charCodeToIdentifier(charCode:String):String;
    static isIdentifiableKeyCode(keyCode:String):Boolean;
    static isNonPrintableKeyCode(keyCode:String):Boolean;
    static isPrintableKeyIdentifier(keyIdentifier:String):Boolean;
    static isValidKeyIdentifier(keyIdentifier:String):Boolean;
    static keyCodeToIdentifier(keyCode:Int):String;

}
}
package qx.html {
@js.native
@JSName("qx.html.Blocker")
class Blocker extends qx.html.Element {
    constructor (backgroundColor?:String,opacity?:Long);
    protected _stopPropagation(e:qx.event.type.Mouse):Unit;

}
}
package qx.html {
@js.native
@JSName("qx.html.Canvas")
class Canvas extends qx.html.Element {
    constructor (styles?:IMap,attributes?:IMap);
    getCanvas():HTMLElement;
    getContext2d():CanvasRenderingContext2D;
    getHeight():Int;
    getWidth():Int;
    setHeight(height:Int):Unit;
    setWidth(width:Int):Unit;

}
}
package qx.html {
@js.native
@JSName("qx.html.Element")
class Element extends qx.core.Object {
    constructor (tagName?:String,styles?:IMap,attributes?:IMap);
    protected static _scheduleFlush(job:String):Unit;
    static flush():Unit;
    protected _applyProperty(name:String,value:any):qx.html.Element;
    protected _copyData(fromMarkup:Boolean):Unit;
    protected _createDomElement():HTMLElement;
    protected _getProperty(key:String):any;
    protected _insertChildren():Unit;
    protected _removeProperty(key:String,direct?:Boolean):qx.html.Element;
    protected _scheduleChildrenUpdate():Unit;
    protected _setProperty(key:String,value:any,direct?:Boolean):qx.html.Element;
    protected _syncChildren():Unit;
    protected _syncData():Unit;
    activate():Unit;
    add(varargs?:qx.html.Element):qx.html.Element;
    addAt(child:qx.html.Element,index:Int):qx.html.Element;
    addClass(name:String):Unit;
    addListener(type:String,listener:js.Function,self?:any,capture?:Boolean):any;
    blur():Unit;
    capture(containerCapture?:Boolean):Unit;
    clearTextSelection():Unit;
    deactivate():Unit;
    disableScrolling():Unit;
    enableScrolling():Unit;
    exclude():qx.html.Element;
    fadeIn(duration:Long):qx.bom.element.AnimationHandle;
    fadeOut(duration:Long):qx.bom.element.AnimationHandle;
    focus():Unit;
    free():qx.html.Element;
    getAllStyles():IMap;
    getAttribute(key:String):any;
    getChild(index:Int):qx.html.Element;
    getChildren():qx.data.Array;
    getDomElement():HTMLElement;
    getListeners():IMap[];
    getNodeName():String;
    getParent():qx.html.Element;
    getScrollX():Int;
    getScrollY():Int;
    getStyle(key:String):any;
    getTextSelection():String;
    getTextSelectionEnd():Int;
    getTextSelectionLength():Int;
    getTextSelectionStart():Int;
    hasChild(child:qx.html.Element):Boolean;
    hasChildren():Boolean;
    hasListener(type:String,capture?:Boolean):Boolean;
    hide():qx.html.Element;
    include():qx.html.Element;
    indexOf(child:qx.html.Element):Int;
    insertAfter(rel:qx.html.Element):qx.html.Element;
    insertBefore(rel:qx.html.Element):qx.html.Element;
    insertInto(parent:qx.html.Element,index?:Int):qx.html.Element;
    isFocusable():Boolean;
    isIncluded():Boolean;
    isNativelyFocusable():Boolean;
    isVisible():Boolean;
    moveAfter(rel:qx.html.Element):qx.html.Element;
    moveBefore(rel:qx.html.Element):qx.html.Element;
    moveTo(index:Int):qx.html.Element;
    releaseCapture():Unit;
    remove(childs:qx.html.Element):qx.html.Element;
    removeAll():qx.html.Element;
    removeAt(index:Int):qx.html.Element;
    removeAttribute(key:String,direct?:Boolean):qx.html.Element;
    removeClass(name:String):Unit;
    removeListener(type:String,listener:js.Function,self:any,capture?:Boolean):qx.html.Element;
    removeListenerById(id:any):qx.html.Element;
    removeStyle(key:String,direct?:Boolean):qx.html.Element;
    scrollChildIntoViewX(elem:qx.html.Element,align?:String,direct?:Boolean):Unit;
    scrollChildIntoViewY(elem:qx.html.Element,align?:String,direct?:Boolean):Unit;
    scrollToX(x:Int,lazy?:Boolean):Unit;
    scrollToY(y:Int,lazy?:Boolean):Unit;
    setAttribute(key:String,value:any,direct?:Boolean):qx.html.Element;
    setAttributes(map:IMap,direct?:Boolean):qx.html.Element;
    setNodeName(name:String):Unit;
    setRoot(root:Boolean):Unit;
    setSelectable(value:Boolean):Unit;
    setStyle(key:String,value:any,direct?:Boolean):qx.html.Element;
    setStyles(map:IMap,direct?:Boolean):qx.html.Element;
    setTextSelection(start:Int,end:Int):Unit;
    show():qx.html.Element;
    useElement(elem:HTMLElement):Unit;
    useMarkup(html:String):HTMLElement;

}
}
package qx.html {
@js.native
@JSName("qx.html.Flash")
class Flash extends qx.html.Element {
    constructor (styles?:IMap,attributes?:IMap);
    createFlash():Unit;
    getAttributes():IMap;
    getFlashElement():HTMLElement;
    getParams():IMap;
    getVariables():IMap;
    setId(value:String):Unit;
    setParam(key:String,value:String):Unit;
    setSource(value:String):Unit;
    setVariables(value:IMap):Unit;

}
}
package qx.html {
@js.native
@JSName("qx.html.Iframe")
class Iframe extends qx.html.Element {
    constructor (url?:String,styles?:IMap,attributes?:IMap);
    getBody():HTMLElement;
    getDocument():Document;
    getName():String;
    getSource():String;
    getWindow():Window;
    reload():Unit;
    setName(name:String):qx.html.Iframe;
    setSource(source:String):qx.html.Iframe;

}
}
package qx.html {
@js.native
@JSName("qx.html.Image")
class Image extends qx.html.Element {
    getScale():Boolean;
    getSource():String;
    resetSource():qx.html.Image;
    setPadding(paddingLeft:Int,paddingTop:Int):Unit;
    setScale(value:Boolean):qx.html.Label;
    setSource(value:Boolean):qx.html.Label;

}
}
package qx.html {
@js.native
@JSName("qx.html.Input")
class Input extends qx.html.Element {
    constructor (type?:String,styles?:IMap,attributes?:IMap);
    getValue():String;
    getWrap():Boolean;
    setEnabled(value:Boolean):Unit;
    setValue(value:any):qx.html.Input;
    setWrap(wrap:Boolean,direct?:Boolean):qx.html.Input;

}
}
package qx.html {
@js.native
@JSName("qx.html.Label")
class Label extends qx.html.Element {
    getValue():String;
    setRich(value:Boolean):qx.html.Label;
    setValue(value:String):qx.html.Label;

}
}
package qx.html {
@js.native
@JSName("qx.html.Root")
class Root extends qx.html.Element {
    constructor (elem?:HTMLElement);

}
}
package qx.io {
@js.native
@JSName("qx.io.ImageLoader")
class ImageLoader extends js.Object {
    static abort(source:String):Unit;
    static dispose():Unit;
    static getFormat(source:String):String;
    static getHeight(source:String):Int;
    static getSize(source:String):IMap;
    static getWidth(source:String):Int;
    static isFailed(source:String):Boolean;
    static isLoaded(source:String):Boolean;
    static isLoading(source:String):Boolean;
    static load(source:String,callback?:js.Function,context?:any):Unit;

}
}
package qx.io {
@js.native
@JSName("qx.io.PartLoader")
class PartLoader extends qx.core.Object {
    constructor ();
    static getInstance():qx.io.PartLoader;
    static require(partNames:String[],callback:js.Function,self?:any):Unit;
    getPart(name:String):qx.io.part.Part;
    getParts():IMap;
    hasPart(name:String):Boolean;

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.ClosurePart")
class ClosurePart extends qx.io.part.Part {
    constructor (name?:String,packages?:any[],loader?:qx.Part);
    protected _onPackageLoad(pkg:qx.io.part.Package):Unit;

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Package")
class Package extends js.Object {
    constructor (urls?:String[],id?:any,loaded?:Boolean);
    execute():Unit;
    getId():String;
    getReadyState():String;
    getUrls():String[];
    load(notifyPackageResult:js.Function,self?:any):Unit;
    loadClosure(notifyPackageResult:js.Function,self?:any):Unit;
    saveClosure(closure:js.Function):Unit;

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Part")
class Part extends js.Object {
    constructor (name?:String,packages?:any[],loader?:qx.Part);
    protected _appendPartListener(callback:js.Function,self?:any,part?:qx.io.part.Part):Unit;
    protected _checkCompleteLoading(callback:js.Function,self:any):Boolean;
    protected _markAsCompleted(readyState:String):Unit;
    protected _signalStartup():Unit;
    getName():String;
    getPackages():qx.io.part.Package[];
    getReadyState():String;
    load(callback:js.Function,self?:any):Unit;
    preload(callback:js.Function,self?:any):Unit;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Exchange")
class Exchange extends qx.core.Object {
    constructor (vRequest?:qx.io.remote.Request);
    static canHandle(vImpl:any,vNeeds:IMap,vResponseType:String):Boolean;
    static initTypes():Unit;
    static registerType(vClass:any,vId:String):Unit;
    static statusCodeToString(vStatusCode:Int):String;
    static wasSuccessful(vStatusCode:Int,vReadyState:String,vIsLocal:Boolean):Boolean;
    protected _applyImplementation(value:any,old:any):Unit;
    protected _applyState(value:any,old:any):Unit;
    protected _onabort(e:qx.event.type.Event):Unit;
    protected _oncompleted(e:qx.event.type.Event):Unit;
    protected _onfailed(e:qx.event.type.Event):Unit;
    protected _onreceiving(e:qx.event.type.Event):Unit;
    protected _onsending(e:qx.event.type.Event):Unit;
    protected _ontimeout(e:qx.event.type.Event):Unit;
    abort():Unit;
    getImplementation():qx.io.remote.transport.Abstract;
    getRequest():qx.io.remote.Request;
    getState():any;
    protected initImplementation(value:any):qx.io.remote.transport.Abstract;
    protected initRequest(value:any):qx.io.remote.Request;
    protected initState(value:any):any;
    resetImplementation():Unit;
    resetRequest():Unit;
    resetState():Unit;
    send():any;
    setImplementation(value:any):qx.io.remote.transport.Abstract;
    setRequest(value:any):qx.io.remote.Request;
    setState(value:any):any;
    timeout():Unit;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Request")
class Request extends qx.core.Object {
    constructor (vUrl?:String,vMethod?:String,vResponseType?:String);
    static methodAllowsRequestBody(httpMethod:String):Boolean;
    protected _applyMethod(value:any,old:any):Unit;
    protected _applyProhibitCaching(value:any,old:any):Unit;
    protected _applyResponseType(value:any,old:any):Unit;
    protected _applyState(value:any,old:any):Unit;
    protected _onaborted(e:qx.event.type.Event):Unit;
    protected _oncompleted(e:qx.event.type.Event):Unit;
    protected _onfailed(e:qx.event.type.Event):Unit;
    protected _onqueued(e:qx.event.type.Event):Unit;
    protected _onreceiving(e:qx.event.type.Event):Unit;
    protected _onsending(e:qx.event.type.Event):Unit;
    protected _ontimeout(e:qx.event.type.Event):Unit;
    abort():Unit;
    getAsynchronous():Boolean;
    getCrossDomain():Boolean;
    getData():String;
    getFileUpload():Boolean;
    getFormField(vId:String):String;
    getFormFields():any;
    getMethod():any;
    getParameter(vId:String,bFromData:Boolean):any;
    getParameters(bFromData:Boolean):any;
    getParseJson():Boolean;
    getPassword():String;
    getProhibitCaching():any;
    getRequestHeader(vId:String):String;
    getRequestHeaders():any;
    getResponseType():any;
    getSequenceNumber():Int;
    getState():any;
    getTimeout():Int;
    getTransport():qx.io.remote.Exchange;
    getUrl():String;
    getUseBasicHttpAuth():Boolean;
    getUsername():String;
    protected initAsynchronous(value:any):Boolean;
    protected initCrossDomain(value:any):Boolean;
    protected initData(value:any):String;
    protected initFileUpload(value:any):Boolean;
    protected initMethod(value:any):any;
    protected initParseJson(value:any):Boolean;
    protected initPassword(value:any):String;
    protected initProhibitCaching(value:any):any;
    protected initResponseType(value:any):any;
    protected initState(value:any):any;
    protected initTimeout(value:any):Int;
    protected initTransport(value:any):qx.io.remote.Exchange;
    protected initUrl(value:any):String;
    protected initUseBasicHttpAuth(value:any):Boolean;
    protected initUsername(value:any):String;
    isAborted():Boolean;
    isAsynchronous():Boolean;
    isCompleted():Boolean;
    isConfigured():Boolean;
    isCrossDomain():Boolean;
    isFailed():Boolean;
    isFileUpload():Boolean;
    isParseJson():Boolean;
    isQueued():Boolean;
    isReceiving():Boolean;
    isSending():Boolean;
    isTimeout():Boolean;
    isUseBasicHttpAuth():Boolean;
    removeFormField(vId:String):Unit;
    removeParameter(vId:String,bFromData:Boolean):Unit;
    removeRequestHeader(vId:String):Unit;
    reset():Unit;
    resetAsynchronous():Unit;
    resetCrossDomain():Unit;
    resetData():Unit;
    resetFileUpload():Unit;
    resetMethod():Unit;
    resetParseJson():Unit;
    resetPassword():Unit;
    resetProhibitCaching():Unit;
    resetResponseType():Unit;
    resetState():Unit;
    resetTimeout():Unit;
    resetTransport():Unit;
    resetUrl():Unit;
    resetUseBasicHttpAuth():Unit;
    resetUsername():Unit;
    send():Unit;
    setAsynchronous(value:any):Boolean;
    setCrossDomain(value:any):Boolean;
    setData(value:any):String;
    setFileUpload(value:any):Boolean;
    setFormField(vId:String,vValue:String):Unit;
    setMethod(value:any):any;
    setParameter(vId:String,vValue:any,bAsData:Boolean):Unit;
    setParseJson(value:any):Boolean;
    setPassword(value:any):String;
    setProhibitCaching(value:any):any;
    setRequestHeader(vId:String,vValue:String):Unit;
    setResponseType(value:any):any;
    setState(value:any):any;
    setTimeout(value:any):Int;
    setTransport(value:any):qx.io.remote.Exchange;
    setUrl(value:any):String;
    setUseBasicHttpAuth(value:any):Boolean;
    setUsername(value:any):String;
    toggleAsynchronous():Boolean;
    toggleCrossDomain():Boolean;
    toggleFileUpload():Boolean;
    toggleParseJson():Boolean;
    toggleUseBasicHttpAuth():Boolean;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.RequestQueue")
class RequestQueue extends qx.core.Object {
    constructor ();
    static getInstance():qx.io.remote.RequestQueue;
    protected _applyEnabled(value:Boolean,old:Boolean):Unit;
    protected _check():Unit;
    protected _debug():Unit;
    protected _oncompleted(e:qx.event.type.Event):Unit;
    protected _oninterval(e:qx.event.type.Event):Unit;
    protected _onreceiving(e:qx.event.type.Event):Unit;
    protected _onsending(e:qx.event.type.Event):Unit;
    protected _remove(vTransport:qx.io.remote.Exchange):Unit;
    abort(vRequest:any):Unit;
    add(vRequest:any):Unit;
    getActiveQueue():any[];
    getDefaultTimeout():Int;
    getEnabled():Boolean;
    getMaxConcurrentRequests():Int;
    getMaxTotalRequests():Int;
    getRequestQueue():any[];
    protected initDefaultTimeout(value:any):Int;
    protected initEnabled(value:any):Boolean;
    protected initMaxConcurrentRequests(value:any):Int;
    protected initMaxTotalRequests(value:any):Int;
    isEnabled():Boolean;
    resetDefaultTimeout():Unit;
    resetEnabled():Unit;
    resetMaxConcurrentRequests():Unit;
    resetMaxTotalRequests():Unit;
    setDefaultTimeout(value:any):Int;
    setEnabled(value:any):Boolean;
    setMaxConcurrentRequests(value:any):Int;
    setMaxTotalRequests(value:any):Int;
    toggleEnabled():Boolean;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Response")
class Response extends qx.event.type.Event {
    protected _applyResponseHeaders(value:any,old:any):Unit;
    getContent():any;
    getResponseHeader(vHeader:String):any;
    getResponseHeaders():any;
    getState():Int;
    getStatusCode():Int;
    protected initContent(value:any):any;
    protected initResponseHeaders(value:any):any;
    protected initState(value:any):Int;
    protected initStatusCode(value:any):Int;
    resetContent():Unit;
    resetResponseHeaders():Unit;
    resetState():Unit;
    resetStatusCode():Unit;
    setContent(value:any):any;
    setResponseHeaders(value:any):any;
    setState(value:any):Int;
    setStatusCode(value:any):Int;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Rpc")
class Rpc extends qx.core.Object {
    constructor (url?:String,serviceName?:String);
    static makeServerURL(instanceId?:String):String;
    protected _callInternal(args:qx.data.Array,callType:Int,refreshSession:Boolean):any;
    protected _isConvertDates():Boolean;
    protected _isResponseJson():Boolean;
    abort(opaqueCallRef:any):Unit;
    callAsync(handler:js.Function,methodName:String):any;
    callAsyncListeners(coalesce:Boolean,methodName:String):any;
    callSync(methodName:String):any;
    createRequest():qx.io.remote.Request;
    createRpcData(id:Int,method:String,parameters:qx.data.Array,serverData:any):any;
    fixUrl(url:String):String;
    getCrossDomain():Boolean;
    getPassword():String;
    getProtocol():any;
    getServerData():any;
    getServiceName():String;
    getTimeout():Int;
    getUrl():String;
    getUseBasicHttpAuth():Boolean;
    getUsername():String;
    protected initCrossDomain(value:any):Boolean;
    protected initPassword(value:any):String;
    protected initProtocol(value:any):any;
    protected initServerData(value:any):any;
    protected initServiceName(value:any):String;
    protected initTimeout(value:any):Int;
    protected initUrl(value:any):String;
    protected initUseBasicHttpAuth(value:any):Boolean;
    protected initUsername(value:any):String;
    isCrossDomain():Boolean;
    isUseBasicHttpAuth():Boolean;
    refreshSession(handler:js.Function):Unit;
    resetCrossDomain():Unit;
    resetPassword():Unit;
    resetProtocol():Unit;
    resetServerData():Unit;
    resetServiceName():Unit;
    resetTimeout():Unit;
    resetUrl():Unit;
    resetUseBasicHttpAuth():Unit;
    resetUsername():Unit;
    setCrossDomain(value:any):Boolean;
    setPassword(value:any):String;
    setProtocol(value:any):any;
    setServerData(value:any):any;
    setServiceName(value:any):String;
    setTimeout(value:any):Int;
    setUrl(value:any):String;
    setUseBasicHttpAuth(value:any):Boolean;
    setUsername(value:any):String;
    toggleCrossDomain():Boolean;
    toggleUseBasicHttpAuth():Boolean;

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.RpcError")
class RpcError extends js.Object {

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Abstract")
class Abstract extends qx.core.Object {
    constructor ();
    protected _applyState(value:any,old:any):Unit;
    abort():Unit;
    failed():Unit;
    getAsynchronous():Boolean;
    getData():String;
    getFetchedLength():Int;
    getFormFields():any;
    getMethod():String;
    getParameters():any;
    getPassword():String;
    getRequestHeaders():any;
    getResponseHeader(vLabel:String):any;
    getResponseHeaders():any;
    getResponseText():String;
    getResponseType():String;
    getResponseXml():any;
    getState():any;
    getStatusCode():Int;
    getStatusText():String;
    getUrl():String;
    getUseBasicHttpAuth():Boolean;
    getUsername():String;
    protected initAsynchronous(value:any):Boolean;
    protected initData(value:any):String;
    protected initFormFields(value:any):any;
    protected initMethod(value:any):String;
    protected initParameters(value:any):any;
    protected initPassword(value:any):String;
    protected initRequestHeaders(value:any):any;
    protected initResponseType(value:any):String;
    protected initState(value:any):any;
    protected initUrl(value:any):String;
    protected initUseBasicHttpAuth(value:any):Boolean;
    protected initUsername(value:any):String;
    isAsynchronous():Boolean;
    isUseBasicHttpAuth():Boolean;
    resetAsynchronous():Unit;
    resetData():Unit;
    resetFormFields():Unit;
    resetMethod():Unit;
    resetParameters():Unit;
    resetPassword():Unit;
    resetRequestHeaders():Unit;
    resetResponseType():Unit;
    resetState():Unit;
    resetUrl():Unit;
    resetUseBasicHttpAuth():Unit;
    resetUsername():Unit;
    send():Unit;
    setAsynchronous(value:any):Boolean;
    setData(value:any):String;
    setFormFields(value:any):any;
    setMethod(value:any):String;
    setParameters(value:any):any;
    setPassword(value:any):String;
    setRequestHeader(vLabel:String,vValue:any):Unit;
    setRequestHeaders(value:any):any;
    setResponseType(value:any):String;
    setState(value:any):any;
    setUrl(value:any):String;
    setUseBasicHttpAuth(value:any):Boolean;
    setUsername(value:any):String;
    timeout():Unit;
    toggleAsynchronous():Boolean;
    toggleUseBasicHttpAuth():Boolean;

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Iframe")
class Iframe extends qx.io.remote.transport.Abstract {
    constructor ();
    static isSupported():Boolean;
    protected _onload(e:qx.event.type.Event):Unit;
    protected _onreadystatechange(e:qx.event.type.Event):Unit;
    protected _switchReadyState(vReadyState:String):Unit;
    getIframeBody():any;
    getIframeDocument():any;
    getIframeHtmlContent():String;
    getIframeTextContent():String;
    getIframeWindow():any;
    getResponseContent():any;

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Script")
class Script extends qx.io.remote.transport.Abstract {
    constructor ();
    protected static _requestFinished(id:String,content:String):Unit;
    static isSupported():Boolean;
    protected _switchReadyState(vReadyState:String):Unit;
    getResponseContent():any;

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
class XmlHttp extends qx.io.remote.transport.Abstract {
    static createRequestObject():any;
    static isSupported():Boolean;
    protected _onreadystatechange(e:qx.event.type.Event):Unit;
    failedLocally():Unit;
    getParseJson():Boolean;
    getReadyState():Int;
    getRequest():any;
    getResponseContent():any;
    getStringResponseHeaders():any;
    protected initParseJson(value:any):Boolean;
    isParseJson():Boolean;
    resetParseJson():Unit;
    setParseJson(value:any):Boolean;
    toggleParseJson():Boolean;

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.AbstractRequest")
class AbstractRequest extends qx.core.Object {
    constructor (url?:String);
    protected _createTransport():qx.bom.request;
    protected _fireStatefulEvent(evt:String):Unit;
    protected _getAllRequestHeaders():IMap;
    protected _getConfiguredRequestHeaders():IMap;
    protected _getConfiguredUrl():String;
    protected _getMethod():String;
    protected _getParsedResponse():String;
    protected _isAsync():Boolean;
    protected _onAbort():Unit;
    protected _onError():Unit;
    protected _onLoad():Unit;
    protected _onLoadEnd():Unit;
    protected _onReadyStateChange():Unit;
    protected _onTimeout():Unit;
    protected _serializeData(data:String):String;
    protected _setPhase(phase:String):Unit;
    protected _setRequestHeaders():Unit;
    protected _setResponse(response:String):Unit;
    abort():Unit;
    getAllResponseHeaders():String;
    getAuthentication():qx.io.request.authentication.IAuthentication;
    getPhase():String;
    getReadyState():Long;
    getRequestData():any;
    getRequestHeader(key:String):String;
    getResponse():String;
    getResponseContentType():String;
    getResponseHeader(key:String):String;
    getResponseText():String;
    getStatus():Long;
    getStatusText():String;
    getTimeout():Long;
    getTransport():any;
    getUrl():String;
    protected initAuthentication(value:any):qx.io.request.authentication.IAuthentication;
    protected initRequestData(value:any):any;
    protected initTimeout(value:any):Long;
    protected initUrl(value:any):String;
    isDone():Unit;
    overrideResponseContentType(contentType:String):Unit;
    removeRequestHeader(key:String):Unit;
    resetAuthentication():Unit;
    resetRequestData():Unit;
    resetTimeout():Unit;
    resetUrl():Unit;
    send():Unit;
    setAuthentication(value:any):qx.io.request.authentication.IAuthentication;
    setRequestData(value:any):any;
    setRequestHeader(key:String,value:String):Unit;
    setTimeout(value:any):Long;
    setUrl(value:any):String;

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Jsonp")
class Jsonp extends qx.io.request.AbstractRequest {
    getCache():Boolean;
    protected initCache(value:any):Boolean;
    isCache():Boolean;
    resetCache():Unit;
    setCache(value:any):Boolean;
    setCallbackName(name:String):Unit;
    setCallbackParam(param:String):Unit;
    toggleCache():Boolean;

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Xhr")
class Xhr extends qx.io.request.AbstractRequest {
    constructor (url?:String,method?:String);
    protected _createResponseParser():qx.util.ResponseParser;
    getAccept():String;
    getAsync():Boolean;
    getCache():any;
    getMethod():any;
    protected initAccept(value:any):String;
    protected initAsync(value:any):Boolean;
    protected initCache(value:any):any;
    protected initMethod(value:any):any;
    isAsync():Boolean;
    resetAccept():Unit;
    resetAsync():Unit;
    resetCache():Unit;
    resetMethod():Unit;
    setAccept(value:any):String;
    setAsync(value:any):Boolean;
    setCache(value:any):any;
    setMethod(value:any):any;
    setParser(parser:String):js.Function;
    toggleAsync():Boolean;

}
}
package qx.io.request.authentication {
@js.native
@JSName("qx.io.request.authentication.Basic")
class Basic extends qx.core.Object implements qx.io.request.authentication.IAuthentication {
    getAuthHeaders():IMap[];
    constructor (username?:any,password?:any);

}
}
package qx.io.request.authentication {
@js.native
trait IAuthentication extends js.Object {
    getAuthHeaders():IMap[];

}
}
package qx.io.rest {
@js.native
@JSName("qx.io.rest.Resource")
class Resource extends qx.core.Object {
    constructor (description?:IMap);
    static placeholdersFromUrl(url:String):qx.data.Array;
    protected _getRequest():qx.io.request.Xhr;
    protected _getRequestConfig(action:String,params:IMap):IMap;
    protected _getResource(description?:IMap):qx.bom.rest.Resource;
    protected _getThrottleCount():Int;
    protected _getThrottleLimit():Int;
    protected _tailorResource(resource:qx.bom.rest.Resource):qx.bom.rest.Resource;
    abort(varargs?:String):Unit;
    configureRequest(callback:js.Function):Unit;
    invoke(action:String,params:IMap,data:IMap):Long;
    longPoll(action:String):String;
    map(action:String,method:String,url:String,check?:IMap):Unit;
    poll(action:String,interval:Long,params?:IMap,immediately?:Boolean):qx.event.Timer;
    refresh(action:String):Unit;
    setBaseUrl(baseUrl:String):Unit;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Array")
class Array extends js.Object {
    static append(arr1:qx.data.Array,arr2:qx.data.Array):qx.data.Array;
    static cast(object:any,constructor:js.Function,offset?:Int):qx.data.Array;
    static clone(arr:qx.data.Array):qx.data.Array;
    static contains(arr:qx.data.Array,obj:any):Boolean;
    static equals(arr1:qx.data.Array,arr2:qx.data.Array):Boolean;
    static exclude(arr1:qx.data.Array,arr2:qx.data.Array):qx.data.Array;
    static fromArguments(args:any,offset?:Int):qx.data.Array;
    static fromCollection(coll:any):qx.data.Array;
    static fromShortHand(input:qx.data.Array):qx.data.Array;
    static insertAfter(arr:qx.data.Array,obj:any,obj2:any):qx.data.Array;
    static insertAt(arr:qx.data.Array,obj:any,i:Int):qx.data.Array;
    static insertBefore(arr:qx.data.Array,obj:any,obj2:any):qx.data.Array;
    static max(arr:Long[]):Long;
    static min(arr:Long[]):Long;
    static range(start:Int,stop:Int,step:Int):qx.data.Array;
    static remove(arr:qx.data.Array,obj:any):any;
    static removeAll(arr:qx.data.Array):qx.data.Array;
    static removeAt(arr:qx.data.Array,i:Int):any;
    static sum(arr:Long[]):Long;
    static unique(arr:qx.data.Array):qx.data.Array;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Function")
class Function extends js.Object {
    static attempt(func:js.Function,self?:any,varargs?:any):Boolean;
    static bind(func:js.Function,self?:any,varargs?:any):js.Function;
    static create(func:js.Function,options?:IMap):js.Function;
    static curry(func:js.Function,varargs?:any):any;
    static delay(func:js.Function,delay:Int,self?:any,varargs?:any):Int;
    static getCaller(args:any):js.Function;
    static getName(fcn:js.Function):String;
    static globalEval(data:String):any;
    static listener(func:js.Function,self?:any,varargs?:any):any;
    static periodical(func:js.Function,interval:Int,self?:any,varargs?:any):Int;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Json")
class Json extends js.Object {
    static parse(text:String,reviver?:js.Function):any;
    static stringify(value:any,replacer?:js.Function,space?:String):String;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Number")
class Number extends js.Object {
    static isBetweenRange(nr:Long,vmin:Int,vmax:Int):Boolean;
    static isInRange(nr:Long,vmin:Int,vmax:Int):Boolean;
    static limit(nr:Long,vmin:Int,vmax:Int):Int;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Object")
class Object extends js.Object {
    static clone(source:any,deep:Boolean):any;
    static contains(map:any,value:any):Boolean;
    static empty(map:any):Unit;
    static equals(object1:any,object2:any):Boolean;
    static fromArray(array:qx.data.Array):IMap;
    static getKeyFromValue(map:any,value:any):String;
    static getLength(map:any):Int;
    static getValues(map:any):qx.data.Array;
    static invert(map:any):any;
    static isEmpty(map:any):Boolean;
    static mergeWith(target:any,source:any,overwrite?:Boolean):any;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.String")
class String extends js.Object {
    static camelCase(str:String):String;
    static capitalize(str:String):String;
    static clean(str:String):String;
    static contains(str:String,substring:String):Boolean;
    static endsWith(fullstr:String,substr:String):Boolean;
    static escapeRegexpChars(str:String):String;
    static firstLow(str:String):String;
    static firstUp(str:String):String;
    static format(pattern:String,args:qx.data.Array):String;
    static hyphenate(str:String):String;
    static pad(str:String,length:Int,ch:String):String;
    static quote(str:String):String;
    static repeat(str:String,times:Int):String;
    static startsWith(fullstr:String,substr:String):Boolean;
    static stripScripts(str:String,exec?:Boolean):String;
    static stripTags(str:String):String;
    static toArray(str:String):qx.data.Array;
    static trimLeft(str:String):String;
    static trimRight(str:String):String;

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Type")
class Type extends js.Object {
    static getClass(value:any):String;
    static isArray(value:any):Boolean;
    static isBoolean(value:any):Boolean;
    static isDate(value:any):Boolean;
    static isError(value:any):Boolean;
    static isFunction(value:any):Boolean;
    static isNumber(value:any):Boolean;
    static isObject(value:any):Boolean;
    static isRegExp(value:any):Boolean;
    static isString(value:any):Boolean;

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Array")
class Array extends js.Object {
    static every(callback:js.Function,obj?:any):qx.data.Array;
    static filter(callback:js.Function,obj?:any):qx.data.Array;
    static forEach(callback:js.Function,obj?:any):Unit;
    static indexOf(searchElement:any,fromIndex?:Int):Int;
    static lastIndexOf(searchElement:any,fromIndex?:Int):Int;
    static map(callback:js.Function,obj?:any):qx.data.Array;
    static reduce(callback:js.Function,init?:any):any;
    static reduceRight(callback:js.Function,init?:any):any;
    static some(callback:js.Function,obj?:any):qx.data.Array;

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Date")
class Date extends js.Object {
    static now():Int;

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Error")
class Error extends js.Object {

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Function")
class Function extends js.Object {
    static bind(that?:any):js.Function;

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Object")
class Object extends js.Object {
    static keys(map:any):qx.data.Array;

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.String")
class String extends js.Object {
    static trim():String;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Date")
class Date extends js.Object {
    protected static _getTerritory(locale:String):String;
    static getAmMarker(locale:String):String;
    static getDateFormat(size:String,locale?:String):String;
    static getDateTimeFormat(canonical:String,fallback:String,locale:String):String;
    static getDayName(length:String,day:Int,locale:String,context:String,withFallback?:Boolean):String;
    static getDayNames(length:String,locale:String,context:String,withFallback?:Boolean):String[];
    static getMonthName(length:String,month:Int,locale:String,context:String,withFallback?:Boolean):String;
    static getMonthNames(length:String,locale:String,context:String,withFallback?:Boolean):String[];
    static getPmMarker(locale:String):String;
    static getTimeFormat(size:String,locale:String):String;
    static getWeekendEnd(locale:String):Int;
    static getWeekendStart(locale:String):Int;
    static getWeekStart(locale:String):Int;
    static isWeekend(day:Int,locale:String):Boolean;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Key")
class Key extends js.Object {
    static getKeyName(size:String,keyIdentifier:String,locale:String):String;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.LocalizedString")
class LocalizedString extends qx.type.BaseString {
    constructor (translation?:String,messageId?:String,args?:qx.data.Array);
    getMessageId():String;
    translate():qx.locale.LocalizedString;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.MTranslation")
class MTranslation extends js.Object {
    marktr(messageId:String):String;
    tr(messageId:String,varargs?:any):String;
    trc(hint:String,messageId:String,varargs?:any):String;
    trn(singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    trnc(hint:String,singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static getInstance():qx.locale.Manager;
    static marktr(messageId:String):String;
    static tr(messageId:String,varargs?:any):String;
    static trc(hint:String,messageId:String,varargs?:any):String;
    static trn(singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    static trnc(hint:String,singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    protected _applyLocale(value:String,old:String):Unit;
    addLocale(localeCode:String,localeMap:IMap):Unit;
    addTranslation(languageCode:String,translationMap:IMap):Unit;
    getAvailableLocales(includeNonloaded?:Boolean):String[];
    getLanguage():String;
    getLocale():String;
    getTerritory():String;
    protected initLocale(value:any):String;
    localize(messageId:String,args:any[],locale?:String):String;
    resetLocale():Unit;
    setLocale(value:any):String;
    translate(messageId:String,args:any[],locale?:String):String;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Number")
class Number extends js.Object {
    static getDecimalSeparator(locale:String):String;
    static getGroupSeparator(locale:String):String;
    static getPercentFormat(locale:String):String;

}
}
package qx.locale {
@js.native
@JSName("qx.locale.String")
class String extends js.Object {
    static getAlternateQuotationEnd(locale:String):String;
    static getAlternateQuotationStart(locale:String):String;
    static getQuotationEnd(locale:String):String;
    static getQuotationStart(locale:String):String;

}
}
package qx.log {
@js.native
@JSName("qx.log.Logger")
class Logger extends js.Object {
    static clear():Unit;
    static debug(object:any,message:any):Unit;
    static deprecatedClassWarning(clazz:qx.Class,msg?:String):Unit;
    static deprecatedConstantWarning(clazz:qx.Class,constant:String,msg:String):Unit;
    static deprecatedEventWarning(clazz:qx.Class,event:String,msg?:String):Unit;
    static deprecatedMethodWarning(fcn:js.Function,msg?:String):Unit;
    static deprecatedMixinWarning(clazz:qx.Class,msg?:String):Unit;
    static deprecateMethodOverriding(object:qx.core.Object,baseclass:qx.Class,methodName:String,msg?:String):Unit;
    static error(object:any,message:any):Unit;
    static getLevel():Int;
    static getTreshold():Int;
    static info(object:any,message:any):Unit;
    static register(appender:qx.Class):Unit;
    static setLevel(value:String):Unit;
    static setTreshold(value:Int):Unit;
    static trace(object?:any):Unit;
    static unregister(appender:qx.Class):Unit;
    static warn(object:any,message:any):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Console")
class Console extends js.Object {
    static clear():Unit;
    static dispose():Unit;
    static execute():Unit;
    static init():Unit;
    static process(entry:IMap):Unit;
    static show():Unit;
    static toggle():Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Element")
class Element extends qx.core.Object {
    constructor (element?:HTMLElement);
    clear():Unit;
    process(entry:IMap):Unit;
    setElement(element:HTMLElement):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Native")
class Native extends js.Object {
    static process(entry:IMap):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.NodeConsole")
class NodeConsole extends js.Object {
    static debug(logMessage:String):Unit;
    static error(logMessage:String):Unit;
    static info(logMessage:String):Unit;
    static log(logMessage:String,level:String):Unit;
    static process(entry:IMap):Unit;
    static warn(logMessage:String):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.PhoneGap")
class PhoneGap extends js.Object {
    static process(entry:IMap):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoConsole")
class RhinoConsole extends js.Object {
    static debug(logMessage:String):Unit;
    static error(logMessage:String):Unit;
    static info(logMessage:String):Unit;
    static log(logMessage:String,level:String):Unit;
    static process(entry:IMap):Unit;
    static warn(logMessage:String):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoFile")
class RhinoFile extends js.Object {
    static create():Unit;
    static debug(logMessage:String):Unit;
    static error(logMessage:String):Unit;
    static info(logMessage:String):Unit;
    static log(logMessage:String,level:String):Unit;
    static process(entry:IMap):Unit;
    static warn(logMessage:String):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RingBuffer")
class RingBuffer extends qx.util.RingBuffer {
    constructor (maxMessages?:Int);
    clearHistory():Unit;
    getAllLogEvents():qx.data.Array;
    getMaxMessages():Int;
    process(entry:IMap):Unit;
    retrieveLogEvents(count:Int,startingFromMark?:Boolean):qx.data.Array;
    setMaxMessages(maxMessages:Int):Unit;

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Util")
class Util extends js.Object {
    static escapeHTML(value:String):String;
    static formatOffset(offset:Int,length?:Int):String;
    static toHtml(entry:IMap):Unit;
    static toText(entry:IMap):String;
    static toTextArray(entry:IMap):qx.data.Array;

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Classic")
class Classic extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Indigo")
class Indigo extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Modern")
class Modern extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Simple")
class Simple extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Color")
class Color extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Font")
class Font extends js.Object {

}
}
package qx.theme.icon {
@js.native
@JSName("qx.theme.icon.Oxygen")
class Oxygen extends js.Object {

}
}
package qx.theme.icon {
@js.native
@JSName("qx.theme.icon.Tango")
class Tango extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Color")
class Color extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Font")
class Font extends js.Object {

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Appearance")
class Appearance extends qx.core.Object {
    constructor ();
    static getInstance():qx.theme.manager.Appearance;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    getTheme():qx.Theme;
    protected initTheme(value:any):qx.Theme;
    resetTheme():Unit;
    setTheme(value:any):qx.Theme;
    styleFrom(id:String,states:IMap,theme?:qx.Theme,defaultId?:String):IMap;

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Color")
class Color extends qx.util.ValueManager {
    static getInstance():qx.theme.manager.Color;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    getTheme():qx.Theme;
    protected initTheme(value:any):qx.Theme;
    resetTheme():Unit;
    setTheme(value:any):qx.Theme;

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Decoration")
class Decoration extends qx.core.Object {
    constructor ();
    static getInstance():qx.theme.manager.Decoration;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    addCssClass(value:String):String;
    clear():Unit;
    getCssClassName(value:String):String;
    getTheme():qx.Theme;
    protected initTheme(value:any):qx.Theme;
    isCached(decorator:String):Boolean;
    isDynamic(value:String):Boolean;
    isValidPropertyValue(value:any):Boolean;
    refresh():Unit;
    removeAllCssClasses():Unit;
    resetTheme():Unit;
    resolve(value:String):any;
    setTheme(value:any):qx.Theme;

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Font")
class Font extends qx.util.ValueManager {
    static getInstance():qx.theme.manager.Font;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    getTheme():qx.Theme;
    protected initTheme(value:any):qx.Theme;
    resetTheme():Unit;
    setTheme(value:any):qx.Theme;

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Icon")
class Icon extends qx.core.Object {
    static getInstance():qx.theme.manager.Icon;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    getTheme():qx.Theme;
    protected initTheme(value:any):qx.Theme;
    resetTheme():Unit;
    setTheme(value:any):qx.Theme;

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Meta")
class Meta extends qx.core.Object {
    static getInstance():qx.theme.manager.Meta;
    protected _activateEvents():Unit;
    protected _applyTheme(value:qx.Theme,old:qx.Theme):Unit;
    protected _fireEvent(e:qx.event.type.Data):Unit;
    protected _suspendEvents():Unit;
    getTheme():qx.Theme;
    initialize():Unit;
    protected initTheme(value:any):qx.Theme;
    resetTheme():Unit;
    setTheme(value:any):qx.Theme;

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Color")
class Color extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Font")
class Font extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Color")
class Color extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Font")
class Font extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Image")
class Image extends qx.core.Object {

}
}
package qx.type {
@js.native
@JSName("qx.type.Array")
class Array extends qx.type.BaseArray {
    constructor (length_or_items?:Int);
    append(arr:qx.data.Array):qx.data.Array;
    clone():qx.data.Array;
    contains(obj:any):Boolean;
    insertAfter(obj:any,obj2:any):qx.data.Array;
    insertAt(obj:any,i:Int):qx.data.Array;
    insertBefore(obj:any,obj2:any):qx.data.Array;
    prepend(arr:qx.data.Array):qx.data.Array;
    remove(obj:any):any;
    removeAll():qx.data.Array;
    removeAt(i:Int):any;

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseArray")
class BaseArray extends qx.data.Array {
    constructor (length_or_items?:Int);
    concat(varargs?:qx.data.Array):qx.type.BaseArray;
    every(callback:js.Function,obj:any):Boolean;
    filter(callback:js.Function,obj:any):any;
    forEach(callback:js.Function,obj:any):Unit;
    indexOf(searchElement:any,fromIndex?:Int):Int;
    join(separator:String):String;
    lastIndexOf(searchElement:any,fromIndex?:Int):Int;
    map(callback:js.Function,obj:any):any;
    pop():any;
    push(varargs?:any):Int;
    reverse():qx.data.Array;
    shift():any;
    slice(begin:Int,end?:Int):any;
    some(callback:js.Function,obj:any):Boolean;
    sort(compareFunction?:js.Function):qx.data.Array;
    splice(index:Int,howMany:Int,varargs?:any):any;
    toArray():qx.data.Array;
    unshift(varargs?:any):Int;

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseError")
class BaseError extends js.Error {
    constructor (comment?:String,failMessage?:String);
    getComment():String;

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseString")
class BaseString extends js.Object {
    constructor (txt?:String);
    base(args:any,varags:any):any;
    charAt(index:Int):String;
    charCodeAt(index:Int):Int;
    concat(stringN:String):String;
    indexOf(index:String,offset?:Int):Int;
    lastIndexOf(index:String,offset?:Int):Int;
    match(regexp:any):any;
    replace(regexp:any,aFunction:js.Function):String;
    search(regexp:any):any;
    slice(beginslice:Int,endSlice?:Int):String;
    split(separator?:String,limit?:Int):qx.data.Array;
    substr(start:Int,length?:Int):String;
    substring(indexA:Int,indexB?:Int):String;
    toHashCode():Int;
    toLocaleLowerCase():String;
    toLocaleUpperCase():String;
    toLowerCase():String;
    toUpperCase():String;

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Atom")
class Atom extends qx.ui.core.Widget {
    constructor (label?:String,icon?:String);
    protected _applyCenter(value:Boolean,old:Boolean):Unit;
    protected _applyGap(value:Int,old:Int):Unit;
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyIconPosition(value:any,old:any):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyRich(value:Boolean,old:Boolean):Unit;
    protected _applyShow(value:any,old:any):Unit;
    protected _handleIcon():Unit;
    protected _handleLabel():Unit;
    getCenter():Boolean;
    getGap():Int;
    getIcon():String;
    getIconPosition():any;
    getLabel():String;
    getRich():Boolean;
    getShow():any;
    protected initCenter(value:any):Boolean;
    protected initGap(value:any):Int;
    protected initIcon(value:any):String;
    protected initIconPosition(value:any):any;
    protected initLabel(value:any):String;
    protected initRich(value:any):Boolean;
    protected initShow(value:any):any;
    isCenter():Boolean;
    isRich():Boolean;
    resetCenter():Unit;
    resetGap():Unit;
    resetIcon():Unit;
    resetIconPosition():Unit;
    resetLabel():Unit;
    resetRich():Unit;
    resetShow():Unit;
    setCenter(value:any):Boolean;
    setGap(value:any):Int;
    setIcon(value:any):String;
    setIconPosition(value:any):any;
    setLabel(value:any):String;
    setRich(value:any):Boolean;
    setShow(value:any):any;
    toggleCenter():Boolean;
    toggleRich():Boolean;

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Image")
class Image extends qx.ui.core.Widget {
    constructor (source?:String);
    protected _applyScale(value:Boolean,old:Boolean):Unit;
    protected _applySource(value:String,old:String):Unit;
    protected _findHighResolutionSource(lowResImgSrc:String):String;
    protected _getHighResolutionSource(source:String,pixelRatio:Long):String;
    protected _styleSource():Unit;
    getScale():Boolean;
    getSource():String;
    protected initScale(value:any):Boolean;
    protected initSource(value:any):String;
    isScale():Boolean;
    resetScale():Unit;
    resetSource():Unit;
    setScale(value:any):Boolean;
    setSource(value:any):String;
    toggleScale():Boolean;

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Label")
class Label extends qx.ui.core.Widget implements qx.ui.form.IStringForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    constructor (value?:String);
    protected _applyBuddy(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _applyRich(value:Boolean,old:Boolean):Unit;
    protected _applyTextAlign(value:any,old:any):Unit;
    protected _applyValue(value:String,old:String):Unit;
    protected _applyWrap(value:Boolean,old:Boolean):Unit;
    protected _onChangeLocale(e:qx.event.type.Event):Unit;
    protected _onWebFontStatusChange(ev:qx.event.type.Data):Unit;
    getBuddy():qx.ui.core.Widget;
    getRich():Boolean;
    getTextAlign():any;
    getWrap():Boolean;
    protected initBuddy(value:any):qx.ui.core.Widget;
    protected initRich(value:any):Boolean;
    protected initTextAlign(value:any):any;
    protected initValue(value:any):String;
    protected initWrap(value:any):Boolean;
    isRich():Boolean;
    isWrap():Boolean;
    resetBuddy():Unit;
    resetRich():Unit;
    resetTextAlign():Unit;
    resetWrap():Unit;
    setBuddy(value:any):qx.ui.core.Widget;
    setRich(value:any):Boolean;
    setTextAlign(value:any):any;
    setWrap(value:any):Boolean;
    toggleRich():Boolean;
    toggleWrap():Boolean;

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Composite")
class Composite extends qx.ui.core.Widget {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    constructor (layout?:qx.ui.layout.Abstract);

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Resizer")
class Resizer extends qx.ui.container.Composite {
    getResizableBottom():Boolean;
    getResizableLeft():Boolean;
    getResizableRight():Boolean;
    getResizableTop():Boolean;
    getResizeSensitivity():Int;
    getUseResizeFrame():Boolean;
    isResizableBottom():Boolean;
    isResizableLeft():Boolean;
    isResizableRight():Boolean;
    isResizableTop():Boolean;
    isUseResizeFrame():Boolean;
    resetResizable():Unit;
    resetResizableBottom():Unit;
    resetResizableLeft():Unit;
    resetResizableRight():Unit;
    resetResizableTop():Unit;
    resetResizeSensitivity():Unit;
    resetUseResizeFrame():Unit;
    setResizable(resizableTop:any,resizableRight:any,resizableBottom:any,resizableLeft:any):Unit;
    setResizableBottom(value:any):Boolean;
    setResizableLeft(value:any):Boolean;
    setResizableRight(value:any):Boolean;
    setResizableTop(value:any):Boolean;
    setResizeSensitivity(value:any):Int;
    setUseResizeFrame(value:any):Boolean;
    toggleResizableBottom():Boolean;
    toggleResizableLeft():Boolean;
    toggleResizableRight():Boolean;
    toggleResizableTop():Boolean;
    toggleUseResizeFrame():Boolean;

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Scroll")
class Scroll extends qx.ui.core.scroll.AbstractScrollArea {
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    constructor (content?:qx.ui.core.LayoutItem);
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    add(widget:qx.ui.core.Widget):Unit;
    getChildren():any[];
    remove(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.SlideBar")
class SlideBar extends qx.ui.core.Widget {
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    constructor (orientation?:String);
    protected _applyOrientation(value:any,old:any):Unit;
    protected _hideArrows():Unit;
    protected _onExecuteBackward():Unit;
    protected _onExecuteForward():Unit;
    protected _onResize(e:qx.event.type.Event):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _onScroll():Unit;
    protected _onScrollAnimationEnd():Unit;
    protected _showArrows():Unit;
    protected _updateArrowsEnabled():Unit;
    getOrientation():any;
    getScrollStep():Int;
    protected initOrientation(value:any):any;
    protected initScrollStep(value:any):Int;
    resetOrientation():Unit;
    resetScrollStep():Unit;
    scrollBy(offset?:Int,duration?:Long):Unit;
    scrollTo(value:Int,duration?:Long):Unit;
    setOrientation(value:any):any;
    setScrollStep(value:any):Int;

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Stack")
class Stack extends qx.ui.core.Widget implements qx.ui.core.ISingleSelection {
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor ();
    protected _applyDynamic(value:Boolean,old:Boolean):Unit;
    protected _getItems():qx.ui.core.Widget[];
    protected _isAllowEmptySelection():Boolean;
    protected _isItemSelectable(item:qx.ui.core.Widget):Boolean;
    getDynamic():Boolean;
    protected initDynamic(value:any):Boolean;
    isDynamic():Boolean;
    next():Unit;
    previous():Unit;
    resetDynamic():Unit;
    setDynamic(value:any):Boolean;
    toggleDynamic():Boolean;

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorPopup")
class ColorPopup extends qx.ui.popup.Popup implements qx.ui.form.IColorForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    constructor ();
    protected _applyValue(value:any,old:any):Unit;
    protected _createBoxes():Unit;
    protected _createColorSelector():Unit;
    protected _onAutomaticBtnExecute():Unit;
    protected _onChangeVisibility(e:qx.event.type.Data):Unit;
    protected _onColorSelectorCancel():Unit;
    protected _onColorSelectorOk():Unit;
    protected _onFieldPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onFieldPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onFieldPointerOver(e:qx.event.type.Pointer):Unit;
    protected _onSelectorButtonExecute():Unit;
    protected _rotatePreviousColors():Unit;
    getBlue():Long;
    getGreen():Long;
    getRed():Long;
    protected initBlue(value:any):Long;
    protected initGreen(value:any):Long;
    protected initRed(value:any):Long;
    protected initValue(value:any):any;
    resetBlue():Unit;
    resetGreen():Unit;
    resetRed():Unit;
    setBlue(value:any):Long;
    setGreen(value:any):Long;
    setRed(value:any):Long;

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorSelector")
class ColorSelector extends qx.ui.core.Widget implements qx.ui.form.IColorForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    constructor ();
    protected _applyBlue(value:Int,old:Int):Unit;
    protected _applyBrightness(value:Long,old:Long):Unit;
    protected _applyGreen(value:Int,old:Int):Unit;
    protected _applyHue(value:Long,old:Long):Unit;
    protected _applyRed(value:Int,old:Int):Unit;
    protected _applySaturation(value:Long,old:Long):Unit;
    protected _onAppear(e:qx.event.type.Data):Unit;
    protected _onBrightnessFieldPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onBrightnessHandlePointerDown(e:qx.event.type.Pointer):Unit;
    protected _onBrightnessHandlePointerMove(e:qx.event.type.Pointer):Unit;
    protected _onBrightnessHandlePointerUp(e:qx.event.type.Pointer):Unit;
    protected _onBrightnessPaneRoll(e:qx.event.type.Roll):Unit;
    protected _onColorFieldTap(e:qx.event.type.Pointer):Unit;
    protected _onHexFieldChange(e:qx.event.type.Data):Unit;
    protected _onHueSaturationFieldPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onHueSaturationHandlePointerMove(e:qx.event.type.Pointer):Unit;
    protected _onHueSaturationHandlePointerUp(e:qx.event.type.Pointer):Unit;
    protected _onHueSaturationPaneRoll(e:qx.event.type.Roll):Unit;
    protected _setBlueFromSpinner():Unit;
    protected _setBrightnessFromSpinner():Unit;
    protected _setBrightnessGradiant():Unit;
    protected _setBrightnessOnFieldEvent(e:qx.event.type.Pointer):Unit;
    protected _setGreenFromSpinner():Unit;
    protected _setHexFromRgb():Unit;
    protected _setHueFromRgb():Unit;
    protected _setHueFromSpinner():Unit;
    protected _setHueSaturationOnFieldEvent(e:qx.event.type.Pointer):Unit;
    protected _setPreviewFromRgb():Unit;
    protected _setRedFromSpinner():Unit;
    protected _setRgbFromHue():Unit;
    protected _setSaturationFromSpinner():Unit;
    getBlue():Int;
    getBrightness():Long;
    getGreen():Int;
    getHue():Long;
    getRed():Int;
    getSaturation():Long;
    protected initBlue(value:any):Int;
    protected initBrightness(value:any):Long;
    protected initGreen(value:any):Int;
    protected initHue(value:any):Long;
    protected initRed(value:any):Int;
    protected initSaturation(value:any):Long;
    resetBlue():Unit;
    resetBrightness():Unit;
    resetGreen():Unit;
    resetHue():Unit;
    resetRed():Unit;
    resetSaturation():Unit;
    setBlue(value:any):Int;
    setBrightness(value:any):Long;
    setGreen(value:any):Int;
    setHue(value:any):Long;
    setPreviousColor(red:Long,green:Long,blue:Long):Unit;
    setRed(value:any):Int;
    setSaturation(value:any):Long;

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.DateChooser")
class DateChooser extends qx.ui.core.Widget implements qx.ui.form.IExecutable,qx.ui.form.IForm,qx.ui.form.IDateForm {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getValue():js.Date;
    resetValue():Unit;
    setValue(value:js.Date):Unit;
    resetCommand():Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (date?:js.Date);
    protected _applyValue(value:js.Date,old:js.Date):Unit;
    protected _onDayDblTap():Unit;
    protected _onDayTap(evt:qx.event.type.Data):Unit;
    protected _onKeyPress(evt:qx.event.type.Data):Unit;
    protected _onNavButtonTap(evt:qx.event.type.Data):Unit;
    protected _onPointerUpDown(e:qx.event.type.Pointer):Unit;
    protected _updateDatePane():Unit;
    getShownMonth():Int;
    getShownYear():Int;
    handleKeyPress(e:qx.event.type.Data):Unit;
    protected initShownMonth(value:any):Int;
    protected initShownYear(value:any):Int;
    protected initValue(value:any):js.Date;
    resetShownMonth():Unit;
    resetShownYear():Unit;
    setShownMonth(value:any):Int;
    setShownYear(value:any):Int;
    showMonth(month?:Int,year?:Int):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Blocker")
class Blocker extends qx.core.Object {
    constructor (widget?:qx.ui.core.Widget);
    protected _applyColor(value:String,old:String):Unit;
    protected _applyOpacity(value:Long,old:Long):Unit;
    protected _backupActiveWidget():Unit;
    protected _block(zIndex:Long,blockContent:Boolean):Unit;
    protected _onChangeTheme():Unit;
    protected _restoreActiveWidget():Unit;
    protected _updateBlockerBounds(bounds:IMap):Unit;
    block():Unit;
    blockContent(zIndex:Int):Unit;
    forceUnblock():Unit;
    getBlockerElement(widget:qx.ui.core.Widget):qx.html.Element;
    getColor():String;
    getKeepBlockerActive():Boolean;
    getOpacity():Long;
    protected initColor(value:any):String;
    protected initKeepBlockerActive(value:any):Boolean;
    protected initOpacity(value:any):Long;
    isBlocked():Boolean;
    isKeepBlockerActive():Boolean;
    resetColor():Unit;
    resetKeepBlockerActive():Unit;
    resetOpacity():Unit;
    setColor(value:any):String;
    setKeepBlockerActive(value:any):Boolean;
    setOpacity(value:any):Long;
    toggleKeepBlockerActive():Boolean;
    unblock():Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.ColumnData")
class ColumnData extends qx.ui.core.LayoutItem {
    constructor ();
    getComputedWidth():Int;
    getFlex():Int;
    setColumnWidth(width:Int,flex?:Int):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.DragDropCursor")
class DragDropCursor extends qx.ui.basic.Image {
    static getMoveDirection():String;
    static getVisibleElement():qx.ui.core.Widget;
    static setMoveDirection(direction:String):Unit;
    static setVisibleElement(elem:qx.ui.core.Widget):Unit;
    getDomMove():Boolean;
    getLayoutLocation(widget:qx.ui.core.Widget):IMap;
    getOffsetBottom():Int;
    getOffsetLeft():Int;
    getOffsetRight():Int;
    getOffsetTop():Int;
    getPlacementModeX():any;
    getPlacementModeY():any;
    getPlaceMethod():any;
    getPosition():any;
    isDomMove():Boolean;
    moveTo(left:Int,top:Int):Unit;
    placeToElement(elem:HTMLElement,liveupdate:Boolean):Unit;
    placeToPoint(point:IMap):Unit;
    placeToPointer(event:qx.event.type.Pointer):Unit;
    placeToWidget(target:qx.ui.core.Widget,liveupdate:Boolean):Boolean;
    resetDomMove():Unit;
    resetOffset():Unit;
    resetOffsetBottom():Unit;
    resetOffsetLeft():Unit;
    resetOffsetRight():Unit;
    resetOffsetTop():Unit;
    resetPlacementModeX():Unit;
    resetPlacementModeY():Unit;
    resetPlaceMethod():Unit;
    resetPosition():Unit;
    setDomMove(value:any):Boolean;
    setOffset(offsetTop:any,offsetRight:any,offsetBottom:any,offsetLeft:any):Unit;
    setOffsetBottom(value:any):Int;
    setOffsetLeft(value:any):Int;
    setOffsetRight(value:any):Int;
    setOffsetTop(value:any):Int;
    setPlacementModeX(value:any):any;
    setPlacementModeY(value:any):any;
    setPlaceMethod(value:any):any;
    setPosition(value:any):any;
    toggleDomMove():Boolean;
    constructor ();
    static getInstance():qx.ui.core.DragDropCursor;
    protected _applyAction(value:any,old:any):Unit;
    getAction():any;
    protected initAction(value:any):any;
    resetAction():Unit;
    setAction(value:any):any;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.EventHandler")
class EventHandler extends qx.core.Object implements qx.event.IEventHandler {
    canHandleEvent(target:any,type:String):Boolean;
    registerEvent(target:any,type:String,capture:Boolean):Unit;
    unregisterEvent(target:any,type:String,capture:Boolean):Unit;
    constructor ();
    protected _dispatchEvent(domEvent:qx.event.type.Event):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.FocusHandler")
class FocusHandler extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.core.FocusHandler;
    protected _onActivate(e:qx.event.type.Focus):Unit;
    protected _onDeactivate(e:qx.event.type.Focus):Unit;
    protected _onFocusIn(e:qx.event.type.Focus):Unit;
    protected _onFocusOut(e:qx.event.type.Focus):Unit;
    addRoot(widget:qx.ui.core.Widget):Unit;
    connectTo(root:qx.ui.root.Abstract):Unit;
    getActiveWidget():qx.ui.core.Widget;
    getFocusedWidget():qx.ui.core.Widget;
    isActive(widget:qx.ui.core.Widget):Boolean;
    isFocused(widget:qx.ui.core.Widget):Boolean;
    isFocusRoot(widget:qx.ui.core.Widget):Boolean;
    removeRoot(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.core {
@js.native
trait IMultiSelection extends js.Object {
    addToSelection(item:qx.ui.core.Widget):Unit;
    removeFromSelection(item:qx.ui.core.Widget):Unit;
    selectAll():Unit;

}
}
package qx.ui.core {
@js.native
trait ISingleSelection extends js.Object {
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;

}
}
package qx.ui.core {
@js.native
trait ISingleSelectionProvider extends js.Object {
    getItems():qx.ui.core.Widget[];
    isItemSelectable(item:qx.ui.core.Widget):Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.LayoutItem")
class LayoutItem extends qx.core.Object {
    constructor ();
    protected _applyAlign(value:any,old:any):Unit;
    protected _applyDimension(value:Int,old:Int):Unit;
    protected _applyMargin(value:Int,old:Int):Unit;
    protected _applyStretching(value:Boolean,old:Boolean):Unit;
    protected _computeSizeHint():IMap;
    protected _getHeightForWidth(width:Int):Int;
    protected _getLayout():qx.ui.layout.Abstract;
    protected _getRoot():qx.ui.core.Widget;
    protected _hasHeightForWidth():Boolean;
    protected _onChangeTheme():Unit;
    clearLayoutProperties():Unit;
    clearSeparators():Unit;
    getAlignX():any;
    getAlignY():any;
    getAllowGrowX():Boolean;
    getAllowGrowY():Boolean;
    getAllowShrinkX():Boolean;
    getAllowShrinkY():Boolean;
    getApplicationRoot():qx.ui.root.Abstract;
    getBounds():IMap;
    getHeight():Int;
    getLayoutParent():qx.ui.core.Widget;
    getLayoutProperties():IMap;
    getMarginBottom():Int;
    getMarginLeft():Int;
    getMarginRight():Int;
    getMarginTop():Int;
    getMaxHeight():Int;
    getMaxWidth():Int;
    getMinHeight():Int;
    getMinWidth():Int;
    getSizeHint(compute?:Boolean):IMap;
    getWidth():Int;
    hasUserBounds():Boolean;
    hasValidLayout():Boolean;
    protected initAlignX(value:any):any;
    protected initAlignY(value:any):any;
    protected initAllowGrowX(value:any):Boolean;
    protected initAllowGrowY(value:any):Boolean;
    protected initAllowShrinkX(value:any):Boolean;
    protected initAllowShrinkY(value:any):Boolean;
    protected initHeight(value:any):Int;
    protected initMarginBottom(value:any):Int;
    protected initMarginLeft(value:any):Int;
    protected initMarginRight(value:any):Int;
    protected initMarginTop(value:any):Int;
    protected initMaxHeight(value:any):Int;
    protected initMaxWidth(value:any):Int;
    protected initMinHeight(value:any):Int;
    protected initMinWidth(value:any):Int;
    protected initWidth(value:any):Int;
    invalidateLayoutCache():Unit;
    isAllowGrowX():Boolean;
    isAllowGrowY():Boolean;
    isAllowShrinkX():Boolean;
    isAllowShrinkY():Boolean;
    isExcluded():Boolean;
    isRootWidget():Boolean;
    renderLayout(left:Int,top:Int,width:Int,height:Int):IMap;
    renderSeparator(separator:String,bounds:IMap):Unit;
    resetAlignX():Unit;
    resetAlignY():Unit;
    resetAllowGrowX():Unit;
    resetAllowGrowY():Unit;
    resetAllowShrinkX():Unit;
    resetAllowShrinkY():Unit;
    resetAllowStretchX():Unit;
    resetAllowStretchY():Unit;
    resetHeight():Unit;
    resetMargin():Unit;
    resetMarginBottom():Unit;
    resetMarginLeft():Unit;
    resetMarginRight():Unit;
    resetMarginTop():Unit;
    resetMaxHeight():Unit;
    resetMaxWidth():Unit;
    resetMinHeight():Unit;
    resetMinWidth():Unit;
    resetUserBounds():Unit;
    resetWidth():Unit;
    scheduleLayoutUpdate():Unit;
    setAlignX(value:any):any;
    setAlignY(value:any):any;
    setAllowGrowX(value:any):Boolean;
    setAllowGrowY(value:any):Boolean;
    setAllowShrinkX(value:any):Boolean;
    setAllowShrinkY(value:any):Boolean;
    setAllowStretchX(allowGrowX:any,allowShrinkX:any):Unit;
    setAllowStretchY(allowGrowY:any,allowShrinkY:any):Unit;
    setHeight(value:any):Int;
    setLayoutParent(parent:qx.ui.core.Widget):Unit;
    setLayoutProperties(props:IMap):Unit;
    setMargin(marginTop:any,marginRight:any,marginBottom:any,marginLeft:any):Unit;
    setMarginBottom(value:any):Int;
    setMarginLeft(value:any):Int;
    setMarginRight(value:any):Int;
    setMarginTop(value:any):Int;
    setMaxHeight(value:any):Int;
    setMaxWidth(value:any):Int;
    setMinHeight(value:any):Int;
    setMinWidth(value:any):Int;
    setUserBounds(left:Int,top:Int,width:Int,height:Int):Unit;
    setWidth(value:any):Int;
    toggleAllowGrowX():Boolean;
    toggleAllowGrowY():Boolean;
    toggleAllowShrinkX():Boolean;
    toggleAllowShrinkY():Boolean;
    updateLayoutProperties(props?:IMap):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MBlocker")
class MBlocker extends js.Object {
    protected _applyBlockerColor(value:String,old:String):Unit;
    protected _applyBlockerOpacity(value:Long,old:Long):Unit;
    protected _createBlocker():qx.ui.core.Blocker;
    block():Unit;
    blockContent(zIndex:Int):Unit;
    forceUnblock():Unit;
    getBlocker():qx.ui.core.Blocker;
    getBlockerColor():String;
    getBlockerOpacity():Long;
    protected initBlockerColor(value:any):String;
    protected initBlockerOpacity(value:any):Long;
    isBlocked():Boolean;
    resetBlockerColor():Unit;
    resetBlockerOpacity():Unit;
    setBlockerColor(value:any):String;
    setBlockerOpacity(value:any):Long;
    unblock():Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MChildrenHandling")
class MChildrenHandling extends js.Object {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MContentPadding")
class MContentPadding extends js.Object {
    protected _applyContentPadding(value:Int,old:Int):Unit;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    protected initContentPaddingBottom(value:any):Int;
    protected initContentPaddingLeft(value:any):Int;
    protected initContentPaddingRight(value:any):Int;
    protected initContentPaddingTop(value:any):Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MDragDropScrolling")
class MDragDropScrolling extends js.Object {
    constructor ();
    protected _calculateScrollAmount(scrollbarSize:Long,exceedanceAmount:Long):Long;
    protected _calculateThresholdExceedance(diff:Long,threshold:Long):Long;
    protected _findScrollableParent(widget:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    protected _getAxis(edgeType:String):String;
    protected _getBounds(scrollable:qx.ui.core.Widget):IMap;
    protected _getEdgeType(diff:IMap,thresholdX:Long,thresholdY:Long):String;
    protected _getThresholdByEdgeType(edgeType:String):Long;
    protected _isScrollable(widget:qx.ui.core.Widget):Boolean;
    protected _isScrollbarExceedingMaxPos(scrollbar:qx.ui.core.scroll.IScrollBar,axis:String,amount:Long):Boolean;
    protected _isScrollbarVisible(scrollable:qx.ui.core.Widget,axis:String):Boolean;
    protected _scrollBy(scrollable:qx.ui.core.Widget,axis:String,exceedanceAmount:Long):Unit;
    getDragScrollSlowDownFactor():Float;
    getDragScrollThresholdX():Int;
    getDragScrollThresholdY():Int;
    protected initDragScrollSlowDownFactor(value:any):Float;
    protected initDragScrollThresholdX(value:any):Int;
    protected initDragScrollThresholdY(value:any):Int;
    resetDragScrollSlowDownFactor():Unit;
    resetDragScrollThresholdX():Unit;
    resetDragScrollThresholdY():Unit;
    setDragScrollSlowDownFactor(value:any):Float;
    setDragScrollThresholdX(value:any):Int;
    setDragScrollThresholdY(value:any):Int;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MExecutable")
class MExecutable extends js.Object {
    protected _applyCommand(value:qx.ui.command.Command,old:qx.ui.command.Command):Unit;
    execute():Unit;
    getCommand():qx.ui.command.Command;
    protected initCommand(value:any):qx.ui.command.Command;
    resetCommand():Unit;
    setCommand(value:any):qx.ui.command.Command;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MLayoutHandling")
class MLayoutHandling extends js.Object {
    static remap(members:IMap):Unit;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMovable")
class MMovable extends js.Object {
    protected _activateMoveHandle(widget:qx.ui.core.Widget):Unit;
    protected _onMovePointerDown(e:qx.event.type.Pointer):Unit;
    protected _onMovePointerMove(e:qx.event.type.Pointer):Unit;
    protected _onMovePointerUp(e:qx.event.type.Pointer):Unit;
    protected _onMoveRoll(e:qx.event.type.Roll):Unit;
    getMovable():Boolean;
    getUseMoveFrame():Boolean;
    protected initMovable(value:any):Boolean;
    protected initUseMoveFrame(value:any):Boolean;
    isMovable():Boolean;
    isUseMoveFrame():Boolean;
    resetMovable():Unit;
    resetUseMoveFrame():Unit;
    setMovable(value:any):Boolean;
    setUseMoveFrame(value:any):Boolean;
    toggleMovable():Boolean;
    toggleUseMoveFrame():Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMultiSelectionHandling")
class MMultiSelectionHandling extends js.Object {
    constructor ();
    protected _applyDragSelection(value:Boolean,old:Boolean):Unit;
    protected _applyQuickSelection(value:Boolean,old:Boolean):Unit;
    protected _applySelectionMode(value:any,old:any):Unit;
    protected _getLeadItem():qx.ui.core.Widget;
    protected _getManager():qx.ui.core.selection.Abstract;
    protected _onSelectionChange(e:qx.event.type.Data):Unit;
    addToSelection(item:qx.ui.core.Widget):Unit;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    getSelectionContext():String;
    getSelectionMode():any;
    getSortedSelection():qx.ui.core.Widget[];
    protected initDragSelection(value:any):Boolean;
    protected initQuickSelection(value:any):Boolean;
    protected initSelectionMode(value:any):any;
    invertSelection():Unit;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    removeFromSelection(item:qx.ui.core.Widget):Unit;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelection():Unit;
    resetSelectionMode():Unit;
    selectAll():Unit;
    selectRange(begin:qx.ui.core.Widget,end:qx.ui.core.Widget):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MNativeOverflow")
class MNativeOverflow extends js.Object {
    protected _applyOverflowX(value:any,old:any):Unit;
    protected _applyOverflowY(value:any,old:any):Unit;
    getOverflowX():any;
    getOverflowY():any;
    protected initOverflowX(value:any):any;
    protected initOverflowY(value:any):any;
    resetOverflow():Unit;
    resetOverflowX():Unit;
    resetOverflowY():Unit;
    setOverflow(overflowX:any,overflowY:any):Unit;
    setOverflowX(value:any):any;
    setOverflowY(value:any):any;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MPlacement")
class MPlacement extends js.Object {
    static getMoveDirection():String;
    static getVisibleElement():qx.ui.core.Widget;
    static setMoveDirection(direction:String):Unit;
    static setVisibleElement(elem:qx.ui.core.Widget):Unit;
    protected _getPlacementOffsets():IMap;
    protected _place(coords:IMap):Unit;
    getDomMove():Boolean;
    getLayoutLocation(widget:qx.ui.core.Widget):IMap;
    getOffsetBottom():Int;
    getOffsetLeft():Int;
    getOffsetRight():Int;
    getOffsetTop():Int;
    getPlacementModeX():any;
    getPlacementModeY():any;
    getPlaceMethod():any;
    getPosition():any;
    protected initDomMove(value:any):Boolean;
    protected initOffsetBottom(value:any):Int;
    protected initOffsetLeft(value:any):Int;
    protected initOffsetRight(value:any):Int;
    protected initOffsetTop(value:any):Int;
    protected initPlacementModeX(value:any):any;
    protected initPlacementModeY(value:any):any;
    protected initPlaceMethod(value:any):any;
    protected initPosition(value:any):any;
    isDomMove():Boolean;
    moveTo(left:Int,top:Int):Unit;
    placeToElement(elem:HTMLElement,liveupdate:Boolean):Unit;
    placeToPoint(point:IMap):Unit;
    placeToPointer(event:qx.event.type.Pointer):Unit;
    placeToWidget(target:qx.ui.core.Widget,liveupdate:Boolean):Boolean;
    resetDomMove():Unit;
    resetOffset():Unit;
    resetOffsetBottom():Unit;
    resetOffsetLeft():Unit;
    resetOffsetRight():Unit;
    resetOffsetTop():Unit;
    resetPlacementModeX():Unit;
    resetPlacementModeY():Unit;
    resetPlaceMethod():Unit;
    resetPosition():Unit;
    setDomMove(value:any):Boolean;
    setOffset(offsetTop:any,offsetRight:any,offsetBottom:any,offsetLeft:any):Unit;
    setOffsetBottom(value:any):Int;
    setOffsetLeft(value:any):Int;
    setOffsetRight(value:any):Int;
    setOffsetTop(value:any):Int;
    setPlacementModeX(value:any):any;
    setPlacementModeY(value:any):any;
    setPlaceMethod(value:any):any;
    setPosition(value:any):any;
    toggleDomMove():Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteChildrenHandling")
class MRemoteChildrenHandling extends js.Object {
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteLayoutHandling")
class MRemoteLayoutHandling extends js.Object {
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MResizable")
class MResizable extends js.Object {
    constructor ();
    protected _getResizeFrame():qx.ui.core.Widget;
    getResizableBottom():Boolean;
    getResizableLeft():Boolean;
    getResizableRight():Boolean;
    getResizableTop():Boolean;
    getResizeSensitivity():Int;
    getUseResizeFrame():Boolean;
    protected initResizableBottom(value:any):Boolean;
    protected initResizableLeft(value:any):Boolean;
    protected initResizableRight(value:any):Boolean;
    protected initResizableTop(value:any):Boolean;
    protected initResizeSensitivity(value:any):Int;
    protected initUseResizeFrame(value:any):Boolean;
    isResizableBottom():Boolean;
    isResizableLeft():Boolean;
    isResizableRight():Boolean;
    isResizableTop():Boolean;
    isUseResizeFrame():Boolean;
    resetResizable():Unit;
    resetResizableBottom():Unit;
    resetResizableLeft():Unit;
    resetResizableRight():Unit;
    resetResizableTop():Unit;
    resetResizeSensitivity():Unit;
    resetUseResizeFrame():Unit;
    setResizable(resizableTop:any,resizableRight:any,resizableBottom:any,resizableLeft:any):Unit;
    setResizableBottom(value:any):Boolean;
    setResizableLeft(value:any):Boolean;
    setResizableRight(value:any):Boolean;
    setResizableTop(value:any):Boolean;
    setResizeSensitivity(value:any):Int;
    setUseResizeFrame(value:any):Boolean;
    toggleResizableBottom():Boolean;
    toggleResizableLeft():Boolean;
    toggleResizableRight():Boolean;
    toggleResizableTop():Boolean;
    toggleUseResizeFrame():Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MSingleSelectionHandling")
class MSingleSelectionHandling extends js.Object {
    protected _onChangeSelected(e:qx.event.type.Data):Unit;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.SingleSelectionManager")
class SingleSelectionManager extends qx.core.Object {
    constructor (selectionProvider?:qx.ui.core.ISingleSelectionProvider);
    getAllowEmptySelection():Boolean;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelected():qx.ui.core.Widget;
    protected initAllowEmptySelection(value:any):Boolean;
    isAllowEmptySelection():Boolean;
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetAllowEmptySelection():Unit;
    resetSelected():Unit;
    setAllowEmptySelection(value:any):Boolean;
    setSelected(item:qx.ui.core.Widget):Unit;
    toggleAllowEmptySelection():Boolean;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Spacer")
class Spacer extends qx.ui.core.LayoutItem {
    constructor (width?:Int,height?:Int);
    addChildrenToQueue(queue:IMap):Unit;
    checkAppearanceNeeds():Unit;
    destroy():Unit;

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Widget")
class Widget extends qx.ui.core.LayoutItem {
    marktr(messageId:String):String;
    tr(messageId:String,varargs?:any):String;
    trc(hint:String,messageId:String,varargs?:any):String;
    trn(singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    trnc(hint:String,singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    constructor ();
    static contains(parent:qx.ui.core.Widget,child:qx.ui.core.Widget):Boolean;
    static getWidgetByElement(element:HTMLElement,considerAnonymousState?:Boolean):qx.ui.core.Widget;
    protected _add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    protected _addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    protected _addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    protected _addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    protected _afterAddChild(child:qx.ui.core.LayoutItem):Unit;
    protected _afterRemoveChild(child:qx.ui.core.LayoutItem):Unit;
    protected _applyAnonymous(value:Boolean,old:Boolean):Unit;
    protected _applyAppearance(value:String,old:String):Unit;
    protected _applyBackgroundColor(value:String,old:String):Unit;
    protected _applyContextMenu(value:qx.ui.menu.Menu,old:qx.ui.menu.Menu):Unit;
    protected _applyCursor(value:String,old:String):Unit;
    protected _applyDecorator(value:qx.ui.decoration.Decorator,old:qx.ui.decoration.Decorator):Unit;
    protected _applyDraggable(value:Boolean,old:Boolean):Unit;
    protected _applyDroppable(value:Boolean,old:Boolean):Unit;
    protected _applyEnabled(value:Boolean,old:Boolean):Unit;
    protected _applyFocusable(value:Boolean,old:Boolean):Unit;
    protected _applyFont(value:String,old:String):Unit;
    protected _applyKeepActive(value:Boolean,old:Boolean):Unit;
    protected _applyKeepFocus(value:Boolean,old:Boolean):Unit;
    protected _applyNativeContextMenu(value:Boolean,old:Boolean):Unit;
    protected _applyOpacity(value:Long,old:Long):Unit;
    protected _applyPadding(value:Int,old:Int):Unit;
    protected _applySelectable(value:Boolean,old:Boolean):Unit;
    protected _applyTabIndex(value:Int,old:Int):Unit;
    protected _applyTextColor(value:String,old:String):Unit;
    protected _applyToolTipText(value:String,old:String):Unit;
    protected _applyVisibility(value:any,old:any):Unit;
    protected _applyZIndex(value:Int,old:Int):Unit;
    protected _createChildControl(id:String):qx.ui.core.Widget;
    protected _createChildControlImpl(id:String,hash?:String):qx.ui.core.Widget;
    protected _createContentElement():qx.html.Element;
    protected _disposeChildControls():Unit;
    protected _excludeChildControl(id:String):Unit;
    protected _findTopControl():qx.ui.core.Widget;
    protected _getChildren():qx.ui.core.LayoutItem[];
    protected _getContentHeightForWidth(width:Int):Int;
    protected _getContentHint():IMap;
    protected _getCreatedChildControls():IMap;
    protected _getDragDropCursor():qx.ui.core.DragDropCursor;
    protected _hasChildren():Boolean;
    protected _indexOf(child:qx.ui.core.Widget):Int;
    protected _isChildControlVisible(id:String):Boolean;
    protected _onBeforeContextMenuOpen(e:qx.event.type.Data):Unit;
    protected _onContextMenuOpen(e:qx.event.type.Pointer):Unit;
    protected _onDrag(e:qx.event.type.Drag):Unit;
    protected _onDragChange(e:qx.event.type.Drag):Unit;
    protected _onDragEnd(e:qx.event.type.Drag):Unit;
    protected _onDragStart(e:qx.event.type.Drag):Unit;
    protected _onStopEvent(e:qx.event.type.Event):Unit;
    protected _releaseChildControl(id:String):qx.ui.core.Widget;
    protected _remove(child:qx.ui.core.LayoutItem):Unit;
    protected _removeAll():qx.data.Array;
    protected _removeAt(index:Int):qx.ui.core.LayoutItem;
    protected _setLayout(layout:qx.ui.layout.Abstract):Unit;
    protected _showChildControl(id:String):qx.ui.core.Widget;
    activate():Unit;
    addChildrenToQueue(queue:qx.data.Array):Unit;
    addState(state:String):Unit;
    blur():Unit;
    capture(capture?:Boolean):Unit;
    checkAppearanceNeeds():Unit;
    deactivate():Unit;
    destroy():Unit;
    exclude():Unit;
    fadeIn(duration:Long):qx.bom.element.AnimationHandle;
    fadeOut(duration:Long):qx.bom.element.AnimationHandle;
    focus():Unit;
    getAnonymous():Boolean;
    getAppearance():String;
    getBackgroundColor():String;
    getBlockToolTip():Boolean;
    getChildControl(id:String,notcreate?:Boolean):qx.ui.core.Widget;
    getChildrenContainer():qx.ui.core.Widget;
    getContentElement():qx.html.Element;
    getContentLocation(mode?:String):IMap;
    getContextMenu():qx.ui.menu.Menu;
    getCursor():String;
    getDecorator():qx.ui.decoration.Decorator;
    getDraggable():Boolean;
    getDroppable():Boolean;
    getEnabled():Boolean;
    getEventTarget():qx.ui.core.Widget;
    getFocusable():Boolean;
    getFocusElement():qx.html.Element;
    getFocusTarget():qx.ui.core.Widget;
    getFont():String;
    getInnerSize():IMap;
    getInsets():IMap;
    getKeepActive():Boolean;
    getKeepFocus():Boolean;
    getLayoutChildren():qx.ui.core.Widget[];
    getNativeContextMenu():Boolean;
    getOpacity():Long;
    getPaddingBottom():Int;
    getPaddingLeft():Int;
    getPaddingRight():Int;
    getPaddingTop():Int;
    getSelectable():Boolean;
    getShowToolTipWhenDisabled():Boolean;
    getTabIndex():Int;
    getTextColor():String;
    getToolTip():qx.ui.tooltip.ToolTip;
    getToolTipIcon():String;
    getToolTipText():String;
    getVisibility():any;
    getZIndex():Int;
    hasChildControl(id:String):Boolean;
    hasLayoutChildren():Boolean;
    hasState(state:String):Boolean;
    hide():Unit;
    protected initAnonymous(value:any):Boolean;
    protected initAppearance(value:any):String;
    protected initBackgroundColor(value:any):String;
    protected initBlockToolTip(value:any):Boolean;
    protected initContextMenu(value:any):qx.ui.menu.Menu;
    protected initCursor(value:any):String;
    protected initDecorator(value:any):qx.ui.decoration.Decorator;
    protected initDraggable(value:any):Boolean;
    protected initDroppable(value:any):Boolean;
    protected initEnabled(value:any):Boolean;
    protected initFocusable(value:any):Boolean;
    protected initFont(value:any):String;
    protected initKeepActive(value:any):Boolean;
    protected initKeepFocus(value:any):Boolean;
    protected initNativeContextMenu(value:any):Boolean;
    protected initOpacity(value:any):Long;
    protected initPaddingBottom(value:any):Int;
    protected initPaddingLeft(value:any):Int;
    protected initPaddingRight(value:any):Int;
    protected initPaddingTop(value:any):Int;
    protected initSelectable(value:any):Boolean;
    protected initShowToolTipWhenDisabled(value:any):Boolean;
    protected initTabIndex(value:any):Int;
    protected initTextColor(value:any):String;
    protected initToolTip(value:any):qx.ui.tooltip.ToolTip;
    protected initToolTipIcon(value:any):String;
    protected initToolTipText(value:any):String;
    protected initVisibility(value:any):any;
    protected initZIndex(value:any):Int;
    invalidateLayoutChildren():Unit;
    isAnonymous():Boolean;
    isBlockToolTip():Boolean;
    isCapturing():Boolean;
    isDraggable():Boolean;
    isDroppable():Boolean;
    isEnabled():Boolean;
    isFocusable():Boolean;
    isHidden():Boolean;
    isKeepActive():Boolean;
    isKeepFocus():Boolean;
    isNativeContextMenu():Boolean;
    isSeeable():Boolean;
    isSelectable():Boolean;
    isShowToolTipWhenDisabled():Boolean;
    isTabable():Boolean;
    isVisible():Boolean;
    releaseCapture():Unit;
    removeState(state:String):Unit;
    replaceState(old:String,value:String):Unit;
    resetAnonymous():Unit;
    resetAppearance():Unit;
    resetBackgroundColor():Unit;
    resetBlockToolTip():Unit;
    resetContextMenu():Unit;
    resetCursor():Unit;
    resetDecorator():Unit;
    resetDraggable():Unit;
    resetDroppable():Unit;
    resetEnabled():Unit;
    resetFocusable():Unit;
    resetFont():Unit;
    resetKeepActive():Unit;
    resetKeepFocus():Unit;
    resetNativeContextMenu():Unit;
    resetOpacity():Unit;
    resetPadding():Unit;
    resetPaddingBottom():Unit;
    resetPaddingLeft():Unit;
    resetPaddingRight():Unit;
    resetPaddingTop():Unit;
    resetSelectable():Unit;
    resetShowToolTipWhenDisabled():Unit;
    resetTabIndex():Unit;
    resetTextColor():Unit;
    resetToolTip():Unit;
    resetToolTipIcon():Unit;
    resetToolTipText():Unit;
    resetVisibility():Unit;
    resetZIndex():Unit;
    scrollChildIntoView(child:qx.ui.core.Widget,alignX?:String,alignY?:String,direct?:Boolean):Unit;
    scrollChildIntoViewX(child:qx.ui.core.Widget,align?:String,direct?:Boolean):Unit;
    scrollChildIntoViewY(child:qx.ui.core.Widget,align?:String,direct?:Boolean):Unit;
    setAnonymous(value:any):Boolean;
    setAppearance(value:any):String;
    setBackgroundColor(value:any):String;
    setBlockToolTip(value:any):Boolean;
    setContextMenu(value:any):qx.ui.menu.Menu;
    setCursor(value:any):String;
    setDecorator(value:any):qx.ui.decoration.Decorator;
    setDomLeft(value:Int):Unit;
    setDomPosition(left:Int,top:Int):Unit;
    setDomTop(value:Int):Unit;
    setDraggable(value:any):Boolean;
    setDroppable(value:any):Boolean;
    setEnabled(value:any):Boolean;
    setFocusable(value:any):Boolean;
    setFont(value:any):String;
    setKeepActive(value:any):Boolean;
    setKeepFocus(value:any):Boolean;
    setNativeContextMenu(value:any):Boolean;
    setOpacity(value:any):Long;
    setPadding(paddingTop:any,paddingRight:any,paddingBottom:any,paddingLeft:any):Unit;
    setPaddingBottom(value:any):Int;
    setPaddingLeft(value:any):Int;
    setPaddingRight(value:any):Int;
    setPaddingTop(value:any):Int;
    setSelectable(value:any):Boolean;
    setShowToolTipWhenDisabled(value:any):Boolean;
    setTabIndex(value:any):Int;
    setTextColor(value:any):String;
    setToolTip(value:any):qx.ui.tooltip.ToolTip;
    setToolTipIcon(value:any):String;
    setToolTipText(value:any):String;
    setVisibility(value:any):any;
    setZIndex(value:any):Int;
    show():Unit;
    syncAppearance():Unit;
    syncWidget(jobs:IMap):Unit;
    tabFocus():Unit;
    toggleAnonymous():Boolean;
    toggleBlockToolTip():Boolean;
    toggleDraggable():Boolean;
    toggleDroppable():Boolean;
    toggleEnabled():Boolean;
    toggleFocusable():Boolean;
    toggleKeepActive():Boolean;
    toggleKeepFocus():Boolean;
    toggleNativeContextMenu():Boolean;
    toggleSelectable():Boolean;
    toggleShowToolTipWhenDisabled():Boolean;
    updateAppearance():Unit;
    visualizeBlur():Unit;
    visualizeFocus():Unit;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Appearance")
class Appearance extends js.Object {
    static add(widget:qx.ui.core.Widget):Unit;
    static flush():Unit;
    static has(widget:qx.ui.core.Widget):Boolean;
    static remove(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Dispose")
class Dispose extends js.Object {
    static add(widget:qx.ui.core.Widget):Unit;
    static flush():Unit;
    static isEmpty():Boolean;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Layout")
class Layout extends js.Object {
    static add(widget:qx.ui.core.Widget):Unit;
    static flush():Unit;
    static getNestingLevel(widget:qx.ui.core.Widget):Int;
    static isScheduled(widget:qx.ui.core.Widget):Boolean;
    static remove(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Manager")
class Manager extends js.Object {
    static flush():Unit;
    static scheduleFlush(job:String):Unit;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Visibility")
class Visibility extends js.Object {
    static add(widget:qx.ui.core.Widget):Unit;
    static flush():Unit;
    static isVisible(widget:qx.ui.core.Widget):Boolean;
    static remove(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Widget")
class Widget extends js.Object {
    static add(widget:qx.ui.core.Widget,job?:String):Unit;
    static flush():Unit;
    static remove(widget:qx.ui.core.Widget,job?:String):Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.AbstractScrollArea")
class AbstractScrollArea extends qx.ui.core.Widget {
    getDragScrollSlowDownFactor():Float;
    getDragScrollThresholdX():Int;
    getDragScrollThresholdY():Int;
    resetDragScrollSlowDownFactor():Unit;
    resetDragScrollThresholdX():Unit;
    resetDragScrollThresholdY():Unit;
    setDragScrollSlowDownFactor(value:any):Float;
    setDragScrollThresholdX(value:any):Int;
    setDragScrollThresholdY(value:any):Int;
    constructor ();
    protected _computeScrollbars():Unit;
    protected _onChangeScrollbarXVisibility(e:qx.event.type.Event):Unit;
    protected _onChangeScrollbarYVisibility(e:qx.event.type.Event):Unit;
    protected _onScrollAnimationEnd(direction:String):Unit;
    protected _onScrollBarX(e:qx.event.type.Data):Unit;
    protected _onScrollBarY(e:qx.event.type.Data):Unit;
    protected _onScrollPaneX(e:qx.event.type.Data):Unit;
    protected _onScrollPaneY(e:qx.event.type.Data):Unit;
    getItemBottom(item:qx.ui.core.Widget):Int;
    getItemLeft(item:qx.ui.core.Widget):Int;
    getItemRight(item:qx.ui.core.Widget):Int;
    getItemTop(item:qx.ui.core.Widget):Int;
    getPaneSize():IMap;
    getScrollbarX():any;
    getScrollbarY():any;
    getScrollX():Int;
    getScrollY():Int;
    protected initScrollbarX(value:any):any;
    protected initScrollbarY(value:any):any;
    resetScrollbar():Unit;
    resetScrollbarX():Unit;
    resetScrollbarY():Unit;
    scrollByX(value:Int,duration?:Long):Unit;
    scrollByY(value:Int,duration?:Long):Unit;
    scrollToX(value:Int,duration?:Long):Unit;
    scrollToY(value:Int,duration?:Long):Unit;
    setScrollbar(scrollbarX:any,scrollbarY:any):Unit;
    setScrollbarX(value:any):any;
    setScrollbarY(value:any):any;
    stopScrollAnimationX():Unit;
    stopScrollAnimationY():Unit;

}
}
package qx.ui.core.scroll {
@js.native
trait IScrollBar extends js.Object {
    getKnobFactor():any;
    getMaximum():any;
    getOrientation():any;
    getPosition():any;
    protected initKnobFactor(value:any):any;
    protected initMaximum(value:any):any;
    protected initOrientation(value:any):any;
    protected initPosition(value:any):any;
    resetKnobFactor():Unit;
    resetMaximum():Unit;
    resetOrientation():Unit;
    resetPosition():Unit;
    scrollBy(offset:Int,duration:Long):Unit;
    scrollBySteps(steps:Int,duration:Long):Unit;
    scrollTo(position:Int,duration:Long):Unit;
    setKnobFactor(value:any):any;
    setMaximum(value:any):any;
    setOrientation(value:any):any;
    setPosition(value:any):any;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MRoll")
class MRoll extends js.Object {
    protected _addRollHandling():Unit;
    protected _onPointerDownForRoll(e:qx.event.type.Pointer):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _removeRollHandling():Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MScrollBarFactory")
class MScrollBarFactory extends js.Object {
    protected _createScrollBar(orientation?:String):qx.ui.core.scroll.IScrollBar;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MWheelHandling")
class MWheelHandling extends js.Object {
    protected _onMouseWheel(e:qx.event.type.Mouse):Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.NativeScrollBar")
class NativeScrollBar extends qx.ui.core.Widget implements qx.ui.core.scroll.IScrollBar {
    getKnobFactor():any;
    getMaximum():any;
    getOrientation():any;
    getPosition():any;
    resetKnobFactor():Unit;
    resetMaximum():Unit;
    resetOrientation():Unit;
    resetPosition():Unit;
    scrollBy(offset:Int,duration:Long):Unit;
    scrollBySteps(steps:Int,duration:Long):Unit;
    scrollTo(position:Int,duration:Long):Unit;
    setKnobFactor(value:any):any;
    setMaximum(value:any):any;
    setOrientation(value:any):any;
    setPosition(value:any):any;
    constructor (orientation?:String);
    protected _applyMaximum(value:Int,old:Int):Unit;
    protected _applyOrientation(value:any,old:any):Unit;
    protected _applyPosition(value:Long,old:Long):Unit;
    protected _getScrollPaneElement():qx.html.Element;
    protected _onAppear(e:qx.event.type.Data):Unit;
    protected _onScroll(e:qx.event.type.Event):Unit;
    protected _stopPropagation(e:qx.event.type.Event):Unit;
    protected _updateScrollBar():Unit;
    getSingleStep():Int;
    protected initSingleStep(value:any):Int;
    resetSingleStep():Unit;
    setSingleStep(value:any):Int;
    stopScrollAnimation():Unit;
    updatePosition(position:Long):Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollBar")
class ScrollBar extends qx.ui.core.Widget implements qx.ui.core.scroll.IScrollBar {
    getKnobFactor():any;
    getMaximum():any;
    getOrientation():any;
    getPosition():any;
    resetKnobFactor():Unit;
    resetMaximum():Unit;
    resetOrientation():Unit;
    resetPosition():Unit;
    scrollBy(offset:Int,duration:Long):Unit;
    scrollBySteps(steps:Int,duration:Long):Unit;
    scrollTo(position:Int,duration:Long):Unit;
    setKnobFactor(value:any):any;
    setMaximum(value:any):any;
    setOrientation(value:any):any;
    setPosition(value:any):any;
    constructor (orientation?:String);
    protected _applyKnobFactor(value:Long,old:Long):Unit;
    protected _applyMaximum(value:Int,old:Int):Unit;
    protected _applyOrientation(value:any,old:any):Unit;
    protected _applyPageStep(value:Int,old:Int):Unit;
    protected _applyPosition(value:any,old:any):Unit;
    protected _onChangeSliderValue(e:qx.event.type.Data):Unit;
    protected _onExecuteBegin(e:qx.event.type.Event):Unit;
    protected _onExecuteEnd(e:qx.event.type.Event):Unit;
    protected _onResizeSlider(e:qx.event.type.Data):Unit;
    protected _onSlideAnimationEnd():Unit;
    getPageStep():Int;
    getSingleStep():Int;
    protected initPageStep(value:any):Int;
    protected initSingleStep(value:any):Int;
    resetPageStep():Unit;
    resetSingleStep():Unit;
    setPageStep(value:any):Int;
    setSingleStep(value:any):Int;
    stopScrollAnimation():Unit;
    updatePosition(position:Long):Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollPane")
class ScrollPane extends qx.ui.core.Widget {
    constructor ();
    protected _applyScrollX(value:any,old:any):Unit;
    protected _applyScrollY(value:any,old:any):Unit;
    protected _onAppear(e:qx.event.type.Event):Unit;
    protected _onScroll(e:qx.event.type.Event):Unit;
    protected _onUpdate(e:qx.event.type.Event):Unit;
    add(widget?:qx.ui.core.Widget):Unit;
    getChildren():any[];
    getItemBottom(item:qx.ui.core.Widget):Int;
    getItemLeft(item:qx.ui.core.Widget):Int;
    getItemRight(item:qx.ui.core.Widget):Int;
    getItemTop(item:qx.ui.core.Widget):Int;
    getScrollMaxX():Int;
    getScrollMaxY():Int;
    getScrollSize():IMap;
    getScrollX():any;
    getScrollY():any;
    protected initScrollX(value:any):any;
    protected initScrollY(value:any):any;
    remove(widget?:qx.ui.core.Widget):Unit;
    resetScrollX():Unit;
    resetScrollY():Unit;
    scrollByX(x?:Int,duration?:Long):Unit;
    scrollByY(y?:Int,duration?:Long):Unit;
    scrollToX(value:Int,duration?:Long):Unit;
    scrollToY(value:Int,duration?:Long):Unit;
    setScrollX(value:any):any;
    setScrollY(value:any):any;
    stopScrollAnimation():Unit;

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollSlider")
class ScrollSlider extends qx.ui.form.Slider {
    constructor (orientation?:any);

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Abstract")
class Abstract extends qx.core.Object {
    constructor ();
    protected _addToSelection(item:any):Unit;
    protected _applyDefaultSelection(force:Boolean):any;
    protected _applyMode(value:any,old:any):Unit;
    protected _autoSelect():Unit;
    protected _capture():Unit;
    protected _cleanup():Unit;
    protected _clearSelection():Unit;
    protected _deselectItemRange(item1:any,item2:any):Unit;
    protected _fireChange(context:String):Unit;
    protected _getAnchorItem():any;
    protected _getDimension():IMap;
    protected _getFirstSelectable():any;
    protected _getLastSelectable():any;
    protected _getLocation():IMap;
    protected _getPage(lead:any,up?:Boolean):Unit;
    protected _getRelatedSelectable(item:any,relation:String):any;
    protected _getScroll():IMap;
    protected _getSelectableFromPointerEvent(event:qx.event.type.Pointer):any;
    protected _getSelectableLocationX(item:any):IMap;
    protected _getSelectableLocationY(item:any):IMap;
    protected _getSelectableRange(item1:any,item2:any):qx.data.Array;
    protected _getSelectedItem():any;
    protected _isSelectable(item:any):Boolean;
    protected _onInterval(e:qx.event.type.Event):Unit;
    protected _releaseCapture():Unit;
    protected _removeFromSelection(item:any):Unit;
    protected _replaceMultiSelection(items:qx.data.Array):Unit;
    protected _scrollBy(xoff:Int,yoff:Int):Unit;
    protected _scrollItemIntoView(item:any):Unit;
    protected _selectableToHashCode(item:any):String;
    protected _selectAllItems():Unit;
    protected _selectItemRange(item1:any,item2:any,extend?:Boolean):Unit;
    protected _setAnchorItem(value:any):Unit;
    protected _setLeadItem(value:any):Unit;
    protected _setSelectedItem(item:any):Unit;
    protected _styleSelectable(item:any,type:String,enabled:Boolean):Unit;
    protected _toggleInSelection(item:any):Unit;
    addItem(item:any):Unit;
    clearSelection():Unit;
    getDrag():Boolean;
    getLeadItem():any;
    getMode():any;
    getQuick():Boolean;
    getSelectables(all:Boolean):qx.data.Array;
    getSelectedItem():any;
    getSelection():any[];
    getSelectionContext():String;
    getSortedSelection():any[];
    handleAddItem(e:qx.event.type.Data):Unit;
    handleKeyPress(event:qx.event.type.KeySequence):Unit;
    handleLoseCapture(event:qx.event.type.Pointer):Unit;
    handlePointerDown(event:qx.event.type.Pointer):Unit;
    handlePointerMove(event:qx.event.type.Pointer):Unit;
    handlePointerOver(event:qx.event.type.Pointer):Unit;
    handleRemoveItem(e:qx.event.type.Data):Unit;
    handleTap(event:qx.event.type.Tap):Unit;
    protected initDrag(value:any):Boolean;
    protected initMode(value:any):any;
    protected initQuick(value:any):Boolean;
    invertSelection():Unit;
    isDrag():Boolean;
    isItemSelected(item:any):Boolean;
    isQuick():Boolean;
    isSelectionEmpty():Boolean;
    removeItem(item:any):Unit;
    replaceSelection(items:qx.data.Array):Unit;
    resetDrag():Unit;
    resetMode():Unit;
    resetQuick():Unit;
    selectAll():Unit;
    selectItem(item:any):Unit;
    selectItemRange(begin:any,end:any):Unit;
    setDrag(value:any):Boolean;
    setMode(value:any):any;
    setQuick(value:any):Boolean;
    toggleDrag():Boolean;
    toggleQuick():Boolean;

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.ScrollArea")
class ScrollArea extends qx.ui.core.selection.Widget {

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Widget")
class Widget extends qx.ui.core.selection.Abstract {
    constructor (widget?:qx.ui.core.Widget);
    protected _getWidget():qx.ui.core.Widget;
    protected _isItemSelectable(item:qx.ui.core.Widget):Boolean;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Abstract")
class Abstract extends qx.core.Object implements qx.ui.decoration.IDecorator {
    getInsets():IMap;
    getPadding():IMap;
    getStyles():IMap;
    protected _getDefaultInsets():IMap;
    protected _isInitialized():Boolean;
    protected _resetInsets():Unit;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Decorator")
class Decorator extends qx.ui.decoration.Abstract implements qx.ui.decoration.IDecorator {
    getInsets():IMap;
    getPadding():IMap;
    getStyles():IMap;
    getBackgroundColor():String;
    resetBackgroundColor():Unit;
    setBackgroundColor(value:any):String;
    getRadiusBottomLeft():Int;
    getRadiusBottomRight():Int;
    getRadiusTopLeft():Int;
    getRadiusTopRight():Int;
    resetRadius():Unit;
    resetRadiusBottomLeft():Unit;
    resetRadiusBottomRight():Unit;
    resetRadiusTopLeft():Unit;
    resetRadiusTopRight():Unit;
    setRadius(radiusTopLeft:any,radiusTopRight:any,radiusBottomRight:any,radiusBottomLeft:any):Unit;
    setRadiusBottomLeft(value:any):Int;
    setRadiusBottomRight(value:any):Int;
    setRadiusTopLeft(value:any):Int;
    setRadiusTopRight(value:any):Int;
    getInset():Boolean;
    getShadowBlurRadius():Int;
    getShadowColor():String;
    getShadowHorizontalLength():Int;
    getShadowSpreadRadius():Int;
    getShadowVerticalLength():Int;
    isInset():Boolean;
    resetInset():Unit;
    resetShadowBlurRadius():Unit;
    resetShadowColor():Unit;
    resetShadowHorizontalLength():Unit;
    resetShadowLength():Unit;
    resetShadowSpreadRadius():Unit;
    resetShadowVerticalLength():Unit;
    setInset(value:any):Boolean;
    setShadowBlurRadius(value:any):Int;
    setShadowColor(value:any):String;
    setShadowHorizontalLength(value:any):Int;
    setShadowLength(shadowHorizontalLength:any,shadowVerticalLength:any):Unit;
    setShadowSpreadRadius(value:any):Int;
    setShadowVerticalLength(value:any):Int;
    toggleInset():Boolean;
    getInnerColorBottom():String;
    getInnerColorLeft():String;
    getInnerColorRight():String;
    getInnerColorTop():String;
    getInnerOpacity():Long;
    getInnerWidthBottom():Long;
    getInnerWidthLeft():Long;
    getInnerWidthRight():Long;
    getInnerWidthTop():Long;
    resetInnerColor():Unit;
    resetInnerColorBottom():Unit;
    resetInnerColorLeft():Unit;
    resetInnerColorRight():Unit;
    resetInnerColorTop():Unit;
    resetInnerOpacity():Unit;
    resetInnerWidth():Unit;
    resetInnerWidthBottom():Unit;
    resetInnerWidthLeft():Unit;
    resetInnerWidthRight():Unit;
    resetInnerWidthTop():Unit;
    setInnerColor(innerColorTop:any,innerColorRight:any,innerColorBottom:any,innerColorLeft:any):Unit;
    setInnerColorBottom(value:any):String;
    setInnerColorLeft(value:any):String;
    setInnerColorRight(value:any):String;
    setInnerColorTop(value:any):String;
    setInnerOpacity(value:any):Long;
    setInnerWidth(innerWidthTop:any,innerWidthRight:any,innerWidthBottom:any,innerWidthLeft:any):Unit;
    setInnerWidthBottom(value:any):Long;
    setInnerWidthLeft(value:any):Long;
    setInnerWidthRight(value:any):Long;
    setInnerWidthTop(value:any):Long;
    getColorPositionUnit():any;
    getEndColor():String;
    getEndColorPosition():Long;
    getOrientation():any;
    getStartColor():String;
    getStartColorPosition():Long;
    resetColorPositionUnit():Unit;
    resetEndColor():Unit;
    resetEndColorPosition():Unit;
    resetGradientEnd():Unit;
    resetGradientStart():Unit;
    resetOrientation():Unit;
    resetStartColor():Unit;
    resetStartColorPosition():Unit;
    setColorPositionUnit(value:any):any;
    setEndColor(value:any):String;
    setEndColorPosition(value:any):Long;
    setGradientEnd(endColor:any,endColorPosition:any):Unit;
    setGradientStart(startColor:any,startColorPosition:any):Unit;
    setOrientation(value:any):any;
    setStartColor(value:any):String;
    setStartColorPosition(value:any):Long;
    getBorderImage():String;
    getBorderImageMode():any;
    getFill():Boolean;
    getRepeatX():any;
    getRepeatY():any;
    getSliceBottom():Int;
    getSliceLeft():Int;
    getSliceRight():Int;
    getSliceTop():Int;
    isFill():Boolean;
    resetBorderImage():Unit;
    resetBorderImageMode():Unit;
    resetFill():Unit;
    resetRepeat():Unit;
    resetRepeatX():Unit;
    resetRepeatY():Unit;
    resetSlice():Unit;
    resetSliceBottom():Unit;
    resetSliceLeft():Unit;
    resetSliceRight():Unit;
    resetSliceTop():Unit;
    setBorderImage(value:any):String;
    setBorderImageMode(value:any):any;
    setFill(value:any):Boolean;
    setRepeat(repeatX:any,repeatY:any):Unit;
    setRepeatX(value:any):any;
    setRepeatY(value:any):any;
    setSlice(sliceTop:any,sliceRight:any,sliceBottom:any,sliceLeft:any):Unit;
    setSliceBottom(value:any):Int;
    setSliceLeft(value:any):Int;
    setSliceRight(value:any):Int;
    setSliceTop(value:any):Int;
    toggleFill():Boolean;
    protected _getStyles():IMap;

}
}
package qx.ui.decoration {
@js.native
trait IDecorator extends js.Object {
    getInsets():IMap;
    getPadding():IMap;
    getStyles():IMap;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundColor")
class MBackgroundColor extends js.Object {
    protected _applyBackgroundColor(value:String,old:String):Unit;
    protected _styleBackgroundColor(styles:IMap):Unit;
    getBackgroundColor():String;
    protected initBackgroundColor(value:any):String;
    resetBackgroundColor():Unit;
    setBackgroundColor(value:any):String;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundImage")
class MBackgroundImage extends js.Object {
    protected _applyBackgroundImage(value:any,old:any):Unit;
    protected _applyBackgroundPosition(value:any,old:any):Unit;
    protected _styleBackgroundImage(styles:IMap):Unit;
    getBackgroundImage():String;
    getBackgroundPositionX():any;
    getBackgroundPositionY():any;
    getBackgroundRepeat():any;
    protected initBackgroundImage(value:any):String;
    protected initBackgroundPositionX(value:any):any;
    protected initBackgroundPositionY(value:any):any;
    protected initBackgroundRepeat(value:any):any;
    resetBackgroundImage():Unit;
    resetBackgroundPosition():Unit;
    resetBackgroundPositionX():Unit;
    resetBackgroundPositionY():Unit;
    resetBackgroundRepeat():Unit;
    setBackgroundImage(value:any):String;
    setBackgroundPosition(backgroundPositionY:any,backgroundPositionX:any):Unit;
    setBackgroundPositionX(value:any):any;
    setBackgroundPositionY(value:any):any;
    setBackgroundRepeat(value:any):any;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderImage")
class MBorderImage extends js.Object {
    protected _applyBorderImage(value:any,old:any):Unit;
    protected _getDefaultInsetsForBorderImage():IMap;
    protected _styleBorderImage(styles:IMap):Unit;
    getBorderImage():String;
    getBorderImageMode():any;
    getFill():Boolean;
    getRepeatX():any;
    getRepeatY():any;
    getSliceBottom():Int;
    getSliceLeft():Int;
    getSliceRight():Int;
    getSliceTop():Int;
    protected initBorderImage(value:any):String;
    protected initBorderImageMode(value:any):any;
    protected initFill(value:any):Boolean;
    protected initRepeatX(value:any):any;
    protected initRepeatY(value:any):any;
    protected initSliceBottom(value:any):Int;
    protected initSliceLeft(value:any):Int;
    protected initSliceRight(value:any):Int;
    protected initSliceTop(value:any):Int;
    isFill():Boolean;
    resetBorderImage():Unit;
    resetBorderImageMode():Unit;
    resetFill():Unit;
    resetRepeat():Unit;
    resetRepeatX():Unit;
    resetRepeatY():Unit;
    resetSlice():Unit;
    resetSliceBottom():Unit;
    resetSliceLeft():Unit;
    resetSliceRight():Unit;
    resetSliceTop():Unit;
    setBorderImage(value:any):String;
    setBorderImageMode(value:any):any;
    setFill(value:any):Boolean;
    setRepeat(repeatX:any,repeatY:any):Unit;
    setRepeatX(value:any):any;
    setRepeatY(value:any):any;
    setSlice(sliceTop:any,sliceRight:any,sliceBottom:any,sliceLeft:any):Unit;
    setSliceBottom(value:any):Int;
    setSliceLeft(value:any):Int;
    setSliceRight(value:any):Int;
    setSliceTop(value:any):Int;
    toggleFill():Boolean;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderRadius")
class MBorderRadius extends js.Object {
    protected _applyBorderRadius(value:Int,old:Int):Unit;
    protected _styleBorderRadius(styles:IMap):Unit;
    getRadiusBottomLeft():Int;
    getRadiusBottomRight():Int;
    getRadiusTopLeft():Int;
    getRadiusTopRight():Int;
    protected initRadiusBottomLeft(value:any):Int;
    protected initRadiusBottomRight(value:any):Int;
    protected initRadiusTopLeft(value:any):Int;
    protected initRadiusTopRight(value:any):Int;
    resetRadius():Unit;
    resetRadiusBottomLeft():Unit;
    resetRadiusBottomRight():Unit;
    resetRadiusTopLeft():Unit;
    resetRadiusTopRight():Unit;
    setRadius(radiusTopLeft:any,radiusTopRight:any,radiusBottomRight:any,radiusBottomLeft:any):Unit;
    setRadiusBottomLeft(value:any):Int;
    setRadiusBottomRight(value:any):Int;
    setRadiusTopLeft(value:any):Int;
    setRadiusTopRight(value:any):Int;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBoxShadow")
class MBoxShadow extends js.Object {
    protected _applyBoxShadow(value:any,old:any):Unit;
    protected _styleBoxShadow(styles:IMap):Unit;
    getInset():Boolean;
    getShadowBlurRadius():Int;
    getShadowColor():String;
    getShadowHorizontalLength():Int;
    getShadowSpreadRadius():Int;
    getShadowVerticalLength():Int;
    protected initInset(value:any):Boolean;
    protected initShadowBlurRadius(value:any):Int;
    protected initShadowColor(value:any):String;
    protected initShadowHorizontalLength(value:any):Int;
    protected initShadowSpreadRadius(value:any):Int;
    protected initShadowVerticalLength(value:any):Int;
    isInset():Boolean;
    resetInset():Unit;
    resetShadowBlurRadius():Unit;
    resetShadowColor():Unit;
    resetShadowHorizontalLength():Unit;
    resetShadowLength():Unit;
    resetShadowSpreadRadius():Unit;
    resetShadowVerticalLength():Unit;
    setInset(value:any):Boolean;
    setShadowBlurRadius(value:any):Int;
    setShadowColor(value:any):String;
    setShadowHorizontalLength(value:any):Int;
    setShadowLength(shadowHorizontalLength:any,shadowVerticalLength:any):Unit;
    setShadowSpreadRadius(value:any):Int;
    setShadowVerticalLength(value:any):Int;
    toggleInset():Boolean;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MDoubleBorder")
class MDoubleBorder extends js.Object {
    getColorBottom():String;
    getColorLeft():String;
    getColorRight():String;
    getColorTop():String;
    getStyleBottom():any;
    getStyleLeft():any;
    getStyleRight():any;
    getStyleTop():any;
    getWidthBottom():Long;
    getWidthLeft():Long;
    getWidthRight():Long;
    getWidthTop():Long;
    resetBottom():Unit;
    resetColor():Unit;
    resetColorBottom():Unit;
    resetColorLeft():Unit;
    resetColorRight():Unit;
    resetColorTop():Unit;
    resetLeft():Unit;
    resetRight():Unit;
    resetStyle():Unit;
    resetStyleBottom():Unit;
    resetStyleLeft():Unit;
    resetStyleRight():Unit;
    resetStyleTop():Unit;
    resetTop():Unit;
    resetWidth():Unit;
    resetWidthBottom():Unit;
    resetWidthLeft():Unit;
    resetWidthRight():Unit;
    resetWidthTop():Unit;
    setBottom(widthBottom:any,styleBottom:any,colorBottom:any):Unit;
    setColor(colorTop:any,colorRight:any,colorBottom:any,colorLeft:any):Unit;
    setColorBottom(value:any):String;
    setColorLeft(value:any):String;
    setColorRight(value:any):String;
    setColorTop(value:any):String;
    setLeft(widthLeft:any,styleLeft:any,colorLeft:any):Unit;
    setRight(widthRight:any,styleRight:any,colorRight:any):Unit;
    setStyle(styleTop:any,styleRight:any,styleBottom:any,styleLeft:any):Unit;
    setStyleBottom(value:any):any;
    setStyleLeft(value:any):any;
    setStyleRight(value:any):any;
    setStyleTop(value:any):any;
    setTop(widthTop:any,styleTop:any,colorTop:any):Unit;
    setWidth(widthTop:any,widthRight:any,widthBottom:any,widthLeft:any):Unit;
    setWidthBottom(value:any):Long;
    setWidthLeft(value:any):Long;
    setWidthRight(value:any):Long;
    setWidthTop(value:any):Long;
    getBackgroundImage():String;
    getBackgroundPositionX():any;
    getBackgroundPositionY():any;
    getBackgroundRepeat():any;
    resetBackgroundImage():Unit;
    resetBackgroundPosition():Unit;
    resetBackgroundPositionX():Unit;
    resetBackgroundPositionY():Unit;
    resetBackgroundRepeat():Unit;
    setBackgroundImage(value:any):String;
    setBackgroundPosition(backgroundPositionY:any,backgroundPositionX:any):Unit;
    setBackgroundPositionX(value:any):any;
    setBackgroundPositionY(value:any):any;
    setBackgroundRepeat(value:any):any;
    constructor ();
    protected _applyDoubleBorder(value:any,old:any):Unit;
    getInnerColorBottom():String;
    getInnerColorLeft():String;
    getInnerColorRight():String;
    getInnerColorTop():String;
    getInnerOpacity():Long;
    getInnerWidthBottom():Long;
    getInnerWidthLeft():Long;
    getInnerWidthRight():Long;
    getInnerWidthTop():Long;
    protected initInnerColorBottom(value:any):String;
    protected initInnerColorLeft(value:any):String;
    protected initInnerColorRight(value:any):String;
    protected initInnerColorTop(value:any):String;
    protected initInnerOpacity(value:any):Long;
    protected initInnerWidthBottom(value:any):Long;
    protected initInnerWidthLeft(value:any):Long;
    protected initInnerWidthRight(value:any):Long;
    protected initInnerWidthTop(value:any):Long;
    resetInnerColor():Unit;
    resetInnerColorBottom():Unit;
    resetInnerColorLeft():Unit;
    resetInnerColorRight():Unit;
    resetInnerColorTop():Unit;
    resetInnerOpacity():Unit;
    resetInnerWidth():Unit;
    resetInnerWidthBottom():Unit;
    resetInnerWidthLeft():Unit;
    resetInnerWidthRight():Unit;
    resetInnerWidthTop():Unit;
    setInnerColor(innerColorTop:any,innerColorRight:any,innerColorBottom:any,innerColorLeft:any):Unit;
    setInnerColorBottom(value:any):String;
    setInnerColorLeft(value:any):String;
    setInnerColorRight(value:any):String;
    setInnerColorTop(value:any):String;
    setInnerOpacity(value:any):Long;
    setInnerWidth(innerWidthTop:any,innerWidthRight:any,innerWidthBottom:any,innerWidthLeft:any):Unit;
    setInnerWidthBottom(value:any):Long;
    setInnerWidthLeft(value:any):Long;
    setInnerWidthRight(value:any):Long;
    setInnerWidthTop(value:any):Long;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MLinearBackgroundGradient")
class MLinearBackgroundGradient extends js.Object {
    protected _applyLinearBackgroundGradient(value:any,old:any):Unit;
    protected _styleLinearBackgroundGradient(styles:IMap):Unit;
    getColorPositionUnit():any;
    getEndColor():String;
    getEndColorPosition():Long;
    getOrientation():any;
    getStartColor():String;
    getStartColorPosition():Long;
    protected initColorPositionUnit(value:any):any;
    protected initEndColor(value:any):String;
    protected initEndColorPosition(value:any):Long;
    protected initOrientation(value:any):any;
    protected initStartColor(value:any):String;
    protected initStartColorPosition(value:any):Long;
    resetColorPositionUnit():Unit;
    resetEndColor():Unit;
    resetEndColorPosition():Unit;
    resetGradientEnd():Unit;
    resetGradientStart():Unit;
    resetOrientation():Unit;
    resetStartColor():Unit;
    resetStartColorPosition():Unit;
    setColorPositionUnit(value:any):any;
    setEndColor(value:any):String;
    setEndColorPosition(value:any):Long;
    setGradientEnd(endColor:any,endColorPosition:any):Unit;
    setGradientStart(startColor:any,startColorPosition:any):Unit;
    setOrientation(value:any):any;
    setStartColor(value:any):String;
    setStartColorPosition(value:any):Long;

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MSingleBorder")
class MSingleBorder extends js.Object {
    protected _applyStyle(value:any,old:any):Unit;
    protected _applyWidth(value:Long,old:Long):Unit;
    protected _getDefaultInsetsForBorder():IMap;
    protected _styleBorder(styles:IMap):Unit;
    getColorBottom():String;
    getColorLeft():String;
    getColorRight():String;
    getColorTop():String;
    getStyleBottom():any;
    getStyleLeft():any;
    getStyleRight():any;
    getStyleTop():any;
    getWidthBottom():Long;
    getWidthLeft():Long;
    getWidthRight():Long;
    getWidthTop():Long;
    protected initColorBottom(value:any):String;
    protected initColorLeft(value:any):String;
    protected initColorRight(value:any):String;
    protected initColorTop(value:any):String;
    protected initStyleBottom(value:any):any;
    protected initStyleLeft(value:any):any;
    protected initStyleRight(value:any):any;
    protected initStyleTop(value:any):any;
    protected initWidthBottom(value:any):Long;
    protected initWidthLeft(value:any):Long;
    protected initWidthRight(value:any):Long;
    protected initWidthTop(value:any):Long;
    resetBottom():Unit;
    resetColor():Unit;
    resetColorBottom():Unit;
    resetColorLeft():Unit;
    resetColorRight():Unit;
    resetColorTop():Unit;
    resetLeft():Unit;
    resetRight():Unit;
    resetStyle():Unit;
    resetStyleBottom():Unit;
    resetStyleLeft():Unit;
    resetStyleRight():Unit;
    resetStyleTop():Unit;
    resetTop():Unit;
    resetWidth():Unit;
    resetWidthBottom():Unit;
    resetWidthLeft():Unit;
    resetWidthRight():Unit;
    resetWidthTop():Unit;
    setBottom(widthBottom:any,styleBottom:any,colorBottom:any):Unit;
    setColor(colorTop:any,colorRight:any,colorBottom:any,colorLeft:any):Unit;
    setColorBottom(value:any):String;
    setColorLeft(value:any):String;
    setColorRight(value:any):String;
    setColorTop(value:any):String;
    setLeft(widthLeft:any,styleLeft:any,colorLeft:any):Unit;
    setRight(widthRight:any,styleRight:any,colorRight:any):Unit;
    setStyle(styleTop:any,styleRight:any,styleBottom:any,styleLeft:any):Unit;
    setStyleBottom(value:any):any;
    setStyleLeft(value:any):any;
    setStyleRight(value:any):any;
    setStyleTop(value:any):any;
    setTop(widthTop:any,styleTop:any,colorTop:any):Unit;
    setWidth(widthTop:any,widthRight:any,widthBottom:any,widthLeft:any):Unit;
    setWidthBottom(value:any):Long;
    setWidthLeft(value:any):Long;
    setWidthRight(value:any):Long;
    setWidthTop(value:any):Long;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.AbstractIframe")
class AbstractIframe extends qx.ui.core.Widget {
    constructor (source?:String);
    protected _applyFrameName(value:String,old:String):Unit;
    protected _applySource(value:String,old:String):Unit;
    protected _getIframeElement():qx.html.Iframe;
    getBody():HTMLElement;
    getDocument():Document;
    getFrameName():String;
    getName():String;
    getSource():String;
    getWindow():Window;
    protected initFrameName(value:any):String;
    protected initSource(value:any):String;
    reload():Unit;
    resetFrameName():Unit;
    resetSource():Unit;
    setFrameName(value:any):String;
    setSource(value:any):String;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Canvas")
class Canvas extends qx.ui.core.Widget {
    constructor (canvasWidth?:Int,canvasHeight?:Int);
    protected _applyCanvasHeight(value:Int,old:Int):Unit;
    protected _applyCanvasWidth(value:Int,old:Int):Unit;
    protected _draw(width:Int,height:Int,context:CanvasRenderingContext2D):Unit;
    protected _onResize(e:qx.event.type.Data):Unit;
    getCanvasHeight():Int;
    getCanvasWidth():Int;
    getContext2d():CanvasRenderingContext2D;
    getSyncDimension():Boolean;
    protected initCanvasHeight(value:any):Int;
    protected initCanvasWidth(value:any):Int;
    protected initSyncDimension(value:any):Boolean;
    isSyncDimension():Boolean;
    resetCanvasHeight():Unit;
    resetCanvasWidth():Unit;
    resetSyncDimension():Unit;
    setCanvasHeight(value:any):Int;
    setCanvasWidth(value:any):Int;
    setSyncDimension(value:any):Boolean;
    toggleSyncDimension():Boolean;
    update():Unit;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Flash")
class Flash extends qx.ui.core.Widget {
    constructor (source?:String,id?:String);
    protected _applyAllowScriptAccess(value:any,old:any):Unit;
    protected _applyId(value:String,old:String):Unit;
    protected _applyLiveConnect(value:Boolean,old:Boolean):Unit;
    protected _applyLoop(value:Boolean,old:Boolean):Unit;
    protected _applyMayScript(value:Boolean,old:Boolean):Unit;
    protected _applyMenu(value:Boolean,old:Boolean):Unit;
    protected _applyPlay(value:Boolean,old:Boolean):Unit;
    protected _applyQuality(value:any,old:any):Unit;
    protected _applyScale(value:any,old:any):Unit;
    protected _applySource(value:String,old:String):Unit;
    protected _applyVariables(value:IMap,old:IMap):Unit;
    protected _applyWmode(value:any,old:any):Unit;
    protected _checkLoading():Unit;
    getAllowScriptAccess():any;
    getFlashElement():HTMLElement;
    getId():String;
    getLiveConnect():Boolean;
    getLoadTimeout():Int;
    getLoop():Boolean;
    getMayScript():Boolean;
    getMenu():Boolean;
    getPercentLoaded():Int;
    getPlay():Boolean;
    getQuality():any;
    getScale():any;
    getSource():String;
    getVariables():IMap;
    getWmode():any;
    protected initAllowScriptAccess(value:any):any;
    protected initId(value:any):String;
    protected initLiveConnect(value:any):Boolean;
    protected initLoadTimeout(value:any):Int;
    protected initLoop(value:any):Boolean;
    protected initMayScript(value:any):Boolean;
    protected initMenu(value:any):Boolean;
    protected initPlay(value:any):Boolean;
    protected initQuality(value:any):any;
    protected initScale(value:any):any;
    protected initSource(value:any):String;
    protected initVariables(value:any):IMap;
    protected initWmode(value:any):any;
    isLiveConnect():Boolean;
    isLoaded():Boolean;
    isLoop():Boolean;
    isMayScript():Boolean;
    isMenu():Boolean;
    isPlay():Boolean;
    resetAllowScriptAccess():Unit;
    resetId():Unit;
    resetLiveConnect():Unit;
    resetLoadTimeout():Unit;
    resetLoop():Unit;
    resetMayScript():Unit;
    resetMenu():Unit;
    resetPlay():Unit;
    resetQuality():Unit;
    resetScale():Unit;
    resetSource():Unit;
    resetVariables():Unit;
    resetWmode():Unit;
    setAllowScriptAccess(value:any):any;
    setId(value:any):String;
    setLiveConnect(value:any):Boolean;
    setLoadTimeout(value:any):Int;
    setLoop(value:any):Boolean;
    setMayScript(value:any):Boolean;
    setMenu(value:any):Boolean;
    setPlay(value:any):Boolean;
    setQuality(value:any):any;
    setScale(value:any):any;
    setSource(value:any):String;
    setVariables(value:any):IMap;
    setWmode(value:any):any;
    toggleLiveConnect():Boolean;
    toggleLoop():Boolean;
    toggleMayScript():Boolean;
    toggleMenu():Boolean;
    togglePlay():Boolean;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Html")
class Html extends qx.ui.core.Widget {
    getOverflowX():any;
    getOverflowY():any;
    resetOverflow():Unit;
    resetOverflowX():Unit;
    resetOverflowY():Unit;
    setOverflow(overflowX:any,overflowY:any):Unit;
    setOverflowX(value:any):any;
    setOverflowY(value:any):any;
    constructor (html?:String);
    protected _applyCssClass(value:String,old:String):Unit;
    protected _applyHtml(value:String,old:String):Unit;
    getCssClass():String;
    getHtml():String;
    protected initCssClass(value:any):String;
    protected initHtml(value:any):String;
    resetCssClass():Unit;
    resetHtml():Unit;
    setCssClass(value:any):String;
    setHtml(value:any):String;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Iframe")
class Iframe extends qx.ui.embed.AbstractIframe {
    constructor (source?:String);
    protected _applyNativeHelp(value:Boolean,old:Boolean):Unit;
    protected _applyScrollbar(value:any,old:any):Unit;
    protected _createBlockerElement():any;
    protected _onIframeLoad(e:qx.event.type.Event):Unit;
    protected _onNativeContextMenu(e:qx.event.type.Mouse):Unit;
    protected _syncSourceAfterDOMMove():Unit;
    block():Unit;
    getNativeHelp():Boolean;
    getScrollbar():any;
    protected initNativeHelp(value:any):Boolean;
    protected initScrollbar(value:any):any;
    isNativeHelp():Boolean;
    release():Unit;
    resetNativeHelp():Unit;
    resetScrollbar():Unit;
    setNativeHelp(value:any):Boolean;
    setScrollbar(value:any):any;
    toggleNativeHelp():Boolean;

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.ThemedIframe")
class ThemedIframe extends qx.ui.embed.AbstractIframe {
    constructor (source?:any);
    protected _addRollListener():Unit;
    protected _configureScrollbar(scrollbarId:String,show:Boolean,containerSize:Int,contentSize:Int):Unit;
    protected _disableScollbars():Unit;
    protected _getIframeSize():any;
    protected _onIframeLoad():Unit;
    protected _onIframeObserverInterval():Unit;
    protected _onIframeResize():Unit;
    protected _onScrollBarX(e:qx.event.type.Data):Unit;
    protected _onScrollBarY(e:qx.event.type.Data):Unit;
    protected _preventIframeScrolling():Unit;
    protected _startIframeObserver():Unit;
    protected _stopIframeObserver():Unit;
    protected _updateCornerWidget():Unit;
    protected _updateScrollbars():Unit;
    getScrollbarX():any;
    getScrollbarY():any;
    protected initScrollbarX(value:any):any;
    protected initScrollbarY(value:any):any;
    resetScrollbar():Unit;
    resetScrollbarX():Unit;
    resetScrollbarY():Unit;
    scrollToX(x:Int):Unit;
    scrollToY(y:Int):Unit;
    setScrollbar(scrollbarX:any,scrollbarY:any):Unit;
    setScrollbarX(value:any):any;
    setScrollbarY(value:any):any;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractField")
class AbstractField extends qx.ui.core.Widget implements qx.ui.form.IStringForm,qx.ui.form.IForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (value?:String);
    protected _applyMaxLength(value:Int,old:Int):Unit;
    protected _applyPlaceholder(value:String,old:String):Unit;
    protected _applyReadOnly(value:Boolean,old:Boolean):Unit;
    protected _applyTextAlign(value:any,old:any):Unit;
    protected _createInputElement():qx.html.Input;
    protected _getPlaceholderElement():Unit;
    protected _getTextSize():IMap;
    protected _onChangeContent(e:qx.event.type.Data):Unit;
    protected _onChangeLocale(e:qx.event.type.Event):Unit;
    protected _onHtmlInput(e:qx.event.type.Data):Unit;
    protected _onPointerDownPlaceholder():Unit;
    protected _onWebFontStatusChange(ev:qx.event.type.Data):Unit;
    protected _removePlaceholder():Unit;
    protected _renderContentElement(innerHeight:Int,element:HTMLElement):Unit;
    protected _showPlaceholder():Unit;
    protected _syncPlaceholder():Unit;
    clearTextSelection():Unit;
    getFilter():js.RegExp;
    getLiveUpdate():Boolean;
    getMaxLength():Int;
    getPlaceholder():String;
    getReadOnly():Boolean;
    getTextAlign():any;
    getTextSelection():String;
    getTextSelectionEnd():Int;
    getTextSelectionLength():Int;
    getTextSelectionStart():Int;
    protected initFilter(value:any):js.RegExp;
    protected initLiveUpdate(value:any):Boolean;
    protected initMaxLength(value:any):Int;
    protected initPlaceholder(value:any):String;
    protected initReadOnly(value:any):Boolean;
    protected initTextAlign(value:any):any;
    isLiveUpdate():Boolean;
    isReadOnly():Boolean;
    resetFilter():Unit;
    resetLiveUpdate():Unit;
    resetMaxLength():Unit;
    resetPlaceholder():Unit;
    resetReadOnly():Unit;
    resetTextAlign():Unit;
    selectAllText():Unit;
    setFilter(value:any):js.RegExp;
    setLiveUpdate(value:any):Boolean;
    setMaxLength(value:any):Int;
    setPlaceholder(value:any):String;
    setReadOnly(value:any):Boolean;
    setTextAlign(value:any):any;
    setTextSelection(start:Int,end:Int):Unit;
    toggleLiveUpdate():Boolean;
    toggleReadOnly():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractSelectBox")
class AbstractSelectBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor ();
    protected _applyMaxListHeight(value:Long,old:Long):Unit;
    protected _defaultFormat(item:any):String;
    protected _onBlur(e:qx.event.type.Focus):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onListChangeSelection(e:qx.event.type.Data):Unit;
    protected _onListPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onPopupChangeVisibility(e:qx.event.type.Data):Unit;
    protected _onResize(e:qx.event.type.Data):Unit;
    close():Unit;
    getFormat():js.Function;
    getMaxListHeight():Long;
    protected initFormat(value:any):js.Function;
    protected initMaxListHeight(value:any):Long;
    open():Unit;
    resetFormat():Unit;
    resetMaxListHeight():Unit;
    setFormat(value:any):js.Function;
    setMaxListHeight(value:any):Long;
    toggle():Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Button")
class Button extends qx.ui.basic.Atom implements qx.ui.form.IExecutable {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    resetCommand():Unit;
    constructor (label?:String,icon?:String,command?:qx.ui.command.Command);
    protected _onKeyDown(e:qx.event.type.Event):Unit;
    protected _onKeyUp(e:qx.event.type.Event):Unit;
    protected _onPointerDown(e:qx.event.type.Event):Unit;
    protected _onPointerOut(e:qx.event.type.Event):Unit;
    protected _onPointerOver(e:qx.event.type.Event):Unit;
    protected _onPointerUp(e:qx.event.type.Event):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    press():Unit;
    release():Unit;
    reset():Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.CheckBox")
class CheckBox extends qx.ui.form.ToggleButton implements qx.ui.form.IForm,qx.ui.form.IModel {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (label?:String);

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ComboBox")
class ComboBox extends qx.ui.form.AbstractSelectBox implements qx.ui.form.IStringForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    constructor ();
    protected _applyPlaceholder(value:String,old:String):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    protected _onTextFieldChangeValue(e:qx.event.type.Data):Unit;
    protected _setPreselectedItem():Unit;
    clearTextSelection():Unit;
    getPlaceholder():String;
    getTextSelection():String;
    getTextSelectionLength():Int;
    protected initPlaceholder(value:any):String;
    resetAllTextSelection():Unit;
    resetPlaceholder():Unit;
    selectAllText():Unit;
    setPlaceholder(value:any):String;
    setTextSelection(start:Int,end:Int):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.DateField")
class DateField extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.form.IDateForm {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getValue():js.Date;
    resetValue():Unit;
    setValue(value:js.Date):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor ();
    static getDefaultDateFormatter():qx.util.format.DateFormat;
    protected _addLocaleChangeListener():Unit;
    protected _applyDateFormat(value:qx.util.format.DateFormat,old:qx.util.format.DateFormat):Unit;
    protected _applyPlaceholder(value:String,old:String):Unit;
    protected _onBlur(e:qx.event.type.Focus):Unit;
    protected _onChangeDate(e:qx.event.type.Pointer):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onPopupChangeVisibility(e:qx.event.type.Data):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    protected _onTextFieldChangeValue(e:qx.event.type.Data):Unit;
    protected _setDefaultDateFormat():Unit;
    close():Unit;
    getDateFormat():qx.util.format.DateFormat;
    getPlaceholder():String;
    protected initDateFormat(value:any):qx.util.format.DateFormat;
    protected initPlaceholder(value:any):String;
    isEmpty():Boolean;
    open():Unit;
    resetDateFormat():Unit;
    resetPlaceholder():Unit;
    setDateFormat(value:any):qx.util.format.DateFormat;
    setPlaceholder(value:any):String;
    toggle():Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Form")
class Form extends qx.core.Object {
    constructor ();
    protected _createResetter():qx.ui.form.Resetter;
    protected _createValidationManager():qx.ui.form.validation.Manager;
    add(item:qx.ui.form.IForm,label:String,validator?:js.Function,name?:String,validatorContext?:any,options?:IMap):Unit;
    addButton(button:qx.ui.form.Button,options?:IMap):Unit;
    addGroupHeader(title:String,options?:IMap):Unit;
    getButtonOptions():qx.data.Array;
    getButtons():qx.data.Array;
    getGroups():qx.data.Array;
    getItems():IMap;
    getValidationManager():qx.ui.form.validation.Manager;
    redefineResetter():Unit;
    redefineResetterItem(item:qx.ui.core.Widget):Unit;
    remove(item:qx.ui.form.IForm):Boolean;
    removeButton(button:qx.ui.form.Button):Boolean;
    removeGroupHeader(title:String):Boolean;
    reset():Unit;
    validate():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.HoverButton")
class HoverButton extends qx.ui.basic.Atom implements qx.ui.form.IExecutable {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    resetCommand():Unit;
    constructor (label?:String,icon?:String);
    protected _onInterval():Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    getFirstInterval():Int;
    getInterval():Int;
    getMinTimer():Int;
    getTimerDecrease():Int;
    protected initFirstInterval(value:any):Int;
    protected initInterval(value:any):Int;
    protected initMinTimer(value:any):Int;
    protected initTimerDecrease(value:any):Int;
    resetFirstInterval():Unit;
    resetInterval():Unit;
    resetMinTimer():Unit;
    resetTimerDecrease():Unit;
    setFirstInterval(value:any):Int;
    setInterval(value:any):Int;
    setMinTimer(value:any):Int;
    setTimerDecrease(value:any):Int;

}
}
package qx.ui.form {
@js.native
trait IBooleanForm extends js.Object {
    getValue():Boolean;
    resetValue():Unit;
    setValue(value:Boolean):Unit;

}
}
package qx.ui.form {
@js.native
trait IColorForm extends js.Object {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;

}
}
package qx.ui.form {
@js.native
trait IDateForm extends js.Object {
    getValue():js.Date;
    resetValue():Unit;
    setValue(value:js.Date):Unit;

}
}
package qx.ui.form {
@js.native
trait IExecutable extends js.Object {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;

}
}
package qx.ui.form {
@js.native
trait IForm extends js.Object {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;

}
}
package qx.ui.form {
@js.native
trait IModel extends js.Object {
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;

}
}
package qx.ui.form {
@js.native
trait IModelSelection extends js.Object {
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;

}
}
package qx.ui.form {
@js.native
trait INumberForm extends js.Object {
    getValue():Long;
    resetValue():Unit;
    setValue(value:Long):Unit;

}
}
package qx.ui.form {
@js.native
trait IRadioItem extends js.Object {
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;

}
}
package qx.ui.form {
@js.native
trait IRange extends js.Object {
    getMaximum():Long;
    getMinimum():Long;
    getPageStep():Long;
    getSingleStep():Long;
    setMaximum(max:Long):Unit;
    setMinimum(min:Long):Unit;
    setPageStep(step:Long):Unit;
    setSingleStep(step:Long):Unit;

}
}
package qx.ui.form {
@js.native
trait IStringForm extends js.Object {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.List")
class List extends qx.ui.core.scroll.AbstractScrollArea implements qx.ui.core.IMultiSelection,qx.ui.form.IForm,qx.ui.form.IModelSelection {
    addToSelection(item:qx.ui.core.Widget):Unit;
    removeFromSelection(item:qx.ui.core.Widget):Unit;
    selectAll():Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    getSelectionContext():String;
    getSelectionMode():any;
    getSortedSelection():qx.ui.core.Widget[];
    invertSelection():Unit;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelection():Unit;
    resetSelectionMode():Unit;
    selectRange(begin:qx.ui.core.Widget,end:qx.ui.core.Widget):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (horizontal?:Boolean);
    protected _applyOrientation(value:any,old:any):Unit;
    protected _applySpacing(value:Int,old:Int):Unit;
    protected _createListItemContainer():qx.ui.container.Composite;
    protected _onAddChild(e:qx.event.type.Data):Unit;
    protected _onKeyInput(e:qx.event.type.KeyInput):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Boolean;
    protected _onRemoveChild(e:qx.event.type.Data):Unit;
    findItem(search:String,ignoreCase?:Boolean):qx.ui.form.ListItem;
    findItemByLabelFuzzy(search:String):qx.ui.form.ListItem;
    getEnableInlineFind():Boolean;
    getOrientation():any;
    getSpacing():Int;
    handleKeyPress(e:qx.event.type.KeySequence):Unit;
    protected initEnableInlineFind(value:any):Boolean;
    protected initOrientation(value:any):any;
    protected initSpacing(value:any):Int;
    isEnableInlineFind():Boolean;
    resetEnableInlineFind():Unit;
    resetOrientation():Unit;
    resetSpacing():Unit;
    setEnableInlineFind(value:any):Boolean;
    setOrientation(value:any):any;
    setSpacing(value:any):Int;
    toggleEnableInlineFind():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ListItem")
class ListItem extends qx.ui.basic.Atom implements qx.ui.form.IModel {
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    constructor (label?:String,icon?:String,model?:String);
    protected _onPointerOut():Unit;
    protected _onPointerOver():Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MForm")
class MForm extends js.Object {
    constructor ();
    protected _applyValid(value:Boolean,old:Boolean):Unit;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    protected initInvalidMessage(value:any):String;
    protected initRequired(value:any):Boolean;
    protected initRequiredInvalidMessage(value:any):String;
    protected initValid(value:any):Boolean;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    setInvalidMessage(value:any):String;
    setRequired(value:any):Boolean;
    setRequiredInvalidMessage(value:any):String;
    setValid(value:any):Boolean;
    toggleRequired():Boolean;
    toggleValid():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelProperty")
class MModelProperty extends js.Object {
    protected _applyModel(value:any,old:any):Unit;
    getModel():any;
    protected initModel(value:any):any;
    resetModel():Unit;
    setModel(value:any):any;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelSelection")
class MModelSelection extends js.Object {
    constructor ();
    getModelSelection():qx.data.Array;
    setModelSelection(modelSelection:qx.data.Array):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MenuButton")
class MenuButton extends qx.ui.form.Button {
    constructor (label?:String,icon?:String,menu?:qx.ui.menu.Menu);
    protected _applyMenu(value:qx.ui.menu.Menu,old:qx.ui.menu.Menu):Unit;
    protected _onMenuChange(e:qx.event.type.Data):Unit;
    getMenu():qx.ui.menu.Menu;
    protected initMenu(value:any):qx.ui.menu.Menu;
    open(selectFirst?:Boolean):Unit;
    resetMenu():Unit;
    setMenu(value:any):qx.ui.menu.Menu;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.PasswordField")
class PasswordField extends qx.ui.form.TextField {

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButton")
class RadioButton extends qx.ui.form.Button implements qx.ui.form.IRadioItem,qx.ui.form.IForm,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    resetValue():Unit;
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (label?:String);
    protected _applyGroup(value:any,old:any):Unit;
    protected _applyValue(value:Boolean,old:Boolean):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected initGroup(value:any):qx.ui.form.RadioGroup;
    protected initValue(value:any):Boolean;
    isValue():Boolean;
    resetGroup():Unit;
    toggleValue():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButtonGroup")
class RadioButtonGroup extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.core.ISingleSelection,qx.ui.form.IModelSelection {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;
    static remap(members:IMap):Unit;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    constructor (layout?:qx.ui.layout.Abstract);
    protected _applyInvalidMessage(value:String,old:String):Unit;
    protected _applyValid(value:Boolean,old:Boolean):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    getRadioGroup():qx.ui.form.RadioGroup;
    protected initInvalidMessage(value:any):String;
    protected initRequired(value:any):Boolean;
    protected initRequiredInvalidMessage(value:any):String;
    protected initValid(value:any):Boolean;
    isRequired():Boolean;
    isValid():Boolean;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioGroup")
class RadioGroup extends qx.core.Object implements qx.ui.core.ISingleSelection,qx.ui.form.IForm,qx.ui.form.IModelSelection {
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;
    constructor (varargs?:qx.core.Object);
    protected _applyAllowEmptySelection(value:Boolean,old:Boolean):Unit;
    protected _applyEnabled(value:Boolean,old:Boolean):Unit;
    protected _applyInvalidMessage(value:String,old:String):Unit;
    protected _applyValid(value:Boolean,old:Boolean):Unit;
    protected _getItems():qx.ui.form.IRadioItem[];
    protected _isAllowEmptySelection():Boolean;
    protected _isItemSelectable(item:qx.ui.form.IRadioItem):Boolean;
    protected _onItemChangeChecked(e:qx.event.type.Data):Unit;
    add(varargs?:qx.ui.form.IRadioItem):Unit;
    getAllowEmptySelection():Boolean;
    getChildren():qx.ui.form.IRadioItem[];
    getItems():qx.ui.form.IRadioItem[];
    getWrap():Boolean;
    protected initAllowEmptySelection(value:any):Boolean;
    protected initEnabled(value:any):Boolean;
    protected initInvalidMessage(value:any):String;
    protected initRequired(value:any):Boolean;
    protected initRequiredInvalidMessage(value:any):String;
    protected initValid(value:any):Boolean;
    protected initWrap(value:any):Boolean;
    isAllowEmptySelection():Boolean;
    isEnabled():Boolean;
    isRequired():Boolean;
    isValid():Boolean;
    isWrap():Boolean;
    remove(item:qx.ui.form.IRadioItem):Unit;
    resetAllowEmptySelection():Unit;
    resetEnabled():Unit;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    resetWrap():Unit;
    selectNext():Unit;
    selectPrevious():Unit;
    setAllowEmptySelection(value:any):Boolean;
    setWrap(value:any):Boolean;
    toggleAllowEmptySelection():Boolean;
    toggleEnabled():Boolean;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    toggleWrap():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RepeatButton")
class RepeatButton extends qx.ui.form.Button {
    constructor (label?:String,icon?:String);
    protected _onInterval(e:qx.event.type.Event):Unit;
    getFirstInterval():Int;
    getInterval():Int;
    getMinTimer():Int;
    getTimerDecrease():Int;
    protected initFirstInterval(value:any):Int;
    protected initInterval(value:any):Int;
    protected initMinTimer(value:any):Int;
    protected initTimerDecrease(value:any):Int;
    resetFirstInterval():Unit;
    resetInterval():Unit;
    resetMinTimer():Unit;
    resetTimerDecrease():Unit;
    setFirstInterval(value:any):Int;
    setInterval(value:any):Int;
    setMinTimer(value:any):Int;
    setTimerDecrease(value:any):Int;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Resetter")
class Resetter extends qx.core.Object {
    constructor ();
    protected _supportsValue(formItem:qx.core.Object):Boolean;
    add(item:qx.ui.core.Widget):Unit;
    redefine():Unit;
    redefineItem(item:qx.ui.core.Widget):Unit;
    remove(item:qx.ui.core.Widget):Boolean;
    reset():Unit;
    resetItem(item:qx.ui.core.Widget):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SelectBox")
class SelectBox extends qx.ui.form.AbstractSelectBox implements qx.ui.core.ISingleSelection,qx.ui.form.IModelSelection {
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;
    constructor ();
    protected _getItems():qx.ui.form.ListItem[];
    protected _isAllowEmptySelection():Boolean;
    protected _onKeyInput(e:qx.event.type.KeyInput):Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Slider")
class Slider extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.form.INumberForm,qx.ui.form.IRange {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getValue():Long;
    resetValue():Unit;
    setValue(value:Long):Unit;
    getMaximum():Long;
    getMinimum():Long;
    getPageStep():Long;
    getSingleStep():Long;
    setMaximum(max:Long):Unit;
    setMinimum(min:Long):Unit;
    setPageStep(step:Long):Unit;
    setSingleStep(step:Long):Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (orientation?:String);
    protected _applyKnobFactor(value:Long,old:Long):Unit;
    protected _applyMaximum(value:Int,old:Int):Unit;
    protected _applyMinimum(value:Int,old:Int):Unit;
    protected _applyOrientation(value:any,old:any):Unit;
    protected _applyValue(value:any,old:any):Unit;
    protected _fireValue():Unit;
    protected _onInterval(e:qx.event.type.Event):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onPointerMove(e:qx.event.type.Pointer):Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    protected _onPointerUp(e:qx.event.type.Pointer):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _onUpdate(e:qx.event.type.Data):Unit;
    protected _positionToValue(position:Int):Int;
    protected _setKnobPosition(position:Int):Unit;
    protected _updateKnobPosition():Unit;
    protected _updateKnobSize():Unit;
    protected _valueToPosition(value:Int):Int;
    getKnobFactor():Long;
    getOrientation():any;
    protected initKnobFactor(value:any):Long;
    protected initMaximum(value:any):Int;
    protected initMinimum(value:any):Int;
    protected initOrientation(value:any):any;
    protected initPageStep(value:any):Int;
    protected initSingleStep(value:any):Int;
    protected initValue(value:any):any;
    resetKnobFactor():Unit;
    resetMaximum():Unit;
    resetMinimum():Unit;
    resetOrientation():Unit;
    resetPageStep():Unit;
    resetSingleStep():Unit;
    setKnobFactor(value:any):Long;
    setOrientation(value:any):any;
    slideBack():Unit;
    slideBy(offset:Int,duration:Long):Unit;
    slideForward():Unit;
    slidePageBack(duration:Long):Unit;
    slidePageForward(duration:Long):Unit;
    slideTo(value:Int,duration:Long):Unit;
    slideToBegin(duration:Long):Unit;
    slideToEnd(duration:Long):Unit;
    stopSlideAnimation():Unit;
    updatePosition(value:Long):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Spinner")
class Spinner extends qx.ui.core.Widget implements qx.ui.form.INumberForm,qx.ui.form.IRange,qx.ui.form.IForm {
    getValue():Long;
    resetValue():Unit;
    setValue(value:Long):Unit;
    getMaximum():Long;
    getMinimum():Long;
    getPageStep():Long;
    getSingleStep():Long;
    setMaximum(max:Long):Unit;
    setMinimum(min:Long):Unit;
    setPageStep(step:Long):Unit;
    setSingleStep(step:Long):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (min?:Long,value?:Long,max?:Long);
    protected _applyEditable(value:Boolean,old:Boolean):Unit;
    protected _applyMaximum(value:Long,old:Long):Unit;
    protected _applyMinimum(value:Long,old:Long):Unit;
    protected _applyNumberFormat(value:Boolean,old:Boolean):Unit;
    protected _applyValue(value:Long,old:Long):Unit;
    protected _applyWrap(value:Boolean,old:Boolean):Unit;
    protected _checkValue(value:any):Boolean;
    protected _countDown():Unit;
    protected _countUp():Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _getFilterRegExp():js.RegExp;
    protected _onChangeLocale(ev:qx.event.type.Event):Unit;
    protected _onChangeNumberFormat(ev:qx.event.type.Event):Unit;
    protected _onKeyDown(e:qx.event.type.KeySequence):Unit;
    protected _onKeyUp(e:qx.event.type.KeySequence):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _onTextChange(e:qx.event.type.Event):Unit;
    protected _updateButtons():Unit;
    getEditable():Boolean;
    getNumberFormat():qx.util.format.NumberFormat;
    getWrap():Boolean;
    gotoValue(value:Long):Long;
    protected initEditable(value:any):Boolean;
    protected initMaximum(value:any):Long;
    protected initMinimum(value:any):Long;
    protected initNumberFormat(value:any):qx.util.format.NumberFormat;
    protected initPageStep(value:any):Long;
    protected initSingleStep(value:any):Long;
    protected initValue(value:any):any;
    protected initWrap(value:any):Boolean;
    isEditable():Boolean;
    isWrap():Boolean;
    resetEditable():Unit;
    resetMaximum():Unit;
    resetMinimum():Unit;
    resetNumberFormat():Unit;
    resetPageStep():Unit;
    resetSingleStep():Unit;
    resetWrap():Unit;
    setEditable(value:any):Boolean;
    setNumberFormat(value:any):qx.util.format.NumberFormat;
    setWrap(value:any):Boolean;
    toggleEditable():Boolean;
    toggleWrap():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SplitButton")
class SplitButton extends qx.ui.core.Widget implements qx.ui.form.IExecutable {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    resetCommand():Unit;
    constructor (label?:String,icon?:String,menu?:qx.ui.menu.Menu,command?:qx.ui.command.Command);
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyMenu(value:qx.ui.menu.Menu,old:qx.ui.menu.Menu):Unit;
    protected _applyShow(value:any,old:any):Unit;
    protected _onButtonExecute(e:qx.event.type.Event):Unit;
    protected _onChangeMenuVisibility(e:qx.event.type.Data):Unit;
    protected _onKeyDown(e:qx.event.type.KeySequence):Unit;
    protected _onKeyUp(e:qx.event.type.KeySequence):Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    getIcon():String;
    getLabel():String;
    getMenu():qx.ui.menu.Menu;
    getShow():any;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initMenu(value:any):qx.ui.menu.Menu;
    protected initShow(value:any):any;
    resetIcon():Unit;
    resetLabel():Unit;
    resetMenu():Unit;
    resetShow():Unit;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setMenu(value:any):qx.ui.menu.Menu;
    setShow(value:any):any;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextArea")
class TextArea extends qx.ui.form.AbstractField {
    constructor (value?:String);
    protected _applyAutoSize(value:Boolean,old:Boolean):Unit;
    protected _applyMinimalLineHeight(value:Int,old:Int):Unit;
    protected _applyWrap(value:Boolean,old:Boolean):Unit;
    protected _getAreaHeight():Int;
    protected _getScrolledAreaHeight():Int;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _setAreaHeight(height:Int):Unit;
    getAutoSize():Boolean;
    getMinimalLineHeight():Int;
    getSingleStep():Int;
    getWrap():Boolean;
    protected initAutoSize(value:any):Boolean;
    protected initMinimalLineHeight(value:any):Int;
    protected initSingleStep(value:any):Int;
    protected initWrap(value:any):Boolean;
    isAutoSize():Boolean;
    isWrap():Boolean;
    resetAutoSize():Unit;
    resetMinimalLineHeight():Unit;
    resetSingleStep():Unit;
    resetWrap():Unit;
    setAutoSize(value:any):Boolean;
    setMinimalLineHeight(value:any):Int;
    setSingleStep(value:any):Int;
    setWrap(value:any):Boolean;
    toggleAutoSize():Boolean;
    toggleWrap():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextField")
class TextField extends qx.ui.form.AbstractField {
    protected _onKeyPress(evt:qx.event.type.KeySequence):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ToggleButton")
class ToggleButton extends qx.ui.basic.Atom implements qx.ui.form.IBooleanForm,qx.ui.form.IExecutable,qx.ui.form.IRadioItem {
    getValue():Boolean;
    resetValue():Unit;
    setValue(value:Boolean):Unit;
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    getGroup():qx.ui.form.RadioGroup;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    resetCommand():Unit;
    constructor (label?:String,icon?:String);
    protected _applyGroup(value:any,old:any):Unit;
    protected _applyTriState(value:Boolean,old:Boolean):Unit;
    protected _applyValue(value:Boolean,old:Boolean):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected _onKeyDown(e:qx.event.type.Event):Unit;
    protected _onKeyUp(e:qx.event.type.Event):Unit;
    protected _onPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    protected _onPointerUp(e:qx.event.type.Pointer):Unit;
    getTriState():Boolean;
    protected initGroup(value:any):qx.ui.form.RadioGroup;
    protected initTriState(value:any):Boolean;
    protected initValue(value:any):Boolean;
    isTriState():Boolean;
    isValue():Boolean;
    resetGroup():Unit;
    resetTriState():Unit;
    setTriState(value:any):Boolean;
    toggleTriState():Boolean;
    toggleValue():Boolean;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualComboBox")
class VirtualComboBox extends qx.ui.form.core.AbstractVirtualBox implements qx.ui.form.IStringForm {
    getValue():String;
    resetValue():Unit;
    setValue(value:String):Unit;
    constructor (model?:any);
    protected _applyPlaceholder(value:String,old:String):Unit;
    clearTextSelection():Unit;
    getDefaultFormat():js.Function;
    getPlaceholder():String;
    getTextSelection():String;
    getTextSelectionLength():Int;
    protected initDefaultFormat(value:any):js.Function;
    protected initPlaceholder(value:any):String;
    protected initValue(value:any):any;
    resetAllTextSelection():Unit;
    resetDefaultFormat():Unit;
    resetPlaceholder():Unit;
    selectAllText():Unit;
    setDefaultFormat(value:any):js.Function;
    setPlaceholder(value:any):String;
    setTextSelection(start:Int,end:Int):Unit;

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualSelectBox")
class VirtualSelectBox extends qx.ui.form.core.AbstractVirtualBox implements qx.data.controller.ISelection {
    getSelection():qx.data.IListData;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;
    constructor (model?:any);
    protected _addBindings():Unit;
    protected _applySelection(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _onPointerOut(event:qx.event.type.Pointer):Unit;
    protected _onPointerOver(event:qx.event.type.Pointer):Unit;
    protected _removeBindings():Unit;
    protected initSelection(value:any):qx.data.Array;

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.AbstractVirtualBox")
class AbstractVirtualBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (model?:qx.data.Array);
    protected _applyDelegate(value:any,old:any):Unit;
    protected _applyIconOptions(value:any,old:any):Unit;
    protected _applyIconPath(value:String,old:String):Unit;
    protected _applyLabelOptions(value:any,old:any):Unit;
    protected _applyLabelPath(value:String,old:String):Unit;
    protected _applyMaxListHeight(value:Long,old:Long):Unit;
    protected _applyModel(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _applyRowHeight(value:Int,old:Int):Unit;
    protected _beforeClose():Unit;
    protected _beforeOpen():Unit;
    protected _getAction(event:qx.event.type.KeySequence):String;
    protected _getBindPath(source:String,path?:String):String;
    protected _handleKeyboard(event:qx.event.type.KeySequence):Unit;
    protected _handlePointer(event:qx.event.type.Pointer):Unit;
    protected _isModifierPressed(event:qx.event.type.KeySequence):Boolean;
    protected _onBlur(event:qx.event.type.Focus):Unit;
    protected _onPopupChangeVisibility(event:qx.event.type.Data):Unit;
    protected _onResize(event:qx.event.type.Data):Unit;
    close():Unit;
    getDelegate():any;
    getIconOptions():any;
    getIconPath():String;
    getItemHeight():Int;
    getLabelOptions():any;
    getLabelPath():String;
    getMaxListHeight():Long;
    getModel():qx.data.Array;
    protected initDelegate(value:any):any;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initItemHeight(value:any):Int;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    protected initMaxListHeight(value:any):Long;
    protected initModel(value:any):qx.data.Array;
    open():Unit;
    refresh():Unit;
    resetDelegate():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetItemHeight():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    resetMaxListHeight():Unit;
    resetModel():Unit;
    setDelegate(value:any):any;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setItemHeight(value:any):Int;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;
    setMaxListHeight(value:any):Long;
    setModel(value:any):qx.data.Array;
    toggle():Unit;

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.VirtualDropDownList")
class VirtualDropDownList extends qx.ui.popup.Popup {
    constructor (target?:qx.ui.form.core.AbstractVirtualBox);
    protected _applySelection(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _handleKeyboard(event:qx.event.type.KeySequence):Unit;
    protected _handlePointer(event:qx.event.type.Mouse):Unit;
    protected _onChangeDelegate(event:qx.event.type.Data):Unit;
    protected _onChangeModel(event:qx.event.type.Data):Unit;
    protected _onListChangeSelection(event:qx.event.type.Data):Unit;
    close():Unit;
    getSelection():qx.data.Array;
    protected initSelection(value:any):qx.data.Array;
    open():Unit;
    resetSelection():Unit;
    setPreselected(modelItem:any):Unit;
    setSelection(value:any):qx.data.Array;

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.AbstractRenderer")
class AbstractRenderer extends qx.ui.core.Widget implements qx.ui.form.renderer.IFormRenderer {
    addButton(button:qx.ui.form.Button,options?:IMap):Unit;
    addItems(items:qx.ui.core.Widget[],names:String[],title?:String,itemsOptions?:qx.data.Array,headerOptions?:IMap):Unit;
    constructor (form?:qx.ui.form.Form);
    protected _connectVisibility(item:qx.ui.core.Widget,label:qx.ui.basic.Label):Unit;
    protected _createLabelText(name:String,item:qx.ui.form.IForm):String;
    protected _onChangeLocale(e:qx.event.type.Event):Unit;
    protected _onFormChange():Unit;
    protected _render():Unit;

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Double")
class Double extends qx.ui.form.renderer.AbstractRenderer {
    constructor (form?:any);
    protected _createHeader(title:String):qx.ui.basic.Label;
    protected _createLabel(name:String,item:qx.ui.core.Widget):qx.ui.basic.Label;
    getLayout():qx.ui.layout.Grid;

}
}
package qx.ui.form.renderer {
@js.native
trait IFormRenderer extends js.Object {
    addButton(button:qx.ui.form.Button,options?:IMap):Unit;
    addItems(items:qx.ui.core.Widget[],names:String[],title?:String,itemsOptions?:qx.data.Array,headerOptions?:IMap):Unit;

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Single")
class Single extends qx.ui.form.renderer.AbstractRenderer {
    constructor (form?:any);
    protected _createHeader(title:String):qx.ui.basic.Label;
    protected _createLabel(name:String,item:qx.ui.core.Widget):qx.ui.basic.Label;
    getLayout():qx.ui.layout.Grid;

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.SinglePlaceholder")
class SinglePlaceholder extends qx.ui.form.renderer.Single implements qx.ui.form.renderer.IFormRenderer {
    addButton(button:qx.ui.form.Button,options?:IMap):Unit;
    addItems(items:qx.ui.core.Widget[],names:String[],title?:String,itemsOptions?:qx.data.Array,headerOptions?:IMap):Unit;

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.AsyncValidator")
class AsyncValidator extends qx.core.Object {
    constructor (validator?:js.Function);
    setValid(valid:Boolean,message?:String):Unit;
    validate(item:qx.ui.core.Widget,value:any,manager:qx.ui.form.validation.Manager,context?:any):Unit;
    validateForm(items:qx.ui.core.Widget[],manager:qx.ui.form.validation.Manager,context?:any):Unit;

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.Manager")
class Manager extends qx.core.Object {
    constructor ();
    protected _setValid(value:Boolean):Unit;
    protected _showToolTip(valid:Boolean):Unit;
    add(formItem:qx.ui.core.Widget,validator:js.Function,context?:any):Unit;
    getContext():any;
    getInvalidFormItems():qx.data.Array;
    getInvalidMessage():String;
    getInvalidMessages():String[];
    getItems():qx.data.Array;
    getRequiredFieldMessage():String;
    getValid():Boolean;
    getValidator():any;
    protected initContext(value:any):any;
    protected initInvalidMessage(value:any):String;
    protected initRequiredFieldMessage(value:any):String;
    protected initValidator(value:any):any;
    isValid():Boolean;
    remove(formItem:qx.ui.core.Widget):qx.ui.core.Widget;
    reset():Unit;
    resetContext():Unit;
    resetInvalidMessage():Unit;
    resetRequiredFieldMessage():Unit;
    resetValidator():Unit;
    setContext(value:any):any;
    setFormValid(valid:Boolean):Unit;
    setInvalidMessage(value:any):String;
    setItemValid(formItem:qx.ui.core.Widget,valid:Boolean):Unit;
    setRequiredFieldMessage(value:any):String;
    setValidator(value:any):any;
    validate():Boolean;

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.CheckGroupBox")
class CheckGroupBox extends qx.ui.groupbox.GroupBox implements qx.ui.form.IExecutable,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    getValue():Boolean;
    resetValue():Unit;
    setValue(value:Boolean):Unit;
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected _onRadioChangeValue(e:qx.event.type.Data):Unit;

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.GroupBox")
class GroupBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor (legend?:String,icon?:String);
    protected _applyLegendPosition(e:any):Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _repositionFrame():Unit;
    getIcon():String;
    getLegend():String;
    getLegendPosition():any;
    protected initLegendPosition(value:any):any;
    resetLegendPosition():Unit;
    setIcon(icon:String):Unit;
    setLegend(legend:String):Unit;
    setLegendPosition(value:any):any;

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.RadioGroupBox")
class RadioGroupBox extends qx.ui.groupbox.GroupBox implements qx.ui.form.IRadioItem,qx.ui.form.IExecutable,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    resetValue():Unit;
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected _onRadioChangeValue(e:qx.event.type.Data):Unit;
    getLabel():String;

}
}
package qx.ui.indicator {
@js.native
@JSName("qx.ui.indicator.ProgressBar")
class ProgressBar extends qx.ui.container.Composite {
    constructor (value?:Long,maximum?:Long);
    protected _changeProgress(value:Long):Unit;
    getMaximum():Long;
    getValue():Long;
    setMaximum(value:Long):Long;
    setValue(value:Long):Long;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Abstract")
class Abstract extends qx.core.Object {
    protected _applyLayoutChange():Unit;
    protected _clearSeparators():Unit;
    protected _computeSizeHint():IMap;
    protected _getLayoutChildren():qx.data.Array;
    protected _getWidget():qx.ui.core.Widget;
    protected _renderSeparator(separator:String,bounds:IMap):Unit;
    connectToWidget(widget:qx.ui.core.Widget):Unit;
    getHeightForWidth(width:Int):Int;
    getSizeHint():IMap;
    hasHeightForWidth():Boolean;
    invalidateChildrenCache():Unit;
    invalidateLayoutCache():Unit;
    renderLayout(availWidth:Int,availHeight:Int,padding:IMap):Unit;
    verifyLayoutProperty(item:any,name:any,value:any):Unit;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Atom")
class Atom extends qx.ui.layout.Abstract {
    getCenter():Boolean;
    getGap():Int;
    getIconPosition():any;
    protected initCenter(value:any):Boolean;
    protected initGap(value:any):Int;
    protected initIconPosition(value:any):any;
    isCenter():Boolean;
    resetCenter():Unit;
    resetGap():Unit;
    resetIconPosition():Unit;
    setCenter(value:any):Boolean;
    setGap(value:any):Int;
    setIconPosition(value:any):any;
    toggleCenter():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Basic")
class Basic extends qx.ui.layout.Abstract {

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Canvas")
class Canvas extends qx.ui.layout.Abstract {
    getDesktop():Boolean;
    protected initDesktop(value:any):Boolean;
    isDesktop():Boolean;
    resetDesktop():Unit;
    setDesktop(value:any):Boolean;
    toggleDesktop():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Dock")
class Dock extends qx.ui.layout.Abstract {
    constructor (spacingX?:Int,spacingY?:Int,separatorX?:String,separatorY?:String);
    protected _applySort(value:any,old:any):Unit;
    protected _getSeparatorWidths():IMap;
    getConnectSeparators():Boolean;
    getSeparatorX():qx.ui.decoration.Decorator;
    getSeparatorY():qx.ui.decoration.Decorator;
    getSort():any;
    getSpacingX():Int;
    getSpacingY():Int;
    protected initConnectSeparators(value:any):Boolean;
    protected initSeparatorX(value:any):qx.ui.decoration.Decorator;
    protected initSeparatorY(value:any):qx.ui.decoration.Decorator;
    protected initSort(value:any):any;
    protected initSpacingX(value:any):Int;
    protected initSpacingY(value:any):Int;
    isConnectSeparators():Boolean;
    resetConnectSeparators():Unit;
    resetSeparatorX():Unit;
    resetSeparatorY():Unit;
    resetSort():Unit;
    resetSpacingX():Unit;
    resetSpacingY():Unit;
    setConnectSeparators(value:any):Boolean;
    setSeparatorX(value:any):qx.ui.decoration.Decorator;
    setSeparatorY(value:any):qx.ui.decoration.Decorator;
    setSort(value:any):any;
    setSpacingX(value:any):Int;
    setSpacingY(value:any):Int;
    toggleConnectSeparators():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Flow")
class Flow extends qx.ui.layout.Abstract {
    constructor (spacingX?:Int,spacingY?:Int,alignX?:String);
    getAlignX():any;
    getAlignY():any;
    getLastLineChildren(width:Long):qx.data.Array;
    getReversed():Boolean;
    getSpacingX():Int;
    getSpacingY():Int;
    protected initAlignX(value:any):any;
    protected initAlignY(value:any):any;
    protected initReversed(value:any):Boolean;
    protected initSpacingX(value:any):Int;
    protected initSpacingY(value:any):Int;
    isReversed():Boolean;
    resetAlignX():Unit;
    resetAlignY():Unit;
    resetReversed():Unit;
    resetSpacingX():Unit;
    resetSpacingY():Unit;
    setAlignX(value:any):any;
    setAlignY(value:any):any;
    setReversed(value:any):Boolean;
    setSpacingX(value:any):Int;
    setSpacingY(value:any):Int;
    toggleReversed():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grid")
class Grid extends qx.ui.layout.Abstract {
    constructor (spacingX?:Int,spacingY?:Int);
    protected _fixHeightsRowSpan(rowHeights:IMap[]):Unit;
    protected _fixWidthsColSpan(colWidths:IMap[]):Unit;
    protected _getColumnFlexOffsets(width:Int):Int[];
    protected _getColWidths():IMap[];
    protected _getRowFlexOffsets(height:Int):Int[];
    protected _getRowHeights():IMap[];
    protected _setColumnData(column:Int,key:String,value:any):Unit;
    protected _setRowData(row:Int,key:String,value:any):Unit;
    getCellAlign(row:Int,column:Int):IMap;
    getCellWidget(row:Int,column:Int):qx.ui.core.Widget;
    getColumnAlign(column:Int):IMap;
    getColumnCount():Int;
    getColumnFlex(column:Int):Int;
    getColumnMaxWidth(column:Int):Int;
    getColumnMinWidth(column:Int):Int;
    getColumnWidth(column:Int):Int;
    getRowAlign(row:Int):IMap;
    getRowCount():Int;
    getRowFlex(row:Int):Int;
    getRowHeight(row:Int):Int;
    getRowMaxHeight(row:Int):Int;
    getRowMinHeight(row:Int):Int;
    getSpacingX():Int;
    getSpacingY():Int;
    protected initSpacingX(value:any):Int;
    protected initSpacingY(value:any):Int;
    resetSpacingX():Unit;
    resetSpacingY():Unit;
    setColumnAlign(column:Int,hAlign:String,vAlign:String):qx.ui.layout.Grid;
    setColumnFlex(column:Int,flex:Int):qx.ui.layout.Grid;
    setColumnMaxWidth(column:Int,maxWidth:Int):qx.ui.layout.Grid;
    setColumnMinWidth(column:Int,minWidth:Int):qx.ui.layout.Grid;
    setColumnWidth(column:Int,width:Int):qx.ui.layout.Grid;
    setRowAlign(row:Int,hAlign:String,vAlign:String):qx.ui.layout.Grid;
    setRowFlex(row:Int,flex:Int):qx.ui.layout.Grid;
    setRowHeight(row:Int,height:Int):qx.ui.layout.Grid;
    setRowMaxHeight(row:Int,maxHeight:Int):qx.ui.layout.Grid;
    setRowMinHeight(row:Int,minHeight:Int):qx.ui.layout.Grid;
    setSpacing(spacing:Int):qx.ui.layout.Grid;
    setSpacingX(value:any):Int;
    setSpacingY(value:any):Int;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grow")
class Grow extends qx.ui.layout.Abstract {

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.HBox")
class HBox extends qx.ui.layout.Abstract {
    constructor (spacing?:Int,alignX?:String,separator?:String);
    protected _applyReversed(value:Boolean,old:Boolean):Unit;
    getAlignX():any;
    getAlignY():any;
    getReversed():Boolean;
    getSeparator():qx.ui.decoration.Decorator;
    getSpacing():Int;
    protected initAlignX(value:any):any;
    protected initAlignY(value:any):any;
    protected initReversed(value:any):Boolean;
    protected initSeparator(value:any):qx.ui.decoration.Decorator;
    protected initSpacing(value:any):Int;
    isReversed():Boolean;
    resetAlignX():Unit;
    resetAlignY():Unit;
    resetReversed():Unit;
    resetSeparator():Unit;
    resetSpacing():Unit;
    setAlignX(value:any):any;
    setAlignY(value:any):any;
    setReversed(value:any):Boolean;
    setSeparator(value:any):qx.ui.decoration.Decorator;
    setSpacing(value:any):Int;
    toggleReversed():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.LineSizeIterator")
class LineSizeIterator extends js.Object {
    constructor (children?:qx.ui.core.Widget[],spacing?:Int);
    computeNextLine(availWidth:Int):IMap;
    hasMoreLines():Boolean;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Util")
class Util extends js.Object {
    static arrangeIdeals(beginMin:Int,beginIdeal:Int,beginMax:Int,endMin:Int,endIdeal:Int,endMax:Int):IMap;
    static collapseMargins(varargs?:any):Int;
    static computeFlexOffsets(flexibles:IMap,avail:Int,used:Int):IMap;
    static computeHorizontalAlignOffset(align:String,width:Int,availWidth:Int,marginLeft?:Int,marginRight?:Int):Int;
    static computeHorizontalGaps(children:qx.data.Array,spacing?:Int,collapse?:Boolean):Int;
    static computeHorizontalSeparatorGaps(children:qx.ui.core.LayoutItem[],spacing:Int,separator:String):Int;
    static computeVerticalAlignOffset(align:String,height:Int,availHeight:Int,marginTop?:Int,marginBottom?:Int):Int;
    static computeVerticalGaps(children:qx.data.Array,spacing?:Int,collapse?:Boolean):Int;
    static computeVerticalSeparatorGaps(children:qx.ui.core.LayoutItem[],spacing:Int,separator:String):Int;

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.VBox")
class VBox extends qx.ui.layout.Abstract {
    constructor (spacing?:Int,alignY?:String,separator?:String);
    protected _applyReversed(value:Boolean,old:Boolean):Unit;
    getAlignX():any;
    getAlignY():any;
    getReversed():Boolean;
    getSeparator():qx.ui.decoration.Decorator;
    getSpacing():Int;
    protected initAlignX(value:any):any;
    protected initAlignY(value:any):any;
    protected initReversed(value:any):Boolean;
    protected initSeparator(value:any):qx.ui.decoration.Decorator;
    protected initSpacing(value:any):Int;
    isReversed():Boolean;
    resetAlignX():Unit;
    resetAlignY():Unit;
    resetReversed():Unit;
    resetSeparator():Unit;
    resetSpacing():Unit;
    setAlignX(value:any):any;
    setAlignY(value:any):any;
    setReversed(value:any):Boolean;
    setSeparator(value:any):qx.ui.decoration.Decorator;
    setSpacing(value:any):Int;
    toggleReversed():Boolean;

}
}
package qx.ui.list {
@js.native
@JSName("qx.ui.list.List")
class List extends qx.ui.virtual.core.Scroller implements qx.data.controller.ISelection {
    getSelection():qx.data.IListData;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;
    getAutoScrollIntoView():Boolean;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelectionMode():any;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelectionMode():Unit;
    setAutoScrollIntoView(value:Boolean):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;
    constructor (model?:qx.data.IListData);
    protected _applyDelegate(value:any,old:any):Unit;
    protected _applyGroupLabelOptions(value:any,old:any):Unit;
    protected _applyGroupLabelPath(value:String,old:String):Unit;
    protected _applyGroupRowHeight(value:Int,old:Int):Unit;
    protected _applyIconOptions(value:any,old:any):Unit;
    protected _applyIconPath(value:String,old:String):Unit;
    protected _applyLabelOptions(value:any,old:any):Unit;
    protected _applyLabelPath(value:String,old:String):Unit;
    protected _applyModel(value:qx.data.IListData,old:qx.data.IListData):Unit;
    protected _applyRowHeight(value:Int,old:Int):Unit;
    protected _getDataFromRow(row:Int):any;
    protected _getLookupTable():qx.data.Array;
    protected _getSelectables():qx.data.Array;
    protected _init():Unit;
    protected _initBackground():Unit;
    protected _initLayer():Unit;
    protected _isGroup(row:Int):Boolean;
    protected _lookup(row:Long):Long;
    protected _lookupGroup(row:Long):Long;
    protected _onModelChange(e:qx.event.type.Data):Unit;
    protected _onResize(e:qx.event.type.Data):Unit;
    protected _reverseLookup(index:Long):Long;
    protected _runDelegateFilter(model:qx.data.IListData):Unit;
    protected _runDelegateGroup(model:qx.data.IListData):Unit;
    protected _runDelegateSorter(model:qx.data.IListData):Unit;
    getAutoGrouping():Boolean;
    getDelegate():any;
    getGroupItemHeight():Int;
    getGroupLabelOptions():any;
    getGroupLabelPath():String;
    getGroups():qx.data.Array;
    getIconOptions():any;
    getIconPath():String;
    getItemHeight():Int;
    getLabelOptions():any;
    getLabelPath():String;
    getModel():qx.data.IListData;
    protected initAutoGrouping(value:any):Boolean;
    protected initDelegate(value:any):any;
    protected initGroupItemHeight(value:any):Int;
    protected initGroupLabelOptions(value:any):any;
    protected initGroupLabelPath(value:any):String;
    protected initGroups(value:any):qx.data.Array;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initItemHeight(value:any):Int;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    protected initModel(value:any):qx.data.IListData;
    isAutoGrouping():Boolean;
    refresh():Unit;
    resetAutoGrouping():Unit;
    resetDelegate():Unit;
    resetGroupItemHeight():Unit;
    resetGroupLabelOptions():Unit;
    resetGroupLabelPath():Unit;
    resetGroups():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetItemHeight():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    resetModel():Unit;
    setAutoGrouping(value:any):Boolean;
    setDelegate(value:any):any;
    setGroupItemHeight(value:any):Int;
    setGroupLabelOptions(value:any):any;
    setGroupLabelPath(value:any):String;
    setGroups(value:any):qx.data.Array;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setItemHeight(value:any):Int;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;
    setModel(value:any):qx.data.IListData;
    toggleAutoGrouping():Boolean;

}
}
package qx.ui.list.core {
@js.native
trait IListDelegate extends js.Object {
    bindGroupItem(controller:qx.ui.list.core.MWidgetController,item:qx.ui.core.Widget,id:Int):Unit;
    bindItem(controller:qx.ui.list.core.MWidgetController,item:qx.ui.core.Widget,id:Int):Unit;
    configureGroupItem(item:qx.ui.core.Widget):Unit;
    configureItem(item:qx.ui.core.Widget):Unit;
    createGroupItem():qx.ui.core.Widget;
    createItem():qx.ui.core.Widget;
    filter(data:any):Boolean;
    group(data:any):String;
    onPool(item:qx.ui.core.Widget):Unit;
    sorter(a:any,b:any):Int;

}
}
package qx.ui.list.core {
@js.native
@JSName("qx.ui.list.core.MWidgetController")
class MWidgetController extends js.Object {
    constructor ();
    protected _bindGroupItem(item:qx.ui.core.Widget,index:Int):Unit;
    protected _bindItem(item:qx.ui.core.Widget,index:Int):Unit;
    protected _configureGroupItem(item:qx.ui.core.Widget):Unit;
    protected _configureItem(item:qx.ui.core.Widget):Unit;
    protected _removeBindingsFrom(item:qx.ui.core.Widget):Unit;
    bindDefaultProperties(item:qx.ui.core.Widget,index:Int):Unit;
    bindProperty(sourcePath:String,targetProperty:String,options:IMap,targetWidget:qx.ui.core.Widget,index:Int):Unit;
    bindPropertyReverse(targetPath:String,sourceProperty:String,options:IMap,sourceWidget:qx.ui.core.Widget,index:Int):Unit;
    getDelegate():any;
    getGroupLabelOptions():any;
    getGroupLabelPath():String;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    protected initDelegate(value:any):any;
    protected initGroupLabelOptions(value:any):any;
    protected initGroupLabelPath(value:any):String;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    removeBindings():Unit;
    resetDelegate():Unit;
    resetGroupLabelOptions():Unit;
    resetGroupLabelPath():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    setDelegate(value:any):any;
    setGroupLabelOptions(value:any):any;
    setGroupLabelPath(value:any):String;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;

}
}
package qx.ui.list.provider {
@js.native
trait IListProvider extends js.Object {
    createGroupRenderer():any;
    createItemRenderer():any;
    createLayer():qx.ui.virtual.layer.Abstract;
    isSelectable(row:Int):Boolean;
    removeBindings():Unit;
    setDelegate(delegate:any):Unit;
    setIconOptions(options:IMap):Unit;
    setIconPath(path:String):Unit;
    setLabelOptions(options:IMap):Unit;
    setLabelPath(path:String):Unit;
    styleSelectabled(row:Int):Unit;
    styleUnselectabled(row:Int):Unit;

}
}
package qx.ui.list.provider {
@js.native
@JSName("qx.ui.list.provider.WidgetProvider")
class WidgetProvider extends qx.core.Object implements qx.ui.virtual.core.IWidgetCellProvider,qx.ui.list.provider.IListProvider {
    getCellWidget(row:Int,column:Int):qx.ui.core.LayoutItem;
    poolCellWidget(widget:qx.ui.core.LayoutItem):Unit;
    createGroupRenderer():any;
    createItemRenderer():any;
    createLayer():qx.ui.virtual.layer.Abstract;
    isSelectable(row:Int):Boolean;
    removeBindings():Unit;
    setDelegate(delegate:any):Unit;
    setIconOptions(options:IMap):Unit;
    setIconPath(path:String):Unit;
    setLabelOptions(options:IMap):Unit;
    setLabelPath(path:String):Unit;
    styleSelectabled(row:Int):Unit;
    styleUnselectabled(row:Int):Unit;
    bindDefaultProperties(item:qx.ui.core.Widget,index:Int):Unit;
    bindProperty(sourcePath:String,targetProperty:String,options:IMap,targetWidget:qx.ui.core.Widget,index:Int):Unit;
    bindPropertyReverse(targetPath:String,sourceProperty:String,options:IMap,sourceWidget:qx.ui.core.Widget,index:Int):Unit;
    getDelegate():any;
    getGroupLabelOptions():any;
    getGroupLabelPath():String;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    resetDelegate():Unit;
    resetGroupLabelOptions():Unit;
    resetGroupLabelPath():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    setGroupLabelOptions(value:any):any;
    setGroupLabelPath(value:any):String;
    constructor (list?:qx.ui.list.List);
    protected _onChangeDelegate(event:qx.event.type.Data):Unit;
    protected _onGroupItemCreated(event:qx.event.type.Data):Unit;
    protected _onItemCreated(event:qx.event.type.Data):Unit;
    protected _onPool(item:qx.ui.core.Widget):Unit;
    protected _styleSelectabled(widget:qx.ui.core.Widget):Unit;
    protected _styleUnselectabled(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.AbstractButton")
class AbstractButton extends qx.ui.core.Widget implements qx.ui.form.IExecutable {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    setCommand(command:qx.ui.command.Command):Unit;
    resetCommand():Unit;
    constructor ();
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyMenu(value:qx.ui.menu.Menu,old:qx.ui.menu.Menu):Unit;
    protected _applyShowCommandLabel(value:Boolean,old:Boolean):Unit;
    protected _onChangeCommand(e:qx.event.type.Data):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    getChildrenSizes():qx.data.Array;
    getIcon():String;
    getLabel():String;
    getMenu():qx.ui.menu.Menu;
    getShowCommandLabel():Boolean;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initMenu(value:any):qx.ui.menu.Menu;
    protected initShowCommandLabel(value:any):Boolean;
    isShowCommandLabel():Boolean;
    resetIcon():Unit;
    resetLabel():Unit;
    resetMenu():Unit;
    resetShowCommandLabel():Unit;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setMenu(value:any):qx.ui.menu.Menu;
    setShowCommandLabel(value:any):Boolean;
    toggleShowCommandLabel():Boolean;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Button")
class Button extends qx.ui.menu.AbstractButton {
    constructor (label?:String,icon?:String,command?:qx.ui.command.Command,menu?:qx.ui.menu.Menu);

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.ButtonLayout")
class ButtonLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.CheckBox")
class CheckBox extends qx.ui.menu.AbstractButton implements qx.ui.form.IBooleanForm {
    getValue():Boolean;
    resetValue():Unit;
    setValue(value:Boolean):Unit;
    constructor (label?:String,menu?:qx.ui.menu.Menu);
    protected _applyValue(value:Boolean,old:Boolean):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected initValue(value:any):Boolean;
    isValue():Boolean;
    toggleValue():Boolean;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Layout")
class Layout extends qx.ui.layout.VBox {
    getArrowColumnWidth():Int;
    getColumnSizes():qx.data.Array;
    getColumnSpacing():Int;
    getIconColumnWidth():Int;
    getSpanColumn():Int;
    protected initArrowColumnWidth(value:any):Int;
    protected initColumnSpacing(value:any):Int;
    protected initIconColumnWidth(value:any):Int;
    protected initSpanColumn(value:any):Int;
    resetArrowColumnWidth():Unit;
    resetColumnSpacing():Unit;
    resetIconColumnWidth():Unit;
    resetSpanColumn():Unit;
    setArrowColumnWidth(value:any):Int;
    setColumnSpacing(value:any):Int;
    setIconColumnWidth(value:any):Int;
    setSpanColumn(value:any):Int;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.menu.Manager;
    __onPreventContextMenu(e:qx.event.type.Mouse):Unit;
    protected _getChild(menu:qx.ui.menu.Menu,start:Int,iter:Int,loop?:Boolean):qx.ui.menu.Button;
    protected _getMenuButton(widget:qx.ui.core.Widget):qx.ui.menu.Button;
    protected _isInMenu(widget:qx.ui.core.Widget):Boolean;
    protected _isMenuOpener(widget:qx.ui.core.Widget):Boolean;
    protected _onCloseInterval(e:qx.event.type.Event):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onKeyPressDown(menu:qx.ui.menu.Menu):Unit;
    protected _onKeyPressEnter(menu:qx.ui.menu.Menu,button:qx.ui.menu.AbstractButton,e:qx.event.type.KeySequence):Unit;
    protected _onKeyPressLeft(menu:qx.ui.menu.Menu):Unit;
    protected _onKeyPressRight(menu:qx.ui.menu.Menu):Unit;
    protected _onKeyPressSpace(menu:qx.ui.menu.Menu,button:qx.ui.menu.AbstractButton,e:qx.event.type.KeySequence):Unit;
    protected _onKeyPressUp(menu:qx.ui.menu.Menu):Unit;
    protected _onKeyUpDown(e:qx.event.type.KeySequence):Unit;
    protected _onOpenInterval(e:qx.event.type.Event):Unit;
    protected _onPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    add(obj:qx.ui.menu.Menu):Unit;
    cancelClose(menu:qx.ui.menu.Menu):Unit;
    cancelOpen(menu:qx.ui.menu.Menu):Unit;
    getActiveMenu():qx.ui.menu.Menu;
    hideAll():Unit;
    preventContextMenuOnce():Unit;
    remove(obj:qx.ui.menu.Menu):Unit;
    scheduleClose(menu:qx.ui.menu.Menu):Unit;
    scheduleOpen(menu:qx.ui.menu.Menu):Unit;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Menu")
class Menu extends qx.ui.core.Widget {
    static getMoveDirection():String;
    static getVisibleElement():qx.ui.core.Widget;
    static setMoveDirection(direction:String):Unit;
    static setVisibleElement(elem:qx.ui.core.Widget):Unit;
    getDomMove():Boolean;
    getLayoutLocation(widget:qx.ui.core.Widget):IMap;
    getOffsetBottom():Int;
    getOffsetLeft():Int;
    getOffsetRight():Int;
    getOffsetTop():Int;
    getPlacementModeX():any;
    getPlacementModeY():any;
    getPlaceMethod():any;
    getPosition():any;
    isDomMove():Boolean;
    moveTo(left:Int,top:Int):Unit;
    placeToElement(elem:HTMLElement,liveupdate:Boolean):Unit;
    placeToPoint(point:IMap):Unit;
    placeToPointer(event:qx.event.type.Pointer):Unit;
    placeToWidget(target:qx.ui.core.Widget,liveupdate:Boolean):Boolean;
    resetDomMove():Unit;
    resetOffset():Unit;
    resetOffsetBottom():Unit;
    resetOffsetLeft():Unit;
    resetOffsetRight():Unit;
    resetOffsetTop():Unit;
    resetPlacementModeX():Unit;
    resetPlacementModeY():Unit;
    resetPlaceMethod():Unit;
    resetPosition():Unit;
    setDomMove(value:any):Boolean;
    setOffset(offsetTop:any,offsetRight:any,offsetBottom:any,offsetLeft:any):Unit;
    setOffsetBottom(value:any):Int;
    setOffsetLeft(value:any):Int;
    setOffsetRight(value:any):Int;
    setOffsetTop(value:any):Int;
    setPlacementModeX(value:any):any;
    setPlacementModeY(value:any):any;
    setPlaceMethod(value:any):any;
    setPosition(value:any):any;
    toggleDomMove():Boolean;
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor ();
    protected _applyArrowColumnWidth(value:Int,old:Int):Unit;
    protected _applyBlockerColor(value:String,old:String):Unit;
    protected _applyBlockerOpacity(value:Long,old:Long):Unit;
    protected _applyIconColumnWidth(value:Int,old:Int):Unit;
    protected _applyOpenedButton(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _applySelectedButton(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _applySpacingX(value:Int,old:Int):Unit;
    protected _applySpacingY(value:Int,old:Int):Unit;
    protected _assertSlideBar(callback:js.Function):any;
    protected _computePlacementSize():IMap;
    protected _getMenuBounds():IMap;
    protected _getMenuLayout():any;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    protected _onResize():Unit;
    addSeparator():Unit;
    getArrowColumnWidth():Int;
    getBlockBackground():Boolean;
    getBlockerColor():String;
    getBlockerOpacity():Long;
    getCloseInterval():Int;
    getColumnSizes():qx.data.Array;
    getIconColumnWidth():Int;
    getOpenedButton():qx.ui.core.Widget;
    getOpener():qx.ui.core.Widget;
    getOpenInterval():Int;
    getParentMenu():any;
    getSelectables():qx.ui.core.Widget[];
    getSelectedButton():qx.ui.core.Widget;
    getSpacingX():Int;
    getSpacingY():Int;
    protected initArrowColumnWidth(value:any):Int;
    protected initBlockBackground(value:any):Boolean;
    protected initBlockerColor(value:any):String;
    protected initBlockerOpacity(value:any):Long;
    protected initCloseInterval(value:any):Int;
    protected initIconColumnWidth(value:any):Int;
    protected initOpenedButton(value:any):qx.ui.core.Widget;
    protected initOpener(value:any):qx.ui.core.Widget;
    protected initOpenInterval(value:any):Int;
    protected initSelectedButton(value:any):qx.ui.core.Widget;
    protected initSpacingX(value:any):Int;
    protected initSpacingY(value:any):Int;
    isBlockBackground():Boolean;
    open():Unit;
    openAtPoint(point:IMap):Unit;
    openAtPointer(e:qx.event.type.Pointer):Unit;
    resetArrowColumnWidth():Unit;
    resetBlockBackground():Unit;
    resetBlockerColor():Unit;
    resetBlockerOpacity():Unit;
    resetCloseInterval():Unit;
    resetIconColumnWidth():Unit;
    resetOpenedButton():Unit;
    resetOpener():Unit;
    resetOpenInterval():Unit;
    resetSelectedButton():Unit;
    resetSpacingX():Unit;
    resetSpacingY():Unit;
    setArrowColumnWidth(value:any):Int;
    setBlockBackground(value:any):Boolean;
    setBlockerColor(value:any):String;
    setBlockerOpacity(value:any):Long;
    setCloseInterval(value:any):Int;
    setIconColumnWidth(value:any):Int;
    setOpenedButton(value:any):qx.ui.core.Widget;
    setOpener(value:any):qx.ui.core.Widget;
    setOpenInterval(value:any):Int;
    setSelectedButton(value:any):qx.ui.core.Widget;
    setSpacingX(value:any):Int;
    setSpacingY(value:any):Int;
    toggleBlockBackground():Boolean;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.MenuSlideBar")
class MenuSlideBar extends qx.ui.container.SlideBar {
    constructor ();

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.RadioButton")
class RadioButton extends qx.ui.menu.AbstractButton implements qx.ui.form.IRadioItem,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;
    resetValue():Unit;
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    constructor (label?:String,menu?:qx.ui.menu.Menu);
    protected _applyGroup(value:qx.ui.form.RadioGroup,old:qx.ui.form.RadioGroup):Unit;
    protected _applyValue(value:Boolean,old:Boolean):Unit;
    protected _onExecute(e:qx.event.type.Event):Unit;
    protected initGroup(value:any):qx.ui.form.RadioGroup;
    protected initValue(value:any):Boolean;
    isValue():Boolean;
    resetGroup():Unit;
    toggleValue():Boolean;

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Separator")
class Separator extends qx.ui.core.Widget {

}
}
package qx.ui.menubar {
@js.native
@JSName("qx.ui.menubar.Button")
class Button extends qx.ui.form.MenuButton {
    constructor (label?:any,icon?:any,menu?:any);
    getMenuBar():qx.ui.menubar.MenuBar;

}
}
package qx.ui.menubar {
@js.native
@JSName("qx.ui.menubar.MenuBar")
class MenuBar extends qx.ui.toolbar.ToolBar {

}
}
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.popup.Manager;
    add(obj:qx.ui.popup.Popup):Unit;
    hideAll():Unit;
    remove(obj:qx.ui.popup.Popup):Unit;

}
}
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Popup")
class Popup extends qx.ui.container.Composite {
    static getMoveDirection():String;
    static getVisibleElement():qx.ui.core.Widget;
    static setMoveDirection(direction:String):Unit;
    static setVisibleElement(elem:qx.ui.core.Widget):Unit;
    getDomMove():Boolean;
    getLayoutLocation(widget:qx.ui.core.Widget):IMap;
    getOffsetBottom():Int;
    getOffsetLeft():Int;
    getOffsetRight():Int;
    getOffsetTop():Int;
    getPlacementModeX():any;
    getPlacementModeY():any;
    getPlaceMethod():any;
    getPosition():any;
    isDomMove():Boolean;
    moveTo(left:Int,top:Int):Unit;
    placeToElement(elem:HTMLElement,liveupdate:Boolean):Unit;
    placeToPoint(point:IMap):Unit;
    placeToPointer(event:qx.event.type.Pointer):Unit;
    placeToWidget(target:qx.ui.core.Widget,liveupdate:Boolean):Boolean;
    resetDomMove():Unit;
    resetOffset():Unit;
    resetOffsetBottom():Unit;
    resetOffsetLeft():Unit;
    resetOffsetRight():Unit;
    resetOffsetTop():Unit;
    resetPlacementModeX():Unit;
    resetPlacementModeY():Unit;
    resetPlaceMethod():Unit;
    resetPosition():Unit;
    setDomMove(value:any):Boolean;
    setOffset(offsetTop:any,offsetRight:any,offsetBottom:any,offsetLeft:any):Unit;
    setOffsetBottom(value:any):Int;
    setOffsetLeft(value:any):Int;
    setOffsetRight(value:any):Int;
    setOffsetTop(value:any):Int;
    setPlacementModeX(value:any):any;
    setPlacementModeY(value:any):any;
    setPlaceMethod(value:any):any;
    setPosition(value:any):any;
    toggleDomMove():Boolean;
    constructor (layout?:any);
    getAutoHide():Boolean;
    protected initAutoHide(value:any):Boolean;
    isAutoHide():Boolean;
    resetAutoHide():Unit;
    setAutoHide(value:any):Boolean;
    toggleAutoHide():Boolean;

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.Progressive")
class Progressive extends qx.ui.container.Composite {
    constructor (structure?:qx.ui.progressive.structure.Abstract);
    protected _applyDataModel(value:qx.ui.progressive.model.Abstract,old:any):Unit;
    addRenderer(name:String,renderer:qx.ui.progressive.renderer.Abstract):Unit;
    getBatchSize():Int;
    getDataModel():qx.ui.progressive.model.Abstract;
    getFlushWidgetQueueAfterBatch():Boolean;
    getInterElementTimeout():Int;
    getStructure():qx.ui.progressive.structure.Abstract;
    protected initBatchSize(value:any):Int;
    protected initDataModel(value:any):qx.ui.progressive.model.Abstract;
    protected initFlushWidgetQueueAfterBatch(value:any):Boolean;
    protected initInterElementTimeout(value:any):Int;
    isFlushWidgetQueueAfterBatch():Boolean;
    removeRenderer(name:String):Unit;
    render():Unit;
    resetBatchSize():Unit;
    resetDataModel():Unit;
    resetFlushWidgetQueueAfterBatch():Unit;
    resetInterElementTimeout():Unit;
    setBatchSize(value:any):Int;
    setDataModel(value:any):qx.ui.progressive.model.Abstract;
    setFlushWidgetQueueAfterBatch(value:any):Boolean;
    setInterElementTimeout(value:any):Int;
    toggleFlushWidgetQueueAfterBatch():Boolean;

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.State")
class State extends qx.core.Object {
    constructor (initialState?:IMap);
    getBatchSize():any;
    getModel():any;
    getPane():any;
    getProgressive():any;
    getRendererData():any;
    protected initBatchSize(value:any):any;
    protected initModel(value:any):any;
    protected initPane(value:any):any;
    protected initProgressive(value:any):any;
    protected initRendererData(value:any):any;
    protected initUserData(value:any):any;
    resetBatchSize():Unit;
    resetModel():Unit;
    resetPane():Unit;
    resetProgressive():Unit;
    resetRendererData():Unit;
    resetUserData():Unit;
    setBatchSize(value:any):any;
    setModel(value:any):any;
    setPane(value:any):any;
    setProgressive(value:any):any;
    setRendererData(value:any):any;

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Abstract")
class Abstract extends qx.ui.container.Composite {
    constructor ();
    join(progressive:qx.ui.progressive.Progressive):Unit;

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Null")
class Null extends qx.ui.progressive.headfoot.Abstract {
    constructor ();

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Progress")
class Progress extends qx.ui.progressive.headfoot.Abstract {
    constructor (columnWidths?:qx.ui.progressive.renderer.table.Widths,labelArr?:qx.data.Array);

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.TableHeading")
class TableHeading extends qx.ui.progressive.headfoot.Abstract {
    constructor (columnWidths?:qx.ui.progressive.renderer.table.Widths,labelArr?:qx.data.Array);
    protected _resizeColumns(e:qx.event.type.Event):Unit;

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Abstract")
class Abstract extends qx.core.Object {
    getElementCount():Int;
    getNextElement():any;

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Default")
class Default extends qx.ui.progressive.model.Abstract {
    constructor ();
    addElement(elem:any):Unit;
    addElements(elems:qx.data.Array):Unit;

}
}
package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.Abstract")
class Abstract extends qx.core.Object {
    join(progressive:qx.ui.progressive.Progressive,name:String):Unit;
    render(state:qx.ui.progressive.State,element:any):Unit;

}
}
package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.FunctionCaller")
class FunctionCaller extends qx.ui.progressive.renderer.Abstract {

}
}
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Row")
class Row extends qx.ui.progressive.renderer.Abstract {
    constructor (columnWidths?:qx.ui.progressive.renderer.table.Widths);
    protected _resizeColumns(e:qx.event.type.Event):Unit;
    addRenderer(column:Int,renderer:qx.ui.progressive.renderer.table.cell.Abstract):Unit;
    getDefaultRowHeight():any;
    getLayoutChildren():qx.data.Array;
    protected initDefaultRowHeight(value:any):any;
    removeRenderer(column:Int):Unit;
    resetDefaultRowHeight():Unit;
    setDefaultRowHeight(value:any):any;

}
}
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Widths")
class Widths extends qx.core.Object {
    constructor (numColumns?:Int);
    getData():qx.data.Array;
    set(column:Int,map:IMap):Unit;
    setMaxWidth(column:Int,width:Int):Unit;
    setMinWidth(column:Int,width:Int):Unit;
    setWidth(column:Int,width:Int):Unit;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Abstract")
class Abstract extends qx.core.Object {
    protected _getCellExtras(cellInfo:any):String;
    protected _getCellStyle(cellInfo:any):String;
    protected _getContentHtml(cellInfo:any):String;
    render(cellInfo:any):String;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Boolean")
class Boolean extends qx.ui.progressive.renderer.table.cell.Icon {
    constructor ();
    getAllowToggle():Boolean;
    protected initAllowToggle(value:any):Boolean;
    isAllowToggle():Boolean;
    resetAllowToggle():Unit;
    setAllowToggle(value:any):Boolean;
    toggleAllowToggle():Boolean;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Conditional")
class Conditional extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor (align?:String,color?:String,style?:String,weight?:String);
    addBetweenCondition(condition:String,value1:Int,value2:Int,align:String,color:String,style:String,weight:String,target:String):Unit;
    addNumericCondition(condition:String,value1:Int,align:String,color:String,style:String,weight:String,target:String):Unit;
    addRegex(regex:String,align:String,color:String,style:String,weight:String,target:String):Unit;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Default")
class Default extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor ();
    protected _formatValue(value:any):String;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Html")
class Html extends qx.ui.progressive.renderer.table.cell.Abstract {

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Icon")
class Icon extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor ();
    protected _identifyImage(cellInfo:IMap):IMap;
    getBlankImage():String;

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Image")
class Image extends qx.ui.progressive.renderer.table.cell.Icon {
    constructor (width?:Int,height?:Int);

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.String")
class String extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor ();

}
}
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Abstract")
class Abstract extends qx.core.Object {
    constructor (pane?:qx.ui.core.Widget);
    applyStructure(progressive:qx.ui.progressive.Progressive):Unit;
    getPane():qx.ui.core.Widget;

}
}
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Default")
class Default extends qx.ui.progressive.structure.Abstract {
    constructor (header?:qx.ui.progressive.headfoot.Abstract,footer?:qx.ui.progressive.headfoot.Abstract,pane?:qx.ui.core.Widget);
    getFooter():qx.ui.progressive.headfoot.Abstract;
    getHeader():qx.ui.progressive.headfoot.Abstract;

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Abstract")
class Abstract extends qx.ui.core.Widget {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    block():Unit;
    blockContent(zIndex:Int):Unit;
    forceUnblock():Unit;
    getBlocker():qx.ui.core.Blocker;
    getBlockerColor():String;
    getBlockerOpacity():Long;
    isBlocked():Boolean;
    resetBlockerColor():Unit;
    resetBlockerOpacity():Unit;
    setBlockerColor(value:any):String;
    setBlockerOpacity(value:any):Long;
    unblock():Unit;
    getActiveWindow():qx.ui.window.Window;
    getWindowManager():qx.ui.window.IWindowManager;
    getWindows():qx.ui.window.Window[];
    resetActiveWindow():Unit;
    setActiveWindow(value:any):qx.ui.window.Window;
    setWindowManager(manager:qx.ui.window.IWindowManager):Unit;
    supportsMaximize():Boolean;
    constructor ();
    protected _applyNativeHelp(value:Boolean,old:Boolean):Unit;
    protected _onNativeContextMenu(e:qx.event.type.Mouse):Unit;
    getGlobalCursor():String;
    getLayout():qx.ui.layout.Abstract;
    getNativeHelp():Boolean;
    protected initGlobalCursor(value:any):String;
    protected initNativeHelp(value:any):Boolean;
    isNativeHelp():Boolean;
    resetGlobalCursor():Unit;
    resetNativeHelp():Unit;
    setGlobalCursor(value:any):String;
    setNativeHelp(value:any):Boolean;
    toggleNativeHelp():Boolean;

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Application")
class Application extends qx.ui.root.Abstract {
    constructor (doc?:Document);
    protected _onResize(e:qx.event.type.Event):Unit;

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Inline")
class Inline extends qx.ui.root.Abstract {
    static remap(members:IMap):Unit;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    constructor (el?:HTMLElement,dynamicX?:Boolean,dynamicY?:Boolean);
    protected _onResize(e:qx.event.type.Event):Unit;
    protected _onWindowResize():Unit;

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Page")
class Page extends qx.ui.root.Abstract {
    constructor (doc?:Document);
    supportsMaximize():Boolean;

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Blocker")
class Blocker extends qx.html.Element {
    constructor (orientation?:String);
    protected _applyOrientation(value:any,old:any):Unit;
    getOrientation():any;
    protected initOrientation(value:any):any;
    resetOrientation():Unit;
    setHeight(offset:Long,spliterSize:Long):Unit;
    setLeft(offset:Long,splitterLeft:Long):Unit;
    setOrientation(value:any):any;
    setTop(offset:Long,splitterTop:Long):Unit;
    setWidth(offset:Long,spliterSize:Long):Unit;

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.HLayout")
class HLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Pane")
class Pane extends qx.ui.core.Widget {
    constructor (orientation?:String);
    protected _applyOffset(value:Int,old:Int):Unit;
    protected _applyOrientation(value:String,old:String):Unit;
    protected _finalizeSizes():Unit;
    protected _isActiveDragSession():Boolean;
    protected _onPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onPointerMove(e:qx.event.type.Pointer):Unit;
    protected _onPointerOut(e:qx.event.type.Pointer):Unit;
    protected _onPointerUp(e:qx.event.type.Pointer):Unit;
    protected _setLastPointerPosition(x:Int,y:Int):Unit;
    add(widget:qx.ui.core.Widget,flex:Long):Unit;
    getBlocker():qx.ui.splitpane.Blocker;
    getChildren():qx.ui.core.Widget[];
    getOffset():Int;
    getOrientation():any;
    protected initOffset(value:any):Int;
    protected initOrientation(value:any):any;
    remove(widget:qx.ui.core.Widget):Unit;
    resetOffset():Unit;
    resetOrientation():Unit;
    setOffset(value:any):Int;
    setOrientation(value:any):any;

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Slider")
class Slider extends qx.ui.core.Widget {

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Splitter")
class Splitter extends qx.ui.core.Widget {
    constructor (parentWidget?:qx.ui.splitpane.Pane);

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.VLayout")
class VLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.style {
@js.native
@JSName("qx.ui.style.Stylesheet")
class Stylesheet extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.style.Stylesheet;
    addRule(selector:String,css:String):Unit;
    hasRule(selector:String):Boolean;
    removeRule(selector:String):Unit;

}
}
package qx.ui.table {
@js.native
trait ICellEditorFactory extends js.Object {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;

}
}
package qx.ui.table {
@js.native
trait ICellRenderer extends js.Object {
    createDataCellHtml(cellInfo:IMap,htmlArr:String[]):Boolean;

}
}
package qx.ui.table {
@js.native
trait IColumnMenuButton extends js.Object {
    empty():Unit;
    factory(item:String,options:IMap):qx.ui.core.Widget;
    getMenu():any;
    protected initMenu(value:any):any;
    resetMenu():Unit;
    setMenu(value:any):any;

}
}
package qx.ui.table {
@js.native
trait IColumnMenuItem extends js.Object {
    getVisible():any;
    protected initVisible(value:any):any;
    resetVisible():Unit;
    setVisible(value:any):any;

}
}
package qx.ui.table {
@js.native
trait IHeaderRenderer extends js.Object {
    createHeaderCell(cellInfo:IMap):qx.ui.core.Widget;
    updateHeaderCell(cellInfo:IMap,cellWidget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.table {
@js.native
trait IRowRenderer extends js.Object {
    createRowStyle(rowInfo:IMap):Unit;
    getRowClass(rowInfo:IMap):Unit;
    getRowHeightStyle(height:Int):Unit;
    updateDataRowElement(rowInfo:IMap,rowElement:HTMLElement):Unit;

}
}
package qx.ui.table {
@js.native
trait ITableModel extends js.Object {
    getColumnCount():Int;
    getColumnId(columnIndex:Int):String;
    getColumnIndexById(columnId:String):Int;
    getColumnName(columnIndex:Int):String;
    getRowCount():Int;
    getRowData(rowIndex:Int):any;
    getSortColumnIndex():Int;
    getValue(columnIndex:Int,rowIndex:Int):any;
    getValueById(columnId:String,rowIndex:Int):any;
    isColumnEditable(columnIndex:Int):Boolean;
    isColumnSortable(columnIndex:Int):Boolean;
    isSortAscending():Boolean;
    prefetchRows(firstRowIndex:Int,lastRowIndex:Int):Unit;
    setValue(columnIndex:Int,rowIndex:Int,value:any):Unit;
    setValueById(columnId:String,rowIndex:Int,value:any):Unit;
    sortByColumn(columnIndex:Int,ascending:Boolean):Unit;

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.MTableContextMenu")
class MTableContextMenu extends js.Object {
    constructor ();
    getContextMenuHandler(col:Int):js.Function;
    setContextMenuHandler(col:Int,handler:js.Function,context?:any):Unit;

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.Table")
class Table extends qx.ui.core.Widget {
    getDragScrollSlowDownFactor():Float;
    getDragScrollThresholdX():Int;
    getDragScrollThresholdY():Int;
    resetDragScrollSlowDownFactor():Unit;
    resetDragScrollThresholdX():Unit;
    resetDragScrollThresholdY():Unit;
    setDragScrollSlowDownFactor(value:any):Float;
    setDragScrollThresholdX(value:any):Int;
    setDragScrollThresholdY(value:any):Int;
    constructor (tableModel?:qx.ui.table.ITableModel,custom?:IMap);
    protected _applyAdditionalStatusBarText(value:any,old:any):Unit;
    protected _applyColumnVisibilityButtonVisible(value:Boolean,old:Boolean):Unit;
    protected _applyContextMenuFromDataCellsOnly(value:Boolean,old:Boolean):Unit;
    protected _applyFocusCellOnPointerMove(value:Boolean,old:Boolean):Unit;
    protected _applyHeaderCellHeight(value:Int,old:Int):Unit;
    protected _applyHeaderCellsVisible(value:Boolean,old:Boolean):Unit;
    protected _applyKeepFirstVisibleRowComplete(value:Boolean,old:Boolean):Unit;
    protected _applyMetaColumnCounts(value:any,old:any):Unit;
    protected _applyResetSelectionOnHeaderTap(value:Boolean,old:Boolean):Unit;
    protected _applyRowHeight(value:Long,old:Long):Unit;
    protected _applySelectionModel(value:qx.ui.table.selection.Model,old:qx.ui.table.selection.Model):Unit;
    protected _applyShowCellFocusIndicator(value:Boolean,old:Boolean):Unit;
    protected _applyStatusBarVisible(value:Boolean,old:Boolean):Unit;
    protected _applyTableModel(value:qx.ui.table.ITableModel,old:qx.ui.table.ITableModel):Unit;
    protected _cleanUpMetaColumns(fromMetaColumn:Int):Unit;
    protected _createColumnVisibilityCheckBoxHandler(col:Int):js.Function;
    protected _getMetaColumnAtColumnX(visXPos:Int):Int;
    protected _getMetaColumnAtPageX(pageX:Int):Int;
    protected _getPaneScrollerArr():qx.ui.table.pane.Scroller[];
    protected _initColumnMenu():Unit;
    protected _onChangeLocale(evt:qx.event.type.Event):Unit;
    protected _onColOrderChanged(evt:IMap):Unit;
    protected _onColVisibilityChanged(evt:IMap):Unit;
    protected _onColWidthChanged(evt:IMap):Unit;
    protected _onFocusChanged(evt:IMap):Unit;
    protected _onKeyPress(evt:qx.event.type.KeySequence):Unit;
    protected _onResize():Unit;
    protected _onScrollY(evt:IMap):Unit;
    protected _onSelectionChanged(evt:IMap):Unit;
    protected _onTableModelDataChanged(evt:IMap):Unit;
    protected _onTableModelMetaDataChanged(evt:IMap):Unit;
    protected _updateScrollBarVisibility():Unit;
    protected _updateScrollerWidths():Unit;
    protected _updateStatusBar():Unit;
    protected _updateTableData(firstRow:Int,lastRow:Int,firstColumn:Int,lastColumn:Int,removeStart?:Int,removeCount?:Int):Unit;
    blockHeaderElements():Unit;
    cancelEditing():Unit;
    clearFocusedRowHighlight(evt:qx.event.type.Pointer):Unit;
    getAdditionalStatusBarText():any;
    getAlwaysUpdateCells():Boolean;
    getColumnVisibilityButtonVisible():Boolean;
    getContextMenuFromDataCellsOnly():Boolean;
    getDataRowRenderer():qx.ui.table.IRowRenderer;
    getEmptyTableModel():qx.ui.table.ITableModel;
    getFocusCellOnPointerMove():Boolean;
    getFocusedColumn():Int;
    getFocusedRow():Int;
    getForceLineHeight():Boolean;
    getHeaderCellHeight():Int;
    getHeaderCellsVisible():Boolean;
    getInitiallyHiddenColumns():any;
    getKeepFirstVisibleRowComplete():Boolean;
    getMetaColumnCounts():any;
    getModalCellEditorPreOpenFunction():js.Function;
    getNewColumnMenu():js.Function;
    getNewSelectionManager():js.Function;
    getNewSelectionModel():js.Function;
    getNewTableColumnModel():js.Function;
    getNewTablePane():js.Function;
    getNewTablePaneHeader():js.Function;
    getNewTablePaneModel():js.Function;
    getNewTablePaneScroller():js.Function;
    getPaneScroller(metaColumn:Int):qx.ui.table.pane.Scroller;
    getResetSelectionOnHeaderTap():Boolean;
    getRowFocusChangeModifiesSelection():Boolean;
    getRowHeight():Long;
    getSelectionManager():qx.ui.table.selection.Manager;
    getSelectionModel():qx.ui.table.selection.Model;
    getShowCellFocusIndicator():Boolean;
    getStatusBarVisible():Boolean;
    getTableColumnModel():qx.ui.table.columnmodel.Basic;
    getTableModel():qx.ui.table.ITableModel;
    getTablePaneScrollerAtPageX(pageX:Int):qx.ui.table.pane.Scroller;
    highlightFocusedRow(bHighlight:Boolean):Unit;
    protected initAdditionalStatusBarText(value:any):any;
    protected initAlwaysUpdateCells(value:any):Boolean;
    protected initColumnVisibilityButtonVisible(value:any):Boolean;
    protected initContextMenuFromDataCellsOnly(value:any):Boolean;
    protected initDataRowRenderer(value:any):qx.ui.table.IRowRenderer;
    protected initFocusCellOnPointerMove(value:any):Boolean;
    protected initForceLineHeight(value:any):Boolean;
    protected initHeaderCellHeight(value:any):Int;
    protected initHeaderCellsVisible(value:any):Boolean;
    protected initInitiallyHiddenColumns(value:any):any;
    protected initKeepFirstVisibleRowComplete(value:any):Boolean;
    protected initMetaColumnCounts(value:any):any;
    protected initModalCellEditorPreOpenFunction(value:any):js.Function;
    protected initNewColumnMenu(value:any):js.Function;
    protected initNewSelectionManager(value:any):js.Function;
    protected initNewSelectionModel(value:any):js.Function;
    protected initNewTableColumnModel(value:any):js.Function;
    protected initNewTablePane(value:any):js.Function;
    protected initNewTablePaneHeader(value:any):js.Function;
    protected initNewTablePaneModel(value:any):js.Function;
    protected initNewTablePaneScroller(value:any):js.Function;
    protected initResetSelectionOnHeaderTap(value:any):Boolean;
    protected initRowFocusChangeModifiesSelection(value:any):Boolean;
    protected initRowHeight(value:any):Long;
    protected initSelectionModel(value:any):qx.ui.table.selection.Model;
    protected initShowCellFocusIndicator(value:any):Boolean;
    protected initStatusBarVisible(value:any):Boolean;
    protected initTableModel(value:any):qx.ui.table.ITableModel;
    isAlwaysUpdateCells():Boolean;
    isColumnVisibilityButtonVisible():Boolean;
    isContextMenuFromDataCellsOnly():Boolean;
    isEditing():any;
    isFocusCellOnPointerMove():Boolean;
    isForceLineHeight():Boolean;
    isHeaderCellsVisible():Boolean;
    isKeepFirstVisibleRowComplete():Boolean;
    isResetSelectionOnHeaderTap():Boolean;
    isRowFocusChangeModifiesSelection():Boolean;
    isShowCellFocusIndicator():Boolean;
    isStatusBarVisible():Boolean;
    moveFocusedCell(deltaX:Int,deltaY:Int):Unit;
    resetAdditionalStatusBarText():Unit;
    resetAlwaysUpdateCells():Unit;
    resetCellFocus():Unit;
    resetColumnVisibilityButtonVisible():Unit;
    resetContextMenuFromDataCellsOnly():Unit;
    resetDataRowRenderer():Unit;
    resetFocusCellOnPointerMove():Unit;
    resetForceLineHeight():Unit;
    resetHeaderCellHeight():Unit;
    resetHeaderCellsVisible():Unit;
    resetInitiallyHiddenColumns():Unit;
    resetKeepFirstVisibleRowComplete():Unit;
    resetMetaColumnCounts():Unit;
    resetModalCellEditorPreOpenFunction():Unit;
    resetNewColumnMenu():Unit;
    resetNewSelectionManager():Unit;
    resetNewSelectionModel():Unit;
    resetNewTableColumnModel():Unit;
    resetNewTablePane():Unit;
    resetNewTablePaneHeader():Unit;
    resetNewTablePaneModel():Unit;
    resetNewTablePaneScroller():Unit;
    resetResetSelectionOnHeaderTap():Unit;
    resetRowFocusChangeModifiesSelection():Unit;
    resetRowHeight():Unit;
    resetSelection():Unit;
    resetSelectionModel():Unit;
    resetShowCellFocusIndicator():Unit;
    resetStatusBarVisible():Unit;
    resetTableModel():Unit;
    scrollCellVisible(col:Int,row:Int):Unit;
    setAdditionalStatusBarText(value:any):any;
    setAlwaysUpdateCells(value:any):Boolean;
    setColumnVisibilityButtonVisible(value:any):Boolean;
    setColumnWidth(col:Int,width:Int):Unit;
    setContextMenuFromDataCellsOnly(value:any):Boolean;
    setDataRowRenderer(value:any):qx.ui.table.IRowRenderer;
    setFocusCellOnPointerMove(value:any):Boolean;
    setFocusedCell(col?:Int,row?:Int,scrollVisible?:Boolean):Unit;
    setForceLineHeight(value:any):Boolean;
    setHeaderCellHeight(value:any):Int;
    setHeaderCellsVisible(value:any):Boolean;
    setInitiallyHiddenColumns(value:any):any;
    setKeepFirstVisibleRowComplete(value:any):Boolean;
    setMetaColumnCounts(value:any):any;
    setModalCellEditorPreOpenFunction(value:any):js.Function;
    setNewColumnMenu(value:any):js.Function;
    setNewSelectionManager(value:any):js.Function;
    setNewSelectionModel(value:any):js.Function;
    setNewTableColumnModel(value:any):js.Function;
    setNewTablePane(value:any):js.Function;
    setNewTablePaneHeader(value:any):js.Function;
    setNewTablePaneModel(value:any):js.Function;
    setNewTablePaneScroller(value:any):js.Function;
    setResetSelectionOnHeaderTap(value:any):Boolean;
    setRowFocusChangeModifiesSelection(value:any):Boolean;
    setRowHeight(value:any):Long;
    setSelectionModel(value:any):qx.ui.table.selection.Model;
    setShowCellFocusIndicator(value:any):Boolean;
    setStatusBarVisible(value:any):Boolean;
    setTableModel(value:any):qx.ui.table.ITableModel;
    startEditing():Boolean;
    stopEditing():Unit;
    toggleAlwaysUpdateCells():Boolean;
    toggleColumnVisibilityButtonVisible():Boolean;
    toggleContextMenuFromDataCellsOnly():Boolean;
    toggleFocusCellOnPointerMove():Boolean;
    toggleForceLineHeight():Boolean;
    toggleHeaderCellsVisible():Boolean;
    toggleKeepFirstVisibleRowComplete():Boolean;
    toggleResetSelectionOnHeaderTap():Boolean;
    toggleRowFocusChangeModifiesSelection():Boolean;
    toggleShowCellFocusIndicator():Boolean;
    toggleStatusBarVisible():Boolean;
    unblockHeaderElements():Unit;
    updateContent():Unit;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.AbstractField")
class AbstractField extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;
    protected _createEditor():qx.ui.core.Widget;
    getValidationFunction():js.Function;
    protected initValidationFunction(value:any):js.Function;
    resetValidationFunction():Unit;
    setValidationFunction(value:any):js.Function;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.CheckBox")
class CheckBox extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.ComboBox")
class ComboBox extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;
    getListData():qx.data.Array;
    getValidationFunction():js.Function;
    protected initListData(value:any):qx.data.Array;
    protected initValidationFunction(value:any):js.Function;
    resetListData():Unit;
    resetValidationFunction():Unit;
    setListData(value:any):qx.data.Array;
    setValidationFunction(value:any):js.Function;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.Dynamic")
class Dynamic extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;
    constructor (cellEditorFactoryFunction?:js.Function);
    getCellEditorFactoryFunction():js.Function;
    protected initCellEditorFactoryFunction(value:any):js.Function;
    resetCellEditorFactoryFunction():Unit;
    setCellEditorFactoryFunction(value:any):js.Function;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.PasswordField")
class PasswordField extends qx.ui.table.celleditor.AbstractField {

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.SelectBox")
class SelectBox extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    createCellEditor(cellInfo:IMap):qx.ui.core.Widget;
    getCellEditorValue(cellEditor:qx.ui.core.Widget):any;
    getListData():qx.data.Array;
    getValidationFunction():js.Function;
    protected initListData(value:any):qx.data.Array;
    protected initValidationFunction(value:any):js.Function;
    resetListData():Unit;
    resetValidationFunction():Unit;
    setListData(value:any):qx.data.Array;
    setValidationFunction(value:any):js.Function;

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.TextField")
class TextField extends qx.ui.table.celleditor.AbstractField {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Abstract")
class Abstract extends qx.core.Object implements qx.ui.table.ICellRenderer {
    createDataCellHtml(cellInfo:IMap,htmlArr:String[]):Boolean;
    constructor ();
    protected _createStyleSheet():Unit;
    protected _getCellAttributes(cellInfo:IMap):String;
    protected _getCellClass(cellInfo:IMap):String;
    protected _getCellSizeStyle(width:Int,height:Int,insetX:Int,insetY:Int):String;
    protected _getCellStyle(cellInfo:IMap):any;
    protected _getContentHtml(cellInfo:IMap):String;
    protected _onChangeTheme():Unit;
    getDefaultCellStyle():String;
    protected initDefaultCellStyle(value:any):String;
    resetDefaultCellStyle():Unit;
    setDefaultCellStyle(value:any):String;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.AbstractImage")
class AbstractImage extends qx.ui.table.cellrenderer.Abstract {
    constructor ();
    protected _getImageInfos(cellInfo:IMap):IMap;
    protected _identifyImage(cellInfo:IMap):IMap;
    getRepeat():any;
    protected initRepeat(value:any):any;
    resetRepeat():Unit;
    setRepeat(value:any):any;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Boolean")
class Boolean extends qx.ui.table.cellrenderer.AbstractImage {
    constructor ();
    protected _applyIconFalse(value:String,old:String):Unit;
    protected _applyIconTrue(value:String,old:String):Unit;
    getIconFalse():String;
    getIconTrue():String;
    protected initIconFalse(value:any):String;
    protected initIconTrue(value:any):String;
    resetIconFalse():Unit;
    resetIconTrue():Unit;
    setIconFalse(value:any):String;
    setIconTrue(value:any):String;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Conditional")
class Conditional extends qx.ui.table.cellrenderer.Default {
    constructor (align?:String,color?:String,style?:String,weight?:String);
    addBetweenCondition(condition:String,value1:Int,value2:Int,align:String,color:String,style:String,weight:String,target:String):Unit;
    addNumericCondition(condition:String,value1:Int,align:String,color:String,style:String,weight:String,target:String):Unit;
    addRegex(regex:String,align:String,color:String,style:String,weight:String,target:String):Unit;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Date")
class Date extends qx.ui.table.cellrenderer.Conditional {
    getDateFormat():qx.util.format.DateFormat;
    protected initDateFormat(value:any):qx.util.format.DateFormat;
    resetDateFormat():Unit;
    setDateFormat(value:any):qx.util.format.DateFormat;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Debug")
class Debug extends qx.ui.table.cellrenderer.Abstract {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Default")
class Default extends qx.ui.table.cellrenderer.Abstract {
    protected _formatValue(cellInfo:IMap):String;
    protected _getStyleFlags(cellInfo:IMap):Int;
    getUseAutoAlign():Boolean;
    protected initUseAutoAlign(value:any):Boolean;
    isUseAutoAlign():Boolean;
    resetUseAutoAlign():Unit;
    setUseAutoAlign(value:any):Boolean;
    toggleUseAutoAlign():Boolean;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Dynamic")
class Dynamic extends qx.ui.table.cellrenderer.Default {
    constructor (cellRendererFactoryFunction?:js.Function);
    getCellRendererFactoryFunction():js.Function;
    protected initCellRendererFactoryFunction(value:any):js.Function;
    resetCellRendererFactoryFunction():Unit;
    setCellRendererFactoryFunction(value:any):js.Function;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Html")
class Html extends qx.ui.table.cellrenderer.Conditional {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Image")
class Image extends qx.ui.table.cellrenderer.AbstractImage {
    constructor (width?:Int,height?:Int);

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Number")
class Number extends qx.ui.table.cellrenderer.Conditional {
    getNumberFormat():qx.util.format.NumberFormat;
    protected initNumberFormat(value:any):qx.util.format.NumberFormat;
    resetNumberFormat():Unit;
    setNumberFormat(value:any):qx.util.format.NumberFormat;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Password")
class Password extends qx.ui.table.cellrenderer.Default {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Replace")
class Replace extends qx.ui.table.cellrenderer.Default {
    addReversedReplaceMap():Boolean;
    getReplaceFunction():js.Function;
    getReplaceMap():any;
    protected initReplaceFunction(value:any):js.Function;
    protected initReplaceMap(value:any):any;
    resetReplaceFunction():Unit;
    resetReplaceMap():Unit;
    setReplaceFunction(value:any):js.Function;
    setReplaceMap(value:any):any;

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.String")
class String extends qx.ui.table.cellrenderer.Conditional {

}
}
package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.Button")
class Button extends qx.ui.form.MenuButton implements qx.ui.table.IColumnMenuButton {
    empty():Unit;
    factory(item:String,options:IMap):qx.ui.core.Widget;
    getMenu():any;
    resetMenu():Unit;
    setMenu(value:any):any;
    constructor ();
    getBlocker():qx.ui.core.Blocker;

}
}
package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.MenuItem")
class MenuItem extends qx.ui.menu.CheckBox implements qx.ui.table.IColumnMenuItem {
    getVisible():any;
    resetVisible():Unit;
    setVisible(value:any):any;
    constructor (text?:String);
    protected _applyVisible(value:Boolean,old:Boolean):Unit;
    toggleVisible():Boolean;

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Basic")
class Basic extends qx.core.Object {
    constructor ();
    protected _getColToXPosMap():IMap;
    getCellEditorFactory(col:Int):qx.ui.table.ICellEditorFactory;
    getColumnWidth(col:Int):Int;
    getDataCellRenderer(col:Int):qx.ui.table.ICellRenderer;
    getHeaderCellRenderer(col:Int):qx.ui.table.IHeaderRenderer;
    getOverallColumnAtX(overXPos:Int):Int;
    getOverallColumnCount():Int;
    getOverallX(col:Int):Int;
    getVisibleColumnAtX(visXPos:Int):Int;
    getVisibleColumnCount():Int;
    getVisibleColumns():qx.data.Array;
    getVisibleX(col:Int):Int;
    init(colCount:Int,table:qx.ui.table.Table):Unit;
    isColumnVisible(col:Int):Boolean;
    moveColumn(fromOverXPos:Int,toOverXPos:Int):Unit;
    setCellEditorFactory(col:Int,factory:qx.ui.table.ICellEditorFactory):Unit;
    setColumnsOrder(newPositions:Int[]):Unit;
    setColumnVisible(col:Int,visible:Boolean):Unit;
    setColumnWidth(col:Int,width:Int,isPointerAction:Boolean):Unit;
    setDataCellRenderer(col:Int,renderer:qx.ui.table.ICellRenderer):qx.ui.table.ICellRenderer;
    setHeaderCellRenderer(col:Int,renderer:qx.ui.table.IHeaderRenderer):Unit;

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Resize")
class Resize extends qx.ui.table.columnmodel.Basic {
    marktr(messageId:String):String;
    tr(messageId:String,varargs?:any):String;
    trc(hint:String,messageId:String,varargs?:any):String;
    trn(singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    trnc(hint:String,singularMessageId:String,pluralMessageId:String,count:Int,varargs?:any):String;
    constructor ();
    protected _addResetColumnWidthButton(event:qx.event.type.Data):Unit;
    protected _applyBehavior(value:qx.ui.table.columnmodel.resizebehavior.Abstract,old:qx.ui.table.columnmodel.resizebehavior.Abstract):Unit;
    protected _onappear(event:qx.event.type.Event):Unit;
    protected _oncolumnwidthchanged(event:qx.event.type.Data):Unit;
    protected _onTableWidthChanged(event:qx.event.type.Event):Unit;
    protected _onverticalscrollbarchanged(event:qx.event.type.Data):Unit;
    protected _onvisibilitychanged(event:qx.event.type.Data):Unit;
    getBehavior():qx.ui.table.columnmodel.resizebehavior.Abstract;
    getTable():qx.ui.table.Table;
    protected initBehavior(value:any):qx.ui.table.columnmodel.resizebehavior.Abstract;
    resetBehavior():Unit;
    setBehavior(value:any):qx.ui.table.columnmodel.resizebehavior.Abstract;

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Abstract")
class Abstract extends qx.core.Object {
    protected _getAvailableWidth():Int;
    protected _setNumColumns(numColumns:Int):Unit;
    onAppear(event:any,forceRefresh?:Boolean):Unit;
    onColumnWidthChanged(event:any):Unit;
    onTableWidthChanged(event:any):Unit;
    onVerticalScrollBarChanged(event:any):Unit;
    onVisibilityChanged(event:any):Unit;

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Default")
class Default extends qx.ui.table.columnmodel.resizebehavior.Abstract {
    constructor ();
    protected _computeColumnsFlexWidth():Unit;
    protected _extendLastColumn(event:qx.event.type.Data):Unit;
    protected _extendNextColumn(event:qx.event.type.Data):Unit;
    protected _getResizeColumnData():qx.ui.core.ColumnData[];
    getInitializeWidthsOnEveryAppear():Boolean;
    getLayoutChildren():qx.ui.core.ColumnData[];
    getNewResizeBehaviorColumnData():js.Function;
    getTableColumnModel():qx.ui.table.columnmodel.Resize;
    protected initInitializeWidthsOnEveryAppear(value:any):Boolean;
    protected initNewResizeBehaviorColumnData(value:any):js.Function;
    protected initTableColumnModel(value:any):qx.ui.table.columnmodel.Resize;
    isInitializeWidthsOnEveryAppear():Boolean;
    resetInitializeWidthsOnEveryAppear():Unit;
    resetNewResizeBehaviorColumnData():Unit;
    resetTableColumnModel():Unit;
    set(col:Int,map:IMap):Unit;
    setInitializeWidthsOnEveryAppear(value:any):Boolean;
    setMaxWidth(col:Int,width:Int):Unit;
    setMinWidth(col:Int,width:Int):Unit;
    setNewResizeBehaviorColumnData(value:any):js.Function;
    setTableColumnModel(value:any):qx.ui.table.columnmodel.Resize;
    setWidth(col:Int,width:Int,flex?:Int):Unit;
    toggleInitializeWidthsOnEveryAppear():Boolean;

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Default")
class Default extends qx.core.Object implements qx.ui.table.IHeaderRenderer {
    createHeaderCell(cellInfo:IMap):qx.ui.core.Widget;
    updateHeaderCell(cellInfo:IMap,cellWidget:qx.ui.core.Widget):Unit;
    getToolTip():String;
    protected initToolTip(value:any):String;
    resetToolTip():Unit;
    setToolTip(value:any):String;

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.HeaderCell")
class HeaderCell extends qx.ui.container.Composite {
    constructor ();
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applySortIcon(value:String,old:String):Unit;
    getIcon():String;
    getLabel():String;
    getSortIcon():String;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initSortIcon(value:any):String;
    resetIcon():Unit;
    resetLabel():Unit;
    resetSortIcon():Unit;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setSortIcon(value:any):String;

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Icon")
class Icon extends qx.ui.table.headerrenderer.Default {
    constructor (iconUrl?:String,tooltip?:String);
    getIconUrl():String;
    protected initIconUrl(value:any):String;
    resetIconUrl():Unit;
    setIconUrl(value:any):String;

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Abstract")
class Abstract extends qx.core.Object implements qx.ui.table.ITableModel {
    getColumnCount():Int;
    getColumnId(columnIndex:Int):String;
    getColumnIndexById(columnId:String):Int;
    getColumnName(columnIndex:Int):String;
    getRowCount():Int;
    getRowData(rowIndex:Int):any;
    getSortColumnIndex():Int;
    getValue(columnIndex:Int,rowIndex:Int):any;
    getValueById(columnId:String,rowIndex:Int):any;
    isColumnEditable(columnIndex:Int):Boolean;
    isColumnSortable(columnIndex:Int):Boolean;
    isSortAscending():Boolean;
    prefetchRows(firstRowIndex:Int,lastRowIndex:Int):Unit;
    setValue(columnIndex:Int,rowIndex:Int,value:any):Unit;
    setValueById(columnId:String,rowIndex:Int,value:any):Unit;
    sortByColumn(columnIndex:Int,ascending:Boolean):Unit;
    constructor ();
    init(table:qx.ui.table.Table):Unit;
    setColumnIds(columnIdArr:String[]):Unit;
    setColumnNamesById(columnNameMap:IMap):Unit;
    setColumnNamesByIndex(columnNameArr:String[]):Unit;
    setColumns(columnNameArr:String[],columnIdArr?:String[]):Unit;

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Filtered")
class Filtered extends qx.ui.table.model.Simple {
    constructor ();
    protected _js_in_array(the_needle:String,the_haystack:qx.data.Array):Boolean;
    addBetweenFilter(filter:String,value1:Int,value2:Int,target:String):Unit;
    addNotRegex(regex:String,target:String,ignorecase:Boolean):Unit;
    addNumericFilter(filter:String,value1:Int,target:String):Unit;
    addRegex(regex:String,target:String,ignorecase:Boolean):Unit;
    applyFilters():Unit;
    hideRows(rowNum:Int,numOfRows:Int,dispatchEvent?:Boolean):Unit;
    resetHiddenRows():Unit;

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Remote")
class Remote extends qx.ui.table.model.Abstract {
    constructor ();
    protected _cancelCurrentRequest():Boolean;
    protected _getIgnoreCurrentRequest():Boolean;
    protected _loadRowCount():Unit;
    protected _loadRowData(firstRow:Int,lastRow:Int):Unit;
    protected _onRowCountLoaded(rowCount:Int):Unit;
    protected _onRowDataLoaded(rowDataArr:IMap[]):Unit;
    protected _setRowBlockData(block:Int,rowDataArr:any[]):Unit;
    clearCache():Unit;
    getBlockConcurrentLoadRowCount():Boolean;
    getBlockSize():Int;
    getCacheContent():IMap;
    getClearCacheOnRemove():Boolean;
    getMaxCachedBlockCount():Int;
    protected initBlockConcurrentLoadRowCount(value:any):Boolean;
    protected initBlockSize(value:any):Int;
    protected initClearCacheOnRemove(value:any):Boolean;
    protected initMaxCachedBlockCount(value:any):Int;
    isBlockConcurrentLoadRowCount():Boolean;
    isClearCacheOnRemove():Boolean;
    iterateCachedRows(iterator:js.Function,object:any):Unit;
    reloadData():Unit;
    removeRow(rowIndex:Int):Unit;
    resetBlockConcurrentLoadRowCount():Unit;
    resetBlockSize():Unit;
    resetClearCacheOnRemove():Unit;
    resetMaxCachedBlockCount():Unit;
    restoreCacheContent(cacheContent:IMap):Unit;
    setBlockConcurrentLoadRowCount(value:any):Boolean;
    setBlockSize(value:any):Int;
    setClearCacheOnRemove(value:any):Boolean;
    setColumnEditable(columnIndex:Int,editable:Boolean):Unit;
    setColumnSortable(columnIndex:Int,sortable:Boolean):Unit;
    setEditable(editable:Boolean):Unit;
    setMaxCachedBlockCount(value:any):Int;
    setSortAscendingWithoutSortingData(sortAscending:Boolean):Unit;
    setSortColumnIndexWithoutSortingData(sortColumnIndex:Int):Unit;
    toggleBlockConcurrentLoadRowCount():Boolean;
    toggleClearCacheOnRemove():Boolean;

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Simple")
class Simple extends qx.ui.table.model.Abstract {
    constructor ();
    protected static _defaultSortComparatorAscending(row1:any,row2:any):Int;
    protected static _defaultSortComparatorDescending(row1:any,row2:any):Int;
    protected static _defaultSortComparatorInsensitiveAscending(row1:any,row2:any):Int;
    protected static _defaultSortComparatorInsensitiveDescending(row1:any,row2:any):Int;
    protected _mapArray2RowArr(mapArr:IMap[],rememberMaps?:Boolean):any[];
    protected _setSortAscending(ascending:Boolean):Unit;
    protected _setSortColumnIndex(columnIndex:Int):Unit;
    addRows(rowArr:any[],startIndex?:Int,clearSorting?:Boolean):Unit;
    addRowsAsMapArray(mapArr:IMap[],startIndex?:Int,rememberMaps?:Boolean,clearSorting?:Boolean):Unit;
    clearSorting():Unit;
    getCaseSensitiveSorting():Boolean;
    getData():any[];
    getDataAsMapArray():IMap[];
    getRowDataAsMap(rowIndex:Int):IMap;
    getSortMethods(columnIndex:Int):IMap;
    protected initCaseSensitiveSorting(value:any):Boolean;
    isCaseSensitiveSorting():Boolean;
    removeRows(startIndex:Int,howMany:Int,clearSorting?:Boolean):Unit;
    resetCaseSensitiveSorting():Unit;
    setCaseSensitiveSorting(value:any):Boolean;
    setColumnEditable(columnIndex:Int,editable:Boolean):Unit;
    setColumnSortable(columnIndex:Int,sortable:Boolean):Unit;
    setData(rowArr:any[],clearSorting?:Boolean):Unit;
    setDataAsMapArray(mapArr:IMap[],rememberMaps?:Boolean,clearSorting?:Boolean):Unit;
    setEditable(editable:Boolean):Unit;
    setRows(rowArr:any[],startIndex?:Int,clearSorting?:Boolean):Unit;
    setRowsAsMapArray(mapArr:IMap[],startIndex?:Int,rememberMaps?:Boolean,clearSorting?:Boolean):Unit;
    setSortMethods(columnIndex:Int,compare:js.Function):Unit;
    toggleCaseSensitiveSorting():Boolean;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.CellEvent")
class CellEvent extends qx.event.type.Pointer {
    getColumn():Int;
    getRow():Int;
    protected initColumn(value:any):Int;
    protected initRow(value:any):Int;
    resetColumn():Unit;
    resetRow():Unit;
    setColumn(value:any):Int;
    setRow(value:any):Int;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Clipper")
class Clipper extends qx.ui.container.Composite {
    constructor ();
    scrollToX(value:Int):Unit;
    scrollToY(value:Int):Unit;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.FocusIndicator")
class FocusIndicator extends qx.ui.container.Composite {
    constructor (scroller?:any);
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    getColumn():Int;
    getRow():Int;
    protected initColumn(value:any):Int;
    protected initRow(value:any):Int;
    moveToCell(col?:Int,row?:Int):Unit;
    resetColumn():Unit;
    resetRow():Unit;
    setColumn(value:any):Int;
    setRow(value:any):Int;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Header")
class Header extends qx.ui.core.Widget {
    constructor (paneScroller?:qx.ui.table.pane.Scroller);
    protected _cleanUpCells():Unit;
    protected _updateContent(completeUpdate:Boolean):Unit;
    getBlocker():qx.ui.core.Blocker;
    getHeaderWidgetAtColumn(col:Int):qx.ui.table.headerrenderer.HeaderCell;
    getPaneScroller():qx.ui.table.pane.Scroller;
    getTable():qx.ui.table.Table;
    hideColumnMoveFeedback():Unit;
    isShowingColumnMoveFeedback():Boolean;
    onColOrderChanged():Unit;
    onPaneModelChanged():Unit;
    onTableModelMetaDataChanged():Unit;
    setColumnWidth(col:Int,width:Int,isPointerAction:Boolean):Unit;
    setPointerOverColumn(col:Int):Unit;
    showColumnMoveFeedback(col:Int,x:Int):Unit;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Model")
class Model extends qx.core.Object {
    constructor (tableColumnModel?:qx.ui.table.columnmodel.Basic);
    protected _applyFirstColumnX(value:Int,old:Int):Unit;
    protected _applyMaxColumnCount(value:Long,old:Long):Unit;
    protected _onColVisibilityChanged(evt:IMap):Unit;
    protected _onHeaderCellRendererChanged(evt:IMap):Unit;
    getColumnAtX(xPos:Int):Int;
    getColumnCount():Int;
    getColumnLeft(col:Int):any;
    getFirstColumnX():Int;
    getMaxColumnCount():Long;
    getTotalWidth():Int;
    getX(col:Int):Int;
    protected initFirstColumnX(value:any):Int;
    protected initMaxColumnCount(value:any):Long;
    resetFirstColumnX():Unit;
    resetMaxColumnCount():Unit;
    setFirstColumnX(value:any):Int;
    setMaxColumnCount(value:any):Long;
    setTableColumnModel(tableColumnModel:qx.ui.table.columnmodel.Basic):Unit;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Pane")
class Pane extends qx.ui.core.Widget {
    constructor (paneScroller?:qx.ui.table.pane.Scroller);
    protected _applyFirstVisibleRow(value:Long,old:Long):Unit;
    protected _applyMaxCacheLines(value:Long,old:Long):Unit;
    protected _applyVisibleRowCount(value:Long,old:Long):Unit;
    protected _getRowsHtml(firstRow:Int,rowCount:Int):String;
    protected _scrollContent(rowOffset:Int):Unit;
    protected _updateAllRows():Unit;
    protected _updateRowStyles(onlyRow?:Int):Unit;
    getFirstVisibleRow():Long;
    getMaxCacheLines():Long;
    getPaneScroller():qx.ui.table.pane.Scroller;
    getTable():qx.ui.table.Table;
    getVisibleRowCount():Long;
    protected initFirstVisibleRow(value:any):Long;
    protected initMaxCacheLines(value:any):Long;
    protected initVisibleRowCount(value:any):Long;
    onColOrderChanged():Unit;
    onFocusChanged():Unit;
    onPaneModelChanged():Unit;
    onSelectionChanged():Unit;
    onTableModelDataChanged(firstRow:Int,lastRow:Int,firstColumn:Int,lastColumn:Int):Unit;
    onTableModelMetaDataChanged():Unit;
    resetFirstVisibleRow():Unit;
    resetMaxCacheLines():Unit;
    resetVisibleRowCount():Unit;
    setColumnWidth(col:Int,width:Int):Unit;
    setFirstVisibleRow(value:any):Long;
    setFocusedCell(col?:Int,row?:Int,massUpdate?:Boolean):Unit;
    setMaxCacheLines(value:any):Long;
    setVisibleRowCount(value:any):Long;
    updateContent(completeUpdate?:Boolean,scrollOffset?:Int,onlyRow?:Int,onlySelectionOrFocusChanged?:Boolean):Unit;

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Scroller")
class Scroller extends qx.ui.core.Widget {
    constructor (table?:qx.ui.table.Table);
    protected _applyHorizontalScrollBarVisible(value:Boolean,old:Boolean):Unit;
    protected _applyScrollTimeout(value:Int,old:Int):Unit;
    protected _applyShowCellFocusIndicator(value:Boolean,old:Boolean):Unit;
    protected _applyTablePaneModel(value:qx.ui.table.pane.Model,old:qx.ui.table.pane.Model):Unit;
    protected _applyVerticalScrollBarVisible(value:Boolean,old:Boolean):Unit;
    protected _createHeaderClipper():qx.ui.table.pane.Clipper;
    protected _createPaneClipper():qx.ui.table.pane.Clipper;
    protected _focusCellAtPagePos(pageX:Int,pageY:Int):Unit;
    protected _getColumnForPageX(pageX:Int):Int;
    protected _getResizeColumnForPageX(pageX:Int):Int;
    protected _getRowForPagePos(pageX:Int,pageY:Int):Int;
    protected _hideResizeLine():Unit;
    protected _onAppear():Unit;
    protected _onCellEditorModalWindowClose(e:IMap):Unit;
    protected _onChangeCaptureHeader(e:qx.event.type.Data):Unit;
    protected _onContextMenu(e:qx.event.type.Pointer):Unit;
    protected _onDbltapPane(e:IMap):Unit;
    protected _onDisappear():Unit;
    protected _oninterval():Unit;
    protected _onPaneModelChanged():Unit;
    protected _onPointerdownHeader(e:IMap):Unit;
    protected _onPointerdownPane(e:IMap):Unit;
    protected _onPointermoveHeader(e:IMap):Unit;
    protected _onPointermovePane(e:IMap):Unit;
    protected _onPointerout(e:IMap):Unit;
    protected _onPointerupFocusIndicator(e:qx.event.type.Pointer):Unit;
    protected _onPointerupHeader(e:IMap):Unit;
    protected _onResizePane():Unit;
    protected _onRoll(e:qx.event.type.Roll):Unit;
    protected _onScrollX(e:IMap):Unit;
    protected _onScrollY(e:IMap):Unit;
    protected _onTapHeader(e:IMap):Unit;
    protected _onTapPane(e:IMap):Unit;
    protected _postponedUpdateContent():Unit;
    protected _showResizeLine(x:Int):Unit;
    protected _startInterval(timeout:Int):Unit;
    protected _startMoveHeader(moveCol:Int,pageX:Int):Unit;
    protected _startResizeHeader(resizeCol:Int,pageX:Int):Unit;
    protected _stopInterval():Unit;
    protected _stopMoveHeader():Unit;
    protected _stopResizeHeader():Unit;
    protected _updateContent():Unit;
    protected _updateFocusIndicator():Unit;
    cancelEditing():Unit;
    flushEditor():Unit;
    getContextMenuFromDataCellsOnly():Boolean;
    getFocusCellOnPointerMove():Boolean;
    getFocusedColumn():Int;
    getFocusedRow():Int;
    getHeader():qx.ui.table.pane.Header;
    getHorizontalScrollBarVisible():Boolean;
    getLiveResize():Boolean;
    getNeededScrollBars(forceHorizontal?:Boolean,preventVertical?:Boolean):Int;
    getPaneClipper():qx.ui.table.pane.Clipper;
    getPaneInsetRight():Int;
    getResetSelectionOnHeaderTap():Boolean;
    getScrollAreaContainer():qx.ui.table.pane.Clipper;
    getScrollTimeout():Int;
    getScrollX():Int;
    getScrollY():Int;
    getSelectBeforeFocus():Boolean;
    getShowCellFocusIndicator():Boolean;
    getTable():qx.ui.table.Table;
    getTablePane():qx.ui.table.pane.Pane;
    getTablePaneModel():qx.ui.table.pane.Model;
    getTopRightWidget():qx.ui.core.Widget;
    getVerticalScrollBarVisible():Boolean;
    getVerticalScrollBarWidth():Int;
    hideColumnMoveFeedback():Unit;
    protected initContextMenuFromDataCellsOnly(value:any):Boolean;
    protected initFocusCellOnPointerMove(value:any):Boolean;
    protected initHorizontalScrollBarVisible(value:any):Boolean;
    protected initLiveResize(value:any):Boolean;
    protected initResetSelectionOnHeaderTap(value:any):Boolean;
    protected initScrollTimeout(value:any):Int;
    protected initSelectBeforeFocus(value:any):Boolean;
    protected initShowCellFocusIndicator(value:any):Boolean;
    protected initTablePaneModel(value:any):qx.ui.table.pane.Model;
    protected initVerticalScrollBarVisible(value:any):Boolean;
    isContextMenuFromDataCellsOnly():Boolean;
    isEditing():any;
    isFocusCellOnPointerMove():Boolean;
    isHorizontalScrollBarVisible():Boolean;
    isLiveResize():Boolean;
    isResetSelectionOnHeaderTap():Boolean;
    isSelectBeforeFocus():Boolean;
    isShowCellFocusIndicator():Boolean;
    isVerticalScrollBarVisible():Boolean;
    onColOrderChanged():Unit;
    onColVisibilityChanged():Unit;
    onFocusChanged():Unit;
    onKeepFirstVisibleRowCompleteChanged():Unit;
    onSelectionChanged():Unit;
    onTableModelDataChanged(firstRow:Int,lastRow:Int,firstColumn:Int,lastColumn:Int):Unit;
    onTableModelMetaDataChanged():Unit;
    resetContextMenuFromDataCellsOnly():Unit;
    resetFocusCellOnPointerMove():Unit;
    resetHorizontalScrollBarVisible():Unit;
    resetLiveResize():Unit;
    resetResetSelectionOnHeaderTap():Unit;
    resetScrollTimeout():Unit;
    resetSelectBeforeFocus():Unit;
    resetShowCellFocusIndicator():Unit;
    resetTablePaneModel():Unit;
    resetVerticalScrollBarVisible():Unit;
    scrollCellVisible(col:Int,row:Int):Unit;
    setColumnWidth(col:Int,width:Int):Unit;
    setContextMenuFromDataCellsOnly(value:any):Boolean;
    setFocusCellOnPointerMove(value:any):Boolean;
    setFocusedCell(col:Int,row:Int):Unit;
    setHorizontalScrollBarVisible(value:any):Boolean;
    setLiveResize(value:any):Boolean;
    setPaneWidth(width:Int):Unit;
    setResetSelectionOnHeaderTap(value:any):Boolean;
    setScrollTimeout(value:any):Int;
    setScrollX(scrollX:Int):Unit;
    setScrollY(scrollY:Int,renderSync?:Boolean):Unit;
    setSelectBeforeFocus(value:any):Boolean;
    setShowCellFocusIndicator(value:any):Boolean;
    setTablePaneModel(value:any):qx.ui.table.pane.Model;
    setTopRightWidget(widget:qx.ui.core.Widget):Unit;
    setVerticalScrollBarVisible(value:any):Boolean;
    showColumnMoveFeedback(pageX:Int):Int;
    startEditing():Boolean;
    stopEditing():Unit;
    toggleContextMenuFromDataCellsOnly():Boolean;
    toggleFocusCellOnPointerMove():Boolean;
    toggleHorizontalScrollBarVisible():Boolean;
    toggleLiveResize():Boolean;
    toggleResetSelectionOnHeaderTap():Boolean;
    toggleSelectBeforeFocus():Boolean;
    toggleShowCellFocusIndicator():Boolean;
    toggleVerticalScrollBarVisible():Boolean;
    updateHorScrollBarMaximum():Unit;
    updateVerScrollBarMaximum():Unit;

}
}
package qx.ui.table.rowrenderer {
@js.native
@JSName("qx.ui.table.rowrenderer.Default")
class Default extends qx.core.Object implements qx.ui.table.IRowRenderer {
    createRowStyle(rowInfo:IMap):Unit;
    getRowClass(rowInfo:IMap):Unit;
    getRowHeightStyle(height:Int):Unit;
    updateDataRowElement(rowInfo:IMap,rowElement:HTMLElement):Unit;
    constructor ();
    protected _renderFont(font:qx.bom.Font):Unit;
    getHighlightFocusRow():Boolean;
    getRowAttributes(rowInfo:any):String;
    protected initHighlightFocusRow(value:any):Boolean;
    initThemeValues():Unit;
    isHighlightFocusRow():Boolean;
    resetHighlightFocusRow():Unit;
    setHighlightFocusRow(value:any):Boolean;
    toggleHighlightFocusRow():Boolean;

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Manager")
class Manager extends qx.core.Object {
    constructor ();
    protected _handleSelectEvent(index:Int,evt:IMap):Unit;
    getSelectionModel():qx.ui.table.selection.Model;
    handleMoveKeyDown(index:Int,evt:IMap):Unit;
    handleSelectKeyDown(index:Int,evt:IMap):Unit;
    handleTap(index:Int,evt:qx.event.type.Tap):Unit;
    protected initSelectionModel(value:any):qx.ui.table.selection.Model;
    resetSelectionModel():Unit;
    setSelectionModel(value:any):qx.ui.table.selection.Model;

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Model")
class Model extends qx.core.Object {
    constructor ();
    protected _addSelectionInterval(fromIndex:Int,toIndex:Int):Unit;
    protected _applySelectionMode(selectionMode:any,old:any):Unit;
    protected _dumpRanges():Unit;
    protected _fireChangeSelection():Unit;
    protected _getSelectedRangeArr():IMap[];
    protected _resetSelection():Unit;
    protected _setAnchorSelectionIndex(index:Int):Unit;
    protected _setLeadSelectionIndex(index:Int):Unit;
    addSelectionInterval(fromIndex:Int,toIndex:Int):Unit;
    getAnchorSelectionIndex():Int;
    getLeadSelectionIndex():Int;
    getSelectedCount():Int;
    getSelectedRanges():IMap[];
    getSelectionMode():any;
    hasBatchMode():Boolean;
    protected initSelectionMode(value:any):any;
    isSelectedIndex(index:Int):Boolean;
    isSelectionEmpty():Boolean;
    iterateSelection(iterator:js.Function,object?:any):Unit;
    removeSelectionInterval(fromIndex:Int,toIndex:Int):Unit;
    resetSelection():Unit;
    resetSelectionMode():Unit;
    setBatchMode(batchMode:Boolean):Boolean;
    setSelectionInterval(fromIndex:Int,toIndex:Int):Unit;
    setSelectionMode(value:any):any;

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.Page")
class Page extends qx.ui.container.Composite {
    constructor (label?:String,icon?:String);
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyShowCloseButton(value:Boolean,old:Boolean):Unit;
    protected _onButtonClose():Unit;
    getButton():qx.ui.form.RadioButton;
    getIcon():String;
    getLabel():String;
    getShowCloseButton():Boolean;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initShowCloseButton(value:any):Boolean;
    isShowCloseButton():Boolean;
    resetIcon():Unit;
    resetLabel():Unit;
    resetShowCloseButton():Unit;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setShowCloseButton(value:any):Boolean;
    toggleShowCloseButton():Boolean;

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabButton")
class TabButton extends qx.ui.form.RadioButton implements qx.ui.form.IRadioItem {
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;
    constructor ();
    protected _applyShowCloseButton(value:Boolean,old:Boolean):Unit;
    protected _onCloseButtonTap():Unit;
    getShowCloseButton():Boolean;
    protected initShowCloseButton(value:any):Boolean;
    isShowCloseButton():Boolean;
    resetShowCloseButton():Unit;
    setShowCloseButton(value:any):Boolean;
    toggleShowCloseButton():Boolean;

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabView")
class TabView extends qx.ui.core.Widget implements qx.ui.core.ISingleSelection {
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetSelection():Unit;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    constructor (barPosition?:String);
    protected _applyBarPosition(value:Boolean,old:Boolean):Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _onBeforeChangeSelection(e:qx.event.type.Event):Unit;
    protected _onChangeSelection(e:qx.event.type.Data):Unit;
    protected _onPageClose(e:qx.event.type.Pointer):Unit;
    protected _onRadioChangeSelection(e:qx.event.type.Data):Unit;
    add(page:qx.ui.tabview.Page):Unit;
    addAt(page:qx.ui.tabview.Page,index?:Int):Unit;
    getBarPosition():any;
    getChildren():qx.ui.tabview.Page[];
    indexOf(page:qx.ui.tabview.Page):Int;
    protected initBarPosition(value:any):any;
    remove(page:qx.ui.tabview.Page):Unit;
    resetBarPosition():Unit;
    setBarPosition(value:any):any;

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Button")
class Button extends qx.ui.form.Button {
    constructor (label?:any,icon?:any,command?:any);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.CheckBox")
class CheckBox extends qx.ui.form.ToggleButton {
    constructor (label?:any,icon?:any);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.MenuButton")
class MenuButton extends qx.ui.menubar.Button {
    protected _applyShowArrow(value:Boolean,old:Boolean):Unit;
    getShowArrow():Boolean;
    protected initShowArrow(value:any):Boolean;
    isShowArrow():Boolean;
    resetShowArrow():Unit;
    setShowArrow(value:any):Boolean;
    toggleShowArrow():Boolean;

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Part")
class Part extends qx.ui.core.Widget {
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor ();
    protected _applySpacing(value:Int,old:Int):Unit;
    addSeparator():Unit;
    getMenuButtons():qx.data.Array;
    getShow():any;
    getSpacing():Int;
    protected initShow(value:any):any;
    protected initSpacing(value:any):Int;
    resetShow():Unit;
    resetSpacing():Unit;
    setShow(value:any):any;
    setSpacing(value:any):Int;

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.PartContainer")
class PartContainer extends qx.ui.container.Composite {
    constructor ();
    getShow():any;
    protected initShow(value:any):any;
    resetShow():Unit;
    setShow(value:any):any;

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.RadioButton")
class RadioButton extends qx.ui.toolbar.CheckBox implements qx.ui.form.IModel,qx.ui.form.IRadioItem {
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    getGroup():qx.ui.form.RadioGroup;
    getValue():Boolean;
    setGroup(value:qx.ui.form.RadioGroup):Unit;
    setValue(value:Boolean):Unit;

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Separator")
class Separator extends qx.ui.core.Widget {

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.SplitButton")
class SplitButton extends qx.ui.form.SplitButton {
    constructor (label?:any,icon?:any,menu?:any,command?:any);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.ToolBar")
class ToolBar extends qx.ui.core.Widget {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor ();
    protected _applyOverflowHandling(value:Boolean,old:Boolean):Unit;
    protected _applyOverflowIndicator(value:qx.ui.core.Widget,old:qx.ui.core.Widget):Unit;
    protected _applyShow(value:any,old:any):Unit;
    protected _applySpacing(value:Int,old:Int):Unit;
    protected _getNextToHide():qx.ui.core.Widget;
    _isAllowMenuOpenHover():Boolean;
    protected _onResize(e:qx.event.type.Data):Unit;
    protected _recalculateOverflow(width?:Int,requiredWidth?:Int):Unit;
    _setAllowMenuOpenHover(value:Boolean):Unit;
    addSeparator():Unit;
    addSpacer():qx.ui.core.Spacer;
    getMenuButtons():qx.data.Array;
    getOpenMenu():qx.ui.menu.Menu;
    getOverflowHandling():Boolean;
    getOverflowIndicator():qx.ui.core.Widget;
    getShow():any;
    getSpacing():Int;
    protected initOpenMenu(value:any):qx.ui.menu.Menu;
    protected initOverflowHandling(value:any):Boolean;
    protected initOverflowIndicator(value:any):qx.ui.core.Widget;
    protected initShow(value:any):any;
    protected initSpacing(value:any):Int;
    isOverflowHandling():Boolean;
    resetOpenMenu():Unit;
    resetOverflowHandling():Unit;
    resetOverflowIndicator():Unit;
    resetShow():Unit;
    resetSpacing():Unit;
    setOpenMenu(value:any):qx.ui.menu.Menu;
    setOverflowHandling(value:any):Boolean;
    setOverflowIndicator(value:any):qx.ui.core.Widget;
    setRemovePriority(item:qx.ui.core.Widget,priority:Int,override:Boolean):Unit;
    setShow(value:any):any;
    setSpacing(value:any):Int;
    toggleOverflowHandling():Boolean;

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.tooltip.Manager;
    protected _applyCurrent(value:qx.ui.tooltip.ToolTip,old:qx.ui.tooltip.ToolTip):Unit;
    getCurrent():qx.ui.tooltip.ToolTip;
    getSharedErrorTooltip():qx.ui.tooltip.ToolTip;
    getSharedTooltip():qx.ui.tooltip.ToolTip;
    getShowInvalidToolTips():Boolean;
    getShowToolTips():Boolean;
    protected initCurrent(value:any):qx.ui.tooltip.ToolTip;
    protected initShowInvalidToolTips(value:any):Boolean;
    protected initShowToolTips(value:any):Boolean;
    isShowInvalidToolTips():Boolean;
    isShowToolTips():Boolean;
    resetCurrent():Unit;
    resetShowInvalidToolTips():Unit;
    resetShowToolTips():Unit;
    setCurrent(value:any):qx.ui.tooltip.ToolTip;
    setShowInvalidToolTips(value:any):Boolean;
    setShowToolTips(value:any):Boolean;
    showToolTip(target:any):Unit;
    toggleShowInvalidToolTips():Boolean;
    toggleShowToolTips():Boolean;

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.ToolTip")
class ToolTip extends qx.ui.popup.Popup {
    constructor (label?:String,icon?:String);
    protected _applyArrowPosition(value:any,old:any):Unit;
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyRich(value:Boolean,old:Boolean):Unit;
    protected _onPointerOver(e:qx.event.type.Pointer):Unit;
    getArrowPosition():any;
    getHideTimeout():Int;
    getIcon():String;
    getLabel():String;
    getOpener():qx.ui.core.Widget;
    getRich():Boolean;
    getShowTimeout():Int;
    protected initArrowPosition(value:any):any;
    protected initHideTimeout(value:any):Int;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initOpener(value:any):qx.ui.core.Widget;
    protected initRich(value:any):Boolean;
    protected initShowTimeout(value:any):Int;
    isRich():Boolean;
    resetArrowPosition():Unit;
    resetHideTimeout():Unit;
    resetIcon():Unit;
    resetLabel():Unit;
    resetOpener():Unit;
    resetRich():Unit;
    resetShowTimeout():Unit;
    setArrowPosition(value:any):any;
    setHideTimeout(value:any):Int;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setOpener(value:any):qx.ui.core.Widget;
    setRich(value:any):Boolean;
    setShowTimeout(value:any):Int;
    toggleRich():Boolean;

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.Tree")
class Tree extends qx.ui.core.scroll.AbstractScrollArea implements qx.ui.core.IMultiSelection,qx.ui.form.IModelSelection,qx.ui.form.IForm {
    addToSelection(item:qx.ui.core.Widget):Unit;
    removeFromSelection(item:qx.ui.core.Widget):Unit;
    selectAll():Unit;
    getModelSelection():qx.data.Array;
    setModelSelection(value:qx.data.Array):Unit;
    getEnabled():Boolean;
    getInvalidMessage():String;
    getRequired():Boolean;
    getRequiredInvalidMessage():String;
    getValid():Boolean;
    setEnabled(enabled:Boolean):Unit;
    setInvalidMessage(message:String):Unit;
    setRequired(required:Boolean):Unit;
    setRequiredInvalidMessage(message:String):Unit;
    setValid(valid:Boolean):Unit;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelectables(all:Boolean):qx.ui.core.Widget[];
    getSelection():qx.ui.core.Widget[];
    getSelectionContext():String;
    getSelectionMode():any;
    getSortedSelection():qx.ui.core.Widget[];
    invertSelection():Unit;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    isSelected(item:qx.ui.core.Widget):Boolean;
    isSelectionEmpty():Boolean;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelection():Unit;
    resetSelectionMode():Unit;
    selectRange(begin:qx.ui.core.Widget,end:qx.ui.core.Widget):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelection(items:qx.ui.core.Widget[]):Unit;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    isRequired():Boolean;
    isValid():Boolean;
    resetInvalidMessage():Unit;
    resetRequired():Unit;
    resetRequiredInvalidMessage():Unit;
    resetValid():Unit;
    toggleRequired():Boolean;
    toggleValid():Boolean;
    constructor ();
    protected _applyHideRoot(value:Boolean,old:Boolean):Unit;
    protected _applyOpenMode(value:any,old:any):Unit;
    protected _applyRoot(value:qx.ui.tree.core.AbstractTreeItem,old:qx.ui.tree.core.AbstractTreeItem):Unit;
    protected _applyRootOpenClose(value:Boolean,old:Boolean):Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _onChangeSelection(e:qx.event.type.Data):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onOpen(e:qx.event.type.Pointer):Unit;
    getChildren():qx.ui.tree.core.AbstractTreeItem[];
    getHideRoot():Boolean;
    getItems(recursive?:Boolean,invisible?:Boolean):qx.ui.tree.core.AbstractTreeItem[];
    getNextNodeOf(treeItem:qx.ui.tree.core.AbstractTreeItem,invisible?:Boolean):qx.ui.tree.core.AbstractTreeItem;
    getNextSiblingOf(treeItem:qx.ui.tree.core.AbstractTreeItem):qx.ui.tree.core.AbstractTreeItem;
    getOpenMode():any;
    getPreviousNodeOf(treeItem:qx.ui.tree.core.AbstractTreeItem,invisible?:Boolean):qx.ui.tree.core.AbstractTreeItem;
    getPreviousSiblingOf(treeItem:qx.ui.tree.core.AbstractTreeItem):qx.ui.tree.core.AbstractTreeItem;
    getRoot():qx.ui.tree.core.AbstractTreeItem;
    getRootOpenClose():Boolean;
    getTreeItem(widget:qx.ui.core.Widget):qx.ui.tree.core.AbstractTreeItem;
    protected initHideRoot(value:any):Boolean;
    protected initOpenMode(value:any):any;
    protected initRoot(value:any):qx.ui.tree.core.AbstractTreeItem;
    protected initRootOpenClose(value:any):Boolean;
    isHideRoot():Boolean;
    isRootOpenClose():Boolean;
    resetHideRoot():Unit;
    resetOpenMode():Unit;
    resetRoot():Unit;
    resetRootOpenClose():Unit;
    setHideRoot(value:any):Boolean;
    setOpenMode(value:any):any;
    setRoot(value:any):qx.ui.tree.core.AbstractTreeItem;
    setRootOpenClose(value:any):Boolean;
    toggleHideRoot():Boolean;
    toggleRootOpenClose():Boolean;

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.TreeFile")
class TreeFile extends qx.ui.tree.core.AbstractTreeItem {

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.TreeFolder")
class TreeFolder extends qx.ui.tree.core.AbstractTreeItem {

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTree")
class VirtualTree extends qx.ui.virtual.core.Scroller implements qx.ui.tree.core.IVirtualTree,qx.data.controller.ISelection {
    closeNode(node:qx.core.Object):Unit;
    closeNodeWithoutScrolling(node:qx.core.Object):Unit;
    getLevel(row:Int):Int;
    getLookupTable():qx.data.Array;
    getSelection():qx.data.Array;
    hasChildren(node:qx.core.Object):Boolean;
    isNode(item:qx.core.Object):Boolean;
    isNodeOpen(node:qx.core.Object):Boolean;
    isShowTopLevelOpenCloseIcons():Boolean;
    openNode(node:qx.core.Object):Unit;
    openNodeWithoutScrolling(node:qx.core.Object):Unit;
    resetSelection():Unit;
    setSelection(value:qx.data.IListData):Unit;
    getAutoScrollIntoView():Boolean;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelectionMode():any;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelectionMode():Unit;
    setAutoScrollIntoView(value:Boolean):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    constructor (model?:qx.core.Object,labelPath?:String,childProperty?:String);
    protected _afterApplySelection():Unit;
    protected _applyChildProperty(value:String,old:String):Unit;
    protected _applyDelegate(value:any,old:any):Unit;
    protected _applyHideRoot(value:Boolean,old:Boolean):Unit;
    protected _applyIconOptions(value:any,old:any):Unit;
    protected _applyIconPath(value:String,old:String):Unit;
    protected _applyLabelOptions(value:any,old:any):Unit;
    protected _applyLabelPath(value:String,old:String):Unit;
    protected _applyModel(value:qx.core.Object,old:qx.core.Object):Unit;
    protected _applyOpenMode(value:any,old:any):Unit;
    protected _applyRowHeight(value:Int,old:Int):Unit;
    protected _applyShowLeafs(value:Boolean,old:Boolean):Unit;
    protected _applyShowTopLevelOpenCloseIcons(value:Boolean,old:Boolean):Unit;
    protected _beforeApplySelection(newSelection:qx.data.Array):Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _getDataFromRow(row:Int):any;
    protected _getSelectables():qx.data.Array;
    protected _init():Unit;
    protected _initLayer():Unit;
    protected _onChangeBubble(event:qx.event.type.Data):Unit;
    protected _onKeyPress(e:qx.event.type.KeySequence):Unit;
    protected _onOpen(event:qx.ui.virtual.core.CellEvent):Unit;
    protected _onUpdated(event:qx.event.type.Event):Unit;
    protected _reverseLookup(index:Long):Long;
    buildLookupTable():Unit;
    getChildProperty():String;
    getDelegate():any;
    getHideRoot():Boolean;
    getIconOptions():any;
    getIconPath():String;
    getItemHeight():Int;
    getLabelOptions():any;
    getLabelPath():String;
    getModel():qx.core.Object;
    getOpenMode():any;
    getOpenNodes():qx.data.Array;
    getParent(item:qx.core.Object):qx.core.Object;
    getShowLeafs():Boolean;
    getShowTopLevelOpenCloseIcons():Boolean;
    protected initChildProperty(value:any):String;
    protected initDelegate(value:any):any;
    protected initHideRoot(value:any):Boolean;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initItemHeight(value:any):Int;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    protected initModel(value:any):qx.core.Object;
    protected initOpenMode(value:any):any;
    protected initShowLeafs(value:any):Boolean;
    protected initShowTopLevelOpenCloseIcons(value:any):Boolean;
    isHideRoot():Boolean;
    isShowLeafs():Boolean;
    openNodeAndParents(node:qx.core.Object):Unit;
    refresh():Unit;
    resetChildProperty():Unit;
    resetDelegate():Unit;
    resetHideRoot():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetItemHeight():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    resetModel():Unit;
    resetOpenMode():Unit;
    resetShowLeafs():Unit;
    resetShowTopLevelOpenCloseIcons():Unit;
    setChildProperty(value:any):String;
    setDelegate(value:any):any;
    setHideRoot(value:any):Boolean;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setItemHeight(value:any):Int;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;
    setModel(value:any):qx.core.Object;
    setOpenMode(value:any):any;
    setShowLeafs(value:any):Boolean;
    setShowTopLevelOpenCloseIcons(value:any):Boolean;
    toggleHideRoot():Boolean;
    toggleShowLeafs():Boolean;
    toggleShowTopLevelOpenCloseIcons():Boolean;

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTreeItem")
class VirtualTreeItem extends qx.ui.tree.core.AbstractItem {
    protected _applyModel(value:any,old:any):Unit;
    protected _onChangeChildProperty(e:qx.event.type.Data):Unit;
    protected _onChangeLength():Unit;

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractItem")
class AbstractItem extends qx.ui.core.Widget implements qx.ui.form.IModel {
    getModel():any;
    resetModel():Unit;
    setModel(value:any):Unit;
    constructor (label?:String);
    protected _addWidgets():Unit;
    protected _applyIcon(value:String,old:String):Unit;
    protected _applyIconOpened(value:String,old:String):Unit;
    protected _applyIndent(value:Int,old:Int):Unit;
    protected _applyLabel(value:String,old:String):Unit;
    protected _applyOpen(value:Boolean,old:Boolean):Unit;
    protected _applyOpenSymbolMode(value:any,old:any):Unit;
    protected _onChangeOpen(e:qx.event.type.Data):Unit;
    protected _shouldShowOpenSymbol():Boolean;
    protected _updateIndent():Unit;
    addIcon():Unit;
    addLabel(text?:String):Unit;
    addOpenButton():Unit;
    addSpacer():Unit;
    addWidget(widget:qx.ui.core.Widget,options?:IMap):Unit;
    getIcon():String;
    getIconOpened():String;
    getIndent():Int;
    getLabel():String;
    getLevel():Int;
    getOpen():Boolean;
    getOpenSymbolMode():any;
    hasChildren():Boolean;
    protected initIcon(value:any):String;
    protected initIconOpened(value:any):String;
    protected initIndent(value:any):Int;
    protected initLabel(value:any):String;
    protected initOpen(value:any):Boolean;
    protected initOpenSymbolMode(value:any):any;
    isOpen():Boolean;
    isOpenable():Boolean;
    resetIcon():Unit;
    resetIconOpened():Unit;
    resetIndent():Unit;
    resetLabel():Unit;
    resetOpen():Unit;
    resetOpenSymbolMode():Unit;
    setIcon(value:any):String;
    setIconOpened(value:any):String;
    setIndent(value:any):Int;
    setLabel(value:any):String;
    setOpen(value:any):Boolean;
    setOpenSymbolMode(value:any):any;
    toggleOpen():Boolean;

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractTreeItem")
class AbstractTreeItem extends qx.ui.tree.core.AbstractItem {
    constructor (label?:any);
    add(varargs?:qx.ui.tree.core.AbstractTreeItem):Unit;
    addAfter(treeItem:qx.ui.tree.core.AbstractTreeItem,after:qx.ui.tree.core.AbstractTreeItem):Unit;
    addAt(treeItem:qx.ui.tree.core.AbstractTreeItem,index:Int):Unit;
    addAtBegin(treeItem:qx.ui.tree.core.AbstractTreeItem):Unit;
    addBefore(treeItem:qx.ui.tree.core.AbstractTreeItem,before:qx.ui.tree.core.AbstractTreeItem):Unit;
    getChildren():qx.ui.tree.core.AbstractTreeItem[];
    getItems(recursive?:Boolean,invisible?:Boolean,ignoreFirst?:Boolean):qx.ui.tree.core.AbstractTreeItem[];
    getParent():qx.ui.tree.core.AbstractTreeItem;
    getParentChildrenContainer():qx.ui.core.Widget;
    getTree():qx.ui.tree.Tree;
    hasChildrenContainer():Boolean;
    protected initParent(value:any):qx.ui.tree.core.AbstractTreeItem;
    recursiveAddToWidgetQueue():Unit;
    remove(varargs?:qx.ui.tree.core.AbstractTreeItem):Unit;
    removeAll():Unit;
    removeAt(index:Int):Unit;
    resetParent():Unit;
    setParent(value:any):qx.ui.tree.core.AbstractTreeItem;

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.FolderOpenButton")
class FolderOpenButton extends qx.ui.basic.Image {
    execute():Unit;
    getCommand():qx.ui.command.Command;
    resetCommand():Unit;
    setCommand(value:any):qx.ui.command.Command;
    constructor ();
    protected _applyOpen(value:Boolean,old:Boolean):Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    protected _stopPropagation(e:qx.event.type.Event):Unit;
    getOpen():Boolean;
    protected initOpen(value:any):Boolean;
    isOpen():Boolean;
    resetOpen():Unit;
    setOpen(value:any):Boolean;
    toggleOpen():Boolean;

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTree extends js.Object {
    closeNode(node:qx.core.Object):Unit;
    closeNodeWithoutScrolling(node:qx.core.Object):Unit;
    getLevel(row:Int):Int;
    getLookupTable():qx.data.Array;
    getSelection():qx.data.Array;
    hasChildren(node:qx.core.Object):Boolean;
    isNode(item:qx.core.Object):Boolean;
    isNodeOpen(node:qx.core.Object):Boolean;
    isShowTopLevelOpenCloseIcons():Boolean;
    openNode(node:qx.core.Object):Unit;
    openNodeWithoutScrolling(node:qx.core.Object):Unit;

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTreeDelegate extends js.Object {
    bindItem(controller:qx.ui.list.core.MWidgetController,item:qx.ui.core.Widget,id:Int):Unit;
    configureItem(item:qx.ui.core.Widget):Unit;
    createItem():qx.ui.core.Widget;
    filter(data:any):Boolean;
    onPool(item:qx.ui.core.Widget):Unit;
    sorter(a:any,b:any):Int;

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.MWidgetController")
class MWidgetController extends js.Object {
    constructor ();
    protected _bindItem(item:qx.ui.core.Widget,index:Int):Unit;
    protected _removeBindingsFrom(item:qx.ui.core.Widget):Unit;
    bindDefaultProperties(item:qx.ui.core.Widget,index:Int):Unit;
    bindProperty(sourcePath:String,targetProperty:String,options:IMap,targetWidget:qx.ui.core.Widget,index:Int):Unit;
    bindPropertyReverse(targetPath:String,sourceProperty:String,options:IMap,sourceWidget:qx.ui.core.Widget,index:Int):Unit;
    getChildProperty():String;
    getDelegate():any;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    protected initChildProperty(value:any):String;
    protected initDelegate(value:any):any;
    protected initIconOptions(value:any):any;
    protected initIconPath(value:any):String;
    protected initLabelOptions(value:any):any;
    protected initLabelPath(value:any):String;
    removeBindings():Unit;
    resetChildProperty():Unit;
    resetDelegate():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    setChildProperty(value:any):String;
    setDelegate(value:any):any;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setLabelOptions(value:any):any;
    setLabelPath(value:any):String;

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.Util")
class Util extends js.Object {
    static hasChildren(node:qx.core.Object,childProperty:String,ignoreLeafs?:Boolean):Boolean;
    static isNode(node:qx.core.Object,childProperty:String):Boolean;

}
}
package qx.ui.tree.provider {
@js.native
trait IVirtualTreeProvider extends js.Object {
    createLayer():qx.ui.virtual.layer.Abstract;
    createRenderer():any;
    isSelectable(row:Int):Boolean;
    setChildProperty(value:String):Unit;
    setLabelPath(value:String):Unit;
    styleSelectabled(row:Int):Unit;
    styleUnselectabled(row:Int):Unit;

}
}
package qx.ui.tree.provider {
@js.native
@JSName("qx.ui.tree.provider.WidgetProvider")
class WidgetProvider extends qx.core.Object implements qx.ui.virtual.core.IWidgetCellProvider,qx.ui.tree.provider.IVirtualTreeProvider {
    getCellWidget(row:Int,column:Int):qx.ui.core.LayoutItem;
    poolCellWidget(widget:qx.ui.core.LayoutItem):Unit;
    createLayer():qx.ui.virtual.layer.Abstract;
    createRenderer():any;
    isSelectable(row:Int):Boolean;
    setChildProperty(value:String):Unit;
    setLabelPath(value:String):Unit;
    styleSelectabled(row:Int):Unit;
    styleUnselectabled(row:Int):Unit;
    bindDefaultProperties(item:qx.ui.core.Widget,index:Int):Unit;
    bindProperty(sourcePath:String,targetProperty:String,options:IMap,targetWidget:qx.ui.core.Widget,index:Int):Unit;
    bindPropertyReverse(targetPath:String,sourceProperty:String,options:IMap,sourceWidget:qx.ui.core.Widget,index:Int):Unit;
    getChildProperty():String;
    getDelegate():any;
    getIconOptions():any;
    getIconPath():String;
    getLabelOptions():any;
    getLabelPath():String;
    removeBindings():Unit;
    resetChildProperty():Unit;
    resetDelegate():Unit;
    resetIconOptions():Unit;
    resetIconPath():Unit;
    resetLabelOptions():Unit;
    resetLabelPath():Unit;
    setDelegate(value:any):any;
    setIconOptions(value:any):any;
    setIconPath(value:any):String;
    setLabelOptions(value:any):any;
    constructor (tree?:qx.ui.tree.VirtualTree);
    protected _onChangeDelegate(event:qx.event.type.Data):Unit;
    protected _onItemCreated(event:qx.event.type.Data):Unit;
    protected _onPool(item:qx.ui.core.Widget):Unit;
    protected _styleSelectabled(widget:qx.ui.core.Widget):Unit;
    protected _styleUnselectabled(widget:qx.ui.core.Widget):Unit;

}
}
package qx.ui.tree.selection {
@js.native
@JSName("qx.ui.tree.selection.SelectionManager")
class SelectionManager extends qx.ui.core.selection.ScrollArea {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.DefaultDataCellRenderer")
class DefaultDataCellRenderer extends qx.ui.table.cellrenderer.Default {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MFamily")
class MFamily extends js.Object {
    familyGetFirstChild(nodeReference:any):Int;
    familyGetLastChild(nodeReference:any):Int;
    familyGetNextSibling(nodeReference:any):Int;
    familyGetPrevSibling(nodeReference:any):Int;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MNode")
class MNode extends js.Object {
    nodeGet(nodeReference:any):any;
    nodeGetCellStyle(nodeReference:any):String;
    nodeGetHideOpenClose(nodeReference:any):Boolean;
    nodeGetIcon(nodeReference:any):String;
    nodeGetLabel(nodeReference:any):String;
    nodeGetLabelStyle(nodeReference:any):String;
    nodeGetOpened(nodeReference:any):Boolean;
    nodeGetSelected(nodeReference:any):Boolean;
    nodeGetSelectedIcon(nodeReference:any):String;
    nodeSetCellStyle(nodeReference:any,style:String):Unit;
    nodeSetHideOpenClose(nodeReference:any,b:Boolean):Unit;
    nodeSetIcon(nodeReference:any,path:String):Unit;
    nodeSetLabel(nodeReference:any,label:String):Unit;
    nodeSetLabelStyle(nodeReference:any,style:String):Unit;
    nodeSetOpened(nodeReference:any,b:Boolean):Unit;
    nodeSetSelected(nodeReference:any,b:Boolean):Unit;
    nodeSetSelectedIcon(nodeReference:any,path:String):Unit;
    nodeSetState(nodeReference:any,attributes:IMap):Unit;
    nodeToggleOpened(nodeReference:any):Unit;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
class MTreePrimitive extends js.Object {
    protected static _addNode(nodeArr:qx.data.Array,parentNodeId:Int,label:String,bOpened:Boolean,bHideOpenCloseButton:Boolean,type:Int,icon:String,iconSelected:String,nodeId?:Int):Int;
    protected static _getEmptyTree():IMap;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SelectionManager")
class SelectionManager extends qx.ui.table.selection.Manager {
    constructor (table?:qx.ui.table.Table);
    protected _handleExtendedClick(tree:qx.ui.treevirtual.TreeVirtual,evt:IMap,node:IMap,left:Int):Boolean;
    getTable():qx.ui.table.Table;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
class SimpleTreeDataCellRenderer extends qx.ui.table.cellrenderer.Abstract {
    constructor ();
    protected _addExtraContentBeforeIcon(cellInfo:IMap,pos:Int):IMap;
    protected _addExtraContentBeforeIndentation(cellInfo:IMap,pos:Int):IMap;
    protected _addExtraContentBeforeLabel(cellInfo:IMap,pos:Int):IMap;
    protected _addIcon(cellInfo:IMap,pos:Int):IMap;
    protected _addImage(imageInfo:IMap):String;
    protected _addIndentation(cellInfo:IMap,pos:Int):IMap;
    protected _addLabel(cellInfo:IMap,pos:Int):String;
    protected _getIndentSymbol(column:Int,node:Node,bUseTreeLines:Boolean,bAlwaysShowOpenCloseSymbol:Boolean,bExcludeFirstLevelTreeLines:Boolean):IMap;
    getAlwaysShowOpenCloseSymbol():Boolean;
    getExcludeFirstLevelTreeLines():Boolean;
    getUseTreeLines():Boolean;
    protected initAlwaysShowOpenCloseSymbol(value:any):Boolean;
    protected initExcludeFirstLevelTreeLines(value:any):Boolean;
    protected initUseTreeLines(value:any):Boolean;
    isAlwaysShowOpenCloseSymbol():Boolean;
    isExcludeFirstLevelTreeLines():Boolean;
    isUseTreeLines():Boolean;
    resetAlwaysShowOpenCloseSymbol():Unit;
    resetExcludeFirstLevelTreeLines():Unit;
    resetUseTreeLines():Unit;
    setAlwaysShowOpenCloseSymbol(value:any):Boolean;
    setExcludeFirstLevelTreeLines(value:any):Boolean;
    setUseTreeLines(value:any):Boolean;
    toggleAlwaysShowOpenCloseSymbol():Boolean;
    toggleExcludeFirstLevelTreeLines():Boolean;
    toggleUseTreeLines():Boolean;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataModel")
class SimpleTreeDataModel extends qx.ui.table.model.Abstract {
    constructor ();
    protected _applyFilter(value:js.Function,old:js.Function):Unit;
    protected _clearSelections():Unit;
    addBranch(parentNodeId:Int,label:String,bOpened:Boolean,bHideOpenCloseButton:Boolean,icon:String,iconSelected:String):Int;
    addLeaf(parentNodeId:Int,label:String,icon:String,iconSelected:String):Int;
    clearData():Unit;
    getColumnData(nodeId:Int,columnIndex:Int):any;
    getData():qx.data.Array;
    getFilter():js.Function;
    getNode(rowIndex:Int):any;
    getNodeFromRow(rowIndex:Int):any;
    getNodeRowMap():qx.data.Array;
    getRowFromNodeId(nodeId:Int):Int;
    getSelectedNodes():qx.data.Array;
    getTree():qx.ui.treevirtual.TreeVirtual;
    getTreeColumn():Int;
    protected initFilter(value:any):js.Function;
    move(moveNodeReference:any,parentNodeReference:any):Unit;
    prune(nodeReference:any,bSelfAlso:Boolean):Unit;
    resetFilter():Unit;
    setColumnData(nodeId:Int,columnIndex:Int,data:any):Unit;
    setColumnEditable(columnIndex:Int,editable:Boolean):Unit;
    setData(nodeArr:qx.data.Array):Unit;
    setEditable(editable:Boolean):Unit;
    setFilter(value:any):js.Function;
    setState(nodeReference:any,attributes:IMap):Unit;
    setTree(tree:qx.ui.treevirtual.TreeVirtual):Unit;
    setTreeColumn(columnIndex:Int):Unit;

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataRowRenderer")
class SimpleTreeDataRowRenderer extends qx.ui.table.rowrenderer.Default {
    constructor ();

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.TreeVirtual")
class TreeVirtual extends qx.ui.table.Table {
    constructor (headings?:qx.data.Array,custom?:IMap);
    protected _calculateSelectedNodes():qx.data.Array;
    getAlwaysShowOpenCloseSymbol():Boolean;
    getDataModel():qx.ui.table.ITableModel;
    getExcludeFirstLevelTreeLines():Boolean;
    getHierarchy(nodeReference:any):qx.data.Array;
    getOpenCloseClickSelectsRow():Boolean;
    getSelectedNodes():qx.data.Array;
    getSelectionMode():Int;
    getUseTreeLines():Boolean;
    protected initOpenCloseClickSelectsRow(value:any):Boolean;
    isOpenCloseClickSelectsRow():Boolean;
    resetOpenCloseClickSelectsRow():Unit;
    setAlwaysShowOpenCloseSymbol(b:Boolean):Unit;
    setExcludeFirstLevelTreeLines(b:Boolean):Unit;
    setOpenCloseClickSelectsRow(value:any):Boolean;
    setOverflow(s:String):Unit;
    setSelectionMode(mode:Int):Unit;
    setUseTreeLines(b:Boolean):Unit;
    toggleOpenCloseClickSelectsRow():Boolean;

}
}
package qx.ui.virtual.behavior {
@js.native
@JSName("qx.ui.virtual.behavior.Prefetch")
class Prefetch extends qx.core.Object {
    constructor (scroller?:qx.ui.virtual.core.Scroller,settings?:IMap);
    protected _applyInterval(value:Int,old:Int):Unit;
    protected _applyScroller(value:qx.ui.virtual.core.Scroller,old:qx.ui.virtual.core.Scroller):Unit;
    protected _onInterval():Unit;
    getInterval():Int;
    getScroller():qx.ui.virtual.core.Scroller;
    protected initInterval(value:any):Int;
    protected initScroller(value:any):qx.ui.virtual.core.Scroller;
    resetInterval():Unit;
    resetScroller():Unit;
    setInterval(value:any):Int;
    setPrefetchX(minLeft:Int,maxLeft:Int,minRight:Int,maxRight:Int):Unit;
    setPrefetchY(minAbove:Int,maxAbove:Int,minBelow:Int,maxBelow:Int):Unit;
    setScroller(value:any):qx.ui.virtual.core.Scroller;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Abstract")
class Abstract extends qx.core.Object implements qx.ui.virtual.cell.ICell {
    getCellProperties(data:any,states:IMap):IMap;
    constructor ();
    getAttributes(value:any,states:any):String;
    getContent(value:any,states:any):String;
    getCssClasses(value:any,states:any):String;
    getInsets(value:any,states:any):Int[];
    getStyles(value:any,states:any):String;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractImage")
class AbstractImage extends qx.ui.virtual.cell.Cell {
    constructor ();
    protected _identifyImage(value:any):IMap;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractWidget")
class AbstractWidget extends qx.core.Object implements qx.ui.virtual.cell.IWidgetCell {
    getCellWidget(data:any,states:IMap):qx.ui.core.LayoutItem;
    pool(widget:qx.ui.core.LayoutItem):Unit;
    updateData(widget:qx.ui.core.LayoutItem,data:any):Unit;
    updateStates(widget:qx.ui.core.LayoutItem,states:IMap):Unit;
    constructor ();
    protected _cleanupPool():Unit;
    protected _createWidget():qx.ui.core.LayoutItem;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Boolean")
class Boolean extends qx.ui.virtual.cell.AbstractImage {
    constructor ();
    protected _applyIconFalse(value:String,old:String):Unit;
    protected _applyIconTrue(value:String,old:String):Unit;
    getIconFalse():String;
    getIconTrue():String;
    protected initIconFalse(value:any):String;
    protected initIconTrue(value:any):String;
    resetIconFalse():Unit;
    resetIconTrue():Unit;
    setIconFalse(value:any):String;
    setIconTrue(value:any):String;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Cell")
class Cell extends qx.ui.virtual.cell.Abstract {
    constructor ();
    protected _applyAppearance(value:String,old:String):Unit;
    protected _applyBackgroundColor(value:String,old:String):Unit;
    protected _applyFont(value:String,old:String):Unit;
    protected _applyPadding(value:Int,old:Int):Unit;
    protected _applyTextAlign(value:any,old:any):Unit;
    protected _applyTextColor(value:String,old:String):Unit;
    protected _getCssProperties():qx.data.Array;
    protected _getValue(propertyName:String):any;
    protected _storeStyle(propertyName:String,styles:String):Unit;
    getAppearance():String;
    getBackgroundColor():String;
    getFont():String;
    getPaddingBottom():Int;
    getPaddingLeft():Int;
    getPaddingRight():Int;
    getPaddingTop():Int;
    getTextAlign():any;
    getTextColor():String;
    protected initAppearance(value:any):String;
    protected initBackgroundColor(value:any):String;
    protected initFont(value:any):String;
    protected initPaddingBottom(value:any):Int;
    protected initPaddingLeft(value:any):Int;
    protected initPaddingRight(value:any):Int;
    protected initPaddingTop(value:any):Int;
    protected initTextAlign(value:any):any;
    protected initTextColor(value:any):String;
    resetAppearance():Unit;
    resetBackgroundColor():Unit;
    resetFont():Unit;
    resetPadding():Unit;
    resetPaddingBottom():Unit;
    resetPaddingLeft():Unit;
    resetPaddingRight():Unit;
    resetPaddingTop():Unit;
    resetTextAlign():Unit;
    resetTextColor():Unit;
    setAppearance(value:any):String;
    setBackgroundColor(value:any):String;
    setFont(value:any):String;
    setPadding(paddingTop:any,paddingRight:any,paddingBottom:any,paddingLeft:any):Unit;
    setPaddingBottom(value:any):Int;
    setPaddingLeft(value:any):Int;
    setPaddingRight(value:any):Int;
    setPaddingTop(value:any):Int;
    setTextAlign(value:any):any;
    setTextColor(value:any):String;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
class CellStylesheet extends qx.core.Object {
    constructor ();
    static getInstance():qx.ui.virtual.cell.CellStylesheet;
    computeClassForStyles(key:String,styleString:String):String;
    getCssClass(key:String):String;
    getStylesheet():any;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Date")
class Date extends qx.ui.virtual.cell.Cell {
    constructor (dateFormat?:qx.util.format.DateFormat);
    getDateFormat():qx.util.format.DateFormat;
    protected initDateFormat(value:any):qx.util.format.DateFormat;
    resetDateFormat():Unit;
    setDateFormat(value:any):qx.util.format.DateFormat;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Html")
class Html extends qx.ui.virtual.cell.Cell {

}
}
package qx.ui.virtual.cell {
@js.native
trait ICell extends js.Object {
    getCellProperties(data:any,states:IMap):IMap;

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCell extends js.Object {
    getCellWidget(data:any,states:IMap):qx.ui.core.LayoutItem;
    pool(widget:qx.ui.core.LayoutItem):Unit;
    updateData(widget:qx.ui.core.LayoutItem,data:any):Unit;
    updateStates(widget:qx.ui.core.LayoutItem,states:IMap):Unit;

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCellDelegate extends js.Object {
    createWidget():qx.ui.core.LayoutItem;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Image")
class Image extends qx.ui.virtual.cell.AbstractImage {

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Number")
class Number extends qx.ui.virtual.cell.Cell {
    constructor (numberFormat?:qx.util.format.NumberFormat);
    getNumberFormat():qx.util.format.NumberFormat;
    protected initNumberFormat(value:any):qx.util.format.NumberFormat;
    resetNumberFormat():Unit;
    setNumberFormat(value:any):qx.util.format.NumberFormat;

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.String")
class String extends qx.ui.virtual.cell.Cell {
    constructor ();

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.WidgetCell")
class WidgetCell extends qx.ui.virtual.cell.AbstractWidget {
    protected _applyDelegate(value:any,old:any):Unit;
    getDelegate():any;
    protected initDelegate(value:any):any;
    resetDelegate():Unit;
    setDelegate(value:any):any;

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Axis")
class Axis extends qx.core.Object {
    constructor (defaultItemSize?:Int,itemCount?:Int);
    getDefaultItemSize():Int;
    getItemAtPosition(position:Int):IMap;
    getItemCount():Int;
    getItemPosition(index:Int):Int;
    getItemSize(index:Int):Int;
    getItemSizes(startIndex:Int,minSizeSum:Int):Int[];
    getTotalSize():Int;
    resetItemSizes():Unit;
    setDefaultItemSize(defaultItemSize:Int):Unit;
    setItemCount(itemCount:Int):Unit;
    setItemSize(index:Int,size:Int):Unit;

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.CellEvent")
class CellEvent extends qx.event.type.Pointer {
    getColumn():Int;
    getRow():Int;
    protected initColumn(value:any):Int;
    protected initRow(value:any):Int;
    resetColumn():Unit;
    resetRow():Unit;
    setColumn(value:any):Int;
    setRow(value:any):Int;

}
}
package qx.ui.virtual.core {
@js.native
trait IHtmlCellProvider extends js.Object {
    getCellProperties(row:Int,column:Int):IMap;

}
}
package qx.ui.virtual.core {
@js.native
trait ILayer extends js.Object {
    fullUpdate(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;
    updateLayerData():Unit;
    updateLayerWindow(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;

}
}
package qx.ui.virtual.core {
@js.native
trait IWidgetCellProvider extends js.Object {
    getCellWidget(row:Int,column:Int):qx.ui.core.LayoutItem;
    poolCellWidget(widget:qx.ui.core.LayoutItem):Unit;

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Pane")
class Pane extends qx.ui.core.Widget {
    constructor (rowCount?:Int,columnCount?:Int,cellHeight?:Int,cellWidth?:Int);
    protected _deferredUpdateScrollPosition():Unit;
    protected _fullUpdate():Unit;
    protected _onAppear():Unit;
    protected _onContextmenu(e:qx.event.type.Pointer):Unit;
    protected _onDbltap(e:qx.event.type.Pointer):Unit;
    protected _onPointerDown(e:qx.event.type.Pointer):Unit;
    protected _onResize():Unit;
    protected _onTap(e:qx.event.type.Pointer):Unit;
    protected _setLayerWindow(layers:qx.ui.virtual.core.ILayer[],left:Int,top:Int,minWidth:Int,minHeight:Int,doFullUpdate?:Boolean):Unit;
    protected _updateScrollPosition():Unit;
    addLayer(layer:qx.ui.virtual.core.ILayer):Unit;
    fullUpdate():Unit;
    getCellAtPosition(documentX:Int,documentY:Int):IMap;
    getChildren():any[];
    getColumnConfig():qx.ui.virtual.core.Axis;
    getLayers():qx.ui.virtual.core.ILayer[];
    getRowConfig():qx.ui.virtual.core.Axis;
    getScrollMaxX():Int;
    getScrollMaxY():Int;
    getScrollSize():IMap;
    getScrollX():Int;
    getScrollY():Int;
    getVisibleLayers():qx.ui.virtual.core.ILayer[];
    isUpdatePending():Boolean;
    prefetchX(minLeft:Int,maxLeft:Int,minRight:Int,maxRight:Int):Unit;
    prefetchY(minAbove:Int,maxAbove:Int,minBelow:Int,maxBelow:Int):Unit;
    scrollCellIntoView(column:Int,row:Int):Unit;
    scrollColumnIntoView(column:Int):Unit;
    scrollRowIntoView(row:Int):Unit;
    setScrollX(value:Int):Unit;
    setScrollY(value:Int):Unit;

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Scroller")
class Scroller extends qx.ui.core.scroll.AbstractScrollArea {
    constructor (rowCount?:Int,columnCount?:Int,cellHeight?:Int,cellWidth?:Int);
    getPane():qx.ui.virtual.core.Pane;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Abstract")
class Abstract extends qx.ui.core.Widget implements qx.ui.virtual.core.ILayer {
    fullUpdate(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;
    updateLayerData():Unit;
    updateLayerWindow(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;
    constructor ();
    protected _fullUpdate(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;
    protected _updateLayerData():Unit;
    protected _updateLayerWindow(firstRow:Int,firstColumn:Int,rowSizes:Int[],columnSizes:Int[]):Unit;
    getColumnSizes():Int[];
    getFirstColumn():Int;
    getFirstRow():Int;
    getRowSizes():Int[];

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.AbstractBackground")
class AbstractBackground extends qx.ui.virtual.layer.Abstract {
    constructor (colorEven?:String,colorOdd?:String);
    protected _applyColorEven(value:String,old:String):Unit;
    protected _applyColorOdd(value:String,old:String):Unit;
    clearCustomColors():Unit;
    getBackground(index:Int):qx.ui.decoration.IDecorator;
    getColor(index:Int):String;
    getColorEven():String;
    getColorOdd():String;
    protected initColorEven(value:any):String;
    protected initColorOdd(value:any):String;
    resetColorEven():Unit;
    resetColorOdd():Unit;
    setBackground(index:Int,decorator:qx.ui.decoration.IDecorator):Unit;
    setColor(index:Int,color:String):Unit;
    setColorEven(value:any):String;
    setColorOdd(value:any):String;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.CellSpanManager")
class CellSpanManager extends qx.core.Object {
    constructor (rowConfig?:qx.ui.virtual.core.Axis,columnConfig?:qx.ui.virtual.core.Axis);
    protected _findCellsInRange(key:String,min:Int,max:Int):IMap;
    protected _getColumnPosition(column:Int):Int;
    protected _getRowPosition(row:Int):Int;
    protected _getSingleCellBounds(cell:IMap,firstVisibleRow:IMap,firstVisibleColumn:IMap):IMap;
    protected _getSortedCells(key:String):IMap[];
    protected _invalidatePositionCache():Unit;
    protected _invalidateSortCache():Unit;
    protected _onColumnConfigChange(e:qx.event.type.Event):Unit;
    protected _onRowConfigChange(e:qx.event.type.Event):Unit;
    addCell(id:String,row:Int,column:Int,rowSpan:Int,columnSpan:Int):Unit;
    computeCellSpanMap(cells:IMap[],firstRow:Int,firstColumn:Int,rowCount:Int,columnCount:Int):IMap[];
    findCellsInWindow(firstRow:Int,firstColumn:Int,rowCount:Int,columnCount:Int):IMap[];
    getCellBounds(cells:IMap[],firstVisibleRow:IMap,firstVisibleColumn:IMap):IMap[];
    removeCell(id:String):Unit;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Column")
class Column extends qx.ui.virtual.layer.AbstractBackground {

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.GridLines")
class GridLines extends qx.ui.virtual.layer.Abstract {
    constructor (orientation?:String,lineColor?:String,lineSize?:Int);
    getDefaultLineColor():String;
    getDefaultLineSize():Int;
    getLineColor(index:Long):String;
    getLineSize(index:Long):Int;
    protected initDefaultLineColor(value:any):String;
    protected initDefaultLineSize(value:any):Int;
    isHorizontal():Boolean;
    resetDefaultLineColor():Unit;
    resetDefaultLineSize():Unit;
    setDefaultLineColor(value:any):String;
    setDefaultLineSize(value:any):Int;
    setLineColor(index:Long,color:String):Unit;
    setLineSize(index:Long,size:Int):Unit;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCell")
class HtmlCell extends qx.ui.virtual.layer.Abstract {
    constructor (htmlCellProvider?:qx.ui.virtual.core.IHtmlCellProvider);
    protected _getCellSizeStyle(width:Int,height:Int,insetX:Int,insetY:Int):String;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCellSpan")
class HtmlCellSpan extends qx.ui.virtual.layer.HtmlCell {
    constructor (htmlCellProvider?:qx.ui.virtual.core.IHtmlCellProvider,rowConfig?:qx.ui.virtual.core.Axis,columnConfig?:qx.ui.virtual.core.Axis);
    setCellSpan(row:Int,column:Int,rowSpan:Int,columnSpan:Int):Unit;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Row")
class Row extends qx.ui.virtual.layer.AbstractBackground {

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCell")
class WidgetCell extends qx.ui.virtual.layer.Abstract {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor (widgetCellProvider?:qx.ui.virtual.core.IWidgetCellProvider);
    protected _activateNotEmptyChild(elementToPool:qx.ui.core.Widget):Unit;
    protected _getSpacer():qx.ui.core.Spacer;
    getRenderedCellWidget(row:Int,column:Int):qx.ui.core.LayoutItem;

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCellSpan")
class WidgetCellSpan extends qx.ui.virtual.layer.Abstract {
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    constructor (widgetCellProvider?:qx.ui.virtual.core.IWidgetCellProvider,rowConfig?:qx.ui.virtual.core.Axis,columnConfig?:qx.ui.virtual.core.Axis);
    protected _getSpacer():qx.ui.core.Spacer;
    getRenderedCellWidget(row:Int,column:Int):qx.ui.core.LayoutItem;
    setCellSpan(row:Int,column:Int,rowSpan:Int,columnSpan:Int):Unit;

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Abstract")
class Abstract extends qx.ui.core.selection.Abstract {
    constructor (pane?:qx.ui.virtual.core.Pane,selectionDelegate?:any);
    attachKeyEvents(target:qx.core.Object):Unit;
    attachListEvents(list:qx.core.Object):Unit;
    attachPointerEvents():Unit;
    detachKeyEvents(target:qx.core.Object):Unit;
    detachListEvents(list:qx.core.Object):Unit;
    detatchPointerEvents():Unit;

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.CellLines")
class CellLines extends qx.ui.virtual.selection.CellRectangle {

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.CellRectangle")
class CellRectangle extends qx.ui.virtual.selection.Abstract {
    protected _getItemCount():Int;

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Column")
class Column extends qx.ui.virtual.selection.Row {

}
}
package qx.ui.virtual.selection {
@js.native
trait ISelectionDelegate extends js.Object {
    isItemSelectable(item:any):Boolean;
    styleSelectable(item:any,type:String,wasAdded:Boolean):Unit;

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.MModel")
class MModel extends js.Object {
    constructor ();
    protected _applyDefaultSelection():Unit;
    protected _applyDragSelection(value:Boolean,old:Boolean):Unit;
    protected _applyQuickSelection(value:Boolean,old:Boolean):Unit;
    protected _applySelection(value:qx.data.Array,old:qx.data.Array):Unit;
    protected _applySelectionMode(value:any,old:any):Unit;
    protected _initSelectionManager():Unit;
    protected _onChangeSelection(e:qx.event.type.Data):Unit;
    protected _onManagerChangeSelection(e:qx.event.type.Data):Unit;
    protected _updateSelection():Unit;
    getAutoScrollIntoView():Boolean;
    getDragSelection():Boolean;
    getQuickSelection():Boolean;
    getSelection():qx.data.Array;
    getSelectionMode():any;
    protected initDragSelection(value:any):Boolean;
    protected initQuickSelection(value:any):Boolean;
    protected initSelection(value:any):qx.data.Array;
    protected initSelectionMode(value:any):any;
    isDragSelection():Boolean;
    isQuickSelection():Boolean;
    resetDragSelection():Unit;
    resetQuickSelection():Unit;
    resetSelection():Unit;
    resetSelectionMode():Unit;
    setAutoScrollIntoView(value:Boolean):Unit;
    setDragSelection(value:any):Boolean;
    setQuickSelection(value:any):Boolean;
    setSelection(value:any):qx.data.Array;
    setSelectionMode(value:any):any;
    toggleDragSelection():Boolean;
    toggleQuickSelection():Boolean;

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Row")
class Row extends qx.ui.virtual.selection.Abstract {
    protected _getItemCount():Int;

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Desktop")
class Desktop extends qx.ui.core.Widget implements qx.ui.window.IDesktop {
    blockContent(zIndex:Int):Unit;
    getWindows():qx.ui.window.Window[];
    isBlocked():Boolean;
    setWindowManager(manager:qx.ui.window.IWindowManager):Unit;
    supportsMaximize():Boolean;
    unblock():Unit;
    static remap(members:IMap):Unit;
    add(child:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.Widget):Int;
    remove(child:qx.ui.core.LayoutItem):Unit;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getActiveWindow():qx.ui.window.Window;
    getWindowManager():qx.ui.window.IWindowManager;
    resetActiveWindow():Unit;
    setActiveWindow(value:any):qx.ui.window.Window;
    block():Unit;
    forceUnblock():Unit;
    getBlocker():qx.ui.core.Blocker;
    getBlockerColor():String;
    getBlockerOpacity():Long;
    resetBlockerColor():Unit;
    resetBlockerOpacity():Unit;
    setBlockerColor(value:any):String;
    setBlockerOpacity(value:any):Long;
    constructor (windowManager?:qx.ui.window.IWindowManager);

}
}
package qx.ui.window {
@js.native
trait IDesktop extends js.Object {
    blockContent(zIndex:Int):Unit;
    getWindows():qx.ui.window.Window[];
    isBlocked():Boolean;
    setWindowManager(manager:qx.ui.window.IWindowManager):Unit;
    supportsMaximize():Boolean;
    unblock():Unit;

}
}
package qx.ui.window {
@js.native
trait IWindowManager extends js.Object {
    bringToFront(win:Window):Unit;
    changeActiveWindow(active:Window,oldActive:Window):Unit;
    sendToBack(win:Window):Unit;
    setDesktop(desktop:qx.ui.window.IDesktop):Unit;
    updateStack():Unit;

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.MDesktop")
class MDesktop extends js.Object {
    protected _addWindow(win:qx.ui.window.Window):Unit;
    protected _afterAddChild(win:qx.ui.core.Widget):Unit;
    protected _afterRemoveChild(win:qx.ui.core.Widget):Unit;
    protected _applyActiveWindow(value:qx.ui.window.Window,old:qx.ui.window.Window):Unit;
    protected _onChangeActive(e:qx.event.type.Event):Unit;
    protected _onChangeModal(e:qx.event.type.Event):Unit;
    protected _onChangeVisibility():Unit;
    protected _removeWindow(win:qx.ui.window.Window):Unit;
    getActiveWindow():qx.ui.window.Window;
    getWindowManager():qx.ui.window.IWindowManager;
    getWindows():qx.ui.window.Window[];
    protected initActiveWindow(value:any):qx.ui.window.Window;
    resetActiveWindow():Unit;
    setActiveWindow(value:any):qx.ui.window.Window;
    setWindowManager(manager:qx.ui.window.IWindowManager):Unit;
    supportsMaximize():Boolean;

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Manager")
class Manager extends qx.core.Object implements qx.ui.window.IWindowManager {
    bringToFront(win:Window):Unit;
    changeActiveWindow(active:Window,oldActive:Window):Unit;
    sendToBack(win:Window):Unit;
    setDesktop(desktop:qx.ui.window.IDesktop):Unit;
    updateStack():Unit;
    getDesktop():qx.ui.window.IDesktop;
    syncWidget():Unit;

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Window")
class Window extends qx.ui.core.Widget {
    add(child:qx.ui.core.LayoutItem,options?:IMap):qx.ui.core.Widget;
    addAfter(child:qx.ui.core.LayoutItem,after:qx.ui.core.LayoutItem,options?:IMap):Unit;
    addAt(child:qx.ui.core.LayoutItem,index:Int,options?:IMap):Unit;
    addBefore(child:qx.ui.core.LayoutItem,before:qx.ui.core.LayoutItem,options?:IMap):Unit;
    getChildren():qx.ui.core.LayoutItem[];
    hasChildren():Boolean;
    indexOf(child:qx.ui.core.LayoutItem):Int;
    remove(child:qx.ui.core.LayoutItem):qx.ui.core.Widget;
    removeAll():qx.data.Array;
    removeAt(index:Int):qx.ui.core.LayoutItem;
    getLayout():qx.ui.layout.Abstract;
    setLayout(layout:qx.ui.layout.Abstract):Unit;
    getResizableBottom():Boolean;
    getResizableLeft():Boolean;
    getResizableRight():Boolean;
    getResizableTop():Boolean;
    getResizeSensitivity():Int;
    getUseResizeFrame():Boolean;
    isResizableBottom():Boolean;
    isResizableLeft():Boolean;
    isResizableRight():Boolean;
    isResizableTop():Boolean;
    isUseResizeFrame():Boolean;
    resetResizable():Unit;
    resetResizableBottom():Unit;
    resetResizableLeft():Unit;
    resetResizableRight():Unit;
    resetResizableTop():Unit;
    resetResizeSensitivity():Unit;
    resetUseResizeFrame():Unit;
    setResizable(resizableTop:any,resizableRight:any,resizableBottom:any,resizableLeft:any):Unit;
    setResizableBottom(value:any):Boolean;
    setResizableLeft(value:any):Boolean;
    setResizableRight(value:any):Boolean;
    setResizableTop(value:any):Boolean;
    setResizeSensitivity(value:any):Int;
    setUseResizeFrame(value:any):Boolean;
    toggleResizableBottom():Boolean;
    toggleResizableLeft():Boolean;
    toggleResizableRight():Boolean;
    toggleResizableTop():Boolean;
    toggleUseResizeFrame():Boolean;
    getMovable():Boolean;
    getUseMoveFrame():Boolean;
    isMovable():Boolean;
    isUseMoveFrame():Boolean;
    resetMovable():Unit;
    resetUseMoveFrame():Unit;
    setMovable(value:any):Boolean;
    setUseMoveFrame(value:any):Boolean;
    toggleMovable():Boolean;
    toggleUseMoveFrame():Boolean;
    getContentPaddingBottom():Int;
    getContentPaddingLeft():Int;
    getContentPaddingRight():Int;
    getContentPaddingTop():Int;
    resetContentPadding():Unit;
    resetContentPaddingBottom():Unit;
    resetContentPaddingLeft():Unit;
    resetContentPaddingRight():Unit;
    resetContentPaddingTop():Unit;
    setContentPadding(contentPaddingTop:any,contentPaddingRight:any,contentPaddingBottom:any,contentPaddingLeft:any):Unit;
    setContentPaddingBottom(value:any):Int;
    setContentPaddingLeft(value:any):Int;
    setContentPaddingRight(value:any):Int;
    setContentPaddingTop(value:any):Int;
    constructor (caption?:String,icon?:String);
    protected _applyActive(value:Boolean,old:Boolean):Unit;
    protected _applyCaptionBarChange(value:any,old:any):Unit;
    protected _applyModal(value:Boolean,old:Boolean):Unit;
    protected _applyShowStatusbar(value:Boolean,old:Boolean):Unit;
    protected _applyStatus(value:String,old:String):Unit;
    protected _getContentPaddingTarget():qx.ui.core.Widget;
    protected _onCaptionPointerDblTap(e:qx.event.type.Pointer):Unit;
    protected _onCloseButtonTap(e:qx.event.type.Pointer):Unit;
    protected _onMaximizeButtonTap(e:qx.event.type.Pointer):Unit;
    protected _onMinimizeButtonTap(e:qx.event.type.Pointer):Unit;
    protected _onRestoreButtonTap(e:qx.event.type.Pointer):Unit;
    protected _onWindowEventStop(e:qx.event.type.Event):Unit;
    protected _onWindowFocusOut(e:qx.event.type.Focus):Unit;
    protected _onWindowPointerDown(e:qx.event.type.Pointer):Unit;
    protected _updateCaptionBar():Unit;
    center():Unit;
    close():Unit;
    getActive():Boolean;
    getAllowClose():Boolean;
    getAllowMaximize():Boolean;
    getAllowMinimize():Boolean;
    getAlwaysOnTop():Boolean;
    getCaption():any;
    getIcon():String;
    getModal():Boolean;
    getMode():String;
    getShowClose():Boolean;
    getShowMaximize():Boolean;
    getShowMinimize():Boolean;
    getShowStatusbar():Boolean;
    getStatus():String;
    protected initActive(value:any):Boolean;
    protected initAllowClose(value:any):Boolean;
    protected initAllowMaximize(value:any):Boolean;
    protected initAllowMinimize(value:any):Boolean;
    protected initAlwaysOnTop(value:any):Boolean;
    protected initCaption(value:any):any;
    protected initIcon(value:any):String;
    protected initModal(value:any):Boolean;
    protected initShowClose(value:any):Boolean;
    protected initShowMaximize(value:any):Boolean;
    protected initShowMinimize(value:any):Boolean;
    protected initShowStatusbar(value:any):Boolean;
    protected initStatus(value:any):String;
    isActive():Boolean;
    isAllowClose():Boolean;
    isAllowMaximize():Boolean;
    isAllowMinimize():Boolean;
    isAlwaysOnTop():Boolean;
    isMaximized():Boolean;
    isModal():Boolean;
    isShowClose():Boolean;
    isShowMaximize():Boolean;
    isShowMinimize():Boolean;
    isShowStatusbar():Boolean;
    maximize():Unit;
    minimize():Unit;
    moveTo(left:Int,top:Int):Unit;
    open():Unit;
    resetActive():Unit;
    resetAllowClose():Unit;
    resetAllowMaximize():Unit;
    resetAllowMinimize():Unit;
    resetAlwaysOnTop():Unit;
    resetCaption():Unit;
    resetIcon():Unit;
    resetModal():Unit;
    resetShowClose():Unit;
    resetShowMaximize():Unit;
    resetShowMinimize():Unit;
    resetShowStatusbar():Unit;
    resetStatus():Unit;
    restore():Unit;
    setActive(value:any):Boolean;
    setAllowClose(value:any):Boolean;
    setAllowMaximize(value:any):Boolean;
    setAllowMinimize(value:any):Boolean;
    setAlwaysOnTop(value:any):Boolean;
    setCaption(value:any):any;
    setIcon(value:any):String;
    setModal(value:any):Boolean;
    setShowClose(value:any):Boolean;
    setShowMaximize(value:any):Boolean;
    setShowMinimize(value:any):Boolean;
    setShowStatusbar(value:any):Boolean;
    setStatus(value:any):String;
    toggleActive():Boolean;
    toggleAllowClose():Boolean;
    toggleAllowMaximize():Boolean;
    toggleAllowMinimize():Boolean;
    toggleAlwaysOnTop():Boolean;
    toggleModal():Boolean;
    toggleShowClose():Boolean;
    toggleShowMaximize():Boolean;
    toggleShowMinimize():Boolean;
    toggleShowStatusbar():Boolean;

}
}
package qx.util {
@js.native
@JSName("qx.util.AliasManager")
class AliasManager extends qx.util.ValueManager {
    constructor ();
    static getInstance():qx.util.AliasManager;
    protected _preprocess(value:String):String;
    add(alias:String,base:String):Unit;
    getAliases():IMap;
    remove(alias:String):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.Animation")
class Animation extends js.Object {

}
}
package qx.util {
@js.native
@JSName("qx.util.Base64")
class Base64 extends js.Object {
    static decode(input:String,is8bit?:Boolean):String;
    static encode(input:String,is8bit?:Boolean):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.ColorUtil")
class ColorUtil extends js.Object {
    static cssStringToRgb(str:String):qx.data.Array;
    static hex3StringToHex6String(value:String):String;
    static hex3StringToRgb(value:String):qx.data.Array;
    static hex6StringToRgb(value:String):qx.data.Array;
    static hexStringToRgb(value:String):qx.data.Array;
    static hsbToRgb(hsb:Long[]):Int[];
    static isCssString(str:String):Boolean;
    static isHex3String(str:String):Boolean;
    static isHex6String(str:String):Boolean;
    static isNamedColor(value:String):Boolean;
    static isRgbaString(str:String):Boolean;
    static isRgbString(str:String):Boolean;
    static isSystemColor(value:String):Boolean;
    static isThemedColor(value:String):Boolean;
    static isValidPropertyValue(str:String):Boolean;
    static randomColor():String;
    static rgbToHexString(rgb:qx.data.Array):String;
    static rgbToHsb(rgb:Long[]):qx.data.Array;
    static rgbToRgbString(rgb:qx.data.Array):String;
    static stringToRgb(str:String):qx.data.Array;
    static stringToRgbString(str:String):String;
    static supportsThemes():Boolean;

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCall")
class DeferredCall extends qx.core.Object {
    constructor (callback?:js.Function,context?:any);
    call():Unit;
    cancel():Unit;
    schedule():Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCallManager")
class DeferredCallManager extends qx.core.Object {
    constructor ();
    static getInstance():qx.util.DeferredCallManager;
    cancel(deferredCall:qx.util.DeferredCall):Unit;
    schedule(deferredCall:qx.util.DeferredCall):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.Delegate")
class Delegate extends js.Object {
    static containsMethod(delegate:any,specificMethod:String):Boolean;
    static getMethod(delegate:any,specificMethod:String):js.Function;

}
}
package qx.util {
@js.native
@JSName("qx.util.DisposeUtil")
class DisposeUtil extends js.Object {
    protected static _collectContainerChildren(container:qx.ui.container.Composite,arr:qx.data.Array):Unit;
    static destroyContainer(container:qx.ui.container.Composite):Unit;
    static disposeArray(obj:any,field:String):Unit;
    static disposeMap(obj:any,field:String):Unit;
    static disposeObjects(obj:any,arr:qx.data.Array,disposeSingletons?:Boolean):Unit;
    static disposeTriggeredBy(disposeMe:any,trigger:any):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.EditDistance")
class EditDistance extends js.Object {
    static getEditOperations(dataA:qx.data.Array,dataB:qx.data.Array):IMap[];

}
}
package qx.util {
@js.native
@JSName("qx.util.ExtendedColor")
class ExtendedColor extends js.Object {
    static isExtendedColor(value:String):Boolean;
    static toRgb(value:String):qx.data.Array;
    static toRgbString(value:String):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.OOUtil")
class OOUtil extends js.Object {
    static classIsDefined(name:String):Boolean;
    static getByInterface(clazz:qx.Class,iface:qx.Interface):qx.Class;
    static getEventType(clazz:qx.Class,name:String):String;
    static getMixins(clazz:qx.Class):qx.Mixin[];
    static getPropertyDefinition(clazz:qx.Class,name:String):IMap;
    static hasInterface(clazz:qx.Class,iface:qx.Interface):Boolean;
    static hasProperty(clazz:qx.Class,name:String):Boolean;
    static supportsEvent(clazz:qx.Class,name:String):Boolean;

}
}
package qx.util {
@js.native
@JSName("qx.util.ObjectPool")
class ObjectPool extends qx.core.Object {
    constructor (size?:Int);
    getObject(clazz:qx.Class):any;
    getSize():Int;
    protected initSize(value:any):Int;
    poolObject(obj:any):Unit;
    resetSize():Unit;
    setSize(value:any):Int;

}
}
package qx.util {
@js.native
@JSName("qx.util.Permutation")
class Permutation extends js.Object {
    static permute(options:IMap,callback:js.Function,context:any):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.PropertyUtil")
class PropertyUtil extends js.Object {
    static deleteInitValue(object:any,propertyName:String):Unit;
    static deleteThemeValue(object:any,propertyName:String):Unit;
    static deleteUserValue(object:any,propertyName:String):Unit;
    static getAllProperties(clazz:qx.Class):IMap;
    static getInitValue(object:any,propertyName:String):any;
    static getProperties(clazz:qx.Class):IMap;
    static getThemeValue(object:any,propertyName:String):any;
    static getUserValue(object:any,propertyName:String):any;
    static resetThemed(object:any,propertyName:String):Unit;
    static setInitValue(object:any,propertyName:String,value:any):Unit;
    static setThemed(object:any,propertyName:String,value:any):Unit;
    static setThemeValue(object:any,propertyName:String,value:any):Unit;
    static setUserValue(object:any,propertyName:String,value:any):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.Request")
class Request extends js.Object {
    static isCrossDomain(url:String):Boolean;
    static isMethod(method:String):Boolean;
    static isSuccessful(status:Long):Boolean;
    static methodAllowsRequestBody(method:String):Boolean;

}
}
package qx.util {
@js.native
@JSName("qx.util.ResourceManager")
class ResourceManager extends qx.core.Object {
    constructor ();
    static getInstance():qx.util.ResourceManager;
    getCombinedFormat(id:String):String;
    getData(id:String):qx.data.Array;
    getImageFormat(id:String):String;
    getImageHeight(id:String):Int;
    getImageWidth(id:String):Int;
    has(id:String):Boolean;
    toDataUri(resid:String):String;
    toUri(id:String):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.ResponseParser")
class ResponseParser extends js.Object {
    constructor (parser?:String);
    protected _getParser(contentType:String):js.Function;
    parse(response:String,contentType:String):String;
    setParser(parser:String):js.Function;

}
}
package qx.util {
@js.native
@JSName("qx.util.RingBuffer")
class RingBuffer extends js.Object {
    constructor (maxEntries?:Int);
    addEntry(entry:any):Unit;
    clear():Unit;
    clearMark():Unit;
    getAllEntries():qx.data.Array;
    getEntries(count:Int,startingFromMark?:Boolean):qx.data.Array;
    getMaxEntries():Int;
    mark():Unit;
    setMaxEntries(maxEntries:Int):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.Serializer")
class Serializer extends js.Object {
    static toJson(object:qx.core.Object,qxSerializer?:js.Function,dateFormat?:qx.util.format.DateFormat):String;
    static toNativeObject(object:qx.core.Object,qxSerializer?:js.Function,dateFormat?:qx.util.format.DateFormat):String;
    static toUriParameter(object:qx.core.Object,qxSerializer?:js.Function,dateFormat?:qx.util.format.DateFormat):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.StringBuilder")
class StringBuilder extends qx.type.BaseArray {
    constructor (length_or_items?:Int);
    add(varargs?:String):Unit;
    clear():Unit;
    get():String;
    isEmpty():Boolean;
    size():Int;

}
}
package qx.util {
@js.native
@JSName("qx.util.StringEscape")
class StringEscape extends js.Object {
    static escape(str:String,charCodeToEntities:IMap):String;
    static unescape(str:String,entitiesToCharCode:IMap):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.StringSplit")
class StringSplit extends js.Object {
    static split(str:String,separator:js.RegExp,limit?:Int):String[];

}
}
package qx.util {
@js.native
@JSName("qx.util.TimerManager")
class TimerManager extends qx.core.Object {
    static getInstance():qx.util.TimerManager;
    start(callback:js.Function,recurTime:Int,context:qx.core.Object,userData:any,initialTime:Int):Int;
    stop(timerId:Int):Unit;

}
}
package qx.util {
@js.native
@JSName("qx.util.Uri")
class Uri extends js.Object {
    static appendParamsToUrl(url:String,params:String):String;
    static getAbsolute(uri:String):String;
    static parseUri(str:String,strict:Boolean):any;
    static toParameter(obj:any,post:Boolean):String;

}
}
package qx.util {
@js.native
@JSName("qx.util.Validate")
class Validate extends js.Object {
    static checkColor(value:any,formItem:qx.ui.form.IForm,errorMessage?:String):Unit;
    static checkEmail(value:any,formItem:qx.ui.form.IForm,errorMessage?:String):Unit;
    static checkNumber(value:any,formItem:qx.ui.form.IForm,errorMessage?:String):Unit;
    static checkString(value:any,formItem:qx.ui.form.IForm,errorMessage?:String):Unit;
    static checkUrl(value:any,formItem:qx.ui.form.IForm,errorMessage?:String):Unit;
    static color(errorMessage?:String):js.Function;
    static email(errorMessage?:String):js.Function;
    static inArray(array:qx.data.Array,errorMessage?:String):js.Function;
    static number(errorMessage?:String):js.Function;
    static range(from:Long,to:Long,errorMessage?:String):js.Function;
    static regExp(reg:js.RegExp,errorMessage?:String):js.Function;
    static string(errorMessage?:String):js.Function;
    static url(errorMessage?:String):js.Function;

}
}
package qx.util {
@js.native
@JSName("qx.util.ValueManager")
class ValueManager extends qx.core.Object {
    constructor ();
    protected _getDynamic():IMap;
    protected _setDynamic(value:IMap):Unit;
    isDynamic(value:String):Boolean;
    resolve(value:String):any;
    resolveDynamic(value:String):any;

}
}
package qx.util {
@js.native
@JSName("qx.util.Wheel")
class Wheel extends js.Object {
    static getDelta(domEvent:qx.event.type.Event,axis?:String):Int;

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.DateFormat")
class DateFormat extends qx.core.Object implements qx.util.format.IFormat {
    format(obj:any):String;
    parse(str:String):any;
    constructor (format?:String,locale?:String);
    static getDateInstance():qx.util.format.DateFormat;
    static getDateTimeInstance():qx.util.format.DateFormat;
    protected _applyLocale(value:String,old:String):Unit;
    getLocale():String;
    protected initLocale(value:any):String;
    resetLocale():Unit;
    setLocale(value:any):String;

}
}
package qx.util.format {
@js.native
trait IFormat extends js.Object {
    format(obj:any):String;
    parse(str:String):any;

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.NumberFormat")
class NumberFormat extends qx.core.Object implements qx.util.format.IFormat {
    format(obj:any):String;
    parse(str:String):any;
    constructor (locale?:String);
    getGroupingUsed():Boolean;
    getLocale():String;
    getMaximumFractionDigits():Long;
    getMaximumIntegerDigits():Long;
    getMinimumFractionDigits():Long;
    getMinimumIntegerDigits():Long;
    getPostfix():String;
    getPrefix():String;
    protected initGroupingUsed(value:any):Boolean;
    protected initLocale(value:any):String;
    protected initMaximumFractionDigits(value:any):Long;
    protected initMaximumIntegerDigits(value:any):Long;
    protected initMinimumFractionDigits(value:any):Long;
    protected initMinimumIntegerDigits(value:any):Long;
    protected initPostfix(value:any):String;
    protected initPrefix(value:any):String;
    isGroupingUsed():Boolean;
    resetGroupingUsed():Unit;
    resetLocale():Unit;
    resetMaximumFractionDigits():Unit;
    resetMaximumIntegerDigits():Unit;
    resetMinimumFractionDigits():Unit;
    resetMinimumIntegerDigits():Unit;
    resetPostfix():Unit;
    resetPrefix():Unit;
    setGroupingUsed(value:any):Boolean;
    setLocale(value:any):String;
    setMaximumFractionDigits(value:any):Long;
    setMaximumIntegerDigits(value:any):Long;
    setMinimumFractionDigits(value:any):Long;
    setMinimumIntegerDigits(value:any):Long;
    setPostfix(value:any):String;
    setPrefix(value:any):String;
    toggleGroupingUsed():Boolean;

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.FiniteStateMachine")
class FiniteStateMachine extends qx.core.Object {
    constructor (machineName?:String);
    protected _getInternalData():IMap;
    addObject(friendlyName:String,obj:any,groupNames:qx.data.Array):Unit;
    addState(state:qx.util.fsm.State):Unit;
    displayAllObjects():Unit;
    enqueueEvent(event:qx.event.type.Event,bAddAtHead:Boolean):Unit;
    eventListener(event:qx.event.type.Event):Unit;
    fireImmediateEvent(type:String,target:qx.core.Object,data:any):Unit;
    getDebugFlags():Long;
    getFriendlyName(obj:any):String;
    getGroupObjects(groupName:String):qx.data.Array;
    getMaxSavedStates():Long;
    getName():String;
    getNextState():String;
    getObject(friendlyName:String):any;
    getPreviousState():String;
    getState():String;
    protected initDebugFlags(value:any):Long;
    protected initMaxSavedStates(value:any):Long;
    protected initName(value:any):String;
    protected initNextState(value:any):String;
    protected initPreviousState(value:any):String;
    protected initState(value:any):String;
    isTerminated():Boolean;
    popState():String;
    postponeEvent(event:qx.event.type.Event):Unit;
    pushState(state:Boolean):Unit;
    removeObject(friendlyName:String):Unit;
    replaceState(state:qx.util.fsm.State,bDispose:Boolean):any;
    resetDebugFlags():Unit;
    resetMaxSavedStates():Unit;
    resetName():Unit;
    resetNextState():Unit;
    resetPreviousState():Unit;
    resetState():Unit;
    scheduleEvent(type:String,target:qx.core.Object,data:any,timeout:Int):Unit;
    setDebugFlags(value:any):Long;
    setMaxSavedStates(value:any):Long;
    setName(value:any):String;
    setNextState(value:any):String;
    setPreviousState(value:any):String;
    setState(value:any):String;
    start():Unit;

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.State")
class State extends qx.core.Object {
    constructor (stateName?:String,stateInfo?:IMap);
    protected static _commonTransformAutoActions(actionType:String,value:any,context:any):js.Function;
    addTransition(trans:qx.util.fsm.Transition):Unit;
    getAutoActionsAfterOnentry():any;
    getAutoActionsAfterOnexit():any;
    getAutoActionsBeforeOnentry():any;
    getAutoActionsBeforeOnexit():any;
    getEvents():any;
    getName():any;
    getOnentry():any;
    getOnexit():any;
    protected initAutoActionsAfterOnentry(value:any):any;
    protected initAutoActionsAfterOnexit(value:any):any;
    protected initAutoActionsBeforeOnentry(value:any):any;
    protected initAutoActionsBeforeOnexit(value:any):any;
    protected initEvents(value:any):any;
    protected initName(value:any):any;
    protected initOnentry(value:any):any;
    protected initOnexit(value:any):any;
    resetAutoActionsAfterOnentry():Unit;
    resetAutoActionsAfterOnexit():Unit;
    resetAutoActionsBeforeOnentry():Unit;
    resetAutoActionsBeforeOnexit():Unit;
    resetEvents():Unit;
    resetName():Unit;
    resetOnentry():Unit;
    resetOnexit():Unit;
    setAutoActionsAfterOnentry(value:any):any;
    setAutoActionsAfterOnexit(value:any):any;
    setAutoActionsBeforeOnentry(value:any):any;
    setAutoActionsBeforeOnexit(value:any):any;
    setEvents(value:any):any;
    setName(value:any):any;
    setOnentry(value:any):any;
    setOnexit(value:any):any;

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.Transition")
class Transition extends qx.core.Object {
    constructor (transitionName?:String,transitionInfo?:any);
    getAutoActionsAfterOntransition():any;
    getAutoActionsBeforeOntransition():any;
    getName():String;
    getNextState():any;
    getOntransition():any;
    getPredicate():any;
    protected initAutoActionsAfterOntransition(value:any):any;
    protected initAutoActionsBeforeOntransition(value:any):any;
    protected initName(value:any):String;
    protected initNextState(value:any):any;
    protected initOntransition(value:any):any;
    protected initPredicate(value:any):any;
    resetAutoActionsAfterOntransition():Unit;
    resetAutoActionsBeforeOntransition():Unit;
    resetName():Unit;
    resetNextState():Unit;
    resetOntransition():Unit;
    resetPredicate():Unit;
    setAutoActionsAfterOntransition(value:any):any;
    setAutoActionsBeforeOntransition(value:any):any;
    setName(value:any):String;
    setNextState(value:any):any;
    setOntransition(value:any):any;
    setPredicate(value:any):any;

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.AbstractAxis")
class AbstractAxis extends js.Object {
    protected static _isInRange(start:Int,size:Int,areaSize:Int):Boolean;
    protected static _moveToEdgeAndAlign(size:Int,target:IMap,offsets:IMap,position:String):Int;
    static computeStart(size:Int,target:IMap,offsets:IMap,areaSize:Int,position:String):Int;

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.BestFitAxis")
class BestFitAxis extends js.Object {
    static computeStart(size:Int,target:IMap,offsets:IMap,areaSize:Int,position:String):Int;

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.DirectAxis")
class DirectAxis extends js.Object {
    static computeStart(size:Int,target:IMap,offsets:IMap,areaSize:Int,position:String):Int;

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.KeepAlignAxis")
class KeepAlignAxis extends js.Object {
    static computeStart(size:Int,target:IMap,offsets:IMap,areaSize:Int,position:String):Int;

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.Placement")
class Placement extends qx.core.Object {
    constructor ();
    static compute(size:IMap,area:IMap,target:IMap,offsets:IMap,position:String,modeX:String,modeY:String):IMap;
    getAlign():any;
    getAxisX():qx.Class;
    getAxisY():qx.Class;
    getEdge():any;
    protected initAlign(value:any):any;
    protected initAxisX(value:any):qx.Class;
    protected initAxisY(value:any):qx.Class;
    protected initEdge(value:any):any;
    resetAlign():Unit;
    resetAxisX():Unit;
    resetAxisY():Unit;
    resetEdge():Unit;
    setAlign(value:any):any;
    setAxisX(value:any):qx.Class;
    setAxisY(value:any):qx.Class;
    setEdge(value:any):any;

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Document")
class Document extends js.Object {
    static create(namespaceUri?:String,qualifiedName?:String):Document;
    static fromString(str:String):Document;
    static isXmlDocument(elem:Document):Boolean;

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Element")
class Element extends js.Object {
    static createSubElementNS(document:Document,parent:HTMLElement,name:String,namespaceUri:String):HTMLElement;
    static getAttributeNS(element:HTMLElement,namespaceUri:String,name:String):String;
    static getElementsByTagNameNS(element:HTMLElement,namespaceURI:any,tagname:String):HTMLElement[];
    static getSingleNodeText(element:HTMLElement,query:String):String;
    static selectNodes(element:HTMLElement,query:String,namespaces:IMap):HTMLElement[];
    static selectSingleNode(element:HTMLElement,query:String,namespaces:IMap):HTMLElement;
    static serialize(element:HTMLElement):String;
    static setAttributeNS(document:Document,element:HTMLElement,namespaceUri:String,name:String,value:String):Unit;

}
}
package qx.xml {
@js.native
@JSName("qx.xml.String")
class String extends js.Object {
    static escape(str:String):String;
    static unescape(str:String):String;

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Command")
class Command extends qx.core.Object {
    constructor (shortcut?:String);
    protected _applyActive(value:Boolean,old:Boolean):Unit;
    protected _applyEnabled(value:Boolean,old:Boolean):Unit;
    protected _applyShortcut(value:String,old:String):Unit;
    execute(target?:any):Unit;
    getActive():Boolean;
    getEnabled():Boolean;
    getIcon():String;
    getLabel():String;
    getMenu():qx.ui.menu.Menu;
    getShortcut():String;
    getToolTipText():String;
    getValue():any;
    protected initActive(value:any):Boolean;
    protected initEnabled(value:any):Boolean;
    protected initIcon(value:any):String;
    protected initLabel(value:any):String;
    protected initMenu(value:any):qx.ui.menu.Menu;
    protected initShortcut(value:any):String;
    protected initToolTipText(value:any):String;
    protected initValue(value:any):any;
    isActive():Boolean;
    isEnabled():Boolean;
    resetActive():Unit;
    resetEnabled():Unit;
    resetIcon():Unit;
    resetLabel():Unit;
    resetMenu():Unit;
    resetShortcut():Unit;
    resetToolTipText():Unit;
    resetValue():Unit;
    setActive(value:any):Boolean;
    setEnabled(value:any):Boolean;
    setIcon(value:any):String;
    setLabel(value:any):String;
    setMenu(value:any):qx.ui.menu.Menu;
    setShortcut(value:any):String;
    setToolTipText(value:any):String;
    setValue(value:any):any;
    toggleActive():Boolean;
    toggleEnabled():Boolean;

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Group")
class Group extends qx.core.Object {
    constructor ();
    protected _applyActive(value:Boolean,old:Boolean):Unit;
    add(key:String,command:qx.ui.command.Command):Boolean;
    get(key:String):qx.ui.command.Command;
    getActive():Boolean;
    has(key:String):Boolean;
    protected initActive(value:any):Boolean;
    isActive():Boolean;
    remove(key:String):qx.ui.command.Command;
    resetActive():Unit;
    setActive(value:any):Boolean;
    toggleActive():Boolean;

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.GroupManager")
class GroupManager extends qx.core.Object {
    constructor ();
    protected _getGroup(group:qx.ui.command.Group):qx.ui.command.Group;
    add(group:qx.ui.command.Group):Boolean;
    block():Unit;
    getActive():qx.ui.command.Group;
    has(group:qx.ui.command.Group):Boolean;
    remove(group:qx.ui.command.Group):qx.ui.command.Group;
    setActive(group:qx.ui.command.Group):Boolean;
    unblock():Unit;

}
}
