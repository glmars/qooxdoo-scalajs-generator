
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
trait IRequest extends js.Object {
    def abort(): Unit
    def getAllResponseHeaders(): String
    def getResponseHeader(header: String): String
    def onabort(): Unit
    def onerror(): Unit
    def onload(): Unit
    def onloadend(): Unit
    def onreadystatechange(): Unit
    def ontimeout(): Unit
    def open(method: String, url: String, async: Boolean = ???): Unit
    def send(data: String = ???): Unit
    def setRequestHeader(key: String, value: String): Unit

}
}
