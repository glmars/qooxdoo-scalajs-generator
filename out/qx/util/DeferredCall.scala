
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
@JSName("qx.util.DeferredCall")
class DeferredCall protected () extends qx.core.Object {
    def this(callback: js.Function = ???, context: js.Any = ???) = this()
    def call(): Unit = js.native
    def cancel(): Unit = js.native
    def schedule(): Unit = js.native

}
}
