
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
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Abstract")
class Abstract extends qx.core.Object {
    def getElementCount(): Int = js.native
    def getNextElement(): js.Dynamic = js.native

}
}
