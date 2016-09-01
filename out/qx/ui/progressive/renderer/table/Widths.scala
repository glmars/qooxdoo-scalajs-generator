
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
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Widths")
class Widths protected () extends qx.core.Object {
    def this(numColumns: Int = ???) = this()
    def getData(): js.Array[js.Any] = js.native
    def set(column: Int, map: js.Any): Unit = js.native
    def setMaxWidth(column: Int, width: Int): Unit = js.native
    def setMinWidth(column: Int, width: Int): Unit = js.native
    def setWidth(column: Int, width: Int): Unit = js.native

}
}
