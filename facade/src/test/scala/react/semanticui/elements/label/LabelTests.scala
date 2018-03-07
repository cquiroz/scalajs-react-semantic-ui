package react.semanticui.elements.label

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
// import react.semanticui.sizes._
import react.semanticui.colors._

object LabelTests extends TestSuite {
  val tests = Tests {
    'render - {
      val label = Label(Label.props())
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"></div>""")
      }
    }
    'attached - {
      val label = Label(Label.props(attached = TopAttached))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui top attached label"></div>""")
      }
    }
    'color - {
      val label = Label(Label.props(color = Blue))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui blue label"></div>""")
      }
    }
    'corner_boolean - {
      val label = Label(Label.props(corner = Corner))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui corner label"></div>""")
      }
    }
    'corner_string - {
      val label = Label(Label.props(corner = LeftCorner))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui left corner label"></div>""")
      }
    }
    'detailVdom - {
      val labelDetail = LabelDetail(LabelDetail.props(), "Detail")
      val label = Label(Label.props(detail = labelDetail.vdomElement))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><div class="detail">Detail</div></div>""")
      }
    }
    'detailProps - {
      val labelDetail = LabelDetail.props(className = "test", content = <.div("Detail"): VdomElement)
      val label = Label(Label.props(detail = labelDetail))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        println(m.outerHtmlScrubbed)
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><div class="detail test"><div>Detail</div></div></div>""")
      }
    }
    'attached2 - {
      val label = Label(Label.props(attached = TopAttached))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        println(m.outerHtmlScrubbed)
        assert(m.outerHtmlScrubbed() == """<div class="ui top attached label"></div>""")
      }
    }
  }
}
