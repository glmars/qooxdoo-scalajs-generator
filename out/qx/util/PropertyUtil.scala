
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
package qx.util {
@js.native
@JSName("qx.util.PropertyUtil")
class PropertyUtil extends js.Object {

}
@js.native
@JSName("qx.util.PropertyUtil")
object PropertyUtil extends js.Object {
    def deleteInitValue(obj: js.Any, propertyName: String): Unit = js.native
    def deleteThemeValue(obj: js.Any, propertyName: String): Unit = js.native
    def deleteUserValue(obj: js.Any, propertyName: String): Unit = js.native
    def getAllProperties(clazz: qx.Class): js.Dynamic = js.native
    def getInitValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def getProperties(clazz: qx.Class): js.Dynamic = js.native
    def getThemeValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def getUserValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def resetThemed(obj: js.Any, propertyName: String): Unit = js.native
    def setInitValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setThemed(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setThemeValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setUserValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native

}
}
