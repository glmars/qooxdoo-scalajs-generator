
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
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Widget")
class Widget extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Widget")
object Widget extends js.Object {
    def add(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native
    def flush(): Unit = js.native
    def remove(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native

}
}
