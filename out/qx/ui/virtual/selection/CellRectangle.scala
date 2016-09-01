
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
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.CellRectangle")
class CellRectangle extends qx.ui.virtual.selection.Abstract {
    protected def _getItemCount(): Int = js.native

}
}
