package react.semanticui.modules.modal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ModalDescriptionTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val modal = ModalDescription("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        modal.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="description">Abc</div>""")
      }
    }
  }
}
