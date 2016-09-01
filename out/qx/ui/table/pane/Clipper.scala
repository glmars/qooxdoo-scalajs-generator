
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
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Clipper")
class Clipper extends qx.ui.container.Composite {
    def scrollToX(value: Int): Unit = js.native
    def scrollToY(value: Int): Unit = js.native

}
}
