
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
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Composite")
class Composite protected () extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling with qx.ui.core.MLayoutHandling {
    def this(layout: qx.ui.layout.Abstract = ???) = this()

}
}
