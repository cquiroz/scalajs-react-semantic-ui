package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val card = Card("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        card.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui card">Abc</div>""")
      }
    }
  }
}
