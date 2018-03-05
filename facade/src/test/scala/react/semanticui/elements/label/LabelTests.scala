package react.semanticui.elements.label

import utest._
import japgolly.scalajs.react.test._
// import react.semanticui.sizes._
// import react.semanticui.colors._

object LabelTests extends TestSuite {
  val tests = Tests {
    'renderDetail - {
      val label = LabelDetail(LabelDetail.props())
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        println(m.outerHtmlScrubbed)
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit icon"></i>""")
      }
    }
  }
}
