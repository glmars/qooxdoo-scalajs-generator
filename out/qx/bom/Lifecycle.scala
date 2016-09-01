
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
@JSName("qx.bom.Lifecycle")
class Lifecycle extends js.Object {

}
@js.native
@JSName("qx.bom.Lifecycle")
object Lifecycle extends js.Object {
    def onReady(callback: js.Function, context: js.Any = ???): Unit = js.native
    def onShutdown(callback: js.Function, context: js.Any = ???): Unit = js.native

}
}
