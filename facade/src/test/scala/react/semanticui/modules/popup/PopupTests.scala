package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupTests extends TestSuite {
  val tests = Tests {
    'render - {
      val popup = Popup("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        popup.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div></div>""")
      }
    }
  }
}
