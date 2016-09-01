
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
@JSName("qx.html.Flash")
class Flash protected () extends qx.html.Element {
    def this(styles: js.Any = ???, attributes: js.Any = ???) = this()
    def createFlash(): Unit = js.native
    def getAttributes(): js.Dynamic = js.native
    def getFlashElement(): HTMLElement = js.native
    def getParams(): js.Dynamic = js.native
    def getVariables(): js.Dynamic = js.native
    def setId(value: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    def setSource(value: String): Unit = js.native
    def setVariables(value: js.Any): Unit = js.native

}
}
