
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
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Memory")
class Memory extends js.Object {
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: js.Any): Unit = js.native
    def getItem(key: String): js.Dynamic = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): js.Dynamic = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: js.Any): Unit = js.native

}
@js.native
@JSName("qx.bom.storage.Memory")
object Memory extends js.Object {
    def getLocal(): qx.bom.storage.Memory = js.native
    def getSession(): qx.bom.storage.Memory = js.native

}
}
