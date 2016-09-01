
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
package qx.lang {
@js.native
@JSName("qx.lang.Type")
class Type extends js.Object {

}
@js.native
@JSName("qx.lang.Type")
object Type extends js.Object {
    def getClass(value: js.Any): String = js.native
    def isArray(value: js.Any): Boolean = js.native
    def isBoolean(value: js.Any): Boolean = js.native
    def isDate(value: js.Any): Boolean = js.native
    def isError(value: js.Any): Boolean = js.native
    def isFunction(value: js.Any): Boolean = js.native
    def isNumber(value: js.Any): Boolean = js.native
    def isObject(value: js.Any): Boolean = js.native
    def isRegExp(value: js.Any): Boolean = js.native
    def isString(value: js.Any): Boolean = js.native

}
}
