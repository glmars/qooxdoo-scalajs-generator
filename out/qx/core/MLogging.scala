
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
@JSName("qx.core.MLogging")
trait MLogging extends js.Object {
    def debug(varargs: js.Any = ???): Unit = js.native
    def error(varargs: js.Any = ???): Unit = js.native
    def info(varargs: js.Any = ???): Unit = js.native
    def trace(): Unit = js.native
    def warn(varargs: js.Any = ???): Unit = js.native

}
}
