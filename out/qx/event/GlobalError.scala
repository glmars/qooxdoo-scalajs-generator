
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
package qx.event {
@js.native
@JSName("qx.event.GlobalError")
class GlobalError extends js.Object {

}
@js.native
@JSName("qx.event.GlobalError")
object GlobalError extends js.Object {
    def handleError(ex: qx.core.WindowError): Unit = js.native
    def observeMethod(method: js.Function): js.Function = js.native
    def setErrorHandler(callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
}
