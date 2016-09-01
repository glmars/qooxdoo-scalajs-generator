
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
package qx.ui.table {
@js.native
trait IRowRenderer extends js.Object {
    def createRowStyle(rowInfo: js.Any): Unit
    def getRowClass(rowInfo: js.Any): Unit
    def getRowHeightStyle(height: Int): Unit
    def updateDataRowElement(rowInfo: js.Any, rowElement: HTMLElement): Unit

}
}
