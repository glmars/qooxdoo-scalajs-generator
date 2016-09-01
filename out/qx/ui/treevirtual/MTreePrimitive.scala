
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
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
trait MTreePrimitive extends js.Object {

}
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
object MTreePrimitive extends js.Object {
    protected def _addNode(nodeArr: js.Array[js.Any], parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, `type`: Int, icon: String, iconSelected: String, nodeId: Int = ???): Int = js.native
    protected def _getEmptyTree(): js.Dynamic = js.native

}
}
