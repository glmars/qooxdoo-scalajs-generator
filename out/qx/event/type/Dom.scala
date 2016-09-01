
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
@JSName("qx.event.type.Dom")
class Dom extends qx.event.`type`.Native {
    def getModifiers(): Int = js.native
    def isAltPressed(): Boolean = js.native
    def isCtrlOrCommandPressed(): Boolean = js.native
    def isCtrlPressed(): Boolean = js.native
    def isMetaPressed(): Boolean = js.native
    def isShiftPressed(): Boolean = js.native

}
}
