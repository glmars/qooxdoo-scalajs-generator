
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
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Array")
class Array extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Array")
object Array extends js.Object {
    def every(callback: js.Function, obj: js.Any = ???): js.Array[js.Any] = js.native
    def filter(callback: js.Function, obj: js.Any = ???): js.Array[js.Any] = js.native
    def forEach(callback: js.Function, obj: js.Any = ???): Unit = js.native
    def indexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def lastIndexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def map(callback: js.Function, obj: js.Any = ???): js.Array[js.Any] = js.native
    def reduce(callback: js.Function, init: js.Any = ???): js.Dynamic = js.native
    def reduceRight(callback: js.Function, init: js.Any = ???): js.Dynamic = js.native
    def some(callback: js.Function, obj: js.Any = ???): js.Array[js.Any] = js.native

}
}
