package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = MenuHeader(MenuHeader.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="header"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = MenuHeader(MenuHeader.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="header"></a></div>""")
      }
    }
  }
}
