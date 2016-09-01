
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
package qx.ui.form {
@js.native
trait IRange extends js.Object {
    def getMaximum(): Long
    def getMinimum(): Long
    def getPageStep(): Long
    def getSingleStep(): Long
    def setMaximum(max: Long): Unit
    def setMinimum(min: Long): Unit
    def setPageStep(step: Long): Unit
    def setSingleStep(step: Long): Unit

}
}
