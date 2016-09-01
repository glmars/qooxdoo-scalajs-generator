
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
package qx.util {
@js.native
@JSName("qx.util.Delegate")
class Delegate extends js.Object {

}
@js.native
@JSName("qx.util.Delegate")
object Delegate extends js.Object {
    def containsMethod(delegate: js.Any, specificMethod: String): Boolean = js.native
    def getMethod(delegate: js.Any, specificMethod: String): js.Function = js.native

}
}
