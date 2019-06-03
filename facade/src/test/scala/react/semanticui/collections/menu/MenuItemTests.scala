package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.elements.icon._

object MenuItemTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = MenuItem(MenuItem.props())
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="item"></div>""")
      }
    }
    'renderAs - {
      val button = MenuItem(MenuItem.props(as = "a"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="item"></a>""")
      }
    }
    'renderAs - {
      val button = MenuItem(MenuItem.props(as = "a", icon = Icon(Icon.props(name = "comment"))))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<a class="icon item"><i aria-hidden="true" class="comment icon"></i></a>""")
      }
    }
  }
}
