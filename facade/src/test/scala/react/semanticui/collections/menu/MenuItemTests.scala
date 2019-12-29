package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.elements.icon._

object MenuItemTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = MenuItem()
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="item"></div>""")
      }
    }
    'renderAs - {
      val button = MenuItem(as = "a")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="item"></a>""")
      }
    }
    'renderAs - {
      val button = MenuItem(as = "a", icon = Icon(name = "comment"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<a class="icon item"><i aria-hidden="true" class="comment icon"></i></a>"""
        )
      }
    }
  }
}
