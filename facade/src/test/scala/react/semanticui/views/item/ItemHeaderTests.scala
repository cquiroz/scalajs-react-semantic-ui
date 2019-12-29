package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = ItemHeader("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header">Abc</div>""")
      }
    }
  }
}
