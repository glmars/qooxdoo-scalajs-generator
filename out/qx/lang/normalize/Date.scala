
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
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Date")
class Date extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Date")
object Date extends js.Object {
    def now(): Int = js.native

}
}
