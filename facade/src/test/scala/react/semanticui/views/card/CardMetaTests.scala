package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardMetaTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val cardMeta = CardMeta("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        cardMeta.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="meta">Abc</div>""")
      }
    }
    test("renderMany") {
      val cardMeta = CardMeta("Abc", <.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        cardMeta.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="meta">Abc<div>abc</div></div>""")
      }
    }
  }
}
