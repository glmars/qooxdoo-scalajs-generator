
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
@JSName("qx.util.ResponseParser")
class ResponseParser protected () extends js.Object {
    def this(parser: String = ???) = this()
    protected def _getParser(contentType: String): js.Function = js.native
    def parse(response: String, contentType: String): String = js.native
    def setParser(parser: String): js.Function = js.native

}
}
