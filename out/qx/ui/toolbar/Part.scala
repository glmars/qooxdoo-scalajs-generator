
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
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Part")
class Part extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling {
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    def addSeparator(): Unit = js.native
    def getMenuButtons(): js.Array[js.Any] = js.native
    def getShow(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: Int): Int = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: Int): Int = js.native

}
}
