
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
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Abstract")
class Abstract extends qx.ui.container.Composite {
    def join(progressive: qx.ui.progressive.Progressive): Unit = js.native

}
}
