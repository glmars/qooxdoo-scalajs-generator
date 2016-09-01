
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
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Manager")
class Manager extends qx.core.Object {
    protected def _handleSelectEvent(index: Int, evt: js.Any): Unit = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def handleMoveKeyDown(index: Int, evt: js.Any): Unit = js.native
    def handleSelectKeyDown(index: Int, evt: js.Any): Unit = js.native
    def handleTap(index: Int, evt: qx.event.`type`.Tap): Unit = js.native
    protected def initSelectionModel(value: qx.ui.table.selection.Model): qx.ui.table.selection.Model = js.native
    def resetSelectionModel(): Unit = js.native
    def setSelectionModel(value: qx.ui.table.selection.Model): qx.ui.table.selection.Model = js.native

}
}
