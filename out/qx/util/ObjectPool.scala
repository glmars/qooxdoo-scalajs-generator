
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
package qx.util {
@js.native
@JSName("qx.util.ObjectPool")
class ObjectPool protected () extends qx.core.Object {
    def this(size: Int = ???) = this()
    def getObject(clazz: qx.Class): js.Dynamic = js.native
    def getSize(): Int = js.native
    protected def initSize(value: Int): Int = js.native
    def poolObject(obj: js.Any): Unit = js.native
    def resetSize(): Unit = js.native
    def setSize(value: Int): Int = js.native

}
}
