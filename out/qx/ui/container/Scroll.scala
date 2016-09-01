
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
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Scroll")
class Scroll protected () extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.MContentPadding {
    def this(content: qx.ui.core.LayoutItem = ???) = this()
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
