
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
@JSName("qx.bom.client.Xml")
class Xml extends js.Object {

}
@js.native
@JSName("qx.bom.client.Xml")
object Xml extends js.Object {
    def getAttributeNS(): Boolean = js.native
    def getCreateElementNS(): Boolean = js.native
    def getCreateNode(): Boolean = js.native
    def getDomParser(): Boolean = js.native
    def getDomProperties(): Boolean = js.native
    def getElementsByTagNameNS(): Boolean = js.native
    def getImplementation(): Boolean = js.native
    def getQualifiedItem(): Boolean = js.native
    def getSelectNodes(): Boolean = js.native
    def getSelectSingleNode(): Boolean = js.native

}
}
