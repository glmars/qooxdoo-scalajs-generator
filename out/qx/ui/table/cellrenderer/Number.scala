
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
@JSName("qx.ui.table.cellrenderer.Number")
class Number extends qx.ui.table.cellrenderer.Conditional {
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    protected def initNumberFormat(value: qx.util.format.NumberFormat): qx.util.format.NumberFormat = js.native
    def resetNumberFormat(): Unit = js.native
    def setNumberFormat(value: qx.util.format.NumberFormat): qx.util.format.NumberFormat = js.native

}
}
