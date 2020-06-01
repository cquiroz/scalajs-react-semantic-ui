package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardExtraTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val ce = CardExtra("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        ce.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="extra content">Abc</div>""")
      }
    }
  }
}
