
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
package qx.util.format {
@js.native
trait IFormat extends js.Object {
    def format(obj: js.Any): String
    def parse(str: String): js.Dynamic

}
}
