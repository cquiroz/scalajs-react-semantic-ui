package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DimmerInnerTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DimmerInner(DimmerInner.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="ui dimmer"><div class="content">Abc</div></div></div>"""
        )
      }
    }
  }
}
