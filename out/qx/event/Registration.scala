
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {

package registry {

@JSName("qx.registry")
@js.native
object Registry extends js.Object {
  def registerMainMethod(fn: js.Function1[qx.application.Standalone, Unit]): Unit = js.native
}

}

}
package qx.event {
@js.native
@JSName("qx.event.Registration")
class Registration extends js.Object {

}
@js.native
@JSName("qx.event.Registration")
object Registration extends js.Object {
    def addDispatcher(dispatcher: qx.event.IEventDispatcher, priority: Int): Unit = js.native
    def addHandler(handler: qx.event.IEventHandler): Unit = js.native
    def addListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): js.Dynamic = js.native
    def createEvent(`type`: String, clazz: js.Any = ???, args: js.Array[js.Any] = ???): qx.event.`type`.Event = js.native
    def deleteAllListeners(target: js.Any): Unit = js.native
    def dispatchEvent(target: js.Any, event: qx.event.`type`.Event): Boolean = js.native
    def fireEvent(target: js.Any, `type`: String, clazz: qx.Class = ???, args: js.Array[js.Any] = ???): Boolean = js.native
    def fireNonBubblingEvent(target: js.Any, `type`: String, clazz: qx.Class = ???, args: js.Array[js.Any] = ???): Boolean = js.native
    def getDispatchers(): js.Array[qx.event.IEventDispatcher] = js.native
    def getHandlers(): js.Array[qx.event.IEventHandler] = js.native
    def getManager(target: js.Any): qx.event.Manager = js.native
    def hasListener(target: js.Any, `type`: String, capture: Boolean = ???): Boolean = js.native
    def removeAllListeners(target: js.Any): Boolean = js.native
    def removeListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: js.Any): Boolean = js.native
    def removeManager(mgr: qx.event.Manager): Unit = js.native
    def serializeListeners(target: js.Any): js.Array[js.Dynamic] = js.native

}
}
