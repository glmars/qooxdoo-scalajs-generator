
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
package qx.html {
@js.native
@JSName("qx.html.Image")
class Image extends qx.html.Element {
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    def resetSource(): qx.html.Image = js.native
    def setPadding(paddingLeft: Int, paddingTop: Int): Unit = js.native
    def setScale(value: Boolean): qx.html.Label = js.native
    def setSource(value: Boolean): qx.html.Label = js.native

}
}
