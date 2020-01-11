package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._

object DimmerTests extends TestSuite {
  val tests = Tests {
    test("dimmer") {
      val dimmer = Dimmer()
      ReactTestUtils.withNewBodyElement { mountNode =>
        dimmer.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui dimmer"></div>"""
        )
      }
    }
  }
}
