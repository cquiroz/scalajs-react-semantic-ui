package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._

object MenuMenuTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menumenu = MenuMenu()
      ReactTestUtils.withNewBodyElement { mountNode =>
        menumenu.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="menu"></div>""")
      }
    }
    'renderAs - {
      val menumenu = MenuMenu(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menumenu.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="menu"></a>""")
      }
    }
  }
}
