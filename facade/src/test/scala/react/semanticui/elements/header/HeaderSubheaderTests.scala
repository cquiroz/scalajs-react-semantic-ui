package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object HeaderSubheaderTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = HeaderSubheader()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="sub header"></div>""")
      }
    }
    test("renderAs") {
      val header = HeaderSubheader(as = <.a)
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="sub header"></a>""")
      }
    }
  }
}
