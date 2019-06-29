package react.semanticui.views.item

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ItemGroupTests extends TestSuite {
  val tests = Tests {
    'render - {
      val pusher = ItemGroup(ItemGroup.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui items">Abc</div></div>""")
      }
    }
  }
}
