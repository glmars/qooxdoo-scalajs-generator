
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
@JSName("qx.ui.form.Resetter")
class Resetter extends qx.core.Object {
    protected def _supportsValue(formItem: qx.core.Object): Boolean = js.native
    def add(item: qx.ui.core.Widget): Unit = js.native
    def redefine(): Unit = js.native
    def redefineItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.core.Widget): Boolean = js.native
    def reset(): Unit = js.native
    def resetItem(item: qx.ui.core.Widget): Unit = js.native

}
}
