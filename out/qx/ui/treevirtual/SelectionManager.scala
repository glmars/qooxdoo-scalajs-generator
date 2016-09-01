
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
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SelectionManager")
class SelectionManager protected () extends qx.ui.table.selection.Manager {
    def this(table: qx.ui.table.Table = ???) = this()
    protected def _handleExtendedClick(tree: qx.ui.treevirtual.TreeVirtual, evt: js.Any, node: js.Any, left: Int): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native

}
}
