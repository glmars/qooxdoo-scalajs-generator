
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
package qx.bom {
@js.native
@JSName("qx.bom.Storage")
class Storage extends js.Object {

}
@js.native
@JSName("qx.bom.Storage")
object Storage extends js.Object {
    def getLocal(): qx.bom.storage.Web = js.native
    def getSession(): qx.bom.storage.Web = js.native

}
}
