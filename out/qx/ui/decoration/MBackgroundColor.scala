
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
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundColor")
trait MBackgroundColor extends js.Object {
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _styleBackgroundColor(styles: js.Any): Unit = js.native
    def getBackgroundColor(): String = js.native
    protected def initBackgroundColor(value: String): String = js.native
    def resetBackgroundColor(): Unit = js.native
    def setBackgroundColor(value: String): String = js.native

}
}
