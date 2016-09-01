
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
package qx.ui.list.core {
@js.native
trait IListDelegate extends js.Object {
    def bindGroupItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit
    def configureGroupItem(item: qx.ui.core.Widget): Unit
    def configureItem(item: qx.ui.core.Widget): Unit
    def createGroupItem(): qx.ui.core.Widget
    def createItem(): qx.ui.core.Widget
    def filter(data: js.Any): Boolean
    def group(data: js.Any): String
    def onPool(item: qx.ui.core.Widget): Unit
    def sorter(a: js.Any, b: js.Any): Int

}
}
