
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
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Layout")
class Layout extends qx.ui.layout.VBox {
    def getArrowColumnWidth(): Int = js.native
    def getColumnSizes(): js.Array[js.Any] = js.native
    def getColumnSpacing(): Int = js.native
    def getIconColumnWidth(): Int = js.native
    def getSpanColumn(): Int = js.native
    protected def initArrowColumnWidth(value: Int): Int = js.native
    protected def initColumnSpacing(value: Int): Int = js.native
    protected def initIconColumnWidth(value: Int): Int = js.native
    protected def initSpanColumn(value: Int): Int = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetColumnSpacing(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetSpanColumn(): Unit = js.native
    def setArrowColumnWidth(value: Int): Int = js.native
    def setColumnSpacing(value: Int): Int = js.native
    def setIconColumnWidth(value: Int): Int = js.native
    def setSpanColumn(value: Int): Int = js.native

}
}
