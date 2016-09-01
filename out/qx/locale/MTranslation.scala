
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
@JSName("qx.locale.MTranslation")
trait MTranslation extends js.Object {
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: js.Any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: js.Any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native

}
}
