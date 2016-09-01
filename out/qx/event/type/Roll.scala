
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
package qx.event.`type` {
@js.native
@JSName("qx.event.type.Roll")
class Roll extends qx.event.`type`.Pointer {
    def getDelta(): js.Dynamic = js.native
    def getMomentum(): Boolean = js.native
    def stopMomentum(): Unit = js.native

}
}
