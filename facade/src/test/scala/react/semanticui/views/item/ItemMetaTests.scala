package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemMetaTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val itemMeta = ItemMeta("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        itemMeta.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="meta">Abc</div>""")
      }
    }
    test("renderMany") {
      val itemMeta = ItemMeta("Abc", <.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        itemMeta.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="meta">Abc<div>abc</div></div>""")
      }
    }
  }
}
