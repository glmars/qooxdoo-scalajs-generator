
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
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTreeItem")
class VirtualTreeItem extends qx.ui.tree.core.AbstractItem {
    protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeChildProperty(e: qx.event.`type`.Data): Unit = js.native
    protected def _onChangeLength(): Unit = js.native

}
}
