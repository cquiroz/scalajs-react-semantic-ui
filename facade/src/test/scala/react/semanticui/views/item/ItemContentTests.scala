package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val ic = ItemContent("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        ic.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">Abc</div>""")
      }
    }
  }
}
