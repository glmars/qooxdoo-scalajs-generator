
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
package qx.event.handler {
@js.native
@JSName("qx.event.handler.OrientationCore")
class OrientationCore protected () extends js.Object {
    def this(targetWindow: Window = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native

}
}
