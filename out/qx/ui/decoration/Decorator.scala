
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
@JSName("qx.ui.decoration.Decorator")
class Decorator extends qx.ui.decoration.Abstract with qx.ui.decoration.IDecorator with qx.ui.decoration.MBackgroundColor with qx.ui.decoration.MBorderRadius with qx.ui.decoration.MBoxShadow with qx.ui.decoration.MDoubleBorder with qx.ui.decoration.MLinearBackgroundGradient with qx.ui.decoration.MBorderImage {
    override def getInsets(): js.Dynamic = js.native
    override def getPadding(): js.Dynamic = js.native
    override def getStyles(): js.Dynamic = js.native
    protected def _getStyles(): js.Dynamic = js.native

}
}
