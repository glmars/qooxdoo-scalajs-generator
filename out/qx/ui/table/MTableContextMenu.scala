
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
@JSName("qx.ui.table.MTableContextMenu")
trait MTableContextMenu extends js.Object {
    def getContextMenuHandler(col: Int): js.Function = js.native
    def setContextMenuHandler(col: Int, handler: js.Function, context: js.Any = ???): Unit = js.native

}
}
