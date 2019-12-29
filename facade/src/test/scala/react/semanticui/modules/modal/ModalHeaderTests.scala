package react.semanticui.modules.modal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ModalHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = ModalHeader("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header">Abc</div>""")
      }
    }
  }
}
