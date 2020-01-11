package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._

object ButtonOrTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val buttonOr = ButtonOr()
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonOr.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="or"></div>""")
      }
    }
  }
}
