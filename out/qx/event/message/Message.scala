
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
package qx.event.message {
@js.native
@JSName("qx.event.message.Message")
class Message protected () extends qx.core.Object {
    def this(name: String = ???, data: js.Any = ???) = this()
    def getData(): js.Dynamic = js.native
    def getName(): String = js.native
    def getSender(): js.Dynamic = js.native
    protected def initData(value: js.Any): js.Dynamic = js.native
    protected def initName(value: String): String = js.native
    protected def initSender(value: js.Any): js.Dynamic = js.native
    def resetData(): Unit = js.native
    def resetName(): Unit = js.native
    def resetSender(): Unit = js.native
    def setData(value: js.Any): js.Dynamic = js.native
    def setName(value: String): String = js.native
    def setSender(value: js.Any): js.Dynamic = js.native

}
}
