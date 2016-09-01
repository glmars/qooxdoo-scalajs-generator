
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
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Icon")
class Icon extends qx.ui.progressive.renderer.table.cell.Abstract {
    protected def _identifyImage(cellInfo: js.Any): js.Dynamic = js.native
    def getBlankImage(): String = js.native

}
}
