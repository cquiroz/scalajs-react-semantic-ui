package react.semanticui.modules.modal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ModalHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = ModalHeader(ModalHeader.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="header">Abc</div></div>""")
      }
    }
  }
}
