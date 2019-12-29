package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._

object HeaderContentTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = HeaderContent()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content"></div>""")
      }
    }
    'renderAs - {
      val header = HeaderContent(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="content"></a>""")
      }
    }
  }
}
