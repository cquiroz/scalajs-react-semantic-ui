package react.semanticui.elements.divider

import utest._
import japgolly.scalajs.react.test._

object DividerTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Divider(Divider.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui divider"></div></div>""")
      }
    }
    'renderAs - {
      val menuItem = Divider(Divider.props(as = "a"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="ui divider"></a></div>""")
      }
    }
  }
}
