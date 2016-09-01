
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
package qx.`type` {
@js.native
@JSName("qx.type.BaseError")
class BaseError protected () extends js.Error {
    def this(comment: String = ???, failMessage: String = ???) = this()
    def getComment(): String = js.native

}
}
