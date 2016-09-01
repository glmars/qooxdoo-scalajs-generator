
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
@JSName("qx.event.type.Pointer")
class Pointer extends qx.event.`type`.Mouse {
    def getHeight(): Long = js.native
    def getPointerId(): Long = js.native
    def getPointerType(): String = js.native
    def getPressure(): Long = js.native
    def getTiltX(): Long = js.native
    def getTiltY(): Long = js.native
    def getWidth(): Long = js.native
    def isPrimary(): Boolean = js.native

}
}
