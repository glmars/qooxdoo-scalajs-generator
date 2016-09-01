
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
@JSName("qx.event.handler.PointerCore")
class PointerCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _determineActiveTouches(`type`: String, changedTouches: js.Array[js.Any]): Unit = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _initObserver(callback: js.Function, useEmitter: Boolean): Unit = js.native
    protected def _initPointerObserver(): Unit = js.native
    protected def _isSimulatedMouseEvent(x: Int, y: Int): Boolean = js.native
    protected def _onMouseEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onTouchEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
