
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
trait IWidgetCell extends js.Object {
    def getCellWidget(data: js.Any, states: js.Any): qx.ui.core.LayoutItem
    def pool(widget: qx.ui.core.LayoutItem): Unit
    def updateData(widget: qx.ui.core.LayoutItem, data: js.Any): Unit
    def updateStates(widget: qx.ui.core.LayoutItem, states: js.Any): Unit

}
}
