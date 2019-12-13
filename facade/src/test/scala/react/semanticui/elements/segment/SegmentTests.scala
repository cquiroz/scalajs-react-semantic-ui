package react.semanticui.elements.segment

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object SegmentTests extends TestSuite {
  val tests = Tests {
    'segment - {
      val segment = Segment("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        segment.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui segment">Abc</div>""")
      }
    }
  }
}
