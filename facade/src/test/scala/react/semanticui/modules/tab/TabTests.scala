package react.semanticui.modules.tab

import utest._
import japgolly.scalajs.react.test._

object TabTest extends TestSuite {
  val tests = Tests {
    test("basic") {
      val tab = Tab()
      ReactTestUtils.withNewBodyElement { mountNode =>
        tab.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div><div class="ui attached tabular menu"></div></div>"""
        )
      }
    }
  }
}
