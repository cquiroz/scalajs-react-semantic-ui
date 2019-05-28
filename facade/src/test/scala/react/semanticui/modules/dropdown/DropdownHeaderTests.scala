package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownHeaderTests extends TestSuite {
  val tests = Tests {
    'header - {
      val header = DropdownHeader(DropdownHeader.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="header"></div></div>"""
        )
      }
    }
    'headerContent - {
      val header = DropdownHeader(DropdownHeader.props(), "content")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="header">content</div></div>"""
        )
      }
    }
  }
}
