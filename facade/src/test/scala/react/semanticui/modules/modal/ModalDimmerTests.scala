package react.semanticui.modules.modal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ModalDimmerTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val modal = ModalDimmer("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        modal.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui top aligned page modals dimmer transition visible active">Abc</div>"""
        )
      }
    }
  }
}
