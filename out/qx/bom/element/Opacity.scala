
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
@JSName("qx.bom.element.Opacity")
class Opacity extends js.Object {

}
@js.native
@JSName("qx.bom.element.Opacity")
object Opacity extends js.Object {
    def compile(opacity: Float): String = js.native
    def get(element: HTMLElement, mode: Long): Float = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, opacity: Float): Unit = js.native

}
}
