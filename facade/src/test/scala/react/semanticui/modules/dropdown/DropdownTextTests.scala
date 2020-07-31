package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownTextTests extends TestSuite {
  val tests = Tests {
    test("text") {
      val header = DropdownText()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div aria-atomic="true" aria-live="polite" role="alert" class="divider"></div>"""
        )
      }
    }
    test("textContent") {
      val header = DropdownText("content")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div aria-atomic="true" aria-live="polite" role="alert" class="divider">content</div>"""
        )
      }
    }
  }
}
