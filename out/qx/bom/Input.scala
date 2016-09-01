
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
@JSName("qx.bom.Input")
class Input extends js.Object {

}
@js.native
@JSName("qx.bom.Input")
object Input extends js.Object {
    def create(`type`: String, attributes: js.Any, win: Window): HTMLElement = js.native
    def getValue(element: HTMLElement): String = js.native
    def setValue(element: HTMLElement, value: String): Unit = js.native
    def setWrap(element: HTMLElement, wrap: Boolean): Unit = js.native

}
}
