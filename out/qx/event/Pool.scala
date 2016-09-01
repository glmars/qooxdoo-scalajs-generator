
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
package qx.event {
@js.native
@JSName("qx.event.Pool")
class Pool extends qx.util.ObjectPool {

}
@js.native
@JSName("qx.event.Pool")
object Pool extends js.Object {
    def getInstance(): qx.event.Pool = js.native

}
}
