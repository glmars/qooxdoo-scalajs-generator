
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
@JSName("qx.ui.table.cellrenderer.AbstractImage")
class AbstractImage extends qx.ui.table.cellrenderer.Abstract {
    protected def _getImageInfos(cellInfo: js.Any): js.Dynamic = js.native
    protected def _identifyImage(cellInfo: js.Any): js.Dynamic = js.native
    def getRepeat(): js.Dynamic = js.native
    protected def initRepeat(value: js.Any): js.Dynamic = js.native
    def resetRepeat(): Unit = js.native
    def setRepeat(value: js.Any): js.Dynamic = js.native

}
}
