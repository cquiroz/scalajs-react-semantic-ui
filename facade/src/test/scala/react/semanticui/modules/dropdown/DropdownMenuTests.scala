package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._

object DropdownMenuTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DropdownMenu(DropdownMenu.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(
          mountNode.outerHTML == """<div><div class="menu transition"></div></div>"""
        )
      }
    }
  }
}
