package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupHeaderTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val popup = PopupHeader("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        popup.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header">Abc</div>""")
      }
    }
  }
}
