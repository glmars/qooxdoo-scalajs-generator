
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
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MExecutable")
trait MExecutable extends js.Object {
    protected def _applyCommand(value: qx.ui.command.Command, old: qx.ui.command.Command): Unit = js.native
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    protected def initCommand(value: qx.ui.command.Command): qx.ui.command.Command = js.native
    def resetCommand(): Unit = js.native
    def setCommand(value: qx.ui.command.Command): qx.ui.command.Command = js.native

}
}
