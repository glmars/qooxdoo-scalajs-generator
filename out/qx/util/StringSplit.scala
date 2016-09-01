
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
@JSName("qx.util.StringSplit")
class StringSplit extends js.Object {

}
@js.native
@JSName("qx.util.StringSplit")
object StringSplit extends js.Object {
    def split(str: String, separator: js.RegExp, limit: Int = ???): js.Array[String] = js.native

}
}
