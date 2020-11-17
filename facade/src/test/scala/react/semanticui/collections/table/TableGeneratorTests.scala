package react.semanticui.collections.table

import japgolly.scalajs.react.test._
import utest._

object TableGeneratorTests extends TestSuite {
  val tests = Tests {
    test("TableGenerator") {
      def makeRow(a: String, i: Int) = TableRow(TableCell(i.toString), TableCell(a))
      val headerRows = Seq(TableRow(TableHeaderCell("Generated")))
      val table      =
        TableGenerator[String](tableData = Seq("a", "b"),
                               renderBodyRow = makeRow _,
                               headerRows = headerRows
        )
      ReactTestUtils.withNewBodyElement { mountNode =>
        table.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<table class="ui table"><thead class=""><tr class=""><th class="">Generated</th></tr></thead><tbody class=""><tr class=""><td class="">0</td><td class="">a</td></tr><tr class=""><td class="">1</td><td class="">b</td></tr></tbody></table>"""
        )
      }
    }
  }
}
