package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListListTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = ListList()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="list"></div>""")
      }
    }
    test("renderAs") {
      val header = ListList(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="list"></a>""")
      }
    }
  }
}
