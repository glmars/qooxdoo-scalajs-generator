
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
package qx.ui.virtual.selection {
@js.native
trait ISelectionDelegate extends js.Object {
    def isItemSelectable(item: js.Any): Boolean
    def styleSelectable(item: js.Any, `type`: String, wasAdded: Boolean): Unit

}
}
