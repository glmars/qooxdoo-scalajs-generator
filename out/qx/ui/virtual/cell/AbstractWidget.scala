
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
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractWidget")
class AbstractWidget extends qx.core.Object with qx.ui.virtual.cell.IWidgetCell {
    override def getCellWidget(data: js.Any, states: js.Any): qx.ui.core.LayoutItem = js.native
    override def pool(widget: qx.ui.core.LayoutItem): Unit = js.native
    override def updateData(widget: qx.ui.core.LayoutItem, data: js.Any): Unit = js.native
    override def updateStates(widget: qx.ui.core.LayoutItem, states: js.Any): Unit = js.native
    protected def _cleanupPool(): Unit = js.native
    protected def _createWidget(): qx.ui.core.LayoutItem = js.native

}
}
