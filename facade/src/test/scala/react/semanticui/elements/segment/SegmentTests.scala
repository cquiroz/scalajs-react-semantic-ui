package react.semanticui.elements.segment

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object SegmentTests extends TestSuite {
  val tests = Tests {
    'segment - {
      val segment = Segment(Segment.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        segment.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui segment">Abc</div></div>""")
      }
    }
  }
}
