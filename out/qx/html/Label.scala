
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
package qx.html {
@js.native
@JSName("qx.html.Label")
class Label extends qx.html.Element {
    def getValue(): String = js.native
    def setRich(value: Boolean): qx.html.Label = js.native
    def setValue(value: String): qx.html.Label = js.native

}
}
