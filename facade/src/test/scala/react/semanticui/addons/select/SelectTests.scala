package react.semanticui.addons.select

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.modules.dropdown.DropdownItem

object SelectTests extends TestSuite {
  val tests = Tests {
    test("options") {
      val options =
        List(DropdownItem("abc"), DropdownItem(text = "def", value = 2, selected = true))
      val select  = Select(options = options)
      ReactTestUtils.withNewBodyElement { mountNode =>
        select.renderIntoDOM(mountNode)
        val html = mountNode.outerHTML
        assert(
          html == """<div><div role="listbox" aria-expanded="false" class="ui selection dropdown" tabindex="0"><i aria-hidden="true" class="dropdown icon"></i><div class="menu transition"><div style="pointer-events: all;" role="option" aria-checked="false" aria-selected="true" class="selected item">abc</div><div style="pointer-events: all;" role="option" aria-checked="false" aria-selected="true" class="selected item"><span class="text">def</span></div></div></div></div>"""
        )
      }
    }
  }
}
