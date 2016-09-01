
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
@JSName("qx.bom.PageVisibility")
class PageVisibility protected () extends qx.event.Emitter {
    def this(document: Document = ???) = this()
    def getVisibilityState(): String = js.native
    def isHidden(): Boolean = js.native

}
@js.native
@JSName("qx.bom.PageVisibility")
object PageVisibility extends js.Object {
    def getInstance(): qx.bom.PageVisibility = js.native

}
}
