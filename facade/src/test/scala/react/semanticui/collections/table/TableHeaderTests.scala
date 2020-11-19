package react.semanticui.collections.table

import japgolly.scalajs.react.test._
import utest._

object TableHeaderTests extends TestSuite {
  val tests = Tests {
    test("TableHeader") {
      val row1 = TableRow(TableHeaderCell("one"))
      val row2 = TableRow(TableHeaderCell("two"))
      val body = TableHeader(row1, row2)
      ReactTestUtils.withNewBodyElement { mountNode =>
        body.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<thead class=""><tr class=""><th class="">one</th></tr><tr class=""><th class="">two</th></tr></thead>"""
        )
      }
    }
    test("fullWidth") {
      val row1 = TableRow(TableHeaderCell("one"))
      val row2 = TableRow(TableHeaderCell("two"))
      val body = TableHeader(fullWidth = true)(row1, row2)
      ReactTestUtils.withNewBodyElement { mountNode =>
        body.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<thead class="full-width"><tr class=""><th class="">one</th></tr><tr class=""><th class="">two</th></tr></thead>"""
        )
      }
    }
  }
}
