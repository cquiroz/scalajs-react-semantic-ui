package react.semanticui.modules.tab

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object TabPaneTest extends TestSuite {
  val tests = Tests {
    'basic - {
      val basic = TabPane(TabPane.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        basic.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="ui bottom attached segment active tab">Abc</div></div>"""
        )
      }
    }
  }
}
