
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
@JSName("qx.data.MBinding")
trait MBinding extends js.Object {
    def bind(sourcePropertyChain: String, targetObject: qx.core.Object, targetProperty: String, options: js.Any): js.Dynamic = js.native
    def getBindings(): js.Array[js.Any] = js.native
    def removeAllBindings(): Unit = js.native
    def removeBinding(id: js.Any): Unit = js.native
    def removeRelatedBindings(relatedObject: qx.core.Object): Unit = js.native

}
}
