
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
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MSingleSelectionHandling")
trait MSingleSelectionHandling extends js.Object {
    protected def _onChangeSelected(e: qx.event.`type`.Data): Unit = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native

}
}
