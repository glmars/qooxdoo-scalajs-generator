
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
@JSName("qx.util.StringEscape")
class StringEscape extends js.Object {

}
@js.native
@JSName("qx.util.StringEscape")
object StringEscape extends js.Object {
    def escape(str: String, charCodeToEntities: js.Any): String = js.native
    def unescape(str: String, entitiesToCharCode: js.Any): String = js.native

}
}
