package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardHeaderTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = CardHeader("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header">Abc</div>""")
      }
    }
  }
}
