
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
@JSName("qx.log.appender.Element")
class Element protected () extends qx.core.Object {
    def this(element: HTMLElement = ???) = this()
    def clear(): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native

}
}
