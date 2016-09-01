
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
@JSName("qx.bom.Shortcut")
class Shortcut protected () extends qx.core.Object {
    def this(shortcut: String = ???) = this()
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: js.Any): Unit = js.native
    def getAutoRepeat(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getShortcut(): String = js.native
    protected def initAutoRepeat(value: Boolean): Boolean = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initShortcut(value: String): String = js.native
    def isAutoRepeat(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetAutoRepeat(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def setAutoRepeat(value: Boolean): Boolean = js.native
    def setEnabled(value: Boolean): Boolean = js.native
    def setShortcut(value: String): String = js.native
    def toggleAutoRepeat(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
