
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
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Console")
class Console extends js.Object {

}
@js.native
@JSName("qx.log.appender.Console")
object Console extends js.Object {
    def clear(): Unit = js.native
    def dispose(): Unit = js.native
    def execute(): Unit = js.native
    def init(): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def show(): Unit = js.native
    def toggle(): Unit = js.native

}
}
