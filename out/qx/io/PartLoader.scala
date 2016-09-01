
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
package qx.io {
@js.native
@JSName("qx.io.PartLoader")
class PartLoader extends qx.core.Object {
    def getPart(name: String): qx.io.part.Part = js.native
    def getParts(): js.Dynamic = js.native
    def hasPart(name: String): Boolean = js.native
    def require(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native

}
@js.native
@JSName("qx.io.PartLoader")
object PartLoader extends js.Object {
    def getInstance(): qx.io.PartLoader = js.native

}
}
