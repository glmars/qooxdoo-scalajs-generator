
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
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Abstract")
class Abstract extends qx.core.Object {
    protected def _getAvailableWidth(): Int = js.native
    protected def _setNumColumns(numColumns: Int): Unit = js.native
    def onAppear(event: js.Any, forceRefresh: Boolean = ???): Unit = js.native
    def onColumnWidthChanged(event: js.Any): Unit = js.native
    def onTableWidthChanged(event: js.Any): Unit = js.native
    def onVerticalScrollBarChanged(event: js.Any): Unit = js.native
    def onVisibilityChanged(event: js.Any): Unit = js.native

}
}
