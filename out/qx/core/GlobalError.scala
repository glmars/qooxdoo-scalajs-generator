
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
package qx.core {
@js.native
@JSName("qx.core.GlobalError")
class GlobalError protected () extends js.Error {
    def this(exc: js.Error = ???, args: js.Array[js.Any] = ???) = this()
    def getArguments(): js.Dynamic = js.native
    def getSourceException(): js.Error = js.native

}
}
