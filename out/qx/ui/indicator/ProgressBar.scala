
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
package qx.ui.indicator {
@js.native
@JSName("qx.ui.indicator.ProgressBar")
class ProgressBar protected () extends qx.ui.container.Composite {
    def this(value: Long = ???, maximum: Long = ???) = this()
    protected def _changeProgress(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getValue(): Long = js.native
    def setMaximum(value: Long): Long = js.native
    def setValue(value: Long): Long = js.native

}
}
