package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = ButtonContent(ButtonContent.props(), "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="content">abc</div></div>""")
      }
    }
  }
}
