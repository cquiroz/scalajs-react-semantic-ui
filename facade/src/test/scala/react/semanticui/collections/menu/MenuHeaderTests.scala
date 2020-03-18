package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object MenuHeaderTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val menuHeader = MenuHeader()
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuHeader.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header"></div>""")
      }
    }
    test("renderAsTag") {
      val menuHeader = MenuHeader(as = <.a)
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuHeader.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="header"></a>""")
      }
    }
  }
}
