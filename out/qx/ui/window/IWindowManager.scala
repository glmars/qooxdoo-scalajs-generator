
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
package qx.ui.window {
@js.native
trait IWindowManager extends js.Object {
    def bringToFront(win: Window): Unit
    def changeActiveWindow(active: Window, oldActive: Window): Unit
    def sendToBack(win: Window): Unit
    def setDesktop(desktop: qx.ui.window.IDesktop): Unit
    def updateStack(): Unit

}
}
