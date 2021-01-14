package react.semanticui.elements.segment

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object SegmentInlineTests extends TestSuite {
  val tests = Tests {
    test("segment-inline") {
      val segment = Segment(placeholder = true)("Abc", SegmentInline("Def"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        segment.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(
          html == """<div class="ui placeholder segment">Abc<div class="inline">Def</div></div>"""
        )
      }
    }
    test("segment-inline with content") {
      val segment = Segment(placeholder = true)("Abc", SegmentInline(<.div("def")))
      ReactTestUtils.withNewBodyElement { mountNode =>
        segment.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(
          html == """<div class="ui placeholder segment">Abc<div class="inline"><div>def</div></div></div>"""
        )
      }
    }
  }
}
