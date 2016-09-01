
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
package qx.ui.tree.core {
@js.native
trait IVirtualTreeDelegate extends js.Object {
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit
    def configureItem(item: qx.ui.core.Widget): Unit
    def createItem(): qx.ui.core.Widget
    def filter(data: js.Any): Boolean
    def onPool(item: qx.ui.core.Widget): Unit
    def sorter(a: js.Any, b: js.Any): Int

}
}
