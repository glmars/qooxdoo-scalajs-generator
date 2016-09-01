
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
@JSName("qx.event.type.Event")
class Event extends qx.core.Object {
    def getBubbles(): Boolean = js.native
    def getCurrentTarget(): HTMLElement = js.native
    def getDefaultPrevented(): Boolean = js.native
    def getEventPhase(): Int = js.native
    def getOriginalTarget(): HTMLElement = js.native
    def getPropagationStopped(): Boolean = js.native
    def getRelatedTarget(): HTMLElement = js.native
    def getTarget(): HTMLElement = js.native
    def getTimeStamp(): Int = js.native
    def getType(): String = js.native
    def init(canBubble: Boolean = ???, cancelable: Boolean = ???): qx.event.`type`.Event = js.native
    def isCancelable(): Boolean = js.native
    def preventDefault(): Unit = js.native
    def setBubbles(bubbles: Boolean): Unit = js.native
    def setCancelable(cancelable: Boolean): Unit = js.native
    def setCurrentTarget(currentTarget: HTMLElement): Unit = js.native
    def setEventPhase(eventPhase: Int): Unit = js.native
    def setOriginalTarget(originalTarget: HTMLElement): Unit = js.native
    def setRelatedTarget(relatedTarget: HTMLElement): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    def setType(`type`: String): Unit = js.native
    def stop(): Unit = js.native
    def stopPropagation(): Unit = js.native

}
}
