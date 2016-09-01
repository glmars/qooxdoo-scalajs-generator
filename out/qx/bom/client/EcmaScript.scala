
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
@JSName("qx.bom.client.EcmaScript")
class EcmaScript extends js.Object {

}
@js.native
@JSName("qx.bom.client.EcmaScript")
object EcmaScript extends js.Object {
    def getArrayEvery(): Boolean = js.native
    def getArrayFilter(): Boolean = js.native
    def getArrayForEach(): Boolean = js.native
    def getArrayIndexOf(): Boolean = js.native
    def getArrayLastIndexOf(): Boolean = js.native
    def getArrayMap(): Boolean = js.native
    def getArrayReduce(): Boolean = js.native
    def getArrayReduceRight(): Boolean = js.native
    def getArraySome(): Boolean = js.native
    def getDateNow(): Boolean = js.native
    def getErrorToString(): Boolean = js.native
    def getFunctionBind(): Boolean = js.native
    def getObjectKeys(): Boolean = js.native
    def getStackTrace(): String = js.native
    def getStringTrim(): Boolean = js.native

}
}
