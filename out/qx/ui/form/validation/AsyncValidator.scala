
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
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.AsyncValidator")
class AsyncValidator protected () extends qx.core.Object {
    def this(validator: js.Function = ???) = this()
    def setValid(valid: Boolean, message: String = ???): Unit = js.native
    def validate(item: qx.ui.core.Widget, value: js.Any, manager: qx.ui.form.validation.Manager, context: js.Any = ???): Unit = js.native
    def validateForm(items: js.Array[qx.ui.core.Widget], manager: qx.ui.form.validation.Manager, context: js.Any = ???): Unit = js.native

}
}
