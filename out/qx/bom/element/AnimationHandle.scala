
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
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationHandle")
class AnimationHandle extends qx.event.Emitter {
    def isEnded(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def isPlaying(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def stop(): Unit = js.native

}
}
