package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._

object ListDescriptionTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = ListDescription()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="description"></div>""")
      }
    }
    'renderAs - {
      val header = ListDescription(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="description"></a>""")
      }
    }
  }
}
