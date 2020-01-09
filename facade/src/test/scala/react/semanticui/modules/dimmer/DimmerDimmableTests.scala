package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DimmerDimmableTests extends TestSuite {
  val tests = Tests {
    test("dimmer") {
      val dimmer = DimmerDimmable("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        dimmer.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="dimmable">Abc</div>""")
      }
    }
  }
}
