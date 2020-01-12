package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemImageTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = ItemImage(src = "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="image"><img src="Abc"></div>""")
      }
    }
  }
}
