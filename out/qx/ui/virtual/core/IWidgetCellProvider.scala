
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
package qx.ui.virtual.core {
@js.native
trait IWidgetCellProvider extends js.Object {
    def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem
    def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit

}
}
