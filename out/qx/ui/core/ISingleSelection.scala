
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
trait ISingleSelection extends js.Object {
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget]
    def getSelection(): js.Array[qx.ui.core.Widget]
    def isSelected(item: qx.ui.core.Widget): Boolean
    def isSelectionEmpty(): Boolean
    def resetSelection(): Unit
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit

}
}
