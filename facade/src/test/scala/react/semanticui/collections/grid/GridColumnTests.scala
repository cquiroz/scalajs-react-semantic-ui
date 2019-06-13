package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._

object GridColumnTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = GridColumn(GridColumn.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="column"></div></div>""")
      }
    }
  }
}
