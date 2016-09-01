
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
@JSName("qx.core.BaseInit")
class BaseInit extends js.Object {

}
@js.native
@JSName("qx.core.BaseInit")
object BaseInit extends js.Object {
    def getApplication(): qx.core.Object = js.native
    def ready(): Unit = js.native

}
}
