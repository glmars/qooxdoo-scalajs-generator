
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
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Replace")
class Replace extends qx.ui.table.cellrenderer.Default {
    def addReversedReplaceMap(): Boolean = js.native
    def getReplaceFunction(): js.Function = js.native
    def getReplaceMap(): js.Dynamic = js.native
    protected def initReplaceFunction(value: js.Function): js.Function = js.native
    protected def initReplaceMap(value: js.Any): js.Dynamic = js.native
    def resetReplaceFunction(): Unit = js.native
    def resetReplaceMap(): Unit = js.native
    def setReplaceFunction(value: js.Function): js.Function = js.native
    def setReplaceMap(value: js.Any): js.Dynamic = js.native

}
}
