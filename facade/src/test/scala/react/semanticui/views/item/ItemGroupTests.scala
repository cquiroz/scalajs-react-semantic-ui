package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemGroupTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val itemGroup = ItemGroup("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        itemGroup.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui items">Abc</div>""")
      }
    }
  }
}
