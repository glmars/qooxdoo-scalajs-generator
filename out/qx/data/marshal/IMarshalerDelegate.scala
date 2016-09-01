
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
package qx.data.marshal {
@js.native
trait IMarshalerDelegate extends js.Object {
    def getArrayClass(parentProperty: String, depth: Long): qx.Class
    def getModelClass(properties: String, obj: js.Any, parentProperty: String, depth: Long): qx.Class
    def getModelMixins(properties: String, parentProperty: String, depth: Long): js.Array[js.Any]
    def getModelSuperClass(properties: String, parentProperty: String, depth: Long): qx.Class
    def getPropertyMapping(property: String, properties: String): String
    def getValidationRule(properties: String, propertyName: String): js.Function
    def ignore(properties: String, parentProperty: String, depth: Long): Boolean

}
}
