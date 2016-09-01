
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
@JSName("qx.util.StringBuilder")
class StringBuilder protected () extends qx.`type`.BaseArray {
    def this(length_or_items: Int = ???) = this()
    def add(varargs: String = ???): Unit = js.native
    def clear(): Unit = js.native
    def get(): String = js.native
    def isEmpty(): Boolean = js.native
    def size(): Int = js.native

}
}
