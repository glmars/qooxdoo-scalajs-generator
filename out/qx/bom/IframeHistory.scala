
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
package qx.bom {
@js.native
@JSName("qx.bom.IframeHistory")
class IframeHistory extends qx.bom.History {
    protected def _setState(state: String): Unit = js.native

}
}
