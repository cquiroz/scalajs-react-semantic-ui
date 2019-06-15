package react.semanticui.modules.popup

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PopupContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = PopupContent(PopupContent.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="content">Abc</div></div>""")
      }
    }
  }
}
