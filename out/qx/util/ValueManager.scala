
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
@JSName("qx.util.ValueManager")
class ValueManager extends qx.core.Object {
    protected def _getDynamic(): js.Dynamic = js.native
    protected def _setDynamic(value: js.Any): Unit = js.native
    def isDynamic(value: String): Boolean = js.native
    def resolve(value: String): js.Dynamic = js.native
    def resolveDynamic(value: String): js.Dynamic = js.native

}
}
