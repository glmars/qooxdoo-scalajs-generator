
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
@JSName("qx.bom.element.Dimension")
class Dimension extends js.Object {

}
@js.native
@JSName("qx.bom.element.Dimension")
object Dimension extends js.Object {
    protected def _getBoundingClientRect(element: HTMLElement): js.Dynamic = js.native
    def getContentHeight(element: HTMLElement): Int = js.native
    def getContentSize(element: HTMLElement): js.Dynamic = js.native
    def getContentWidth(element: HTMLElement): Int = js.native
    def getHeight(element: HTMLElement): Int = js.native
    def getSize(element: HTMLElement): js.Dynamic = js.native
    def getWidth(element: HTMLElement): Int = js.native

}
}
