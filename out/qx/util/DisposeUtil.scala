
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
@JSName("qx.util.DisposeUtil")
class DisposeUtil extends js.Object {

}
@js.native
@JSName("qx.util.DisposeUtil")
object DisposeUtil extends js.Object {
    protected def _collectContainerChildren(container: qx.ui.container.Composite, arr: js.Array[js.Any]): Unit = js.native
    def destroyContainer(container: qx.ui.container.Composite): Unit = js.native
    def disposeArray(obj: js.Any, field: String): Unit = js.native
    def disposeMap(obj: js.Any, field: String): Unit = js.native
    def disposeObjects(obj: js.Any, arr: js.Array[js.Any], disposeSingletons: Boolean = ???): Unit = js.native
    def disposeTriggeredBy(disposeMe: js.Any, trigger: js.Any): Unit = js.native

}
}
