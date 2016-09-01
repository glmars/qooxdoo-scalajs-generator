
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
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Default")
class Default extends qx.ui.table.cellrenderer.Abstract {
    protected def _formatValue(cellInfo: js.Any): String = js.native
    protected def _getStyleFlags(cellInfo: js.Any): Int = js.native
    def getUseAutoAlign(): Boolean = js.native
    protected def initUseAutoAlign(value: Boolean): Boolean = js.native
    def isUseAutoAlign(): Boolean = js.native
    def resetUseAutoAlign(): Unit = js.native
    def setUseAutoAlign(value: Boolean): Boolean = js.native
    def toggleUseAutoAlign(): Boolean = js.native

}
}
