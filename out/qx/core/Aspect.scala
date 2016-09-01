
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
@JSName("qx.core.Aspect")
class Aspect extends js.Object {

}
@js.native
@JSName("qx.core.Aspect")
object Aspect extends js.Object {
    def addAdvice(fcn: js.Function, position: String = ???, `type`: String = ???, name: String = ???): Unit = js.native
    def wrap(fullName: String, fcn: js.Function, `type`: String): js.Function = js.native

}
}
