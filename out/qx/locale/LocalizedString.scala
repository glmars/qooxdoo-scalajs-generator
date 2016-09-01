
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
@JSName("qx.locale.LocalizedString")
class LocalizedString protected () extends qx.`type`.BaseString {
    def this(translation: String = ???, messageId: String = ???, args: js.Array[js.Any] = ???) = this()
    def getMessageId(): String = js.native
    def translate(): qx.locale.LocalizedString = js.native

}
}
