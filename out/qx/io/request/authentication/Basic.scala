
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
package qx.io.request.authentication {
@js.native
@JSName("qx.io.request.authentication.Basic")
class Basic protected () extends qx.core.Object with qx.io.request.authentication.IAuthentication {
    override def getAuthHeaders(): js.Array[js.Dynamic] = js.native
    def this(username: js.Any = ???, password: js.Any = ???) = this()

}
}
