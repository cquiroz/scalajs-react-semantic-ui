package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListIconTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = ListIcon()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<i aria-hidden="true" class="icon"></i>""")
      }
    }
    'renderAs - {
      val header = ListIcon("home")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<i aria-hidden="true" class="home icon"></i>""")
      }
    }
  }
}
