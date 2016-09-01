
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
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Font")
class Font extends qx.util.ValueManager {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: qx.Theme): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: qx.Theme): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Font")
object Font extends js.Object {
    def getInstance(): qx.theme.manager.Font = js.native

}
}
