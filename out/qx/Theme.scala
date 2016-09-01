
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
package qx {
@js.native
@JSName("qx.Theme")
class Theme extends js.Object {

}
@js.native
@JSName("qx.Theme")
object Theme extends js.Object {
    def define(name: String, config: js.Any): Unit = js.native
    def genericToString(): String = js.native
    def getAll(): js.Dynamic = js.native
    def getByName(name: String): js.Dynamic = js.native
    def getTotalNumber(): Long = js.native
    def include(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native
    def isDefined(name: String): Boolean = js.native
    def patch(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native

}
}
