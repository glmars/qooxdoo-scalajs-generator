
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
@JSName("qx.ui.core.scroll.MRoll")
trait MRoll extends js.Object {
    protected def _addRollHandling(): Unit = js.native
    protected def _onPointerDownForRoll(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _removeRollHandling(): Unit = js.native

}
}
