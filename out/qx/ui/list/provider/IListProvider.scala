
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
package qx.ui.list.provider {
@js.native
trait IListProvider extends js.Object {
    def createGroupRenderer(): js.Dynamic
    def createItemRenderer(): js.Dynamic
    def createLayer(): qx.ui.virtual.layer.Abstract
    def isSelectable(row: Int): Boolean
    def removeBindings(): Unit
    def setDelegate(delegate: js.Any): Unit
    def setIconOptions(options: js.Any): Unit
    def setIconPath(path: String): Unit
    def setLabelOptions(options: js.Any): Unit
    def setLabelPath(path: String): Unit
    def styleSelectabled(row: Int): Unit
    def styleUnselectabled(row: Int): Unit

}
}
