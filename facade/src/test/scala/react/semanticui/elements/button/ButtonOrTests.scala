package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonOrTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = ButtonOr(ButtonOr.props(), "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="or">abc</div></div>""")
      }
    }
  }
}
