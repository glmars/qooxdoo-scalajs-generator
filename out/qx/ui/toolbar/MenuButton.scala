
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
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.MenuButton")
class MenuButton extends qx.ui.menubar.Button {
    protected def _applyShowArrow(value: Boolean, old: Boolean): Unit = js.native
    def getShowArrow(): Boolean = js.native
    protected def initShowArrow(value: Boolean): Boolean = js.native
    def isShowArrow(): Boolean = js.native
    def resetShowArrow(): Unit = js.native
    def setShowArrow(value: Boolean): Boolean = js.native
    def toggleShowArrow(): Boolean = js.native

}
}
