
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
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Scroller")
class Scroller protected () extends qx.ui.core.scroll.AbstractScrollArea {
    def this(rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???) = this()
    def getPane(): qx.ui.virtual.core.Pane = js.native

}
}
