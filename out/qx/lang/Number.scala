
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
package qx.lang {
@js.native
@JSName("qx.lang.Number")
class Number extends js.Object {

}
@js.native
@JSName("qx.lang.Number")
object Number extends js.Object {
    def isBetweenRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    def isInRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    def limit(nr: Long, vmin: Int, vmax: Int): Int = js.native

}
}
