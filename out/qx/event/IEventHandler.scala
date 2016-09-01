
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
trait IEventHandler extends js.Object {
    def canHandleEvent(target: js.Any, `type`: String): Boolean
    def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit
    def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit

}
}
