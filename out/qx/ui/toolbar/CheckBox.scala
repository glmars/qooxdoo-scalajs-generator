
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
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.CheckBox")
class CheckBox protected () extends qx.ui.form.ToggleButton {
    def this(label: js.Any = ???, icon: js.Any = ???) = this()

}
}
