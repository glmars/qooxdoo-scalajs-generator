
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
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.PartContainer")
class PartContainer extends qx.ui.container.Composite {
    def getShow(): js.Dynamic = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def resetShow(): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native

}
}
