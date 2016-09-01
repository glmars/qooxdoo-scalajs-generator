
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
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MWheelHandling")
trait MWheelHandling extends js.Object {
    protected def _onMouseWheel(e: qx.event.`type`.Mouse): Unit = js.native

}
}
