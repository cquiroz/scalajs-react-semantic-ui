package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemDescriptionTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val id = ItemDescription("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        id.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="description">Abc</div>""")
      }
    }
  }
}
