
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
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.AbstractField")
class AbstractField extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    protected def _createEditor(): qx.ui.core.Widget = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initValidationFunction(value: js.Function): js.Function = js.native
    def resetValidationFunction(): Unit = js.native
    def setValidationFunction(value: js.Function): js.Function = js.native

}
}
