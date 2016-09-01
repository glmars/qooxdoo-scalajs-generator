
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
@JSName("qx.bom.client.CssTransform")
class CssTransform extends js.Object {

}
@js.native
@JSName("qx.bom.client.CssTransform")
object CssTransform extends js.Object {
    def get3D(): Boolean = js.native
    def getBackFaceVisibility(): String = js.native
    def getName(): String = js.native
    def getOrigin(): String = js.native
    def getPerspective(): String = js.native
    def getPerspectiveOrigin(): String = js.native
    def getStyle(): String = js.native
    def getSupport(): js.Dynamic = js.native

}
}
