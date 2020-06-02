package react.semanticui.views.card

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CardContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val cc = CardContent("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        cc.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="content">Abc</div>""")
      }
    }
  }
}
