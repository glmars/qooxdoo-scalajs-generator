
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
package qx.ui.table {
@js.native
@JSName("qx.ui.table.Table")
class Table protected () extends qx.ui.core.Widget with qx.ui.core.MDragDropScrolling {
    def this(tableModel: qx.ui.table.ITableModel = ???, custom: js.Any = ???) = this()
    protected def _applyAdditionalStatusBarText(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyColumnVisibilityButtonVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyContextMenuFromDataCellsOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFocusCellOnPointerMove(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyHeaderCellHeight(value: Int, old: Int): Unit = js.native
    protected def _applyHeaderCellsVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyKeepFirstVisibleRowComplete(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMetaColumnCounts(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyResetSelectionOnHeaderTap(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyRowHeight(value: Long, old: Long): Unit = js.native
    protected def _applySelectionModel(value: qx.ui.table.selection.Model, old: qx.ui.table.selection.Model): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatusBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTableModel(value: qx.ui.table.ITableModel, old: qx.ui.table.ITableModel): Unit = js.native
    protected def _cleanUpMetaColumns(fromMetaColumn: Int): Unit = js.native
    protected def _createColumnVisibilityCheckBoxHandler(col: Int): js.Function = js.native
    protected def _getMetaColumnAtColumnX(visXPos: Int): Int = js.native
    protected def _getMetaColumnAtPageX(pageX: Int): Int = js.native
    protected def _getPaneScrollerArr(): js.Array[qx.ui.table.pane.Scroller] = js.native
    protected def _initColumnMenu(): Unit = js.native
    protected def _onChangeLocale(evt: qx.event.`type`.Event): Unit = js.native
    protected def _onColOrderChanged(evt: js.Any): Unit = js.native
    protected def _onColVisibilityChanged(evt: js.Any): Unit = js.native
    protected def _onColWidthChanged(evt: js.Any): Unit = js.native
    protected def _onFocusChanged(evt: js.Any): Unit = js.native
    protected def _onKeyPress(evt: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onScrollY(evt: js.Any): Unit = js.native
    protected def _onSelectionChanged(evt: js.Any): Unit = js.native
    protected def _onTableModelDataChanged(evt: js.Any): Unit = js.native
    protected def _onTableModelMetaDataChanged(evt: js.Any): Unit = js.native
    protected def _updateScrollBarVisibility(): Unit = js.native
    protected def _updateScrollerWidths(): Unit = js.native
    protected def _updateStatusBar(): Unit = js.native
    protected def _updateTableData(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int, removeStart: Int = ???, removeCount: Int = ???): Unit = js.native
    def blockHeaderElements(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def clearFocusedRowHighlight(evt: qx.event.`type`.Pointer): Unit = js.native
    def getAdditionalStatusBarText(): js.Dynamic = js.native
    def getAlwaysUpdateCells(): Boolean = js.native
    def getColumnVisibilityButtonVisible(): Boolean = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getDataRowRenderer(): qx.ui.table.IRowRenderer = js.native
    def getEmptyTableModel(): qx.ui.table.ITableModel = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getForceLineHeight(): Boolean = js.native
    def getHeaderCellHeight(): Int = js.native
    def getHeaderCellsVisible(): Boolean = js.native
    def getInitiallyHiddenColumns(): js.Dynamic = js.native
    def getKeepFirstVisibleRowComplete(): Boolean = js.native
    def getMetaColumnCounts(): js.Dynamic = js.native
    def getModalCellEditorPreOpenFunction(): js.Function = js.native
    def getNewColumnMenu(): js.Function = js.native
    def getNewSelectionManager(): js.Function = js.native
    def getNewSelectionModel(): js.Function = js.native
    def getNewTableColumnModel(): js.Function = js.native
    def getNewTablePane(): js.Function = js.native
    def getNewTablePaneHeader(): js.Function = js.native
    def getNewTablePaneModel(): js.Function = js.native
    def getNewTablePaneScroller(): js.Function = js.native
    def getPaneScroller(metaColumn: Int): qx.ui.table.pane.Scroller = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getRowFocusChangeModifiesSelection(): Boolean = js.native
    def getRowHeight(): Long = js.native
    def getSelectionManager(): qx.ui.table.selection.Manager = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getStatusBarVisible(): Boolean = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Basic = js.native
    def getTableModel(): qx.ui.table.ITableModel = js.native
    def getTablePaneScrollerAtPageX(pageX: Int): qx.ui.table.pane.Scroller = js.native
    def highlightFocusedRow(bHighlight: Boolean): Unit = js.native
    protected def initAdditionalStatusBarText(value: js.Any): js.Dynamic = js.native
    protected def initAlwaysUpdateCells(value: Boolean): Boolean = js.native
    protected def initColumnVisibilityButtonVisible(value: Boolean): Boolean = js.native
    protected def initContextMenuFromDataCellsOnly(value: Boolean): Boolean = js.native
    protected def initDataRowRenderer(value: qx.ui.table.IRowRenderer): qx.ui.table.IRowRenderer = js.native
    protected def initFocusCellOnPointerMove(value: Boolean): Boolean = js.native
    protected def initForceLineHeight(value: Boolean): Boolean = js.native
    protected def initHeaderCellHeight(value: Int): Int = js.native
    protected def initHeaderCellsVisible(value: Boolean): Boolean = js.native
    protected def initInitiallyHiddenColumns(value: js.Any): js.Dynamic = js.native
    protected def initKeepFirstVisibleRowComplete(value: Boolean): Boolean = js.native
    protected def initMetaColumnCounts(value: js.Any): js.Dynamic = js.native
    protected def initModalCellEditorPreOpenFunction(value: js.Function): js.Function = js.native
    protected def initNewColumnMenu(value: js.Function): js.Function = js.native
    protected def initNewSelectionManager(value: js.Function): js.Function = js.native
    protected def initNewSelectionModel(value: js.Function): js.Function = js.native
    protected def initNewTableColumnModel(value: js.Function): js.Function = js.native
    protected def initNewTablePane(value: js.Function): js.Function = js.native
    protected def initNewTablePaneHeader(value: js.Function): js.Function = js.native
    protected def initNewTablePaneModel(value: js.Function): js.Function = js.native
    protected def initNewTablePaneScroller(value: js.Function): js.Function = js.native
    protected def initResetSelectionOnHeaderTap(value: Boolean): Boolean = js.native
    protected def initRowFocusChangeModifiesSelection(value: Boolean): Boolean = js.native
    protected def initRowHeight(value: Long): Long = js.native
    protected def initSelectionModel(value: qx.ui.table.selection.Model): qx.ui.table.selection.Model = js.native
    protected def initShowCellFocusIndicator(value: Boolean): Boolean = js.native
    protected def initStatusBarVisible(value: Boolean): Boolean = js.native
    protected def initTableModel(value: qx.ui.table.ITableModel): qx.ui.table.ITableModel = js.native
    def isAlwaysUpdateCells(): Boolean = js.native
    def isColumnVisibilityButtonVisible(): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): js.Dynamic = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isForceLineHeight(): Boolean = js.native
    def isHeaderCellsVisible(): Boolean = js.native
    def isKeepFirstVisibleRowComplete(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isRowFocusChangeModifiesSelection(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isStatusBarVisible(): Boolean = js.native
    def moveFocusedCell(deltaX: Int, deltaY: Int): Unit = js.native
    def resetAdditionalStatusBarText(): Unit = js.native
    def resetAlwaysUpdateCells(): Unit = js.native
    def resetCellFocus(): Unit = js.native
    def resetColumnVisibilityButtonVisible(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetDataRowRenderer(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetForceLineHeight(): Unit = js.native
    def resetHeaderCellHeight(): Unit = js.native
    def resetHeaderCellsVisible(): Unit = js.native
    def resetInitiallyHiddenColumns(): Unit = js.native
    def resetKeepFirstVisibleRowComplete(): Unit = js.native
    def resetMetaColumnCounts(): Unit = js.native
    def resetModalCellEditorPreOpenFunction(): Unit = js.native
    def resetNewColumnMenu(): Unit = js.native
    def resetNewSelectionManager(): Unit = js.native
    def resetNewSelectionModel(): Unit = js.native
    def resetNewTableColumnModel(): Unit = js.native
    def resetNewTablePane(): Unit = js.native
    def resetNewTablePaneHeader(): Unit = js.native
    def resetNewTablePaneModel(): Unit = js.native
    def resetNewTablePaneScroller(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetRowFocusChangeModifiesSelection(): Unit = js.native
    def resetRowHeight(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionModel(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetStatusBarVisible(): Unit = js.native
    def resetTableModel(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setAdditionalStatusBarText(value: js.Any): js.Dynamic = js.native
    def setAlwaysUpdateCells(value: Boolean): Boolean = js.native
    def setColumnVisibilityButtonVisible(value: Boolean): Boolean = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: Boolean): Boolean = js.native
    def setDataRowRenderer(value: qx.ui.table.IRowRenderer): qx.ui.table.IRowRenderer = js.native
    def setFocusCellOnPointerMove(value: Boolean): Boolean = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, scrollVisible: Boolean = ???): Unit = js.native
    def setForceLineHeight(value: Boolean): Boolean = js.native
    def setHeaderCellHeight(value: Int): Int = js.native
    def setHeaderCellsVisible(value: Boolean): Boolean = js.native
    def setInitiallyHiddenColumns(value: js.Any): js.Dynamic = js.native
    def setKeepFirstVisibleRowComplete(value: Boolean): Boolean = js.native
    def setMetaColumnCounts(value: js.Any): js.Dynamic = js.native
    def setModalCellEditorPreOpenFunction(value: js.Function): js.Function = js.native
    def setNewColumnMenu(value: js.Function): js.Function = js.native
    def setNewSelectionManager(value: js.Function): js.Function = js.native
    def setNewSelectionModel(value: js.Function): js.Function = js.native
    def setNewTableColumnModel(value: js.Function): js.Function = js.native
    def setNewTablePane(value: js.Function): js.Function = js.native
    def setNewTablePaneHeader(value: js.Function): js.Function = js.native
    def setNewTablePaneModel(value: js.Function): js.Function = js.native
    def setNewTablePaneScroller(value: js.Function): js.Function = js.native
    def setResetSelectionOnHeaderTap(value: Boolean): Boolean = js.native
    def setRowFocusChangeModifiesSelection(value: Boolean): Boolean = js.native
    def setRowHeight(value: Long): Long = js.native
    def setSelectionModel(value: qx.ui.table.selection.Model): qx.ui.table.selection.Model = js.native
    def setShowCellFocusIndicator(value: Boolean): Boolean = js.native
    def setStatusBarVisible(value: Boolean): Boolean = js.native
    def setTableModel(value: qx.ui.table.ITableModel): qx.ui.table.ITableModel = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleAlwaysUpdateCells(): Boolean = js.native
    def toggleColumnVisibilityButtonVisible(): Boolean = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleForceLineHeight(): Boolean = js.native
    def toggleHeaderCellsVisible(): Boolean = js.native
    def toggleKeepFirstVisibleRowComplete(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleRowFocusChangeModifiesSelection(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleStatusBarVisible(): Boolean = js.native
    def unblockHeaderElements(): Unit = js.native
    def updateContent(): Unit = js.native

}
}
