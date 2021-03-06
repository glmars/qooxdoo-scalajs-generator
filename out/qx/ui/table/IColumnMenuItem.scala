
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
package qx.ui.table {
@js.native
trait IColumnMenuItem extends js.Object {
    def getVisible(): js.Dynamic
    protected def initVisible(value: js.Any): js.Dynamic
    def resetVisible(): Unit
    def setVisible(value: js.Any): js.Dynamic

}
}
