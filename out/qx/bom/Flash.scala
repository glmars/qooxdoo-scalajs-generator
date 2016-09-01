
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
@JSName("qx.bom.Flash")
class Flash extends js.Object {

}
@js.native
@JSName("qx.bom.Flash")
object Flash extends js.Object {
    def create(element: HTMLElement, attributes: js.Any, variables: js.Any = ???, params: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def destroy(element: HTMLElement, win: Window = ???): Unit = js.native

}
}
