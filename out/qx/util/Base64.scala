
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
@JSName("qx.util.Base64")
class Base64 extends js.Object {

}
@js.native
@JSName("qx.util.Base64")
object Base64 extends js.Object {
    def decode(input: String, is8bit: Boolean = ???): String = js.native
    def encode(input: String, is8bit: Boolean = ???): String = js.native

}
}
