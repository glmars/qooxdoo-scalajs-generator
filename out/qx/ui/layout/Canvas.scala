
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
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Canvas")
class Canvas extends qx.ui.layout.Abstract {
    def getDesktop(): Boolean = js.native
    protected def initDesktop(value: Boolean): Boolean = js.native
    def isDesktop(): Boolean = js.native
    def resetDesktop(): Unit = js.native
    def setDesktop(value: Boolean): Boolean = js.native
    def toggleDesktop(): Boolean = js.native

}
}
