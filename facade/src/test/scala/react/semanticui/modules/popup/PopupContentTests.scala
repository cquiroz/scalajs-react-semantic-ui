package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val popup = PopupContent("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        popup.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">Abc</div>""")
      }
    }
  }
}
