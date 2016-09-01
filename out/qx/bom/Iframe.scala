
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
@JSName("qx.bom.Iframe")
class Iframe extends js.Object {

}
@js.native
@JSName("qx.bom.Iframe")
object Iframe extends js.Object {
    def create(attributes: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def getBody(iframe: HTMLElement): HTMLElement = js.native
    def getDocument(iframe: HTMLElement): Document = js.native
    def getWindow(iframe: HTMLElement): Window = js.native
    def queryCurrentUrl(iframe: HTMLElement): String = js.native
    def setSource(iframe: HTMLElement, source: String): Unit = js.native

}
}
