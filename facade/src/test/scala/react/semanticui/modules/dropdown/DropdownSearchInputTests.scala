package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._

object DropdownSearchInputTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = DropdownSearchInput()
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<input aria-autocomplete="list" autocomplete="off" class="search" type="text" value="">"""
        )
      }
    }
  }
}
