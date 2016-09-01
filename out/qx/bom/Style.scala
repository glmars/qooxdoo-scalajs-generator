
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
@JSName("qx.bom.Style")
class Style extends js.Object {

}
@js.native
@JSName("qx.bom.Style")
object Style extends js.Object {
    def getAppliedStyle(element: HTMLElement, propertyName: String, value: String, prefixed: Boolean = ???): String = js.native
    def getCssName(propertyName: String): String = js.native
    def getPropertyName(propertyName: String): String = js.native

}
}
