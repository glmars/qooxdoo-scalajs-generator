
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
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Video")
class Video protected () extends qx.bom.media.Abstract {
    def this(source: String = ???) = this()
    def getHeight(): Long = js.native
    def getPoster(): String = js.native
    def getVideoHeight(): Long = js.native
    def getVideoWidth(): Long = js.native
    def getWidth(): Long = js.native
    def setHeight(value: Long): Unit = js.native
    def setPoster(value: String): Unit = js.native
    def setWidth(value: Long): Unit = js.native

}
}
