
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
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
class CellStylesheet extends qx.core.Object {
    def computeClassForStyles(key: String, styleString: String): String = js.native
    def getCssClass(key: String): String = js.native
    def getStylesheet(): js.Dynamic = js.native

}
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
object CellStylesheet extends js.Object {
    def getInstance(): qx.ui.virtual.cell.CellStylesheet = js.native

}
}
