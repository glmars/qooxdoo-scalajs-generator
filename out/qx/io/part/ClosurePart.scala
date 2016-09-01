
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
package qx.io.part {
@js.native
@JSName("qx.io.part.ClosurePart")
class ClosurePart protected () extends qx.io.part.Part {
    def this(name: String = ???, packages: js.Array[js.Any] = ???, loader: qx.Part = ???) = this()
    protected def _onPackageLoad(pkg: qx.io.part.Package): Unit = js.native

}
}
