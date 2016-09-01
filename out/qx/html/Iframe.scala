
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
package qx.html {
@js.native
@JSName("qx.html.Iframe")
class Iframe protected () extends qx.html.Element {
    def this(url: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    def reload(): Unit = js.native
    def setName(name: String): qx.html.Iframe = js.native
    def setSource(source: String): qx.html.Iframe = js.native

}
}
