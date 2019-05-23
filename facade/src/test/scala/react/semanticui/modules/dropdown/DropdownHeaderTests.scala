package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._

object DropdownHeaderTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DropdownHeader(DropdownHeader.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="header"></div></div>"""
        )
      }
    }
  }
}
