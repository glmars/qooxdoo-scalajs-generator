
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
@JSName("qx.core.WindowError")
class WindowError protected () extends js.Error {
    def this(failMessage: String = ???, uri: String = ???, lineNumber: Int = ???) = this()
    def getLineNumber(): Int = js.native
    def getUri(): String = js.native

}
}
