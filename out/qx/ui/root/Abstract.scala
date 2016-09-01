
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
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Abstract")
class Abstract extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling with qx.ui.core.MBlocker with qx.ui.window.MDesktop {
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.`type`.Mouse): Unit = js.native
    def getGlobalCursor(): String = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def getNativeHelp(): Boolean = js.native
    protected def initGlobalCursor(value: String): String = js.native
    protected def initNativeHelp(value: Boolean): Boolean = js.native
    def isNativeHelp(): Boolean = js.native
    def resetGlobalCursor(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def setGlobalCursor(value: String): String = js.native
    def setNativeHelp(value: Boolean): Boolean = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
