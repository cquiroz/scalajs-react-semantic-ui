package react.semanticui.elements.flag

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object FlagTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val menuItem = Flag(name = "cl")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<i class="cl flag"></i>""")
      }
    }
    test("renderAs") {
      val menuItem = Flag(as = <.a, name = "cl")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="cl flag"></a>""")
      }
    }
  }
}
