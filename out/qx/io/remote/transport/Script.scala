
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
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Script")
class Script extends qx.io.remote.transport.Abstract {
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getResponseContent(): js.Dynamic = js.native

}
@js.native
@JSName("qx.io.remote.transport.Script")
object Script extends js.Object {
    protected def _requestFinished(id: String, content: String): Unit = js.native
    def isSupported(): Boolean = js.native

}
}
