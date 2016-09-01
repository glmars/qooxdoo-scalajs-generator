
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
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Canvas")
class Canvas protected () extends qx.ui.core.Widget {
    def this(canvasWidth: Int = ???, canvasHeight: Int = ???) = this()
    protected def _applyCanvasHeight(value: Int, old: Int): Unit = js.native
    protected def _applyCanvasWidth(value: Int, old: Int): Unit = js.native
    protected def _draw(width: Int, height: Int, context: CanvasRenderingContext2D): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    def getCanvasHeight(): Int = js.native
    def getCanvasWidth(): Int = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getSyncDimension(): Boolean = js.native
    protected def initCanvasHeight(value: Int): Int = js.native
    protected def initCanvasWidth(value: Int): Int = js.native
    protected def initSyncDimension(value: Boolean): Boolean = js.native
    def isSyncDimension(): Boolean = js.native
    def resetCanvasHeight(): Unit = js.native
    def resetCanvasWidth(): Unit = js.native
    def resetSyncDimension(): Unit = js.native
    def setCanvasHeight(value: Int): Int = js.native
    def setCanvasWidth(value: Int): Int = js.native
    def setSyncDimension(value: Boolean): Boolean = js.native
    def toggleSyncDimension(): Boolean = js.native
    def update(): Unit = js.native

}
}
