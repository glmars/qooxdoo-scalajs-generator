
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
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Icon")
class Icon protected () extends qx.ui.table.headerrenderer.Default {
    def this(iconUrl: String = ???, tooltip: String = ???) = this()
    def getIconUrl(): String = js.native
    protected def initIconUrl(value: String): String = js.native
    def resetIconUrl(): Unit = js.native
    def setIconUrl(value: String): String = js.native

}
}
