
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
@JSName("qx.ui.virtual.cell.Boolean")
class Boolean extends qx.ui.virtual.cell.AbstractImage {
    protected def _applyIconFalse(value: String, old: String): Unit = js.native
    protected def _applyIconTrue(value: String, old: String): Unit = js.native
    def getIconFalse(): String = js.native
    def getIconTrue(): String = js.native
    protected def initIconFalse(value: String): String = js.native
    protected def initIconTrue(value: String): String = js.native
    def resetIconFalse(): Unit = js.native
    def resetIconTrue(): Unit = js.native
    def setIconFalse(value: String): String = js.native
    def setIconTrue(value: String): String = js.native

}
}
