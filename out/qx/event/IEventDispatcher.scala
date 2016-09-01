
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
package qx.event {
@js.native
trait IEventDispatcher extends js.Object {
    def canDispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Boolean
    def dispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Unit

}
}
