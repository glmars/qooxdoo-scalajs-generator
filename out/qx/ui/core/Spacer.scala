
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
@JSName("qx.ui.core.Spacer")
class Spacer protected () extends qx.ui.core.LayoutItem {
    def this(width: Int = ???, height: Int = ???) = this()
    def addChildrenToQueue(queue: js.Any): Unit = js.native
    def checkAppearanceNeeds(): Unit = js.native
    def destroy(): Unit = js.native

}
}
