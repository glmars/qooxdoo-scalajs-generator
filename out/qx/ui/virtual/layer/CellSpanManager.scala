
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
@JSName("qx.ui.virtual.layer.CellSpanManager")
class CellSpanManager protected () extends qx.core.Object {
    def this(rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    protected def _findCellsInRange(key: String, min: Int, max: Int): js.Dynamic = js.native
    protected def _getColumnPosition(column: Int): Int = js.native
    protected def _getRowPosition(row: Int): Int = js.native
    protected def _getSingleCellBounds(cell: js.Any, firstVisibleRow: js.Any, firstVisibleColumn: js.Any): js.Dynamic = js.native
    protected def _getSortedCells(key: String): js.Array[js.Dynamic] = js.native
    protected def _invalidatePositionCache(): Unit = js.native
    protected def _invalidateSortCache(): Unit = js.native
    protected def _onColumnConfigChange(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRowConfigChange(e: qx.event.`type`.Event): Unit = js.native
    def addCell(id: String, row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native
    def computeCellSpanMap(cells: js.Array[js.Any], firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): js.Array[js.Dynamic] = js.native
    def findCellsInWindow(firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): js.Array[js.Dynamic] = js.native
    def getCellBounds(cells: js.Array[js.Any], firstVisibleRow: js.Any, firstVisibleColumn: js.Any): js.Array[js.Dynamic] = js.native
    def removeCell(id: String): Unit = js.native

}
}
