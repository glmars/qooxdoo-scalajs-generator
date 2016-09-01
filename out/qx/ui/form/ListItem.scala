
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
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ListItem")
class ListItem protected () extends qx.ui.basic.Atom with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    def this(label: String = ???, icon: String = ???, model: String = ???) = this()
    protected def _onPointerOut(): Unit = js.native
    protected def _onPointerOver(): Unit = js.native

}
}
