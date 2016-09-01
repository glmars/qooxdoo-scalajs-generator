
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
@JSName("qx.event.type.Swipe")
class Swipe extends qx.event.`type`.Pointer {
    def getAxis(): String = js.native
    def getDirection(): String = js.native
    def getDistance(): Int = js.native
    def getDuration(): Int = js.native
    def getStartTime(): Int = js.native
    def getVelocity(): Long = js.native

}
}
