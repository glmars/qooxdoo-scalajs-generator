
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
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
class XmlHttp extends qx.io.remote.transport.Abstract {
    protected def _onreadystatechange(e: qx.event.`type`.Event): Unit = js.native
    def failedLocally(): Unit = js.native
    def getParseJson(): Boolean = js.native
    def getReadyState(): Int = js.native
    def getRequest(): js.Dynamic = js.native
    def getResponseContent(): js.Dynamic = js.native
    def getStringResponseHeaders(): js.Dynamic = js.native
    protected def initParseJson(value: Boolean): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def resetParseJson(): Unit = js.native
    def setParseJson(value: Boolean): Boolean = js.native
    def toggleParseJson(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
object XmlHttp extends js.Object {
    def createRequestObject(): js.Dynamic = js.native
    def isSupported(): Boolean = js.native

}
}
