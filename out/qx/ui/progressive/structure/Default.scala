
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
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Default")
class Default protected () extends qx.ui.progressive.structure.Abstract {
    def this(header: qx.ui.progressive.headfoot.Abstract = ???, footer: qx.ui.progressive.headfoot.Abstract = ???, pane: qx.ui.core.Widget = ???) = this()
    def getFooter(): qx.ui.progressive.headfoot.Abstract = js.native
    def getHeader(): qx.ui.progressive.headfoot.Abstract = js.native

}
}
