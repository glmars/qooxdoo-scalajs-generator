
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
@JSName("qx.bom.Blocker")
class Blocker extends qx.core.Object {
    def block(element: js.Any = ???): Unit = js.native
    def getBlockerColor(): String = js.native
    def getBlockerElement(): HTMLElement = js.native
    def getBlockerOpacity(): Int = js.native
    def getBlockerZIndex(): Int = js.native
    def isBlocked(): Boolean = js.native
    def setBlockerColor(color: String): Unit = js.native
    def setBlockerOpacity(opacity: String): Unit = js.native
    def setBlockerZIndex(zIndex: Int): Unit = js.native
    def unblock(): Unit = js.native

}
}
