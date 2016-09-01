
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
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Button")
class Button protected () extends qx.ui.menu.AbstractButton {
    def this(label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???, menu: qx.ui.menu.Menu = ???) = this()

}
}
