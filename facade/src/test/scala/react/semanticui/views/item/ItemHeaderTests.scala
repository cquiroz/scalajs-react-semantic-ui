package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = ItemHeader(ItemHeader.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="header">Abc</div></div>""")
      }
    }
  }
}
