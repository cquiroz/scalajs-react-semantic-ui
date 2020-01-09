package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonOrTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val buttonOr = ButtonOr()("abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonOr.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="or">abc</div>""")
      }
    }
  }
}
