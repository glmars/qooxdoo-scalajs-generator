
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
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Widget")
class Widget protected () extends qx.ui.core.selection.Abstract {
    def this(widget: qx.ui.core.Widget = ???) = this()
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
