
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
@JSName("qx.html.Canvas")
class Canvas protected () extends qx.html.Element {
    def this(styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getCanvas(): HTMLElement = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getHeight(): Int = js.native
    def getWidth(): Int = js.native
    def setHeight(height: Int): Unit = js.native
    def setWidth(width: Int): Unit = js.native

}
}
