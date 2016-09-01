
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
@JSName("qx.bom.client.PhoneGap")
class PhoneGap extends js.Object {

}
@js.native
@JSName("qx.bom.client.PhoneGap")
object PhoneGap extends js.Object {
    def getNotification(): Boolean = js.native
    def getPhoneGap(): Boolean = js.native

}
}
