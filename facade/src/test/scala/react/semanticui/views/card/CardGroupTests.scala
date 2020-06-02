package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardGroupTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val cardGroup = CardGroup("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        cardGroup.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui cards">Abc</div>""")
      }
    }
  }
}
