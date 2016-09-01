
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
@JSName("qx.bom.element.Background")
class Background extends js.Object {

}
@js.native
@JSName("qx.bom.element.Background")
object Background extends js.Object {
    def compile(source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): String = js.native
    def getStyles(source: String, repeat: String = ???, left: Int = ???, top: Int = ???): js.Dynamic = js.native
    def set(element: HTMLElement, source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): Unit = js.native

}
}
