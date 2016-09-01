
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
package qx.html {
@js.native
@JSName("qx.html.Blocker")
class Blocker protected () extends qx.html.Element {
    def this(backgroundColor: String = ???, opacity: Long = ???) = this()
    protected def _stopPropagation(e: qx.event.`type`.Mouse): Unit = js.native

}
}
