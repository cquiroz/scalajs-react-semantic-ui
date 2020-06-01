package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardDescriptionTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val cd = CardDescription("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        cd.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="description">Abc</div>""")
      }
    }
  }
}
