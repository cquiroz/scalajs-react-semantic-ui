package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._

object GridColumnTests extends TestSuite {
  val tests = Tests {
    'render - {
      val gridColumn = GridColumn()
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridColumn.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="column"></div>""")
      }
    }
  }
}
