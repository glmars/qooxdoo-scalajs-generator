
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
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MNativeOverflow")
trait MNativeOverflow extends js.Object {
    protected def _applyOverflowX(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyOverflowY(value: js.Any, old: js.Any): Unit = js.native
    def getOverflowX(): js.Dynamic = js.native
    def getOverflowY(): js.Dynamic = js.native
    protected def initOverflowX(value: js.Any): js.Dynamic = js.native
    protected def initOverflowY(value: js.Any): js.Dynamic = js.native
    def resetOverflow(): Unit = js.native
    def resetOverflowX(): Unit = js.native
    def resetOverflowY(): Unit = js.native
    def setOverflow(overflowX: js.Any, overflowY: js.Any): Unit = js.native
    def setOverflowX(value: js.Any): js.Dynamic = js.native
    def setOverflowY(value: js.Any): js.Dynamic = js.native

}
}
