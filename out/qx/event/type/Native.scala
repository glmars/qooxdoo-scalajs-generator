
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
@JSName("qx.event.type.Native")
class Native extends qx.event.`type`.Event {
    protected def _cloneNativeEvent(nativeEvent: qx.event.`type`.Event, cloneQx: js.Any): js.Dynamic = js.native
    def getNativeEvent(): qx.event.`type`.Event = js.native
    def getReturnValue(): String = js.native
    def setReturnValue(returnValue: String = ???): Unit = js.native

}
}
