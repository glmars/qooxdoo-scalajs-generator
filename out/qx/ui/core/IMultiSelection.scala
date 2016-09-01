
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
package qx.ui.core {
@js.native
trait IMultiSelection extends js.Object {
    def addToSelection(item: qx.ui.core.Widget): Unit
    def removeFromSelection(item: qx.ui.core.Widget): Unit
    def selectAll(): Unit

}
}
