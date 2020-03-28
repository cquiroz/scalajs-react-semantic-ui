package react.semanticui.elements.placeholder

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PlaceholderHeaderTest extends TestSuite {
  val tests = Tests {
    test("render") {
      val paragraph = PlaceholderHeader()
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header"></div>""")
      }
    }
    test("renderChild") {
      val paragraph = PlaceholderHeader(<.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header"><div>abc</div></div>""")
      }
    }
  }
}
