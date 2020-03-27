package react.semanticui.elements.placeholder

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PlaceholderParagraphTest extends TestSuite {
  val tests = Tests {
    test("render") {
      val paragraph = PlaceholderParagraph()
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="paragraph"></div>""")
      }
    }
    test("renderChild") {
      val paragraph = PlaceholderParagraph(<.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="paragraph"><div>abc</div></div>""")
      }
    }
  }
}
