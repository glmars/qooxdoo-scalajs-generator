
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
@JSName("qx.ui.form.renderer.Single")
class Single protected () extends qx.ui.form.renderer.AbstractRenderer {
    def this(form: js.Any = ???) = this()
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
