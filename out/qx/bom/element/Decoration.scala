
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
@JSName("qx.bom.element.Decoration")
class Decoration extends js.Object {

}
@js.native
@JSName("qx.bom.element.Decoration")
object Decoration extends js.Object {
    def create(source: String, repeat: String, style: js.Any): String = js.native
    def getAttributes(source: String, repeat: String, style: js.Any): String = js.native
    def getTagName(repeat: String, source: String = ???): String = js.native
    def processAlphaFix(style: js.Any, repeat: String, source: String): js.Dynamic = js.native
    def update(element: HTMLElement, source: String, repeat: String, style: js.Any): Unit = js.native

}
}
