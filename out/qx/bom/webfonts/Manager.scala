
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
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Manager")
class Manager extends qx.core.Object {
    def getPreferredFormats(): js.Array[String] = js.native
    def remove(familyName: String): Unit = js.native
    def removeStyleSheet(): Unit = js.native
    def require(familyName: String, sourcesList: js.Array[String], callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
@js.native
@JSName("qx.bom.webfonts.Manager")
object Manager extends js.Object {
    def getInstance(): qx.bom.webfonts.Manager = js.native

}
}
