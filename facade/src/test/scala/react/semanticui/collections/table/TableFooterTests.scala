package react.semanticui.collections.table

import japgolly.scalajs.react.test._
import utest._

object TableFooterTests extends TestSuite {
  val tests = Tests {
    test("TableFooter") {
      val row1 = TableRow(TableCell("one"))
      val row2 = TableRow(TableCell("two"))
      val body = TableFooter(row1, row2)
      ReactTestUtils.withNewBodyElement { mountNode =>
        body.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<tfoot class=""><tr class=""><td class="">one</td></tr><tr class=""><td class="">two</td></tr></tfoot>"""
        )
      }
    }
    test("fullWidth") {
      val row1 = TableRow(TableCell("one"))
      val row2 = TableRow(TableCell("two"))
      val body = TableFooter(fullWidth = true)(row1, row2)
      ReactTestUtils.withNewBodyElement { mountNode =>
        body.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<tfoot class="full-width"><tr class=""><td class="">one</td></tr><tr class=""><td class="">two</td></tr></tfoot>"""
        )
      }
    }
  }
}
