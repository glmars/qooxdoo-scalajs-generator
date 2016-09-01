
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
package qx.util {
@js.native
@JSName("qx.util.Wheel")
class Wheel extends js.Object {

}
@js.native
@JSName("qx.util.Wheel")
object Wheel extends js.Object {
    def getDelta(domEvent: qx.event.`type`.Event, axis: String = ???): Int = js.native

}
}
