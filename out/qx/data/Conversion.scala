
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
package qx.data {
@js.native
@JSName("qx.data.Conversion")
class Conversion extends js.Object {

}
@js.native
@JSName("qx.data.Conversion")
object Conversion extends js.Object {
    def toBoolean(value: js.Any): Boolean = js.native
    def toNumber(value: js.Any): Long = js.native

}
}
