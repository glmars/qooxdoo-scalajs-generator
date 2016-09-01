
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
package qx.event.`type` {
@js.native
@JSName("qx.event.type.Touch")
class Touch extends qx.event.`type`.Dom {
    protected def _isTouchEnd(): Boolean = js.native
    def getAllTouches(): js.Array[js.Dynamic] = js.native
    def getChangedTargetTouches(): js.Array[js.Dynamic] = js.native
    def getDelta(): js.Array[js.Any] = js.native
    def getDocumentLeft(touchIndex: Int = ???): Int = js.native
    def getDocumentTop(touchIndex: Int = ???): Int = js.native
    def getIdentifier(touchIndex: Int = ???): Int = js.native
    def getRotation(): Float = js.native
    def getScale(): Float = js.native
    def getScreenLeft(touchIndex: Int = ???): Int = js.native
    def getScreenTop(touchIndex: Int = ???): Int = js.native
    def getTargetTouches(): js.Array[js.Dynamic] = js.native
    def getViewportLeft(touchIndex: Int = ???): Int = js.native
    def getViewportTop(touchIndex: Int = ???): Int = js.native
    def isMultiTouch(): Boolean = js.native

}
}
