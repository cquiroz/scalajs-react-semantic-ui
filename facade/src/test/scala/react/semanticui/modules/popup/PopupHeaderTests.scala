package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = PopupHeader(PopupHeader.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="header">Abc</div></div>""")
      }
    }
  }
}
