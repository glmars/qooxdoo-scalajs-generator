
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
package qx.application {
@js.native
@JSName("qx.application.Basic")
class Basic extends qx.core.Object with qx.application.IApplication {
    override def close(): String = js.native
    @JSName("finalize")
    override def finalizeQx(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native

}
}
