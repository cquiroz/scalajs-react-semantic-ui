package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._

object GridTests extends TestSuite {
  val tests = Tests {
    'render - {
      val grid = Grid()
      ReactTestUtils.withNewBodyElement { mountNode =>
        grid.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui grid"></div>""")
      }
    }
  }
}
