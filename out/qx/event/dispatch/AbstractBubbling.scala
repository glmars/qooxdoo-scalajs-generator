
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
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.AbstractBubbling")
class AbstractBubbling protected () extends qx.core.Object with qx.event.IEventDispatcher {
    override def canDispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Boolean = js.native
    override def dispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _getParent(target: js.Any): js.Dynamic = js.native

}
}
