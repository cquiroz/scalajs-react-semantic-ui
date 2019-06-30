package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

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
    'subheader - {
      val menuItem =
        Header(Header.props(subheader = HeaderSubheader.props(content = "abc": VdomNode)))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="ui header"><div class="sub header">abc</div></div></div>"""
        )
      }
    }
  }
}
