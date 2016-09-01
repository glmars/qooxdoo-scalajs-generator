
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
@JSName("qx.event.handler.Mouse")
class Mouse protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initButtonObserver(): Unit = js.native
    protected def _initMoveObserver(): Unit = js.native
    protected def _initWheelObserver(): Unit = js.native
    protected def _onButtonEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onMoveEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onWheelEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopButtonObserver(): Unit = js.native
    protected def _stopMoveObserver(): Unit = js.native
    protected def _stopWheelObserver(): Unit = js.native
    def preventNextClick(): Unit = js.native

}
}
