package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._

object GridRowTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = GridRow(GridRow.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="row"></div></div>""")
      }
    }
  }
}
