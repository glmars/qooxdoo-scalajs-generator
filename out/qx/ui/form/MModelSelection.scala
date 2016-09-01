
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
@JSName("qx.ui.form.MModelSelection")
trait MModelSelection extends js.Object {
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(modelSelection: js.Array[js.Any]): Unit = js.native

}
}
