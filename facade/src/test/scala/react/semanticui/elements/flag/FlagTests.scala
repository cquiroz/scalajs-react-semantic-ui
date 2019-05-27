package react.semanticui.elements.flag

import utest._
import japgolly.scalajs.react.test._

object FlagTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Flag(Flag.props(name = "cl"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><i class="cl flag"></i></div>""")
      }
    }
    'renderAs - {
      val menuItem = Flag(Flag.props(as = "a", name = "cl"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="cl flag"></a></div>""")
      }
    }
  }
}
