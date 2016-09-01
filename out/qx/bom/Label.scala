
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
@JSName("qx.bom.Label")
class Label extends js.Object {

}
@js.native
@JSName("qx.bom.Label")
object Label extends js.Object {
    def create(content: String, html: Boolean = ???, win: Window = ???): HTMLElement = js.native
    def getHtmlSize(content: String, styles: js.Any = ???, width: Int = ???): js.Dynamic = js.native
    def getTextSize(text: String, styles: js.Any): js.Dynamic = js.native
    def getValue(element: HTMLElement): String = js.native
    def setSanitizer(func: js.Function): Unit = js.native
    def setValue(element: HTMLElement, value: String): Unit = js.native

}
}
