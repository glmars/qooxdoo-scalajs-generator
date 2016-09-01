
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
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Scroll")
class Scroll extends js.Object {

}
@js.native
@JSName("qx.bom.element.Scroll")
object Scroll extends js.Object {
    def getScrollbarWidth(): Long = js.native
    def intoView(element: HTMLElement, stop: HTMLElement = ???, alignX: String = ???, alignY: String = ???): Unit = js.native
    def intoViewX(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native
    def intoViewY(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native

}
}
