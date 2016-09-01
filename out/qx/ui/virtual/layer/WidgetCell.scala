
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
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCell")
class WidgetCell protected () extends qx.ui.virtual.layer.Abstract with qx.ui.core.MChildrenHandling {
    def this(widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???) = this()
    protected def _activateNotEmptyChild(elementToPool: qx.ui.core.Widget): Unit = js.native
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native

}
}
