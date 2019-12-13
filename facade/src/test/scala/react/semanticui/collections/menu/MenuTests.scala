package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menu = Menu()
      ReactTestUtils.withRenderedIntoDocument(menu) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui menu"></div>""")
      }
    }
    'renderAs - {
      val menu = Menu(as = "a")
      ReactTestUtils.withRenderedIntoDocument(menu) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui menu"></a>""")
      }
    }
  }
}
