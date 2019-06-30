package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._

object HeaderSubheaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = HeaderSubheader(HeaderSubheader.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="sub header"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = HeaderSubheader(HeaderSubheader.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="sub header"></a></div>""")
      }
    }
  }
}
