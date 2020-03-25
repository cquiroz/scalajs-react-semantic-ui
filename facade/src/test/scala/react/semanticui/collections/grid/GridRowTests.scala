package react.semanticui.collections.grid

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.widths._

object GridRowTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val gridRow = GridRow()
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="row"></div>""")
      }
    }
    test("renderChild") {
      val gridRow = GridRow(<.div("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="row"><div>abc</div></div>""")
      }
    }
    test("columns") {
      val gridRow = GridRow(columns = Three)
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="three column row"></div>""")
      }
    }
    test("columns equal") {
      val gridRow = GridRow(columns = GridColumns.Equal)
      ReactTestUtils.withNewBodyElement { mountNode =>
        gridRow.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="equal width row"></div>""")
      }
    }
  }
}
