
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
package qx.data {
@js.native
trait IListData extends js.Object {
    def contains(item: js.Any): Boolean
    def getItem(index: Long): js.Dynamic
    def getLength(): Long
    def setItem(index: Long, item: js.Any): Unit
    def splice(startIndex: Int, amount: Int, varargs: js.Any = ???): qx.data.Array
    def toArray(): js.Array[js.Any]

}
}
