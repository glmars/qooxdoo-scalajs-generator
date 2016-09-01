
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
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.WidgetCell")
class WidgetCell extends qx.ui.virtual.cell.AbstractWidget {
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    def resetDelegate(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native

}
}
