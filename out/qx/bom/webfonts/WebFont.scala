
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
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.WebFont")
class WebFont extends qx.bom.Font {
    protected def _applySources(value: js.Any, old: js.Any): Unit = js.native
    protected def _onWebFontChangeStatus(ev: qx.event.`type`.Data): Unit = js.native
    protected def _quoteFontFamily(familyName: String): String = js.native
    def getSources(): js.Dynamic = js.native
    protected def initSources(value: js.Any): js.Dynamic = js.native
    def resetSources(): Unit = js.native
    def setSources(value: js.Any): js.Dynamic = js.native

}
}
