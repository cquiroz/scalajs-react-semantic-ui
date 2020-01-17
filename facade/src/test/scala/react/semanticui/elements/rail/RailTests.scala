package react.semanticui.elements.rail

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui._

object RailTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val rail = Rail(position = floats.Left)("abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        rail.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui left rail">abc</div>""")
      }
    }
  }
}
