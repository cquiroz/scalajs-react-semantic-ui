package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownDividerTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DropdownDivider(DropdownDivider.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(
          mountNode.outerHTML == """<div><div class="divider">Abc</div></div>"""
        )
      }
    }
  }
}
