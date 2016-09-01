
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
@JSName("qx.bom.client.Browser")
class Browser extends js.Object {

}
@js.native
@JSName("qx.bom.client.Browser")
object Browser extends js.Object {
    def getDocumentMode(): Long = js.native
    def getName(): String = js.native
    def getQuirksMode(): Boolean = js.native
    def getVersion(): String = js.native

}
}
