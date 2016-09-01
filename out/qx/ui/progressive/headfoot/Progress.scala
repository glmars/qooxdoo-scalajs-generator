
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
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Progress")
class Progress protected () extends qx.ui.progressive.headfoot.Abstract {
    def this(columnWidths: qx.ui.progressive.renderer.table.Widths = ???, labelArr: js.Array[js.Any] = ???) = this()

}
}
