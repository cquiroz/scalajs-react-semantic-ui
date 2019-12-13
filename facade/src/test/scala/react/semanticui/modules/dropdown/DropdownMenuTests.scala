package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownMenuTests extends TestSuite {
  val tests = Tests {
    'menu - {
      val menu = DropdownMenu()
      ReactTestUtils.withNewBodyElement { mountNode =>
        menu.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="menu transition"></div>"""
        )
      }
    }
    'menuContent - {
      val menu = DropdownMenu("content")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menu.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="menu transition">content</div>"""
        )
      }
    }
  }
}
