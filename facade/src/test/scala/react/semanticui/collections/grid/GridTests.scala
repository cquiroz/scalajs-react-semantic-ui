package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._

object GridTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Grid(Grid.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui grid"></div></div>""")
      }
    }
  }
}
