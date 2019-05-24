package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownMenuTests extends TestSuite {
  val tests = Tests {
    'menu - {
      val menu = DropdownMenu(DropdownMenu.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menu.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="menu transition"></div></div>"""
        )
      }
    }
    'menuContent - {
      val menu = DropdownMenu(DropdownMenu.props(), "content")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menu.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="menu transition">content</div></div>"""
        )
      }
    }
  }
}
