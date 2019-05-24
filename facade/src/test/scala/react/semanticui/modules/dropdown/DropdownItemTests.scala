package react.semanticui.modules.dropdown

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object DropdownItemTests extends TestSuite {
  val tests = Tests {
    'item - {
      val item = DropdownItem(DropdownItem.props(), "Option 1")
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div role="option" class="item">Option 1</div></div>"""
        )
      }
    }
    'itemDescriptionString - {
      val item = DropdownItem(DropdownItem.props(description = "some description"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div role="option" class="item"><span class="description">some description</span></div></div>"""
        )
      }
    }
    'itemValue - {
      val item = DropdownItem(DropdownItem.props(value = 1))
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div role="option" class="item"></div></div>"""
        )
      }
    }
  }
}
