
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
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.log.appender.Util")
object Util extends js.Object {
    def escapeHTML(value: String): String = js.native
    def formatOffset(offset: Int, length: Int = ???): String = js.native
    def toHtml(entry: js.Any): Unit = js.native
    def toText(entry: js.Any): String = js.native
    def toTextArray(entry: js.Any): js.Array[js.Any] = js.native

}
}
