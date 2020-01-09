package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val item = Item("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="item">Abc</div>""")
      }
    }
  }
}
