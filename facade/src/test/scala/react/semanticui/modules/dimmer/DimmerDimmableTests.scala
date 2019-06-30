package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DimmerDimmableTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DimmerDimmable(DimmerDimmable.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="dimmable">Abc</div></div>""")
      }
    }
  }
}
