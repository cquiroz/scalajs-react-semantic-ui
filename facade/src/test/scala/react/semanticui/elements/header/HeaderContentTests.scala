package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._

object HeaderContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = HeaderContent(HeaderContent.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="content"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = HeaderContent(HeaderContent.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="content"></a></div>""")
      }
    }
  }
}
