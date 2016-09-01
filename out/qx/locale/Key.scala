
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
package qx.locale {
@js.native
@JSName("qx.locale.Key")
class Key extends js.Object {

}
@js.native
@JSName("qx.locale.Key")
object Key extends js.Object {
    def getKeyName(size: String, keyIdentifier: String, locale: String): String = js.native

}
}
