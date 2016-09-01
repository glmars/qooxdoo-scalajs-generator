
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
package qx.bom {
@js.native
@JSName("qx.bom.Window")
class Window extends js.Object {

}
@js.native
@JSName("qx.bom.Window")
object Window extends js.Object {
    def close(win: Window): js.Dynamic = js.native
    def getBlocker(): qx.bom.Blocker = js.native
    def isClosed(win: Window): Boolean = js.native
    def moveTo(win: Window, top: Int, left: Int): Unit = js.native
    def open(url: String, name: String, options: js.Any, modal: Boolean, useNativeModalDialog: Boolean, listener: js.Function = ???, self: js.Any = ???): Window = js.native
    def resizeTo(win: Window, width: Int, height: Int): Unit = js.native

}
}
