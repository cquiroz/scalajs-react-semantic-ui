package react.semanticui.modules.dimmer

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DimmerInnerTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val dimmerInner = DimmerInner("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        dimmerInner.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui dimmer"><div class="content">Abc</div></div>"""
        )
      }
    }
  }
}
