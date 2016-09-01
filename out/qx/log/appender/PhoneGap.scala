
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
@JSName("qx.log.appender.PhoneGap")
class PhoneGap extends js.Object {

}
@js.native
@JSName("qx.log.appender.PhoneGap")
object PhoneGap extends js.Object {
    def process(entry: js.Any): Unit = js.native

}
}
