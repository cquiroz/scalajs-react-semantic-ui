package react.semanticui.toasts

import utest._
import japgolly.scalajs.react.test._

object SemanticToastContainerTests extends TestSuite {
  val tests = Tests {
    'render - {
      val toasts = SemanticToastContainer()
      ReactTestUtils.withNewBodyElement { mountNode =>
        toasts.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == "")
      }
    }
    'toast - {
      toast(ToastOptions("test"))
    }
  }
}
