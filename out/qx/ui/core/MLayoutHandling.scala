
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
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MLayoutHandling")
trait MLayoutHandling extends js.Object {
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native

}
@js.native
@JSName("qx.ui.core.MLayoutHandling")
object MLayoutHandling extends js.Object {
    def remap(members: js.Any): Unit = js.native

}
}
