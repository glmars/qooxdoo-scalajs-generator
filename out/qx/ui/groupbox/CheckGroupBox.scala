
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
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.CheckGroupBox")
class CheckGroupBox extends qx.ui.groupbox.GroupBox with qx.ui.form.IExecutable with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): qx.ui.command.Command = js.native
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRadioChangeValue(e: qx.event.`type`.Data): Unit = js.native

}
}
