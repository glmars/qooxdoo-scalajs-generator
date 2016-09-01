
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
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.FocusIndicator")
class FocusIndicator protected () extends qx.ui.container.Composite {
    def this(scroller: js.Any = ???) = this()
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: Int): Int = js.native
    protected def initRow(value: Int): Int = js.native
    def moveToCell(col: Int = ???, row: Int = ???): Unit = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: Int): Int = js.native
    def setRow(value: Int): Int = js.native

}
}
