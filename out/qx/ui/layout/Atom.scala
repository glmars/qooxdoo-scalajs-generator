
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
@JSName("qx.ui.layout.Atom")
class Atom extends qx.ui.layout.Abstract {
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIconPosition(): js.Dynamic = js.native
    protected def initCenter(value: Boolean): Boolean = js.native
    protected def initGap(value: Int): Int = js.native
    protected def initIconPosition(value: js.Any): js.Dynamic = js.native
    def isCenter(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def setCenter(value: Boolean): Boolean = js.native
    def setGap(value: Int): Int = js.native
    def setIconPosition(value: js.Any): js.Dynamic = js.native
    def toggleCenter(): Boolean = js.native

}
}
