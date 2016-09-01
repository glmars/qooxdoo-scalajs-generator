
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
package qx.core {
@js.native
@JSName("qx.core.ObjectRegistry")
class ObjectRegistry extends js.Object {

}
@js.native
@JSName("qx.core.ObjectRegistry")
object ObjectRegistry extends js.Object {
    def clearHashCode(obj: js.Any): Unit = js.native
    def fromHashCode(hash: String): qx.core.Object = js.native
    def getNextHash(): Int = js.native
    def getPostId(): Int = js.native
    def getRegistry(): js.Dynamic = js.native
    def getStackTraces(): js.Dynamic = js.native
    def register(obj: js.Any): Unit = js.native
    def shutdown(): Unit = js.native
    def toHashCode(obj: js.Any): String = js.native
    def unregister(obj: js.Any): Unit = js.native

}
}
