
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
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.ui.tree.core.Util")
object Util extends js.Object {
    def hasChildren(node: qx.core.Object, childProperty: String, ignoreLeafs: Boolean = ???): Boolean = js.native
    def isNode(node: qx.core.Object, childProperty: String): Boolean = js.native

}
}
