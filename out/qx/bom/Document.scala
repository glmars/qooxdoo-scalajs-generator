
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
@JSName("qx.bom.Document")
class Document extends js.Object {

}
@js.native
@JSName("qx.bom.Document")
object Document extends js.Object {
    def getHeight(win: Window = ???): Int = js.native
    def getWidth(win: Window = ???): Int = js.native
    def isQuirksMode(win: Window = ???): Boolean = js.native
    def isStandardMode(win: Window = ???): Boolean = js.native

}
}
