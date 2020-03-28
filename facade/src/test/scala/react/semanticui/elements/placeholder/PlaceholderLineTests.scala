package react.semanticui.elements.placeholder

import utest._
import japgolly.scalajs.react.test._

object PlaceholderLineTest extends TestSuite {
  val tests = Tests {
    test("render") {
      val paragraph = PlaceholderLine()
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="line"></div>""")
      }
    }
  }
}
