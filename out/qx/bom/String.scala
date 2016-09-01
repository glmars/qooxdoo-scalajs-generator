
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
package qx.bom {
@js.native
@JSName("qx.bom.String")
class String extends js.Object {

}
@js.native
@JSName("qx.bom.String")
object String extends js.Object {
    def escape(str: String): String = js.native
    def fromText(str: String): String = js.native
    def toText(str: String): String = js.native
    def unescape(str: String): js.Dynamic = js.native

}
}
