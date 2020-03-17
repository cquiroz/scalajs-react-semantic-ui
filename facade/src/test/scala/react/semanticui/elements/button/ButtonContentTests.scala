package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val buttonContent = ButtonContent("abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonContent.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">abc</div>""")
      }
    }
    test("contentString") {
      val buttonContent = ButtonContent(content = "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonContent.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">abc</div>""")
      }
    }
    test("contentNode") {
      val buttonContent = ButtonContent(content = <.span("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonContent.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content"><span>abc</span></div>""")
      }
    }
  }
}
