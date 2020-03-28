package react.semanticui.elements.placeholder

import utest._
import japgolly.scalajs.react.test._

object PlaceholderImageTest extends TestSuite {
  val tests = Tests {
    test("render") {
      val paragraph = PlaceholderImage()
      ReactTestUtils.withNewBodyElement { mountNode =>
        paragraph.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="image"></div>""")
      }
    }
  }
}
