
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
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Engine")
class Engine extends js.Object {

}
@js.native
@JSName("qx.bom.client.Engine")
object Engine extends js.Object {
    def getName(): String = js.native
    def getVersion(): String = js.native

}
}
