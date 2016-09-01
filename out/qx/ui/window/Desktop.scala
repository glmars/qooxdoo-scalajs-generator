
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
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Desktop")
class Desktop protected () extends qx.ui.core.Widget with qx.ui.window.IDesktop with qx.ui.core.MChildrenHandling with qx.ui.window.MDesktop with qx.ui.core.MBlocker {
    def this(windowManager: qx.ui.window.IWindowManager = ???) = this()

}
}
