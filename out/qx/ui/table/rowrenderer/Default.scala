
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
package qx.ui.table.rowrenderer {
@js.native
@JSName("qx.ui.table.rowrenderer.Default")
class Default extends qx.core.Object with qx.ui.table.IRowRenderer {
    override def createRowStyle(rowInfo: js.Any): Unit = js.native
    override def getRowClass(rowInfo: js.Any): Unit = js.native
    override def getRowHeightStyle(height: Int): Unit = js.native
    override def updateDataRowElement(rowInfo: js.Any, rowElement: HTMLElement): Unit = js.native
    protected def _renderFont(font: qx.bom.Font): Unit = js.native
    def getHighlightFocusRow(): Boolean = js.native
    def getRowAttributes(rowInfo: js.Any): String = js.native
    protected def initHighlightFocusRow(value: Boolean): Boolean = js.native
    def initThemeValues(): Unit = js.native
    def isHighlightFocusRow(): Boolean = js.native
    def resetHighlightFocusRow(): Unit = js.native
    def setHighlightFocusRow(value: Boolean): Boolean = js.native
    def toggleHighlightFocusRow(): Boolean = js.native

}
}
