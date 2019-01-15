package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuItemTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Menu.Item(Menu.Item.props())
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="item"></div>""")
      }
    }
    'renderAs - {
      val button = Menu.Item(Menu.Item.props(as = "a"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="item"></a>""")
      }
    }
  }
}
