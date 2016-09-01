
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
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.SinglePlaceholder")
class SinglePlaceholder extends qx.ui.form.renderer.Single with qx.ui.form.renderer.IFormRenderer {
    override def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    override def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: js.Array[js.Any] = ???, headerOptions: js.Any = ???): Unit = js.native

}
}
