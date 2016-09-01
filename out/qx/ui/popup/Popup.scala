
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
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Popup")
class Popup protected () extends qx.ui.container.Composite with qx.ui.core.MPlacement {
    def this(layout: js.Any = ???) = this()
    def getAutoHide(): Boolean = js.native
    protected def initAutoHide(value: Boolean): Boolean = js.native
    def isAutoHide(): Boolean = js.native
    def resetAutoHide(): Unit = js.native
    def setAutoHide(value: Boolean): Boolean = js.native
    def toggleAutoHide(): Boolean = js.native

}
}
