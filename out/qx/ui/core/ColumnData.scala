
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
@JSName("qx.ui.core.ColumnData")
class ColumnData extends qx.ui.core.LayoutItem {
    def getComputedWidth(): Int = js.native
    def getFlex(): Int = js.native
    def setColumnWidth(width: Int, flex: Int = ???): Unit = js.native

}
}
