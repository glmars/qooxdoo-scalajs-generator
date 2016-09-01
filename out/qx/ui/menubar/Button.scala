
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
package qx.ui.menubar {
@js.native
@JSName("qx.ui.menubar.Button")
class Button protected () extends qx.ui.form.MenuButton {
    def this(label: js.Any = ???, icon: js.Any = ???, menu: js.Any = ???) = this()
    def getMenuBar(): qx.ui.menubar.MenuBar = js.native

}
}
