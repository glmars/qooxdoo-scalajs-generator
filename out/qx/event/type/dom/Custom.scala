
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
package qx.event.`type`.dom {
@js.native
@JSName("qx.event.type.dom.Custom")
class Custom protected () extends js.Object {
    def this(`type`: String = ???, domEvent: qx.event.`type`.Event = ???, customProps: js.Any = ???) = this()
    protected def _createEvent(): qx.event.`type`.Event = js.native
    protected def _initEvent(domEvent: qx.event.`type`.Event, customProps: js.Any = ???): Unit = js.native

}
}
