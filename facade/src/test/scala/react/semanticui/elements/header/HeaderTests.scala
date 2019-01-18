package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._

object HeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Header(Header.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui header"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = Header(Header.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="ui header"></a></div>""")
      }
    }
  }
}
