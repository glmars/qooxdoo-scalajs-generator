
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
package qx.lang {
@js.native
@JSName("qx.lang.Json")
class Json extends js.Object {

}
@js.native
@JSName("qx.lang.Json")
object Json extends js.Object {
    def parse(text: String, reviver: js.Function = ???): js.Dynamic = js.native
    def stringify(value: js.Any, replacer: js.Function = ???, space: String = ???): String = js.native

}
}
