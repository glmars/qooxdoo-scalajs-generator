
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
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.CheckBox")
class CheckBox protected () extends qx.ui.menu.AbstractButton with qx.ui.form.IBooleanForm {
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    def this(label: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def initValue(value: Boolean): Boolean = js.native
    def isValue(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
