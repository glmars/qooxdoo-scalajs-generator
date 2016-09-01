
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
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Event")
class Event extends js.Object {

}
@js.native
@JSName("qx.bom.client.Event")
object Event extends js.Object {
    def getCustomEvent(): Boolean = js.native
    def getDispatchEvent(): Boolean = js.native
    def getHashChange(): Boolean = js.native
    def getHelp(): Boolean = js.native
    def getMouseEvent(): Boolean = js.native
    def getMouseWheel(win: Window = ???): js.Dynamic = js.native
    def getMsPointer(): Boolean = js.native
    def getTouch(): Boolean = js.native

}
}
