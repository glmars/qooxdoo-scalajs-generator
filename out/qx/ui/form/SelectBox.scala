
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
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SelectBox")
class SelectBox extends qx.ui.form.AbstractSelectBox with qx.ui.core.ISingleSelection with qx.ui.form.IModelSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.form.MModelSelection {
    protected def _getItems(): js.Array[qx.ui.form.ListItem] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _onKeyInput(e: qx.event.`type`.KeyInput): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native

}
}
