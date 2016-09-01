
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
package qx.bom {
@js.native
@JSName("qx.bom.Template")
class Template extends js.Object {

}
@js.native
@JSName("qx.bom.Template")
object Template extends js.Object {
    protected def _createNodeFromTemplate(template: String): HTMLElement = js.native
    def get(id: String, view: js.Any, partials: js.Any): HTMLElement = js.native
    def render(template: String, view: js.Any, partials: js.Any): String = js.native
    def renderToNode(template: String, view: js.Any, partials: js.Any): HTMLElement = js.native

}
}
