
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
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Application")
class Application protected () extends qx.ui.root.Abstract {
    def this(doc: Document = ???) = this()
    protected def _onResize(e: qx.event.`type`.Event): Unit = js.native

}
}
