package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListHeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = ListHeader()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="header"></div>""")
      }
    }
    'renderAs - {
      val header = ListHeader(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="header"></a>""")
      }
    }
  }
}
