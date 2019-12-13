package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object GridRowTests extends TestSuite {
  val tests = Tests {
    'render - {
      val gridRow = GridRow()
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="row"></div>""")
      }
    }
    'renderChild - {
      val gridRow = GridRow(<.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="row"><div>abc</div></div>""")
      }
    }
  }
}
