package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ListDescriptionTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = ListDescription()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="description"></div>""")
      }
    }
    test("renderAs") {
      val header = ListDescription(as = <.a)
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="description"></a>""")
      }
    }
  }
}
