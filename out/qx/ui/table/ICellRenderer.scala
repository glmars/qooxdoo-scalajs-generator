
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
package qx.ui.table {
@js.native
trait ICellRenderer extends js.Object {
    def createDataCellHtml(cellInfo: js.Any, htmlArr: js.Array[String]): Boolean

}
}
