package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = Popup(Popup.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div></div>""")
      }
    }
  }
}
