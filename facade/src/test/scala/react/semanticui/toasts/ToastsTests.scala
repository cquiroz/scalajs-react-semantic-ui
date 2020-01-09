package react.semanticui.toasts

import utest._
import japgolly.scalajs.react.test._

object SemanticToastContainerTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val toasts = SemanticToastContainer()
      ReactTestUtils.withNewBodyElement { mountNode =>
        toasts.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == "")
      }
    }
    test("toast") {
      toast(ToastOptions("test"))
    }
  }
}
