
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
package qx.data.marshal {
@js.native
trait IMarshaler extends js.Object {
    def toClass(data: js.Any, includeBubbleEvents: Boolean): Unit
    def toModel(data: js.Any): qx.core.Object

}
}
