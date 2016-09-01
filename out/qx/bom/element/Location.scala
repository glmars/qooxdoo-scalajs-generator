
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
@JSName("qx.bom.element.Location")
class Location extends js.Object {

}
@js.native
@JSName("qx.bom.element.Location")
object Location extends js.Object {
    def get(elem: HTMLElement, mode: String = ???): js.Dynamic = js.native
    def getBottom(elem: HTMLElement, mode: String): Int = js.native
    def getLeft(elem: HTMLElement, mode: String): Int = js.native
    def getOffsetParent(element: HTMLElement): HTMLElement = js.native
    def getPosition(elem: HTMLElement): js.Dynamic = js.native
    def getRelative(elem1: HTMLElement, elem2: HTMLElement, mode1: String = ???, mode2: String = ???): js.Dynamic = js.native
    def getRight(elem: HTMLElement, mode: String): Int = js.native
    def getTop(elem: HTMLElement, mode: String): Int = js.native

}
}
