package react.semanticui.modules.modal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ModalContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val modal = ModalContent("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        modal.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">Abc</div>""")
      }
    }
  }
}
