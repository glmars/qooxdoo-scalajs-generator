
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
@JSName("qx.bom.WebWorker")
class WebWorker protected () extends qx.core.Object {
    def this(src: String = ???) = this()
    protected def _handleError(e: qx.event.`type`.Event): Unit = js.native
    protected def _handleMessage(e: qx.event.`type`.Event): Unit = js.native
    def postMessage(msg: String): Unit = js.native

}
}
