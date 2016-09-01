
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
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Conditional")
class Conditional protected () extends qx.ui.table.cellrenderer.Default {
    def this(align: String = ???, color: String = ???, style: String = ???, weight: String = ???) = this()
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
