
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
trait IRadioItem extends js.Object {
    def getGroup(): qx.ui.form.RadioGroup
    def getValue(): Boolean
    def setGroup(value: qx.ui.form.RadioGroup): Unit
    def setValue(value: Boolean): Unit

}
}
