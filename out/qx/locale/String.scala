
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
@JSName("qx.locale.String")
class String extends js.Object {

}
@js.native
@JSName("qx.locale.String")
object String extends js.Object {
    def getAlternateQuotationEnd(locale: String): String = js.native
    def getAlternateQuotationStart(locale: String): String = js.native
    def getQuotationEnd(locale: String): String = js.native
    def getQuotationStart(locale: String): String = js.native

}
}
