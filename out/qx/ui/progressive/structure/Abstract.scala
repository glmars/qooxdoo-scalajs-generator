
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
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Abstract")
class Abstract protected () extends qx.core.Object {
    def this(pane: qx.ui.core.Widget = ???) = this()
    def applyStructure(progressive: qx.ui.progressive.Progressive): Unit = js.native
    def getPane(): qx.ui.core.Widget = js.native

}
}
