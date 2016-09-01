
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
package qx.data.controller {
@js.native
trait ISelection extends js.Object {
    def getSelection(): qx.data.Array
    def resetSelection(): Unit
    def setSelection(value: qx.data.Array): qx.data.Array

}
}
