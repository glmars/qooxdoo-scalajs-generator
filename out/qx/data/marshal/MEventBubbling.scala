
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
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.MEventBubbling")
trait MEventBubbling extends js.Object {
    protected def _applyEventPropagation(value: js.Any, old: js.Any, name: String): Unit = js.native
    protected def _registerEventChaining(value: js.Any, old: js.Any, name: String): Unit = js.native

}
}
