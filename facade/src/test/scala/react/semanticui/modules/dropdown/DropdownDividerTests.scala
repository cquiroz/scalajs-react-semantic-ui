package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownDividerTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DropdownDivider("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="divider">Abc</div>"""
        )
      }
    }
  }
}
