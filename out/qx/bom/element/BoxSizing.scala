
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
@JSName("qx.bom.element.BoxSizing")
class BoxSizing extends js.Object {

}
@js.native
@JSName("qx.bom.element.BoxSizing")
object BoxSizing extends js.Object {
    def compile(value: String): String = js.native
    def get(element: HTMLElement): String = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, value: String): Unit = js.native

}
}
