package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val buttonContent = ButtonContent("abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonContent.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">abc</div>""")
      }
    }
  }
}
