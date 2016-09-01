
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
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Jsonp")
class Jsonp extends qx.bom.request.Script {
    def callback(data: js.Any): Unit = js.native
    def getGeneratedUrl(): String = js.native
    def setCallbackName(name: String): qx.bom.request.Jsonp = js.native
    def setCallbackParam(param: String): qx.bom.request.Jsonp = js.native
    def setPrefix(prefix: String): Unit = js.native

}
}
