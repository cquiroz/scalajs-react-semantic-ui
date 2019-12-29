package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownHeaderTests extends TestSuite {
  val tests = Tests {
    'header - {
      val header = DropdownHeader()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="header"></div>"""
        )
      }
    }
    'headerContent - {
      val header = DropdownHeader("content")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="header">content</div>"""
        )
      }
    }
  }
}
