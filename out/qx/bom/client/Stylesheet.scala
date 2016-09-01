
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
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Stylesheet")
class Stylesheet extends js.Object {

}
@js.native
@JSName("qx.bom.client.Stylesheet")
object Stylesheet extends js.Object {
    def getAddImport(): Boolean = js.native
    def getCreateStyleSheet(): Boolean = js.native
    def getDeleteRule(): Boolean = js.native
    def getInsertRule(): Boolean = js.native
    def getRemoveImport(): Boolean = js.native

}
}
