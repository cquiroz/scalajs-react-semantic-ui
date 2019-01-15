package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuMenuTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Menu.Menu(Menu.Menu.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="menu"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = Menu.Menu(Menu.Menu.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="menu"></a></div>""")
      }
    }
  }
}
