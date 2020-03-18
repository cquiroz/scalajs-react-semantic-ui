package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListIconTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val header = ListIcon()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<i aria-hidden="true" class="icon"></i>""")
      }
    }
    test("renderIcon") {
      val header = ListIcon("home")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<i aria-hidden="true" class="home icon"></i>""")
      }
    }
  }
}
