
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
package qx.ui.tree.provider {
@js.native
trait IVirtualTreeProvider extends js.Object {
    def createLayer(): qx.ui.virtual.layer.Abstract
    def createRenderer(): js.Dynamic
    def isSelectable(row: Int): Boolean
    def setChildProperty(value: String): Unit
    def setLabelPath(value: String): Unit
    def styleSelectabled(row: Int): Unit
    def styleUnselectabled(row: Int): Unit

}
}
