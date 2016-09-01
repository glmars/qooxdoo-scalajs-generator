
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
package qx.util {
@js.native
@JSName("qx.util.Uri")
class Uri extends js.Object {

}
@js.native
@JSName("qx.util.Uri")
object Uri extends js.Object {
    def appendParamsToUrl(url: String, params: String): String = js.native
    def getAbsolute(uri: String): String = js.native
    def parseUri(str: String, strict: Boolean): js.Dynamic = js.native
    def toParameter(obj: js.Any, post: Boolean): String = js.native

}
}
