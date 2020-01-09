package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListContentTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = ListContent()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content"></div>""")
      }
    }
    test("renderAs") {
      val header = ListContent(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="content"></a>""")
      }
    }
  }
}
