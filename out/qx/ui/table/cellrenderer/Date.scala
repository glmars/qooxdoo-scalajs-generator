
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
@JSName("qx.ui.table.cellrenderer.Date")
class Date extends qx.ui.table.cellrenderer.Conditional {
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native

}
}
