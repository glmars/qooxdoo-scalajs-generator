
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
package qx.ui.core {
@js.native
@JSName("qx.ui.core.DragDropCursor")
class DragDropCursor extends qx.ui.basic.Image with qx.ui.core.MPlacement {
    protected def _applyAction(value: js.Any, old: js.Any): Unit = js.native
    def getAction(): js.Dynamic = js.native
    protected def initAction(value: js.Any): js.Dynamic = js.native
    def resetAction(): Unit = js.native
    def setAction(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.ui.core.DragDropCursor")
object DragDropCursor extends js.Object {
    def getInstance(): qx.ui.core.DragDropCursor = js.native

}
}
