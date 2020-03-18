package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object HeaderContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = HeaderContent()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content"></div>""")
      }
    }
    test("renderAs") {
      val header = HeaderContent(as = <.a)
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="content"></a>""")
      }
    }
  }
}
