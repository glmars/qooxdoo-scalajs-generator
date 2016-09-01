
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
package qx.event.util {
@js.native
@JSName("qx.event.util.Keyboard")
class Keyboard extends js.Object {

}
@js.native
@JSName("qx.event.util.Keyboard")
object Keyboard extends js.Object {
    def charCodeToIdentifier(charCode: String): String = js.native
    def isIdentifiableKeyCode(keyCode: String): Boolean = js.native
    def isNonPrintableKeyCode(keyCode: String): Boolean = js.native
    def isPrintableKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def isValidKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def keyCodeToIdentifier(keyCode: Int): String = js.native

}
}
