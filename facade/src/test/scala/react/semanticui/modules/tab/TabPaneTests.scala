package react.semanticui.modules.tab

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object TabPaneTest extends TestSuite {
  val tests = Tests {
    test("basic") {
      val basic = TabPane("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        basic.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui bottom attached segment active tab">Abc</div>"""
        )
      }
    }
    test("active") {
      val basic = TabPane(active = true)("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        basic.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui bottom attached segment active tab">Abc</div>"""
        )
      }
    }
  }
}
