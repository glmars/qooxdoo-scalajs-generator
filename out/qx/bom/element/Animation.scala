
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
@JSName("qx.bom.element.Animation")
class Animation extends js.Object {

}
@js.native
@JSName("qx.bom.element.Animation")
object Animation extends js.Object {
    def animate(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def animateReverse(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native

}
}
