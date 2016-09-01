
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
@JSName("qx.util.ExtendedColor")
class ExtendedColor extends js.Object {

}
@js.native
@JSName("qx.util.ExtendedColor")
object ExtendedColor extends js.Object {
    def isExtendedColor(value: String): Boolean = js.native
    def toRgb(value: String): js.Array[js.Any] = js.native
    def toRgbString(value: String): String = js.native

}
}
