package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Menu(Menu.props())
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui menu"></div>""")
      }
    }
    'renderAs - {
      val button = Menu(Menu.props(as = "a"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui menu"></a>""")
      }
    }
  }
}
