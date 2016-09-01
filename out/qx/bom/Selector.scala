
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
package qx.bom {
@js.native
@JSName("qx.bom.Selector")
class Selector extends js.Object {

}
@js.native
@JSName("qx.bom.Selector")
object Selector extends js.Object {
    def matches(selector: String, set: js.Array[js.Any]): js.Array[js.Any] = js.native
    def query(selector: String, context: HTMLElement): js.Array[js.Any] = js.native

}
}
