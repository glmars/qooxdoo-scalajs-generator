
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
@JSName("qx.Interface")
class Interface extends js.Object {

}
@js.native
@JSName("qx.Interface")
object Interface extends js.Object {
    def assert(clazz: qx.Class, iface: qx.Interface, wrap: Boolean = ???): Unit = js.native
    def assertObject(obj: qx.core.Object, iface: qx.Interface): Unit = js.native
    def classImplements(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def define(name: String, config: js.Any = ???): qx.Interface = js.native
    def flatten(ifaces: js.Array[qx.Interface] = ???): js.Array[js.Any] = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getTotalNumber(): Long = js.native
    def isDefined(name: String): Boolean = js.native
    def objectImplements(obj: qx.core.Object, iface: qx.Interface): Boolean = js.native

}
}
