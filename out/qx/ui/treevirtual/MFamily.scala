
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
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MFamily")
trait MFamily extends js.Object {
    def familyGetFirstChild(nodeReference: js.Any): Int = js.native
    def familyGetLastChild(nodeReference: js.Any): Int = js.native
    def familyGetNextSibling(nodeReference: js.Any): Int = js.native
    def familyGetPrevSibling(nodeReference: js.Any): Int = js.native

}
}
