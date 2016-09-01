
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
@JSName("qx.bom.Html")
class Html extends js.Object {

}
@js.native
@JSName("qx.bom.Html")
object Html extends js.Object {
    def clean(objs: js.Array[HTMLElement], context: Document = ???, fragment: HTMLElement = ???): js.Array[HTMLElement] = js.native
    def extractScripts(elements: js.Array[HTMLElement], fragment: Document = ???): js.Array[HTMLElement] = js.native
    def fixEmptyTags(html: String): String = js.native

}
}
