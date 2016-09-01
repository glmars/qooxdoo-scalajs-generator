
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
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Splitter")
class Splitter protected () extends qx.ui.core.Widget {
    def this(parentWidget: qx.ui.splitpane.Pane = ???) = this()

}
}
