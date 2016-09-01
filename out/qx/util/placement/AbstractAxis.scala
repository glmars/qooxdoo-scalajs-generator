
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
package qx.util.placement {
@js.native
@JSName("qx.util.placement.AbstractAxis")
class AbstractAxis extends js.Object {

}
@js.native
@JSName("qx.util.placement.AbstractAxis")
object AbstractAxis extends js.Object {
    protected def _isInRange(start: Int, size: Int, areaSize: Int): Boolean = js.native
    protected def _moveToEdgeAndAlign(size: Int, target: js.Any, offsets: js.Any, position: String): Int = js.native
    def computeStart(size: Int, target: js.Any, offsets: js.Any, areaSize: Int, position: String): Int = js.native

}
}
