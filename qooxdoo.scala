// Generated declaration file at Sun Apr 24 2016 16:28:40 GMT+0600 (RTZ 5 (зима))

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
    static def base(args: any, varargs: any = ???): any = js.native
    static def bind(func: js.Function, self: any = ???, varargs: any = ???): js.Function = js.native
    static def createNamespace(name: String, object: any): String = js.native
    static def debug(object: any, message: any): Unit = js.native
    static def define(name: String = ???, config: IMap = ???): qx.Class = js.native
    static def error(object: any, message: any): Unit = js.native
    static def extendClass(clazz: js.Function, construct: js.Function, superClass: js.Function, name: js.Function, basename: js.Function): Unit = js.native
    static def firstLow(str: String): String = js.native
    static def firstUp(str: String): String = js.native
    static def genericToString(): String = js.native
    static def getByName(name: String): qx.Class = js.native
    static def getClass(value: any): String = js.native
    static def getEnvironmentSetting(key: String): any = js.native
    static def info(object: any, message: any): Unit = js.native
    static def isArray(value: any): Boolean = js.native
    static def isFunction(value: any): Boolean = js.native
    static def isObject(value: any): Boolean = js.native
    static def isString(value: any): Boolean = js.native
    static def keys(map: any): qx.data.Array = js.native
    static def objectGetLength(map: any): Int = js.native
    static def objectMergeWith(target: any, source: any, overwrite: Boolean = ???): any = js.native
    static def setDisplayName(fcn: js.Function, classname: String, name: String): Unit = js.native
    static def setDisplayNames(functionMap: any, classname: String): Unit = js.native
    static def setEnvironmentSetting(key: String, value: any): Unit = js.native
    static def setRoot(root: any): Unit = js.native
    static def trace(object: any): Unit = js.native
    static def warn(object: any, message: any): Unit = js.native

}
}
package qx {
@js.native
@JSName("qx.Class")
class Class extends js.Object {
    static def define(name: String = ???, config: IMap = ???): qx.Class = js.native
    static def genericToString(): String = js.native
    static def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    static def getByMixin(clazz: qx.Class, mixin: qx.Mixin): qx.Class = js.native
    static def getByName(name: String): qx.Class = js.native
    static def getByProperty(clazz: qx.Class, name: String): qx.Class = js.native
    static def getEventType(clazz: qx.Class, name: String): String = js.native
    static def getInstance(): any = js.native
    static def getInterfaces(clazz: qx.Class): qx.Interface[] = js.native
    static def getMixins(clazz: qx.Class): qx.Mixin[] = js.native
    static def getProperties(clazz: qx.Class): String[] = js.native
    static def getPropertyDefinition(clazz: qx.Class, name: String): IMap = js.native
    static def getTotalNumber(): Long = js.native
    static def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    static def hasMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    static def hasOwnInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    static def hasOwnMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    static def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    static def implementsInterface(obj: any, iface: qx.Interface): Boolean = js.native
    static def include(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    static def isDefined(name: String): Boolean = js.native
    static def isSubClassOf(clazz: qx.Class, superClass: qx.Class): Boolean = js.native
    static def patch(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    static def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native
    static def undefine(name: String): Unit = js.native

}
}
package qx {
@js.native
@JSName("qx.Interface")
class Interface extends js.Object {
    static def assert(clazz: qx.Class, iface: qx.Interface, wrap: Boolean = ???): Unit = js.native
    static def assertObject(object: qx.core.Object, iface: qx.Interface): Unit = js.native
    static def classImplements(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    static def define(name: String, config: IMap = ???): qx.Interface = js.native
    static def flatten(ifaces: qx.Interface[] = ???): qx.data.Array = js.native
    static def genericToString(): String = js.native
    static def getByName(name: String): qx.Class = js.native
    static def getTotalNumber(): Long = js.native
    static def isDefined(name: String): Boolean = js.native
    static def objectImplements(object: qx.core.Object, iface: qx.Interface): Boolean = js.native

}
}
package qx {
@js.native
@JSName("qx.Mixin")
class Mixin extends js.Object {
    static def checkCompatibility(mixins: qx.Mixin[]): Boolean = js.native
    static def define(name: String, config: IMap = ???): qx.Mixin = js.native
    static def flatten(mixins: qx.Mixin[] = ???): qx.data.Array = js.native
    static def genericToString(): String = js.native
    static def getByName(name: String): qx.Class = js.native
    static def getTotalNumber(): Long = js.native
    static def isCompatible(mixin: qx.Mixin, clazz: qx.Class): Boolean = js.native
    static def isDefined(name: String): Boolean = js.native

}
}
package qx {
@js.native
@JSName("qx.Part")
class Part extends js.Object {
    constructor (loader: any = ???);
    static def $$notifyLoad(id: String, closure: js.Function): Unit = js.native
    static def getInstance(): qx.Part = js.native
    static def preload(partNames: String[]): Unit = js.native
    static def require(partNames: String[], callback: js.Function, self: any = ???): Unit = js.native
    def addPackageListener(pkg: any, callback: any): Unit = js.native
    def addPartListener(part: any, callback: any): Unit = js.native
    def addToPackage(pkg: qx.io.part.Package): Unit = js.native
    def getParts(): qx.data.Array = js.native
    def notifyPackageResult(pkg: any): Unit = js.native
    def notifyPartResult(part: any): Unit = js.native
    def saveClosure(id: String, closure: js.Function): Unit = js.native

}
}
package qx {
@js.native
@JSName("qx.Theme")
class Theme extends js.Object {
    static def define(name: String, config: IMap): Unit = js.native
    static def genericToString(): String = js.native
    static def getAll(): IMap = js.native
    static def getByName(name: String): any = js.native
    static def getTotalNumber(): Long = js.native
    static def include(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native
    static def isDefined(name: String): Boolean = js.native
    static def patch(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.AbstractGui")
class AbstractGui extends qx.core.Object implements qx.application.IApplication {
    def close(): String = js.native
    def finalize(): Unit = js.native
    def main(): Unit = js.native
    def terminate(): Unit = js.native
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    protected def _createRootWidget(): qx.ui.core.Widget = js.native
    def getRoot(): qx.ui.core.Widget = js.native
    def render(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Basic")
class Basic extends qx.core.Object implements qx.application.IApplication {
    def close(): String = js.native
    def finalize(): Unit = js.native
    def main(): Unit = js.native
    def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
trait IApplication extends js.Object {
    def close(): String = js.native
    def finalize(): Unit = js.native
    def main(): Unit = js.native
    def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Native")
class Native extends qx.core.Object implements qx.application.IApplication {
    def close(): String = js.native
    def finalize(): Unit = js.native
    def main(): Unit = js.native
    def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Routing")
class Routing extends js.Object {
    constructor ();
    protected def _executeGet(path: String, customData: any, fromEvent: any): Unit = js.native
    protected def _getPathOrFallback(path: String, defaultPath: String = ???): String = js.native
    def back(customData: IMap = ???): Unit = js.native
    def dispose(): Unit = js.native
    def execute(path: String, customData: any): Unit = js.native
    def executeDelete(path: String, params: IMap, customData: any): Unit = js.native
    def executeGet(path: String, customData: any): Unit = js.native
    def executePost(path: String, params: IMap, customData: any): Unit = js.native
    def executePut(path: String, params: IMap, customData: any): Unit = js.native
    def getState(): String = js.native
    def init(defaultPath: String = ???): Unit = js.native
    def on(route: String, handler: js.Function, scope: any): String = js.native
    def onAny(route: String, handler: js.Function, scope: any): String = js.native
    def onDelete(route: String, handler: js.Function, scope: any): String = js.native
    def onGet(route: String, handler: js.Function, scope: any): String = js.native
    def onPost(route: String, handler: js.Function, scope: any): String = js.native
    def onPut(route: String, handler: js.Function, scope: any): String = js.native
    def remove(id: String): Unit = js.native

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
    static def calculateTiming(func: String, x: Int): Int = js.native
    static def request(callback: js.Function, context: any): Long = js.native
    def cancelSequence(): Unit = js.native
    def startSequence(duration: Long): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Blocker")
class Blocker extends qx.core.Object {
    constructor ();
    def block(element: any = ???): Unit = js.native
    def getBlockerColor(): String = js.native
    def getBlockerElement(): HTMLElement = js.native
    def getBlockerOpacity(): Int = js.native
    def getBlockerZIndex(): Int = js.native
    def isBlocked(): Boolean = js.native
    def setBlockerColor(color: String): Unit = js.native
    def setBlockerOpacity(opacity: String): Unit = js.native
    def setBlockerZIndex(zIndex: Int): Unit = js.native
    def unblock(): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Cookie")
class Cookie extends js.Object {
    static def del(key: String, path: String = ???, domain: String = ???): Unit = js.native
    static def get(key: String): any = js.native
    static def set(key: String, value: String, expires: Long = ???, path: String = ???, domain: String = ???, secure: Boolean = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Document")
class Document extends js.Object {
    static def getHeight(win: Window = ???): Int = js.native
    static def getWidth(win: Window = ???): Int = js.native
    static def isQuirksMode(win: Window = ???): Boolean = js.native
    static def isStandardMode(win: Window = ???): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Element")
class Element extends js.Object {
    static def activate(element: HTMLElement): Unit = js.native
    static def addListener(element: HTMLElement, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    static def blur(element: HTMLElement): Unit = js.native
    static def capture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    static def clone(element: HTMLElement, events: Boolean = ???): HTMLElement = js.native
    static def deactivate(element: HTMLElement): Unit = js.native
    static def focus(element: HTMLElement): Unit = js.native
    static def hasListener(element: HTMLElement, type: String, capture: Boolean = ???): Boolean = js.native
    static def releaseCapture(element: HTMLElement): Unit = js.native
    static def removeListener(element: HTMLElement, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): Boolean = js.native
    static def removeListenerById(target: any, id: String): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Event")
class Event extends js.Object {
    static def addNativeListener(target: any, type: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    static def fire(target: HTMLElement, type: String): Boolean = js.native
    static def getEventName(target: any, type: String): String = js.native
    static def getRelatedTarget(e: qx.event.type.Event): HTMLElement = js.native
    static def getTarget(e: qx.event.type.Event): any = js.native
    static def preventDefault(e: qx.event.type.Event): Unit = js.native
    static def removeNativeListener(target: any, type: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    static def stopPropagation(e: qx.event.type.Event): Unit = js.native
    static def supportsEvent(target: any, type: String): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.FileReader")
class FileReader extends qx.core.Object {
    constructor ();
    static def getFile(inputElement: HTMLElement, index: Int): any = js.native
    static def getNumFiles(inputElement: HTMLElement): Int = js.native
    protected def _handleAbort(e: any): Unit = js.native
    protected def _handleError(e: any): Unit = js.native
    protected def _handleLoad(e: any): Unit = js.native
    protected def _handleLoadEnd(e: any): Unit = js.native
    protected def _handleLoadStart(e: any): Unit = js.native
    protected def _handleProgress(e: any): Unit = js.native
    def readAsBinaryString(fileObj: any): Unit = js.native
    def readAsDataURL(fileObj: any): Unit = js.native
    def readAsText(fileObj: any, encoding: String = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Flash")
class Flash extends js.Object {
    static def create(element: HTMLElement, attributes: IMap, variables: IMap = ???, params: IMap = ???, win: Window = ???): HTMLElement = js.native
    static def destroy(element: HTMLElement, win: Window = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Font")
class Font extends qx.core.Object {
    constructor (size: String = ???, family: String[] = ???);
    static def fromConfig(config: IMap): qx.bom.Font = js.native
    static def fromString(str: String): qx.bom.Font = js.native
    static def getDefaultStyles(): IMap = js.native
    protected def _applyBold(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyDecoration(value: any, old: any): Unit = js.native
    protected def _applyFamily(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyItalic(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyLineHeight(value: Long, old: Long): Unit = js.native
    protected def _applySize(value: Int, old: Int): Unit = js.native
    protected def _applyTextShadow(value: String, old: String): Unit = js.native
    def getBold(): Boolean = js.native
    def getColor(): String = js.native
    def getDecoration(): any = js.native
    def getFamily(): qx.data.Array = js.native
    def getItalic(): Boolean = js.native
    def getLineHeight(): Long = js.native
    def getSize(): Int = js.native
    def getStyles(): IMap = js.native
    def getTextShadow(): String = js.native
    protected def initBold(value: any): Boolean = js.native
    protected def initColor(value: any): String = js.native
    protected def initDecoration(value: any): any = js.native
    protected def initFamily(value: any): qx.data.Array = js.native
    protected def initItalic(value: any): Boolean = js.native
    protected def initLineHeight(value: any): Long = js.native
    protected def initSize(value: any): Int = js.native
    protected def initTextShadow(value: any): String = js.native
    def isBold(): Boolean = js.native
    def isItalic(): Boolean = js.native
    def resetBold(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetDecoration(): Unit = js.native
    def resetFamily(): Unit = js.native
    def resetItalic(): Unit = js.native
    def resetLineHeight(): Unit = js.native
    def resetSize(): Unit = js.native
    def resetTextShadow(): Unit = js.native
    def setBold(value: any): Boolean = js.native
    def setColor(value: any): String = js.native
    def setDecoration(value: any): any = js.native
    def setFamily(value: any): qx.data.Array = js.native
    def setItalic(value: any): Boolean = js.native
    def setLineHeight(value: any): Long = js.native
    def setSize(value: any): Int = js.native
    def setTextShadow(value: any): String = js.native
    def toggleBold(): Boolean = js.native
    def toggleItalic(): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.GeoLocation")
class GeoLocation extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.bom.GeoLocation = js.native
    protected def _errorHandler(error: any): Unit = js.native
    protected def _successHandler(position: any): Unit = js.native
    def getCurrentPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def startWatchPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def stopWatchPosition(): Unit = js.native

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
    static def getInstance(): any = js.native
    protected def _applyState(value: String, old: String): Unit = js.native
    protected def _applyTitle(title: String, old: String): Unit = js.native
    protected def _decode(value: String): String = js.native
    protected def _encode(value: String): String = js.native
    protected def _getHash(): String = js.native
    protected def _onHistoryLoad(state: String): Unit = js.native
    protected def _readState(): String = js.native
    protected def _setHash(value: String): Unit = js.native
    protected def _setInitialState(): Unit = js.native
    protected def _writeState(): Unit = js.native
    def addToHistory(state: String, newTitle: String = ???): Unit = js.native
    def getState(): String = js.native
    def getTitle(): String = js.native
    protected def initState(value: any): String = js.native
    protected def initTitle(value: any): String = js.native
    def navigateBack(): Unit = js.native
    def navigateForward(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTitle(): Unit = js.native
    def setState(value: any): String = js.native
    def setTitle(value: any): String = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Html")
class Html extends js.Object {
    static def clean(objs: HTMLElement[], context: Document = ???, fragment: HTMLElement = ???): HTMLElement[] = js.native
    static def extractScripts(elements: HTMLElement[], fragment: Document = ???): HTMLElement[] = js.native
    static def fixEmptyTags(html: String): String = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Iframe")
class Iframe extends js.Object {
    static def create(attributes: IMap = ???, win: Window = ???): HTMLElement = js.native
    static def getBody(iframe: HTMLElement): HTMLElement = js.native
    static def getDocument(iframe: HTMLElement): Document = js.native
    static def getWindow(iframe: HTMLElement): Window = js.native
    static def queryCurrentUrl(iframe: HTMLElement): String = js.native
    static def setSource(iframe: HTMLElement, source: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.IframeHistory")
class IframeHistory extends qx.bom.History {
    constructor ();
    protected def _setState(state: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Input")
class Input extends js.Object {
    static def create(type: String, attributes: IMap, win: Window): HTMLElement = js.native
    static def getValue(element: HTMLElement): String = js.native
    static def setValue(element: HTMLElement, value: String): Unit = js.native
    static def setWrap(element: HTMLElement, wrap: Boolean): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Label")
class Label extends js.Object {
    static def create(content: String, html: Boolean = ???, win: Window = ???): HTMLElement = js.native
    static def getHtmlSize(content: String, styles: IMap = ???, width: Int = ???): IMap = js.native
    static def getTextSize(text: String, styles: IMap): IMap = js.native
    static def getValue(element: HTMLElement): String = js.native
    static def setSanitizer(func: js.Function): Unit = js.native
    static def setValue(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Lifecycle")
class Lifecycle extends js.Object {
    static def onReady(callback: js.Function, context: any = ???): Unit = js.native
    static def onShutdown(callback: js.Function, context: any = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.MediaQuery")
class MediaQuery extends qx.event.Emitter {
    constructor (query: String = ???);
    def getQuery(): String = js.native
    def isMatching(): Boolean = js.native

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
    constructor (document: Document = ???);
    static def getInstance(): qx.bom.PageVisibility = js.native
    def getVisibilityState(): String = js.native
    def isHidden(): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Range")
class Range extends js.Object {
    static def get(node: Node): any = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selection")
class Selection extends js.Object {
    static def get(node: Node): String = js.native
    static def getEnd(node: Node): Int = js.native
    static def getLength(node: Node): Int = js.native
    static def getSelectionObject(documentNode: Document): any = js.native
    static def getStart(node: Node): Int = js.native
    static def set(node: Node, start: Int, end: Int): Boolean = js.native
    static def setAll(node: Node): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selector")
class Selector extends js.Object {
    static def matches(selector: String, set: qx.data.Array): qx.data.Array = js.native
    static def query(selector: String, context: HTMLElement): qx.data.Array = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Shortcut")
class Shortcut extends qx.core.Object {
    constructor (shortcut: String = ???);
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: any): Unit = js.native
    def getAutoRepeat(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getShortcut(): String = js.native
    protected def initAutoRepeat(value: any): Boolean = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initShortcut(value: any): String = js.native
    def isAutoRepeat(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetAutoRepeat(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def setAutoRepeat(value: any): Boolean = js.native
    def setEnabled(value: any): Boolean = js.native
    def setShortcut(value: any): String = js.native
    def toggleAutoRepeat(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Storage")
class Storage extends js.Object {
    static def getLocal(): qx.bom.storage.Web = js.native
    static def getSession(): qx.bom.storage.Web = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.String")
class String extends js.Object {
    static def escape(str: String): String = js.native
    static def fromText(str: String): String = js.native
    static def toText(str: String): String = js.native
    static def unescape(str: String): any = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Style")
class Style extends js.Object {
    static def getAppliedStyle(element: HTMLElement, propertyName: String, value: String, prefixed: Boolean = ???): String = js.native
    static def getCssName(propertyName: String): String = js.native
    static def getPropertyName(propertyName: String): String = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Stylesheet")
class Stylesheet extends js.Object {
    static def addImport(sheet: any, url: String): Unit = js.native
    static def addRule(sheet: any, selector: String, entry: String): Unit = js.native
    static def createElement(text: String = ???): StyleSheet = js.native
    static def includeFile(href: String, doc: Document = ???): Unit = js.native
    static def removeAllImports(sheet: any): Unit = js.native
    static def removeAllRules(sheet: any): Unit = js.native
    static def removeImport(sheet: any, url: String): Unit = js.native
    static def removeRule(sheet: any, selector: String): Unit = js.native
    static def removeSheet(sheet: any): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Template")
class Template extends js.Object {
    protected static def _createNodeFromTemplate(template: String): HTMLElement = js.native
    static def get(id: String, view: any, partials: any): HTMLElement = js.native
    static def render(template: String, view: any, partials: any): String = js.native
    static def renderToNode(template: String, view: any, partials: any): HTMLElement = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Viewport")
class Viewport extends js.Object {
    static def getHeight(win: Window = ???): Int = js.native
    static def getOrientation(win: Window = ???): Int = js.native
    static def getScrollLeft(win: Window = ???): Int = js.native
    static def getScrollTop(win: Window = ???): Int = js.native
    static def getWidth(win: Window = ???): Int = js.native
    static def isLandscape(win: Window = ???): Boolean = js.native
    static def isPortrait(win: Window = ???): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Vml")
class Vml extends js.Object {
    static def create(type: String, attributes: IMap = ???, win: any = ???): HTMLElement = js.native
    static def createImage(source: String = ???, width: Int = ???, height: Int = ???, xOffset: Int = ???, yOffset: Int = ???, imageWidth: Int = ???, imageHeight: Int = ???): HTMLElement = js.native
    static def updateImage(image: HTMLElement, source: String, width: Int, height: Int, xOffset: Int = ???, yOffset: Int = ???, imageWidth: Int = ???, imageHeight: Int = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.WebWorker")
class WebWorker extends qx.core.Object {
    constructor (src: String = ???);
    protected def _handleError(e: qx.event.type.Event): Unit = js.native
    protected def _handleMessage(e: qx.event.type.Event): Unit = js.native
    def postMessage(msg: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Window")
class Window extends js.Object {
    static def close(win: Window): any = js.native
    static def getBlocker(): qx.bom.Blocker = js.native
    static def isClosed(win: Window): Boolean = js.native
    static def moveTo(win: Window, top: Int, left: Int): Unit = js.native
    static def open(url: String, name: String, options: IMap, modal: Boolean, useNativeModalDialog: Boolean, listener: js.Function = ???, self: any = ???): Window = js.native
    static def resizeTo(win: Window, width: Int, height: Int): Unit = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Browser")
class Browser extends js.Object {
    static def getDocumentMode(): Long = js.native
    static def getName(): String = js.native
    static def getQuirksMode(): Boolean = js.native
    static def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Css")
class Css extends js.Object {
    static def getAlphaImageLoaderNeeded(): Boolean = js.native
    static def getAppearance(): String = js.native
    static def getBorderImage(): String = js.native
    static def getBorderImageSyntax(): Boolean = js.native
    static def getBorderRadius(): String = js.native
    static def getBoxModel(): String = js.native
    static def getBoxShadow(): String = js.native
    static def getBoxSizing(): String = js.native
    static def getFilterGradient(): Boolean = js.native
    static def getFilterTextShadow(): Boolean = js.native
    static def getFlexboxSyntax(): String = js.native
    static def getFloat(): String = js.native
    static def getInlineBlock(): String = js.native
    static def getLegacyWebkitGradient(): Boolean = js.native
    static def getLinearGradient(): String = js.native
    static def getOpacity(): Boolean = js.native
    static def getPlaceholder(): Boolean = js.native
    static def getPointerEvents(): Boolean = js.native
    static def getRadialGradient(): String = js.native
    static def getRgba(): Boolean = js.native
    static def getTextOverflow(): String = js.native
    static def getTextShadow(): Boolean = js.native
    static def getUserModify(): String = js.native
    static def getUserSelect(): String = js.native
    static def getUserSelectNone(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssAnimation")
class CssAnimation extends js.Object {
    static def getAnimationEnd(): String = js.native
    static def getAnimationIteration(): String = js.native
    static def getAnimationStart(): String = js.native
    static def getFillMode(): String = js.native
    static def getKeyFrames(): String = js.native
    static def getName(): String = js.native
    static def getPlayState(): String = js.native
    static def getRequestAnimationFrame(): String = js.native
    static def getSupport(): any = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransform")
class CssTransform extends js.Object {
    static def get3D(): Boolean = js.native
    static def getBackFaceVisibility(): String = js.native
    static def getName(): String = js.native
    static def getOrigin(): String = js.native
    static def getPerspective(): String = js.native
    static def getPerspectiveOrigin(): String = js.native
    static def getStyle(): String = js.native
    static def getSupport(): any = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransition")
class CssTransition extends js.Object {
    static def getSupport(): any = js.native
    static def getTransitionName(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Device")
class Device extends js.Object {
    static def detectDeviceType(userAgentString: String): String = js.native
    static def detectMobileDevice(userAgentString: String): Boolean = js.native
    static def detectTabletDevice(userAgentString: String): Boolean = js.native
    static def getDevicePixelRatio(): Long = js.native
    static def getName(): String = js.native
    static def getTouch(): Boolean = js.native
    static def getType(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.EcmaScript")
class EcmaScript extends js.Object {
    static def getArrayEvery(): Boolean = js.native
    static def getArrayFilter(): Boolean = js.native
    static def getArrayForEach(): Boolean = js.native
    static def getArrayIndexOf(): Boolean = js.native
    static def getArrayLastIndexOf(): Boolean = js.native
    static def getArrayMap(): Boolean = js.native
    static def getArrayReduce(): Boolean = js.native
    static def getArrayReduceRight(): Boolean = js.native
    static def getArraySome(): Boolean = js.native
    static def getDateNow(): Boolean = js.native
    static def getErrorToString(): Boolean = js.native
    static def getFunctionBind(): Boolean = js.native
    static def getObjectKeys(): Boolean = js.native
    static def getStackTrace(): String = js.native
    static def getStringTrim(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Engine")
class Engine extends js.Object {
    static def getName(): String = js.native
    static def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Event")
class Event extends js.Object {
    static def getCustomEvent(): Boolean = js.native
    static def getDispatchEvent(): Boolean = js.native
    static def getHashChange(): Boolean = js.native
    static def getHelp(): Boolean = js.native
    static def getMouseEvent(): Boolean = js.native
    static def getMouseWheel(win: Window = ???): IMap = js.native
    static def getMsPointer(): Boolean = js.native
    static def getTouch(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Flash")
class Flash extends js.Object {
    static def getExpressInstall(): Boolean = js.native
    static def getStrictSecurityModel(): Boolean = js.native
    static def getVersion(): String = js.native
    static def isAvailable(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Html")
class Html extends js.Object {
    static def getAudio(): Boolean = js.native
    static def getAudioAif(): String = js.native
    static def getAudioAu(): String = js.native
    static def getAudioMp3(): String = js.native
    static def getAudioOgg(): String = js.native
    static def getAudioWav(): String = js.native
    static def getCanvas(): Boolean = js.native
    static def getClassList(): Boolean = js.native
    static def getCompareDocumentPosition(): Boolean = js.native
    static def getConsole(): Boolean = js.native
    static def getContains(): Boolean = js.native
    static def getDataset(): Boolean = js.native
    static def getDataUrl(callback: js.Function): Unit = js.native
    static def getFileReader(): Boolean = js.native
    static def getFullScreen(): Boolean = js.native
    static def getGeoLocation(): Boolean = js.native
    static def getHistoryState(): Boolean = js.native
    static def getIsEqualNode(): Boolean = js.native
    static def getLocalStorage(): Boolean = js.native
    static def getNaturalDimensions(): Boolean = js.native
    static def getSelection(): String = js.native
    static def getSessionStorage(): Boolean = js.native
    static def getSvg(): Boolean = js.native
    static def getTextContent(): Boolean = js.native
    static def getUserDataStorage(): Boolean = js.native
    static def getVideo(): Boolean = js.native
    static def getVideoH264(): String = js.native
    static def getVideoOgg(): String = js.native
    static def getVideoWebm(): String = js.native
    static def getVml(): Boolean = js.native
    static def getWebWorker(): Boolean = js.native
    static def getXPath(): Boolean = js.native
    static def getXul(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Locale")
class Locale extends js.Object {
    static def getLocale(): String = js.native
    static def getVariant(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.OperatingSystem")
class OperatingSystem extends js.Object {
    static def getName(): String = js.native
    static def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Pdfjs")
class Pdfjs extends js.Object {
    static def getPdfjs(callback: js.Function, context: any): Unit = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.PhoneGap")
class PhoneGap extends js.Object {
    static def getNotification(): Boolean = js.native
    static def getPhoneGap(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Plugin")
class Plugin extends js.Object {
    static def getActiveX(): Boolean = js.native
    static def getDivX(): Boolean = js.native
    static def getDivXVersion(): String = js.native
    static def getGears(): Boolean = js.native
    static def getPdf(): Boolean = js.native
    static def getPdfVersion(): String = js.native
    static def getQuicktime(): Boolean = js.native
    static def getQuicktimeVersion(): String = js.native
    static def getSilverlight(): Boolean = js.native
    static def getSilverlightVersion(): String = js.native
    static def getSkype(): Boolean = js.native
    static def getWindowsMedia(): Boolean = js.native
    static def getWindowsMediaVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Runtime")
class Runtime extends js.Object {
    static def getName(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Scroll")
class Scroll extends js.Object {
    static def getNativeScroll(): Boolean = js.native
    static def scrollBarOverlayed(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Stylesheet")
class Stylesheet extends js.Object {
    static def getAddImport(): Boolean = js.native
    static def getCreateStyleSheet(): Boolean = js.native
    static def getDeleteRule(): Boolean = js.native
    static def getInsertRule(): Boolean = js.native
    static def getRemoveImport(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Transport")
class Transport extends js.Object {
    static def getMaxConcurrentRequestCount(): Int = js.native
    static def getSsl(): Boolean = js.native
    static def getXmlHttpRequest(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Xml")
class Xml extends js.Object {
    static def getAttributeNS(): Boolean = js.native
    static def getCreateElementNS(): Boolean = js.native
    static def getCreateNode(): Boolean = js.native
    static def getDomParser(): Boolean = js.native
    static def getDomProperties(): Boolean = js.native
    static def getElementsByTagNameNS(): Boolean = js.native
    static def getImplementation(): Boolean = js.native
    static def getQualifiedItem(): Boolean = js.native
    static def getSelectNodes(): Boolean = js.native
    static def getSelectSingleNode(): Boolean = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Animation")
class Animation extends js.Object {
    static def animate(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    static def animateReverse(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationCss")
class AnimationCss extends js.Object {
    protected static def _animate(el: HTMLElement, desc: IMap, duration: Int = ???, reverse: Boolean = ???): qx.bom.element.AnimationHandle = js.native
    static def animate(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    static def animateReverse(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationHandle")
class AnimationHandle extends qx.event.Emitter {
    constructor ();
    def isEnded(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def isPlaying(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def stop(): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationJs")
class AnimationJs extends js.Object {
    protected static def _animate(el: HTMLElement, desc: IMap, duration: Int = ???, reverse: Boolean = ???): qx.bom.element.AnimationHandle = js.native
    static def animate(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    static def animateReverse(el: HTMLElement, desc: IMap, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    static def pause(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    static def play(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    static def stop(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Attribute")
class Attribute extends js.Object {
    static def compile(map: IMap): String = js.native
    static def get(element: HTMLElement, name: String): any = js.native
    static def reset(element: HTMLElement, name: String): Unit = js.native
    static def set(element: HTMLElement, name: String, value: any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Background")
class Background extends js.Object {
    static def compile(source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): String = js.native
    static def getStyles(source: String, repeat: String = ???, left: Int = ???, top: Int = ???): IMap = js.native
    static def set(element: HTMLElement, source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.BoxSizing")
class BoxSizing extends js.Object {
    static def compile(value: String): String = js.native
    static def get(element: HTMLElement): String = js.native
    static def reset(element: HTMLElement): Unit = js.native
    static def set(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Class")
class Class extends js.Object {
    static def add(element: HTMLElement, name: String): String = js.native
    static def addClasses(element: HTMLElement, classes: String[]): String = js.native
    static def get(element: HTMLElement): String = js.native
    static def has(element: HTMLElement, name: String): Boolean = js.native
    static def remove(element: HTMLElement, name: String): String = js.native
    static def removeClasses(element: HTMLElement, classes: String[]): String = js.native
    static def replace(element: HTMLElement, oldName: String, newName: String): String = js.native
    static def toggle(element: HTMLElement, name: String, toggle: Boolean = ???): String = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Clip")
class Clip extends js.Object {
    static def compile(map: IMap): String = js.native
    static def get(element: HTMLElement, mode: Long): IMap = js.native
    static def reset(element: HTMLElement): Unit = js.native
    static def set(element: HTMLElement, map: IMap): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Cursor")
class Cursor extends js.Object {
    static def compile(cursor: String): String = js.native
    static def get(element: HTMLElement, mode: Long): String = js.native
    static def reset(element: HTMLElement): Unit = js.native
    static def set(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dataset")
class Dataset extends js.Object {
    static def get(element: HTMLElement, name: String): any = js.native
    static def getAll(element: HTMLElement): IMap = js.native
    static def hasData(element: HTMLElement): Boolean = js.native
    static def remove(element: HTMLElement, name: String): Unit = js.native
    static def set(element: HTMLElement, name: String, value: any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Decoration")
class Decoration extends js.Object {
    static def create(source: String, repeat: String, style: IMap): String = js.native
    static def getAttributes(source: String, repeat: String, style: IMap): String = js.native
    static def getTagName(repeat: String, source: String = ???): String = js.native
    static def processAlphaFix(style: IMap, repeat: String, source: String): IMap = js.native
    static def update(element: HTMLElement, source: String, repeat: String, style: IMap): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dimension")
class Dimension extends js.Object {
    protected static def _getBoundingClientRect(element: HTMLElement): IMap = js.native
    static def getContentHeight(element: HTMLElement): Int = js.native
    static def getContentSize(element: HTMLElement): IMap = js.native
    static def getContentWidth(element: HTMLElement): Int = js.native
    static def getHeight(element: HTMLElement): Int = js.native
    static def getSize(element: HTMLElement): IMap = js.native
    static def getWidth(element: HTMLElement): Int = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Location")
class Location extends js.Object {
    static def get(elem: HTMLElement, mode: String = ???): IMap = js.native
    static def getBottom(elem: HTMLElement, mode: String): Int = js.native
    static def getLeft(elem: HTMLElement, mode: String): Int = js.native
    static def getOffsetParent(element: HTMLElement): HTMLElement = js.native
    static def getPosition(elem: HTMLElement): IMap = js.native
    static def getRelative(elem1: HTMLElement, elem2: HTMLElement, mode1: String = ???, mode2: String = ???): IMap = js.native
    static def getRight(elem: HTMLElement, mode: String): Int = js.native
    static def getTop(elem: HTMLElement, mode: String): Int = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Opacity")
class Opacity extends js.Object {
    static def compile(opacity: Float): String = js.native
    static def get(element: HTMLElement, mode: Long): Float = js.native
    static def reset(element: HTMLElement): Unit = js.native
    static def set(element: HTMLElement, opacity: Float): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Scroll")
class Scroll extends js.Object {
    static def getScrollbarWidth(): Long = js.native
    static def intoView(element: HTMLElement, stop: HTMLElement = ???, alignX: String = ???, alignY: String = ???): Unit = js.native
    static def intoViewX(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native
    static def intoViewY(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Style")
class Style extends js.Object {
    static def compile(map: IMap): String = js.native
    static def get(element: HTMLElement, name: String, mode: Long, smart: Boolean = ???): any = js.native
    static def getCss(element: HTMLElement): String = js.native
    static def isPropertySupported(propertyName: String): Boolean = js.native
    static def reset(element: HTMLElement, name: String, smart: Boolean = ???): Unit = js.native
    static def set(element: HTMLElement, name: String, value: any, smart: Boolean = ???): Unit = js.native
    static def setCss(element: HTMLElement, value: String): Unit = js.native
    static def setStyles(element: HTMLElement, styles: IMap, smart: Boolean = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Transform")
class Transform extends js.Object {
    protected static def _compute3dProperty(property: String, params: qx.data.Array): String = js.native
    protected static def _computeAxisProperties(property: String, params: qx.data.Array): String = js.native
    static def getBackfaceVisibility(el: HTMLElement): Boolean = js.native
    static def getCss(transforms: IMap): String = js.native
    static def getOrigin(el: HTMLElement): String = js.native
    static def getPerspective(el: HTMLElement): String = js.native
    static def getPerspectiveOrigin(el: HTMLElement): String = js.native
    static def getStyle(el: HTMLElement): String = js.native
    static def getTransformValue(transforms: IMap): String = js.native
    static def rotate(el: HTMLElement, value: String): Unit = js.native
    static def scale(el: HTMLElement, value: Long): Unit = js.native
    static def setBackfaceVisibility(el: HTMLElement, value: Boolean): Unit = js.native
    static def setOrigin(el: HTMLElement, value: String): Unit = js.native
    static def setPerspective(el: HTMLElement, value: Long): Unit = js.native
    static def setPerspectiveOrigin(el: HTMLElement, value: String): Unit = js.native
    static def setStyle(el: HTMLElement, value: String): Unit = js.native
    static def skew(el: HTMLElement, value: String): Unit = js.native
    static def transform(el: HTMLElement, transforms: IMap): Unit = js.native
    static def translate(el: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Abstract")
class Abstract extends qx.core.Object {
    constructor (media: any = ???);
    protected def _handleEndedEvent(): Unit = js.native
    protected def _handleLoadedDataEvent(): Unit = js.native
    protected def _handleLoadedMetaDataEvent(): Unit = js.native
    protected def _handlePauseEvent(): Unit = js.native
    protected def _handlePlayEvent(): Unit = js.native
    protected def _handleTimeUpdateEvent(): Unit = js.native
    protected def _handleVolumeChangeEvent(): Unit = js.native
    def canPlayType(type: String): Boolean = js.native
    def getAutoplay(): Boolean = js.native
    def getCurrentTime(): Long = js.native
    def getDuration(): Long = js.native
    def getId(): String = js.native
    def getMediaObject(): any = js.native
    def getPreload(): String = js.native
    def getSource(): String = js.native
    def getVolume(): Long = js.native
    def hasControls(): Boolean = js.native
    def hideControls(): Unit = js.native
    def isEnded(): Boolean = js.native
    def isLoop(): Boolean = js.native
    def isMuted(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def setAutoplay(autoplay: Boolean): Unit = js.native
    def setCurrentTime(value: Long): Unit = js.native
    def setId(id: String): Unit = js.native
    def setLoop(value: Boolean): Unit = js.native
    def setMuted(muted: Boolean): Unit = js.native
    def setPreload(preload: String): Unit = js.native
    def setSource(source: String): Unit = js.native
    def setVolume(volume: Long): Unit = js.native
    def showControls(): Unit = js.native

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Audio")
class Audio extends qx.bom.media.Abstract {
    constructor (source: String = ???);

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Video")
class Video extends qx.bom.media.Abstract {
    constructor (source: String = ???);
    def getHeight(): Long = js.native
    def getPoster(): String = js.native
    def getVideoHeight(): Long = js.native
    def getVideoWidth(): Long = js.native
    def getWidth(): Long = js.native
    def setHeight(value: Long): Unit = js.native
    def setPoster(value: String): Unit = js.native
    def setWidth(value: Long): Unit = js.native

}
}
package qx.bom.request {
@js.native
trait IRequest extends js.Object {
    def abort(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(header: String): String = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String, url: String, async: Boolean = ???): Unit = js.native
    def send(data: String = ???): Unit = js.native
    def setRequestHeader(key: String, value: String): Unit = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Jsonp")
class Jsonp extends qx.bom.request.Script {
    constructor ();
    def callback(data: any): Unit = js.native
    def getGeneratedUrl(): String = js.native
    def setCallbackName(name: String): qx.bom.request.Jsonp = js.native
    def setCallbackParam(param: String): qx.bom.request.Jsonp = js.native
    def setPrefix(prefix: String): Unit = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Script")
class Script extends js.Object {
    constructor ();
    protected def _emit(event: String): Unit = js.native
    protected def _getScriptElement(): HTMLElement = js.native
    protected def _getUrl(): String = js.native
    protected def _onNativeError(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _readyStateChange(readyState: Long): Unit = js.native
    protected def _success(): Unit = js.native
    def abort(): qx.bom.request.Script = js.native
    def dispose(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: any = ???): qx.bom.request.Script = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String, url: String): Unit = js.native
    def send(): qx.bom.request.Script = js.native
    def setDetermineSuccess(check: js.Function): Unit = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Script = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.SimpleXhr")
class SimpleXhr extends qx.event.Emitter {
    constructor (url: String = ???, method: String = ???);
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    protected def _createTransport(): qx.bom.request.IRequest = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _registerTransportListener(transport: qx.bom.request.IRequest): qx.bom.request.IRequest = js.native
    protected def _serializeData(data: String, contentType: String = ???): String = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): qx.bom.request.SimpleXhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getMethod(): String = js.native
    def getRequestData(): String = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseHeader(header: String): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): any = js.native
    def getUrl(): String = js.native
    def isCaching(): Boolean = js.native
    def isDisposed(): Boolean = js.native
    def isDone(): Boolean = js.native
    def send(): Unit = js.native
    def setMethod(method: String): qx.bom.request.SimpleXhr = js.native
    def setParser(parser: String): js.Function = js.native
    def setRequestData(data: String): qx.bom.request.SimpleXhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.SimpleXhr = js.native
    def setTimeout(millis: Long): qx.bom.request.SimpleXhr = js.native
    def setUrl(url: String): qx.bom.request.SimpleXhr = js.native
    def toHashCode(): Int = js.native
    def useCaching(value: Boolean): qx.bom.request.SimpleXhr = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Xhr")
class Xhr extends js.Object {
    constructor ();
    protected def _createNativeXhr(): any = js.native
    protected def _emit(event: String): Unit = js.native
    protected def _getProtocol(): String = js.native
    def abort(): qx.bom.request.Xhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getRequest(): any = js.native
    def getResponseHeader(header: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: any = ???): qx.bom.request.Xhr = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String = ???, url: String = ???, async: Boolean = ???, user: String = ???, password: String = ???): Unit = js.native
    def overrideMimeType(mimeType: String): qx.bom.request.Xhr = js.native
    def send(data: String = ???): qx.bom.request.Xhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Xhr = js.native

}
}
package qx.bom.rest {
@js.native
@JSName("qx.bom.rest.Resource")
class Resource extends qx.event.Emitter {
    constructor (description: IMap = ???);
    static def placeholdersFromUrl(url: String): qx.data.Array = js.native
    protected def _getRequest(): qx.bom.request.SimpleXhr = js.native
    protected def _getRequestConfig(action: String, params: IMap): IMap = js.native
    protected def _getRequestHandler(): IMap = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _startPoll(action: String, listener: js.Function, interval: Long): Unit = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def destruct(): Unit = js.native
    def dispose(): Unit = js.native
    def getRequestsByAction(action: String): qx.data.Array = js.native
    def invoke(action: String, params: IMap, data: IMap): Long = js.native
    def isDisposed(): Boolean = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: IMap = ???): Unit = js.native
    def poll(action: String, interval: Long, params: IMap = ???, immediately: Boolean = ???): Unit = js.native
    def refresh(action: String): Unit = js.native
    def restartPollByAction(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native
    def setRequestFactory(fn: js.Function): Unit = js.native
    def setRequestHandler(handler: IMap): Unit = js.native
    def stopPollByAction(action: String): Unit = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Memory")
class Memory extends js.Object {
    constructor ();
    static def getLocal(): qx.bom.storage.Memory = js.native
    static def getSession(): qx.bom.storage.Memory = js.native
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: any): Unit = js.native
    def getItem(key: String): any = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): IMap = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: any): Unit = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.UserData")
class UserData extends js.Object {
    constructor (storeName: String = ???);
    static def getLocal(): qx.bom.storage.UserData = js.native
    static def getSession(): qx.bom.storage.UserData = js.native
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: any): Unit = js.native
    def getItem(key: String): any = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): IMap = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: any): Unit = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Web")
class Web extends js.Object {
    constructor (type: String = ???);
    static def getLocal(): qx.bom.storage.Web = js.native
    static def getSession(): qx.bom.storage.Web = js.native
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: any): Unit = js.native
    def getItem(key: String): any = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): any = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: any): Unit = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.bom.webfonts.Manager = js.native
    def getPreferredFormats(): String[] = js.native
    def remove(familyName: String): Unit = js.native
    def removeStyleSheet(): Unit = js.native
    def require(familyName: String, sourcesList: String[], callback: js.Function = ???, context: any = ???): Unit = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Validator")
class Validator extends qx.core.Object {
    constructor (fontFamily: String = ???);
    static def removeDefaultHelperElements(): Unit = js.native
    protected def _applyFontFamily(value: any, old: any): Unit = js.native
    protected def _getHelperElement(fontFamily: String): HTMLElement = js.native
    protected def _getRequestedHelpers(): IMap = js.native
    protected def _isFontValid(): Boolean = js.native
    protected def _reset(): Unit = js.native
    def getFontFamily(): any = js.native
    def getTimeout(): Int = js.native
    protected def initFontFamily(value: any): any = js.native
    protected def initTimeout(value: any): Int = js.native
    def resetFontFamily(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def setFontFamily(value: any): any = js.native
    def setTimeout(value: any): Int = js.native
    def validate(): Unit = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.WebFont")
class WebFont extends qx.bom.Font {
    protected def _applySources(value: any, old: any): Unit = js.native
    protected def _onWebFontChangeStatus(ev: qx.event.type.Data): Unit = js.native
    protected def _quoteFontFamily(familyName: String): String = js.native
    def getSources(): any = js.native
    protected def initSources(value: any): any = js.native
    def resetSources(): Unit = js.native
    def setSources(value: any): any = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Aspect")
class Aspect extends js.Object {
    static def addAdvice(fcn: js.Function, position: String = ???, type: String = ???, name: String = ???): Unit = js.native
    static def wrap(fullName: String, fcn: js.Function, type: String): js.Function = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Assert")
class Assert extends js.Object {
    static def assert(condition: any, msg: String): Unit = js.native
    static def assertArgumentsCount(args: any, minCount: Int, maxCount: Int, msg: String): Unit = js.native
    static def assertArray(value: any, msg: String): Unit = js.native
    static def assertArrayEquals(expected: qx.data.Array, found: qx.data.Array, msg: String): Unit = js.native
    static def assertBoolean(value: any, msg: String): Unit = js.native
    static def assertCssColor(expected: String, value: String, msg: String): Unit = js.native
    static def assertElement(value: any, msg: String): Unit = js.native
    static def assertEquals(expected: any, found: any, msg: String): Unit = js.native
    static def assertEventFired(obj: any, event: String, invokeFunc: js.Function, listenerFunc: js.Function = ???, msg: String = ???): Unit = js.native
    static def assertEventNotFired(obj: any, event: String, invokeFunc: js.Function, msg: String): Unit = js.native
    static def assertException(callback: js.Function, exception: js.Error = ???, re: String = ???, msg: String = ???): Unit = js.native
    static def assertFalse(value: Boolean, msg: String): Unit = js.native
    static def assertFunction(value: any, msg: String): Unit = js.native
    static def assertIdentical(expected: any, found: any, msg: String): Unit = js.native
    static def assertInArray(value: any, array: qx.data.Array, msg: String): Unit = js.native
    static def assertInRange(value: any, min: Long, max: Long, msg: String): Unit = js.native
    static def assertInstance(value: any, clazz: qx.Class, msg: String): Unit = js.native
    static def assertInteger(value: any, msg: String): Unit = js.native
    static def assertInterface(value: any, iface: qx.Class, msg: String): Unit = js.native
    static def assertJsonEquals(expected: any, found: any, msg: String): Unit = js.native
    static def assertKeyInMap(value: any, map: IMap, msg: String): Unit = js.native
    static def assertMap(value: any, msg: String): Unit = js.native
    static def assertMatch(str: String, re: String, msg: String): Unit = js.native
    static def assertNotEquals(expected: any, found: any, msg: String): Unit = js.native
    static def assertNotIdentical(expected: any, found: any, msg: String): Unit = js.native
    static def assertNotNull(value: any, msg: String): Unit = js.native
    static def assertNotUndefined(value: any, msg: String): Unit = js.native
    static def assertNull(value: any, msg: String): Unit = js.native
    static def assertNumber(value: any, msg: String): Unit = js.native
    static def assertObject(value: any, msg: String): Unit = js.native
    static def assertPositiveInteger(value: any, msg: String): Unit = js.native
    static def assertPositiveNumber(value: any, msg: String): Unit = js.native
    static def assertQxObject(value: any, msg: String): Unit = js.native
    static def assertQxWidget(value: any, msg: String): Unit = js.native
    static def assertRegExp(value: any, msg: String): Unit = js.native
    static def assertString(value: any, msg: String): Unit = js.native
    static def assertTrue(value: Boolean, msg: String): Unit = js.native
    static def assertType(value: any, type: String, msg: String): Unit = js.native
    static def assertUndefined(value: any, msg: String): Unit = js.native
    static def fail(msg: String, compact: Boolean): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.AssertionError")
class AssertionError extends qx.type.BaseError {
    constructor (comment: String = ???, failMessage: String = ???);
    def getStackTrace(): String[] = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.BaseInit")
class BaseInit extends js.Object {
    static def getApplication(): qx.core.Object = js.native
    static def ready(): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Environment")
class Environment extends js.Object {
    protected static def _getClassNameFromEnvKey(key: String): qx.data.Array = js.native
    protected static def _initDefaultQxValues(): Unit = js.native
    static def add(key: String, check: any): Unit = js.native
    static def addAsync(key: String, check: js.Function): Unit = js.native
    static def filter(map: IMap): qx.data.Array = js.native
    static def get(key: String): any = js.native
    static def getAsync(key: String, callback: js.Function, self: any): Unit = js.native
    static def getAsyncChecks(): IMap = js.native
    static def getChecks(): IMap = js.native
    static def invalidateCacheKey(key: String): Unit = js.native
    static def select(key: String, values: IMap): any = js.native
    static def selectAsync(key: String, values: IMap, self: any): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.GlobalError")
class GlobalError extends js.Error {
    constructor (exc: js.Error = ???, args: qx.data.Array = ???);
    def getArguments(): any = js.native
    def getSourceException(): js.Error = js.native

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
    def assert(condition: any, msg: String): Unit = js.native
    def assertArgumentsCount(args: any, minCount: Int, maxCount: Int, msg: String): Unit = js.native
    def assertArray(value: any, msg: String): Unit = js.native
    def assertArrayEquals(expected: qx.data.Array, found: qx.data.Array, msg: String): Unit = js.native
    def assertBoolean(value: any, msg: String): Unit = js.native
    def assertCssColor(expected: String, value: String, msg: String): Unit = js.native
    def assertElement(value: any, msg: String): Unit = js.native
    def assertEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertEventFired(obj: any, event: String, invokeFunc: js.Function, listener: js.Function = ???, msg: String = ???): Unit = js.native
    def assertEventNotFired(obj: any, event: String, invokeFunc: js.Function, msg: String): Unit = js.native
    def assertException(callback: js.Function, exception: js.Error = ???, re: String = ???, msg: String = ???): Unit = js.native
    def assertFalse(value: Boolean, msg: String): Unit = js.native
    def assertFunction(value: any, msg: String): Unit = js.native
    def assertIdentical(expected: any, found: any, msg: String): Unit = js.native
    def assertInArray(value: any, array: qx.data.Array, msg: String): Unit = js.native
    def assertInRange(value: any, min: Long, max: Long, msg: String): Unit = js.native
    def assertInstance(value: any, clazz: qx.Class, msg: String): Unit = js.native
    def assertInteger(value: any, msg: String): Unit = js.native
    def assertInterface(value: any, iface: qx.Class, msg: String): Unit = js.native
    def assertJsonEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertKeyInMap(value: any, map: IMap, msg: String): Unit = js.native
    def assertMap(value: any, msg: String): Unit = js.native
    def assertMatch(str: String, re: js.RegExp, msg: String): Unit = js.native
    def assertNotEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertNotIdentical(expected: any, found: any, msg: String): Unit = js.native
    def assertNotNull(value: any, msg: String): Unit = js.native
    def assertNotUndefined(value: any, msg: String): Unit = js.native
    def assertNull(value: any, msg: String): Unit = js.native
    def assertNumber(value: any, msg: String): Unit = js.native
    def assertObject(value: any, msg: String): Unit = js.native
    def assertPositiveInteger(value: any, msg: String): Unit = js.native
    def assertPositiveNumber(value: any, msg: String): Unit = js.native
    def assertQxObject(value: any, msg: String): Unit = js.native
    def assertQxWidget(value: any, msg: String): Unit = js.native
    def assertRegExp(value: any, msg: String): Unit = js.native
    def assertString(value: any, msg: String): Unit = js.native
    def assertTrue(value: Boolean, msg: String): Unit = js.native
    def assertType(value: any, type: String, msg: String): Unit = js.native
    def assertUndefined(value: any, msg: String): Unit = js.native
    def fail(msg: String, compact: Boolean): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MBindTo")
class MBindTo extends js.Object {
    def bindTo(func: js.Function, varargs: any = ???): js.Function = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MEvent")
class MEvent extends js.Object {
    def addListener(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    def addListenerOnce(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    def dispatchEvent(evt: qx.event.type.Event): Boolean = js.native
    def fireDataEvent(type: String, data: any, oldData: any = ???, cancelable: Boolean = ???): Boolean = js.native
    def fireEvent(type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def fireNonBubblingEvent(type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def hasListener(type: String, capture: Boolean = ???): Boolean = js.native
    def removeListener(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(id: String): Boolean = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MLogging")
class MLogging extends js.Object {
    def debug(varargs: any = ???): Unit = js.native
    def error(varargs: any = ???): Unit = js.native
    def info(varargs: any = ???): Unit = js.native
    def trace(): Unit = js.native
    def warn(varargs: any = ???): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MProperty")
class MProperty extends js.Object {
    def get(prop: String): any = js.native
    def reset(prop: String): Unit = js.native
    def set(data: IMap, value: any = ???): any = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Object")
class Object extends js.Object {
    def addListener(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    def addListenerOnce(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    def dispatchEvent(evt: qx.event.type.Event): Boolean = js.native
    def fireDataEvent(type: String, data: any, oldData: any = ???, cancelable: Boolean = ???): Boolean = js.native
    def fireEvent(type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def fireNonBubblingEvent(type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def hasListener(type: String, capture: Boolean = ???): Boolean = js.native
    def removeListener(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(id: String): Boolean = js.native
    def assert(condition: any, msg: String): Unit = js.native
    def assertArgumentsCount(args: any, minCount: Int, maxCount: Int, msg: String): Unit = js.native
    def assertArray(value: any, msg: String): Unit = js.native
    def assertArrayEquals(expected: qx.data.Array, found: qx.data.Array, msg: String): Unit = js.native
    def assertBoolean(value: any, msg: String): Unit = js.native
    def assertCssColor(expected: String, value: String, msg: String): Unit = js.native
    def assertElement(value: any, msg: String): Unit = js.native
    def assertEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertEventFired(obj: any, event: String, invokeFunc: js.Function, listener: js.Function = ???, msg: String = ???): Unit = js.native
    def assertEventNotFired(obj: any, event: String, invokeFunc: js.Function, msg: String): Unit = js.native
    def assertException(callback: js.Function, exception: js.Error = ???, re: String = ???, msg: String = ???): Unit = js.native
    def assertFalse(value: Boolean, msg: String): Unit = js.native
    def assertFunction(value: any, msg: String): Unit = js.native
    def assertIdentical(expected: any, found: any, msg: String): Unit = js.native
    def assertInArray(value: any, array: qx.data.Array, msg: String): Unit = js.native
    def assertInRange(value: any, min: Long, max: Long, msg: String): Unit = js.native
    def assertInstance(value: any, clazz: qx.Class, msg: String): Unit = js.native
    def assertInteger(value: any, msg: String): Unit = js.native
    def assertInterface(value: any, iface: qx.Class, msg: String): Unit = js.native
    def assertJsonEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertKeyInMap(value: any, map: IMap, msg: String): Unit = js.native
    def assertMap(value: any, msg: String): Unit = js.native
    def assertMatch(str: String, re: js.RegExp, msg: String): Unit = js.native
    def assertNotEquals(expected: any, found: any, msg: String): Unit = js.native
    def assertNotIdentical(expected: any, found: any, msg: String): Unit = js.native
    def assertNotNull(value: any, msg: String): Unit = js.native
    def assertNotUndefined(value: any, msg: String): Unit = js.native
    def assertNull(value: any, msg: String): Unit = js.native
    def assertNumber(value: any, msg: String): Unit = js.native
    def assertObject(value: any, msg: String): Unit = js.native
    def assertPositiveInteger(value: any, msg: String): Unit = js.native
    def assertPositiveNumber(value: any, msg: String): Unit = js.native
    def assertQxObject(value: any, msg: String): Unit = js.native
    def assertQxWidget(value: any, msg: String): Unit = js.native
    def assertRegExp(value: any, msg: String): Unit = js.native
    def assertString(value: any, msg: String): Unit = js.native
    def assertTrue(value: Boolean, msg: String): Unit = js.native
    def assertType(value: any, type: String, msg: String): Unit = js.native
    def assertUndefined(value: any, msg: String): Unit = js.native
    def fail(msg: String, compact: Boolean): Unit = js.native
    def get(prop: String): any = js.native
    def reset(prop: String): Unit = js.native
    def set(data: IMap, value: any = ???): any = js.native
    def debug(varargs: any = ???): Unit = js.native
    def error(varargs: any = ???): Unit = js.native
    def info(varargs: any = ???): Unit = js.native
    def trace(): Unit = js.native
    def warn(varargs: any = ???): Unit = js.native
    def bind(sourcePropertyChain: String, targetObject: qx.core.Object, targetProperty: String, options: IMap): any = js.native
    def getBindings(): qx.data.Array = js.native
    def removeAllBindings(): Unit = js.native
    def removeBinding(id: any): Unit = js.native
    def removeRelatedBindings(relatedObject: qx.core.Object): Unit = js.native
    constructor ();
    protected def _disposeArray(field: String): Unit = js.native
    protected def _disposeMap(field: String): Unit = js.native
    protected def _disposeObjects(varargs: any = ???): Unit = js.native
    protected def _disposeSingletonObjects(varargs: any = ???): Unit = js.native
    def base(args: any, varargs: any = ???): any = js.native
    def clone(): qx.core.Object = js.native
    def dispose(): Unit = js.native
    def getUserData(key: String): any = js.native
    def isDisposed(): Boolean = js.native
    def self(args: any): any = js.native
    def setUserData(key: String, value: any): Unit = js.native
    def toHashCode(): Int = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.ObjectRegistry")
class ObjectRegistry extends js.Object {
    static def clearHashCode(obj: any): Unit = js.native
    static def fromHashCode(hash: String): qx.core.Object = js.native
    static def getNextHash(): Int = js.native
    static def getPostId(): Int = js.native
    static def getRegistry(): any = js.native
    static def getStackTraces(): IMap = js.native
    static def register(obj: any): Unit = js.native
    static def shutdown(): Unit = js.native
    static def toHashCode(obj: any): String = js.native
    static def unregister(obj: any): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Property")
class Property extends js.Object {
    static def attachMethods(clazz: qx.Class, name: String, config: IMap): Unit = js.native
    static def attachRefreshInheritables(clazz: qx.Class): Unit = js.native
    static def error(obj: qx.core.Object, id: Int, property: String, variant: String, value: any): Unit = js.native
    static def executeOptimizedGetter(instance: any, clazz: qx.Class, name: String, variant: String): any = js.native
    static def executeOptimizedSetter(instance: any, clazz: qx.Class, name: String, variant: String, args: any): any = js.native

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
    constructor (failMessage: String = ???, uri: String = ???, lineNumber: Int = ???);
    def getLineNumber(): Int = js.native
    def getUri(): String = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.Array")
class Array extends qx.core.Object implements qx.data.IListData {
    def contains(item: any): Boolean = js.native
    def getItem(index: Long): any = js.native
    def getLength(): Long = js.native
    def setItem(index: Long, item: any): Unit = js.native
    def splice(startIndex: Int, amount: Int, varargs: any = ???): qx.data.Array = js.native
    def toArray(): qx.data.Array = js.native
    constructor (param: any = ???);
    def append(array: qx.data.Array): Unit = js.native
    def concat(array: qx.data.Array): qx.data.Array = js.native
    def copy(): qx.data.Array = js.native
    def equals(array: qx.data.Array): Boolean = js.native
    def every(callback: js.Function, self: any = ???): Boolean = js.native
    def filter(callback: js.Function, self: any = ???): qx.data.Array = js.native
    def forEach(callback: js.Function, context: any): Unit = js.native
    def getAutoDisposeItems(): Boolean = js.native
    def indexOf(item: any): Long = js.native
    protected def initAutoDisposeItems(value: any): Boolean = js.native
    def insertAfter(after: any, item: any): Unit = js.native
    def insertAt(index: Int, item: any): Unit = js.native
    def insertBefore(before: any, item: any): Unit = js.native
    def isAutoDisposeItems(): Boolean = js.native
    def join(connector: String): String = js.native
    def lastIndexOf(item: any): Long = js.native
    def map(callback: js.Function, self: any = ???): qx.data.Array = js.native
    def max(): Long = js.native
    def min(): Long = js.native
    def pop(): any = js.native
    def push(varargs: any = ???): Long = js.native
    def reduce(callback: js.Function, initValue: any = ???): any = js.native
    def reduceRight(callback: js.Function, initValue: any = ???): any = js.native
    def remove(item: any): any = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): any = js.native
    def resetAutoDisposeItems(): Unit = js.native
    def reverse(): Unit = js.native
    def setAutoDisposeItems(value: any): Boolean = js.native
    def shift(): any = js.native
    def slice(from: Long, to: Long = ???): qx.data.Array = js.native
    def some(callback: js.Function, self: any = ???): Boolean = js.native
    def sort(func: js.Function): Unit = js.native
    def sum(): Long = js.native
    def toggleAutoDisposeItems(): Boolean = js.native
    def unshift(varargs: any = ???): Int = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.Conversion")
class Conversion extends js.Object {
    static def toBoolean(value: any): Boolean = js.native
    static def toNumber(value: any): Long = js.native

}
}
package qx.data {
@js.native
trait IListData extends js.Object {
    def contains(item: any): Boolean = js.native
    def getItem(index: Long): any = js.native
    def getLength(): Long = js.native
    def setItem(index: Long, item: any): Unit = js.native
    def splice(startIndex: Int, amount: Int, varargs: any = ???): qx.data.Array = js.native
    def toArray(): qx.data.Array = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.MBinding")
class MBinding extends js.Object {
    constructor ();
    def bind(sourcePropertyChain: String, targetObject: qx.core.Object, targetProperty: String, options: IMap): any = js.native
    def getBindings(): qx.data.Array = js.native
    def removeAllBindings(): Unit = js.native
    def removeBinding(id: any): Unit = js.native
    def removeRelatedBindings(relatedObject: qx.core.Object): Unit = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.SingleValueBinding")
class SingleValueBinding extends js.Object {
    static def bind(sourceObject: qx.core.Object, sourcePropertyChain: String, targetObject: qx.core.Object, targetPropertyChain: String, options: IMap = ???): any = js.native
    static def getAllBindings(): IMap = js.native
    static def getAllBindingsForObject(object: qx.core.Object): qx.data.Array = js.native
    static def removeAllBindings(): Unit = js.native
    static def removeAllBindingsForObject(object: qx.core.Object): Unit = js.native
    static def removeBindingFromObject(sourceObject: qx.core.Object, id: any): Unit = js.native
    static def removeRelatedBindings(object: qx.core.Object, relatedObject: qx.core.Object): Unit = js.native
    static def resolvePropertyChain(o: qx.core.Object, propertyChain: String): any = js.native
    static def showAllBindingsInLog(): Unit = js.native
    static def showBindingInLog(object: qx.core.Object, id: any): Unit = js.native
    static def updateTarget(sourceObject: qx.core.Object, sourcePropertyChain: String, targetObject: qx.core.Object, targetPropertyChain: String, options: IMap): Unit = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Form")
class Form extends qx.core.Object {
    constructor (model: qx.core.Object = ???, target: qx.ui.form.Form = ???, selfUpdate: Boolean = ???);
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyTarget(value: qx.ui.form.Form, old: qx.ui.form.Form): Unit = js.native
    def addBindingOptions(name: String, model2target: IMap, target2model: IMap): Unit = js.native
    def createModel(includeBubbleEvents: Boolean): qx.core.Object = js.native
    def getModel(): qx.core.Object = js.native
    def getTarget(): qx.ui.form.Form = js.native
    protected def initModel(value: any): qx.core.Object = js.native
    protected def initTarget(value: any): qx.ui.form.Form = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setModel(value: any): qx.core.Object = js.native
    def setTarget(value: any): qx.ui.form.Form = js.native
    def updateModel(): Unit = js.native

}
}
package qx.data.controller {
@js.native
trait IControllerDelegate extends js.Object {
    def bindItem(controller: any, item: qx.ui.core.Widget, id: any): Unit = js.native
    def configureItem(item: any): Unit = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: any): Boolean = js.native

}
}
package qx.data.controller {
@js.native
trait ISelection extends js.Object {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.List")
class List extends qx.core.Object implements qx.data.controller.ISelection {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native
    constructor (model: qx.data.Array = ???, target: qx.ui.core.Widget = ???, labelPath: String = ???);
    protected def _applyDelegate(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyIconOptions(value: IMap, old: IMap): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: IMap, old: IMap): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyTarget(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _bindListItem(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    protected def _createItem(): qx.ui.form.ListItem = js.native
    protected def _onBindingSet(index: Long, sourceObject: qx.core.Object, targetObject: qx.core.Object): Unit = js.native
    protected def _removeBindingsFrom(item: Long): Unit = js.native
    protected def _setBindItem(value: any, old: any): Unit = js.native
    protected def _setConfigureItem(value: any, old: any): Unit = js.native
    protected def _setCreateItem(value: any, old: any): Unit = js.native
    protected def _setFilter(value: js.Function, old: js.Function): Unit = js.native
    def bindDefaultProperties(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: IMap, targetWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourcePath: String, options: IMap, sourceWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def getDelegate(): any = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    def getTarget(): any = js.native
    def getVisibleModels(): qx.data.Array = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    protected def initModel(value: any): qx.data.IListData = js.native
    protected def initTarget(value: any): any = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setDelegate(value: any): any = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native
    def setModel(value: any): qx.data.IListData = js.native
    def setTarget(value: any): any = js.native
    def syncWidget(): Unit = js.native
    def update(): Unit = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.MSelection")
class MSelection extends js.Object {
    constructor ();
    protected def _addChangeTargetListener(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _changeTargetSelection(): Unit = js.native
    protected def _endSelectionModification(): Unit = js.native
    protected def _inSelectionModification(): Boolean = js.native
    protected def _startSelectionModification(): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: any): qx.data.Array = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: any): qx.data.Array = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Object")
class Object extends qx.core.Object {
    constructor (model: qx.core.Object = ???);
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    def addTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String, bidirectional: Boolean = ???, options: IMap = ???, reverseOptions: IMap = ???): Unit = js.native
    def getModel(): qx.core.Object = js.native
    protected def initModel(value: any): qx.core.Object = js.native
    def removeTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String): Unit = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): qx.core.Object = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Tree")
class Tree extends qx.core.Object implements qx.data.controller.ISelection {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native
    constructor (model: qx.core.Object = ???, target: qx.ui.tree.Tree = ???, childPath: String = ???, labelPath: String = ???);
    protected def _applyChildPath(value: String, old: String): Unit = js.native
    protected def _applyDelegate(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyIconOptions(value: IMap, old: IMap): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: IMap, old: IMap): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyTarget(value: qx.ui.tree.Tree, old: qx.ui.tree.Tree): Unit = js.native
    protected def _createItem(): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def _setBindItem(value: any, old: any): Unit = js.native
    protected def _setConfigureItem(value: any, old: any): Unit = js.native
    protected def _setCreateItem(value: any, old: any): Unit = js.native
    def bindDefaultProperties(treeNode: qx.ui.tree.core.AbstractTreeItem, modelNode: qx.core.Object): Unit = js.native
    def bindProperty(sourcePath: String, targetPath: String, options: IMap, targetWidget: qx.ui.tree.core.AbstractTreeItem, modelNode: any): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourcePath: String, options: IMap, sourceWidget: qx.ui.tree.core.AbstractTreeItem, modelNode: any): Unit = js.native
    def getChildPath(): String = js.native
    def getDelegate(): any = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.core.Object = js.native
    def getTarget(): any = js.native
    protected def initChildPath(value: any): String = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    protected def initModel(value: any): qx.core.Object = js.native
    protected def initTarget(value: any): any = js.native
    def resetChildPath(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setChildPath(value: any): String = js.native
    def setDelegate(value: any): any = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native
    def setModel(value: any): qx.core.Object = js.native
    def setTarget(value: any): any = js.native

}
}
package qx.data.marshal {
@js.native
trait IMarshaler extends js.Object {
    def toClass(data: any, includeBubbleEvents: Boolean): Unit = js.native
    def toModel(data: any): qx.core.Object = js.native

}
}
package qx.data.marshal {
@js.native
trait IMarshalerDelegate extends js.Object {
    def getArrayClass(parentProperty: String, depth: Long): qx.Class = js.native
    def getModelClass(properties: String, object: IMap, parentProperty: String, depth: Long): qx.Class = js.native
    def getModelMixins(properties: String, parentProperty: String, depth: Long): qx.data.Array = js.native
    def getModelSuperClass(properties: String, parentProperty: String, depth: Long): qx.Class = js.native
    def getPropertyMapping(property: String, properties: String): String = js.native
    def getValidationRule(properties: String, propertyName: String): js.Function = js.native
    def ignore(properties: String, parentProperty: String, depth: Long): Boolean = js.native

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.Json")
class Json extends qx.core.Object implements qx.data.marshal.IMarshaler {
    def toClass(data: any, includeBubbleEvents: Boolean): Unit = js.native
    def toModel(data: any): qx.core.Object = js.native
    constructor (delegate: any = ???);
    static def createModel(data: any, includeBubbleEvents: Boolean): qx.core.Object = js.native

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.MEventBubbling")
class MEventBubbling extends js.Object {
    protected def _applyEventPropagation(value: any, old: any, name: String): Unit = js.native
    protected def _registerEventChaining(value: any, old: any, name: String): Unit = js.native

}
}
package qx.data.store {
@js.native
trait IStoreDelegate extends js.Object {
    def configureRequest(request: any): Unit = js.native
    def manipulateData(data: any): any = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Json")
class Json extends qx.core.Object {
    constructor (url: String = ???, delegate: any = ???);
    protected def _applyUrl(value: String, old: String): Unit = js.native
    protected def _createRequest(url: String): Unit = js.native
    protected def _getRequest(): any = js.native
    protected def _onChangePhase(ev: qx.event.type.Data): Unit = js.native
    protected def _onFail(ev: qx.event.type.Event): Unit = js.native
    protected def _onSuccess(ev: qx.event.type.Event): Unit = js.native
    protected def _setRequest(request: any): Unit = js.native
    def getModel(): any = js.native
    def getState(): any = js.native
    def getUrl(): String = js.native
    protected def initModel(value: any): any = js.native
    protected def initState(value: any): any = js.native
    protected def initUrl(value: any): String = js.native
    def reload(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def setModel(value: any): any = js.native
    def setState(value: any): any = js.native
    def setUrl(value: any): String = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Jsonp")
class Jsonp extends qx.data.store.Json {
    constructor (url: String = ???, delegate: any = ???, callbackParam: String = ???);
    def getCallbackName(): String = js.native
    def getCallbackParam(): String = js.native
    protected def initCallbackName(value: any): String = js.native
    protected def initCallbackParam(value: any): String = js.native
    def resetCallbackName(): Unit = js.native
    def resetCallbackParam(): Unit = js.native
    def setCallbackName(value: any): String = js.native
    def setCallbackParam(value: any): String = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Offline")
class Offline extends qx.core.Object {
    constructor (key: String = ???, storage: String = ???, delegate: any = ???);
    protected def _applyModel(value: any, old: any): Unit = js.native
    protected def _initializeModel(): Unit = js.native
    protected def _setModel(data: any): Unit = js.native
    protected def _storeModel(): Unit = js.native
    def getKey(): String = js.native
    def getModel(): any = js.native
    protected def initModel(value: any): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): any = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Rest")
class Rest extends qx.core.Object {
    constructor (resource: qx.io.rest.Resource = ???, actionName: String = ???, delegate: any = ???);
    def getActionName(): String = js.native
    def getModel(): any = js.native
    def getResource(): qx.io.rest.Resource = js.native
    protected def initActionName(value: any): String = js.native
    protected def initModel(value: any): any = js.native
    protected def initResource(value: any): qx.io.rest.Resource = js.native
    def resetActionName(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetResource(): Unit = js.native
    def setActionName(value: any): String = js.native
    def setModel(value: any): any = js.native
    def setResource(value: any): qx.io.rest.Resource = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Yql")
class Yql extends qx.data.store.Jsonp {
    constructor (query: String = ???, delegate: any = ???, https: Boolean = ???);

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Element")
class Element extends js.Object {
    static def create(name: String, attributes: IMap = ???, win: Window = ???): HTMLElement = js.native
    static def empty(element: HTMLElement): String = js.native
    static def getHelperElement(win: Window = ???): HTMLElement = js.native
    static def getParentElement(element: HTMLElement): HTMLElement = js.native
    static def hasChild(parent: HTMLElement, child: Node): Boolean = js.native
    static def hasChildElements(element: HTMLElement): Boolean = js.native
    static def hasChildren(element: HTMLElement): Boolean = js.native
    static def insertAfter(node: Node, ref: Node): Boolean = js.native
    static def insertAt(node: Node, parent: HTMLElement, index: Int): Boolean = js.native
    static def insertBefore(node: Node, ref: Node): Boolean = js.native
    static def insertBegin(node: Node, parent: HTMLElement): Boolean = js.native
    static def insertEnd(node: Node, parent: HTMLElement): Boolean = js.native
    static def isInDom(element: HTMLElement, win: Window): Boolean = js.native
    static def remove(node: Node): Boolean = js.native
    static def removeChild(node: Node, parent: HTMLElement): Boolean = js.native
    static def removeChildAt(index: Int, parent: HTMLElement): Boolean = js.native
    static def replaceAt(newNode: Node, index: Int, parent: HTMLElement): Boolean = js.native
    static def replaceChild(newNode: Node, oldNode: Node): Boolean = js.native

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Hierarchy")
class Hierarchy extends js.Object {
    protected static def _recursivelyCollect(element: HTMLElement, property: String): qx.data.Array = js.native
    static def cleanWhitespace(element: HTMLElement): Unit = js.native
    static def contains(element: HTMLElement, target: Node): Boolean = js.native
    static def getAncestors(element: HTMLElement): qx.data.Array = js.native
    static def getChildElements(element: HTMLElement): qx.data.Array = js.native
    static def getCommonParent(element1: HTMLElement, element2: HTMLElement): HTMLElement = js.native
    static def getDescendants(element: HTMLElement): qx.data.Array = js.native
    static def getElementIndex(element: HTMLElement): Int = js.native
    static def getFirstDescendant(element: HTMLElement): HTMLElement = js.native
    static def getLastDescendant(element: HTMLElement): HTMLElement = js.native
    static def getNextElementSibling(element: HTMLElement): HTMLElement = js.native
    static def getNextSiblings(element: HTMLElement): qx.data.Array = js.native
    static def getNodeIndex(node: Node): Int = js.native
    static def getPreviousElementSibling(element: HTMLElement): HTMLElement = js.native
    static def getPreviousSiblings(element: HTMLElement): qx.data.Array = js.native
    static def getSiblings(element: any): qx.data.Array = js.native
    static def isDescendantOf(element: HTMLElement, ancestor: HTMLElement): Boolean = js.native
    static def isEmpty(element: HTMLElement): Boolean = js.native
    static def isRendered(element: HTMLElement): Boolean = js.native

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Node")
class Node extends js.Object {
    static def getBodyElement(node: Node): HTMLElement = js.native
    static def getDocument(node: Node): Document = js.native
    static def getDocumentElement(node: Node): HTMLElement = js.native
    static def getName(node: Node): String = js.native
    static def getText(node: Node): String = js.native
    static def getWindow(node: Node): Window = js.native
    static def isBlockNode(node: Node): Boolean = js.native
    static def isDocument(node: Node): Boolean = js.native
    static def isDocumentFragment(node: Node): Boolean = js.native
    static def isElement(node: Node): Boolean = js.native
    static def isNode(node: Node): Boolean = js.native
    static def isNodeName(node: Node, nodeName: String): Boolean = js.native
    static def isText(node: Node): Boolean = js.native
    static def isWindow(obj: any): Boolean = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.AcceleratingTimer")
class AcceleratingTimer extends qx.core.Object {
    constructor ();
    protected def _onInterval(): Unit = js.native
    def getDecrease(): Int = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinimum(): Int = js.native
    protected def initDecrease(value: any): Int = js.native
    protected def initFirstInterval(value: any): Int = js.native
    protected def initInterval(value: any): Int = js.native
    protected def initMinimum(value: any): Int = js.native
    def resetDecrease(): Unit = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def setDecrease(value: any): Int = js.native
    def setFirstInterval(value: any): Int = js.native
    def setInterval(value: any): Int = js.native
    def setMinimum(value: any): Int = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Emitter")
class Emitter extends js.Object {
    def addListener(name: String, listener: js.Function, ctx: any = ???): Int = js.native
    def addListenerOnce(name: String, listener: js.Function, ctx: any = ???): Int = js.native
    def emit(name: String, data: any = ???): Unit = js.native
    def getEntryById(id: Long): IMap = js.native
    def getListeners(): IMap = js.native
    def off(name: String, listener: js.Function, ctx: any = ???): Int = js.native
    def offById(id: Int): Int = js.native
    def on(name: String, listener: js.Function, ctx: any = ???): Int = js.native
    def once(name: String, listener: js.Function, ctx: any = ???): Int = js.native
    def removeListener(name: String, listener: js.Function, ctx: any = ???): Unit = js.native
    def removeListenerById(id: Int): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.GlobalError")
class GlobalError extends js.Object {
    static def handleError(ex: qx.core.WindowError): Unit = js.native
    static def observeMethod(method: js.Function): js.Function = js.native
    static def setErrorHandler(callback: js.Function = ???, context: any = ???): Unit = js.native

}
}
package qx.event {
@js.native
trait IEventDispatcher extends js.Object {
    def canDispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Boolean = js.native
    def dispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Unit = js.native

}
}
package qx.event {
@js.native
trait IEventHandler extends js.Object {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Idle")
class Idle extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.event.Idle = js.native
    protected def _applyTimeoutInterval(value: Long, old: Long): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getTimeoutInterval(): Long = js.native
    protected def initTimeoutInterval(value: any): Long = js.native
    def resetTimeoutInterval(): Unit = js.native
    def setTimeoutInterval(value: any): Long = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Manager")
class Manager extends js.Object {
    constructor (win: Window = ???, registration: qx.event.Registration = ???);
    static def getNextUniqueId(): String = js.native
    def addListener(target: any, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): String = js.native
    def deleteAllListeners(targetKey: String): Unit = js.native
    def dispatchEvent(target: any, event: qx.event.type.Event): Boolean = js.native
    def dispose(): Unit = js.native
    def findHandler(target: any, type: String): qx.event.IEventHandler = js.native
    def getAllListeners(): IMap = js.native
    def getDispatcher(clazz: qx.Class): any = js.native
    def getHandler(clazz: qx.Class): any = js.native
    def getListeners(target: any, type: String, capture: Boolean = ???): qx.data.Array = js.native
    def getWindow(): Window = js.native
    def getWindowId(): String = js.native
    def hasListener(target: any, type: String, capture: Boolean = ???): Boolean = js.native
    def importListeners(target: any, list: IMap): Unit = js.native
    def removeAllListeners(target: any): Boolean = js.native
    def removeListener(target: any, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: any, id: String): Boolean = js.native
    def serializeListeners(target: any): IMap[] = js.native
    def toggleAttachedEvents(target: any, enable: Boolean): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Messaging")
class Messaging extends js.Object {
    constructor ();
    protected def _addListener(channel: String, type: String, handler: js.Function, scope: any = ???): String = js.native
    protected def _emit(channel: String, path: String, params: IMap, customData: any): Unit = js.native
    protected def _emitListeners(channel: String, path: String, listeners: IMap[], params: IMap, customData: any): Boolean = js.native
    protected def _emitRoute(channel: String, path: String, listener: IMap, params: IMap, customData: any): Boolean = js.native
    def emit(channel: String, path: String, params: IMap, customData: any): Unit = js.native
    def has(channel: String, path: String): Boolean = js.native
    def on(channel: String, type: String, handler: js.Function, scope: any = ???): String = js.native
    def onAny(type: String, handler: js.Function, scope: any = ???): String = js.native
    def remove(id: String): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Pool")
class Pool extends qx.util.ObjectPool {
    constructor ();
    static def getInstance(): qx.event.Pool = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Registration")
class Registration extends js.Object {
    static def addDispatcher(dispatcher: qx.event.IEventDispatcher, priority: Int): Unit = js.native
    static def addHandler(handler: qx.event.IEventHandler): Unit = js.native
    static def addListener(target: any, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): any = js.native
    static def createEvent(type: String, clazz: any = ???, args: qx.data.Array = ???): qx.event.type.Event = js.native
    static def deleteAllListeners(target: any): Unit = js.native
    static def dispatchEvent(target: any, event: qx.event.type.Event): Boolean = js.native
    static def fireEvent(target: any, type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    static def fireNonBubblingEvent(target: any, type: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    static def getDispatchers(): qx.event.IEventDispatcher[] = js.native
    static def getHandlers(): qx.event.IEventHandler[] = js.native
    static def getManager(target: any): qx.event.Manager = js.native
    static def hasListener(target: any, type: String, capture: Boolean = ???): Boolean = js.native
    static def removeAllListeners(target: any): Boolean = js.native
    static def removeListener(target: any, type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): Boolean = js.native
    static def removeListenerById(target: any, id: any): Boolean = js.native
    static def removeManager(mgr: qx.event.Manager): Unit = js.native
    static def serializeListeners(target: any): IMap[] = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Timer")
class Timer extends qx.core.Object {
    constructor (interval: Long = ???);
    static def once(func: js.Function, obj: any, timeout: Long): qx.event.Timer = js.native
    protected def _applyEnabled(value: any, old: any): Unit = js.native
    protected def _applyInterval(value: any, old: any): Unit = js.native
    protected def _oninterval(): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInterval(): Int = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initInterval(value: any): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetEnabled(): Unit = js.native
    def resetInterval(): Unit = js.native
    def restart(): Unit = js.native
    def restartWith(interval: Int): Unit = js.native
    def setEnabled(value: any): Boolean = js.native
    def setInterval(value: any): Int = js.native
    def start(): Unit = js.native
    def startWith(interval: Int): Unit = js.native
    def stop(): Unit = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.AbstractBubbling")
class AbstractBubbling extends qx.core.Object implements qx.event.IEventDispatcher {
    def canDispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Boolean = js.native
    def dispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _getParent(target: any): any = js.native

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.Direct")
class Direct extends qx.core.Object implements qx.event.IEventDispatcher {
    def canDispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Boolean = js.native
    def dispatchEvent(target: HTMLElement, event: qx.event.type.Event, type: String): Unit = js.native
    constructor (manager: qx.event.Manager = ???);

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
    constructor (manager: qx.event.Manager = ???, registration: qx.event.Registration = ???);
    def activateCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def getCaptureElement(): HTMLElement = js.native
    def nativeReleaseCapture(element: HTMLElement): Unit = js.native
    def nativeSetCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def releaseCapture(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Appear")
class Appear extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    static def refresh(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Application")
class Application extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    static def onScriptLoaded(): Unit = js.native
    protected def _initObserver(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onNativeUnload(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def isApplicationReady(): Boolean = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Capture")
class Capture extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.DragDrop")
class DragDrop extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _getDelta(e: qx.event.type.Pointer): IMap = js.native
    protected def _onKeyDown(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onLongtap(e: qx.event.type.Tap): Unit = js.native
    protected def _onPointerdown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointermove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerup(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onWindowBlur(e: qx.event.type.Event): Unit = js.native
    protected def _start(e: qx.event.type.Pointer): Boolean = js.native
    def addAction(action: String): Unit = js.native
    def addData(type: String, data: any): Unit = js.native
    def addType(type: String): Unit = js.native
    def clearSession(): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getCursor(): qx.ui.core.Widget = js.native
    def getData(type: String): any = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    protected def initCursor(value: any): qx.ui.core.Widget = js.native
    def isSessionActive(): Boolean = js.native
    def resetCursor(): Unit = js.native
    def setCursor(value: any): qx.ui.core.Widget = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def supportsAction(type: String): Boolean = js.native
    def supportsType(type: String): Boolean = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Element")
class Element extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _onNative(nativeEvent: qx.event.type.Event, eventId: Int): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.ElementResize")
class ElementResize extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _onInterval(e: qx.event.type.Data): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Focus")
class Focus extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _applyActive(value: any, old: any): Unit = js.native
    protected def _applyFocus(value: any, old: any): Unit = js.native
    protected def _initObserver(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def activate(element: HTMLElement): Unit = js.native
    def blur(element: HTMLElement): Unit = js.native
    def deactivate(element: HTMLElement): Unit = js.native
    def focus(element: HTMLElement): Unit = js.native
    def getActive(): any = js.native
    def getFocus(): any = js.native
    protected def initActive(value: any): any = js.native
    protected def initFocus(value: any): any = js.native
    def resetActive(): Unit = js.native
    def resetFocus(): Unit = js.native
    def setActive(value: any): any = js.native
    def setFocus(value: any): any = js.native
    def tryActivate(element: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Gesture")
class Gesture extends qx.event.handler.GestureCore implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.GestureCore")
class GestureCore extends js.Object {
    constructor (target: HTMLElement = ???, emitter: qx.event.Emitter = ???);
    protected def _calcAngle(): Long = js.native
    protected def _calcDistance(): Long = js.native
    protected def _fireEvent(domEvent: qx.event.type.Event, type: String, target: HTMLElement = ???): Unit = js.native
    protected def _fireRoll(domEvent: qx.event.type.Event, type: String, target: HTMLElement): Unit = js.native
    protected def _getDeltaCoordinates(domEvent: qx.event.type.Event): IMap = js.native
    protected def _hasIntermediaryHandler(target: HTMLElement): Boolean = js.native
    protected def _initObserver(): Unit = js.native
    protected def _isBelowTapMaxDistance(domEvent: qx.event.type.Event): Boolean = js.native
    protected def _onDblClick(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def checkAndFireGesture(domEvent: qx.event.type.Event, type: String = ???, target: HTMLElement = ???): Unit = js.native
    def dispose(): Unit = js.native
    def gestureBegin(domEvent: qx.event.type.Event, target: HTMLElement): Unit = js.native
    def gestureCancel(id: Long): Unit = js.native
    def gestureFinish(domEvent: qx.event.type.Event, target: HTMLElement): Unit = js.native
    def gestureMove(domEvent: qx.event.type.Event, target: HTMLElement): Unit = js.native
    def isBelowTapMaxDistance(event: qx.event.type.Event): Boolean = js.native
    def stopMomentum(id: Int): Unit = js.native
    def updateGestureTarget(id: String, target: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Iframe")
class Iframe extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    static def onevent(target: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Input")
class Input extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor ();
    protected def _inputFix(e: qx.event.type.Event, target: HTMLElement): Unit = js.native
    protected def _onChangeChecked(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeValue(e: qx.event.type.Event): Unit = js.native
    protected def _onInput(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.Event, target: HTMLElement): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.Event): Unit = js.native
    protected def _onProperty(e: qx.event.type.Event): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Keyboard")
class Keyboard extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    def __onKeyUpDown(domEvent: qx.event.type.Event): Unit = js.native
    protected def _fireInputEvent(domEvent: qx.event.type.Event, charCode: Int): Unit = js.native
    protected def _fireSequenceEvent(domEvent: qx.event.type.Event, type: String, keyIdentifier: String): Unit = js.native
    protected def _idealKeyHandler(keyCode: String, charCode: String, eventType: String, domEvent: HTMLElement): Unit = js.native
    protected def _identifierToKeyCode(keyIdentifier: String): Int = js.native
    protected def _initKeyObserver(): Unit = js.native
    protected def _stopKeyObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Mouse")
class Mouse extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _initButtonObserver(): Unit = js.native
    protected def _initMoveObserver(): Unit = js.native
    protected def _initWheelObserver(): Unit = js.native
    protected def _onButtonEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _onMoveEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _onWheelEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopButtonObserver(): Unit = js.native
    protected def _stopMoveObserver(): Unit = js.native
    protected def _stopWheelObserver(): Unit = js.native
    def preventNextClick(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Object")
class Object extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Offline")
class Offline extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def isOnline(): Boolean = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Orientation")
class Orientation extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.type.Event): Unit = js.native
    protected def _onOrientationChange(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.OrientationCore")
class OrientationCore extends js.Object {
    constructor (targetWindow: Window = ???, emitter: qx.event.Emitter = ???);
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Pointer")
class Pointer extends qx.event.handler.PointerCore implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.PointerCore")
class PointerCore extends js.Object {
    constructor (target: HTMLElement = ???, emitter: qx.event.Emitter = ???);
    protected def _determineActiveTouches(type: String, changedTouches: qx.data.Array): Unit = js.native
    protected def _fireEvent(domEvent: qx.event.type.Event, type: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _initObserver(callback: js.Function, useEmitter: Boolean): Unit = js.native
    protected def _initPointerObserver(): Unit = js.native
    protected def _isSimulatedMouseEvent(x: Int, y: Int): Boolean = js.native
    protected def _onMouseEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _onPointerEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _onTouchEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Touch")
class Touch extends qx.event.handler.TouchCore implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.TouchCore")
class TouchCore extends js.Object {
    constructor (target: HTMLElement = ???, emitter: qx.event.Emitter = ???);
    protected def _calcSingleTouchDelta(touch: qx.event.type.Event): IMap = js.native
    protected def _calcTouchesDelta(touches: qx.data.Array): qx.data.Array = js.native
    protected def _commonTouchEventHandler(domEvent: qx.event.type.Event, type: String = ???): Unit = js.native
    protected def _detectTouchesByPointer(domEvent: qx.event.type.Event, type: String = ???): qx.data.Array = js.native
    protected def _fireEvent(domEvent: qx.event.type.Event, type: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _getRotationAngle(touch0: qx.event.type.Event, touch1: qx.event.type.Event): Long = js.native
    protected def _getScalingDistance(touch0: qx.event.type.Event, touch1: qx.event.type.Event): Long = js.native
    protected def _getTarget(domEvent: qx.event.type.Event): HTMLElement = js.native
    protected def _initTouchObserver(): Unit = js.native
    protected def _mapPointerEvent(type: String): String = js.native
    protected def _onTouchEvent(domEvent: qx.event.type.Event): Unit = js.native
    protected def _stopTouchObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Transition")
class Transition extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _onNative(domEvent: qx.event.type.Event): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.UserAction")
class UserAction extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Window")
class Window extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor (manager: qx.event.Manager = ???);
    protected def _initWindowObserver(): Unit = js.native
    protected def _onNative(): Unit = js.native
    protected def _stopWindowObserver(): Unit = js.native

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Bus")
class Bus extends qx.core.Object {
    constructor ();
    static def checkSubscription(message: String, subscriber: js.Function, context: any): Boolean = js.native
    static def dispatch(msg: qx.event.message.Message): Boolean = js.native
    static def dispatchByName(name: String, data: any): Boolean = js.native
    static def getInstance(): qx.event.message.Bus = js.native
    static def getSubscriptions(): IMap = js.native
    static def subscribe(message: String, subscriber: js.Function, context: any): Boolean = js.native
    static def unsubscribe(message: String, subscriber: js.Function, context: any): Boolean = js.native

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Message")
class Message extends qx.core.Object {
    constructor (name: String = ???, data: any = ???);
    def getData(): any = js.native
    def getName(): String = js.native
    def getSender(): any = js.native
    protected def initData(value: any): any = js.native
    protected def initName(value: any): String = js.native
    protected def initSender(value: any): any = js.native
    def resetData(): Unit = js.native
    def resetName(): Unit = js.native
    def resetSender(): Unit = js.native
    def setData(value: any): any = js.native
    def setName(value: any): String = js.native
    def setSender(value: any): any = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Data")
class Data extends qx.event.type.Event {
    def getData(): any = js.native
    def getOldData(): any = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Dom")
class Dom extends qx.event.type.Native {
    def getModifiers(): Int = js.native
    def isAltPressed(): Boolean = js.native
    def isCtrlOrCommandPressed(): Boolean = js.native
    def isCtrlPressed(): Boolean = js.native
    def isMetaPressed(): Boolean = js.native
    def isShiftPressed(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Drag")
class Drag extends qx.event.type.Event {
    def addAction(action: String): Unit = js.native
    def addData(type: String, data: any): Unit = js.native
    def addType(type: String): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getData(type: String): any = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    def getManager(): qx.event.handler.DragDrop = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def stopSession(): Unit = js.native
    def supportsAction(action: String): Boolean = js.native
    def supportsType(type: String): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Event")
class Event extends qx.core.Object {
    def getBubbles(): Boolean = js.native
    def getCurrentTarget(): HTMLElement = js.native
    def getDefaultPrevented(): Boolean = js.native
    def getEventPhase(): Int = js.native
    def getOriginalTarget(): HTMLElement = js.native
    def getPropagationStopped(): Boolean = js.native
    def getRelatedTarget(): HTMLElement = js.native
    def getTarget(): HTMLElement = js.native
    def getTimeStamp(): Int = js.native
    def getType(): String = js.native
    def init(canBubble: Boolean = ???, cancelable: Boolean = ???): qx.event.type.Event = js.native
    def isCancelable(): Boolean = js.native
    def preventDefault(): Unit = js.native
    def setBubbles(bubbles: Boolean): Unit = js.native
    def setCancelable(cancelable: Boolean): Unit = js.native
    def setCurrentTarget(currentTarget: HTMLElement): Unit = js.native
    def setEventPhase(eventPhase: Int): Unit = js.native
    def setOriginalTarget(originalTarget: HTMLElement): Unit = js.native
    def setRelatedTarget(relatedTarget: HTMLElement): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    def setType(type: String): Unit = js.native
    def stop(): Unit = js.native
    def stopPropagation(): Unit = js.native

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
    def getAccuracy(): Long = js.native
    def getAltitude(): Long = js.native
    def getAltitudeAccuracy(): Long = js.native
    def getHeading(): any = js.native
    def getLatitude(): Long = js.native
    def getLongitude(): Long = js.native
    def getSpeed(): any = js.native
    def getTimestamp(): Long = js.native
    protected def initAccuracy(value: any): Long = js.native
    protected def initAltitude(value: any): Long = js.native
    protected def initAltitudeAccuracy(value: any): Long = js.native
    protected def initHeading(value: any): any = js.native
    protected def initLatitude(value: any): Long = js.native
    protected def initLongitude(value: any): Long = js.native
    protected def initSpeed(value: any): any = js.native
    protected def initTimestamp(value: any): Long = js.native
    def resetAccuracy(): Unit = js.native
    def resetAltitude(): Unit = js.native
    def resetAltitudeAccuracy(): Unit = js.native
    def resetHeading(): Unit = js.native
    def resetLatitude(): Unit = js.native
    def resetLongitude(): Unit = js.native
    def resetSpeed(): Unit = js.native
    def resetTimestamp(): Unit = js.native
    def setAccuracy(value: any): Long = js.native
    def setAltitude(value: any): Long = js.native
    def setAltitudeAccuracy(value: any): Long = js.native
    def setHeading(value: any): any = js.native
    def setLatitude(value: any): Long = js.native
    def setLongitude(value: any): Long = js.native
    def setSpeed(value: any): any = js.native
    def setTimestamp(value: any): Long = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.KeyInput")
class KeyInput extends qx.event.type.Dom {
    def getChar(): String = js.native
    def getCharCode(): Int = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.KeySequence")
class KeySequence extends qx.event.type.Dom {
    def getKeyCode(): Long = js.native
    def getKeyIdentifier(): String = js.native
    def isPrintable(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Mouse")
class Mouse extends qx.event.type.Dom {
    def getButton(): String = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getScreenLeft(): Int = js.native
    def getScreenTop(): Int = js.native
    def getViewportLeft(): Int = js.native
    def getViewportTop(): Int = js.native
    def isLeftPressed(): Boolean = js.native
    def isMiddlePressed(): Boolean = js.native
    def isRightPressed(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.MouseWheel")
class MouseWheel extends qx.event.type.Mouse {
    def getWheelDelta(axis: String = ???): Int = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Native")
class Native extends qx.event.type.Event {
    protected def _cloneNativeEvent(nativeEvent: qx.event.type.Event, clone: any): any = js.native
    def getNativeEvent(): qx.event.type.Event = js.native
    def getReturnValue(): String = js.native
    def setReturnValue(returnValue: String = ???): Unit = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Orientation")
class Orientation extends qx.event.type.Event {
    def getOrientation(): Int = js.native
    def isLandscape(): Boolean = js.native
    def isPortrait(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Pinch")
class Pinch extends qx.event.type.Pointer {
    def getScale(): Float = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Pointer")
class Pointer extends qx.event.type.Mouse {
    def getHeight(): Long = js.native
    def getPointerId(): Long = js.native
    def getPointerType(): String = js.native
    def getPressure(): Long = js.native
    def getTiltX(): Long = js.native
    def getTiltY(): Long = js.native
    def getWidth(): Long = js.native
    def isPrimary(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Rest")
class Rest extends qx.event.type.Data {
    def getAction(): String = js.native
    def getId(): Long = js.native
    def getPhase(): String = js.native
    def getRequest(): qx.io.request.AbstractRequest = js.native
    protected def initAction(value: any): String = js.native
    protected def initId(value: any): Long = js.native
    protected def initPhase(value: any): String = js.native
    protected def initRequest(value: any): qx.io.request.AbstractRequest = js.native
    def resetAction(): Unit = js.native
    def resetId(): Unit = js.native
    def resetPhase(): Unit = js.native
    def resetRequest(): Unit = js.native
    def setAction(value: any): String = js.native
    def setId(value: any): Long = js.native
    def setPhase(value: any): String = js.native
    def setRequest(value: any): qx.io.request.AbstractRequest = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Roll")
class Roll extends qx.event.type.Pointer {
    def getDelta(): IMap = js.native
    def getMomentum(): Boolean = js.native
    def stopMomentum(): Unit = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Rotate")
class Rotate extends qx.event.type.Pointer {
    def getAngle(): Long = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Swipe")
class Swipe extends qx.event.type.Pointer {
    def getAxis(): String = js.native
    def getDirection(): String = js.native
    def getDistance(): Int = js.native
    def getDuration(): Int = js.native
    def getStartTime(): Int = js.native
    def getVelocity(): Long = js.native

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
    protected def _isTouchEnd(): Boolean = js.native
    def getAllTouches(): any[] = js.native
    def getChangedTargetTouches(): any[] = js.native
    def getDelta(): qx.data.Array = js.native
    def getDocumentLeft(touchIndex: Int = ???): Int = js.native
    def getDocumentTop(touchIndex: Int = ???): Int = js.native
    def getIdentifier(touchIndex: Int = ???): Int = js.native
    def getRotation(): Float = js.native
    def getScale(): Float = js.native
    def getScreenLeft(touchIndex: Int = ???): Int = js.native
    def getScreenTop(touchIndex: Int = ???): Int = js.native
    def getTargetTouches(): any[] = js.native
    def getViewportLeft(touchIndex: Int = ???): Int = js.native
    def getViewportTop(touchIndex: Int = ???): Int = js.native
    def isMultiTouch(): Boolean = js.native

}
}
package qx.event.type {
@js.native
@JSName("qx.event.type.Track")
class Track extends qx.event.type.Pointer {
    def getDelta(): IMap = js.native

}
}
package qx.event.type.dom {
@js.native
@JSName("qx.event.type.dom.Custom")
class Custom extends js.Object {
    constructor (type: String = ???, domEvent: qx.event.type.Event = ???, customProps: IMap = ???);
    protected def _createEvent(): qx.event.type.Event = js.native
    protected def _initEvent(domEvent: qx.event.type.Event, customProps: IMap = ???): Unit = js.native

}
}
package qx.event.type.dom {
@js.native
@JSName("qx.event.type.dom.Pointer")
class Pointer extends qx.event.type.dom.Custom {
    constructor (type: js.Any = ???, domEvent: js.Any = ???, customProps: js.Any = ???);
    static def getDocumentLeft(): Long = js.native
    static def getDocumentTop(): Long = js.native
    static def getPointerType(): String = js.native
    static def getScreenLeft(): Long = js.native
    static def getScreenTop(): Long = js.native
    static def getViewportLeft(): Long = js.native
    static def getViewportTop(): Long = js.native
    static def normalize(event: qx.event.type.Event): Unit = js.native

}
}
package qx.event.util {
@js.native
@JSName("qx.event.util.Keyboard")
class Keyboard extends js.Object {
    static def charCodeToIdentifier(charCode: String): String = js.native
    static def isIdentifiableKeyCode(keyCode: String): Boolean = js.native
    static def isNonPrintableKeyCode(keyCode: String): Boolean = js.native
    static def isPrintableKeyIdentifier(keyIdentifier: String): Boolean = js.native
    static def isValidKeyIdentifier(keyIdentifier: String): Boolean = js.native
    static def keyCodeToIdentifier(keyCode: Int): String = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Blocker")
class Blocker extends qx.html.Element {
    constructor (backgroundColor: String = ???, opacity: Long = ???);
    protected def _stopPropagation(e: qx.event.type.Mouse): Unit = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Canvas")
class Canvas extends qx.html.Element {
    constructor (styles: IMap = ???, attributes: IMap = ???);
    def getCanvas(): HTMLElement = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getHeight(): Int = js.native
    def getWidth(): Int = js.native
    def setHeight(height: Int): Unit = js.native
    def setWidth(width: Int): Unit = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Element")
class Element extends qx.core.Object {
    constructor (tagName: String = ???, styles: IMap = ???, attributes: IMap = ???);
    protected static def _scheduleFlush(job: String): Unit = js.native
    static def flush(): Unit = js.native
    protected def _applyProperty(name: String, value: any): qx.html.Element = js.native
    protected def _copyData(fromMarkup: Boolean): Unit = js.native
    protected def _createDomElement(): HTMLElement = js.native
    protected def _getProperty(key: String): any = js.native
    protected def _insertChildren(): Unit = js.native
    protected def _removeProperty(key: String, direct: Boolean = ???): qx.html.Element = js.native
    protected def _scheduleChildrenUpdate(): Unit = js.native
    protected def _setProperty(key: String, value: any, direct: Boolean = ???): qx.html.Element = js.native
    protected def _syncChildren(): Unit = js.native
    protected def _syncData(): Unit = js.native
    def activate(): Unit = js.native
    def add(varargs: qx.html.Element = ???): qx.html.Element = js.native
    def addAt(child: qx.html.Element, index: Int): qx.html.Element = js.native
    def addClass(name: String): Unit = js.native
    def addListener(type: String, listener: js.Function, self: any = ???, capture: Boolean = ???): any = js.native
    def blur(): Unit = js.native
    def capture(containerCapture: Boolean = ???): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def deactivate(): Unit = js.native
    def disableScrolling(): Unit = js.native
    def enableScrolling(): Unit = js.native
    def exclude(): qx.html.Element = js.native
    def fadeIn(duration: Long): qx.bom.element.AnimationHandle = js.native
    def fadeOut(duration: Long): qx.bom.element.AnimationHandle = js.native
    def focus(): Unit = js.native
    def free(): qx.html.Element = js.native
    def getAllStyles(): IMap = js.native
    def getAttribute(key: String): any = js.native
    def getChild(index: Int): qx.html.Element = js.native
    def getChildren(): qx.data.Array = js.native
    def getDomElement(): HTMLElement = js.native
    def getListeners(): IMap[] = js.native
    def getNodeName(): String = js.native
    def getParent(): qx.html.Element = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getStyle(key: String): any = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionEnd(): Int = js.native
    def getTextSelectionLength(): Int = js.native
    def getTextSelectionStart(): Int = js.native
    def hasChild(child: qx.html.Element): Boolean = js.native
    def hasChildren(): Boolean = js.native
    def hasListener(type: String, capture: Boolean = ???): Boolean = js.native
    def hide(): qx.html.Element = js.native
    def include(): qx.html.Element = js.native
    def indexOf(child: qx.html.Element): Int = js.native
    def insertAfter(rel: qx.html.Element): qx.html.Element = js.native
    def insertBefore(rel: qx.html.Element): qx.html.Element = js.native
    def insertInto(parent: qx.html.Element, index: Int = ???): qx.html.Element = js.native
    def isFocusable(): Boolean = js.native
    def isIncluded(): Boolean = js.native
    def isNativelyFocusable(): Boolean = js.native
    def isVisible(): Boolean = js.native
    def moveAfter(rel: qx.html.Element): qx.html.Element = js.native
    def moveBefore(rel: qx.html.Element): qx.html.Element = js.native
    def moveTo(index: Int): qx.html.Element = js.native
    def releaseCapture(): Unit = js.native
    def remove(childs: qx.html.Element): qx.html.Element = js.native
    def removeAll(): qx.html.Element = js.native
    def removeAt(index: Int): qx.html.Element = js.native
    def removeAttribute(key: String, direct: Boolean = ???): qx.html.Element = js.native
    def removeClass(name: String): Unit = js.native
    def removeListener(type: String, listener: js.Function, self: any, capture: Boolean = ???): qx.html.Element = js.native
    def removeListenerById(id: any): qx.html.Element = js.native
    def removeStyle(key: String, direct: Boolean = ???): qx.html.Element = js.native
    def scrollChildIntoViewX(elem: qx.html.Element, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewY(elem: qx.html.Element, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollToX(x: Int, lazy: Boolean = ???): Unit = js.native
    def scrollToY(y: Int, lazy: Boolean = ???): Unit = js.native
    def setAttribute(key: String, value: any, direct: Boolean = ???): qx.html.Element = js.native
    def setAttributes(map: IMap, direct: Boolean = ???): qx.html.Element = js.native
    def setNodeName(name: String): Unit = js.native
    def setRoot(root: Boolean): Unit = js.native
    def setSelectable(value: Boolean): Unit = js.native
    def setStyle(key: String, value: any, direct: Boolean = ???): qx.html.Element = js.native
    def setStyles(map: IMap, direct: Boolean = ???): qx.html.Element = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native
    def show(): qx.html.Element = js.native
    def useElement(elem: HTMLElement): Unit = js.native
    def useMarkup(html: String): HTMLElement = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Flash")
class Flash extends qx.html.Element {
    constructor (styles: IMap = ???, attributes: IMap = ???);
    def createFlash(): Unit = js.native
    def getAttributes(): IMap = js.native
    def getFlashElement(): HTMLElement = js.native
    def getParams(): IMap = js.native
    def getVariables(): IMap = js.native
    def setId(value: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    def setSource(value: String): Unit = js.native
    def setVariables(value: IMap): Unit = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Iframe")
class Iframe extends qx.html.Element {
    constructor (url: String = ???, styles: IMap = ???, attributes: IMap = ???);
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    def reload(): Unit = js.native
    def setName(name: String): qx.html.Iframe = js.native
    def setSource(source: String): qx.html.Iframe = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Image")
class Image extends qx.html.Element {
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    def resetSource(): qx.html.Image = js.native
    def setPadding(paddingLeft: Int, paddingTop: Int): Unit = js.native
    def setScale(value: Boolean): qx.html.Label = js.native
    def setSource(value: Boolean): qx.html.Label = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Input")
class Input extends qx.html.Element {
    constructor (type: String = ???, styles: IMap = ???, attributes: IMap = ???);
    def getValue(): String = js.native
    def getWrap(): Boolean = js.native
    def setEnabled(value: Boolean): Unit = js.native
    def setValue(value: any): qx.html.Input = js.native
    def setWrap(wrap: Boolean, direct: Boolean = ???): qx.html.Input = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Label")
class Label extends qx.html.Element {
    def getValue(): String = js.native
    def setRich(value: Boolean): qx.html.Label = js.native
    def setValue(value: String): qx.html.Label = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Root")
class Root extends qx.html.Element {
    constructor (elem: HTMLElement = ???);

}
}
package qx.io {
@js.native
@JSName("qx.io.ImageLoader")
class ImageLoader extends js.Object {
    static def abort(source: String): Unit = js.native
    static def dispose(): Unit = js.native
    static def getFormat(source: String): String = js.native
    static def getHeight(source: String): Int = js.native
    static def getSize(source: String): IMap = js.native
    static def getWidth(source: String): Int = js.native
    static def isFailed(source: String): Boolean = js.native
    static def isLoaded(source: String): Boolean = js.native
    static def isLoading(source: String): Boolean = js.native
    static def load(source: String, callback: js.Function = ???, context: any = ???): Unit = js.native

}
}
package qx.io {
@js.native
@JSName("qx.io.PartLoader")
class PartLoader extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.io.PartLoader = js.native
    static def require(partNames: String[], callback: js.Function, self: any = ???): Unit = js.native
    def getPart(name: String): qx.io.part.Part = js.native
    def getParts(): IMap = js.native
    def hasPart(name: String): Boolean = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.ClosurePart")
class ClosurePart extends qx.io.part.Part {
    constructor (name: String = ???, packages: any[] = ???, loader: qx.Part = ???);
    protected def _onPackageLoad(pkg: qx.io.part.Package): Unit = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Package")
class Package extends js.Object {
    constructor (urls: String[] = ???, id: any = ???, loaded: Boolean = ???);
    def execute(): Unit = js.native
    def getId(): String = js.native
    def getReadyState(): String = js.native
    def getUrls(): String[] = js.native
    def load(notifyPackageResult: js.Function, self: any = ???): Unit = js.native
    def loadClosure(notifyPackageResult: js.Function, self: any = ???): Unit = js.native
    def saveClosure(closure: js.Function): Unit = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Part")
class Part extends js.Object {
    constructor (name: String = ???, packages: any[] = ???, loader: qx.Part = ???);
    protected def _appendPartListener(callback: js.Function, self: any = ???, part: qx.io.part.Part = ???): Unit = js.native
    protected def _checkCompleteLoading(callback: js.Function, self: any): Boolean = js.native
    protected def _markAsCompleted(readyState: String): Unit = js.native
    protected def _signalStartup(): Unit = js.native
    def getName(): String = js.native
    def getPackages(): qx.io.part.Package[] = js.native
    def getReadyState(): String = js.native
    def load(callback: js.Function, self: any = ???): Unit = js.native
    def preload(callback: js.Function, self: any = ???): Unit = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Exchange")
class Exchange extends qx.core.Object {
    constructor (vRequest: qx.io.remote.Request = ???);
    static def canHandle(vImpl: any, vNeeds: IMap, vResponseType: String): Boolean = js.native
    static def initTypes(): Unit = js.native
    static def registerType(vClass: any, vId: String): Unit = js.native
    static def statusCodeToString(vStatusCode: Int): String = js.native
    static def wasSuccessful(vStatusCode: Int, vReadyState: String, vIsLocal: Boolean): Boolean = js.native
    protected def _applyImplementation(value: any, old: any): Unit = js.native
    protected def _applyState(value: any, old: any): Unit = js.native
    protected def _onabort(e: qx.event.type.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.type.Event): Unit = js.native
    protected def _onfailed(e: qx.event.type.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.type.Event): Unit = js.native
    protected def _onsending(e: qx.event.type.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.type.Event): Unit = js.native
    def abort(): Unit = js.native
    def getImplementation(): qx.io.remote.transport.Abstract = js.native
    def getRequest(): qx.io.remote.Request = js.native
    def getState(): any = js.native
    protected def initImplementation(value: any): qx.io.remote.transport.Abstract = js.native
    protected def initRequest(value: any): qx.io.remote.Request = js.native
    protected def initState(value: any): any = js.native
    def resetImplementation(): Unit = js.native
    def resetRequest(): Unit = js.native
    def resetState(): Unit = js.native
    def send(): any = js.native
    def setImplementation(value: any): qx.io.remote.transport.Abstract = js.native
    def setRequest(value: any): qx.io.remote.Request = js.native
    def setState(value: any): any = js.native
    def timeout(): Unit = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Request")
class Request extends qx.core.Object {
    constructor (vUrl: String = ???, vMethod: String = ???, vResponseType: String = ???);
    static def methodAllowsRequestBody(httpMethod: String): Boolean = js.native
    protected def _applyMethod(value: any, old: any): Unit = js.native
    protected def _applyProhibitCaching(value: any, old: any): Unit = js.native
    protected def _applyResponseType(value: any, old: any): Unit = js.native
    protected def _applyState(value: any, old: any): Unit = js.native
    protected def _onaborted(e: qx.event.type.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.type.Event): Unit = js.native
    protected def _onfailed(e: qx.event.type.Event): Unit = js.native
    protected def _onqueued(e: qx.event.type.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.type.Event): Unit = js.native
    protected def _onsending(e: qx.event.type.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.type.Event): Unit = js.native
    def abort(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getCrossDomain(): Boolean = js.native
    def getData(): String = js.native
    def getFileUpload(): Boolean = js.native
    def getFormField(vId: String): String = js.native
    def getFormFields(): any = js.native
    def getMethod(): any = js.native
    def getParameter(vId: String, bFromData: Boolean): any = js.native
    def getParameters(bFromData: Boolean): any = js.native
    def getParseJson(): Boolean = js.native
    def getPassword(): String = js.native
    def getProhibitCaching(): any = js.native
    def getRequestHeader(vId: String): String = js.native
    def getRequestHeaders(): any = js.native
    def getResponseType(): any = js.native
    def getSequenceNumber(): Int = js.native
    def getState(): any = js.native
    def getTimeout(): Int = js.native
    def getTransport(): qx.io.remote.Exchange = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: any): Boolean = js.native
    protected def initCrossDomain(value: any): Boolean = js.native
    protected def initData(value: any): String = js.native
    protected def initFileUpload(value: any): Boolean = js.native
    protected def initMethod(value: any): any = js.native
    protected def initParseJson(value: any): Boolean = js.native
    protected def initPassword(value: any): String = js.native
    protected def initProhibitCaching(value: any): any = js.native
    protected def initResponseType(value: any): any = js.native
    protected def initState(value: any): any = js.native
    protected def initTimeout(value: any): Int = js.native
    protected def initTransport(value: any): qx.io.remote.Exchange = js.native
    protected def initUrl(value: any): String = js.native
    protected def initUseBasicHttpAuth(value: any): Boolean = js.native
    protected def initUsername(value: any): String = js.native
    def isAborted(): Boolean = js.native
    def isAsynchronous(): Boolean = js.native
    def isCompleted(): Boolean = js.native
    def isConfigured(): Boolean = js.native
    def isCrossDomain(): Boolean = js.native
    def isFailed(): Boolean = js.native
    def isFileUpload(): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def isQueued(): Boolean = js.native
    def isReceiving(): Boolean = js.native
    def isSending(): Boolean = js.native
    def isTimeout(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def removeFormField(vId: String): Unit = js.native
    def removeParameter(vId: String, bFromData: Boolean): Unit = js.native
    def removeRequestHeader(vId: String): Unit = js.native
    def reset(): Unit = js.native
    def resetAsynchronous(): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFileUpload(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParseJson(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProhibitCaching(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetTransport(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: any): Boolean = js.native
    def setCrossDomain(value: any): Boolean = js.native
    def setData(value: any): String = js.native
    def setFileUpload(value: any): Boolean = js.native
    def setFormField(vId: String, vValue: String): Unit = js.native
    def setMethod(value: any): any = js.native
    def setParameter(vId: String, vValue: any, bAsData: Boolean): Unit = js.native
    def setParseJson(value: any): Boolean = js.native
    def setPassword(value: any): String = js.native
    def setProhibitCaching(value: any): any = js.native
    def setRequestHeader(vId: String, vValue: String): Unit = js.native
    def setResponseType(value: any): any = js.native
    def setState(value: any): any = js.native
    def setTimeout(value: any): Int = js.native
    def setTransport(value: any): qx.io.remote.Exchange = js.native
    def setUrl(value: any): String = js.native
    def setUseBasicHttpAuth(value: any): Boolean = js.native
    def setUsername(value: any): String = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleFileUpload(): Boolean = js.native
    def toggleParseJson(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.RequestQueue")
class RequestQueue extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.io.remote.RequestQueue = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _check(): Unit = js.native
    protected def _debug(): Unit = js.native
    protected def _oncompleted(e: qx.event.type.Event): Unit = js.native
    protected def _oninterval(e: qx.event.type.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.type.Event): Unit = js.native
    protected def _onsending(e: qx.event.type.Event): Unit = js.native
    protected def _remove(vTransport: qx.io.remote.Exchange): Unit = js.native
    def abort(vRequest: any): Unit = js.native
    def add(vRequest: any): Unit = js.native
    def getActiveQueue(): any[] = js.native
    def getDefaultTimeout(): Int = js.native
    def getEnabled(): Boolean = js.native
    def getMaxConcurrentRequests(): Int = js.native
    def getMaxTotalRequests(): Int = js.native
    def getRequestQueue(): any[] = js.native
    protected def initDefaultTimeout(value: any): Int = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initMaxConcurrentRequests(value: any): Int = js.native
    protected def initMaxTotalRequests(value: any): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetDefaultTimeout(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetMaxConcurrentRequests(): Unit = js.native
    def resetMaxTotalRequests(): Unit = js.native
    def setDefaultTimeout(value: any): Int = js.native
    def setEnabled(value: any): Boolean = js.native
    def setMaxConcurrentRequests(value: any): Int = js.native
    def setMaxTotalRequests(value: any): Int = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Response")
class Response extends qx.event.type.Event {
    protected def _applyResponseHeaders(value: any, old: any): Unit = js.native
    def getContent(): any = js.native
    def getResponseHeader(vHeader: String): any = js.native
    def getResponseHeaders(): any = js.native
    def getState(): Int = js.native
    def getStatusCode(): Int = js.native
    protected def initContent(value: any): any = js.native
    protected def initResponseHeaders(value: any): any = js.native
    protected def initState(value: any): Int = js.native
    protected def initStatusCode(value: any): Int = js.native
    def resetContent(): Unit = js.native
    def resetResponseHeaders(): Unit = js.native
    def resetState(): Unit = js.native
    def resetStatusCode(): Unit = js.native
    def setContent(value: any): any = js.native
    def setResponseHeaders(value: any): any = js.native
    def setState(value: any): Int = js.native
    def setStatusCode(value: any): Int = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Rpc")
class Rpc extends qx.core.Object {
    constructor (url: String = ???, serviceName: String = ???);
    static def makeServerURL(instanceId: String = ???): String = js.native
    protected def _callInternal(args: qx.data.Array, callType: Int, refreshSession: Boolean): any = js.native
    protected def _isConvertDates(): Boolean = js.native
    protected def _isResponseJson(): Boolean = js.native
    def abort(opaqueCallRef: any): Unit = js.native
    def callAsync(handler: js.Function, methodName: String): any = js.native
    def callAsyncListeners(coalesce: Boolean, methodName: String): any = js.native
    def callSync(methodName: String): any = js.native
    def createRequest(): qx.io.remote.Request = js.native
    def createRpcData(id: Int, method: String, parameters: qx.data.Array, serverData: any): any = js.native
    def fixUrl(url: String): String = js.native
    def getCrossDomain(): Boolean = js.native
    def getPassword(): String = js.native
    def getProtocol(): any = js.native
    def getServerData(): any = js.native
    def getServiceName(): String = js.native
    def getTimeout(): Int = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initCrossDomain(value: any): Boolean = js.native
    protected def initPassword(value: any): String = js.native
    protected def initProtocol(value: any): any = js.native
    protected def initServerData(value: any): any = js.native
    protected def initServiceName(value: any): String = js.native
    protected def initTimeout(value: any): Int = js.native
    protected def initUrl(value: any): String = js.native
    protected def initUseBasicHttpAuth(value: any): Boolean = js.native
    protected def initUsername(value: any): String = js.native
    def isCrossDomain(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def refreshSession(handler: js.Function): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProtocol(): Unit = js.native
    def resetServerData(): Unit = js.native
    def resetServiceName(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def setCrossDomain(value: any): Boolean = js.native
    def setPassword(value: any): String = js.native
    def setProtocol(value: any): any = js.native
    def setServerData(value: any): any = js.native
    def setServiceName(value: any): String = js.native
    def setTimeout(value: any): Int = js.native
    def setUrl(value: any): String = js.native
    def setUseBasicHttpAuth(value: any): Boolean = js.native
    def setUsername(value: any): String = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

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
    protected def _applyState(value: any, old: any): Unit = js.native
    def abort(): Unit = js.native
    def failed(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getData(): String = js.native
    def getFetchedLength(): Int = js.native
    def getFormFields(): any = js.native
    def getMethod(): String = js.native
    def getParameters(): any = js.native
    def getPassword(): String = js.native
    def getRequestHeaders(): any = js.native
    def getResponseHeader(vLabel: String): any = js.native
    def getResponseHeaders(): any = js.native
    def getResponseText(): String = js.native
    def getResponseType(): String = js.native
    def getResponseXml(): any = js.native
    def getState(): any = js.native
    def getStatusCode(): Int = js.native
    def getStatusText(): String = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: any): Boolean = js.native
    protected def initData(value: any): String = js.native
    protected def initFormFields(value: any): any = js.native
    protected def initMethod(value: any): String = js.native
    protected def initParameters(value: any): any = js.native
    protected def initPassword(value: any): String = js.native
    protected def initRequestHeaders(value: any): any = js.native
    protected def initResponseType(value: any): String = js.native
    protected def initState(value: any): any = js.native
    protected def initUrl(value: any): String = js.native
    protected def initUseBasicHttpAuth(value: any): Boolean = js.native
    protected def initUsername(value: any): String = js.native
    def isAsynchronous(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def resetAsynchronous(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFormFields(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParameters(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetRequestHeaders(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: any): Boolean = js.native
    def setData(value: any): String = js.native
    def setFormFields(value: any): any = js.native
    def setMethod(value: any): String = js.native
    def setParameters(value: any): any = js.native
    def setPassword(value: any): String = js.native
    def setRequestHeader(vLabel: String, vValue: any): Unit = js.native
    def setRequestHeaders(value: any): any = js.native
    def setResponseType(value: any): String = js.native
    def setState(value: any): any = js.native
    def setUrl(value: any): String = js.native
    def setUseBasicHttpAuth(value: any): Boolean = js.native
    def setUsername(value: any): String = js.native
    def timeout(): Unit = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Iframe")
class Iframe extends qx.io.remote.transport.Abstract {
    constructor ();
    static def isSupported(): Boolean = js.native
    protected def _onload(e: qx.event.type.Event): Unit = js.native
    protected def _onreadystatechange(e: qx.event.type.Event): Unit = js.native
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getIframeBody(): any = js.native
    def getIframeDocument(): any = js.native
    def getIframeHtmlContent(): String = js.native
    def getIframeTextContent(): String = js.native
    def getIframeWindow(): any = js.native
    def getResponseContent(): any = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Script")
class Script extends qx.io.remote.transport.Abstract {
    constructor ();
    protected static def _requestFinished(id: String, content: String): Unit = js.native
    static def isSupported(): Boolean = js.native
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getResponseContent(): any = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
class XmlHttp extends qx.io.remote.transport.Abstract {
    static def createRequestObject(): any = js.native
    static def isSupported(): Boolean = js.native
    protected def _onreadystatechange(e: qx.event.type.Event): Unit = js.native
    def failedLocally(): Unit = js.native
    def getParseJson(): Boolean = js.native
    def getReadyState(): Int = js.native
    def getRequest(): any = js.native
    def getResponseContent(): any = js.native
    def getStringResponseHeaders(): any = js.native
    protected def initParseJson(value: any): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def resetParseJson(): Unit = js.native
    def setParseJson(value: any): Boolean = js.native
    def toggleParseJson(): Boolean = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.AbstractRequest")
class AbstractRequest extends qx.core.Object {
    constructor (url: String = ???);
    protected def _createTransport(): qx.bom.request = js.native
    protected def _fireStatefulEvent(evt: String): Unit = js.native
    protected def _getAllRequestHeaders(): IMap = js.native
    protected def _getConfiguredRequestHeaders(): IMap = js.native
    protected def _getConfiguredUrl(): String = js.native
    protected def _getMethod(): String = js.native
    protected def _getParsedResponse(): String = js.native
    protected def _isAsync(): Boolean = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoad(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _serializeData(data: String): String = js.native
    protected def _setPhase(phase: String): Unit = js.native
    protected def _setRequestHeaders(): Unit = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getAuthentication(): qx.io.request.authentication.IAuthentication = js.native
    def getPhase(): String = js.native
    def getReadyState(): Long = js.native
    def getRequestData(): any = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseContentType(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def getResponseText(): String = js.native
    def getStatus(): Long = js.native
    def getStatusText(): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): any = js.native
    def getUrl(): String = js.native
    protected def initAuthentication(value: any): qx.io.request.authentication.IAuthentication = js.native
    protected def initRequestData(value: any): any = js.native
    protected def initTimeout(value: any): Long = js.native
    protected def initUrl(value: any): String = js.native
    def isDone(): Unit = js.native
    def overrideResponseContentType(contentType: String): Unit = js.native
    def removeRequestHeader(key: String): Unit = js.native
    def resetAuthentication(): Unit = js.native
    def resetRequestData(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def send(): Unit = js.native
    def setAuthentication(value: any): qx.io.request.authentication.IAuthentication = js.native
    def setRequestData(value: any): any = js.native
    def setRequestHeader(key: String, value: String): Unit = js.native
    def setTimeout(value: any): Long = js.native
    def setUrl(value: any): String = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Jsonp")
class Jsonp extends qx.io.request.AbstractRequest {
    def getCache(): Boolean = js.native
    protected def initCache(value: any): Boolean = js.native
    def isCache(): Boolean = js.native
    def resetCache(): Unit = js.native
    def setCache(value: any): Boolean = js.native
    def setCallbackName(name: String): Unit = js.native
    def setCallbackParam(param: String): Unit = js.native
    def toggleCache(): Boolean = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Xhr")
class Xhr extends qx.io.request.AbstractRequest {
    constructor (url: String = ???, method: String = ???);
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    def getAccept(): String = js.native
    def getAsync(): Boolean = js.native
    def getCache(): any = js.native
    def getMethod(): any = js.native
    protected def initAccept(value: any): String = js.native
    protected def initAsync(value: any): Boolean = js.native
    protected def initCache(value: any): any = js.native
    protected def initMethod(value: any): any = js.native
    def isAsync(): Boolean = js.native
    def resetAccept(): Unit = js.native
    def resetAsync(): Unit = js.native
    def resetCache(): Unit = js.native
    def resetMethod(): Unit = js.native
    def setAccept(value: any): String = js.native
    def setAsync(value: any): Boolean = js.native
    def setCache(value: any): any = js.native
    def setMethod(value: any): any = js.native
    def setParser(parser: String): js.Function = js.native
    def toggleAsync(): Boolean = js.native

}
}
package qx.io.request.authentication {
@js.native
@JSName("qx.io.request.authentication.Basic")
class Basic extends qx.core.Object implements qx.io.request.authentication.IAuthentication {
    def getAuthHeaders(): IMap[] = js.native
    constructor (username: any = ???, password: any = ???);

}
}
package qx.io.request.authentication {
@js.native
trait IAuthentication extends js.Object {
    def getAuthHeaders(): IMap[] = js.native

}
}
package qx.io.rest {
@js.native
@JSName("qx.io.rest.Resource")
class Resource extends qx.core.Object {
    constructor (description: IMap = ???);
    static def placeholdersFromUrl(url: String): qx.data.Array = js.native
    protected def _getRequest(): qx.io.request.Xhr = js.native
    protected def _getRequestConfig(action: String, params: IMap): IMap = js.native
    protected def _getResource(description: IMap = ???): qx.bom.rest.Resource = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _tailorResource(resource: qx.bom.rest.Resource): qx.bom.rest.Resource = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def invoke(action: String, params: IMap, data: IMap): Long = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: IMap = ???): Unit = js.native
    def poll(action: String, interval: Long, params: IMap = ???, immediately: Boolean = ???): qx.event.Timer = js.native
    def refresh(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Array")
class Array extends js.Object {
    static def append(arr1: qx.data.Array, arr2: qx.data.Array): qx.data.Array = js.native
    static def cast(object: any, constructor: js.Function, offset: Int = ???): qx.data.Array = js.native
    static def clone(arr: qx.data.Array): qx.data.Array = js.native
    static def contains(arr: qx.data.Array, obj: any): Boolean = js.native
    static def equals(arr1: qx.data.Array, arr2: qx.data.Array): Boolean = js.native
    static def exclude(arr1: qx.data.Array, arr2: qx.data.Array): qx.data.Array = js.native
    static def fromArguments(args: any, offset: Int = ???): qx.data.Array = js.native
    static def fromCollection(coll: any): qx.data.Array = js.native
    static def fromShortHand(input: qx.data.Array): qx.data.Array = js.native
    static def insertAfter(arr: qx.data.Array, obj: any, obj2: any): qx.data.Array = js.native
    static def insertAt(arr: qx.data.Array, obj: any, i: Int): qx.data.Array = js.native
    static def insertBefore(arr: qx.data.Array, obj: any, obj2: any): qx.data.Array = js.native
    static def max(arr: Long[]): Long = js.native
    static def min(arr: Long[]): Long = js.native
    static def range(start: Int, stop: Int, step: Int): qx.data.Array = js.native
    static def remove(arr: qx.data.Array, obj: any): any = js.native
    static def removeAll(arr: qx.data.Array): qx.data.Array = js.native
    static def removeAt(arr: qx.data.Array, i: Int): any = js.native
    static def sum(arr: Long[]): Long = js.native
    static def unique(arr: qx.data.Array): qx.data.Array = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Function")
class Function extends js.Object {
    static def attempt(func: js.Function, self: any = ???, varargs: any = ???): Boolean = js.native
    static def bind(func: js.Function, self: any = ???, varargs: any = ???): js.Function = js.native
    static def create(func: js.Function, options: IMap = ???): js.Function = js.native
    static def curry(func: js.Function, varargs: any = ???): any = js.native
    static def delay(func: js.Function, delay: Int, self: any = ???, varargs: any = ???): Int = js.native
    static def getCaller(args: any): js.Function = js.native
    static def getName(fcn: js.Function): String = js.native
    static def globalEval(data: String): any = js.native
    static def listener(func: js.Function, self: any = ???, varargs: any = ???): any = js.native
    static def periodical(func: js.Function, interval: Int, self: any = ???, varargs: any = ???): Int = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Json")
class Json extends js.Object {
    static def parse(text: String, reviver: js.Function = ???): any = js.native
    static def stringify(value: any, replacer: js.Function = ???, space: String = ???): String = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Number")
class Number extends js.Object {
    static def isBetweenRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    static def isInRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    static def limit(nr: Long, vmin: Int, vmax: Int): Int = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Object")
class Object extends js.Object {
    static def clone(source: any, deep: Boolean): any = js.native
    static def contains(map: any, value: any): Boolean = js.native
    static def empty(map: any): Unit = js.native
    static def equals(object1: any, object2: any): Boolean = js.native
    static def fromArray(array: qx.data.Array): IMap = js.native
    static def getKeyFromValue(map: any, value: any): String = js.native
    static def getLength(map: any): Int = js.native
    static def getValues(map: any): qx.data.Array = js.native
    static def invert(map: any): any = js.native
    static def isEmpty(map: any): Boolean = js.native
    static def mergeWith(target: any, source: any, overwrite: Boolean = ???): any = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.String")
class String extends js.Object {
    static def camelCase(str: String): String = js.native
    static def capitalize(str: String): String = js.native
    static def clean(str: String): String = js.native
    static def contains(str: String, substring: String): Boolean = js.native
    static def endsWith(fullstr: String, substr: String): Boolean = js.native
    static def escapeRegexpChars(str: String): String = js.native
    static def firstLow(str: String): String = js.native
    static def firstUp(str: String): String = js.native
    static def format(pattern: String, args: qx.data.Array): String = js.native
    static def hyphenate(str: String): String = js.native
    static def pad(str: String, length: Int, ch: String): String = js.native
    static def quote(str: String): String = js.native
    static def repeat(str: String, times: Int): String = js.native
    static def startsWith(fullstr: String, substr: String): Boolean = js.native
    static def stripScripts(str: String, exec: Boolean = ???): String = js.native
    static def stripTags(str: String): String = js.native
    static def toArray(str: String): qx.data.Array = js.native
    static def trimLeft(str: String): String = js.native
    static def trimRight(str: String): String = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Type")
class Type extends js.Object {
    static def getClass(value: any): String = js.native
    static def isArray(value: any): Boolean = js.native
    static def isBoolean(value: any): Boolean = js.native
    static def isDate(value: any): Boolean = js.native
    static def isError(value: any): Boolean = js.native
    static def isFunction(value: any): Boolean = js.native
    static def isNumber(value: any): Boolean = js.native
    static def isObject(value: any): Boolean = js.native
    static def isRegExp(value: any): Boolean = js.native
    static def isString(value: any): Boolean = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Array")
class Array extends js.Object {
    static def every(callback: js.Function, obj: any = ???): qx.data.Array = js.native
    static def filter(callback: js.Function, obj: any = ???): qx.data.Array = js.native
    static def forEach(callback: js.Function, obj: any = ???): Unit = js.native
    static def indexOf(searchElement: any, fromIndex: Int = ???): Int = js.native
    static def lastIndexOf(searchElement: any, fromIndex: Int = ???): Int = js.native
    static def map(callback: js.Function, obj: any = ???): qx.data.Array = js.native
    static def reduce(callback: js.Function, init: any = ???): any = js.native
    static def reduceRight(callback: js.Function, init: any = ???): any = js.native
    static def some(callback: js.Function, obj: any = ???): qx.data.Array = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Date")
class Date extends js.Object {
    static def now(): Int = js.native

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
    static def bind(that: any = ???): js.Function = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Object")
class Object extends js.Object {
    static def keys(map: any): qx.data.Array = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.String")
class String extends js.Object {
    static def trim(): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Date")
class Date extends js.Object {
    protected static def _getTerritory(locale: String): String = js.native
    static def getAmMarker(locale: String): String = js.native
    static def getDateFormat(size: String, locale: String = ???): String = js.native
    static def getDateTimeFormat(canonical: String, fallback: String, locale: String): String = js.native
    static def getDayName(length: String, day: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    static def getDayNames(length: String, locale: String, context: String, withFallback: Boolean = ???): String[] = js.native
    static def getMonthName(length: String, month: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    static def getMonthNames(length: String, locale: String, context: String, withFallback: Boolean = ???): String[] = js.native
    static def getPmMarker(locale: String): String = js.native
    static def getTimeFormat(size: String, locale: String): String = js.native
    static def getWeekendEnd(locale: String): Int = js.native
    static def getWeekendStart(locale: String): Int = js.native
    static def getWeekStart(locale: String): Int = js.native
    static def isWeekend(day: Int, locale: String): Boolean = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Key")
class Key extends js.Object {
    static def getKeyName(size: String, keyIdentifier: String, locale: String): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.LocalizedString")
class LocalizedString extends qx.type.BaseString {
    constructor (translation: String = ???, messageId: String = ???, args: qx.data.Array = ???);
    def getMessageId(): String = js.native
    def translate(): qx.locale.LocalizedString = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.MTranslation")
class MTranslation extends js.Object {
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.locale.Manager = js.native
    static def marktr(messageId: String): String = js.native
    static def tr(messageId: String, varargs: any = ???): String = js.native
    static def trc(hint: String, messageId: String, varargs: any = ???): String = js.native
    static def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    static def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def addLocale(localeCode: String, localeMap: IMap): Unit = js.native
    def addTranslation(languageCode: String, translationMap: IMap): Unit = js.native
    def getAvailableLocales(includeNonloaded: Boolean = ???): String[] = js.native
    def getLanguage(): String = js.native
    def getLocale(): String = js.native
    def getTerritory(): String = js.native
    protected def initLocale(value: any): String = js.native
    def localize(messageId: String, args: any[], locale: String = ???): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: any): String = js.native
    def translate(messageId: String, args: any[], locale: String = ???): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Number")
class Number extends js.Object {
    static def getDecimalSeparator(locale: String): String = js.native
    static def getGroupSeparator(locale: String): String = js.native
    static def getPercentFormat(locale: String): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.String")
class String extends js.Object {
    static def getAlternateQuotationEnd(locale: String): String = js.native
    static def getAlternateQuotationStart(locale: String): String = js.native
    static def getQuotationEnd(locale: String): String = js.native
    static def getQuotationStart(locale: String): String = js.native

}
}
package qx.log {
@js.native
@JSName("qx.log.Logger")
class Logger extends js.Object {
    static def clear(): Unit = js.native
    static def debug(object: any, message: any): Unit = js.native
    static def deprecatedClassWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    static def deprecatedConstantWarning(clazz: qx.Class, constant: String, msg: String): Unit = js.native
    static def deprecatedEventWarning(clazz: qx.Class, event: String, msg: String = ???): Unit = js.native
    static def deprecatedMethodWarning(fcn: js.Function, msg: String = ???): Unit = js.native
    static def deprecatedMixinWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    static def deprecateMethodOverriding(object: qx.core.Object, baseclass: qx.Class, methodName: String, msg: String = ???): Unit = js.native
    static def error(object: any, message: any): Unit = js.native
    static def getLevel(): Int = js.native
    static def getTreshold(): Int = js.native
    static def info(object: any, message: any): Unit = js.native
    static def register(appender: qx.Class): Unit = js.native
    static def setLevel(value: String): Unit = js.native
    static def setTreshold(value: Int): Unit = js.native
    static def trace(object: any = ???): Unit = js.native
    static def unregister(appender: qx.Class): Unit = js.native
    static def warn(object: any, message: any): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Console")
class Console extends js.Object {
    static def clear(): Unit = js.native
    static def dispose(): Unit = js.native
    static def execute(): Unit = js.native
    static def init(): Unit = js.native
    static def process(entry: IMap): Unit = js.native
    static def show(): Unit = js.native
    static def toggle(): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Element")
class Element extends qx.core.Object {
    constructor (element: HTMLElement = ???);
    def clear(): Unit = js.native
    def process(entry: IMap): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Native")
class Native extends js.Object {
    static def process(entry: IMap): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.NodeConsole")
class NodeConsole extends js.Object {
    static def debug(logMessage: String): Unit = js.native
    static def error(logMessage: String): Unit = js.native
    static def info(logMessage: String): Unit = js.native
    static def log(logMessage: String, level: String): Unit = js.native
    static def process(entry: IMap): Unit = js.native
    static def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.PhoneGap")
class PhoneGap extends js.Object {
    static def process(entry: IMap): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoConsole")
class RhinoConsole extends js.Object {
    static def debug(logMessage: String): Unit = js.native
    static def error(logMessage: String): Unit = js.native
    static def info(logMessage: String): Unit = js.native
    static def log(logMessage: String, level: String): Unit = js.native
    static def process(entry: IMap): Unit = js.native
    static def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoFile")
class RhinoFile extends js.Object {
    static def create(): Unit = js.native
    static def debug(logMessage: String): Unit = js.native
    static def error(logMessage: String): Unit = js.native
    static def info(logMessage: String): Unit = js.native
    static def log(logMessage: String, level: String): Unit = js.native
    static def process(entry: IMap): Unit = js.native
    static def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RingBuffer")
class RingBuffer extends qx.util.RingBuffer {
    constructor (maxMessages: Int = ???);
    def clearHistory(): Unit = js.native
    def getAllLogEvents(): qx.data.Array = js.native
    def getMaxMessages(): Int = js.native
    def process(entry: IMap): Unit = js.native
    def retrieveLogEvents(count: Int, startingFromMark: Boolean = ???): qx.data.Array = js.native
    def setMaxMessages(maxMessages: Int): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Util")
class Util extends js.Object {
    static def escapeHTML(value: String): String = js.native
    static def formatOffset(offset: Int, length: Int = ???): String = js.native
    static def toHtml(entry: IMap): Unit = js.native
    static def toText(entry: IMap): String = js.native
    static def toTextArray(entry: IMap): qx.data.Array = js.native

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
    static def getInstance(): qx.theme.manager.Appearance = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: any): qx.Theme = js.native
    def styleFrom(id: String, states: IMap, theme: qx.Theme = ???, defaultId: String = ???): IMap = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Color")
class Color extends qx.util.ValueManager {
    static def getInstance(): qx.theme.manager.Color = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: any): qx.Theme = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Decoration")
class Decoration extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.theme.manager.Decoration = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def addCssClass(value: String): String = js.native
    def clear(): Unit = js.native
    def getCssClassName(value: String): String = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def isCached(decorator: String): Boolean = js.native
    def isDynamic(value: String): Boolean = js.native
    def isValidPropertyValue(value: any): Boolean = js.native
    def refresh(): Unit = js.native
    def removeAllCssClasses(): Unit = js.native
    def resetTheme(): Unit = js.native
    def resolve(value: String): any = js.native
    def setTheme(value: any): qx.Theme = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Font")
class Font extends qx.util.ValueManager {
    static def getInstance(): qx.theme.manager.Font = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: any): qx.Theme = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Icon")
class Icon extends qx.core.Object {
    static def getInstance(): qx.theme.manager.Icon = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: any): qx.Theme = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Meta")
class Meta extends qx.core.Object {
    static def getInstance(): qx.theme.manager.Meta = js.native
    protected def _activateEvents(): Unit = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    protected def _fireEvent(e: qx.event.type.Data): Unit = js.native
    protected def _suspendEvents(): Unit = js.native
    def getTheme(): qx.Theme = js.native
    def initialize(): Unit = js.native
    protected def initTheme(value: any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: any): qx.Theme = js.native

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
    constructor (length_or_items: Int = ???);
    def append(arr: qx.data.Array): qx.data.Array = js.native
    def clone(): qx.data.Array = js.native
    def contains(obj: any): Boolean = js.native
    def insertAfter(obj: any, obj2: any): qx.data.Array = js.native
    def insertAt(obj: any, i: Int): qx.data.Array = js.native
    def insertBefore(obj: any, obj2: any): qx.data.Array = js.native
    def prepend(arr: qx.data.Array): qx.data.Array = js.native
    def remove(obj: any): any = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(i: Int): any = js.native

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseArray")
class BaseArray extends qx.data.Array {
    constructor (length_or_items: Int = ???);
    def concat(varargs: qx.data.Array = ???): qx.type.BaseArray = js.native
    def every(callback: js.Function, obj: any): Boolean = js.native
    def filter(callback: js.Function, obj: any): any = js.native
    def forEach(callback: js.Function, obj: any): Unit = js.native
    def indexOf(searchElement: any, fromIndex: Int = ???): Int = js.native
    def join(separator: String): String = js.native
    def lastIndexOf(searchElement: any, fromIndex: Int = ???): Int = js.native
    def map(callback: js.Function, obj: any): any = js.native
    def pop(): any = js.native
    def push(varargs: any = ???): Int = js.native
    def reverse(): qx.data.Array = js.native
    def shift(): any = js.native
    def slice(begin: Int, end: Int = ???): any = js.native
    def some(callback: js.Function, obj: any): Boolean = js.native
    def sort(compareFunction: js.Function = ???): qx.data.Array = js.native
    def splice(index: Int, howMany: Int, varargs: any = ???): any = js.native
    def toArray(): qx.data.Array = js.native
    def unshift(varargs: any = ???): Int = js.native

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseError")
class BaseError extends js.Error {
    constructor (comment: String = ???, failMessage: String = ???);
    def getComment(): String = js.native

}
}
package qx.type {
@js.native
@JSName("qx.type.BaseString")
class BaseString extends js.Object {
    constructor (txt: String = ???);
    def base(args: any, varags: any): any = js.native
    def charAt(index: Int): String = js.native
    def charCodeAt(index: Int): Int = js.native
    def concat(stringN: String): String = js.native
    def indexOf(index: String, offset: Int = ???): Int = js.native
    def lastIndexOf(index: String, offset: Int = ???): Int = js.native
    def match(regexp: any): any = js.native
    def replace(regexp: any, aFunction: js.Function): String = js.native
    def search(regexp: any): any = js.native
    def slice(beginslice: Int, endSlice: Int = ???): String = js.native
    def split(separator: String = ???, limit: Int = ???): qx.data.Array = js.native
    def substr(start: Int, length: Int = ???): String = js.native
    def substring(indexA: Int, indexB: Int = ???): String = js.native
    def toHashCode(): Int = js.native
    def toLocaleLowerCase(): String = js.native
    def toLocaleUpperCase(): String = js.native
    def toLowerCase(): String = js.native
    def toUpperCase(): String = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Atom")
class Atom extends qx.ui.core.Widget {
    constructor (label: String = ???, icon: String = ???);
    protected def _applyCenter(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyGap(value: Int, old: Int): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconPosition(value: any, old: any): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShow(value: any, old: any): Unit = js.native
    protected def _handleIcon(): Unit = js.native
    protected def _handleLabel(): Unit = js.native
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIcon(): String = js.native
    def getIconPosition(): any = js.native
    def getLabel(): String = js.native
    def getRich(): Boolean = js.native
    def getShow(): any = js.native
    protected def initCenter(value: any): Boolean = js.native
    protected def initGap(value: any): Int = js.native
    protected def initIcon(value: any): String = js.native
    protected def initIconPosition(value: any): any = js.native
    protected def initLabel(value: any): String = js.native
    protected def initRich(value: any): Boolean = js.native
    protected def initShow(value: any): any = js.native
    def isCenter(): Boolean = js.native
    def isRich(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShow(): Unit = js.native
    def setCenter(value: any): Boolean = js.native
    def setGap(value: any): Int = js.native
    def setIcon(value: any): String = js.native
    def setIconPosition(value: any): any = js.native
    def setLabel(value: any): String = js.native
    def setRich(value: any): Boolean = js.native
    def setShow(value: any): any = js.native
    def toggleCenter(): Boolean = js.native
    def toggleRich(): Boolean = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Image")
class Image extends qx.ui.core.Widget {
    constructor (source: String = ???);
    protected def _applyScale(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _findHighResolutionSource(lowResImgSrc: String): String = js.native
    protected def _getHighResolutionSource(source: String, pixelRatio: Long): String = js.native
    protected def _styleSource(): Unit = js.native
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    protected def initScale(value: any): Boolean = js.native
    protected def initSource(value: any): String = js.native
    def isScale(): Boolean = js.native
    def resetScale(): Unit = js.native
    def resetSource(): Unit = js.native
    def setScale(value: any): Boolean = js.native
    def setSource(value: any): String = js.native
    def toggleScale(): Boolean = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Label")
class Label extends qx.ui.core.Widget implements qx.ui.form.IStringForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    constructor (value: String = ???);
    protected def _applyBuddy(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: any, old: any): Unit = js.native
    protected def _applyValue(value: String, old: String): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeLocale(e: qx.event.type.Event): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.type.Data): Unit = js.native
    def getBuddy(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getTextAlign(): any = js.native
    def getWrap(): Boolean = js.native
    protected def initBuddy(value: any): qx.ui.core.Widget = js.native
    protected def initRich(value: any): Boolean = js.native
    protected def initTextAlign(value: any): any = js.native
    protected def initValue(value: any): String = js.native
    protected def initWrap(value: any): Boolean = js.native
    def isRich(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetBuddy(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setBuddy(value: any): qx.ui.core.Widget = js.native
    def setRich(value: any): Boolean = js.native
    def setTextAlign(value: any): any = js.native
    def setWrap(value: any): Boolean = js.native
    def toggleRich(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Composite")
class Composite extends qx.ui.core.Widget {
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    constructor (layout: qx.ui.layout.Abstract = ???);

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Resizer")
class Resizer extends qx.ui.container.Composite {
    def getResizableBottom(): Boolean = js.native
    def getResizableLeft(): Boolean = js.native
    def getResizableRight(): Boolean = js.native
    def getResizableTop(): Boolean = js.native
    def getResizeSensitivity(): Int = js.native
    def getUseResizeFrame(): Boolean = js.native
    def isResizableBottom(): Boolean = js.native
    def isResizableLeft(): Boolean = js.native
    def isResizableRight(): Boolean = js.native
    def isResizableTop(): Boolean = js.native
    def isUseResizeFrame(): Boolean = js.native
    def resetResizable(): Unit = js.native
    def resetResizableBottom(): Unit = js.native
    def resetResizableLeft(): Unit = js.native
    def resetResizableRight(): Unit = js.native
    def resetResizableTop(): Unit = js.native
    def resetResizeSensitivity(): Unit = js.native
    def resetUseResizeFrame(): Unit = js.native
    def setResizable(resizableTop: any, resizableRight: any, resizableBottom: any, resizableLeft: any): Unit = js.native
    def setResizableBottom(value: any): Boolean = js.native
    def setResizableLeft(value: any): Boolean = js.native
    def setResizableRight(value: any): Boolean = js.native
    def setResizableTop(value: any): Boolean = js.native
    def setResizeSensitivity(value: any): Int = js.native
    def setUseResizeFrame(value: any): Boolean = js.native
    def toggleResizableBottom(): Boolean = js.native
    def toggleResizableLeft(): Boolean = js.native
    def toggleResizableRight(): Boolean = js.native
    def toggleResizableTop(): Boolean = js.native
    def toggleUseResizeFrame(): Boolean = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Scroll")
class Scroll extends qx.ui.core.scroll.AbstractScrollArea {
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    constructor (content: qx.ui.core.LayoutItem = ???);
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def getChildren(): any[] = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.SlideBar")
class SlideBar extends qx.ui.core.Widget {
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    constructor (orientation: String = ???);
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    protected def _hideArrows(): Unit = js.native
    protected def _onExecuteBackward(): Unit = js.native
    protected def _onExecuteForward(): Unit = js.native
    protected def _onResize(e: qx.event.type.Event): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onScroll(): Unit = js.native
    protected def _onScrollAnimationEnd(): Unit = js.native
    protected def _showArrows(): Unit = js.native
    protected def _updateArrowsEnabled(): Unit = js.native
    def getOrientation(): any = js.native
    def getScrollStep(): Int = js.native
    protected def initOrientation(value: any): any = js.native
    protected def initScrollStep(value: any): Int = js.native
    def resetOrientation(): Unit = js.native
    def resetScrollStep(): Unit = js.native
    def scrollBy(offset: Int = ???, duration: Long = ???): Unit = js.native
    def scrollTo(value: Int, duration: Long = ???): Unit = js.native
    def setOrientation(value: any): any = js.native
    def setScrollStep(value: any): Int = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Stack")
class Stack extends qx.ui.core.Widget implements qx.ui.core.ISingleSelection {
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor ();
    protected def _applyDynamic(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): qx.ui.core.Widget[] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native
    def getDynamic(): Boolean = js.native
    protected def initDynamic(value: any): Boolean = js.native
    def isDynamic(): Boolean = js.native
    def next(): Unit = js.native
    def previous(): Unit = js.native
    def resetDynamic(): Unit = js.native
    def setDynamic(value: any): Boolean = js.native
    def toggleDynamic(): Boolean = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorPopup")
class ColorPopup extends qx.ui.popup.Popup implements qx.ui.form.IColorForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    constructor ();
    protected def _applyValue(value: any, old: any): Unit = js.native
    protected def _createBoxes(): Unit = js.native
    protected def _createColorSelector(): Unit = js.native
    protected def _onAutomaticBtnExecute(): Unit = js.native
    protected def _onChangeVisibility(e: qx.event.type.Data): Unit = js.native
    protected def _onColorSelectorCancel(): Unit = js.native
    protected def _onColorSelectorOk(): Unit = js.native
    protected def _onFieldPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onFieldPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onFieldPointerOver(e: qx.event.type.Pointer): Unit = js.native
    protected def _onSelectorButtonExecute(): Unit = js.native
    protected def _rotatePreviousColors(): Unit = js.native
    def getBlue(): Long = js.native
    def getGreen(): Long = js.native
    def getRed(): Long = js.native
    protected def initBlue(value: any): Long = js.native
    protected def initGreen(value: any): Long = js.native
    protected def initRed(value: any): Long = js.native
    protected def initValue(value: any): any = js.native
    def resetBlue(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetRed(): Unit = js.native
    def setBlue(value: any): Long = js.native
    def setGreen(value: any): Long = js.native
    def setRed(value: any): Long = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorSelector")
class ColorSelector extends qx.ui.core.Widget implements qx.ui.form.IColorForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    constructor ();
    protected def _applyBlue(value: Int, old: Int): Unit = js.native
    protected def _applyBrightness(value: Long, old: Long): Unit = js.native
    protected def _applyGreen(value: Int, old: Int): Unit = js.native
    protected def _applyHue(value: Long, old: Long): Unit = js.native
    protected def _applyRed(value: Int, old: Int): Unit = js.native
    protected def _applySaturation(value: Long, old: Long): Unit = js.native
    protected def _onAppear(e: qx.event.type.Data): Unit = js.native
    protected def _onBrightnessFieldPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerMove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerUp(e: qx.event.type.Pointer): Unit = js.native
    protected def _onBrightnessPaneRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onColorFieldTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onHexFieldChange(e: qx.event.type.Data): Unit = js.native
    protected def _onHueSaturationFieldPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerMove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerUp(e: qx.event.type.Pointer): Unit = js.native
    protected def _onHueSaturationPaneRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _setBlueFromSpinner(): Unit = js.native
    protected def _setBrightnessFromSpinner(): Unit = js.native
    protected def _setBrightnessGradiant(): Unit = js.native
    protected def _setBrightnessOnFieldEvent(e: qx.event.type.Pointer): Unit = js.native
    protected def _setGreenFromSpinner(): Unit = js.native
    protected def _setHexFromRgb(): Unit = js.native
    protected def _setHueFromRgb(): Unit = js.native
    protected def _setHueFromSpinner(): Unit = js.native
    protected def _setHueSaturationOnFieldEvent(e: qx.event.type.Pointer): Unit = js.native
    protected def _setPreviewFromRgb(): Unit = js.native
    protected def _setRedFromSpinner(): Unit = js.native
    protected def _setRgbFromHue(): Unit = js.native
    protected def _setSaturationFromSpinner(): Unit = js.native
    def getBlue(): Int = js.native
    def getBrightness(): Long = js.native
    def getGreen(): Int = js.native
    def getHue(): Long = js.native
    def getRed(): Int = js.native
    def getSaturation(): Long = js.native
    protected def initBlue(value: any): Int = js.native
    protected def initBrightness(value: any): Long = js.native
    protected def initGreen(value: any): Int = js.native
    protected def initHue(value: any): Long = js.native
    protected def initRed(value: any): Int = js.native
    protected def initSaturation(value: any): Long = js.native
    def resetBlue(): Unit = js.native
    def resetBrightness(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetHue(): Unit = js.native
    def resetRed(): Unit = js.native
    def resetSaturation(): Unit = js.native
    def setBlue(value: any): Int = js.native
    def setBrightness(value: any): Long = js.native
    def setGreen(value: any): Int = js.native
    def setHue(value: any): Long = js.native
    def setPreviousColor(red: Long, green: Long, blue: Long): Unit = js.native
    def setRed(value: any): Int = js.native
    def setSaturation(value: any): Long = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.DateChooser")
class DateChooser extends qx.ui.core.Widget implements qx.ui.form.IExecutable,qx.ui.form.IForm,qx.ui.form.IDateForm {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getValue(): js.Date = js.native
    def resetValue(): Unit = js.native
    def setValue(value: js.Date): Unit = js.native
    def resetCommand(): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (date: js.Date = ???);
    protected def _applyValue(value: js.Date, old: js.Date): Unit = js.native
    protected def _onDayDblTap(): Unit = js.native
    protected def _onDayTap(evt: qx.event.type.Data): Unit = js.native
    protected def _onKeyPress(evt: qx.event.type.Data): Unit = js.native
    protected def _onNavButtonTap(evt: qx.event.type.Data): Unit = js.native
    protected def _onPointerUpDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _updateDatePane(): Unit = js.native
    def getShownMonth(): Int = js.native
    def getShownYear(): Int = js.native
    def handleKeyPress(e: qx.event.type.Data): Unit = js.native
    protected def initShownMonth(value: any): Int = js.native
    protected def initShownYear(value: any): Int = js.native
    protected def initValue(value: any): js.Date = js.native
    def resetShownMonth(): Unit = js.native
    def resetShownYear(): Unit = js.native
    def setShownMonth(value: any): Int = js.native
    def setShownYear(value: any): Int = js.native
    def showMonth(month: Int = ???, year: Int = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Blocker")
class Blocker extends qx.core.Object {
    constructor (widget: qx.ui.core.Widget = ???);
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyOpacity(value: Long, old: Long): Unit = js.native
    protected def _backupActiveWidget(): Unit = js.native
    protected def _block(zIndex: Long, blockContent: Boolean): Unit = js.native
    protected def _onChangeTheme(): Unit = js.native
    protected def _restoreActiveWidget(): Unit = js.native
    protected def _updateBlockerBounds(bounds: IMap): Unit = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlockerElement(widget: qx.ui.core.Widget): qx.html.Element = js.native
    def getColor(): String = js.native
    def getKeepBlockerActive(): Boolean = js.native
    def getOpacity(): Long = js.native
    protected def initColor(value: any): String = js.native
    protected def initKeepBlockerActive(value: any): Boolean = js.native
    protected def initOpacity(value: any): Long = js.native
    def isBlocked(): Boolean = js.native
    def isKeepBlockerActive(): Boolean = js.native
    def resetColor(): Unit = js.native
    def resetKeepBlockerActive(): Unit = js.native
    def resetOpacity(): Unit = js.native
    def setColor(value: any): String = js.native
    def setKeepBlockerActive(value: any): Boolean = js.native
    def setOpacity(value: any): Long = js.native
    def toggleKeepBlockerActive(): Boolean = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.ColumnData")
class ColumnData extends qx.ui.core.LayoutItem {
    constructor ();
    def getComputedWidth(): Int = js.native
    def getFlex(): Int = js.native
    def setColumnWidth(width: Int, flex: Int = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.DragDropCursor")
class DragDropCursor extends qx.ui.basic.Image {
    static def getMoveDirection(): String = js.native
    static def getVisibleElement(): qx.ui.core.Widget = js.native
    static def setMoveDirection(direction: String): Unit = js.native
    static def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): IMap = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): any = js.native
    def getPlacementModeY(): any = js.native
    def getPlaceMethod(): any = js.native
    def getPosition(): any = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: IMap): Unit = js.native
    def placeToPointer(event: qx.event.type.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: any): Boolean = js.native
    def setOffset(offsetTop: any, offsetRight: any, offsetBottom: any, offsetLeft: any): Unit = js.native
    def setOffsetBottom(value: any): Int = js.native
    def setOffsetLeft(value: any): Int = js.native
    def setOffsetRight(value: any): Int = js.native
    def setOffsetTop(value: any): Int = js.native
    def setPlacementModeX(value: any): any = js.native
    def setPlacementModeY(value: any): any = js.native
    def setPlaceMethod(value: any): any = js.native
    def setPosition(value: any): any = js.native
    def toggleDomMove(): Boolean = js.native
    constructor ();
    static def getInstance(): qx.ui.core.DragDropCursor = js.native
    protected def _applyAction(value: any, old: any): Unit = js.native
    def getAction(): any = js.native
    protected def initAction(value: any): any = js.native
    def resetAction(): Unit = js.native
    def setAction(value: any): any = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.EventHandler")
class EventHandler extends qx.core.Object implements qx.event.IEventHandler {
    def canHandleEvent(target: any, type: String): Boolean = js.native
    def registerEvent(target: any, type: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: any, type: String, capture: Boolean): Unit = js.native
    constructor ();
    protected def _dispatchEvent(domEvent: qx.event.type.Event): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.FocusHandler")
class FocusHandler extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.ui.core.FocusHandler = js.native
    protected def _onActivate(e: qx.event.type.Focus): Unit = js.native
    protected def _onDeactivate(e: qx.event.type.Focus): Unit = js.native
    protected def _onFocusIn(e: qx.event.type.Focus): Unit = js.native
    protected def _onFocusOut(e: qx.event.type.Focus): Unit = js.native
    def addRoot(widget: qx.ui.core.Widget): Unit = js.native
    def connectTo(root: qx.ui.root.Abstract): Unit = js.native
    def getActiveWidget(): qx.ui.core.Widget = js.native
    def getFocusedWidget(): qx.ui.core.Widget = js.native
    def isActive(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocused(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocusRoot(widget: qx.ui.core.Widget): Boolean = js.native
    def removeRoot(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core {
@js.native
trait IMultiSelection extends js.Object {
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def selectAll(): Unit = js.native

}
}
package qx.ui.core {
@js.native
trait ISingleSelection extends js.Object {
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native

}
}
package qx.ui.core {
@js.native
trait ISingleSelectionProvider extends js.Object {
    def getItems(): qx.ui.core.Widget[] = js.native
    def isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.LayoutItem")
class LayoutItem extends qx.core.Object {
    constructor ();
    protected def _applyAlign(value: any, old: any): Unit = js.native
    protected def _applyDimension(value: Int, old: Int): Unit = js.native
    protected def _applyMargin(value: Int, old: Int): Unit = js.native
    protected def _applyStretching(value: Boolean, old: Boolean): Unit = js.native
    protected def _computeSizeHint(): IMap = js.native
    protected def _getHeightForWidth(width: Int): Int = js.native
    protected def _getLayout(): qx.ui.layout.Abstract = js.native
    protected def _getRoot(): qx.ui.core.Widget = js.native
    protected def _hasHeightForWidth(): Boolean = js.native
    protected def _onChangeTheme(): Unit = js.native
    def clearLayoutProperties(): Unit = js.native
    def clearSeparators(): Unit = js.native
    def getAlignX(): any = js.native
    def getAlignY(): any = js.native
    def getAllowGrowX(): Boolean = js.native
    def getAllowGrowY(): Boolean = js.native
    def getAllowShrinkX(): Boolean = js.native
    def getAllowShrinkY(): Boolean = js.native
    def getApplicationRoot(): qx.ui.root.Abstract = js.native
    def getBounds(): IMap = js.native
    def getHeight(): Int = js.native
    def getLayoutParent(): qx.ui.core.Widget = js.native
    def getLayoutProperties(): IMap = js.native
    def getMarginBottom(): Int = js.native
    def getMarginLeft(): Int = js.native
    def getMarginRight(): Int = js.native
    def getMarginTop(): Int = js.native
    def getMaxHeight(): Int = js.native
    def getMaxWidth(): Int = js.native
    def getMinHeight(): Int = js.native
    def getMinWidth(): Int = js.native
    def getSizeHint(compute: Boolean = ???): IMap = js.native
    def getWidth(): Int = js.native
    def hasUserBounds(): Boolean = js.native
    def hasValidLayout(): Boolean = js.native
    protected def initAlignX(value: any): any = js.native
    protected def initAlignY(value: any): any = js.native
    protected def initAllowGrowX(value: any): Boolean = js.native
    protected def initAllowGrowY(value: any): Boolean = js.native
    protected def initAllowShrinkX(value: any): Boolean = js.native
    protected def initAllowShrinkY(value: any): Boolean = js.native
    protected def initHeight(value: any): Int = js.native
    protected def initMarginBottom(value: any): Int = js.native
    protected def initMarginLeft(value: any): Int = js.native
    protected def initMarginRight(value: any): Int = js.native
    protected def initMarginTop(value: any): Int = js.native
    protected def initMaxHeight(value: any): Int = js.native
    protected def initMaxWidth(value: any): Int = js.native
    protected def initMinHeight(value: any): Int = js.native
    protected def initMinWidth(value: any): Int = js.native
    protected def initWidth(value: any): Int = js.native
    def invalidateLayoutCache(): Unit = js.native
    def isAllowGrowX(): Boolean = js.native
    def isAllowGrowY(): Boolean = js.native
    def isAllowShrinkX(): Boolean = js.native
    def isAllowShrinkY(): Boolean = js.native
    def isExcluded(): Boolean = js.native
    def isRootWidget(): Boolean = js.native
    def renderLayout(left: Int, top: Int, width: Int, height: Int): IMap = js.native
    def renderSeparator(separator: String, bounds: IMap): Unit = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetAllowGrowX(): Unit = js.native
    def resetAllowGrowY(): Unit = js.native
    def resetAllowShrinkX(): Unit = js.native
    def resetAllowShrinkY(): Unit = js.native
    def resetAllowStretchX(): Unit = js.native
    def resetAllowStretchY(): Unit = js.native
    def resetHeight(): Unit = js.native
    def resetMargin(): Unit = js.native
    def resetMarginBottom(): Unit = js.native
    def resetMarginLeft(): Unit = js.native
    def resetMarginRight(): Unit = js.native
    def resetMarginTop(): Unit = js.native
    def resetMaxHeight(): Unit = js.native
    def resetMaxWidth(): Unit = js.native
    def resetMinHeight(): Unit = js.native
    def resetMinWidth(): Unit = js.native
    def resetUserBounds(): Unit = js.native
    def resetWidth(): Unit = js.native
    def scheduleLayoutUpdate(): Unit = js.native
    def setAlignX(value: any): any = js.native
    def setAlignY(value: any): any = js.native
    def setAllowGrowX(value: any): Boolean = js.native
    def setAllowGrowY(value: any): Boolean = js.native
    def setAllowShrinkX(value: any): Boolean = js.native
    def setAllowShrinkY(value: any): Boolean = js.native
    def setAllowStretchX(allowGrowX: any, allowShrinkX: any): Unit = js.native
    def setAllowStretchY(allowGrowY: any, allowShrinkY: any): Unit = js.native
    def setHeight(value: any): Int = js.native
    def setLayoutParent(parent: qx.ui.core.Widget): Unit = js.native
    def setLayoutProperties(props: IMap): Unit = js.native
    def setMargin(marginTop: any, marginRight: any, marginBottom: any, marginLeft: any): Unit = js.native
    def setMarginBottom(value: any): Int = js.native
    def setMarginLeft(value: any): Int = js.native
    def setMarginRight(value: any): Int = js.native
    def setMarginTop(value: any): Int = js.native
    def setMaxHeight(value: any): Int = js.native
    def setMaxWidth(value: any): Int = js.native
    def setMinHeight(value: any): Int = js.native
    def setMinWidth(value: any): Int = js.native
    def setUserBounds(left: Int, top: Int, width: Int, height: Int): Unit = js.native
    def setWidth(value: any): Int = js.native
    def toggleAllowGrowX(): Boolean = js.native
    def toggleAllowGrowY(): Boolean = js.native
    def toggleAllowShrinkX(): Boolean = js.native
    def toggleAllowShrinkY(): Boolean = js.native
    def updateLayoutProperties(props: IMap = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MBlocker")
class MBlocker extends js.Object {
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _createBlocker(): qx.ui.core.Blocker = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    protected def initBlockerColor(value: any): String = js.native
    protected def initBlockerOpacity(value: any): Long = js.native
    def isBlocked(): Boolean = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def setBlockerColor(value: any): String = js.native
    def setBlockerOpacity(value: any): Long = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MChildrenHandling")
class MChildrenHandling extends js.Object {
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MContentPadding")
class MContentPadding extends js.Object {
    protected def _applyContentPadding(value: Int, old: Int): Unit = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    protected def initContentPaddingBottom(value: any): Int = js.native
    protected def initContentPaddingLeft(value: any): Int = js.native
    protected def initContentPaddingRight(value: any): Int = js.native
    protected def initContentPaddingTop(value: any): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MDragDropScrolling")
class MDragDropScrolling extends js.Object {
    constructor ();
    protected def _calculateScrollAmount(scrollbarSize: Long, exceedanceAmount: Long): Long = js.native
    protected def _calculateThresholdExceedance(diff: Long, threshold: Long): Long = js.native
    protected def _findScrollableParent(widget: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    protected def _getAxis(edgeType: String): String = js.native
    protected def _getBounds(scrollable: qx.ui.core.Widget): IMap = js.native
    protected def _getEdgeType(diff: IMap, thresholdX: Long, thresholdY: Long): String = js.native
    protected def _getThresholdByEdgeType(edgeType: String): Long = js.native
    protected def _isScrollable(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isScrollbarExceedingMaxPos(scrollbar: qx.ui.core.scroll.IScrollBar, axis: String, amount: Long): Boolean = js.native
    protected def _isScrollbarVisible(scrollable: qx.ui.core.Widget, axis: String): Boolean = js.native
    protected def _scrollBy(scrollable: qx.ui.core.Widget, axis: String, exceedanceAmount: Long): Unit = js.native
    def getDragScrollSlowDownFactor(): Float = js.native
    def getDragScrollThresholdX(): Int = js.native
    def getDragScrollThresholdY(): Int = js.native
    protected def initDragScrollSlowDownFactor(value: any): Float = js.native
    protected def initDragScrollThresholdX(value: any): Int = js.native
    protected def initDragScrollThresholdY(value: any): Int = js.native
    def resetDragScrollSlowDownFactor(): Unit = js.native
    def resetDragScrollThresholdX(): Unit = js.native
    def resetDragScrollThresholdY(): Unit = js.native
    def setDragScrollSlowDownFactor(value: any): Float = js.native
    def setDragScrollThresholdX(value: any): Int = js.native
    def setDragScrollThresholdY(value: any): Int = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MExecutable")
class MExecutable extends js.Object {
    protected def _applyCommand(value: qx.ui.command.Command, old: qx.ui.command.Command): Unit = js.native
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    protected def initCommand(value: any): qx.ui.command.Command = js.native
    def resetCommand(): Unit = js.native
    def setCommand(value: any): qx.ui.command.Command = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MLayoutHandling")
class MLayoutHandling extends js.Object {
    static def remap(members: IMap): Unit = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMovable")
class MMovable extends js.Object {
    protected def _activateMoveHandle(widget: qx.ui.core.Widget): Unit = js.native
    protected def _onMovePointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onMovePointerMove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onMovePointerUp(e: qx.event.type.Pointer): Unit = js.native
    protected def _onMoveRoll(e: qx.event.type.Roll): Unit = js.native
    def getMovable(): Boolean = js.native
    def getUseMoveFrame(): Boolean = js.native
    protected def initMovable(value: any): Boolean = js.native
    protected def initUseMoveFrame(value: any): Boolean = js.native
    def isMovable(): Boolean = js.native
    def isUseMoveFrame(): Boolean = js.native
    def resetMovable(): Unit = js.native
    def resetUseMoveFrame(): Unit = js.native
    def setMovable(value: any): Boolean = js.native
    def setUseMoveFrame(value: any): Boolean = js.native
    def toggleMovable(): Boolean = js.native
    def toggleUseMoveFrame(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMultiSelectionHandling")
class MMultiSelectionHandling extends js.Object {
    constructor ();
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelectionMode(value: any, old: any): Unit = js.native
    protected def _getLeadItem(): qx.ui.core.Widget = js.native
    protected def _getManager(): qx.ui.core.selection.Abstract = js.native
    protected def _onSelectionChange(e: qx.event.type.Data): Unit = js.native
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def getSelectionContext(): String = js.native
    def getSelectionMode(): any = js.native
    def getSortedSelection(): qx.ui.core.Widget[] = js.native
    protected def initDragSelection(value: any): Boolean = js.native
    protected def initQuickSelection(value: any): Boolean = js.native
    protected def initSelectionMode(value: any): any = js.native
    def invertSelection(): Unit = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectRange(begin: qx.ui.core.Widget, end: qx.ui.core.Widget): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MNativeOverflow")
class MNativeOverflow extends js.Object {
    protected def _applyOverflowX(value: any, old: any): Unit = js.native
    protected def _applyOverflowY(value: any, old: any): Unit = js.native
    def getOverflowX(): any = js.native
    def getOverflowY(): any = js.native
    protected def initOverflowX(value: any): any = js.native
    protected def initOverflowY(value: any): any = js.native
    def resetOverflow(): Unit = js.native
    def resetOverflowX(): Unit = js.native
    def resetOverflowY(): Unit = js.native
    def setOverflow(overflowX: any, overflowY: any): Unit = js.native
    def setOverflowX(value: any): any = js.native
    def setOverflowY(value: any): any = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MPlacement")
class MPlacement extends js.Object {
    static def getMoveDirection(): String = js.native
    static def getVisibleElement(): qx.ui.core.Widget = js.native
    static def setMoveDirection(direction: String): Unit = js.native
    static def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native
    protected def _getPlacementOffsets(): IMap = js.native
    protected def _place(coords: IMap): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): IMap = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): any = js.native
    def getPlacementModeY(): any = js.native
    def getPlaceMethod(): any = js.native
    def getPosition(): any = js.native
    protected def initDomMove(value: any): Boolean = js.native
    protected def initOffsetBottom(value: any): Int = js.native
    protected def initOffsetLeft(value: any): Int = js.native
    protected def initOffsetRight(value: any): Int = js.native
    protected def initOffsetTop(value: any): Int = js.native
    protected def initPlacementModeX(value: any): any = js.native
    protected def initPlacementModeY(value: any): any = js.native
    protected def initPlaceMethod(value: any): any = js.native
    protected def initPosition(value: any): any = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: IMap): Unit = js.native
    def placeToPointer(event: qx.event.type.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: any): Boolean = js.native
    def setOffset(offsetTop: any, offsetRight: any, offsetBottom: any, offsetLeft: any): Unit = js.native
    def setOffsetBottom(value: any): Int = js.native
    def setOffsetLeft(value: any): Int = js.native
    def setOffsetRight(value: any): Int = js.native
    def setOffsetTop(value: any): Int = js.native
    def setPlacementModeX(value: any): any = js.native
    def setPlacementModeY(value: any): any = js.native
    def setPlaceMethod(value: any): any = js.native
    def setPosition(value: any): any = js.native
    def toggleDomMove(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteChildrenHandling")
class MRemoteChildrenHandling extends js.Object {
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteLayoutHandling")
class MRemoteLayoutHandling extends js.Object {
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MResizable")
class MResizable extends js.Object {
    constructor ();
    protected def _getResizeFrame(): qx.ui.core.Widget = js.native
    def getResizableBottom(): Boolean = js.native
    def getResizableLeft(): Boolean = js.native
    def getResizableRight(): Boolean = js.native
    def getResizableTop(): Boolean = js.native
    def getResizeSensitivity(): Int = js.native
    def getUseResizeFrame(): Boolean = js.native
    protected def initResizableBottom(value: any): Boolean = js.native
    protected def initResizableLeft(value: any): Boolean = js.native
    protected def initResizableRight(value: any): Boolean = js.native
    protected def initResizableTop(value: any): Boolean = js.native
    protected def initResizeSensitivity(value: any): Int = js.native
    protected def initUseResizeFrame(value: any): Boolean = js.native
    def isResizableBottom(): Boolean = js.native
    def isResizableLeft(): Boolean = js.native
    def isResizableRight(): Boolean = js.native
    def isResizableTop(): Boolean = js.native
    def isUseResizeFrame(): Boolean = js.native
    def resetResizable(): Unit = js.native
    def resetResizableBottom(): Unit = js.native
    def resetResizableLeft(): Unit = js.native
    def resetResizableRight(): Unit = js.native
    def resetResizableTop(): Unit = js.native
    def resetResizeSensitivity(): Unit = js.native
    def resetUseResizeFrame(): Unit = js.native
    def setResizable(resizableTop: any, resizableRight: any, resizableBottom: any, resizableLeft: any): Unit = js.native
    def setResizableBottom(value: any): Boolean = js.native
    def setResizableLeft(value: any): Boolean = js.native
    def setResizableRight(value: any): Boolean = js.native
    def setResizableTop(value: any): Boolean = js.native
    def setResizeSensitivity(value: any): Int = js.native
    def setUseResizeFrame(value: any): Boolean = js.native
    def toggleResizableBottom(): Boolean = js.native
    def toggleResizableLeft(): Boolean = js.native
    def toggleResizableRight(): Boolean = js.native
    def toggleResizableTop(): Boolean = js.native
    def toggleUseResizeFrame(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MSingleSelectionHandling")
class MSingleSelectionHandling extends js.Object {
    protected def _onChangeSelected(e: qx.event.type.Data): Unit = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.SingleSelectionManager")
class SingleSelectionManager extends qx.core.Object {
    constructor (selectionProvider: qx.ui.core.ISingleSelectionProvider = ???);
    def getAllowEmptySelection(): Boolean = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelected(): qx.ui.core.Widget = js.native
    protected def initAllowEmptySelection(value: any): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetSelected(): Unit = js.native
    def setAllowEmptySelection(value: any): Boolean = js.native
    def setSelected(item: qx.ui.core.Widget): Unit = js.native
    def toggleAllowEmptySelection(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Spacer")
class Spacer extends qx.ui.core.LayoutItem {
    constructor (width: Int = ???, height: Int = ???);
    def addChildrenToQueue(queue: IMap): Unit = js.native
    def checkAppearanceNeeds(): Unit = js.native
    def destroy(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Widget")
class Widget extends qx.ui.core.LayoutItem {
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    constructor ();
    static def contains(parent: qx.ui.core.Widget, child: qx.ui.core.Widget): Boolean = js.native
    static def getWidgetByElement(element: HTMLElement, considerAnonymousState: Boolean = ???): qx.ui.core.Widget = js.native
    protected def _add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    protected def _addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    protected def _addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    protected def _addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    protected def _afterAddChild(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _afterRemoveChild(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _applyAnonymous(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyAppearance(value: String, old: String): Unit = js.native
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _applyContextMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyCursor(value: String, old: String): Unit = js.native
    protected def _applyDecorator(value: qx.ui.decoration.Decorator, old: qx.ui.decoration.Decorator): Unit = js.native
    protected def _applyDraggable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyDroppable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFocusable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFont(value: String, old: String): Unit = js.native
    protected def _applyKeepActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyKeepFocus(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyNativeContextMenu(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpacity(value: Long, old: Long): Unit = js.native
    protected def _applyPadding(value: Int, old: Int): Unit = js.native
    protected def _applySelectable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTabIndex(value: Int, old: Int): Unit = js.native
    protected def _applyTextColor(value: String, old: String): Unit = js.native
    protected def _applyToolTipText(value: String, old: String): Unit = js.native
    protected def _applyVisibility(value: any, old: any): Unit = js.native
    protected def _applyZIndex(value: Int, old: Int): Unit = js.native
    protected def _createChildControl(id: String): qx.ui.core.Widget = js.native
    protected def _createChildControlImpl(id: String, hash: String = ???): qx.ui.core.Widget = js.native
    protected def _createContentElement(): qx.html.Element = js.native
    protected def _disposeChildControls(): Unit = js.native
    protected def _excludeChildControl(id: String): Unit = js.native
    protected def _findTopControl(): qx.ui.core.Widget = js.native
    protected def _getChildren(): qx.ui.core.LayoutItem[] = js.native
    protected def _getContentHeightForWidth(width: Int): Int = js.native
    protected def _getContentHint(): IMap = js.native
    protected def _getCreatedChildControls(): IMap = js.native
    protected def _getDragDropCursor(): qx.ui.core.DragDropCursor = js.native
    protected def _hasChildren(): Boolean = js.native
    protected def _indexOf(child: qx.ui.core.Widget): Int = js.native
    protected def _isChildControlVisible(id: String): Boolean = js.native
    protected def _onBeforeContextMenuOpen(e: qx.event.type.Data): Unit = js.native
    protected def _onContextMenuOpen(e: qx.event.type.Pointer): Unit = js.native
    protected def _onDrag(e: qx.event.type.Drag): Unit = js.native
    protected def _onDragChange(e: qx.event.type.Drag): Unit = js.native
    protected def _onDragEnd(e: qx.event.type.Drag): Unit = js.native
    protected def _onDragStart(e: qx.event.type.Drag): Unit = js.native
    protected def _onStopEvent(e: qx.event.type.Event): Unit = js.native
    protected def _releaseChildControl(id: String): qx.ui.core.Widget = js.native
    protected def _remove(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _removeAll(): qx.data.Array = js.native
    protected def _removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    protected def _setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    protected def _showChildControl(id: String): qx.ui.core.Widget = js.native
    def activate(): Unit = js.native
    def addChildrenToQueue(queue: qx.data.Array): Unit = js.native
    def addState(state: String): Unit = js.native
    def blur(): Unit = js.native
    def capture(capture: Boolean = ???): Unit = js.native
    def checkAppearanceNeeds(): Unit = js.native
    def deactivate(): Unit = js.native
    def destroy(): Unit = js.native
    def exclude(): Unit = js.native
    def fadeIn(duration: Long): qx.bom.element.AnimationHandle = js.native
    def fadeOut(duration: Long): qx.bom.element.AnimationHandle = js.native
    def focus(): Unit = js.native
    def getAnonymous(): Boolean = js.native
    def getAppearance(): String = js.native
    def getBackgroundColor(): String = js.native
    def getBlockToolTip(): Boolean = js.native
    def getChildControl(id: String, notcreate: Boolean = ???): qx.ui.core.Widget = js.native
    def getChildrenContainer(): qx.ui.core.Widget = js.native
    def getContentElement(): qx.html.Element = js.native
    def getContentLocation(mode: String = ???): IMap = js.native
    def getContextMenu(): qx.ui.menu.Menu = js.native
    def getCursor(): String = js.native
    def getDecorator(): qx.ui.decoration.Decorator = js.native
    def getDraggable(): Boolean = js.native
    def getDroppable(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getEventTarget(): qx.ui.core.Widget = js.native
    def getFocusable(): Boolean = js.native
    def getFocusElement(): qx.html.Element = js.native
    def getFocusTarget(): qx.ui.core.Widget = js.native
    def getFont(): String = js.native
    def getInnerSize(): IMap = js.native
    def getInsets(): IMap = js.native
    def getKeepActive(): Boolean = js.native
    def getKeepFocus(): Boolean = js.native
    def getLayoutChildren(): qx.ui.core.Widget[] = js.native
    def getNativeContextMenu(): Boolean = js.native
    def getOpacity(): Long = js.native
    def getPaddingBottom(): Int = js.native
    def getPaddingLeft(): Int = js.native
    def getPaddingRight(): Int = js.native
    def getPaddingTop(): Int = js.native
    def getSelectable(): Boolean = js.native
    def getShowToolTipWhenDisabled(): Boolean = js.native
    def getTabIndex(): Int = js.native
    def getTextColor(): String = js.native
    def getToolTip(): qx.ui.tooltip.ToolTip = js.native
    def getToolTipIcon(): String = js.native
    def getToolTipText(): String = js.native
    def getVisibility(): any = js.native
    def getZIndex(): Int = js.native
    def hasChildControl(id: String): Boolean = js.native
    def hasLayoutChildren(): Boolean = js.native
    def hasState(state: String): Boolean = js.native
    def hide(): Unit = js.native
    protected def initAnonymous(value: any): Boolean = js.native
    protected def initAppearance(value: any): String = js.native
    protected def initBackgroundColor(value: any): String = js.native
    protected def initBlockToolTip(value: any): Boolean = js.native
    protected def initContextMenu(value: any): qx.ui.menu.Menu = js.native
    protected def initCursor(value: any): String = js.native
    protected def initDecorator(value: any): qx.ui.decoration.Decorator = js.native
    protected def initDraggable(value: any): Boolean = js.native
    protected def initDroppable(value: any): Boolean = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initFocusable(value: any): Boolean = js.native
    protected def initFont(value: any): String = js.native
    protected def initKeepActive(value: any): Boolean = js.native
    protected def initKeepFocus(value: any): Boolean = js.native
    protected def initNativeContextMenu(value: any): Boolean = js.native
    protected def initOpacity(value: any): Long = js.native
    protected def initPaddingBottom(value: any): Int = js.native
    protected def initPaddingLeft(value: any): Int = js.native
    protected def initPaddingRight(value: any): Int = js.native
    protected def initPaddingTop(value: any): Int = js.native
    protected def initSelectable(value: any): Boolean = js.native
    protected def initShowToolTipWhenDisabled(value: any): Boolean = js.native
    protected def initTabIndex(value: any): Int = js.native
    protected def initTextColor(value: any): String = js.native
    protected def initToolTip(value: any): qx.ui.tooltip.ToolTip = js.native
    protected def initToolTipIcon(value: any): String = js.native
    protected def initToolTipText(value: any): String = js.native
    protected def initVisibility(value: any): any = js.native
    protected def initZIndex(value: any): Int = js.native
    def invalidateLayoutChildren(): Unit = js.native
    def isAnonymous(): Boolean = js.native
    def isBlockToolTip(): Boolean = js.native
    def isCapturing(): Boolean = js.native
    def isDraggable(): Boolean = js.native
    def isDroppable(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def isFocusable(): Boolean = js.native
    def isHidden(): Boolean = js.native
    def isKeepActive(): Boolean = js.native
    def isKeepFocus(): Boolean = js.native
    def isNativeContextMenu(): Boolean = js.native
    def isSeeable(): Boolean = js.native
    def isSelectable(): Boolean = js.native
    def isShowToolTipWhenDisabled(): Boolean = js.native
    def isTabable(): Boolean = js.native
    def isVisible(): Boolean = js.native
    def releaseCapture(): Unit = js.native
    def removeState(state: String): Unit = js.native
    def replaceState(old: String, value: String): Unit = js.native
    def resetAnonymous(): Unit = js.native
    def resetAppearance(): Unit = js.native
    def resetBackgroundColor(): Unit = js.native
    def resetBlockToolTip(): Unit = js.native
    def resetContextMenu(): Unit = js.native
    def resetCursor(): Unit = js.native
    def resetDecorator(): Unit = js.native
    def resetDraggable(): Unit = js.native
    def resetDroppable(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetFocusable(): Unit = js.native
    def resetFont(): Unit = js.native
    def resetKeepActive(): Unit = js.native
    def resetKeepFocus(): Unit = js.native
    def resetNativeContextMenu(): Unit = js.native
    def resetOpacity(): Unit = js.native
    def resetPadding(): Unit = js.native
    def resetPaddingBottom(): Unit = js.native
    def resetPaddingLeft(): Unit = js.native
    def resetPaddingRight(): Unit = js.native
    def resetPaddingTop(): Unit = js.native
    def resetSelectable(): Unit = js.native
    def resetShowToolTipWhenDisabled(): Unit = js.native
    def resetTabIndex(): Unit = js.native
    def resetTextColor(): Unit = js.native
    def resetToolTip(): Unit = js.native
    def resetToolTipIcon(): Unit = js.native
    def resetToolTipText(): Unit = js.native
    def resetVisibility(): Unit = js.native
    def resetZIndex(): Unit = js.native
    def scrollChildIntoView(child: qx.ui.core.Widget, alignX: String = ???, alignY: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewX(child: qx.ui.core.Widget, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewY(child: qx.ui.core.Widget, align: String = ???, direct: Boolean = ???): Unit = js.native
    def setAnonymous(value: any): Boolean = js.native
    def setAppearance(value: any): String = js.native
    def setBackgroundColor(value: any): String = js.native
    def setBlockToolTip(value: any): Boolean = js.native
    def setContextMenu(value: any): qx.ui.menu.Menu = js.native
    def setCursor(value: any): String = js.native
    def setDecorator(value: any): qx.ui.decoration.Decorator = js.native
    def setDomLeft(value: Int): Unit = js.native
    def setDomPosition(left: Int, top: Int): Unit = js.native
    def setDomTop(value: Int): Unit = js.native
    def setDraggable(value: any): Boolean = js.native
    def setDroppable(value: any): Boolean = js.native
    def setEnabled(value: any): Boolean = js.native
    def setFocusable(value: any): Boolean = js.native
    def setFont(value: any): String = js.native
    def setKeepActive(value: any): Boolean = js.native
    def setKeepFocus(value: any): Boolean = js.native
    def setNativeContextMenu(value: any): Boolean = js.native
    def setOpacity(value: any): Long = js.native
    def setPadding(paddingTop: any, paddingRight: any, paddingBottom: any, paddingLeft: any): Unit = js.native
    def setPaddingBottom(value: any): Int = js.native
    def setPaddingLeft(value: any): Int = js.native
    def setPaddingRight(value: any): Int = js.native
    def setPaddingTop(value: any): Int = js.native
    def setSelectable(value: any): Boolean = js.native
    def setShowToolTipWhenDisabled(value: any): Boolean = js.native
    def setTabIndex(value: any): Int = js.native
    def setTextColor(value: any): String = js.native
    def setToolTip(value: any): qx.ui.tooltip.ToolTip = js.native
    def setToolTipIcon(value: any): String = js.native
    def setToolTipText(value: any): String = js.native
    def setVisibility(value: any): any = js.native
    def setZIndex(value: any): Int = js.native
    def show(): Unit = js.native
    def syncAppearance(): Unit = js.native
    def syncWidget(jobs: IMap): Unit = js.native
    def tabFocus(): Unit = js.native
    def toggleAnonymous(): Boolean = js.native
    def toggleBlockToolTip(): Boolean = js.native
    def toggleDraggable(): Boolean = js.native
    def toggleDroppable(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native
    def toggleFocusable(): Boolean = js.native
    def toggleKeepActive(): Boolean = js.native
    def toggleKeepFocus(): Boolean = js.native
    def toggleNativeContextMenu(): Boolean = js.native
    def toggleSelectable(): Boolean = js.native
    def toggleShowToolTipWhenDisabled(): Boolean = js.native
    def updateAppearance(): Unit = js.native
    def visualizeBlur(): Unit = js.native
    def visualizeFocus(): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Appearance")
class Appearance extends js.Object {
    static def add(widget: qx.ui.core.Widget): Unit = js.native
    static def flush(): Unit = js.native
    static def has(widget: qx.ui.core.Widget): Boolean = js.native
    static def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Dispose")
class Dispose extends js.Object {
    static def add(widget: qx.ui.core.Widget): Unit = js.native
    static def flush(): Unit = js.native
    static def isEmpty(): Boolean = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Layout")
class Layout extends js.Object {
    static def add(widget: qx.ui.core.Widget): Unit = js.native
    static def flush(): Unit = js.native
    static def getNestingLevel(widget: qx.ui.core.Widget): Int = js.native
    static def isScheduled(widget: qx.ui.core.Widget): Boolean = js.native
    static def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Manager")
class Manager extends js.Object {
    static def flush(): Unit = js.native
    static def scheduleFlush(job: String): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Visibility")
class Visibility extends js.Object {
    static def add(widget: qx.ui.core.Widget): Unit = js.native
    static def flush(): Unit = js.native
    static def isVisible(widget: qx.ui.core.Widget): Boolean = js.native
    static def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Widget")
class Widget extends js.Object {
    static def add(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native
    static def flush(): Unit = js.native
    static def remove(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.AbstractScrollArea")
class AbstractScrollArea extends qx.ui.core.Widget {
    def getDragScrollSlowDownFactor(): Float = js.native
    def getDragScrollThresholdX(): Int = js.native
    def getDragScrollThresholdY(): Int = js.native
    def resetDragScrollSlowDownFactor(): Unit = js.native
    def resetDragScrollThresholdX(): Unit = js.native
    def resetDragScrollThresholdY(): Unit = js.native
    def setDragScrollSlowDownFactor(value: any): Float = js.native
    def setDragScrollThresholdX(value: any): Int = js.native
    def setDragScrollThresholdY(value: any): Int = js.native
    constructor ();
    protected def _computeScrollbars(): Unit = js.native
    protected def _onChangeScrollbarXVisibility(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeScrollbarYVisibility(e: qx.event.type.Event): Unit = js.native
    protected def _onScrollAnimationEnd(direction: String): Unit = js.native
    protected def _onScrollBarX(e: qx.event.type.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.type.Data): Unit = js.native
    protected def _onScrollPaneX(e: qx.event.type.Data): Unit = js.native
    protected def _onScrollPaneY(e: qx.event.type.Data): Unit = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getPaneSize(): IMap = js.native
    def getScrollbarX(): any = js.native
    def getScrollbarY(): any = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    protected def initScrollbarX(value: any): any = js.native
    protected def initScrollbarY(value: any): any = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollByX(value: Int, duration: Long = ???): Unit = js.native
    def scrollByY(value: Int, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollbar(scrollbarX: any, scrollbarY: any): Unit = js.native
    def setScrollbarX(value: any): any = js.native
    def setScrollbarY(value: any): any = js.native
    def stopScrollAnimationX(): Unit = js.native
    def stopScrollAnimationY(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
trait IScrollBar extends js.Object {
    def getKnobFactor(): any = js.native
    def getMaximum(): any = js.native
    def getOrientation(): any = js.native
    def getPosition(): any = js.native
    protected def initKnobFactor(value: any): any = js.native
    protected def initMaximum(value: any): any = js.native
    protected def initOrientation(value: any): any = js.native
    protected def initPosition(value: any): any = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPosition(): Unit = js.native
    def scrollBy(offset: Int, duration: Long): Unit = js.native
    def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    def scrollTo(position: Int, duration: Long): Unit = js.native
    def setKnobFactor(value: any): any = js.native
    def setMaximum(value: any): any = js.native
    def setOrientation(value: any): any = js.native
    def setPosition(value: any): any = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MRoll")
class MRoll extends js.Object {
    protected def _addRollHandling(): Unit = js.native
    protected def _onPointerDownForRoll(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _removeRollHandling(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MScrollBarFactory")
class MScrollBarFactory extends js.Object {
    protected def _createScrollBar(orientation: String = ???): qx.ui.core.scroll.IScrollBar = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MWheelHandling")
class MWheelHandling extends js.Object {
    protected def _onMouseWheel(e: qx.event.type.Mouse): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.NativeScrollBar")
class NativeScrollBar extends qx.ui.core.Widget implements qx.ui.core.scroll.IScrollBar {
    def getKnobFactor(): any = js.native
    def getMaximum(): any = js.native
    def getOrientation(): any = js.native
    def getPosition(): any = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPosition(): Unit = js.native
    def scrollBy(offset: Int, duration: Long): Unit = js.native
    def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    def scrollTo(position: Int, duration: Long): Unit = js.native
    def setKnobFactor(value: any): any = js.native
    def setMaximum(value: any): any = js.native
    def setOrientation(value: any): any = js.native
    def setPosition(value: any): any = js.native
    constructor (orientation: String = ???);
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    protected def _applyPosition(value: Long, old: Long): Unit = js.native
    protected def _getScrollPaneElement(): qx.html.Element = js.native
    protected def _onAppear(e: qx.event.type.Data): Unit = js.native
    protected def _onScroll(e: qx.event.type.Event): Unit = js.native
    protected def _stopPropagation(e: qx.event.type.Event): Unit = js.native
    protected def _updateScrollBar(): Unit = js.native
    def getSingleStep(): Int = js.native
    protected def initSingleStep(value: any): Int = js.native
    def resetSingleStep(): Unit = js.native
    def setSingleStep(value: any): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollBar")
class ScrollBar extends qx.ui.core.Widget implements qx.ui.core.scroll.IScrollBar {
    def getKnobFactor(): any = js.native
    def getMaximum(): any = js.native
    def getOrientation(): any = js.native
    def getPosition(): any = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPosition(): Unit = js.native
    def scrollBy(offset: Int, duration: Long): Unit = js.native
    def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    def scrollTo(position: Int, duration: Long): Unit = js.native
    def setKnobFactor(value: any): any = js.native
    def setMaximum(value: any): any = js.native
    def setOrientation(value: any): any = js.native
    def setPosition(value: any): any = js.native
    constructor (orientation: String = ???);
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    protected def _applyPageStep(value: Int, old: Int): Unit = js.native
    protected def _applyPosition(value: any, old: any): Unit = js.native
    protected def _onChangeSliderValue(e: qx.event.type.Data): Unit = js.native
    protected def _onExecuteBegin(e: qx.event.type.Event): Unit = js.native
    protected def _onExecuteEnd(e: qx.event.type.Event): Unit = js.native
    protected def _onResizeSlider(e: qx.event.type.Data): Unit = js.native
    protected def _onSlideAnimationEnd(): Unit = js.native
    def getPageStep(): Int = js.native
    def getSingleStep(): Int = js.native
    protected def initPageStep(value: any): Int = js.native
    protected def initSingleStep(value: any): Int = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setPageStep(value: any): Int = js.native
    def setSingleStep(value: any): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollPane")
class ScrollPane extends qx.ui.core.Widget {
    constructor ();
    protected def _applyScrollX(value: any, old: any): Unit = js.native
    protected def _applyScrollY(value: any, old: any): Unit = js.native
    protected def _onAppear(e: qx.event.type.Event): Unit = js.native
    protected def _onScroll(e: qx.event.type.Event): Unit = js.native
    protected def _onUpdate(e: qx.event.type.Event): Unit = js.native
    def add(widget: qx.ui.core.Widget = ???): Unit = js.native
    def getChildren(): any[] = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): IMap = js.native
    def getScrollX(): any = js.native
    def getScrollY(): any = js.native
    protected def initScrollX(value: any): any = js.native
    protected def initScrollY(value: any): any = js.native
    def remove(widget: qx.ui.core.Widget = ???): Unit = js.native
    def resetScrollX(): Unit = js.native
    def resetScrollY(): Unit = js.native
    def scrollByX(x: Int = ???, duration: Long = ???): Unit = js.native
    def scrollByY(y: Int = ???, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollX(value: any): any = js.native
    def setScrollY(value: any): any = js.native
    def stopScrollAnimation(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollSlider")
class ScrollSlider extends qx.ui.form.Slider {
    constructor (orientation: js.Any = ???);

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Abstract")
class Abstract extends qx.core.Object {
    constructor ();
    protected def _addToSelection(item: any): Unit = js.native
    protected def _applyDefaultSelection(force: Boolean): any = js.native
    protected def _applyMode(value: any, old: any): Unit = js.native
    protected def _autoSelect(): Unit = js.native
    protected def _capture(): Unit = js.native
    protected def _cleanup(): Unit = js.native
    protected def _clearSelection(): Unit = js.native
    protected def _deselectItemRange(item1: any, item2: any): Unit = js.native
    protected def _fireChange(context: String): Unit = js.native
    protected def _getAnchorItem(): any = js.native
    protected def _getDimension(): IMap = js.native
    protected def _getFirstSelectable(): any = js.native
    protected def _getLastSelectable(): any = js.native
    protected def _getLocation(): IMap = js.native
    protected def _getPage(lead: any, up: Boolean = ???): Unit = js.native
    protected def _getRelatedSelectable(item: any, relation: String): any = js.native
    protected def _getScroll(): IMap = js.native
    protected def _getSelectableFromPointerEvent(event: qx.event.type.Pointer): any = js.native
    protected def _getSelectableLocationX(item: any): IMap = js.native
    protected def _getSelectableLocationY(item: any): IMap = js.native
    protected def _getSelectableRange(item1: any, item2: any): qx.data.Array = js.native
    protected def _getSelectedItem(): any = js.native
    protected def _isSelectable(item: any): Boolean = js.native
    protected def _onInterval(e: qx.event.type.Event): Unit = js.native
    protected def _releaseCapture(): Unit = js.native
    protected def _removeFromSelection(item: any): Unit = js.native
    protected def _replaceMultiSelection(items: qx.data.Array): Unit = js.native
    protected def _scrollBy(xoff: Int, yoff: Int): Unit = js.native
    protected def _scrollItemIntoView(item: any): Unit = js.native
    protected def _selectableToHashCode(item: any): String = js.native
    protected def _selectAllItems(): Unit = js.native
    protected def _selectItemRange(item1: any, item2: any, extend: Boolean = ???): Unit = js.native
    protected def _setAnchorItem(value: any): Unit = js.native
    protected def _setLeadItem(value: any): Unit = js.native
    protected def _setSelectedItem(item: any): Unit = js.native
    protected def _styleSelectable(item: any, type: String, enabled: Boolean): Unit = js.native
    protected def _toggleInSelection(item: any): Unit = js.native
    def addItem(item: any): Unit = js.native
    def clearSelection(): Unit = js.native
    def getDrag(): Boolean = js.native
    def getLeadItem(): any = js.native
    def getMode(): any = js.native
    def getQuick(): Boolean = js.native
    def getSelectables(all: Boolean): qx.data.Array = js.native
    def getSelectedItem(): any = js.native
    def getSelection(): any[] = js.native
    def getSelectionContext(): String = js.native
    def getSortedSelection(): any[] = js.native
    def handleAddItem(e: qx.event.type.Data): Unit = js.native
    def handleKeyPress(event: qx.event.type.KeySequence): Unit = js.native
    def handleLoseCapture(event: qx.event.type.Pointer): Unit = js.native
    def handlePointerDown(event: qx.event.type.Pointer): Unit = js.native
    def handlePointerMove(event: qx.event.type.Pointer): Unit = js.native
    def handlePointerOver(event: qx.event.type.Pointer): Unit = js.native
    def handleRemoveItem(e: qx.event.type.Data): Unit = js.native
    def handleTap(event: qx.event.type.Tap): Unit = js.native
    protected def initDrag(value: any): Boolean = js.native
    protected def initMode(value: any): any = js.native
    protected def initQuick(value: any): Boolean = js.native
    def invertSelection(): Unit = js.native
    def isDrag(): Boolean = js.native
    def isItemSelected(item: any): Boolean = js.native
    def isQuick(): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeItem(item: any): Unit = js.native
    def replaceSelection(items: qx.data.Array): Unit = js.native
    def resetDrag(): Unit = js.native
    def resetMode(): Unit = js.native
    def resetQuick(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectItem(item: any): Unit = js.native
    def selectItemRange(begin: any, end: any): Unit = js.native
    def setDrag(value: any): Boolean = js.native
    def setMode(value: any): any = js.native
    def setQuick(value: any): Boolean = js.native
    def toggleDrag(): Boolean = js.native
    def toggleQuick(): Boolean = js.native

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
    constructor (widget: qx.ui.core.Widget = ???);
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Abstract")
class Abstract extends qx.core.Object implements qx.ui.decoration.IDecorator {
    def getInsets(): IMap = js.native
    def getPadding(): IMap = js.native
    def getStyles(): IMap = js.native
    protected def _getDefaultInsets(): IMap = js.native
    protected def _isInitialized(): Boolean = js.native
    protected def _resetInsets(): Unit = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Decorator")
class Decorator extends qx.ui.decoration.Abstract implements qx.ui.decoration.IDecorator {
    def getInsets(): IMap = js.native
    def getPadding(): IMap = js.native
    def getStyles(): IMap = js.native
    def getBackgroundColor(): String = js.native
    def resetBackgroundColor(): Unit = js.native
    def setBackgroundColor(value: any): String = js.native
    def getRadiusBottomLeft(): Int = js.native
    def getRadiusBottomRight(): Int = js.native
    def getRadiusTopLeft(): Int = js.native
    def getRadiusTopRight(): Int = js.native
    def resetRadius(): Unit = js.native
    def resetRadiusBottomLeft(): Unit = js.native
    def resetRadiusBottomRight(): Unit = js.native
    def resetRadiusTopLeft(): Unit = js.native
    def resetRadiusTopRight(): Unit = js.native
    def setRadius(radiusTopLeft: any, radiusTopRight: any, radiusBottomRight: any, radiusBottomLeft: any): Unit = js.native
    def setRadiusBottomLeft(value: any): Int = js.native
    def setRadiusBottomRight(value: any): Int = js.native
    def setRadiusTopLeft(value: any): Int = js.native
    def setRadiusTopRight(value: any): Int = js.native
    def getInset(): Boolean = js.native
    def getShadowBlurRadius(): Int = js.native
    def getShadowColor(): String = js.native
    def getShadowHorizontalLength(): Int = js.native
    def getShadowSpreadRadius(): Int = js.native
    def getShadowVerticalLength(): Int = js.native
    def isInset(): Boolean = js.native
    def resetInset(): Unit = js.native
    def resetShadowBlurRadius(): Unit = js.native
    def resetShadowColor(): Unit = js.native
    def resetShadowHorizontalLength(): Unit = js.native
    def resetShadowLength(): Unit = js.native
    def resetShadowSpreadRadius(): Unit = js.native
    def resetShadowVerticalLength(): Unit = js.native
    def setInset(value: any): Boolean = js.native
    def setShadowBlurRadius(value: any): Int = js.native
    def setShadowColor(value: any): String = js.native
    def setShadowHorizontalLength(value: any): Int = js.native
    def setShadowLength(shadowHorizontalLength: any, shadowVerticalLength: any): Unit = js.native
    def setShadowSpreadRadius(value: any): Int = js.native
    def setShadowVerticalLength(value: any): Int = js.native
    def toggleInset(): Boolean = js.native
    def getInnerColorBottom(): String = js.native
    def getInnerColorLeft(): String = js.native
    def getInnerColorRight(): String = js.native
    def getInnerColorTop(): String = js.native
    def getInnerOpacity(): Long = js.native
    def getInnerWidthBottom(): Long = js.native
    def getInnerWidthLeft(): Long = js.native
    def getInnerWidthRight(): Long = js.native
    def getInnerWidthTop(): Long = js.native
    def resetInnerColor(): Unit = js.native
    def resetInnerColorBottom(): Unit = js.native
    def resetInnerColorLeft(): Unit = js.native
    def resetInnerColorRight(): Unit = js.native
    def resetInnerColorTop(): Unit = js.native
    def resetInnerOpacity(): Unit = js.native
    def resetInnerWidth(): Unit = js.native
    def resetInnerWidthBottom(): Unit = js.native
    def resetInnerWidthLeft(): Unit = js.native
    def resetInnerWidthRight(): Unit = js.native
    def resetInnerWidthTop(): Unit = js.native
    def setInnerColor(innerColorTop: any, innerColorRight: any, innerColorBottom: any, innerColorLeft: any): Unit = js.native
    def setInnerColorBottom(value: any): String = js.native
    def setInnerColorLeft(value: any): String = js.native
    def setInnerColorRight(value: any): String = js.native
    def setInnerColorTop(value: any): String = js.native
    def setInnerOpacity(value: any): Long = js.native
    def setInnerWidth(innerWidthTop: any, innerWidthRight: any, innerWidthBottom: any, innerWidthLeft: any): Unit = js.native
    def setInnerWidthBottom(value: any): Long = js.native
    def setInnerWidthLeft(value: any): Long = js.native
    def setInnerWidthRight(value: any): Long = js.native
    def setInnerWidthTop(value: any): Long = js.native
    def getColorPositionUnit(): any = js.native
    def getEndColor(): String = js.native
    def getEndColorPosition(): Long = js.native
    def getOrientation(): any = js.native
    def getStartColor(): String = js.native
    def getStartColorPosition(): Long = js.native
    def resetColorPositionUnit(): Unit = js.native
    def resetEndColor(): Unit = js.native
    def resetEndColorPosition(): Unit = js.native
    def resetGradientEnd(): Unit = js.native
    def resetGradientStart(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetStartColor(): Unit = js.native
    def resetStartColorPosition(): Unit = js.native
    def setColorPositionUnit(value: any): any = js.native
    def setEndColor(value: any): String = js.native
    def setEndColorPosition(value: any): Long = js.native
    def setGradientEnd(endColor: any, endColorPosition: any): Unit = js.native
    def setGradientStart(startColor: any, startColorPosition: any): Unit = js.native
    def setOrientation(value: any): any = js.native
    def setStartColor(value: any): String = js.native
    def setStartColorPosition(value: any): Long = js.native
    def getBorderImage(): String = js.native
    def getBorderImageMode(): any = js.native
    def getFill(): Boolean = js.native
    def getRepeatX(): any = js.native
    def getRepeatY(): any = js.native
    def getSliceBottom(): Int = js.native
    def getSliceLeft(): Int = js.native
    def getSliceRight(): Int = js.native
    def getSliceTop(): Int = js.native
    def isFill(): Boolean = js.native
    def resetBorderImage(): Unit = js.native
    def resetBorderImageMode(): Unit = js.native
    def resetFill(): Unit = js.native
    def resetRepeat(): Unit = js.native
    def resetRepeatX(): Unit = js.native
    def resetRepeatY(): Unit = js.native
    def resetSlice(): Unit = js.native
    def resetSliceBottom(): Unit = js.native
    def resetSliceLeft(): Unit = js.native
    def resetSliceRight(): Unit = js.native
    def resetSliceTop(): Unit = js.native
    def setBorderImage(value: any): String = js.native
    def setBorderImageMode(value: any): any = js.native
    def setFill(value: any): Boolean = js.native
    def setRepeat(repeatX: any, repeatY: any): Unit = js.native
    def setRepeatX(value: any): any = js.native
    def setRepeatY(value: any): any = js.native
    def setSlice(sliceTop: any, sliceRight: any, sliceBottom: any, sliceLeft: any): Unit = js.native
    def setSliceBottom(value: any): Int = js.native
    def setSliceLeft(value: any): Int = js.native
    def setSliceRight(value: any): Int = js.native
    def setSliceTop(value: any): Int = js.native
    def toggleFill(): Boolean = js.native
    protected def _getStyles(): IMap = js.native

}
}
package qx.ui.decoration {
@js.native
trait IDecorator extends js.Object {
    def getInsets(): IMap = js.native
    def getPadding(): IMap = js.native
    def getStyles(): IMap = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundColor")
class MBackgroundColor extends js.Object {
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _styleBackgroundColor(styles: IMap): Unit = js.native
    def getBackgroundColor(): String = js.native
    protected def initBackgroundColor(value: any): String = js.native
    def resetBackgroundColor(): Unit = js.native
    def setBackgroundColor(value: any): String = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundImage")
class MBackgroundImage extends js.Object {
    protected def _applyBackgroundImage(value: any, old: any): Unit = js.native
    protected def _applyBackgroundPosition(value: any, old: any): Unit = js.native
    protected def _styleBackgroundImage(styles: IMap): Unit = js.native
    def getBackgroundImage(): String = js.native
    def getBackgroundPositionX(): any = js.native
    def getBackgroundPositionY(): any = js.native
    def getBackgroundRepeat(): any = js.native
    protected def initBackgroundImage(value: any): String = js.native
    protected def initBackgroundPositionX(value: any): any = js.native
    protected def initBackgroundPositionY(value: any): any = js.native
    protected def initBackgroundRepeat(value: any): any = js.native
    def resetBackgroundImage(): Unit = js.native
    def resetBackgroundPosition(): Unit = js.native
    def resetBackgroundPositionX(): Unit = js.native
    def resetBackgroundPositionY(): Unit = js.native
    def resetBackgroundRepeat(): Unit = js.native
    def setBackgroundImage(value: any): String = js.native
    def setBackgroundPosition(backgroundPositionY: any, backgroundPositionX: any): Unit = js.native
    def setBackgroundPositionX(value: any): any = js.native
    def setBackgroundPositionY(value: any): any = js.native
    def setBackgroundRepeat(value: any): any = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderImage")
class MBorderImage extends js.Object {
    protected def _applyBorderImage(value: any, old: any): Unit = js.native
    protected def _getDefaultInsetsForBorderImage(): IMap = js.native
    protected def _styleBorderImage(styles: IMap): Unit = js.native
    def getBorderImage(): String = js.native
    def getBorderImageMode(): any = js.native
    def getFill(): Boolean = js.native
    def getRepeatX(): any = js.native
    def getRepeatY(): any = js.native
    def getSliceBottom(): Int = js.native
    def getSliceLeft(): Int = js.native
    def getSliceRight(): Int = js.native
    def getSliceTop(): Int = js.native
    protected def initBorderImage(value: any): String = js.native
    protected def initBorderImageMode(value: any): any = js.native
    protected def initFill(value: any): Boolean = js.native
    protected def initRepeatX(value: any): any = js.native
    protected def initRepeatY(value: any): any = js.native
    protected def initSliceBottom(value: any): Int = js.native
    protected def initSliceLeft(value: any): Int = js.native
    protected def initSliceRight(value: any): Int = js.native
    protected def initSliceTop(value: any): Int = js.native
    def isFill(): Boolean = js.native
    def resetBorderImage(): Unit = js.native
    def resetBorderImageMode(): Unit = js.native
    def resetFill(): Unit = js.native
    def resetRepeat(): Unit = js.native
    def resetRepeatX(): Unit = js.native
    def resetRepeatY(): Unit = js.native
    def resetSlice(): Unit = js.native
    def resetSliceBottom(): Unit = js.native
    def resetSliceLeft(): Unit = js.native
    def resetSliceRight(): Unit = js.native
    def resetSliceTop(): Unit = js.native
    def setBorderImage(value: any): String = js.native
    def setBorderImageMode(value: any): any = js.native
    def setFill(value: any): Boolean = js.native
    def setRepeat(repeatX: any, repeatY: any): Unit = js.native
    def setRepeatX(value: any): any = js.native
    def setRepeatY(value: any): any = js.native
    def setSlice(sliceTop: any, sliceRight: any, sliceBottom: any, sliceLeft: any): Unit = js.native
    def setSliceBottom(value: any): Int = js.native
    def setSliceLeft(value: any): Int = js.native
    def setSliceRight(value: any): Int = js.native
    def setSliceTop(value: any): Int = js.native
    def toggleFill(): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderRadius")
class MBorderRadius extends js.Object {
    protected def _applyBorderRadius(value: Int, old: Int): Unit = js.native
    protected def _styleBorderRadius(styles: IMap): Unit = js.native
    def getRadiusBottomLeft(): Int = js.native
    def getRadiusBottomRight(): Int = js.native
    def getRadiusTopLeft(): Int = js.native
    def getRadiusTopRight(): Int = js.native
    protected def initRadiusBottomLeft(value: any): Int = js.native
    protected def initRadiusBottomRight(value: any): Int = js.native
    protected def initRadiusTopLeft(value: any): Int = js.native
    protected def initRadiusTopRight(value: any): Int = js.native
    def resetRadius(): Unit = js.native
    def resetRadiusBottomLeft(): Unit = js.native
    def resetRadiusBottomRight(): Unit = js.native
    def resetRadiusTopLeft(): Unit = js.native
    def resetRadiusTopRight(): Unit = js.native
    def setRadius(radiusTopLeft: any, radiusTopRight: any, radiusBottomRight: any, radiusBottomLeft: any): Unit = js.native
    def setRadiusBottomLeft(value: any): Int = js.native
    def setRadiusBottomRight(value: any): Int = js.native
    def setRadiusTopLeft(value: any): Int = js.native
    def setRadiusTopRight(value: any): Int = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBoxShadow")
class MBoxShadow extends js.Object {
    protected def _applyBoxShadow(value: any, old: any): Unit = js.native
    protected def _styleBoxShadow(styles: IMap): Unit = js.native
    def getInset(): Boolean = js.native
    def getShadowBlurRadius(): Int = js.native
    def getShadowColor(): String = js.native
    def getShadowHorizontalLength(): Int = js.native
    def getShadowSpreadRadius(): Int = js.native
    def getShadowVerticalLength(): Int = js.native
    protected def initInset(value: any): Boolean = js.native
    protected def initShadowBlurRadius(value: any): Int = js.native
    protected def initShadowColor(value: any): String = js.native
    protected def initShadowHorizontalLength(value: any): Int = js.native
    protected def initShadowSpreadRadius(value: any): Int = js.native
    protected def initShadowVerticalLength(value: any): Int = js.native
    def isInset(): Boolean = js.native
    def resetInset(): Unit = js.native
    def resetShadowBlurRadius(): Unit = js.native
    def resetShadowColor(): Unit = js.native
    def resetShadowHorizontalLength(): Unit = js.native
    def resetShadowLength(): Unit = js.native
    def resetShadowSpreadRadius(): Unit = js.native
    def resetShadowVerticalLength(): Unit = js.native
    def setInset(value: any): Boolean = js.native
    def setShadowBlurRadius(value: any): Int = js.native
    def setShadowColor(value: any): String = js.native
    def setShadowHorizontalLength(value: any): Int = js.native
    def setShadowLength(shadowHorizontalLength: any, shadowVerticalLength: any): Unit = js.native
    def setShadowSpreadRadius(value: any): Int = js.native
    def setShadowVerticalLength(value: any): Int = js.native
    def toggleInset(): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MDoubleBorder")
class MDoubleBorder extends js.Object {
    def getColorBottom(): String = js.native
    def getColorLeft(): String = js.native
    def getColorRight(): String = js.native
    def getColorTop(): String = js.native
    def getStyleBottom(): any = js.native
    def getStyleLeft(): any = js.native
    def getStyleRight(): any = js.native
    def getStyleTop(): any = js.native
    def getWidthBottom(): Long = js.native
    def getWidthLeft(): Long = js.native
    def getWidthRight(): Long = js.native
    def getWidthTop(): Long = js.native
    def resetBottom(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetColorBottom(): Unit = js.native
    def resetColorLeft(): Unit = js.native
    def resetColorRight(): Unit = js.native
    def resetColorTop(): Unit = js.native
    def resetLeft(): Unit = js.native
    def resetRight(): Unit = js.native
    def resetStyle(): Unit = js.native
    def resetStyleBottom(): Unit = js.native
    def resetStyleLeft(): Unit = js.native
    def resetStyleRight(): Unit = js.native
    def resetStyleTop(): Unit = js.native
    def resetTop(): Unit = js.native
    def resetWidth(): Unit = js.native
    def resetWidthBottom(): Unit = js.native
    def resetWidthLeft(): Unit = js.native
    def resetWidthRight(): Unit = js.native
    def resetWidthTop(): Unit = js.native
    def setBottom(widthBottom: any, styleBottom: any, colorBottom: any): Unit = js.native
    def setColor(colorTop: any, colorRight: any, colorBottom: any, colorLeft: any): Unit = js.native
    def setColorBottom(value: any): String = js.native
    def setColorLeft(value: any): String = js.native
    def setColorRight(value: any): String = js.native
    def setColorTop(value: any): String = js.native
    def setLeft(widthLeft: any, styleLeft: any, colorLeft: any): Unit = js.native
    def setRight(widthRight: any, styleRight: any, colorRight: any): Unit = js.native
    def setStyle(styleTop: any, styleRight: any, styleBottom: any, styleLeft: any): Unit = js.native
    def setStyleBottom(value: any): any = js.native
    def setStyleLeft(value: any): any = js.native
    def setStyleRight(value: any): any = js.native
    def setStyleTop(value: any): any = js.native
    def setTop(widthTop: any, styleTop: any, colorTop: any): Unit = js.native
    def setWidth(widthTop: any, widthRight: any, widthBottom: any, widthLeft: any): Unit = js.native
    def setWidthBottom(value: any): Long = js.native
    def setWidthLeft(value: any): Long = js.native
    def setWidthRight(value: any): Long = js.native
    def setWidthTop(value: any): Long = js.native
    def getBackgroundImage(): String = js.native
    def getBackgroundPositionX(): any = js.native
    def getBackgroundPositionY(): any = js.native
    def getBackgroundRepeat(): any = js.native
    def resetBackgroundImage(): Unit = js.native
    def resetBackgroundPosition(): Unit = js.native
    def resetBackgroundPositionX(): Unit = js.native
    def resetBackgroundPositionY(): Unit = js.native
    def resetBackgroundRepeat(): Unit = js.native
    def setBackgroundImage(value: any): String = js.native
    def setBackgroundPosition(backgroundPositionY: any, backgroundPositionX: any): Unit = js.native
    def setBackgroundPositionX(value: any): any = js.native
    def setBackgroundPositionY(value: any): any = js.native
    def setBackgroundRepeat(value: any): any = js.native
    constructor ();
    protected def _applyDoubleBorder(value: any, old: any): Unit = js.native
    def getInnerColorBottom(): String = js.native
    def getInnerColorLeft(): String = js.native
    def getInnerColorRight(): String = js.native
    def getInnerColorTop(): String = js.native
    def getInnerOpacity(): Long = js.native
    def getInnerWidthBottom(): Long = js.native
    def getInnerWidthLeft(): Long = js.native
    def getInnerWidthRight(): Long = js.native
    def getInnerWidthTop(): Long = js.native
    protected def initInnerColorBottom(value: any): String = js.native
    protected def initInnerColorLeft(value: any): String = js.native
    protected def initInnerColorRight(value: any): String = js.native
    protected def initInnerColorTop(value: any): String = js.native
    protected def initInnerOpacity(value: any): Long = js.native
    protected def initInnerWidthBottom(value: any): Long = js.native
    protected def initInnerWidthLeft(value: any): Long = js.native
    protected def initInnerWidthRight(value: any): Long = js.native
    protected def initInnerWidthTop(value: any): Long = js.native
    def resetInnerColor(): Unit = js.native
    def resetInnerColorBottom(): Unit = js.native
    def resetInnerColorLeft(): Unit = js.native
    def resetInnerColorRight(): Unit = js.native
    def resetInnerColorTop(): Unit = js.native
    def resetInnerOpacity(): Unit = js.native
    def resetInnerWidth(): Unit = js.native
    def resetInnerWidthBottom(): Unit = js.native
    def resetInnerWidthLeft(): Unit = js.native
    def resetInnerWidthRight(): Unit = js.native
    def resetInnerWidthTop(): Unit = js.native
    def setInnerColor(innerColorTop: any, innerColorRight: any, innerColorBottom: any, innerColorLeft: any): Unit = js.native
    def setInnerColorBottom(value: any): String = js.native
    def setInnerColorLeft(value: any): String = js.native
    def setInnerColorRight(value: any): String = js.native
    def setInnerColorTop(value: any): String = js.native
    def setInnerOpacity(value: any): Long = js.native
    def setInnerWidth(innerWidthTop: any, innerWidthRight: any, innerWidthBottom: any, innerWidthLeft: any): Unit = js.native
    def setInnerWidthBottom(value: any): Long = js.native
    def setInnerWidthLeft(value: any): Long = js.native
    def setInnerWidthRight(value: any): Long = js.native
    def setInnerWidthTop(value: any): Long = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MLinearBackgroundGradient")
class MLinearBackgroundGradient extends js.Object {
    protected def _applyLinearBackgroundGradient(value: any, old: any): Unit = js.native
    protected def _styleLinearBackgroundGradient(styles: IMap): Unit = js.native
    def getColorPositionUnit(): any = js.native
    def getEndColor(): String = js.native
    def getEndColorPosition(): Long = js.native
    def getOrientation(): any = js.native
    def getStartColor(): String = js.native
    def getStartColorPosition(): Long = js.native
    protected def initColorPositionUnit(value: any): any = js.native
    protected def initEndColor(value: any): String = js.native
    protected def initEndColorPosition(value: any): Long = js.native
    protected def initOrientation(value: any): any = js.native
    protected def initStartColor(value: any): String = js.native
    protected def initStartColorPosition(value: any): Long = js.native
    def resetColorPositionUnit(): Unit = js.native
    def resetEndColor(): Unit = js.native
    def resetEndColorPosition(): Unit = js.native
    def resetGradientEnd(): Unit = js.native
    def resetGradientStart(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetStartColor(): Unit = js.native
    def resetStartColorPosition(): Unit = js.native
    def setColorPositionUnit(value: any): any = js.native
    def setEndColor(value: any): String = js.native
    def setEndColorPosition(value: any): Long = js.native
    def setGradientEnd(endColor: any, endColorPosition: any): Unit = js.native
    def setGradientStart(startColor: any, startColorPosition: any): Unit = js.native
    def setOrientation(value: any): any = js.native
    def setStartColor(value: any): String = js.native
    def setStartColorPosition(value: any): Long = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MSingleBorder")
class MSingleBorder extends js.Object {
    protected def _applyStyle(value: any, old: any): Unit = js.native
    protected def _applyWidth(value: Long, old: Long): Unit = js.native
    protected def _getDefaultInsetsForBorder(): IMap = js.native
    protected def _styleBorder(styles: IMap): Unit = js.native
    def getColorBottom(): String = js.native
    def getColorLeft(): String = js.native
    def getColorRight(): String = js.native
    def getColorTop(): String = js.native
    def getStyleBottom(): any = js.native
    def getStyleLeft(): any = js.native
    def getStyleRight(): any = js.native
    def getStyleTop(): any = js.native
    def getWidthBottom(): Long = js.native
    def getWidthLeft(): Long = js.native
    def getWidthRight(): Long = js.native
    def getWidthTop(): Long = js.native
    protected def initColorBottom(value: any): String = js.native
    protected def initColorLeft(value: any): String = js.native
    protected def initColorRight(value: any): String = js.native
    protected def initColorTop(value: any): String = js.native
    protected def initStyleBottom(value: any): any = js.native
    protected def initStyleLeft(value: any): any = js.native
    protected def initStyleRight(value: any): any = js.native
    protected def initStyleTop(value: any): any = js.native
    protected def initWidthBottom(value: any): Long = js.native
    protected def initWidthLeft(value: any): Long = js.native
    protected def initWidthRight(value: any): Long = js.native
    protected def initWidthTop(value: any): Long = js.native
    def resetBottom(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetColorBottom(): Unit = js.native
    def resetColorLeft(): Unit = js.native
    def resetColorRight(): Unit = js.native
    def resetColorTop(): Unit = js.native
    def resetLeft(): Unit = js.native
    def resetRight(): Unit = js.native
    def resetStyle(): Unit = js.native
    def resetStyleBottom(): Unit = js.native
    def resetStyleLeft(): Unit = js.native
    def resetStyleRight(): Unit = js.native
    def resetStyleTop(): Unit = js.native
    def resetTop(): Unit = js.native
    def resetWidth(): Unit = js.native
    def resetWidthBottom(): Unit = js.native
    def resetWidthLeft(): Unit = js.native
    def resetWidthRight(): Unit = js.native
    def resetWidthTop(): Unit = js.native
    def setBottom(widthBottom: any, styleBottom: any, colorBottom: any): Unit = js.native
    def setColor(colorTop: any, colorRight: any, colorBottom: any, colorLeft: any): Unit = js.native
    def setColorBottom(value: any): String = js.native
    def setColorLeft(value: any): String = js.native
    def setColorRight(value: any): String = js.native
    def setColorTop(value: any): String = js.native
    def setLeft(widthLeft: any, styleLeft: any, colorLeft: any): Unit = js.native
    def setRight(widthRight: any, styleRight: any, colorRight: any): Unit = js.native
    def setStyle(styleTop: any, styleRight: any, styleBottom: any, styleLeft: any): Unit = js.native
    def setStyleBottom(value: any): any = js.native
    def setStyleLeft(value: any): any = js.native
    def setStyleRight(value: any): any = js.native
    def setStyleTop(value: any): any = js.native
    def setTop(widthTop: any, styleTop: any, colorTop: any): Unit = js.native
    def setWidth(widthTop: any, widthRight: any, widthBottom: any, widthLeft: any): Unit = js.native
    def setWidthBottom(value: any): Long = js.native
    def setWidthLeft(value: any): Long = js.native
    def setWidthRight(value: any): Long = js.native
    def setWidthTop(value: any): Long = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.AbstractIframe")
class AbstractIframe extends qx.ui.core.Widget {
    constructor (source: String = ???);
    protected def _applyFrameName(value: String, old: String): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _getIframeElement(): qx.html.Iframe = js.native
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getFrameName(): String = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    protected def initFrameName(value: any): String = js.native
    protected def initSource(value: any): String = js.native
    def reload(): Unit = js.native
    def resetFrameName(): Unit = js.native
    def resetSource(): Unit = js.native
    def setFrameName(value: any): String = js.native
    def setSource(value: any): String = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Canvas")
class Canvas extends qx.ui.core.Widget {
    constructor (canvasWidth: Int = ???, canvasHeight: Int = ???);
    protected def _applyCanvasHeight(value: Int, old: Int): Unit = js.native
    protected def _applyCanvasWidth(value: Int, old: Int): Unit = js.native
    protected def _draw(width: Int, height: Int, context: CanvasRenderingContext2D): Unit = js.native
    protected def _onResize(e: qx.event.type.Data): Unit = js.native
    def getCanvasHeight(): Int = js.native
    def getCanvasWidth(): Int = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getSyncDimension(): Boolean = js.native
    protected def initCanvasHeight(value: any): Int = js.native
    protected def initCanvasWidth(value: any): Int = js.native
    protected def initSyncDimension(value: any): Boolean = js.native
    def isSyncDimension(): Boolean = js.native
    def resetCanvasHeight(): Unit = js.native
    def resetCanvasWidth(): Unit = js.native
    def resetSyncDimension(): Unit = js.native
    def setCanvasHeight(value: any): Int = js.native
    def setCanvasWidth(value: any): Int = js.native
    def setSyncDimension(value: any): Boolean = js.native
    def toggleSyncDimension(): Boolean = js.native
    def update(): Unit = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Flash")
class Flash extends qx.ui.core.Widget {
    constructor (source: String = ???, id: String = ???);
    protected def _applyAllowScriptAccess(value: any, old: any): Unit = js.native
    protected def _applyId(value: String, old: String): Unit = js.native
    protected def _applyLiveConnect(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyLoop(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMayScript(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMenu(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyPlay(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuality(value: any, old: any): Unit = js.native
    protected def _applyScale(value: any, old: any): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _applyVariables(value: IMap, old: IMap): Unit = js.native
    protected def _applyWmode(value: any, old: any): Unit = js.native
    protected def _checkLoading(): Unit = js.native
    def getAllowScriptAccess(): any = js.native
    def getFlashElement(): HTMLElement = js.native
    def getId(): String = js.native
    def getLiveConnect(): Boolean = js.native
    def getLoadTimeout(): Int = js.native
    def getLoop(): Boolean = js.native
    def getMayScript(): Boolean = js.native
    def getMenu(): Boolean = js.native
    def getPercentLoaded(): Int = js.native
    def getPlay(): Boolean = js.native
    def getQuality(): any = js.native
    def getScale(): any = js.native
    def getSource(): String = js.native
    def getVariables(): IMap = js.native
    def getWmode(): any = js.native
    protected def initAllowScriptAccess(value: any): any = js.native
    protected def initId(value: any): String = js.native
    protected def initLiveConnect(value: any): Boolean = js.native
    protected def initLoadTimeout(value: any): Int = js.native
    protected def initLoop(value: any): Boolean = js.native
    protected def initMayScript(value: any): Boolean = js.native
    protected def initMenu(value: any): Boolean = js.native
    protected def initPlay(value: any): Boolean = js.native
    protected def initQuality(value: any): any = js.native
    protected def initScale(value: any): any = js.native
    protected def initSource(value: any): String = js.native
    protected def initVariables(value: any): IMap = js.native
    protected def initWmode(value: any): any = js.native
    def isLiveConnect(): Boolean = js.native
    def isLoaded(): Boolean = js.native
    def isLoop(): Boolean = js.native
    def isMayScript(): Boolean = js.native
    def isMenu(): Boolean = js.native
    def isPlay(): Boolean = js.native
    def resetAllowScriptAccess(): Unit = js.native
    def resetId(): Unit = js.native
    def resetLiveConnect(): Unit = js.native
    def resetLoadTimeout(): Unit = js.native
    def resetLoop(): Unit = js.native
    def resetMayScript(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetPlay(): Unit = js.native
    def resetQuality(): Unit = js.native
    def resetScale(): Unit = js.native
    def resetSource(): Unit = js.native
    def resetVariables(): Unit = js.native
    def resetWmode(): Unit = js.native
    def setAllowScriptAccess(value: any): any = js.native
    def setId(value: any): String = js.native
    def setLiveConnect(value: any): Boolean = js.native
    def setLoadTimeout(value: any): Int = js.native
    def setLoop(value: any): Boolean = js.native
    def setMayScript(value: any): Boolean = js.native
    def setMenu(value: any): Boolean = js.native
    def setPlay(value: any): Boolean = js.native
    def setQuality(value: any): any = js.native
    def setScale(value: any): any = js.native
    def setSource(value: any): String = js.native
    def setVariables(value: any): IMap = js.native
    def setWmode(value: any): any = js.native
    def toggleLiveConnect(): Boolean = js.native
    def toggleLoop(): Boolean = js.native
    def toggleMayScript(): Boolean = js.native
    def toggleMenu(): Boolean = js.native
    def togglePlay(): Boolean = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Html")
class Html extends qx.ui.core.Widget {
    def getOverflowX(): any = js.native
    def getOverflowY(): any = js.native
    def resetOverflow(): Unit = js.native
    def resetOverflowX(): Unit = js.native
    def resetOverflowY(): Unit = js.native
    def setOverflow(overflowX: any, overflowY: any): Unit = js.native
    def setOverflowX(value: any): any = js.native
    def setOverflowY(value: any): any = js.native
    constructor (html: String = ???);
    protected def _applyCssClass(value: String, old: String): Unit = js.native
    protected def _applyHtml(value: String, old: String): Unit = js.native
    def getCssClass(): String = js.native
    def getHtml(): String = js.native
    protected def initCssClass(value: any): String = js.native
    protected def initHtml(value: any): String = js.native
    def resetCssClass(): Unit = js.native
    def resetHtml(): Unit = js.native
    def setCssClass(value: any): String = js.native
    def setHtml(value: any): String = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Iframe")
class Iframe extends qx.ui.embed.AbstractIframe {
    constructor (source: String = ???);
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollbar(value: any, old: any): Unit = js.native
    protected def _createBlockerElement(): any = js.native
    protected def _onIframeLoad(e: qx.event.type.Event): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.type.Mouse): Unit = js.native
    protected def _syncSourceAfterDOMMove(): Unit = js.native
    def block(): Unit = js.native
    def getNativeHelp(): Boolean = js.native
    def getScrollbar(): any = js.native
    protected def initNativeHelp(value: any): Boolean = js.native
    protected def initScrollbar(value: any): any = js.native
    def isNativeHelp(): Boolean = js.native
    def release(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def resetScrollbar(): Unit = js.native
    def setNativeHelp(value: any): Boolean = js.native
    def setScrollbar(value: any): any = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.ThemedIframe")
class ThemedIframe extends qx.ui.embed.AbstractIframe {
    constructor (source: js.Any = ???);
    protected def _addRollListener(): Unit = js.native
    protected def _configureScrollbar(scrollbarId: String, show: Boolean, containerSize: Int, contentSize: Int): Unit = js.native
    protected def _disableScollbars(): Unit = js.native
    protected def _getIframeSize(): any = js.native
    protected def _onIframeLoad(): Unit = js.native
    protected def _onIframeObserverInterval(): Unit = js.native
    protected def _onIframeResize(): Unit = js.native
    protected def _onScrollBarX(e: qx.event.type.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.type.Data): Unit = js.native
    protected def _preventIframeScrolling(): Unit = js.native
    protected def _startIframeObserver(): Unit = js.native
    protected def _stopIframeObserver(): Unit = js.native
    protected def _updateCornerWidget(): Unit = js.native
    protected def _updateScrollbars(): Unit = js.native
    def getScrollbarX(): any = js.native
    def getScrollbarY(): any = js.native
    protected def initScrollbarX(value: any): any = js.native
    protected def initScrollbarY(value: any): any = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollToX(x: Int): Unit = js.native
    def scrollToY(y: Int): Unit = js.native
    def setScrollbar(scrollbarX: any, scrollbarY: any): Unit = js.native
    def setScrollbarX(value: any): any = js.native
    def setScrollbarY(value: any): any = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractField")
class AbstractField extends qx.ui.core.Widget implements qx.ui.form.IStringForm,qx.ui.form.IForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (value: String = ???);
    protected def _applyMaxLength(value: Int, old: Int): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _applyReadOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: any, old: any): Unit = js.native
    protected def _createInputElement(): qx.html.Input = js.native
    protected def _getPlaceholderElement(): Unit = js.native
    protected def _getTextSize(): IMap = js.native
    protected def _onChangeContent(e: qx.event.type.Data): Unit = js.native
    protected def _onChangeLocale(e: qx.event.type.Event): Unit = js.native
    protected def _onHtmlInput(e: qx.event.type.Data): Unit = js.native
    protected def _onPointerDownPlaceholder(): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.type.Data): Unit = js.native
    protected def _removePlaceholder(): Unit = js.native
    protected def _renderContentElement(innerHeight: Int, element: HTMLElement): Unit = js.native
    protected def _showPlaceholder(): Unit = js.native
    protected def _syncPlaceholder(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getFilter(): js.RegExp = js.native
    def getLiveUpdate(): Boolean = js.native
    def getMaxLength(): Int = js.native
    def getPlaceholder(): String = js.native
    def getReadOnly(): Boolean = js.native
    def getTextAlign(): any = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionEnd(): Int = js.native
    def getTextSelectionLength(): Int = js.native
    def getTextSelectionStart(): Int = js.native
    protected def initFilter(value: any): js.RegExp = js.native
    protected def initLiveUpdate(value: any): Boolean = js.native
    protected def initMaxLength(value: any): Int = js.native
    protected def initPlaceholder(value: any): String = js.native
    protected def initReadOnly(value: any): Boolean = js.native
    protected def initTextAlign(value: any): any = js.native
    def isLiveUpdate(): Boolean = js.native
    def isReadOnly(): Boolean = js.native
    def resetFilter(): Unit = js.native
    def resetLiveUpdate(): Unit = js.native
    def resetMaxLength(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def resetReadOnly(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setFilter(value: any): js.RegExp = js.native
    def setLiveUpdate(value: any): Boolean = js.native
    def setMaxLength(value: any): Int = js.native
    def setPlaceholder(value: any): String = js.native
    def setReadOnly(value: any): Boolean = js.native
    def setTextAlign(value: any): any = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native
    def toggleLiveUpdate(): Boolean = js.native
    def toggleReadOnly(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractSelectBox")
class AbstractSelectBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor ();
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _defaultFormat(item: any): String = js.native
    protected def _onBlur(e: qx.event.type.Focus): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onListChangeSelection(e: qx.event.type.Data): Unit = js.native
    protected def _onListPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.type.Data): Unit = js.native
    protected def _onResize(e: qx.event.type.Data): Unit = js.native
    def close(): Unit = js.native
    def getFormat(): js.Function = js.native
    def getMaxListHeight(): Long = js.native
    protected def initFormat(value: any): js.Function = js.native
    protected def initMaxListHeight(value: any): Long = js.native
    def open(): Unit = js.native
    def resetFormat(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def setFormat(value: any): js.Function = js.native
    def setMaxListHeight(value: any): Long = js.native
    def toggle(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Button")
class Button extends qx.ui.basic.Atom implements qx.ui.form.IExecutable {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def resetCommand(): Unit = js.native
    constructor (label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???);
    protected def _onKeyDown(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerUp(e: qx.event.type.Event): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    def press(): Unit = js.native
    def release(): Unit = js.native
    def reset(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.CheckBox")
class CheckBox extends qx.ui.form.ToggleButton implements qx.ui.form.IForm,qx.ui.form.IModel {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (label: String = ???);

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ComboBox")
class ComboBox extends qx.ui.form.AbstractSelectBox implements qx.ui.form.IStringForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    constructor ();
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.type.Data): Unit = js.native
    protected def _setPreselectedItem(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initPlaceholder(value: any): String = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setPlaceholder(value: any): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.DateField")
class DateField extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.form.IDateForm {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getValue(): js.Date = js.native
    def resetValue(): Unit = js.native
    def setValue(value: js.Date): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor ();
    static def getDefaultDateFormatter(): qx.util.format.DateFormat = js.native
    protected def _addLocaleChangeListener(): Unit = js.native
    protected def _applyDateFormat(value: qx.util.format.DateFormat, old: qx.util.format.DateFormat): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onBlur(e: qx.event.type.Focus): Unit = js.native
    protected def _onChangeDate(e: qx.event.type.Pointer): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.type.Data): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.type.Data): Unit = js.native
    protected def _setDefaultDateFormat(): Unit = js.native
    def close(): Unit = js.native
    def getDateFormat(): qx.util.format.DateFormat = js.native
    def getPlaceholder(): String = js.native
    protected def initDateFormat(value: any): qx.util.format.DateFormat = js.native
    protected def initPlaceholder(value: any): String = js.native
    def isEmpty(): Boolean = js.native
    def open(): Unit = js.native
    def resetDateFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def setDateFormat(value: any): qx.util.format.DateFormat = js.native
    def setPlaceholder(value: any): String = js.native
    def toggle(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Form")
class Form extends qx.core.Object {
    constructor ();
    protected def _createResetter(): qx.ui.form.Resetter = js.native
    protected def _createValidationManager(): qx.ui.form.validation.Manager = js.native
    def add(item: qx.ui.form.IForm, label: String, validator: js.Function = ???, name: String = ???, validatorContext: any = ???, options: IMap = ???): Unit = js.native
    def addButton(button: qx.ui.form.Button, options: IMap = ???): Unit = js.native
    def addGroupHeader(title: String, options: IMap = ???): Unit = js.native
    def getButtonOptions(): qx.data.Array = js.native
    def getButtons(): qx.data.Array = js.native
    def getGroups(): qx.data.Array = js.native
    def getItems(): IMap = js.native
    def getValidationManager(): qx.ui.form.validation.Manager = js.native
    def redefineResetter(): Unit = js.native
    def redefineResetterItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.form.IForm): Boolean = js.native
    def removeButton(button: qx.ui.form.Button): Boolean = js.native
    def removeGroupHeader(title: String): Boolean = js.native
    def reset(): Unit = js.native
    def validate(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.HoverButton")
class HoverButton extends qx.ui.basic.Atom implements qx.ui.form.IExecutable {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def resetCommand(): Unit = js.native
    constructor (label: String = ???, icon: String = ???);
    protected def _onInterval(): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinTimer(): Int = js.native
    def getTimerDecrease(): Int = js.native
    protected def initFirstInterval(value: any): Int = js.native
    protected def initInterval(value: any): Int = js.native
    protected def initMinTimer(value: any): Int = js.native
    protected def initTimerDecrease(value: any): Int = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinTimer(): Unit = js.native
    def resetTimerDecrease(): Unit = js.native
    def setFirstInterval(value: any): Int = js.native
    def setInterval(value: any): Int = js.native
    def setMinTimer(value: any): Int = js.native
    def setTimerDecrease(value: any): Int = js.native

}
}
package qx.ui.form {
@js.native
trait IBooleanForm extends js.Object {
    def getValue(): Boolean = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IColorForm extends js.Object {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IDateForm extends js.Object {
    def getValue(): js.Date = js.native
    def resetValue(): Unit = js.native
    def setValue(value: js.Date): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IExecutable extends js.Object {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IForm extends js.Object {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IModel extends js.Object {
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IModelSelection extends js.Object {
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait INumberForm extends js.Object {
    def getValue(): Long = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IRadioItem extends js.Object {
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IRange extends js.Object {
    def getMaximum(): Long = js.native
    def getMinimum(): Long = js.native
    def getPageStep(): Long = js.native
    def getSingleStep(): Long = js.native
    def setMaximum(max: Long): Unit = js.native
    def setMinimum(min: Long): Unit = js.native
    def setPageStep(step: Long): Unit = js.native
    def setSingleStep(step: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IStringForm extends js.Object {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.List")
class List extends qx.ui.core.scroll.AbstractScrollArea implements qx.ui.core.IMultiSelection,qx.ui.form.IForm,qx.ui.form.IModelSelection {
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def selectAll(): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def getSelectionContext(): String = js.native
    def getSelectionMode(): any = js.native
    def getSortedSelection(): qx.ui.core.Widget[] = js.native
    def invertSelection(): Unit = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def selectRange(begin: qx.ui.core.Widget, end: qx.ui.core.Widget): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (horizontal: Boolean = ???);
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _createListItemContainer(): qx.ui.container.Composite = js.native
    protected def _onAddChild(e: qx.event.type.Data): Unit = js.native
    protected def _onKeyInput(e: qx.event.type.KeyInput): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Boolean = js.native
    protected def _onRemoveChild(e: qx.event.type.Data): Unit = js.native
    def findItem(search: String, ignoreCase: Boolean = ???): qx.ui.form.ListItem = js.native
    def findItemByLabelFuzzy(search: String): qx.ui.form.ListItem = js.native
    def getEnableInlineFind(): Boolean = js.native
    def getOrientation(): any = js.native
    def getSpacing(): Int = js.native
    def handleKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def initEnableInlineFind(value: any): Boolean = js.native
    protected def initOrientation(value: any): any = js.native
    protected def initSpacing(value: any): Int = js.native
    def isEnableInlineFind(): Boolean = js.native
    def resetEnableInlineFind(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setEnableInlineFind(value: any): Boolean = js.native
    def setOrientation(value: any): any = js.native
    def setSpacing(value: any): Int = js.native
    def toggleEnableInlineFind(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ListItem")
class ListItem extends qx.ui.basic.Atom implements qx.ui.form.IModel {
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    constructor (label: String = ???, icon: String = ???, model: String = ???);
    protected def _onPointerOut(): Unit = js.native
    protected def _onPointerOver(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MForm")
class MForm extends js.Object {
    constructor ();
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    protected def initInvalidMessage(value: any): String = js.native
    protected def initRequired(value: any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: any): String = js.native
    protected def initValid(value: any): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def setInvalidMessage(value: any): String = js.native
    def setRequired(value: any): Boolean = js.native
    def setRequiredInvalidMessage(value: any): String = js.native
    def setValid(value: any): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelProperty")
class MModelProperty extends js.Object {
    protected def _applyModel(value: any, old: any): Unit = js.native
    def getModel(): any = js.native
    protected def initModel(value: any): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): any = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelSelection")
class MModelSelection extends js.Object {
    constructor ();
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(modelSelection: qx.data.Array): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MenuButton")
class MenuButton extends qx.ui.form.Button {
    constructor (label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???);
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _onMenuChange(e: qx.event.type.Data): Unit = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    protected def initMenu(value: any): qx.ui.menu.Menu = js.native
    def open(selectFirst: Boolean = ???): Unit = js.native
    def resetMenu(): Unit = js.native
    def setMenu(value: any): qx.ui.menu.Menu = js.native

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
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def resetValue(): Unit = js.native
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (label: String = ???);
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def initGroup(value: any): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: any): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButtonGroup")
class RadioButtonGroup extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.core.ISingleSelection,qx.ui.form.IModelSelection {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native
    static def remap(members: IMap): Unit = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    constructor (layout: qx.ui.layout.Abstract = ???);
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def getRadioGroup(): qx.ui.form.RadioGroup = js.native
    protected def initInvalidMessage(value: any): String = js.native
    protected def initRequired(value: any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: any): String = js.native
    protected def initValid(value: any): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioGroup")
class RadioGroup extends qx.core.Object implements qx.ui.core.ISingleSelection,qx.ui.form.IForm,qx.ui.form.IModelSelection {
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native
    constructor (varargs: qx.core.Object = ???);
    protected def _applyAllowEmptySelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): qx.ui.form.IRadioItem[] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.form.IRadioItem): Boolean = js.native
    protected def _onItemChangeChecked(e: qx.event.type.Data): Unit = js.native
    def add(varargs: qx.ui.form.IRadioItem = ???): Unit = js.native
    def getAllowEmptySelection(): Boolean = js.native
    def getChildren(): qx.ui.form.IRadioItem[] = js.native
    def getItems(): qx.ui.form.IRadioItem[] = js.native
    def getWrap(): Boolean = js.native
    protected def initAllowEmptySelection(value: any): Boolean = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initInvalidMessage(value: any): String = js.native
    protected def initRequired(value: any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: any): String = js.native
    protected def initValid(value: any): Boolean = js.native
    protected def initWrap(value: any): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def remove(item: qx.ui.form.IRadioItem): Unit = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def resetWrap(): Unit = js.native
    def selectNext(): Unit = js.native
    def selectPrevious(): Unit = js.native
    def setAllowEmptySelection(value: any): Boolean = js.native
    def setWrap(value: any): Boolean = js.native
    def toggleAllowEmptySelection(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RepeatButton")
class RepeatButton extends qx.ui.form.Button {
    constructor (label: String = ???, icon: String = ???);
    protected def _onInterval(e: qx.event.type.Event): Unit = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinTimer(): Int = js.native
    def getTimerDecrease(): Int = js.native
    protected def initFirstInterval(value: any): Int = js.native
    protected def initInterval(value: any): Int = js.native
    protected def initMinTimer(value: any): Int = js.native
    protected def initTimerDecrease(value: any): Int = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinTimer(): Unit = js.native
    def resetTimerDecrease(): Unit = js.native
    def setFirstInterval(value: any): Int = js.native
    def setInterval(value: any): Int = js.native
    def setMinTimer(value: any): Int = js.native
    def setTimerDecrease(value: any): Int = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Resetter")
class Resetter extends qx.core.Object {
    constructor ();
    protected def _supportsValue(formItem: qx.core.Object): Boolean = js.native
    def add(item: qx.ui.core.Widget): Unit = js.native
    def redefine(): Unit = js.native
    def redefineItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.core.Widget): Boolean = js.native
    def reset(): Unit = js.native
    def resetItem(item: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SelectBox")
class SelectBox extends qx.ui.form.AbstractSelectBox implements qx.ui.core.ISingleSelection,qx.ui.form.IModelSelection {
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native
    constructor ();
    protected def _getItems(): qx.ui.form.ListItem[] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _onKeyInput(e: qx.event.type.KeyInput): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Slider")
class Slider extends qx.ui.core.Widget implements qx.ui.form.IForm,qx.ui.form.INumberForm,qx.ui.form.IRange {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getValue(): Long = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getMinimum(): Long = js.native
    def getPageStep(): Long = js.native
    def getSingleStep(): Long = js.native
    def setMaximum(max: Long): Unit = js.native
    def setMinimum(min: Long): Unit = js.native
    def setPageStep(step: Long): Unit = js.native
    def setSingleStep(step: Long): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (orientation: String = ???);
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyMinimum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    protected def _applyValue(value: any, old: any): Unit = js.native
    protected def _fireValue(): Unit = js.native
    protected def _onInterval(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onUpdate(e: qx.event.type.Data): Unit = js.native
    protected def _positionToValue(position: Int): Int = js.native
    protected def _setKnobPosition(position: Int): Unit = js.native
    protected def _updateKnobPosition(): Unit = js.native
    protected def _updateKnobSize(): Unit = js.native
    protected def _valueToPosition(value: Int): Int = js.native
    def getKnobFactor(): Long = js.native
    def getOrientation(): any = js.native
    protected def initKnobFactor(value: any): Long = js.native
    protected def initMaximum(value: any): Int = js.native
    protected def initMinimum(value: any): Int = js.native
    protected def initOrientation(value: any): any = js.native
    protected def initPageStep(value: any): Int = js.native
    protected def initSingleStep(value: any): Int = js.native
    protected def initValue(value: any): any = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setKnobFactor(value: any): Long = js.native
    def setOrientation(value: any): any = js.native
    def slideBack(): Unit = js.native
    def slideBy(offset: Int, duration: Long): Unit = js.native
    def slideForward(): Unit = js.native
    def slidePageBack(duration: Long): Unit = js.native
    def slidePageForward(duration: Long): Unit = js.native
    def slideTo(value: Int, duration: Long): Unit = js.native
    def slideToBegin(duration: Long): Unit = js.native
    def slideToEnd(duration: Long): Unit = js.native
    def stopSlideAnimation(): Unit = js.native
    def updatePosition(value: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Spinner")
class Spinner extends qx.ui.core.Widget implements qx.ui.form.INumberForm,qx.ui.form.IRange,qx.ui.form.IForm {
    def getValue(): Long = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getMinimum(): Long = js.native
    def getPageStep(): Long = js.native
    def getSingleStep(): Long = js.native
    def setMaximum(max: Long): Unit = js.native
    def setMinimum(min: Long): Unit = js.native
    def setPageStep(step: Long): Unit = js.native
    def setSingleStep(step: Long): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (min: Long = ???, value: Long = ???, max: Long = ???);
    protected def _applyEditable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMaximum(value: Long, old: Long): Unit = js.native
    protected def _applyMinimum(value: Long, old: Long): Unit = js.native
    protected def _applyNumberFormat(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Long, old: Long): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _checkValue(value: any): Boolean = js.native
    protected def _countDown(): Unit = js.native
    protected def _countUp(): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getFilterRegExp(): js.RegExp = js.native
    protected def _onChangeLocale(ev: qx.event.type.Event): Unit = js.native
    protected def _onChangeNumberFormat(ev: qx.event.type.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onTextChange(e: qx.event.type.Event): Unit = js.native
    protected def _updateButtons(): Unit = js.native
    def getEditable(): Boolean = js.native
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    def getWrap(): Boolean = js.native
    def gotoValue(value: Long): Long = js.native
    protected def initEditable(value: any): Boolean = js.native
    protected def initMaximum(value: any): Long = js.native
    protected def initMinimum(value: any): Long = js.native
    protected def initNumberFormat(value: any): qx.util.format.NumberFormat = js.native
    protected def initPageStep(value: any): Long = js.native
    protected def initSingleStep(value: any): Long = js.native
    protected def initValue(value: any): any = js.native
    protected def initWrap(value: any): Boolean = js.native
    def isEditable(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetEditable(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetNumberFormat(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setEditable(value: any): Boolean = js.native
    def setNumberFormat(value: any): qx.util.format.NumberFormat = js.native
    def setWrap(value: any): Boolean = js.native
    def toggleEditable(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SplitButton")
class SplitButton extends qx.ui.core.Widget implements qx.ui.form.IExecutable {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def resetCommand(): Unit = js.native
    constructor (label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???, command: qx.ui.command.Command = ???);
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShow(value: any, old: any): Unit = js.native
    protected def _onButtonExecute(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeMenuVisibility(e: qx.event.type.Data): Unit = js.native
    protected def _onKeyDown(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShow(): any = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initMenu(value: any): qx.ui.menu.Menu = js.native
    protected def initShow(value: any): any = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShow(): Unit = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setMenu(value: any): qx.ui.menu.Menu = js.native
    def setShow(value: any): any = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextArea")
class TextArea extends qx.ui.form.AbstractField {
    constructor (value: String = ???);
    protected def _applyAutoSize(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMinimalLineHeight(value: Int, old: Int): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _getAreaHeight(): Int = js.native
    protected def _getScrolledAreaHeight(): Int = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _setAreaHeight(height: Int): Unit = js.native
    def getAutoSize(): Boolean = js.native
    def getMinimalLineHeight(): Int = js.native
    def getSingleStep(): Int = js.native
    def getWrap(): Boolean = js.native
    protected def initAutoSize(value: any): Boolean = js.native
    protected def initMinimalLineHeight(value: any): Int = js.native
    protected def initSingleStep(value: any): Int = js.native
    protected def initWrap(value: any): Boolean = js.native
    def isAutoSize(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetAutoSize(): Unit = js.native
    def resetMinimalLineHeight(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setAutoSize(value: any): Boolean = js.native
    def setMinimalLineHeight(value: any): Int = js.native
    def setSingleStep(value: any): Int = js.native
    def setWrap(value: any): Boolean = js.native
    def toggleAutoSize(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextField")
class TextField extends qx.ui.form.AbstractField {
    protected def _onKeyPress(evt: qx.event.type.KeySequence): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ToggleButton")
class ToggleButton extends qx.ui.basic.Atom implements qx.ui.form.IBooleanForm,qx.ui.form.IExecutable,qx.ui.form.IRadioItem {
    def getValue(): Boolean = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def resetCommand(): Unit = js.native
    constructor (label: String = ???, icon: String = ???);
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyTriState(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.type.Pointer): Unit = js.native
    def getTriState(): Boolean = js.native
    protected def initGroup(value: any): qx.ui.form.RadioGroup = js.native
    protected def initTriState(value: any): Boolean = js.native
    protected def initValue(value: any): Boolean = js.native
    def isTriState(): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def resetTriState(): Unit = js.native
    def setTriState(value: any): Boolean = js.native
    def toggleTriState(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualComboBox")
class VirtualComboBox extends qx.ui.form.core.AbstractVirtualBox implements qx.ui.form.IStringForm {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    constructor (model: js.Any = ???);
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getDefaultFormat(): js.Function = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initDefaultFormat(value: any): js.Function = js.native
    protected def initPlaceholder(value: any): String = js.native
    protected def initValue(value: any): any = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetDefaultFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setDefaultFormat(value: any): js.Function = js.native
    def setPlaceholder(value: any): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualSelectBox")
class VirtualSelectBox extends qx.ui.form.core.AbstractVirtualBox implements qx.data.controller.ISelection {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native
    constructor (model: js.Any = ???);
    protected def _addBindings(): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _onPointerOut(event: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(event: qx.event.type.Pointer): Unit = js.native
    protected def _removeBindings(): Unit = js.native
    protected def initSelection(value: any): qx.data.Array = js.native

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.AbstractVirtualBox")
class AbstractVirtualBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (model: qx.data.Array = ???);
    protected def _applyDelegate(value: any, old: any): Unit = js.native
    protected def _applyIconOptions(value: any, old: any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: any, old: any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _beforeClose(): Unit = js.native
    protected def _beforeOpen(): Unit = js.native
    protected def _getAction(event: qx.event.type.KeySequence): String = js.native
    protected def _getBindPath(source: String, path: String = ???): String = js.native
    protected def _handleKeyboard(event: qx.event.type.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.type.Pointer): Unit = js.native
    protected def _isModifierPressed(event: qx.event.type.KeySequence): Boolean = js.native
    protected def _onBlur(event: qx.event.type.Focus): Unit = js.native
    protected def _onPopupChangeVisibility(event: qx.event.type.Data): Unit = js.native
    protected def _onResize(event: qx.event.type.Data): Unit = js.native
    def close(): Unit = js.native
    def getDelegate(): any = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def getMaxListHeight(): Long = js.native
    def getModel(): qx.data.Array = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initItemHeight(value: any): Int = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    protected def initMaxListHeight(value: any): Long = js.native
    protected def initModel(value: any): qx.data.Array = js.native
    def open(): Unit = js.native
    def refresh(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def resetModel(): Unit = js.native
    def setDelegate(value: any): any = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setItemHeight(value: any): Int = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native
    def setMaxListHeight(value: any): Long = js.native
    def setModel(value: any): qx.data.Array = js.native
    def toggle(): Unit = js.native

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.VirtualDropDownList")
class VirtualDropDownList extends qx.ui.popup.Popup {
    constructor (target: qx.ui.form.core.AbstractVirtualBox = ???);
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _handleKeyboard(event: qx.event.type.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.type.Mouse): Unit = js.native
    protected def _onChangeDelegate(event: qx.event.type.Data): Unit = js.native
    protected def _onChangeModel(event: qx.event.type.Data): Unit = js.native
    protected def _onListChangeSelection(event: qx.event.type.Data): Unit = js.native
    def close(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: any): qx.data.Array = js.native
    def open(): Unit = js.native
    def resetSelection(): Unit = js.native
    def setPreselected(modelItem: any): Unit = js.native
    def setSelection(value: any): qx.data.Array = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.AbstractRenderer")
class AbstractRenderer extends qx.ui.core.Widget implements qx.ui.form.renderer.IFormRenderer {
    def addButton(button: qx.ui.form.Button, options: IMap = ???): Unit = js.native
    def addItems(items: qx.ui.core.Widget[], names: String[], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: IMap = ???): Unit = js.native
    constructor (form: qx.ui.form.Form = ???);
    protected def _connectVisibility(item: qx.ui.core.Widget, label: qx.ui.basic.Label): Unit = js.native
    protected def _createLabelText(name: String, item: qx.ui.form.IForm): String = js.native
    protected def _onChangeLocale(e: qx.event.type.Event): Unit = js.native
    protected def _onFormChange(): Unit = js.native
    protected def _render(): Unit = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Double")
class Double extends qx.ui.form.renderer.AbstractRenderer {
    constructor (form: js.Any = ???);
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
package qx.ui.form.renderer {
@js.native
trait IFormRenderer extends js.Object {
    def addButton(button: qx.ui.form.Button, options: IMap = ???): Unit = js.native
    def addItems(items: qx.ui.core.Widget[], names: String[], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: IMap = ???): Unit = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Single")
class Single extends qx.ui.form.renderer.AbstractRenderer {
    constructor (form: js.Any = ???);
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.SinglePlaceholder")
class SinglePlaceholder extends qx.ui.form.renderer.Single implements qx.ui.form.renderer.IFormRenderer {
    def addButton(button: qx.ui.form.Button, options: IMap = ???): Unit = js.native
    def addItems(items: qx.ui.core.Widget[], names: String[], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: IMap = ???): Unit = js.native

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.AsyncValidator")
class AsyncValidator extends qx.core.Object {
    constructor (validator: js.Function = ???);
    def setValid(valid: Boolean, message: String = ???): Unit = js.native
    def validate(item: qx.ui.core.Widget, value: any, manager: qx.ui.form.validation.Manager, context: any = ???): Unit = js.native
    def validateForm(items: qx.ui.core.Widget[], manager: qx.ui.form.validation.Manager, context: any = ???): Unit = js.native

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.Manager")
class Manager extends qx.core.Object {
    constructor ();
    protected def _setValid(value: Boolean): Unit = js.native
    protected def _showToolTip(valid: Boolean): Unit = js.native
    def add(formItem: qx.ui.core.Widget, validator: js.Function, context: any = ???): Unit = js.native
    def getContext(): any = js.native
    def getInvalidFormItems(): qx.data.Array = js.native
    def getInvalidMessage(): String = js.native
    def getInvalidMessages(): String[] = js.native
    def getItems(): qx.data.Array = js.native
    def getRequiredFieldMessage(): String = js.native
    def getValid(): Boolean = js.native
    def getValidator(): any = js.native
    protected def initContext(value: any): any = js.native
    protected def initInvalidMessage(value: any): String = js.native
    protected def initRequiredFieldMessage(value: any): String = js.native
    protected def initValidator(value: any): any = js.native
    def isValid(): Boolean = js.native
    def remove(formItem: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def reset(): Unit = js.native
    def resetContext(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequiredFieldMessage(): Unit = js.native
    def resetValidator(): Unit = js.native
    def setContext(value: any): any = js.native
    def setFormValid(valid: Boolean): Unit = js.native
    def setInvalidMessage(value: any): String = js.native
    def setItemValid(formItem: qx.ui.core.Widget, valid: Boolean): Unit = js.native
    def setRequiredFieldMessage(value: any): String = js.native
    def setValidator(value: any): any = js.native
    def validate(): Boolean = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.CheckGroupBox")
class CheckGroupBox extends qx.ui.groupbox.GroupBox implements qx.ui.form.IExecutable,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def getValue(): Boolean = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def _onRadioChangeValue(e: qx.event.type.Data): Unit = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.GroupBox")
class GroupBox extends qx.ui.core.Widget implements qx.ui.form.IForm {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor (legend: String = ???, icon: String = ???);
    protected def _applyLegendPosition(e: js.Any): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _repositionFrame(): Unit = js.native
    def getIcon(): String = js.native
    def getLegend(): String = js.native
    def getLegendPosition(): any = js.native
    protected def initLegendPosition(value: any): any = js.native
    def resetLegendPosition(): Unit = js.native
    def setIcon(icon: String): Unit = js.native
    def setLegend(legend: String): Unit = js.native
    def setLegendPosition(value: any): any = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.RadioGroupBox")
class RadioGroupBox extends qx.ui.groupbox.GroupBox implements qx.ui.form.IRadioItem,qx.ui.form.IExecutable,qx.ui.form.IBooleanForm,qx.ui.form.IModel {
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def resetValue(): Unit = js.native
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def _onRadioChangeValue(e: qx.event.type.Data): Unit = js.native
    def getLabel(): String = js.native

}
}
package qx.ui.indicator {
@js.native
@JSName("qx.ui.indicator.ProgressBar")
class ProgressBar extends qx.ui.container.Composite {
    constructor (value: Long = ???, maximum: Long = ???);
    protected def _changeProgress(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getValue(): Long = js.native
    def setMaximum(value: Long): Long = js.native
    def setValue(value: Long): Long = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Abstract")
class Abstract extends qx.core.Object {
    protected def _applyLayoutChange(): Unit = js.native
    protected def _clearSeparators(): Unit = js.native
    protected def _computeSizeHint(): IMap = js.native
    protected def _getLayoutChildren(): qx.data.Array = js.native
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _renderSeparator(separator: String, bounds: IMap): Unit = js.native
    def connectToWidget(widget: qx.ui.core.Widget): Unit = js.native
    def getHeightForWidth(width: Int): Int = js.native
    def getSizeHint(): IMap = js.native
    def hasHeightForWidth(): Boolean = js.native
    def invalidateChildrenCache(): Unit = js.native
    def invalidateLayoutCache(): Unit = js.native
    def renderLayout(availWidth: Int, availHeight: Int, padding: IMap): Unit = js.native
    def verifyLayoutProperty(item: any, name: any, value: any): Unit = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Atom")
class Atom extends qx.ui.layout.Abstract {
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIconPosition(): any = js.native
    protected def initCenter(value: any): Boolean = js.native
    protected def initGap(value: any): Int = js.native
    protected def initIconPosition(value: any): any = js.native
    def isCenter(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def setCenter(value: any): Boolean = js.native
    def setGap(value: any): Int = js.native
    def setIconPosition(value: any): any = js.native
    def toggleCenter(): Boolean = js.native

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
    def getDesktop(): Boolean = js.native
    protected def initDesktop(value: any): Boolean = js.native
    def isDesktop(): Boolean = js.native
    def resetDesktop(): Unit = js.native
    def setDesktop(value: any): Boolean = js.native
    def toggleDesktop(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Dock")
class Dock extends qx.ui.layout.Abstract {
    constructor (spacingX: Int = ???, spacingY: Int = ???, separatorX: String = ???, separatorY: String = ???);
    protected def _applySort(value: any, old: any): Unit = js.native
    protected def _getSeparatorWidths(): IMap = js.native
    def getConnectSeparators(): Boolean = js.native
    def getSeparatorX(): qx.ui.decoration.Decorator = js.native
    def getSeparatorY(): qx.ui.decoration.Decorator = js.native
    def getSort(): any = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initConnectSeparators(value: any): Boolean = js.native
    protected def initSeparatorX(value: any): qx.ui.decoration.Decorator = js.native
    protected def initSeparatorY(value: any): qx.ui.decoration.Decorator = js.native
    protected def initSort(value: any): any = js.native
    protected def initSpacingX(value: any): Int = js.native
    protected def initSpacingY(value: any): Int = js.native
    def isConnectSeparators(): Boolean = js.native
    def resetConnectSeparators(): Unit = js.native
    def resetSeparatorX(): Unit = js.native
    def resetSeparatorY(): Unit = js.native
    def resetSort(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setConnectSeparators(value: any): Boolean = js.native
    def setSeparatorX(value: any): qx.ui.decoration.Decorator = js.native
    def setSeparatorY(value: any): qx.ui.decoration.Decorator = js.native
    def setSort(value: any): any = js.native
    def setSpacingX(value: any): Int = js.native
    def setSpacingY(value: any): Int = js.native
    def toggleConnectSeparators(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Flow")
class Flow extends qx.ui.layout.Abstract {
    constructor (spacingX: Int = ???, spacingY: Int = ???, alignX: String = ???);
    def getAlignX(): any = js.native
    def getAlignY(): any = js.native
    def getLastLineChildren(width: Long): qx.data.Array = js.native
    def getReversed(): Boolean = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initAlignX(value: any): any = js.native
    protected def initAlignY(value: any): any = js.native
    protected def initReversed(value: any): Boolean = js.native
    protected def initSpacingX(value: any): Int = js.native
    protected def initSpacingY(value: any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setAlignX(value: any): any = js.native
    def setAlignY(value: any): any = js.native
    def setReversed(value: any): Boolean = js.native
    def setSpacingX(value: any): Int = js.native
    def setSpacingY(value: any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grid")
class Grid extends qx.ui.layout.Abstract {
    constructor (spacingX: Int = ???, spacingY: Int = ???);
    protected def _fixHeightsRowSpan(rowHeights: IMap[]): Unit = js.native
    protected def _fixWidthsColSpan(colWidths: IMap[]): Unit = js.native
    protected def _getColumnFlexOffsets(width: Int): Int[] = js.native
    protected def _getColWidths(): IMap[] = js.native
    protected def _getRowFlexOffsets(height: Int): Int[] = js.native
    protected def _getRowHeights(): IMap[] = js.native
    protected def _setColumnData(column: Int, key: String, value: any): Unit = js.native
    protected def _setRowData(row: Int, key: String, value: any): Unit = js.native
    def getCellAlign(row: Int, column: Int): IMap = js.native
    def getCellWidget(row: Int, column: Int): qx.ui.core.Widget = js.native
    def getColumnAlign(column: Int): IMap = js.native
    def getColumnCount(): Int = js.native
    def getColumnFlex(column: Int): Int = js.native
    def getColumnMaxWidth(column: Int): Int = js.native
    def getColumnMinWidth(column: Int): Int = js.native
    def getColumnWidth(column: Int): Int = js.native
    def getRowAlign(row: Int): IMap = js.native
    def getRowCount(): Int = js.native
    def getRowFlex(row: Int): Int = js.native
    def getRowHeight(row: Int): Int = js.native
    def getRowMaxHeight(row: Int): Int = js.native
    def getRowMinHeight(row: Int): Int = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initSpacingX(value: any): Int = js.native
    protected def initSpacingY(value: any): Int = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setColumnAlign(column: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setColumnFlex(column: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setColumnMaxWidth(column: Int, maxWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnMinWidth(column: Int, minWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnWidth(column: Int, width: Int): qx.ui.layout.Grid = js.native
    def setRowAlign(row: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setRowFlex(row: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setRowHeight(row: Int, height: Int): qx.ui.layout.Grid = js.native
    def setRowMaxHeight(row: Int, maxHeight: Int): qx.ui.layout.Grid = js.native
    def setRowMinHeight(row: Int, minHeight: Int): qx.ui.layout.Grid = js.native
    def setSpacing(spacing: Int): qx.ui.layout.Grid = js.native
    def setSpacingX(value: any): Int = js.native
    def setSpacingY(value: any): Int = js.native

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
    constructor (spacing: Int = ???, alignX: String = ???, separator: String = ???);
    protected def _applyReversed(value: Boolean, old: Boolean): Unit = js.native
    def getAlignX(): any = js.native
    def getAlignY(): any = js.native
    def getReversed(): Boolean = js.native
    def getSeparator(): qx.ui.decoration.Decorator = js.native
    def getSpacing(): Int = js.native
    protected def initAlignX(value: any): any = js.native
    protected def initAlignY(value: any): any = js.native
    protected def initReversed(value: any): Boolean = js.native
    protected def initSeparator(value: any): qx.ui.decoration.Decorator = js.native
    protected def initSpacing(value: any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSeparator(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setAlignX(value: any): any = js.native
    def setAlignY(value: any): any = js.native
    def setReversed(value: any): Boolean = js.native
    def setSeparator(value: any): qx.ui.decoration.Decorator = js.native
    def setSpacing(value: any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.LineSizeIterator")
class LineSizeIterator extends js.Object {
    constructor (children: qx.ui.core.Widget[] = ???, spacing: Int = ???);
    def computeNextLine(availWidth: Int): IMap = js.native
    def hasMoreLines(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Util")
class Util extends js.Object {
    static def arrangeIdeals(beginMin: Int, beginIdeal: Int, beginMax: Int, endMin: Int, endIdeal: Int, endMax: Int): IMap = js.native
    static def collapseMargins(varargs: any = ???): Int = js.native
    static def computeFlexOffsets(flexibles: IMap, avail: Int, used: Int): IMap = js.native
    static def computeHorizontalAlignOffset(align: String, width: Int, availWidth: Int, marginLeft: Int = ???, marginRight: Int = ???): Int = js.native
    static def computeHorizontalGaps(children: qx.data.Array, spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    static def computeHorizontalSeparatorGaps(children: qx.ui.core.LayoutItem[], spacing: Int, separator: String): Int = js.native
    static def computeVerticalAlignOffset(align: String, height: Int, availHeight: Int, marginTop: Int = ???, marginBottom: Int = ???): Int = js.native
    static def computeVerticalGaps(children: qx.data.Array, spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    static def computeVerticalSeparatorGaps(children: qx.ui.core.LayoutItem[], spacing: Int, separator: String): Int = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.VBox")
class VBox extends qx.ui.layout.Abstract {
    constructor (spacing: Int = ???, alignY: String = ???, separator: String = ???);
    protected def _applyReversed(value: Boolean, old: Boolean): Unit = js.native
    def getAlignX(): any = js.native
    def getAlignY(): any = js.native
    def getReversed(): Boolean = js.native
    def getSeparator(): qx.ui.decoration.Decorator = js.native
    def getSpacing(): Int = js.native
    protected def initAlignX(value: any): any = js.native
    protected def initAlignY(value: any): any = js.native
    protected def initReversed(value: any): Boolean = js.native
    protected def initSeparator(value: any): qx.ui.decoration.Decorator = js.native
    protected def initSpacing(value: any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSeparator(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setAlignX(value: any): any = js.native
    def setAlignY(value: any): any = js.native
    def setReversed(value: any): Boolean = js.native
    def setSeparator(value: any): qx.ui.decoration.Decorator = js.native
    def setSpacing(value: any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.list {
@js.native
@JSName("qx.ui.list.List")
class List extends qx.ui.virtual.core.Scroller implements qx.data.controller.ISelection {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native
    def getAutoScrollIntoView(): Boolean = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectionMode(): any = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setAutoScrollIntoView(value: Boolean): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native
    constructor (model: qx.data.IListData = ???);
    protected def _applyDelegate(value: any, old: any): Unit = js.native
    protected def _applyGroupLabelOptions(value: any, old: any): Unit = js.native
    protected def _applyGroupLabelPath(value: String, old: String): Unit = js.native
    protected def _applyGroupRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyIconOptions(value: any, old: any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: any, old: any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.IListData, old: qx.data.IListData): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _getDataFromRow(row: Int): any = js.native
    protected def _getLookupTable(): qx.data.Array = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initBackground(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _isGroup(row: Int): Boolean = js.native
    protected def _lookup(row: Long): Long = js.native
    protected def _lookupGroup(row: Long): Long = js.native
    protected def _onModelChange(e: qx.event.type.Data): Unit = js.native
    protected def _onResize(e: qx.event.type.Data): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    protected def _runDelegateFilter(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateGroup(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateSorter(model: qx.data.IListData): Unit = js.native
    def getAutoGrouping(): Boolean = js.native
    def getDelegate(): any = js.native
    def getGroupItemHeight(): Int = js.native
    def getGroupLabelOptions(): any = js.native
    def getGroupLabelPath(): String = js.native
    def getGroups(): qx.data.Array = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    protected def initAutoGrouping(value: any): Boolean = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initGroupItemHeight(value: any): Int = js.native
    protected def initGroupLabelOptions(value: any): any = js.native
    protected def initGroupLabelPath(value: any): String = js.native
    protected def initGroups(value: any): qx.data.Array = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initItemHeight(value: any): Int = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    protected def initModel(value: any): qx.data.IListData = js.native
    def isAutoGrouping(): Boolean = js.native
    def refresh(): Unit = js.native
    def resetAutoGrouping(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupItemHeight(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetGroups(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def setAutoGrouping(value: any): Boolean = js.native
    def setDelegate(value: any): any = js.native
    def setGroupItemHeight(value: any): Int = js.native
    def setGroupLabelOptions(value: any): any = js.native
    def setGroupLabelPath(value: any): String = js.native
    def setGroups(value: any): qx.data.Array = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setItemHeight(value: any): Int = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native
    def setModel(value: any): qx.data.IListData = js.native
    def toggleAutoGrouping(): Boolean = js.native

}
}
package qx.ui.list.core {
@js.native
trait IListDelegate extends js.Object {
    def bindGroupItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def configureGroupItem(item: qx.ui.core.Widget): Unit = js.native
    def configureItem(item: qx.ui.core.Widget): Unit = js.native
    def createGroupItem(): qx.ui.core.Widget = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: any): Boolean = js.native
    def group(data: any): String = js.native
    def onPool(item: qx.ui.core.Widget): Unit = js.native
    def sorter(a: any, b: any): Int = js.native

}
}
package qx.ui.list.core {
@js.native
@JSName("qx.ui.list.core.MWidgetController")
class MWidgetController extends js.Object {
    constructor ();
    protected def _bindGroupItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _configureGroupItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _configureItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: IMap, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: IMap, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getDelegate(): any = js.native
    def getGroupLabelOptions(): any = js.native
    def getGroupLabelPath(): String = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initGroupLabelOptions(value: any): any = js.native
    protected def initGroupLabelPath(value: any): String = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    def removeBindings(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setDelegate(value: any): any = js.native
    def setGroupLabelOptions(value: any): any = js.native
    def setGroupLabelPath(value: any): String = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native

}
}
package qx.ui.list.provider {
@js.native
trait IListProvider extends js.Object {
    def createGroupRenderer(): any = js.native
    def createItemRenderer(): any = js.native
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def isSelectable(row: Int): Boolean = js.native
    def removeBindings(): Unit = js.native
    def setDelegate(delegate: any): Unit = js.native
    def setIconOptions(options: IMap): Unit = js.native
    def setIconPath(path: String): Unit = js.native
    def setLabelOptions(options: IMap): Unit = js.native
    def setLabelPath(path: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native

}
}
package qx.ui.list.provider {
@js.native
@JSName("qx.ui.list.provider.WidgetProvider")
class WidgetProvider extends qx.core.Object implements qx.ui.virtual.core.IWidgetCellProvider,qx.ui.list.provider.IListProvider {
    def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native
    def createGroupRenderer(): any = js.native
    def createItemRenderer(): any = js.native
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def isSelectable(row: Int): Boolean = js.native
    def removeBindings(): Unit = js.native
    def setDelegate(delegate: any): Unit = js.native
    def setIconOptions(options: IMap): Unit = js.native
    def setIconPath(path: String): Unit = js.native
    def setLabelOptions(options: IMap): Unit = js.native
    def setLabelPath(path: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: IMap, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: IMap, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getDelegate(): any = js.native
    def getGroupLabelOptions(): any = js.native
    def getGroupLabelPath(): String = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setGroupLabelOptions(value: any): any = js.native
    def setGroupLabelPath(value: any): String = js.native
    constructor (list: qx.ui.list.List = ???);
    protected def _onChangeDelegate(event: qx.event.type.Data): Unit = js.native
    protected def _onGroupItemCreated(event: qx.event.type.Data): Unit = js.native
    protected def _onItemCreated(event: qx.event.type.Data): Unit = js.native
    protected def _onPool(item: qx.ui.core.Widget): Unit = js.native
    protected def _styleSelectabled(widget: qx.ui.core.Widget): Unit = js.native
    protected def _styleUnselectabled(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.AbstractButton")
class AbstractButton extends qx.ui.core.Widget implements qx.ui.form.IExecutable {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native
    def resetCommand(): Unit = js.native
    constructor ();
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShowCommandLabel(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeCommand(e: qx.event.type.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    def getChildrenSizes(): qx.data.Array = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShowCommandLabel(): Boolean = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initMenu(value: any): qx.ui.menu.Menu = js.native
    protected def initShowCommandLabel(value: any): Boolean = js.native
    def isShowCommandLabel(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShowCommandLabel(): Unit = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setMenu(value: any): qx.ui.menu.Menu = js.native
    def setShowCommandLabel(value: any): Boolean = js.native
    def toggleShowCommandLabel(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Button")
class Button extends qx.ui.menu.AbstractButton {
    constructor (label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???, menu: qx.ui.menu.Menu = ???);

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
    def getValue(): Boolean = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    constructor (label: String = ???, menu: qx.ui.menu.Menu = ???);
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def initValue(value: any): Boolean = js.native
    def isValue(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Layout")
class Layout extends qx.ui.layout.VBox {
    def getArrowColumnWidth(): Int = js.native
    def getColumnSizes(): qx.data.Array = js.native
    def getColumnSpacing(): Int = js.native
    def getIconColumnWidth(): Int = js.native
    def getSpanColumn(): Int = js.native
    protected def initArrowColumnWidth(value: any): Int = js.native
    protected def initColumnSpacing(value: any): Int = js.native
    protected def initIconColumnWidth(value: any): Int = js.native
    protected def initSpanColumn(value: any): Int = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetColumnSpacing(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetSpanColumn(): Unit = js.native
    def setArrowColumnWidth(value: any): Int = js.native
    def setColumnSpacing(value: any): Int = js.native
    def setIconColumnWidth(value: any): Int = js.native
    def setSpanColumn(value: any): Int = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.ui.menu.Manager = js.native
    def __onPreventContextMenu(e: qx.event.type.Mouse): Unit = js.native
    protected def _getChild(menu: qx.ui.menu.Menu, start: Int, iter: Int, loop: Boolean = ???): qx.ui.menu.Button = js.native
    protected def _getMenuButton(widget: qx.ui.core.Widget): qx.ui.menu.Button = js.native
    protected def _isInMenu(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isMenuOpener(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _onCloseInterval(e: qx.event.type.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyPressDown(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressEnter(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyPressLeft(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressRight(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressSpace(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.type.KeySequence): Unit = js.native
    protected def _onKeyPressUp(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyUpDown(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onOpenInterval(e: qx.event.type.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    def add(obj: qx.ui.menu.Menu): Unit = js.native
    def cancelClose(menu: qx.ui.menu.Menu): Unit = js.native
    def cancelOpen(menu: qx.ui.menu.Menu): Unit = js.native
    def getActiveMenu(): qx.ui.menu.Menu = js.native
    def hideAll(): Unit = js.native
    def preventContextMenuOnce(): Unit = js.native
    def remove(obj: qx.ui.menu.Menu): Unit = js.native
    def scheduleClose(menu: qx.ui.menu.Menu): Unit = js.native
    def scheduleOpen(menu: qx.ui.menu.Menu): Unit = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Menu")
class Menu extends qx.ui.core.Widget {
    static def getMoveDirection(): String = js.native
    static def getVisibleElement(): qx.ui.core.Widget = js.native
    static def setMoveDirection(direction: String): Unit = js.native
    static def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): IMap = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): any = js.native
    def getPlacementModeY(): any = js.native
    def getPlaceMethod(): any = js.native
    def getPosition(): any = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: IMap): Unit = js.native
    def placeToPointer(event: qx.event.type.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: any): Boolean = js.native
    def setOffset(offsetTop: any, offsetRight: any, offsetBottom: any, offsetLeft: any): Unit = js.native
    def setOffsetBottom(value: any): Int = js.native
    def setOffsetLeft(value: any): Int = js.native
    def setOffsetRight(value: any): Int = js.native
    def setOffsetTop(value: any): Int = js.native
    def setPlacementModeX(value: any): any = js.native
    def setPlacementModeY(value: any): any = js.native
    def setPlaceMethod(value: any): any = js.native
    def setPosition(value: any): any = js.native
    def toggleDomMove(): Boolean = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor ();
    protected def _applyArrowColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _applyIconColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyOpenedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelectedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySpacingX(value: Int, old: Int): Unit = js.native
    protected def _applySpacingY(value: Int, old: Int): Unit = js.native
    protected def _assertSlideBar(callback: js.Function): any = js.native
    protected def _computePlacementSize(): IMap = js.native
    protected def _getMenuBounds(): IMap = js.native
    protected def _getMenuLayout(): any = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    def addSeparator(): Unit = js.native
    def getArrowColumnWidth(): Int = js.native
    def getBlockBackground(): Boolean = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    def getCloseInterval(): Int = js.native
    def getColumnSizes(): qx.data.Array = js.native
    def getIconColumnWidth(): Int = js.native
    def getOpenedButton(): qx.ui.core.Widget = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getOpenInterval(): Int = js.native
    def getParentMenu(): any = js.native
    def getSelectables(): qx.ui.core.Widget[] = js.native
    def getSelectedButton(): qx.ui.core.Widget = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initArrowColumnWidth(value: any): Int = js.native
    protected def initBlockBackground(value: any): Boolean = js.native
    protected def initBlockerColor(value: any): String = js.native
    protected def initBlockerOpacity(value: any): Long = js.native
    protected def initCloseInterval(value: any): Int = js.native
    protected def initIconColumnWidth(value: any): Int = js.native
    protected def initOpenedButton(value: any): qx.ui.core.Widget = js.native
    protected def initOpener(value: any): qx.ui.core.Widget = js.native
    protected def initOpenInterval(value: any): Int = js.native
    protected def initSelectedButton(value: any): qx.ui.core.Widget = js.native
    protected def initSpacingX(value: any): Int = js.native
    protected def initSpacingY(value: any): Int = js.native
    def isBlockBackground(): Boolean = js.native
    def open(): Unit = js.native
    def openAtPoint(point: IMap): Unit = js.native
    def openAtPointer(e: qx.event.type.Pointer): Unit = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetBlockBackground(): Unit = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def resetCloseInterval(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetOpenedButton(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetOpenInterval(): Unit = js.native
    def resetSelectedButton(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setArrowColumnWidth(value: any): Int = js.native
    def setBlockBackground(value: any): Boolean = js.native
    def setBlockerColor(value: any): String = js.native
    def setBlockerOpacity(value: any): Long = js.native
    def setCloseInterval(value: any): Int = js.native
    def setIconColumnWidth(value: any): Int = js.native
    def setOpenedButton(value: any): qx.ui.core.Widget = js.native
    def setOpener(value: any): qx.ui.core.Widget = js.native
    def setOpenInterval(value: any): Int = js.native
    def setSelectedButton(value: any): qx.ui.core.Widget = js.native
    def setSpacingX(value: any): Int = js.native
    def setSpacingY(value: any): Int = js.native
    def toggleBlockBackground(): Boolean = js.native

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
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def resetValue(): Unit = js.native
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    constructor (label: String = ???, menu: qx.ui.menu.Menu = ???);
    protected def _applyGroup(value: qx.ui.form.RadioGroup, old: qx.ui.form.RadioGroup): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.type.Event): Unit = js.native
    protected def initGroup(value: any): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: any): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

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
    constructor (label: js.Any = ???, icon: js.Any = ???, menu: js.Any = ???);
    def getMenuBar(): qx.ui.menubar.MenuBar = js.native

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
    static def getInstance(): qx.ui.popup.Manager = js.native
    def add(obj: qx.ui.popup.Popup): Unit = js.native
    def hideAll(): Unit = js.native
    def remove(obj: qx.ui.popup.Popup): Unit = js.native

}
}
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Popup")
class Popup extends qx.ui.container.Composite {
    static def getMoveDirection(): String = js.native
    static def getVisibleElement(): qx.ui.core.Widget = js.native
    static def setMoveDirection(direction: String): Unit = js.native
    static def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): IMap = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): any = js.native
    def getPlacementModeY(): any = js.native
    def getPlaceMethod(): any = js.native
    def getPosition(): any = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: IMap): Unit = js.native
    def placeToPointer(event: qx.event.type.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: any): Boolean = js.native
    def setOffset(offsetTop: any, offsetRight: any, offsetBottom: any, offsetLeft: any): Unit = js.native
    def setOffsetBottom(value: any): Int = js.native
    def setOffsetLeft(value: any): Int = js.native
    def setOffsetRight(value: any): Int = js.native
    def setOffsetTop(value: any): Int = js.native
    def setPlacementModeX(value: any): any = js.native
    def setPlacementModeY(value: any): any = js.native
    def setPlaceMethod(value: any): any = js.native
    def setPosition(value: any): any = js.native
    def toggleDomMove(): Boolean = js.native
    constructor (layout: js.Any = ???);
    def getAutoHide(): Boolean = js.native
    protected def initAutoHide(value: any): Boolean = js.native
    def isAutoHide(): Boolean = js.native
    def resetAutoHide(): Unit = js.native
    def setAutoHide(value: any): Boolean = js.native
    def toggleAutoHide(): Boolean = js.native

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.Progressive")
class Progressive extends qx.ui.container.Composite {
    constructor (structure: qx.ui.progressive.structure.Abstract = ???);
    protected def _applyDataModel(value: qx.ui.progressive.model.Abstract, old: js.Any): Unit = js.native
    def addRenderer(name: String, renderer: qx.ui.progressive.renderer.Abstract): Unit = js.native
    def getBatchSize(): Int = js.native
    def getDataModel(): qx.ui.progressive.model.Abstract = js.native
    def getFlushWidgetQueueAfterBatch(): Boolean = js.native
    def getInterElementTimeout(): Int = js.native
    def getStructure(): qx.ui.progressive.structure.Abstract = js.native
    protected def initBatchSize(value: any): Int = js.native
    protected def initDataModel(value: any): qx.ui.progressive.model.Abstract = js.native
    protected def initFlushWidgetQueueAfterBatch(value: any): Boolean = js.native
    protected def initInterElementTimeout(value: any): Int = js.native
    def isFlushWidgetQueueAfterBatch(): Boolean = js.native
    def removeRenderer(name: String): Unit = js.native
    def render(): Unit = js.native
    def resetBatchSize(): Unit = js.native
    def resetDataModel(): Unit = js.native
    def resetFlushWidgetQueueAfterBatch(): Unit = js.native
    def resetInterElementTimeout(): Unit = js.native
    def setBatchSize(value: any): Int = js.native
    def setDataModel(value: any): qx.ui.progressive.model.Abstract = js.native
    def setFlushWidgetQueueAfterBatch(value: any): Boolean = js.native
    def setInterElementTimeout(value: any): Int = js.native
    def toggleFlushWidgetQueueAfterBatch(): Boolean = js.native

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.State")
class State extends qx.core.Object {
    constructor (initialState: IMap = ???);
    def getBatchSize(): any = js.native
    def getModel(): any = js.native
    def getPane(): any = js.native
    def getProgressive(): any = js.native
    def getRendererData(): any = js.native
    protected def initBatchSize(value: any): any = js.native
    protected def initModel(value: any): any = js.native
    protected def initPane(value: any): any = js.native
    protected def initProgressive(value: any): any = js.native
    protected def initRendererData(value: any): any = js.native
    protected def initUserData(value: any): any = js.native
    def resetBatchSize(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetPane(): Unit = js.native
    def resetProgressive(): Unit = js.native
    def resetRendererData(): Unit = js.native
    def resetUserData(): Unit = js.native
    def setBatchSize(value: any): any = js.native
    def setModel(value: any): any = js.native
    def setPane(value: any): any = js.native
    def setProgressive(value: any): any = js.native
    def setRendererData(value: any): any = js.native

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Abstract")
class Abstract extends qx.ui.container.Composite {
    constructor ();
    def join(progressive: qx.ui.progressive.Progressive): Unit = js.native

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
    constructor (columnWidths: qx.ui.progressive.renderer.table.Widths = ???, labelArr: qx.data.Array = ???);

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.TableHeading")
class TableHeading extends qx.ui.progressive.headfoot.Abstract {
    constructor (columnWidths: qx.ui.progressive.renderer.table.Widths = ???, labelArr: qx.data.Array = ???);
    protected def _resizeColumns(e: qx.event.type.Event): Unit = js.native

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Abstract")
class Abstract extends qx.core.Object {
    def getElementCount(): Int = js.native
    def getNextElement(): any = js.native

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Default")
class Default extends qx.ui.progressive.model.Abstract {
    constructor ();
    def addElement(elem: any): Unit = js.native
    def addElements(elems: qx.data.Array): Unit = js.native

}
}
package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.Abstract")
class Abstract extends qx.core.Object {
    def join(progressive: qx.ui.progressive.Progressive, name: String): Unit = js.native
    def render(state: qx.ui.progressive.State, element: any): Unit = js.native

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
    constructor (columnWidths: qx.ui.progressive.renderer.table.Widths = ???);
    protected def _resizeColumns(e: qx.event.type.Event): Unit = js.native
    def addRenderer(column: Int, renderer: qx.ui.progressive.renderer.table.cell.Abstract): Unit = js.native
    def getDefaultRowHeight(): any = js.native
    def getLayoutChildren(): qx.data.Array = js.native
    protected def initDefaultRowHeight(value: any): any = js.native
    def removeRenderer(column: Int): Unit = js.native
    def resetDefaultRowHeight(): Unit = js.native
    def setDefaultRowHeight(value: any): any = js.native

}
}
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Widths")
class Widths extends qx.core.Object {
    constructor (numColumns: Int = ???);
    def getData(): qx.data.Array = js.native
    def set(column: Int, map: IMap): Unit = js.native
    def setMaxWidth(column: Int, width: Int): Unit = js.native
    def setMinWidth(column: Int, width: Int): Unit = js.native
    def setWidth(column: Int, width: Int): Unit = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Abstract")
class Abstract extends qx.core.Object {
    protected def _getCellExtras(cellInfo: any): String = js.native
    protected def _getCellStyle(cellInfo: any): String = js.native
    protected def _getContentHtml(cellInfo: any): String = js.native
    def render(cellInfo: any): String = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Boolean")
class Boolean extends qx.ui.progressive.renderer.table.cell.Icon {
    constructor ();
    def getAllowToggle(): Boolean = js.native
    protected def initAllowToggle(value: any): Boolean = js.native
    def isAllowToggle(): Boolean = js.native
    def resetAllowToggle(): Unit = js.native
    def setAllowToggle(value: any): Boolean = js.native
    def toggleAllowToggle(): Boolean = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Conditional")
class Conditional extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor (align: String = ???, color: String = ???, style: String = ???, weight: String = ???);
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Default")
class Default extends qx.ui.progressive.renderer.table.cell.Abstract {
    constructor ();
    protected def _formatValue(value: any): String = js.native

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
    protected def _identifyImage(cellInfo: IMap): IMap = js.native
    def getBlankImage(): String = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Image")
class Image extends qx.ui.progressive.renderer.table.cell.Icon {
    constructor (width: Int = ???, height: Int = ???);

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
    constructor (pane: qx.ui.core.Widget = ???);
    def applyStructure(progressive: qx.ui.progressive.Progressive): Unit = js.native
    def getPane(): qx.ui.core.Widget = js.native

}
}
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Default")
class Default extends qx.ui.progressive.structure.Abstract {
    constructor (header: qx.ui.progressive.headfoot.Abstract = ???, footer: qx.ui.progressive.headfoot.Abstract = ???, pane: qx.ui.core.Widget = ???);
    def getFooter(): qx.ui.progressive.headfoot.Abstract = js.native
    def getHeader(): qx.ui.progressive.headfoot.Abstract = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Abstract")
class Abstract extends qx.ui.core.Widget {
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    def isBlocked(): Boolean = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def setBlockerColor(value: any): String = js.native
    def setBlockerOpacity(value: any): Long = js.native
    def unblock(): Unit = js.native
    def getActiveWindow(): qx.ui.window.Window = js.native
    def getWindowManager(): qx.ui.window.IWindowManager = js.native
    def getWindows(): qx.ui.window.Window[] = js.native
    def resetActiveWindow(): Unit = js.native
    def setActiveWindow(value: any): qx.ui.window.Window = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native
    constructor ();
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.type.Mouse): Unit = js.native
    def getGlobalCursor(): String = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def getNativeHelp(): Boolean = js.native
    protected def initGlobalCursor(value: any): String = js.native
    protected def initNativeHelp(value: any): Boolean = js.native
    def isNativeHelp(): Boolean = js.native
    def resetGlobalCursor(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def setGlobalCursor(value: any): String = js.native
    def setNativeHelp(value: any): Boolean = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Application")
class Application extends qx.ui.root.Abstract {
    constructor (doc: Document = ???);
    protected def _onResize(e: qx.event.type.Event): Unit = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Inline")
class Inline extends qx.ui.root.Abstract {
    static def remap(members: IMap): Unit = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    constructor (el: HTMLElement = ???, dynamicX: Boolean = ???, dynamicY: Boolean = ???);
    protected def _onResize(e: qx.event.type.Event): Unit = js.native
    protected def _onWindowResize(): Unit = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Page")
class Page extends qx.ui.root.Abstract {
    constructor (doc: Document = ???);
    def supportsMaximize(): Boolean = js.native

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Blocker")
class Blocker extends qx.html.Element {
    constructor (orientation: String = ???);
    protected def _applyOrientation(value: any, old: any): Unit = js.native
    def getOrientation(): any = js.native
    protected def initOrientation(value: any): any = js.native
    def resetOrientation(): Unit = js.native
    def setHeight(offset: Long, spliterSize: Long): Unit = js.native
    def setLeft(offset: Long, splitterLeft: Long): Unit = js.native
    def setOrientation(value: any): any = js.native
    def setTop(offset: Long, splitterTop: Long): Unit = js.native
    def setWidth(offset: Long, spliterSize: Long): Unit = js.native

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
    constructor (orientation: String = ???);
    protected def _applyOffset(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: String, old: String): Unit = js.native
    protected def _finalizeSizes(): Unit = js.native
    protected def _isActiveDragSession(): Boolean = js.native
    protected def _onPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.type.Pointer): Unit = js.native
    protected def _setLastPointerPosition(x: Int, y: Int): Unit = js.native
    def add(widget: qx.ui.core.Widget, flex: Long): Unit = js.native
    def getBlocker(): qx.ui.splitpane.Blocker = js.native
    def getChildren(): qx.ui.core.Widget[] = js.native
    def getOffset(): Int = js.native
    def getOrientation(): any = js.native
    protected def initOffset(value: any): Int = js.native
    protected def initOrientation(value: any): any = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def setOffset(value: any): Int = js.native
    def setOrientation(value: any): any = js.native

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
    constructor (parentWidget: qx.ui.splitpane.Pane = ???);

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
    static def getInstance(): qx.ui.style.Stylesheet = js.native
    def addRule(selector: String, css: String): Unit = js.native
    def hasRule(selector: String): Boolean = js.native
    def removeRule(selector: String): Unit = js.native

}
}
package qx.ui.table {
@js.native
trait ICellEditorFactory extends js.Object {
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native

}
}
package qx.ui.table {
@js.native
trait ICellRenderer extends js.Object {
    def createDataCellHtml(cellInfo: IMap, htmlArr: String[]): Boolean = js.native

}
}
package qx.ui.table {
@js.native
trait IColumnMenuButton extends js.Object {
    def empty(): Unit = js.native
    def factory(item: String, options: IMap): qx.ui.core.Widget = js.native
    def getMenu(): any = js.native
    protected def initMenu(value: any): any = js.native
    def resetMenu(): Unit = js.native
    def setMenu(value: any): any = js.native

}
}
package qx.ui.table {
@js.native
trait IColumnMenuItem extends js.Object {
    def getVisible(): any = js.native
    protected def initVisible(value: any): any = js.native
    def resetVisible(): Unit = js.native
    def setVisible(value: any): any = js.native

}
}
package qx.ui.table {
@js.native
trait IHeaderRenderer extends js.Object {
    def createHeaderCell(cellInfo: IMap): qx.ui.core.Widget = js.native
    def updateHeaderCell(cellInfo: IMap, cellWidget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.table {
@js.native
trait IRowRenderer extends js.Object {
    def createRowStyle(rowInfo: IMap): Unit = js.native
    def getRowClass(rowInfo: IMap): Unit = js.native
    def getRowHeightStyle(height: Int): Unit = js.native
    def updateDataRowElement(rowInfo: IMap, rowElement: HTMLElement): Unit = js.native

}
}
package qx.ui.table {
@js.native
trait ITableModel extends js.Object {
    def getColumnCount(): Int = js.native
    def getColumnId(columnIndex: Int): String = js.native
    def getColumnIndexById(columnId: String): Int = js.native
    def getColumnName(columnIndex: Int): String = js.native
    def getRowCount(): Int = js.native
    def getRowData(rowIndex: Int): any = js.native
    def getSortColumnIndex(): Int = js.native
    def getValue(columnIndex: Int, rowIndex: Int): any = js.native
    def getValueById(columnId: String, rowIndex: Int): any = js.native
    def isColumnEditable(columnIndex: Int): Boolean = js.native
    def isColumnSortable(columnIndex: Int): Boolean = js.native
    def isSortAscending(): Boolean = js.native
    def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit = js.native
    def setValue(columnIndex: Int, rowIndex: Int, value: any): Unit = js.native
    def setValueById(columnId: String, rowIndex: Int, value: any): Unit = js.native
    def sortByColumn(columnIndex: Int, ascending: Boolean): Unit = js.native

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.MTableContextMenu")
class MTableContextMenu extends js.Object {
    constructor ();
    def getContextMenuHandler(col: Int): js.Function = js.native
    def setContextMenuHandler(col: Int, handler: js.Function, context: any = ???): Unit = js.native

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.Table")
class Table extends qx.ui.core.Widget {
    def getDragScrollSlowDownFactor(): Float = js.native
    def getDragScrollThresholdX(): Int = js.native
    def getDragScrollThresholdY(): Int = js.native
    def resetDragScrollSlowDownFactor(): Unit = js.native
    def resetDragScrollThresholdX(): Unit = js.native
    def resetDragScrollThresholdY(): Unit = js.native
    def setDragScrollSlowDownFactor(value: any): Float = js.native
    def setDragScrollThresholdX(value: any): Int = js.native
    def setDragScrollThresholdY(value: any): Int = js.native
    constructor (tableModel: qx.ui.table.ITableModel = ???, custom: IMap = ???);
    protected def _applyAdditionalStatusBarText(value: any, old: any): Unit = js.native
    protected def _applyColumnVisibilityButtonVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyContextMenuFromDataCellsOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFocusCellOnPointerMove(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyHeaderCellHeight(value: Int, old: Int): Unit = js.native
    protected def _applyHeaderCellsVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyKeepFirstVisibleRowComplete(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMetaColumnCounts(value: any, old: any): Unit = js.native
    protected def _applyResetSelectionOnHeaderTap(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyRowHeight(value: Long, old: Long): Unit = js.native
    protected def _applySelectionModel(value: qx.ui.table.selection.Model, old: qx.ui.table.selection.Model): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatusBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTableModel(value: qx.ui.table.ITableModel, old: qx.ui.table.ITableModel): Unit = js.native
    protected def _cleanUpMetaColumns(fromMetaColumn: Int): Unit = js.native
    protected def _createColumnVisibilityCheckBoxHandler(col: Int): js.Function = js.native
    protected def _getMetaColumnAtColumnX(visXPos: Int): Int = js.native
    protected def _getMetaColumnAtPageX(pageX: Int): Int = js.native
    protected def _getPaneScrollerArr(): qx.ui.table.pane.Scroller[] = js.native
    protected def _initColumnMenu(): Unit = js.native
    protected def _onChangeLocale(evt: qx.event.type.Event): Unit = js.native
    protected def _onColOrderChanged(evt: IMap): Unit = js.native
    protected def _onColVisibilityChanged(evt: IMap): Unit = js.native
    protected def _onColWidthChanged(evt: IMap): Unit = js.native
    protected def _onFocusChanged(evt: IMap): Unit = js.native
    protected def _onKeyPress(evt: qx.event.type.KeySequence): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onScrollY(evt: IMap): Unit = js.native
    protected def _onSelectionChanged(evt: IMap): Unit = js.native
    protected def _onTableModelDataChanged(evt: IMap): Unit = js.native
    protected def _onTableModelMetaDataChanged(evt: IMap): Unit = js.native
    protected def _updateScrollBarVisibility(): Unit = js.native
    protected def _updateScrollerWidths(): Unit = js.native
    protected def _updateStatusBar(): Unit = js.native
    protected def _updateTableData(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int, removeStart: Int = ???, removeCount: Int = ???): Unit = js.native
    def blockHeaderElements(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def clearFocusedRowHighlight(evt: qx.event.type.Pointer): Unit = js.native
    def getAdditionalStatusBarText(): any = js.native
    def getAlwaysUpdateCells(): Boolean = js.native
    def getColumnVisibilityButtonVisible(): Boolean = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getDataRowRenderer(): qx.ui.table.IRowRenderer = js.native
    def getEmptyTableModel(): qx.ui.table.ITableModel = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getForceLineHeight(): Boolean = js.native
    def getHeaderCellHeight(): Int = js.native
    def getHeaderCellsVisible(): Boolean = js.native
    def getInitiallyHiddenColumns(): any = js.native
    def getKeepFirstVisibleRowComplete(): Boolean = js.native
    def getMetaColumnCounts(): any = js.native
    def getModalCellEditorPreOpenFunction(): js.Function = js.native
    def getNewColumnMenu(): js.Function = js.native
    def getNewSelectionManager(): js.Function = js.native
    def getNewSelectionModel(): js.Function = js.native
    def getNewTableColumnModel(): js.Function = js.native
    def getNewTablePane(): js.Function = js.native
    def getNewTablePaneHeader(): js.Function = js.native
    def getNewTablePaneModel(): js.Function = js.native
    def getNewTablePaneScroller(): js.Function = js.native
    def getPaneScroller(metaColumn: Int): qx.ui.table.pane.Scroller = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getRowFocusChangeModifiesSelection(): Boolean = js.native
    def getRowHeight(): Long = js.native
    def getSelectionManager(): qx.ui.table.selection.Manager = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getStatusBarVisible(): Boolean = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Basic = js.native
    def getTableModel(): qx.ui.table.ITableModel = js.native
    def getTablePaneScrollerAtPageX(pageX: Int): qx.ui.table.pane.Scroller = js.native
    def highlightFocusedRow(bHighlight: Boolean): Unit = js.native
    protected def initAdditionalStatusBarText(value: any): any = js.native
    protected def initAlwaysUpdateCells(value: any): Boolean = js.native
    protected def initColumnVisibilityButtonVisible(value: any): Boolean = js.native
    protected def initContextMenuFromDataCellsOnly(value: any): Boolean = js.native
    protected def initDataRowRenderer(value: any): qx.ui.table.IRowRenderer = js.native
    protected def initFocusCellOnPointerMove(value: any): Boolean = js.native
    protected def initForceLineHeight(value: any): Boolean = js.native
    protected def initHeaderCellHeight(value: any): Int = js.native
    protected def initHeaderCellsVisible(value: any): Boolean = js.native
    protected def initInitiallyHiddenColumns(value: any): any = js.native
    protected def initKeepFirstVisibleRowComplete(value: any): Boolean = js.native
    protected def initMetaColumnCounts(value: any): any = js.native
    protected def initModalCellEditorPreOpenFunction(value: any): js.Function = js.native
    protected def initNewColumnMenu(value: any): js.Function = js.native
    protected def initNewSelectionManager(value: any): js.Function = js.native
    protected def initNewSelectionModel(value: any): js.Function = js.native
    protected def initNewTableColumnModel(value: any): js.Function = js.native
    protected def initNewTablePane(value: any): js.Function = js.native
    protected def initNewTablePaneHeader(value: any): js.Function = js.native
    protected def initNewTablePaneModel(value: any): js.Function = js.native
    protected def initNewTablePaneScroller(value: any): js.Function = js.native
    protected def initResetSelectionOnHeaderTap(value: any): Boolean = js.native
    protected def initRowFocusChangeModifiesSelection(value: any): Boolean = js.native
    protected def initRowHeight(value: any): Long = js.native
    protected def initSelectionModel(value: any): qx.ui.table.selection.Model = js.native
    protected def initShowCellFocusIndicator(value: any): Boolean = js.native
    protected def initStatusBarVisible(value: any): Boolean = js.native
    protected def initTableModel(value: any): qx.ui.table.ITableModel = js.native
    def isAlwaysUpdateCells(): Boolean = js.native
    def isColumnVisibilityButtonVisible(): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): any = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isForceLineHeight(): Boolean = js.native
    def isHeaderCellsVisible(): Boolean = js.native
    def isKeepFirstVisibleRowComplete(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isRowFocusChangeModifiesSelection(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isStatusBarVisible(): Boolean = js.native
    def moveFocusedCell(deltaX: Int, deltaY: Int): Unit = js.native
    def resetAdditionalStatusBarText(): Unit = js.native
    def resetAlwaysUpdateCells(): Unit = js.native
    def resetCellFocus(): Unit = js.native
    def resetColumnVisibilityButtonVisible(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetDataRowRenderer(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetForceLineHeight(): Unit = js.native
    def resetHeaderCellHeight(): Unit = js.native
    def resetHeaderCellsVisible(): Unit = js.native
    def resetInitiallyHiddenColumns(): Unit = js.native
    def resetKeepFirstVisibleRowComplete(): Unit = js.native
    def resetMetaColumnCounts(): Unit = js.native
    def resetModalCellEditorPreOpenFunction(): Unit = js.native
    def resetNewColumnMenu(): Unit = js.native
    def resetNewSelectionManager(): Unit = js.native
    def resetNewSelectionModel(): Unit = js.native
    def resetNewTableColumnModel(): Unit = js.native
    def resetNewTablePane(): Unit = js.native
    def resetNewTablePaneHeader(): Unit = js.native
    def resetNewTablePaneModel(): Unit = js.native
    def resetNewTablePaneScroller(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetRowFocusChangeModifiesSelection(): Unit = js.native
    def resetRowHeight(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionModel(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetStatusBarVisible(): Unit = js.native
    def resetTableModel(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setAdditionalStatusBarText(value: any): any = js.native
    def setAlwaysUpdateCells(value: any): Boolean = js.native
    def setColumnVisibilityButtonVisible(value: any): Boolean = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: any): Boolean = js.native
    def setDataRowRenderer(value: any): qx.ui.table.IRowRenderer = js.native
    def setFocusCellOnPointerMove(value: any): Boolean = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, scrollVisible: Boolean = ???): Unit = js.native
    def setForceLineHeight(value: any): Boolean = js.native
    def setHeaderCellHeight(value: any): Int = js.native
    def setHeaderCellsVisible(value: any): Boolean = js.native
    def setInitiallyHiddenColumns(value: any): any = js.native
    def setKeepFirstVisibleRowComplete(value: any): Boolean = js.native
    def setMetaColumnCounts(value: any): any = js.native
    def setModalCellEditorPreOpenFunction(value: any): js.Function = js.native
    def setNewColumnMenu(value: any): js.Function = js.native
    def setNewSelectionManager(value: any): js.Function = js.native
    def setNewSelectionModel(value: any): js.Function = js.native
    def setNewTableColumnModel(value: any): js.Function = js.native
    def setNewTablePane(value: any): js.Function = js.native
    def setNewTablePaneHeader(value: any): js.Function = js.native
    def setNewTablePaneModel(value: any): js.Function = js.native
    def setNewTablePaneScroller(value: any): js.Function = js.native
    def setResetSelectionOnHeaderTap(value: any): Boolean = js.native
    def setRowFocusChangeModifiesSelection(value: any): Boolean = js.native
    def setRowHeight(value: any): Long = js.native
    def setSelectionModel(value: any): qx.ui.table.selection.Model = js.native
    def setShowCellFocusIndicator(value: any): Boolean = js.native
    def setStatusBarVisible(value: any): Boolean = js.native
    def setTableModel(value: any): qx.ui.table.ITableModel = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleAlwaysUpdateCells(): Boolean = js.native
    def toggleColumnVisibilityButtonVisible(): Boolean = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleForceLineHeight(): Boolean = js.native
    def toggleHeaderCellsVisible(): Boolean = js.native
    def toggleKeepFirstVisibleRowComplete(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleRowFocusChangeModifiesSelection(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleStatusBarVisible(): Boolean = js.native
    def unblockHeaderElements(): Unit = js.native
    def updateContent(): Unit = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.AbstractField")
class AbstractField extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native
    protected def _createEditor(): qx.ui.core.Widget = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initValidationFunction(value: any): js.Function = js.native
    def resetValidationFunction(): Unit = js.native
    def setValidationFunction(value: any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.CheckBox")
class CheckBox extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.ComboBox")
class ComboBox extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native
    def getListData(): qx.data.Array = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initListData(value: any): qx.data.Array = js.native
    protected def initValidationFunction(value: any): js.Function = js.native
    def resetListData(): Unit = js.native
    def resetValidationFunction(): Unit = js.native
    def setListData(value: any): qx.data.Array = js.native
    def setValidationFunction(value: any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.Dynamic")
class Dynamic extends qx.core.Object implements qx.ui.table.ICellEditorFactory {
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native
    constructor (cellEditorFactoryFunction: js.Function = ???);
    def getCellEditorFactoryFunction(): js.Function = js.native
    protected def initCellEditorFactoryFunction(value: any): js.Function = js.native
    def resetCellEditorFactoryFunction(): Unit = js.native
    def setCellEditorFactoryFunction(value: any): js.Function = js.native

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
    def createCellEditor(cellInfo: IMap): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): any = js.native
    def getListData(): qx.data.Array = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initListData(value: any): qx.data.Array = js.native
    protected def initValidationFunction(value: any): js.Function = js.native
    def resetListData(): Unit = js.native
    def resetValidationFunction(): Unit = js.native
    def setListData(value: any): qx.data.Array = js.native
    def setValidationFunction(value: any): js.Function = js.native

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
    def createDataCellHtml(cellInfo: IMap, htmlArr: String[]): Boolean = js.native
    constructor ();
    protected def _createStyleSheet(): Unit = js.native
    protected def _getCellAttributes(cellInfo: IMap): String = js.native
    protected def _getCellClass(cellInfo: IMap): String = js.native
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native
    protected def _getCellStyle(cellInfo: IMap): any = js.native
    protected def _getContentHtml(cellInfo: IMap): String = js.native
    protected def _onChangeTheme(): Unit = js.native
    def getDefaultCellStyle(): String = js.native
    protected def initDefaultCellStyle(value: any): String = js.native
    def resetDefaultCellStyle(): Unit = js.native
    def setDefaultCellStyle(value: any): String = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.AbstractImage")
class AbstractImage extends qx.ui.table.cellrenderer.Abstract {
    constructor ();
    protected def _getImageInfos(cellInfo: IMap): IMap = js.native
    protected def _identifyImage(cellInfo: IMap): IMap = js.native
    def getRepeat(): any = js.native
    protected def initRepeat(value: any): any = js.native
    def resetRepeat(): Unit = js.native
    def setRepeat(value: any): any = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Boolean")
class Boolean extends qx.ui.table.cellrenderer.AbstractImage {
    constructor ();
    protected def _applyIconFalse(value: String, old: String): Unit = js.native
    protected def _applyIconTrue(value: String, old: String): Unit = js.native
    def getIconFalse(): String = js.native
    def getIconTrue(): String = js.native
    protected def initIconFalse(value: any): String = js.native
    protected def initIconTrue(value: any): String = js.native
    def resetIconFalse(): Unit = js.native
    def resetIconTrue(): Unit = js.native
    def setIconFalse(value: any): String = js.native
    def setIconTrue(value: any): String = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Conditional")
class Conditional extends qx.ui.table.cellrenderer.Default {
    constructor (align: String = ???, color: String = ???, style: String = ???, weight: String = ???);
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Date")
class Date extends qx.ui.table.cellrenderer.Conditional {
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: any): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: any): qx.util.format.DateFormat = js.native

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
    protected def _formatValue(cellInfo: IMap): String = js.native
    protected def _getStyleFlags(cellInfo: IMap): Int = js.native
    def getUseAutoAlign(): Boolean = js.native
    protected def initUseAutoAlign(value: any): Boolean = js.native
    def isUseAutoAlign(): Boolean = js.native
    def resetUseAutoAlign(): Unit = js.native
    def setUseAutoAlign(value: any): Boolean = js.native
    def toggleUseAutoAlign(): Boolean = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Dynamic")
class Dynamic extends qx.ui.table.cellrenderer.Default {
    constructor (cellRendererFactoryFunction: js.Function = ???);
    def getCellRendererFactoryFunction(): js.Function = js.native
    protected def initCellRendererFactoryFunction(value: any): js.Function = js.native
    def resetCellRendererFactoryFunction(): Unit = js.native
    def setCellRendererFactoryFunction(value: any): js.Function = js.native

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
    constructor (width: Int = ???, height: Int = ???);

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Number")
class Number extends qx.ui.table.cellrenderer.Conditional {
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    protected def initNumberFormat(value: any): qx.util.format.NumberFormat = js.native
    def resetNumberFormat(): Unit = js.native
    def setNumberFormat(value: any): qx.util.format.NumberFormat = js.native

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
    def addReversedReplaceMap(): Boolean = js.native
    def getReplaceFunction(): js.Function = js.native
    def getReplaceMap(): any = js.native
    protected def initReplaceFunction(value: any): js.Function = js.native
    protected def initReplaceMap(value: any): any = js.native
    def resetReplaceFunction(): Unit = js.native
    def resetReplaceMap(): Unit = js.native
    def setReplaceFunction(value: any): js.Function = js.native
    def setReplaceMap(value: any): any = js.native

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
    def empty(): Unit = js.native
    def factory(item: String, options: IMap): qx.ui.core.Widget = js.native
    def getMenu(): any = js.native
    def resetMenu(): Unit = js.native
    def setMenu(value: any): any = js.native
    constructor ();
    def getBlocker(): qx.ui.core.Blocker = js.native

}
}
package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.MenuItem")
class MenuItem extends qx.ui.menu.CheckBox implements qx.ui.table.IColumnMenuItem {
    def getVisible(): any = js.native
    def resetVisible(): Unit = js.native
    def setVisible(value: any): any = js.native
    constructor (text: String = ???);
    protected def _applyVisible(value: Boolean, old: Boolean): Unit = js.native
    def toggleVisible(): Boolean = js.native

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Basic")
class Basic extends qx.core.Object {
    constructor ();
    protected def _getColToXPosMap(): IMap = js.native
    def getCellEditorFactory(col: Int): qx.ui.table.ICellEditorFactory = js.native
    def getColumnWidth(col: Int): Int = js.native
    def getDataCellRenderer(col: Int): qx.ui.table.ICellRenderer = js.native
    def getHeaderCellRenderer(col: Int): qx.ui.table.IHeaderRenderer = js.native
    def getOverallColumnAtX(overXPos: Int): Int = js.native
    def getOverallColumnCount(): Int = js.native
    def getOverallX(col: Int): Int = js.native
    def getVisibleColumnAtX(visXPos: Int): Int = js.native
    def getVisibleColumnCount(): Int = js.native
    def getVisibleColumns(): qx.data.Array = js.native
    def getVisibleX(col: Int): Int = js.native
    def init(colCount: Int, table: qx.ui.table.Table): Unit = js.native
    def isColumnVisible(col: Int): Boolean = js.native
    def moveColumn(fromOverXPos: Int, toOverXPos: Int): Unit = js.native
    def setCellEditorFactory(col: Int, factory: qx.ui.table.ICellEditorFactory): Unit = js.native
    def setColumnsOrder(newPositions: Int[]): Unit = js.native
    def setColumnVisible(col: Int, visible: Boolean): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setDataCellRenderer(col: Int, renderer: qx.ui.table.ICellRenderer): qx.ui.table.ICellRenderer = js.native
    def setHeaderCellRenderer(col: Int, renderer: qx.ui.table.IHeaderRenderer): Unit = js.native

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Resize")
class Resize extends qx.ui.table.columnmodel.Basic {
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: any = ???): String = js.native
    constructor ();
    protected def _addResetColumnWidthButton(event: qx.event.type.Data): Unit = js.native
    protected def _applyBehavior(value: qx.ui.table.columnmodel.resizebehavior.Abstract, old: qx.ui.table.columnmodel.resizebehavior.Abstract): Unit = js.native
    protected def _onappear(event: qx.event.type.Event): Unit = js.native
    protected def _oncolumnwidthchanged(event: qx.event.type.Data): Unit = js.native
    protected def _onTableWidthChanged(event: qx.event.type.Event): Unit = js.native
    protected def _onverticalscrollbarchanged(event: qx.event.type.Data): Unit = js.native
    protected def _onvisibilitychanged(event: qx.event.type.Data): Unit = js.native
    def getBehavior(): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def getTable(): qx.ui.table.Table = js.native
    protected def initBehavior(value: any): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def resetBehavior(): Unit = js.native
    def setBehavior(value: any): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Abstract")
class Abstract extends qx.core.Object {
    protected def _getAvailableWidth(): Int = js.native
    protected def _setNumColumns(numColumns: Int): Unit = js.native
    def onAppear(event: any, forceRefresh: Boolean = ???): Unit = js.native
    def onColumnWidthChanged(event: any): Unit = js.native
    def onTableWidthChanged(event: any): Unit = js.native
    def onVerticalScrollBarChanged(event: any): Unit = js.native
    def onVisibilityChanged(event: any): Unit = js.native

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Default")
class Default extends qx.ui.table.columnmodel.resizebehavior.Abstract {
    constructor ();
    protected def _computeColumnsFlexWidth(): Unit = js.native
    protected def _extendLastColumn(event: qx.event.type.Data): Unit = js.native
    protected def _extendNextColumn(event: qx.event.type.Data): Unit = js.native
    protected def _getResizeColumnData(): qx.ui.core.ColumnData[] = js.native
    def getInitializeWidthsOnEveryAppear(): Boolean = js.native
    def getLayoutChildren(): qx.ui.core.ColumnData[] = js.native
    def getNewResizeBehaviorColumnData(): js.Function = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Resize = js.native
    protected def initInitializeWidthsOnEveryAppear(value: any): Boolean = js.native
    protected def initNewResizeBehaviorColumnData(value: any): js.Function = js.native
    protected def initTableColumnModel(value: any): qx.ui.table.columnmodel.Resize = js.native
    def isInitializeWidthsOnEveryAppear(): Boolean = js.native
    def resetInitializeWidthsOnEveryAppear(): Unit = js.native
    def resetNewResizeBehaviorColumnData(): Unit = js.native
    def resetTableColumnModel(): Unit = js.native
    def set(col: Int, map: IMap): Unit = js.native
    def setInitializeWidthsOnEveryAppear(value: any): Boolean = js.native
    def setMaxWidth(col: Int, width: Int): Unit = js.native
    def setMinWidth(col: Int, width: Int): Unit = js.native
    def setNewResizeBehaviorColumnData(value: any): js.Function = js.native
    def setTableColumnModel(value: any): qx.ui.table.columnmodel.Resize = js.native
    def setWidth(col: Int, width: Int, flex: Int = ???): Unit = js.native
    def toggleInitializeWidthsOnEveryAppear(): Boolean = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Default")
class Default extends qx.core.Object implements qx.ui.table.IHeaderRenderer {
    def createHeaderCell(cellInfo: IMap): qx.ui.core.Widget = js.native
    def updateHeaderCell(cellInfo: IMap, cellWidget: qx.ui.core.Widget): Unit = js.native
    def getToolTip(): String = js.native
    protected def initToolTip(value: any): String = js.native
    def resetToolTip(): Unit = js.native
    def setToolTip(value: any): String = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.HeaderCell")
class HeaderCell extends qx.ui.container.Composite {
    constructor ();
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applySortIcon(value: String, old: String): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getSortIcon(): String = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initSortIcon(value: any): String = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetSortIcon(): Unit = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setSortIcon(value: any): String = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Icon")
class Icon extends qx.ui.table.headerrenderer.Default {
    constructor (iconUrl: String = ???, tooltip: String = ???);
    def getIconUrl(): String = js.native
    protected def initIconUrl(value: any): String = js.native
    def resetIconUrl(): Unit = js.native
    def setIconUrl(value: any): String = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Abstract")
class Abstract extends qx.core.Object implements qx.ui.table.ITableModel {
    def getColumnCount(): Int = js.native
    def getColumnId(columnIndex: Int): String = js.native
    def getColumnIndexById(columnId: String): Int = js.native
    def getColumnName(columnIndex: Int): String = js.native
    def getRowCount(): Int = js.native
    def getRowData(rowIndex: Int): any = js.native
    def getSortColumnIndex(): Int = js.native
    def getValue(columnIndex: Int, rowIndex: Int): any = js.native
    def getValueById(columnId: String, rowIndex: Int): any = js.native
    def isColumnEditable(columnIndex: Int): Boolean = js.native
    def isColumnSortable(columnIndex: Int): Boolean = js.native
    def isSortAscending(): Boolean = js.native
    def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit = js.native
    def setValue(columnIndex: Int, rowIndex: Int, value: any): Unit = js.native
    def setValueById(columnId: String, rowIndex: Int, value: any): Unit = js.native
    def sortByColumn(columnIndex: Int, ascending: Boolean): Unit = js.native
    constructor ();
    def init(table: qx.ui.table.Table): Unit = js.native
    def setColumnIds(columnIdArr: String[]): Unit = js.native
    def setColumnNamesById(columnNameMap: IMap): Unit = js.native
    def setColumnNamesByIndex(columnNameArr: String[]): Unit = js.native
    def setColumns(columnNameArr: String[], columnIdArr: String[] = ???): Unit = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Filtered")
class Filtered extends qx.ui.table.model.Simple {
    constructor ();
    protected def _js_in_array(the_needle: String, the_haystack: qx.data.Array): Boolean = js.native
    def addBetweenFilter(filter: String, value1: Int, value2: Int, target: String): Unit = js.native
    def addNotRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def addNumericFilter(filter: String, value1: Int, target: String): Unit = js.native
    def addRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def applyFilters(): Unit = js.native
    def hideRows(rowNum: Int, numOfRows: Int, dispatchEvent: Boolean = ???): Unit = js.native
    def resetHiddenRows(): Unit = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Remote")
class Remote extends qx.ui.table.model.Abstract {
    constructor ();
    protected def _cancelCurrentRequest(): Boolean = js.native
    protected def _getIgnoreCurrentRequest(): Boolean = js.native
    protected def _loadRowCount(): Unit = js.native
    protected def _loadRowData(firstRow: Int, lastRow: Int): Unit = js.native
    protected def _onRowCountLoaded(rowCount: Int): Unit = js.native
    protected def _onRowDataLoaded(rowDataArr: IMap[]): Unit = js.native
    protected def _setRowBlockData(block: Int, rowDataArr: any[]): Unit = js.native
    def clearCache(): Unit = js.native
    def getBlockConcurrentLoadRowCount(): Boolean = js.native
    def getBlockSize(): Int = js.native
    def getCacheContent(): IMap = js.native
    def getClearCacheOnRemove(): Boolean = js.native
    def getMaxCachedBlockCount(): Int = js.native
    protected def initBlockConcurrentLoadRowCount(value: any): Boolean = js.native
    protected def initBlockSize(value: any): Int = js.native
    protected def initClearCacheOnRemove(value: any): Boolean = js.native
    protected def initMaxCachedBlockCount(value: any): Int = js.native
    def isBlockConcurrentLoadRowCount(): Boolean = js.native
    def isClearCacheOnRemove(): Boolean = js.native
    def iterateCachedRows(iterator: js.Function, object: any): Unit = js.native
    def reloadData(): Unit = js.native
    def removeRow(rowIndex: Int): Unit = js.native
    def resetBlockConcurrentLoadRowCount(): Unit = js.native
    def resetBlockSize(): Unit = js.native
    def resetClearCacheOnRemove(): Unit = js.native
    def resetMaxCachedBlockCount(): Unit = js.native
    def restoreCacheContent(cacheContent: IMap): Unit = js.native
    def setBlockConcurrentLoadRowCount(value: any): Boolean = js.native
    def setBlockSize(value: any): Int = js.native
    def setClearCacheOnRemove(value: any): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setMaxCachedBlockCount(value: any): Int = js.native
    def setSortAscendingWithoutSortingData(sortAscending: Boolean): Unit = js.native
    def setSortColumnIndexWithoutSortingData(sortColumnIndex: Int): Unit = js.native
    def toggleBlockConcurrentLoadRowCount(): Boolean = js.native
    def toggleClearCacheOnRemove(): Boolean = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Simple")
class Simple extends qx.ui.table.model.Abstract {
    constructor ();
    protected static def _defaultSortComparatorAscending(row1: any, row2: any): Int = js.native
    protected static def _defaultSortComparatorDescending(row1: any, row2: any): Int = js.native
    protected static def _defaultSortComparatorInsensitiveAscending(row1: any, row2: any): Int = js.native
    protected static def _defaultSortComparatorInsensitiveDescending(row1: any, row2: any): Int = js.native
    protected def _mapArray2RowArr(mapArr: IMap[], rememberMaps: Boolean = ???): any[] = js.native
    protected def _setSortAscending(ascending: Boolean): Unit = js.native
    protected def _setSortColumnIndex(columnIndex: Int): Unit = js.native
    def addRows(rowArr: any[], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def addRowsAsMapArray(mapArr: IMap[], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def clearSorting(): Unit = js.native
    def getCaseSensitiveSorting(): Boolean = js.native
    def getData(): any[] = js.native
    def getDataAsMapArray(): IMap[] = js.native
    def getRowDataAsMap(rowIndex: Int): IMap = js.native
    def getSortMethods(columnIndex: Int): IMap = js.native
    protected def initCaseSensitiveSorting(value: any): Boolean = js.native
    def isCaseSensitiveSorting(): Boolean = js.native
    def removeRows(startIndex: Int, howMany: Int, clearSorting: Boolean = ???): Unit = js.native
    def resetCaseSensitiveSorting(): Unit = js.native
    def setCaseSensitiveSorting(value: any): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setData(rowArr: any[], clearSorting: Boolean = ???): Unit = js.native
    def setDataAsMapArray(mapArr: IMap[], rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setRows(rowArr: any[], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def setRowsAsMapArray(mapArr: IMap[], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setSortMethods(columnIndex: Int, compare: js.Function): Unit = js.native
    def toggleCaseSensitiveSorting(): Boolean = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.CellEvent")
class CellEvent extends qx.event.type.Pointer {
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: any): Int = js.native
    protected def initRow(value: any): Int = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: any): Int = js.native
    def setRow(value: any): Int = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Clipper")
class Clipper extends qx.ui.container.Composite {
    constructor ();
    def scrollToX(value: Int): Unit = js.native
    def scrollToY(value: Int): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.FocusIndicator")
class FocusIndicator extends qx.ui.container.Composite {
    constructor (scroller: any = ???);
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: any): Int = js.native
    protected def initRow(value: any): Int = js.native
    def moveToCell(col: Int = ???, row: Int = ???): Unit = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: any): Int = js.native
    def setRow(value: any): Int = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Header")
class Header extends qx.ui.core.Widget {
    constructor (paneScroller: qx.ui.table.pane.Scroller = ???);
    protected def _cleanUpCells(): Unit = js.native
    protected def _updateContent(completeUpdate: Boolean): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getHeaderWidgetAtColumn(col: Int): qx.ui.table.headerrenderer.HeaderCell = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    def isShowingColumnMoveFeedback(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setPointerOverColumn(col: Int): Unit = js.native
    def showColumnMoveFeedback(col: Int, x: Int): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Model")
class Model extends qx.core.Object {
    constructor (tableColumnModel: qx.ui.table.columnmodel.Basic = ???);
    protected def _applyFirstColumnX(value: Int, old: Int): Unit = js.native
    protected def _applyMaxColumnCount(value: Long, old: Long): Unit = js.native
    protected def _onColVisibilityChanged(evt: IMap): Unit = js.native
    protected def _onHeaderCellRendererChanged(evt: IMap): Unit = js.native
    def getColumnAtX(xPos: Int): Int = js.native
    def getColumnCount(): Int = js.native
    def getColumnLeft(col: Int): any = js.native
    def getFirstColumnX(): Int = js.native
    def getMaxColumnCount(): Long = js.native
    def getTotalWidth(): Int = js.native
    def getX(col: Int): Int = js.native
    protected def initFirstColumnX(value: any): Int = js.native
    protected def initMaxColumnCount(value: any): Long = js.native
    def resetFirstColumnX(): Unit = js.native
    def resetMaxColumnCount(): Unit = js.native
    def setFirstColumnX(value: any): Int = js.native
    def setMaxColumnCount(value: any): Long = js.native
    def setTableColumnModel(tableColumnModel: qx.ui.table.columnmodel.Basic): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Pane")
class Pane extends qx.ui.core.Widget {
    constructor (paneScroller: qx.ui.table.pane.Scroller = ???);
    protected def _applyFirstVisibleRow(value: Long, old: Long): Unit = js.native
    protected def _applyMaxCacheLines(value: Long, old: Long): Unit = js.native
    protected def _applyVisibleRowCount(value: Long, old: Long): Unit = js.native
    protected def _getRowsHtml(firstRow: Int, rowCount: Int): String = js.native
    protected def _scrollContent(rowOffset: Int): Unit = js.native
    protected def _updateAllRows(): Unit = js.native
    protected def _updateRowStyles(onlyRow: Int = ???): Unit = js.native
    def getFirstVisibleRow(): Long = js.native
    def getMaxCacheLines(): Long = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getVisibleRowCount(): Long = js.native
    protected def initFirstVisibleRow(value: any): Long = js.native
    protected def initMaxCacheLines(value: any): Long = js.native
    protected def initVisibleRowCount(value: any): Long = js.native
    def onColOrderChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetFirstVisibleRow(): Unit = js.native
    def resetMaxCacheLines(): Unit = js.native
    def resetVisibleRowCount(): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setFirstVisibleRow(value: any): Long = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, massUpdate: Boolean = ???): Unit = js.native
    def setMaxCacheLines(value: any): Long = js.native
    def setVisibleRowCount(value: any): Long = js.native
    def updateContent(completeUpdate: Boolean = ???, scrollOffset: Int = ???, onlyRow: Int = ???, onlySelectionOrFocusChanged: Boolean = ???): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Scroller")
class Scroller extends qx.ui.core.Widget {
    constructor (table: qx.ui.table.Table = ???);
    protected def _applyHorizontalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollTimeout(value: Int, old: Int): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTablePaneModel(value: qx.ui.table.pane.Model, old: qx.ui.table.pane.Model): Unit = js.native
    protected def _applyVerticalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _createHeaderClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _createPaneClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _focusCellAtPagePos(pageX: Int, pageY: Int): Unit = js.native
    protected def _getColumnForPageX(pageX: Int): Int = js.native
    protected def _getResizeColumnForPageX(pageX: Int): Int = js.native
    protected def _getRowForPagePos(pageX: Int, pageY: Int): Int = js.native
    protected def _hideResizeLine(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onCellEditorModalWindowClose(e: IMap): Unit = js.native
    protected def _onChangeCaptureHeader(e: qx.event.type.Data): Unit = js.native
    protected def _onContextMenu(e: qx.event.type.Pointer): Unit = js.native
    protected def _onDbltapPane(e: IMap): Unit = js.native
    protected def _onDisappear(): Unit = js.native
    protected def _oninterval(): Unit = js.native
    protected def _onPaneModelChanged(): Unit = js.native
    protected def _onPointerdownHeader(e: IMap): Unit = js.native
    protected def _onPointerdownPane(e: IMap): Unit = js.native
    protected def _onPointermoveHeader(e: IMap): Unit = js.native
    protected def _onPointermovePane(e: IMap): Unit = js.native
    protected def _onPointerout(e: IMap): Unit = js.native
    protected def _onPointerupFocusIndicator(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerupHeader(e: IMap): Unit = js.native
    protected def _onResizePane(): Unit = js.native
    protected def _onRoll(e: qx.event.type.Roll): Unit = js.native
    protected def _onScrollX(e: IMap): Unit = js.native
    protected def _onScrollY(e: IMap): Unit = js.native
    protected def _onTapHeader(e: IMap): Unit = js.native
    protected def _onTapPane(e: IMap): Unit = js.native
    protected def _postponedUpdateContent(): Unit = js.native
    protected def _showResizeLine(x: Int): Unit = js.native
    protected def _startInterval(timeout: Int): Unit = js.native
    protected def _startMoveHeader(moveCol: Int, pageX: Int): Unit = js.native
    protected def _startResizeHeader(resizeCol: Int, pageX: Int): Unit = js.native
    protected def _stopInterval(): Unit = js.native
    protected def _stopMoveHeader(): Unit = js.native
    protected def _stopResizeHeader(): Unit = js.native
    protected def _updateContent(): Unit = js.native
    protected def _updateFocusIndicator(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def flushEditor(): Unit = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getHeader(): qx.ui.table.pane.Header = js.native
    def getHorizontalScrollBarVisible(): Boolean = js.native
    def getLiveResize(): Boolean = js.native
    def getNeededScrollBars(forceHorizontal: Boolean = ???, preventVertical: Boolean = ???): Int = js.native
    def getPaneClipper(): qx.ui.table.pane.Clipper = js.native
    def getPaneInsetRight(): Int = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getScrollAreaContainer(): qx.ui.table.pane.Clipper = js.native
    def getScrollTimeout(): Int = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getSelectBeforeFocus(): Boolean = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getTablePane(): qx.ui.table.pane.Pane = js.native
    def getTablePaneModel(): qx.ui.table.pane.Model = js.native
    def getTopRightWidget(): qx.ui.core.Widget = js.native
    def getVerticalScrollBarVisible(): Boolean = js.native
    def getVerticalScrollBarWidth(): Int = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    protected def initContextMenuFromDataCellsOnly(value: any): Boolean = js.native
    protected def initFocusCellOnPointerMove(value: any): Boolean = js.native
    protected def initHorizontalScrollBarVisible(value: any): Boolean = js.native
    protected def initLiveResize(value: any): Boolean = js.native
    protected def initResetSelectionOnHeaderTap(value: any): Boolean = js.native
    protected def initScrollTimeout(value: any): Int = js.native
    protected def initSelectBeforeFocus(value: any): Boolean = js.native
    protected def initShowCellFocusIndicator(value: any): Boolean = js.native
    protected def initTablePaneModel(value: any): qx.ui.table.pane.Model = js.native
    protected def initVerticalScrollBarVisible(value: any): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): any = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isHorizontalScrollBarVisible(): Boolean = js.native
    def isLiveResize(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isSelectBeforeFocus(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isVerticalScrollBarVisible(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onColVisibilityChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onKeepFirstVisibleRowCompleteChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetHorizontalScrollBarVisible(): Unit = js.native
    def resetLiveResize(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetScrollTimeout(): Unit = js.native
    def resetSelectBeforeFocus(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetTablePaneModel(): Unit = js.native
    def resetVerticalScrollBarVisible(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: any): Boolean = js.native
    def setFocusCellOnPointerMove(value: any): Boolean = js.native
    def setFocusedCell(col: Int, row: Int): Unit = js.native
    def setHorizontalScrollBarVisible(value: any): Boolean = js.native
    def setLiveResize(value: any): Boolean = js.native
    def setPaneWidth(width: Int): Unit = js.native
    def setResetSelectionOnHeaderTap(value: any): Boolean = js.native
    def setScrollTimeout(value: any): Int = js.native
    def setScrollX(scrollX: Int): Unit = js.native
    def setScrollY(scrollY: Int, renderSync: Boolean = ???): Unit = js.native
    def setSelectBeforeFocus(value: any): Boolean = js.native
    def setShowCellFocusIndicator(value: any): Boolean = js.native
    def setTablePaneModel(value: any): qx.ui.table.pane.Model = js.native
    def setTopRightWidget(widget: qx.ui.core.Widget): Unit = js.native
    def setVerticalScrollBarVisible(value: any): Boolean = js.native
    def showColumnMoveFeedback(pageX: Int): Int = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleHorizontalScrollBarVisible(): Boolean = js.native
    def toggleLiveResize(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleSelectBeforeFocus(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleVerticalScrollBarVisible(): Boolean = js.native
    def updateHorScrollBarMaximum(): Unit = js.native
    def updateVerScrollBarMaximum(): Unit = js.native

}
}
package qx.ui.table.rowrenderer {
@js.native
@JSName("qx.ui.table.rowrenderer.Default")
class Default extends qx.core.Object implements qx.ui.table.IRowRenderer {
    def createRowStyle(rowInfo: IMap): Unit = js.native
    def getRowClass(rowInfo: IMap): Unit = js.native
    def getRowHeightStyle(height: Int): Unit = js.native
    def updateDataRowElement(rowInfo: IMap, rowElement: HTMLElement): Unit = js.native
    constructor ();
    protected def _renderFont(font: qx.bom.Font): Unit = js.native
    def getHighlightFocusRow(): Boolean = js.native
    def getRowAttributes(rowInfo: any): String = js.native
    protected def initHighlightFocusRow(value: any): Boolean = js.native
    def initThemeValues(): Unit = js.native
    def isHighlightFocusRow(): Boolean = js.native
    def resetHighlightFocusRow(): Unit = js.native
    def setHighlightFocusRow(value: any): Boolean = js.native
    def toggleHighlightFocusRow(): Boolean = js.native

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Manager")
class Manager extends qx.core.Object {
    constructor ();
    protected def _handleSelectEvent(index: Int, evt: IMap): Unit = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def handleMoveKeyDown(index: Int, evt: IMap): Unit = js.native
    def handleSelectKeyDown(index: Int, evt: IMap): Unit = js.native
    def handleTap(index: Int, evt: qx.event.type.Tap): Unit = js.native
    protected def initSelectionModel(value: any): qx.ui.table.selection.Model = js.native
    def resetSelectionModel(): Unit = js.native
    def setSelectionModel(value: any): qx.ui.table.selection.Model = js.native

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Model")
class Model extends qx.core.Object {
    constructor ();
    protected def _addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    protected def _applySelectionMode(selectionMode: any, old: any): Unit = js.native
    protected def _dumpRanges(): Unit = js.native
    protected def _fireChangeSelection(): Unit = js.native
    protected def _getSelectedRangeArr(): IMap[] = js.native
    protected def _resetSelection(): Unit = js.native
    protected def _setAnchorSelectionIndex(index: Int): Unit = js.native
    protected def _setLeadSelectionIndex(index: Int): Unit = js.native
    def addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def getAnchorSelectionIndex(): Int = js.native
    def getLeadSelectionIndex(): Int = js.native
    def getSelectedCount(): Int = js.native
    def getSelectedRanges(): IMap[] = js.native
    def getSelectionMode(): any = js.native
    def hasBatchMode(): Boolean = js.native
    protected def initSelectionMode(value: any): any = js.native
    def isSelectedIndex(index: Int): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def iterateSelection(iterator: js.Function, object: any = ???): Unit = js.native
    def removeSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setBatchMode(batchMode: Boolean): Boolean = js.native
    def setSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def setSelectionMode(value: any): any = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.Page")
class Page extends qx.ui.container.Composite {
    constructor (label: String = ???, icon: String = ???);
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onButtonClose(): Unit = js.native
    def getButton(): qx.ui.form.RadioButton = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initShowCloseButton(value: any): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetShowCloseButton(): Unit = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setShowCloseButton(value: any): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabButton")
class TabButton extends qx.ui.form.RadioButton implements qx.ui.form.IRadioItem {
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    constructor ();
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onCloseButtonTap(): Unit = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initShowCloseButton(value: any): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetShowCloseButton(): Unit = js.native
    def setShowCloseButton(value: any): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabView")
class TabView extends qx.ui.core.Widget implements qx.ui.core.ISingleSelection {
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    constructor (barPosition: String = ???);
    protected def _applyBarPosition(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onBeforeChangeSelection(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeSelection(e: qx.event.type.Data): Unit = js.native
    protected def _onPageClose(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRadioChangeSelection(e: qx.event.type.Data): Unit = js.native
    def add(page: qx.ui.tabview.Page): Unit = js.native
    def addAt(page: qx.ui.tabview.Page, index: Int = ???): Unit = js.native
    def getBarPosition(): any = js.native
    def getChildren(): qx.ui.tabview.Page[] = js.native
    def indexOf(page: qx.ui.tabview.Page): Int = js.native
    protected def initBarPosition(value: any): any = js.native
    def remove(page: qx.ui.tabview.Page): Unit = js.native
    def resetBarPosition(): Unit = js.native
    def setBarPosition(value: any): any = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Button")
class Button extends qx.ui.form.Button {
    constructor (label: js.Any = ???, icon: js.Any = ???, command: js.Any = ???);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.CheckBox")
class CheckBox extends qx.ui.form.ToggleButton {
    constructor (label: js.Any = ???, icon: js.Any = ???);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.MenuButton")
class MenuButton extends qx.ui.menubar.Button {
    protected def _applyShowArrow(value: Boolean, old: Boolean): Unit = js.native
    def getShowArrow(): Boolean = js.native
    protected def initShowArrow(value: any): Boolean = js.native
    def isShowArrow(): Boolean = js.native
    def resetShowArrow(): Unit = js.native
    def setShowArrow(value: any): Boolean = js.native
    def toggleShowArrow(): Boolean = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Part")
class Part extends qx.ui.core.Widget {
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor ();
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    def addSeparator(): Unit = js.native
    def getMenuButtons(): qx.data.Array = js.native
    def getShow(): any = js.native
    def getSpacing(): Int = js.native
    protected def initShow(value: any): any = js.native
    protected def initSpacing(value: any): Int = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setShow(value: any): any = js.native
    def setSpacing(value: any): Int = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.PartContainer")
class PartContainer extends qx.ui.container.Composite {
    constructor ();
    def getShow(): any = js.native
    protected def initShow(value: any): any = js.native
    def resetShow(): Unit = js.native
    def setShow(value: any): any = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.RadioButton")
class RadioButton extends qx.ui.toolbar.CheckBox implements qx.ui.form.IModel,qx.ui.form.IRadioItem {
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native

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
    constructor (label: js.Any = ???, icon: js.Any = ???, menu: js.Any = ???, command: js.Any = ???);

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.ToolBar")
class ToolBar extends qx.ui.core.Widget {
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor ();
    protected def _applyOverflowHandling(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOverflowIndicator(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyShow(value: any, old: any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _getNextToHide(): qx.ui.core.Widget = js.native
    def _isAllowMenuOpenHover(): Boolean = js.native
    protected def _onResize(e: qx.event.type.Data): Unit = js.native
    protected def _recalculateOverflow(width: Int = ???, requiredWidth: Int = ???): Unit = js.native
    def _setAllowMenuOpenHover(value: Boolean): Unit = js.native
    def addSeparator(): Unit = js.native
    def addSpacer(): qx.ui.core.Spacer = js.native
    def getMenuButtons(): qx.data.Array = js.native
    def getOpenMenu(): qx.ui.menu.Menu = js.native
    def getOverflowHandling(): Boolean = js.native
    def getOverflowIndicator(): qx.ui.core.Widget = js.native
    def getShow(): any = js.native
    def getSpacing(): Int = js.native
    protected def initOpenMenu(value: any): qx.ui.menu.Menu = js.native
    protected def initOverflowHandling(value: any): Boolean = js.native
    protected def initOverflowIndicator(value: any): qx.ui.core.Widget = js.native
    protected def initShow(value: any): any = js.native
    protected def initSpacing(value: any): Int = js.native
    def isOverflowHandling(): Boolean = js.native
    def resetOpenMenu(): Unit = js.native
    def resetOverflowHandling(): Unit = js.native
    def resetOverflowIndicator(): Unit = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setOpenMenu(value: any): qx.ui.menu.Menu = js.native
    def setOverflowHandling(value: any): Boolean = js.native
    def setOverflowIndicator(value: any): qx.ui.core.Widget = js.native
    def setRemovePriority(item: qx.ui.core.Widget, priority: Int, override: Boolean): Unit = js.native
    def setShow(value: any): any = js.native
    def setSpacing(value: any): Int = js.native
    def toggleOverflowHandling(): Boolean = js.native

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.Manager")
class Manager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.ui.tooltip.Manager = js.native
    protected def _applyCurrent(value: qx.ui.tooltip.ToolTip, old: qx.ui.tooltip.ToolTip): Unit = js.native
    def getCurrent(): qx.ui.tooltip.ToolTip = js.native
    def getSharedErrorTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getSharedTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getShowInvalidToolTips(): Boolean = js.native
    def getShowToolTips(): Boolean = js.native
    protected def initCurrent(value: any): qx.ui.tooltip.ToolTip = js.native
    protected def initShowInvalidToolTips(value: any): Boolean = js.native
    protected def initShowToolTips(value: any): Boolean = js.native
    def isShowInvalidToolTips(): Boolean = js.native
    def isShowToolTips(): Boolean = js.native
    def resetCurrent(): Unit = js.native
    def resetShowInvalidToolTips(): Unit = js.native
    def resetShowToolTips(): Unit = js.native
    def setCurrent(value: any): qx.ui.tooltip.ToolTip = js.native
    def setShowInvalidToolTips(value: any): Boolean = js.native
    def setShowToolTips(value: any): Boolean = js.native
    def showToolTip(target: any): Unit = js.native
    def toggleShowInvalidToolTips(): Boolean = js.native
    def toggleShowToolTips(): Boolean = js.native

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.ToolTip")
class ToolTip extends qx.ui.popup.Popup {
    constructor (label: String = ???, icon: String = ???);
    protected def _applyArrowPosition(value: any, old: any): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _onPointerOver(e: qx.event.type.Pointer): Unit = js.native
    def getArrowPosition(): any = js.native
    def getHideTimeout(): Int = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getShowTimeout(): Int = js.native
    protected def initArrowPosition(value: any): any = js.native
    protected def initHideTimeout(value: any): Int = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initOpener(value: any): qx.ui.core.Widget = js.native
    protected def initRich(value: any): Boolean = js.native
    protected def initShowTimeout(value: any): Int = js.native
    def isRich(): Boolean = js.native
    def resetArrowPosition(): Unit = js.native
    def resetHideTimeout(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShowTimeout(): Unit = js.native
    def setArrowPosition(value: any): any = js.native
    def setHideTimeout(value: any): Int = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setOpener(value: any): qx.ui.core.Widget = js.native
    def setRich(value: any): Boolean = js.native
    def setShowTimeout(value: any): Int = js.native
    def toggleRich(): Boolean = js.native

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.Tree")
class Tree extends qx.ui.core.scroll.AbstractScrollArea implements qx.ui.core.IMultiSelection,qx.ui.form.IModelSelection,qx.ui.form.IForm {
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def selectAll(): Unit = js.native
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectables(all: Boolean): qx.ui.core.Widget[] = js.native
    def getSelection(): qx.ui.core.Widget[] = js.native
    def getSelectionContext(): String = js.native
    def getSelectionMode(): any = js.native
    def getSortedSelection(): qx.ui.core.Widget[] = js.native
    def invertSelection(): Unit = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def selectRange(begin: qx.ui.core.Widget, end: qx.ui.core.Widget): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelection(items: qx.ui.core.Widget[]): Unit = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    constructor ();
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenMode(value: any, old: any): Unit = js.native
    protected def _applyRoot(value: qx.ui.tree.core.AbstractTreeItem, old: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    protected def _applyRootOpenClose(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onChangeSelection(e: qx.event.type.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onOpen(e: qx.event.type.Pointer): Unit = js.native
    def getChildren(): qx.ui.tree.core.AbstractTreeItem[] = js.native
    def getHideRoot(): Boolean = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem[] = js.native
    def getNextNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getNextSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getOpenMode(): any = js.native
    def getPreviousNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getPreviousSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRoot(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRootOpenClose(): Boolean = js.native
    def getTreeItem(widget: qx.ui.core.Widget): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initHideRoot(value: any): Boolean = js.native
    protected def initOpenMode(value: any): any = js.native
    protected def initRoot(value: any): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initRootOpenClose(value: any): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isRootOpenClose(): Boolean = js.native
    def resetHideRoot(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetRoot(): Unit = js.native
    def resetRootOpenClose(): Unit = js.native
    def setHideRoot(value: any): Boolean = js.native
    def setOpenMode(value: any): any = js.native
    def setRoot(value: any): qx.ui.tree.core.AbstractTreeItem = js.native
    def setRootOpenClose(value: any): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleRootOpenClose(): Boolean = js.native

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
    def closeNode(node: qx.core.Object): Unit = js.native
    def closeNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    def getLevel(row: Int): Int = js.native
    def getLookupTable(): qx.data.Array = js.native
    def getSelection(): qx.data.Array = js.native
    def hasChildren(node: qx.core.Object): Boolean = js.native
    def isNode(item: qx.core.Object): Boolean = js.native
    def isNodeOpen(node: qx.core.Object): Boolean = js.native
    def isShowTopLevelOpenCloseIcons(): Boolean = js.native
    def openNode(node: qx.core.Object): Unit = js.native
    def openNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native
    def getAutoScrollIntoView(): Boolean = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectionMode(): any = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setAutoScrollIntoView(value: Boolean): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    constructor (model: qx.core.Object = ???, labelPath: String = ???, childProperty: String = ???);
    protected def _afterApplySelection(): Unit = js.native
    protected def _applyChildProperty(value: String, old: String): Unit = js.native
    protected def _applyDelegate(value: any, old: any): Unit = js.native
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyIconOptions(value: any, old: any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: any, old: any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyOpenMode(value: any, old: any): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyShowLeafs(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowTopLevelOpenCloseIcons(value: Boolean, old: Boolean): Unit = js.native
    protected def _beforeApplySelection(newSelection: qx.data.Array): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getDataFromRow(row: Int): any = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _onChangeBubble(event: qx.event.type.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.type.KeySequence): Unit = js.native
    protected def _onOpen(event: qx.ui.virtual.core.CellEvent): Unit = js.native
    protected def _onUpdated(event: qx.event.type.Event): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    def buildLookupTable(): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): any = js.native
    def getHideRoot(): Boolean = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.core.Object = js.native
    def getOpenMode(): any = js.native
    def getOpenNodes(): qx.data.Array = js.native
    def getParent(item: qx.core.Object): qx.core.Object = js.native
    def getShowLeafs(): Boolean = js.native
    def getShowTopLevelOpenCloseIcons(): Boolean = js.native
    protected def initChildProperty(value: any): String = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initHideRoot(value: any): Boolean = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initItemHeight(value: any): Int = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    protected def initModel(value: any): qx.core.Object = js.native
    protected def initOpenMode(value: any): any = js.native
    protected def initShowLeafs(value: any): Boolean = js.native
    protected def initShowTopLevelOpenCloseIcons(value: any): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isShowLeafs(): Boolean = js.native
    def openNodeAndParents(node: qx.core.Object): Unit = js.native
    def refresh(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetHideRoot(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetShowLeafs(): Unit = js.native
    def resetShowTopLevelOpenCloseIcons(): Unit = js.native
    def setChildProperty(value: any): String = js.native
    def setDelegate(value: any): any = js.native
    def setHideRoot(value: any): Boolean = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setItemHeight(value: any): Int = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native
    def setModel(value: any): qx.core.Object = js.native
    def setOpenMode(value: any): any = js.native
    def setShowLeafs(value: any): Boolean = js.native
    def setShowTopLevelOpenCloseIcons(value: any): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleShowLeafs(): Boolean = js.native
    def toggleShowTopLevelOpenCloseIcons(): Boolean = js.native

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTreeItem")
class VirtualTreeItem extends qx.ui.tree.core.AbstractItem {
    protected def _applyModel(value: any, old: any): Unit = js.native
    protected def _onChangeChildProperty(e: qx.event.type.Data): Unit = js.native
    protected def _onChangeLength(): Unit = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractItem")
class AbstractItem extends qx.ui.core.Widget implements qx.ui.form.IModel {
    def getModel(): any = js.native
    def resetModel(): Unit = js.native
    def setModel(value: any): Unit = js.native
    constructor (label: String = ???);
    protected def _addWidgets(): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconOpened(value: String, old: String): Unit = js.native
    protected def _applyIndent(value: Int, old: Int): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenSymbolMode(value: any, old: any): Unit = js.native
    protected def _onChangeOpen(e: qx.event.type.Data): Unit = js.native
    protected def _shouldShowOpenSymbol(): Boolean = js.native
    protected def _updateIndent(): Unit = js.native
    def addIcon(): Unit = js.native
    def addLabel(text: String = ???): Unit = js.native
    def addOpenButton(): Unit = js.native
    def addSpacer(): Unit = js.native
    def addWidget(widget: qx.ui.core.Widget, options: IMap = ???): Unit = js.native
    def getIcon(): String = js.native
    def getIconOpened(): String = js.native
    def getIndent(): Int = js.native
    def getLabel(): String = js.native
    def getLevel(): Int = js.native
    def getOpen(): Boolean = js.native
    def getOpenSymbolMode(): any = js.native
    def hasChildren(): Boolean = js.native
    protected def initIcon(value: any): String = js.native
    protected def initIconOpened(value: any): String = js.native
    protected def initIndent(value: any): Int = js.native
    protected def initLabel(value: any): String = js.native
    protected def initOpen(value: any): Boolean = js.native
    protected def initOpenSymbolMode(value: any): any = js.native
    def isOpen(): Boolean = js.native
    def isOpenable(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetIconOpened(): Unit = js.native
    def resetIndent(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpen(): Unit = js.native
    def resetOpenSymbolMode(): Unit = js.native
    def setIcon(value: any): String = js.native
    def setIconOpened(value: any): String = js.native
    def setIndent(value: any): Int = js.native
    def setLabel(value: any): String = js.native
    def setOpen(value: any): Boolean = js.native
    def setOpenSymbolMode(value: any): any = js.native
    def toggleOpen(): Boolean = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractTreeItem")
class AbstractTreeItem extends qx.ui.tree.core.AbstractItem {
    constructor (label: js.Any = ???);
    def add(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def addAfter(treeItem: qx.ui.tree.core.AbstractTreeItem, after: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addAt(treeItem: qx.ui.tree.core.AbstractTreeItem, index: Int): Unit = js.native
    def addAtBegin(treeItem: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addBefore(treeItem: qx.ui.tree.core.AbstractTreeItem, before: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def getChildren(): qx.ui.tree.core.AbstractTreeItem[] = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???, ignoreFirst: Boolean = ???): qx.ui.tree.core.AbstractTreeItem[] = js.native
    def getParent(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getParentChildrenContainer(): qx.ui.core.Widget = js.native
    def getTree(): qx.ui.tree.Tree = js.native
    def hasChildrenContainer(): Boolean = js.native
    protected def initParent(value: any): qx.ui.tree.core.AbstractTreeItem = js.native
    def recursiveAddToWidgetQueue(): Unit = js.native
    def remove(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def removeAll(): Unit = js.native
    def removeAt(index: Int): Unit = js.native
    def resetParent(): Unit = js.native
    def setParent(value: any): qx.ui.tree.core.AbstractTreeItem = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.FolderOpenButton")
class FolderOpenButton extends qx.ui.basic.Image {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def resetCommand(): Unit = js.native
    def setCommand(value: any): qx.ui.command.Command = js.native
    constructor ();
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _stopPropagation(e: qx.event.type.Event): Unit = js.native
    def getOpen(): Boolean = js.native
    protected def initOpen(value: any): Boolean = js.native
    def isOpen(): Boolean = js.native
    def resetOpen(): Unit = js.native
    def setOpen(value: any): Boolean = js.native
    def toggleOpen(): Boolean = js.native

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTree extends js.Object {
    def closeNode(node: qx.core.Object): Unit = js.native
    def closeNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    def getLevel(row: Int): Int = js.native
    def getLookupTable(): qx.data.Array = js.native
    def getSelection(): qx.data.Array = js.native
    def hasChildren(node: qx.core.Object): Boolean = js.native
    def isNode(item: qx.core.Object): Boolean = js.native
    def isNodeOpen(node: qx.core.Object): Boolean = js.native
    def isShowTopLevelOpenCloseIcons(): Boolean = js.native
    def openNode(node: qx.core.Object): Unit = js.native
    def openNodeWithoutScrolling(node: qx.core.Object): Unit = js.native

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTreeDelegate extends js.Object {
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def configureItem(item: qx.ui.core.Widget): Unit = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: any): Boolean = js.native
    def onPool(item: qx.ui.core.Widget): Unit = js.native
    def sorter(a: any, b: any): Int = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.MWidgetController")
class MWidgetController extends js.Object {
    constructor ();
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: IMap, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: IMap, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): any = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    protected def initChildProperty(value: any): String = js.native
    protected def initDelegate(value: any): any = js.native
    protected def initIconOptions(value: any): any = js.native
    protected def initIconPath(value: any): String = js.native
    protected def initLabelOptions(value: any): any = js.native
    protected def initLabelPath(value: any): String = js.native
    def removeBindings(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setChildProperty(value: any): String = js.native
    def setDelegate(value: any): any = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setLabelOptions(value: any): any = js.native
    def setLabelPath(value: any): String = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.Util")
class Util extends js.Object {
    static def hasChildren(node: qx.core.Object, childProperty: String, ignoreLeafs: Boolean = ???): Boolean = js.native
    static def isNode(node: qx.core.Object, childProperty: String): Boolean = js.native

}
}
package qx.ui.tree.provider {
@js.native
trait IVirtualTreeProvider extends js.Object {
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def createRenderer(): any = js.native
    def isSelectable(row: Int): Boolean = js.native
    def setChildProperty(value: String): Unit = js.native
    def setLabelPath(value: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native

}
}
package qx.ui.tree.provider {
@js.native
@JSName("qx.ui.tree.provider.WidgetProvider")
class WidgetProvider extends qx.core.Object implements qx.ui.virtual.core.IWidgetCellProvider,qx.ui.tree.provider.IVirtualTreeProvider {
    def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def createRenderer(): any = js.native
    def isSelectable(row: Int): Boolean = js.native
    def setChildProperty(value: String): Unit = js.native
    def setLabelPath(value: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: IMap, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: IMap, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): any = js.native
    def getIconOptions(): any = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): any = js.native
    def getLabelPath(): String = js.native
    def removeBindings(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setDelegate(value: any): any = js.native
    def setIconOptions(value: any): any = js.native
    def setIconPath(value: any): String = js.native
    def setLabelOptions(value: any): any = js.native
    constructor (tree: qx.ui.tree.VirtualTree = ???);
    protected def _onChangeDelegate(event: qx.event.type.Data): Unit = js.native
    protected def _onItemCreated(event: qx.event.type.Data): Unit = js.native
    protected def _onPool(item: qx.ui.core.Widget): Unit = js.native
    protected def _styleSelectabled(widget: qx.ui.core.Widget): Unit = js.native
    protected def _styleUnselectabled(widget: qx.ui.core.Widget): Unit = js.native

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
    def familyGetFirstChild(nodeReference: any): Int = js.native
    def familyGetLastChild(nodeReference: any): Int = js.native
    def familyGetNextSibling(nodeReference: any): Int = js.native
    def familyGetPrevSibling(nodeReference: any): Int = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MNode")
class MNode extends js.Object {
    def nodeGet(nodeReference: any): any = js.native
    def nodeGetCellStyle(nodeReference: any): String = js.native
    def nodeGetHideOpenClose(nodeReference: any): Boolean = js.native
    def nodeGetIcon(nodeReference: any): String = js.native
    def nodeGetLabel(nodeReference: any): String = js.native
    def nodeGetLabelStyle(nodeReference: any): String = js.native
    def nodeGetOpened(nodeReference: any): Boolean = js.native
    def nodeGetSelected(nodeReference: any): Boolean = js.native
    def nodeGetSelectedIcon(nodeReference: any): String = js.native
    def nodeSetCellStyle(nodeReference: any, style: String): Unit = js.native
    def nodeSetHideOpenClose(nodeReference: any, b: Boolean): Unit = js.native
    def nodeSetIcon(nodeReference: any, path: String): Unit = js.native
    def nodeSetLabel(nodeReference: any, label: String): Unit = js.native
    def nodeSetLabelStyle(nodeReference: any, style: String): Unit = js.native
    def nodeSetOpened(nodeReference: any, b: Boolean): Unit = js.native
    def nodeSetSelected(nodeReference: any, b: Boolean): Unit = js.native
    def nodeSetSelectedIcon(nodeReference: any, path: String): Unit = js.native
    def nodeSetState(nodeReference: any, attributes: IMap): Unit = js.native
    def nodeToggleOpened(nodeReference: any): Unit = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
class MTreePrimitive extends js.Object {
    protected static def _addNode(nodeArr: qx.data.Array, parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, type: Int, icon: String, iconSelected: String, nodeId: Int = ???): Int = js.native
    protected static def _getEmptyTree(): IMap = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SelectionManager")
class SelectionManager extends qx.ui.table.selection.Manager {
    constructor (table: qx.ui.table.Table = ???);
    protected def _handleExtendedClick(tree: qx.ui.treevirtual.TreeVirtual, evt: IMap, node: IMap, left: Int): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
class SimpleTreeDataCellRenderer extends qx.ui.table.cellrenderer.Abstract {
    constructor ();
    protected def _addExtraContentBeforeIcon(cellInfo: IMap, pos: Int): IMap = js.native
    protected def _addExtraContentBeforeIndentation(cellInfo: IMap, pos: Int): IMap = js.native
    protected def _addExtraContentBeforeLabel(cellInfo: IMap, pos: Int): IMap = js.native
    protected def _addIcon(cellInfo: IMap, pos: Int): IMap = js.native
    protected def _addImage(imageInfo: IMap): String = js.native
    protected def _addIndentation(cellInfo: IMap, pos: Int): IMap = js.native
    protected def _addLabel(cellInfo: IMap, pos: Int): String = js.native
    protected def _getIndentSymbol(column: Int, node: Node, bUseTreeLines: Boolean, bAlwaysShowOpenCloseSymbol: Boolean, bExcludeFirstLevelTreeLines: Boolean): IMap = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initAlwaysShowOpenCloseSymbol(value: any): Boolean = js.native
    protected def initExcludeFirstLevelTreeLines(value: any): Boolean = js.native
    protected def initUseTreeLines(value: any): Boolean = js.native
    def isAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def isExcludeFirstLevelTreeLines(): Boolean = js.native
    def isUseTreeLines(): Boolean = js.native
    def resetAlwaysShowOpenCloseSymbol(): Unit = js.native
    def resetExcludeFirstLevelTreeLines(): Unit = js.native
    def resetUseTreeLines(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(value: any): Boolean = js.native
    def setExcludeFirstLevelTreeLines(value: any): Boolean = js.native
    def setUseTreeLines(value: any): Boolean = js.native
    def toggleAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def toggleExcludeFirstLevelTreeLines(): Boolean = js.native
    def toggleUseTreeLines(): Boolean = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataModel")
class SimpleTreeDataModel extends qx.ui.table.model.Abstract {
    constructor ();
    protected def _applyFilter(value: js.Function, old: js.Function): Unit = js.native
    protected def _clearSelections(): Unit = js.native
    def addBranch(parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, icon: String, iconSelected: String): Int = js.native
    def addLeaf(parentNodeId: Int, label: String, icon: String, iconSelected: String): Int = js.native
    def clearData(): Unit = js.native
    def getColumnData(nodeId: Int, columnIndex: Int): any = js.native
    def getData(): qx.data.Array = js.native
    def getFilter(): js.Function = js.native
    def getNode(rowIndex: Int): any = js.native
    def getNodeFromRow(rowIndex: Int): any = js.native
    def getNodeRowMap(): qx.data.Array = js.native
    def getRowFromNodeId(nodeId: Int): Int = js.native
    def getSelectedNodes(): qx.data.Array = js.native
    def getTree(): qx.ui.treevirtual.TreeVirtual = js.native
    def getTreeColumn(): Int = js.native
    protected def initFilter(value: any): js.Function = js.native
    def move(moveNodeReference: any, parentNodeReference: any): Unit = js.native
    def prune(nodeReference: any, bSelfAlso: Boolean): Unit = js.native
    def resetFilter(): Unit = js.native
    def setColumnData(nodeId: Int, columnIndex: Int, data: any): Unit = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setData(nodeArr: qx.data.Array): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setFilter(value: any): js.Function = js.native
    def setState(nodeReference: any, attributes: IMap): Unit = js.native
    def setTree(tree: qx.ui.treevirtual.TreeVirtual): Unit = js.native
    def setTreeColumn(columnIndex: Int): Unit = js.native

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
    constructor (headings: qx.data.Array = ???, custom: IMap = ???);
    protected def _calculateSelectedNodes(): qx.data.Array = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getDataModel(): qx.ui.table.ITableModel = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getHierarchy(nodeReference: any): qx.data.Array = js.native
    def getOpenCloseClickSelectsRow(): Boolean = js.native
    def getSelectedNodes(): qx.data.Array = js.native
    def getSelectionMode(): Int = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initOpenCloseClickSelectsRow(value: any): Boolean = js.native
    def isOpenCloseClickSelectsRow(): Boolean = js.native
    def resetOpenCloseClickSelectsRow(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(b: Boolean): Unit = js.native
    def setExcludeFirstLevelTreeLines(b: Boolean): Unit = js.native
    def setOpenCloseClickSelectsRow(value: any): Boolean = js.native
    def setOverflow(s: String): Unit = js.native
    def setSelectionMode(mode: Int): Unit = js.native
    def setUseTreeLines(b: Boolean): Unit = js.native
    def toggleOpenCloseClickSelectsRow(): Boolean = js.native

}
}
package qx.ui.virtual.behavior {
@js.native
@JSName("qx.ui.virtual.behavior.Prefetch")
class Prefetch extends qx.core.Object {
    constructor (scroller: qx.ui.virtual.core.Scroller = ???, settings: IMap = ???);
    protected def _applyInterval(value: Int, old: Int): Unit = js.native
    protected def _applyScroller(value: qx.ui.virtual.core.Scroller, old: qx.ui.virtual.core.Scroller): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getInterval(): Int = js.native
    def getScroller(): qx.ui.virtual.core.Scroller = js.native
    protected def initInterval(value: any): Int = js.native
    protected def initScroller(value: any): qx.ui.virtual.core.Scroller = js.native
    def resetInterval(): Unit = js.native
    def resetScroller(): Unit = js.native
    def setInterval(value: any): Int = js.native
    def setPrefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def setPrefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def setScroller(value: any): qx.ui.virtual.core.Scroller = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Abstract")
class Abstract extends qx.core.Object implements qx.ui.virtual.cell.ICell {
    def getCellProperties(data: any, states: IMap): IMap = js.native
    constructor ();
    def getAttributes(value: any, states: any): String = js.native
    def getContent(value: any, states: any): String = js.native
    def getCssClasses(value: any, states: any): String = js.native
    def getInsets(value: any, states: any): Int[] = js.native
    def getStyles(value: any, states: any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractImage")
class AbstractImage extends qx.ui.virtual.cell.Cell {
    constructor ();
    protected def _identifyImage(value: any): IMap = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractWidget")
class AbstractWidget extends qx.core.Object implements qx.ui.virtual.cell.IWidgetCell {
    def getCellWidget(data: any, states: IMap): qx.ui.core.LayoutItem = js.native
    def pool(widget: qx.ui.core.LayoutItem): Unit = js.native
    def updateData(widget: qx.ui.core.LayoutItem, data: any): Unit = js.native
    def updateStates(widget: qx.ui.core.LayoutItem, states: IMap): Unit = js.native
    constructor ();
    protected def _cleanupPool(): Unit = js.native
    protected def _createWidget(): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Boolean")
class Boolean extends qx.ui.virtual.cell.AbstractImage {
    constructor ();
    protected def _applyIconFalse(value: String, old: String): Unit = js.native
    protected def _applyIconTrue(value: String, old: String): Unit = js.native
    def getIconFalse(): String = js.native
    def getIconTrue(): String = js.native
    protected def initIconFalse(value: any): String = js.native
    protected def initIconTrue(value: any): String = js.native
    def resetIconFalse(): Unit = js.native
    def resetIconTrue(): Unit = js.native
    def setIconFalse(value: any): String = js.native
    def setIconTrue(value: any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Cell")
class Cell extends qx.ui.virtual.cell.Abstract {
    constructor ();
    protected def _applyAppearance(value: String, old: String): Unit = js.native
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _applyFont(value: String, old: String): Unit = js.native
    protected def _applyPadding(value: Int, old: Int): Unit = js.native
    protected def _applyTextAlign(value: any, old: any): Unit = js.native
    protected def _applyTextColor(value: String, old: String): Unit = js.native
    protected def _getCssProperties(): qx.data.Array = js.native
    protected def _getValue(propertyName: String): any = js.native
    protected def _storeStyle(propertyName: String, styles: String): Unit = js.native
    def getAppearance(): String = js.native
    def getBackgroundColor(): String = js.native
    def getFont(): String = js.native
    def getPaddingBottom(): Int = js.native
    def getPaddingLeft(): Int = js.native
    def getPaddingRight(): Int = js.native
    def getPaddingTop(): Int = js.native
    def getTextAlign(): any = js.native
    def getTextColor(): String = js.native
    protected def initAppearance(value: any): String = js.native
    protected def initBackgroundColor(value: any): String = js.native
    protected def initFont(value: any): String = js.native
    protected def initPaddingBottom(value: any): Int = js.native
    protected def initPaddingLeft(value: any): Int = js.native
    protected def initPaddingRight(value: any): Int = js.native
    protected def initPaddingTop(value: any): Int = js.native
    protected def initTextAlign(value: any): any = js.native
    protected def initTextColor(value: any): String = js.native
    def resetAppearance(): Unit = js.native
    def resetBackgroundColor(): Unit = js.native
    def resetFont(): Unit = js.native
    def resetPadding(): Unit = js.native
    def resetPaddingBottom(): Unit = js.native
    def resetPaddingLeft(): Unit = js.native
    def resetPaddingRight(): Unit = js.native
    def resetPaddingTop(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetTextColor(): Unit = js.native
    def setAppearance(value: any): String = js.native
    def setBackgroundColor(value: any): String = js.native
    def setFont(value: any): String = js.native
    def setPadding(paddingTop: any, paddingRight: any, paddingBottom: any, paddingLeft: any): Unit = js.native
    def setPaddingBottom(value: any): Int = js.native
    def setPaddingLeft(value: any): Int = js.native
    def setPaddingRight(value: any): Int = js.native
    def setPaddingTop(value: any): Int = js.native
    def setTextAlign(value: any): any = js.native
    def setTextColor(value: any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
class CellStylesheet extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.ui.virtual.cell.CellStylesheet = js.native
    def computeClassForStyles(key: String, styleString: String): String = js.native
    def getCssClass(key: String): String = js.native
    def getStylesheet(): any = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Date")
class Date extends qx.ui.virtual.cell.Cell {
    constructor (dateFormat: qx.util.format.DateFormat = ???);
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: any): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: any): qx.util.format.DateFormat = js.native

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
    def getCellProperties(data: any, states: IMap): IMap = js.native

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCell extends js.Object {
    def getCellWidget(data: any, states: IMap): qx.ui.core.LayoutItem = js.native
    def pool(widget: qx.ui.core.LayoutItem): Unit = js.native
    def updateData(widget: qx.ui.core.LayoutItem, data: any): Unit = js.native
    def updateStates(widget: qx.ui.core.LayoutItem, states: IMap): Unit = js.native

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCellDelegate extends js.Object {
    def createWidget(): qx.ui.core.LayoutItem = js.native

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
    constructor (numberFormat: qx.util.format.NumberFormat = ???);
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    protected def initNumberFormat(value: any): qx.util.format.NumberFormat = js.native
    def resetNumberFormat(): Unit = js.native
    def setNumberFormat(value: any): qx.util.format.NumberFormat = js.native

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
    protected def _applyDelegate(value: any, old: any): Unit = js.native
    def getDelegate(): any = js.native
    protected def initDelegate(value: any): any = js.native
    def resetDelegate(): Unit = js.native
    def setDelegate(value: any): any = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Axis")
class Axis extends qx.core.Object {
    constructor (defaultItemSize: Int = ???, itemCount: Int = ???);
    def getDefaultItemSize(): Int = js.native
    def getItemAtPosition(position: Int): IMap = js.native
    def getItemCount(): Int = js.native
    def getItemPosition(index: Int): Int = js.native
    def getItemSize(index: Int): Int = js.native
    def getItemSizes(startIndex: Int, minSizeSum: Int): Int[] = js.native
    def getTotalSize(): Int = js.native
    def resetItemSizes(): Unit = js.native
    def setDefaultItemSize(defaultItemSize: Int): Unit = js.native
    def setItemCount(itemCount: Int): Unit = js.native
    def setItemSize(index: Int, size: Int): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.CellEvent")
class CellEvent extends qx.event.type.Pointer {
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: any): Int = js.native
    protected def initRow(value: any): Int = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: any): Int = js.native
    def setRow(value: any): Int = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait IHtmlCellProvider extends js.Object {
    def getCellProperties(row: Int, column: Int): IMap = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait ILayer extends js.Object {
    def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native
    def updateLayerData(): Unit = js.native
    def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait IWidgetCellProvider extends js.Object {
    def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Pane")
class Pane extends qx.ui.core.Widget {
    constructor (rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???);
    protected def _deferredUpdateScrollPosition(): Unit = js.native
    protected def _fullUpdate(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onContextmenu(e: qx.event.type.Pointer): Unit = js.native
    protected def _onDbltap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _setLayerWindow(layers: qx.ui.virtual.core.ILayer[], left: Int, top: Int, minWidth: Int, minHeight: Int, doFullUpdate: Boolean = ???): Unit = js.native
    protected def _updateScrollPosition(): Unit = js.native
    def addLayer(layer: qx.ui.virtual.core.ILayer): Unit = js.native
    def fullUpdate(): Unit = js.native
    def getCellAtPosition(documentX: Int, documentY: Int): IMap = js.native
    def getChildren(): any[] = js.native
    def getColumnConfig(): qx.ui.virtual.core.Axis = js.native
    def getLayers(): qx.ui.virtual.core.ILayer[] = js.native
    def getRowConfig(): qx.ui.virtual.core.Axis = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): IMap = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getVisibleLayers(): qx.ui.virtual.core.ILayer[] = js.native
    def isUpdatePending(): Boolean = js.native
    def prefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def prefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def scrollCellIntoView(column: Int, row: Int): Unit = js.native
    def scrollColumnIntoView(column: Int): Unit = js.native
    def scrollRowIntoView(row: Int): Unit = js.native
    def setScrollX(value: Int): Unit = js.native
    def setScrollY(value: Int): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Scroller")
class Scroller extends qx.ui.core.scroll.AbstractScrollArea {
    constructor (rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???);
    def getPane(): qx.ui.virtual.core.Pane = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Abstract")
class Abstract extends qx.ui.core.Widget implements qx.ui.virtual.core.ILayer {
    def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native
    def updateLayerData(): Unit = js.native
    def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native
    constructor ();
    protected def _fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native
    protected def _updateLayerData(): Unit = js.native
    protected def _updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: Int[], columnSizes: Int[]): Unit = js.native
    def getColumnSizes(): Int[] = js.native
    def getFirstColumn(): Int = js.native
    def getFirstRow(): Int = js.native
    def getRowSizes(): Int[] = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.AbstractBackground")
class AbstractBackground extends qx.ui.virtual.layer.Abstract {
    constructor (colorEven: String = ???, colorOdd: String = ???);
    protected def _applyColorEven(value: String, old: String): Unit = js.native
    protected def _applyColorOdd(value: String, old: String): Unit = js.native
    def clearCustomColors(): Unit = js.native
    def getBackground(index: Int): qx.ui.decoration.IDecorator = js.native
    def getColor(index: Int): String = js.native
    def getColorEven(): String = js.native
    def getColorOdd(): String = js.native
    protected def initColorEven(value: any): String = js.native
    protected def initColorOdd(value: any): String = js.native
    def resetColorEven(): Unit = js.native
    def resetColorOdd(): Unit = js.native
    def setBackground(index: Int, decorator: qx.ui.decoration.IDecorator): Unit = js.native
    def setColor(index: Int, color: String): Unit = js.native
    def setColorEven(value: any): String = js.native
    def setColorOdd(value: any): String = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.CellSpanManager")
class CellSpanManager extends qx.core.Object {
    constructor (rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???);
    protected def _findCellsInRange(key: String, min: Int, max: Int): IMap = js.native
    protected def _getColumnPosition(column: Int): Int = js.native
    protected def _getRowPosition(row: Int): Int = js.native
    protected def _getSingleCellBounds(cell: IMap, firstVisibleRow: IMap, firstVisibleColumn: IMap): IMap = js.native
    protected def _getSortedCells(key: String): IMap[] = js.native
    protected def _invalidatePositionCache(): Unit = js.native
    protected def _invalidateSortCache(): Unit = js.native
    protected def _onColumnConfigChange(e: qx.event.type.Event): Unit = js.native
    protected def _onRowConfigChange(e: qx.event.type.Event): Unit = js.native
    def addCell(id: String, row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native
    def computeCellSpanMap(cells: IMap[], firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): IMap[] = js.native
    def findCellsInWindow(firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): IMap[] = js.native
    def getCellBounds(cells: IMap[], firstVisibleRow: IMap, firstVisibleColumn: IMap): IMap[] = js.native
    def removeCell(id: String): Unit = js.native

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
    constructor (orientation: String = ???, lineColor: String = ???, lineSize: Int = ???);
    def getDefaultLineColor(): String = js.native
    def getDefaultLineSize(): Int = js.native
    def getLineColor(index: Long): String = js.native
    def getLineSize(index: Long): Int = js.native
    protected def initDefaultLineColor(value: any): String = js.native
    protected def initDefaultLineSize(value: any): Int = js.native
    def isHorizontal(): Boolean = js.native
    def resetDefaultLineColor(): Unit = js.native
    def resetDefaultLineSize(): Unit = js.native
    def setDefaultLineColor(value: any): String = js.native
    def setDefaultLineSize(value: any): Int = js.native
    def setLineColor(index: Long, color: String): Unit = js.native
    def setLineSize(index: Long, size: Int): Unit = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCell")
class HtmlCell extends qx.ui.virtual.layer.Abstract {
    constructor (htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???);
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCellSpan")
class HtmlCellSpan extends qx.ui.virtual.layer.HtmlCell {
    constructor (htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???);
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

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
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor (widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???);
    protected def _activateNotEmptyChild(elementToPool: qx.ui.core.Widget): Unit = js.native
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCellSpan")
class WidgetCellSpan extends qx.ui.virtual.layer.Abstract {
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    constructor (widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???);
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Abstract")
class Abstract extends qx.ui.core.selection.Abstract {
    constructor (pane: qx.ui.virtual.core.Pane = ???, selectionDelegate: any = ???);
    def attachKeyEvents(target: qx.core.Object): Unit = js.native
    def attachListEvents(list: qx.core.Object): Unit = js.native
    def attachPointerEvents(): Unit = js.native
    def detachKeyEvents(target: qx.core.Object): Unit = js.native
    def detachListEvents(list: qx.core.Object): Unit = js.native
    def detatchPointerEvents(): Unit = js.native

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
    protected def _getItemCount(): Int = js.native

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
    def isItemSelectable(item: any): Boolean = js.native
    def styleSelectable(item: any, type: String, wasAdded: Boolean): Unit = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.MModel")
class MModel extends js.Object {
    constructor ();
    protected def _applyDefaultSelection(): Unit = js.native
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applySelectionMode(value: any, old: any): Unit = js.native
    protected def _initSelectionManager(): Unit = js.native
    protected def _onChangeSelection(e: qx.event.type.Data): Unit = js.native
    protected def _onManagerChangeSelection(e: qx.event.type.Data): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getAutoScrollIntoView(): Boolean = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelection(): qx.data.Array = js.native
    def getSelectionMode(): any = js.native
    protected def initDragSelection(value: any): Boolean = js.native
    protected def initQuickSelection(value: any): Boolean = js.native
    protected def initSelection(value: any): qx.data.Array = js.native
    protected def initSelectionMode(value: any): any = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setAutoScrollIntoView(value: Boolean): Unit = js.native
    def setDragSelection(value: any): Boolean = js.native
    def setQuickSelection(value: any): Boolean = js.native
    def setSelection(value: any): qx.data.Array = js.native
    def setSelectionMode(value: any): any = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Row")
class Row extends qx.ui.virtual.selection.Abstract {
    protected def _getItemCount(): Int = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Desktop")
class Desktop extends qx.ui.core.Widget implements qx.ui.window.IDesktop {
    def blockContent(zIndex: Int): Unit = js.native
    def getWindows(): qx.ui.window.Window[] = js.native
    def isBlocked(): Boolean = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native
    def unblock(): Unit = js.native
    static def remap(members: IMap): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getActiveWindow(): qx.ui.window.Window = js.native
    def getWindowManager(): qx.ui.window.IWindowManager = js.native
    def resetActiveWindow(): Unit = js.native
    def setActiveWindow(value: any): qx.ui.window.Window = js.native
    def block(): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def setBlockerColor(value: any): String = js.native
    def setBlockerOpacity(value: any): Long = js.native
    constructor (windowManager: qx.ui.window.IWindowManager = ???);

}
}
package qx.ui.window {
@js.native
trait IDesktop extends js.Object {
    def blockContent(zIndex: Int): Unit = js.native
    def getWindows(): qx.ui.window.Window[] = js.native
    def isBlocked(): Boolean = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.window {
@js.native
trait IWindowManager extends js.Object {
    def bringToFront(win: Window): Unit = js.native
    def changeActiveWindow(active: Window, oldActive: Window): Unit = js.native
    def sendToBack(win: Window): Unit = js.native
    def setDesktop(desktop: qx.ui.window.IDesktop): Unit = js.native
    def updateStack(): Unit = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.MDesktop")
class MDesktop extends js.Object {
    protected def _addWindow(win: qx.ui.window.Window): Unit = js.native
    protected def _afterAddChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _afterRemoveChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _applyActiveWindow(value: qx.ui.window.Window, old: qx.ui.window.Window): Unit = js.native
    protected def _onChangeActive(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeModal(e: qx.event.type.Event): Unit = js.native
    protected def _onChangeVisibility(): Unit = js.native
    protected def _removeWindow(win: qx.ui.window.Window): Unit = js.native
    def getActiveWindow(): qx.ui.window.Window = js.native
    def getWindowManager(): qx.ui.window.IWindowManager = js.native
    def getWindows(): qx.ui.window.Window[] = js.native
    protected def initActiveWindow(value: any): qx.ui.window.Window = js.native
    def resetActiveWindow(): Unit = js.native
    def setActiveWindow(value: any): qx.ui.window.Window = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Manager")
class Manager extends qx.core.Object implements qx.ui.window.IWindowManager {
    def bringToFront(win: Window): Unit = js.native
    def changeActiveWindow(active: Window, oldActive: Window): Unit = js.native
    def sendToBack(win: Window): Unit = js.native
    def setDesktop(desktop: qx.ui.window.IDesktop): Unit = js.native
    def updateStack(): Unit = js.native
    def getDesktop(): qx.ui.window.IDesktop = js.native
    def syncWidget(): Unit = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Window")
class Window extends qx.ui.core.Widget {
    def add(child: qx.ui.core.LayoutItem, options: IMap = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: IMap = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: IMap = ???): Unit = js.native
    def getChildren(): qx.ui.core.LayoutItem[] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    def getResizableBottom(): Boolean = js.native
    def getResizableLeft(): Boolean = js.native
    def getResizableRight(): Boolean = js.native
    def getResizableTop(): Boolean = js.native
    def getResizeSensitivity(): Int = js.native
    def getUseResizeFrame(): Boolean = js.native
    def isResizableBottom(): Boolean = js.native
    def isResizableLeft(): Boolean = js.native
    def isResizableRight(): Boolean = js.native
    def isResizableTop(): Boolean = js.native
    def isUseResizeFrame(): Boolean = js.native
    def resetResizable(): Unit = js.native
    def resetResizableBottom(): Unit = js.native
    def resetResizableLeft(): Unit = js.native
    def resetResizableRight(): Unit = js.native
    def resetResizableTop(): Unit = js.native
    def resetResizeSensitivity(): Unit = js.native
    def resetUseResizeFrame(): Unit = js.native
    def setResizable(resizableTop: any, resizableRight: any, resizableBottom: any, resizableLeft: any): Unit = js.native
    def setResizableBottom(value: any): Boolean = js.native
    def setResizableLeft(value: any): Boolean = js.native
    def setResizableRight(value: any): Boolean = js.native
    def setResizableTop(value: any): Boolean = js.native
    def setResizeSensitivity(value: any): Int = js.native
    def setUseResizeFrame(value: any): Boolean = js.native
    def toggleResizableBottom(): Boolean = js.native
    def toggleResizableLeft(): Boolean = js.native
    def toggleResizableRight(): Boolean = js.native
    def toggleResizableTop(): Boolean = js.native
    def toggleUseResizeFrame(): Boolean = js.native
    def getMovable(): Boolean = js.native
    def getUseMoveFrame(): Boolean = js.native
    def isMovable(): Boolean = js.native
    def isUseMoveFrame(): Boolean = js.native
    def resetMovable(): Unit = js.native
    def resetUseMoveFrame(): Unit = js.native
    def setMovable(value: any): Boolean = js.native
    def setUseMoveFrame(value: any): Boolean = js.native
    def toggleMovable(): Boolean = js.native
    def toggleUseMoveFrame(): Boolean = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: any, contentPaddingRight: any, contentPaddingBottom: any, contentPaddingLeft: any): Unit = js.native
    def setContentPaddingBottom(value: any): Int = js.native
    def setContentPaddingLeft(value: any): Int = js.native
    def setContentPaddingRight(value: any): Int = js.native
    def setContentPaddingTop(value: any): Int = js.native
    constructor (caption: String = ???, icon: String = ???);
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyCaptionBarChange(value: any, old: any): Unit = js.native
    protected def _applyModal(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowStatusbar(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatus(value: String, old: String): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onCaptionPointerDblTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onCloseButtonTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onMaximizeButtonTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onMinimizeButtonTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onRestoreButtonTap(e: qx.event.type.Pointer): Unit = js.native
    protected def _onWindowEventStop(e: qx.event.type.Event): Unit = js.native
    protected def _onWindowFocusOut(e: qx.event.type.Focus): Unit = js.native
    protected def _onWindowPointerDown(e: qx.event.type.Pointer): Unit = js.native
    protected def _updateCaptionBar(): Unit = js.native
    def center(): Unit = js.native
    def close(): Unit = js.native
    def getActive(): Boolean = js.native
    def getAllowClose(): Boolean = js.native
    def getAllowMaximize(): Boolean = js.native
    def getAllowMinimize(): Boolean = js.native
    def getAlwaysOnTop(): Boolean = js.native
    def getCaption(): any = js.native
    def getIcon(): String = js.native
    def getModal(): Boolean = js.native
    def getMode(): String = js.native
    def getShowClose(): Boolean = js.native
    def getShowMaximize(): Boolean = js.native
    def getShowMinimize(): Boolean = js.native
    def getShowStatusbar(): Boolean = js.native
    def getStatus(): String = js.native
    protected def initActive(value: any): Boolean = js.native
    protected def initAllowClose(value: any): Boolean = js.native
    protected def initAllowMaximize(value: any): Boolean = js.native
    protected def initAllowMinimize(value: any): Boolean = js.native
    protected def initAlwaysOnTop(value: any): Boolean = js.native
    protected def initCaption(value: any): any = js.native
    protected def initIcon(value: any): String = js.native
    protected def initModal(value: any): Boolean = js.native
    protected def initShowClose(value: any): Boolean = js.native
    protected def initShowMaximize(value: any): Boolean = js.native
    protected def initShowMinimize(value: any): Boolean = js.native
    protected def initShowStatusbar(value: any): Boolean = js.native
    protected def initStatus(value: any): String = js.native
    def isActive(): Boolean = js.native
    def isAllowClose(): Boolean = js.native
    def isAllowMaximize(): Boolean = js.native
    def isAllowMinimize(): Boolean = js.native
    def isAlwaysOnTop(): Boolean = js.native
    def isMaximized(): Boolean = js.native
    def isModal(): Boolean = js.native
    def isShowClose(): Boolean = js.native
    def isShowMaximize(): Boolean = js.native
    def isShowMinimize(): Boolean = js.native
    def isShowStatusbar(): Boolean = js.native
    def maximize(): Unit = js.native
    def minimize(): Unit = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def open(): Unit = js.native
    def resetActive(): Unit = js.native
    def resetAllowClose(): Unit = js.native
    def resetAllowMaximize(): Unit = js.native
    def resetAllowMinimize(): Unit = js.native
    def resetAlwaysOnTop(): Unit = js.native
    def resetCaption(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetModal(): Unit = js.native
    def resetShowClose(): Unit = js.native
    def resetShowMaximize(): Unit = js.native
    def resetShowMinimize(): Unit = js.native
    def resetShowStatusbar(): Unit = js.native
    def resetStatus(): Unit = js.native
    def restore(): Unit = js.native
    def setActive(value: any): Boolean = js.native
    def setAllowClose(value: any): Boolean = js.native
    def setAllowMaximize(value: any): Boolean = js.native
    def setAllowMinimize(value: any): Boolean = js.native
    def setAlwaysOnTop(value: any): Boolean = js.native
    def setCaption(value: any): any = js.native
    def setIcon(value: any): String = js.native
    def setModal(value: any): Boolean = js.native
    def setShowClose(value: any): Boolean = js.native
    def setShowMaximize(value: any): Boolean = js.native
    def setShowMinimize(value: any): Boolean = js.native
    def setShowStatusbar(value: any): Boolean = js.native
    def setStatus(value: any): String = js.native
    def toggleActive(): Boolean = js.native
    def toggleAllowClose(): Boolean = js.native
    def toggleAllowMaximize(): Boolean = js.native
    def toggleAllowMinimize(): Boolean = js.native
    def toggleAlwaysOnTop(): Boolean = js.native
    def toggleModal(): Boolean = js.native
    def toggleShowClose(): Boolean = js.native
    def toggleShowMaximize(): Boolean = js.native
    def toggleShowMinimize(): Boolean = js.native
    def toggleShowStatusbar(): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.AliasManager")
class AliasManager extends qx.util.ValueManager {
    constructor ();
    static def getInstance(): qx.util.AliasManager = js.native
    protected def _preprocess(value: String): String = js.native
    def add(alias: String, base: String): Unit = js.native
    def getAliases(): IMap = js.native
    def remove(alias: String): Unit = js.native

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
    static def decode(input: String, is8bit: Boolean = ???): String = js.native
    static def encode(input: String, is8bit: Boolean = ???): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ColorUtil")
class ColorUtil extends js.Object {
    static def cssStringToRgb(str: String): qx.data.Array = js.native
    static def hex3StringToHex6String(value: String): String = js.native
    static def hex3StringToRgb(value: String): qx.data.Array = js.native
    static def hex6StringToRgb(value: String): qx.data.Array = js.native
    static def hexStringToRgb(value: String): qx.data.Array = js.native
    static def hsbToRgb(hsb: Long[]): Int[] = js.native
    static def isCssString(str: String): Boolean = js.native
    static def isHex3String(str: String): Boolean = js.native
    static def isHex6String(str: String): Boolean = js.native
    static def isNamedColor(value: String): Boolean = js.native
    static def isRgbaString(str: String): Boolean = js.native
    static def isRgbString(str: String): Boolean = js.native
    static def isSystemColor(value: String): Boolean = js.native
    static def isThemedColor(value: String): Boolean = js.native
    static def isValidPropertyValue(str: String): Boolean = js.native
    static def randomColor(): String = js.native
    static def rgbToHexString(rgb: qx.data.Array): String = js.native
    static def rgbToHsb(rgb: Long[]): qx.data.Array = js.native
    static def rgbToRgbString(rgb: qx.data.Array): String = js.native
    static def stringToRgb(str: String): qx.data.Array = js.native
    static def stringToRgbString(str: String): String = js.native
    static def supportsThemes(): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCall")
class DeferredCall extends qx.core.Object {
    constructor (callback: js.Function = ???, context: any = ???);
    def call(): Unit = js.native
    def cancel(): Unit = js.native
    def schedule(): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCallManager")
class DeferredCallManager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.util.DeferredCallManager = js.native
    def cancel(deferredCall: qx.util.DeferredCall): Unit = js.native
    def schedule(deferredCall: qx.util.DeferredCall): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Delegate")
class Delegate extends js.Object {
    static def containsMethod(delegate: any, specificMethod: String): Boolean = js.native
    static def getMethod(delegate: any, specificMethod: String): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DisposeUtil")
class DisposeUtil extends js.Object {
    protected static def _collectContainerChildren(container: qx.ui.container.Composite, arr: qx.data.Array): Unit = js.native
    static def destroyContainer(container: qx.ui.container.Composite): Unit = js.native
    static def disposeArray(obj: any, field: String): Unit = js.native
    static def disposeMap(obj: any, field: String): Unit = js.native
    static def disposeObjects(obj: any, arr: qx.data.Array, disposeSingletons: Boolean = ???): Unit = js.native
    static def disposeTriggeredBy(disposeMe: any, trigger: any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.EditDistance")
class EditDistance extends js.Object {
    static def getEditOperations(dataA: qx.data.Array, dataB: qx.data.Array): IMap[] = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ExtendedColor")
class ExtendedColor extends js.Object {
    static def isExtendedColor(value: String): Boolean = js.native
    static def toRgb(value: String): qx.data.Array = js.native
    static def toRgbString(value: String): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.OOUtil")
class OOUtil extends js.Object {
    static def classIsDefined(name: String): Boolean = js.native
    static def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    static def getEventType(clazz: qx.Class, name: String): String = js.native
    static def getMixins(clazz: qx.Class): qx.Mixin[] = js.native
    static def getPropertyDefinition(clazz: qx.Class, name: String): IMap = js.native
    static def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    static def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    static def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ObjectPool")
class ObjectPool extends qx.core.Object {
    constructor (size: Int = ???);
    def getObject(clazz: qx.Class): any = js.native
    def getSize(): Int = js.native
    protected def initSize(value: any): Int = js.native
    def poolObject(obj: any): Unit = js.native
    def resetSize(): Unit = js.native
    def setSize(value: any): Int = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Permutation")
class Permutation extends js.Object {
    static def permute(options: IMap, callback: js.Function, context: any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.PropertyUtil")
class PropertyUtil extends js.Object {
    static def deleteInitValue(object: any, propertyName: String): Unit = js.native
    static def deleteThemeValue(object: any, propertyName: String): Unit = js.native
    static def deleteUserValue(object: any, propertyName: String): Unit = js.native
    static def getAllProperties(clazz: qx.Class): IMap = js.native
    static def getInitValue(object: any, propertyName: String): any = js.native
    static def getProperties(clazz: qx.Class): IMap = js.native
    static def getThemeValue(object: any, propertyName: String): any = js.native
    static def getUserValue(object: any, propertyName: String): any = js.native
    static def resetThemed(object: any, propertyName: String): Unit = js.native
    static def setInitValue(object: any, propertyName: String, value: any): Unit = js.native
    static def setThemed(object: any, propertyName: String, value: any): Unit = js.native
    static def setThemeValue(object: any, propertyName: String, value: any): Unit = js.native
    static def setUserValue(object: any, propertyName: String, value: any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Request")
class Request extends js.Object {
    static def isCrossDomain(url: String): Boolean = js.native
    static def isMethod(method: String): Boolean = js.native
    static def isSuccessful(status: Long): Boolean = js.native
    static def methodAllowsRequestBody(method: String): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ResourceManager")
class ResourceManager extends qx.core.Object {
    constructor ();
    static def getInstance(): qx.util.ResourceManager = js.native
    def getCombinedFormat(id: String): String = js.native
    def getData(id: String): qx.data.Array = js.native
    def getImageFormat(id: String): String = js.native
    def getImageHeight(id: String): Int = js.native
    def getImageWidth(id: String): Int = js.native
    def has(id: String): Boolean = js.native
    def toDataUri(resid: String): String = js.native
    def toUri(id: String): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ResponseParser")
class ResponseParser extends js.Object {
    constructor (parser: String = ???);
    protected def _getParser(contentType: String): js.Function = js.native
    def parse(response: String, contentType: String): String = js.native
    def setParser(parser: String): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.RingBuffer")
class RingBuffer extends js.Object {
    constructor (maxEntries: Int = ???);
    def addEntry(entry: any): Unit = js.native
    def clear(): Unit = js.native
    def clearMark(): Unit = js.native
    def getAllEntries(): qx.data.Array = js.native
    def getEntries(count: Int, startingFromMark: Boolean = ???): qx.data.Array = js.native
    def getMaxEntries(): Int = js.native
    def mark(): Unit = js.native
    def setMaxEntries(maxEntries: Int): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Serializer")
class Serializer extends js.Object {
    static def toJson(object: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    static def toNativeObject(object: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    static def toUriParameter(object: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringBuilder")
class StringBuilder extends qx.type.BaseArray {
    constructor (length_or_items: Int = ???);
    def add(varargs: String = ???): Unit = js.native
    def clear(): Unit = js.native
    def get(): String = js.native
    def isEmpty(): Boolean = js.native
    def size(): Int = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringEscape")
class StringEscape extends js.Object {
    static def escape(str: String, charCodeToEntities: IMap): String = js.native
    static def unescape(str: String, entitiesToCharCode: IMap): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringSplit")
class StringSplit extends js.Object {
    static def split(str: String, separator: js.RegExp, limit: Int = ???): String[] = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.TimerManager")
class TimerManager extends qx.core.Object {
    static def getInstance(): qx.util.TimerManager = js.native
    def start(callback: js.Function, recurTime: Int, context: qx.core.Object, userData: any, initialTime: Int): Int = js.native
    def stop(timerId: Int): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Uri")
class Uri extends js.Object {
    static def appendParamsToUrl(url: String, params: String): String = js.native
    static def getAbsolute(uri: String): String = js.native
    static def parseUri(str: String, strict: Boolean): any = js.native
    static def toParameter(obj: any, post: Boolean): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Validate")
class Validate extends js.Object {
    static def checkColor(value: any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    static def checkEmail(value: any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    static def checkNumber(value: any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    static def checkString(value: any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    static def checkUrl(value: any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    static def color(errorMessage: String = ???): js.Function = js.native
    static def email(errorMessage: String = ???): js.Function = js.native
    static def inArray(array: qx.data.Array, errorMessage: String = ???): js.Function = js.native
    static def number(errorMessage: String = ???): js.Function = js.native
    static def range(from: Long, to: Long, errorMessage: String = ???): js.Function = js.native
    static def regExp(reg: js.RegExp, errorMessage: String = ???): js.Function = js.native
    static def string(errorMessage: String = ???): js.Function = js.native
    static def url(errorMessage: String = ???): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ValueManager")
class ValueManager extends qx.core.Object {
    constructor ();
    protected def _getDynamic(): IMap = js.native
    protected def _setDynamic(value: IMap): Unit = js.native
    def isDynamic(value: String): Boolean = js.native
    def resolve(value: String): any = js.native
    def resolveDynamic(value: String): any = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Wheel")
class Wheel extends js.Object {
    static def getDelta(domEvent: qx.event.type.Event, axis: String = ???): Int = js.native

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.DateFormat")
class DateFormat extends qx.core.Object implements qx.util.format.IFormat {
    def format(obj: any): String = js.native
    def parse(str: String): any = js.native
    constructor (format: String = ???, locale: String = ???);
    static def getDateInstance(): qx.util.format.DateFormat = js.native
    static def getDateTimeInstance(): qx.util.format.DateFormat = js.native
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def getLocale(): String = js.native
    protected def initLocale(value: any): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: any): String = js.native

}
}
package qx.util.format {
@js.native
trait IFormat extends js.Object {
    def format(obj: any): String = js.native
    def parse(str: String): any = js.native

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.NumberFormat")
class NumberFormat extends qx.core.Object implements qx.util.format.IFormat {
    def format(obj: any): String = js.native
    def parse(str: String): any = js.native
    constructor (locale: String = ???);
    def getGroupingUsed(): Boolean = js.native
    def getLocale(): String = js.native
    def getMaximumFractionDigits(): Long = js.native
    def getMaximumIntegerDigits(): Long = js.native
    def getMinimumFractionDigits(): Long = js.native
    def getMinimumIntegerDigits(): Long = js.native
    def getPostfix(): String = js.native
    def getPrefix(): String = js.native
    protected def initGroupingUsed(value: any): Boolean = js.native
    protected def initLocale(value: any): String = js.native
    protected def initMaximumFractionDigits(value: any): Long = js.native
    protected def initMaximumIntegerDigits(value: any): Long = js.native
    protected def initMinimumFractionDigits(value: any): Long = js.native
    protected def initMinimumIntegerDigits(value: any): Long = js.native
    protected def initPostfix(value: any): String = js.native
    protected def initPrefix(value: any): String = js.native
    def isGroupingUsed(): Boolean = js.native
    def resetGroupingUsed(): Unit = js.native
    def resetLocale(): Unit = js.native
    def resetMaximumFractionDigits(): Unit = js.native
    def resetMaximumIntegerDigits(): Unit = js.native
    def resetMinimumFractionDigits(): Unit = js.native
    def resetMinimumIntegerDigits(): Unit = js.native
    def resetPostfix(): Unit = js.native
    def resetPrefix(): Unit = js.native
    def setGroupingUsed(value: any): Boolean = js.native
    def setLocale(value: any): String = js.native
    def setMaximumFractionDigits(value: any): Long = js.native
    def setMaximumIntegerDigits(value: any): Long = js.native
    def setMinimumFractionDigits(value: any): Long = js.native
    def setMinimumIntegerDigits(value: any): Long = js.native
    def setPostfix(value: any): String = js.native
    def setPrefix(value: any): String = js.native
    def toggleGroupingUsed(): Boolean = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.FiniteStateMachine")
class FiniteStateMachine extends qx.core.Object {
    constructor (machineName: String = ???);
    protected def _getInternalData(): IMap = js.native
    def addObject(friendlyName: String, obj: any, groupNames: qx.data.Array): Unit = js.native
    def addState(state: qx.util.fsm.State): Unit = js.native
    def displayAllObjects(): Unit = js.native
    def enqueueEvent(event: qx.event.type.Event, bAddAtHead: Boolean): Unit = js.native
    def eventListener(event: qx.event.type.Event): Unit = js.native
    def fireImmediateEvent(type: String, target: qx.core.Object, data: any): Unit = js.native
    def getDebugFlags(): Long = js.native
    def getFriendlyName(obj: any): String = js.native
    def getGroupObjects(groupName: String): qx.data.Array = js.native
    def getMaxSavedStates(): Long = js.native
    def getName(): String = js.native
    def getNextState(): String = js.native
    def getObject(friendlyName: String): any = js.native
    def getPreviousState(): String = js.native
    def getState(): String = js.native
    protected def initDebugFlags(value: any): Long = js.native
    protected def initMaxSavedStates(value: any): Long = js.native
    protected def initName(value: any): String = js.native
    protected def initNextState(value: any): String = js.native
    protected def initPreviousState(value: any): String = js.native
    protected def initState(value: any): String = js.native
    def isTerminated(): Boolean = js.native
    def popState(): String = js.native
    def postponeEvent(event: qx.event.type.Event): Unit = js.native
    def pushState(state: Boolean): Unit = js.native
    def removeObject(friendlyName: String): Unit = js.native
    def replaceState(state: qx.util.fsm.State, bDispose: Boolean): any = js.native
    def resetDebugFlags(): Unit = js.native
    def resetMaxSavedStates(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetPreviousState(): Unit = js.native
    def resetState(): Unit = js.native
    def scheduleEvent(type: String, target: qx.core.Object, data: any, timeout: Int): Unit = js.native
    def setDebugFlags(value: any): Long = js.native
    def setMaxSavedStates(value: any): Long = js.native
    def setName(value: any): String = js.native
    def setNextState(value: any): String = js.native
    def setPreviousState(value: any): String = js.native
    def setState(value: any): String = js.native
    def start(): Unit = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.State")
class State extends qx.core.Object {
    constructor (stateName: String = ???, stateInfo: IMap = ???);
    protected static def _commonTransformAutoActions(actionType: String, value: any, context: any): js.Function = js.native
    def addTransition(trans: qx.util.fsm.Transition): Unit = js.native
    def getAutoActionsAfterOnentry(): any = js.native
    def getAutoActionsAfterOnexit(): any = js.native
    def getAutoActionsBeforeOnentry(): any = js.native
    def getAutoActionsBeforeOnexit(): any = js.native
    def getEvents(): any = js.native
    def getName(): any = js.native
    def getOnentry(): any = js.native
    def getOnexit(): any = js.native
    protected def initAutoActionsAfterOnentry(value: any): any = js.native
    protected def initAutoActionsAfterOnexit(value: any): any = js.native
    protected def initAutoActionsBeforeOnentry(value: any): any = js.native
    protected def initAutoActionsBeforeOnexit(value: any): any = js.native
    protected def initEvents(value: any): any = js.native
    protected def initName(value: any): any = js.native
    protected def initOnentry(value: any): any = js.native
    protected def initOnexit(value: any): any = js.native
    def resetAutoActionsAfterOnentry(): Unit = js.native
    def resetAutoActionsAfterOnexit(): Unit = js.native
    def resetAutoActionsBeforeOnentry(): Unit = js.native
    def resetAutoActionsBeforeOnexit(): Unit = js.native
    def resetEvents(): Unit = js.native
    def resetName(): Unit = js.native
    def resetOnentry(): Unit = js.native
    def resetOnexit(): Unit = js.native
    def setAutoActionsAfterOnentry(value: any): any = js.native
    def setAutoActionsAfterOnexit(value: any): any = js.native
    def setAutoActionsBeforeOnentry(value: any): any = js.native
    def setAutoActionsBeforeOnexit(value: any): any = js.native
    def setEvents(value: any): any = js.native
    def setName(value: any): any = js.native
    def setOnentry(value: any): any = js.native
    def setOnexit(value: any): any = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.Transition")
class Transition extends qx.core.Object {
    constructor (transitionName: String = ???, transitionInfo: any = ???);
    def getAutoActionsAfterOntransition(): any = js.native
    def getAutoActionsBeforeOntransition(): any = js.native
    def getName(): String = js.native
    def getNextState(): any = js.native
    def getOntransition(): any = js.native
    def getPredicate(): any = js.native
    protected def initAutoActionsAfterOntransition(value: any): any = js.native
    protected def initAutoActionsBeforeOntransition(value: any): any = js.native
    protected def initName(value: any): String = js.native
    protected def initNextState(value: any): any = js.native
    protected def initOntransition(value: any): any = js.native
    protected def initPredicate(value: any): any = js.native
    def resetAutoActionsAfterOntransition(): Unit = js.native
    def resetAutoActionsBeforeOntransition(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetOntransition(): Unit = js.native
    def resetPredicate(): Unit = js.native
    def setAutoActionsAfterOntransition(value: any): any = js.native
    def setAutoActionsBeforeOntransition(value: any): any = js.native
    def setName(value: any): String = js.native
    def setNextState(value: any): any = js.native
    def setOntransition(value: any): any = js.native
    def setPredicate(value: any): any = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.AbstractAxis")
class AbstractAxis extends js.Object {
    protected static def _isInRange(start: Int, size: Int, areaSize: Int): Boolean = js.native
    protected static def _moveToEdgeAndAlign(size: Int, target: IMap, offsets: IMap, position: String): Int = js.native
    static def computeStart(size: Int, target: IMap, offsets: IMap, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.BestFitAxis")
class BestFitAxis extends js.Object {
    static def computeStart(size: Int, target: IMap, offsets: IMap, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.DirectAxis")
class DirectAxis extends js.Object {
    static def computeStart(size: Int, target: IMap, offsets: IMap, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.KeepAlignAxis")
class KeepAlignAxis extends js.Object {
    static def computeStart(size: Int, target: IMap, offsets: IMap, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.Placement")
class Placement extends qx.core.Object {
    constructor ();
    static def compute(size: IMap, area: IMap, target: IMap, offsets: IMap, position: String, modeX: String, modeY: String): IMap = js.native
    def getAlign(): any = js.native
    def getAxisX(): qx.Class = js.native
    def getAxisY(): qx.Class = js.native
    def getEdge(): any = js.native
    protected def initAlign(value: any): any = js.native
    protected def initAxisX(value: any): qx.Class = js.native
    protected def initAxisY(value: any): qx.Class = js.native
    protected def initEdge(value: any): any = js.native
    def resetAlign(): Unit = js.native
    def resetAxisX(): Unit = js.native
    def resetAxisY(): Unit = js.native
    def resetEdge(): Unit = js.native
    def setAlign(value: any): any = js.native
    def setAxisX(value: any): qx.Class = js.native
    def setAxisY(value: any): qx.Class = js.native
    def setEdge(value: any): any = js.native

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Document")
class Document extends js.Object {
    static def create(namespaceUri: String = ???, qualifiedName: String = ???): Document = js.native
    static def fromString(str: String): Document = js.native
    static def isXmlDocument(elem: Document): Boolean = js.native

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Element")
class Element extends js.Object {
    static def createSubElementNS(document: Document, parent: HTMLElement, name: String, namespaceUri: String): HTMLElement = js.native
    static def getAttributeNS(element: HTMLElement, namespaceUri: String, name: String): String = js.native
    static def getElementsByTagNameNS(element: HTMLElement, namespaceURI: any, tagname: String): HTMLElement[] = js.native
    static def getSingleNodeText(element: HTMLElement, query: String): String = js.native
    static def selectNodes(element: HTMLElement, query: String, namespaces: IMap): HTMLElement[] = js.native
    static def selectSingleNode(element: HTMLElement, query: String, namespaces: IMap): HTMLElement = js.native
    static def serialize(element: HTMLElement): String = js.native
    static def setAttributeNS(document: Document, element: HTMLElement, namespaceUri: String, name: String, value: String): Unit = js.native

}
}
package qx.xml {
@js.native
@JSName("qx.xml.String")
class String extends js.Object {
    static def escape(str: String): String = js.native
    static def unescape(str: String): String = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Command")
class Command extends qx.core.Object {
    constructor (shortcut: String = ???);
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: any = ???): Unit = js.native
    def getActive(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShortcut(): String = js.native
    def getToolTipText(): String = js.native
    def getValue(): any = js.native
    protected def initActive(value: any): Boolean = js.native
    protected def initEnabled(value: any): Boolean = js.native
    protected def initIcon(value: any): String = js.native
    protected def initLabel(value: any): String = js.native
    protected def initMenu(value: any): qx.ui.menu.Menu = js.native
    protected def initShortcut(value: any): String = js.native
    protected def initToolTipText(value: any): String = js.native
    protected def initValue(value: any): any = js.native
    def isActive(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetActive(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def resetToolTipText(): Unit = js.native
    def resetValue(): Unit = js.native
    def setActive(value: any): Boolean = js.native
    def setEnabled(value: any): Boolean = js.native
    def setIcon(value: any): String = js.native
    def setLabel(value: any): String = js.native
    def setMenu(value: any): qx.ui.menu.Menu = js.native
    def setShortcut(value: any): String = js.native
    def setToolTipText(value: any): String = js.native
    def setValue(value: any): any = js.native
    def toggleActive(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Group")
class Group extends qx.core.Object {
    constructor ();
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    def add(key: String, command: qx.ui.command.Command): Boolean = js.native
    def get(key: String): qx.ui.command.Command = js.native
    def getActive(): Boolean = js.native
    def has(key: String): Boolean = js.native
    protected def initActive(value: any): Boolean = js.native
    def isActive(): Boolean = js.native
    def remove(key: String): qx.ui.command.Command = js.native
    def resetActive(): Unit = js.native
    def setActive(value: any): Boolean = js.native
    def toggleActive(): Boolean = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.GroupManager")
class GroupManager extends qx.core.Object {
    constructor ();
    protected def _getGroup(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def add(group: qx.ui.command.Group): Boolean = js.native
    def block(): Unit = js.native
    def getActive(): qx.ui.command.Group = js.native
    def has(group: qx.ui.command.Group): Boolean = js.native
    def remove(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def setActive(group: qx.ui.command.Group): Boolean = js.native
    def unblock(): Unit = js.native

}
}
