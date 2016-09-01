
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
@JSName("qx.ui.progressive.model.Default")
class Default extends qx.ui.progressive.model.Abstract {
    def addElement(elem: js.Any): Unit = js.native
    def addElements(elems: js.Array[js.Any]): Unit = js.native

}
}
