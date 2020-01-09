package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DimmerTests extends TestSuite {
  val tests = Tests {
    test("dimmer") {
      val dimmer = Dimmer("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        dimmer.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui dimmer"><div class="content">Abc</div></div>"""
        )
      }
    }
  }
}
