
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
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dataset")
class Dataset extends js.Object {

}
@js.native
@JSName("qx.bom.element.Dataset")
object Dataset extends js.Object {
    def get(element: HTMLElement, name: String): js.Dynamic = js.native
    def getAll(element: HTMLElement): js.Dynamic = js.native
    def hasData(element: HTMLElement): Boolean = js.native
    def remove(element: HTMLElement, name: String): Unit = js.native
    def set(element: HTMLElement, name: String, value: js.Any): Unit = js.native

}
}
