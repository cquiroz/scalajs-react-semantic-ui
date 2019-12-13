package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemExtraTests extends TestSuite {
  val tests = Tests {
    'render - {
      val ie = ItemExtra("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        ie.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="extra">Abc</div>""")
      }
    }
  }
}
