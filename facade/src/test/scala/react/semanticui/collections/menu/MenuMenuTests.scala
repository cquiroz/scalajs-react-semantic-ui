package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuMenuTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = MenuMenu(MenuMenu.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="menu"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = MenuMenu(MenuMenu.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="menu"></a></div>""")
      }
    }
  }
}
