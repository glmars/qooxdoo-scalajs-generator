
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
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Abstract")
class Abstract extends qx.core.Object with qx.ui.decoration.IDecorator {
    override def getInsets(): js.Dynamic = js.native
    override def getPadding(): js.Dynamic = js.native
    override def getStyles(): js.Dynamic = js.native
    protected def _getDefaultInsets(): js.Dynamic = js.native
    protected def _isInitialized(): Boolean = js.native
    protected def _resetInsets(): Unit = js.native

}
}
