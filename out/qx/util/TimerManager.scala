
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
@JSName("qx.util.TimerManager")
class TimerManager extends qx.core.Object {
    def start(callback: js.Function, recurTime: Int, context: qx.core.Object, userData: js.Any, initialTime: Int): Int = js.native
    def stop(timerId: Int): Unit = js.native

}
@js.native
@JSName("qx.util.TimerManager")
object TimerManager extends js.Object {
    def getInstance(): qx.util.TimerManager = js.native

}
}
