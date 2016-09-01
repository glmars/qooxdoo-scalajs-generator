
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
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCellSpan")
class HtmlCellSpan protected () extends qx.ui.virtual.layer.HtmlCell {
    def this(htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

}
}
