package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.modules.dropdown.DropdownItem
import react.semanticui.widths._

object FormDropdownTests extends TestSuite {
  val tests = Tests {
    test("dropdown") {
      val dropdown = FormDropdown()
      ReactTestUtils.withNewBodyElement { mountNode =>
        dropdown.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="field"><div role="listbox" aria-expanded="false" class="ui dropdown" tabindex="0"><div class="text" role="alert" aria-live="polite" aria-atomic="true"></div><i aria-hidden="true" class="dropdown icon"></i><div class="menu transition"></div></div></div></div>"""
        )
      }
    }
    test("options") {
      val options =
        List(DropdownItem("abc"), DropdownItem(text = "def", value = 2))
      val dropdown = FormDropdown(width = Two, options = options)
      ReactTestUtils.withNewBodyElement { mountNode =>
        dropdown.renderIntoDOM(mountNode)
        val html = mountNode.outerHTML
        assert(
          html == """<div><div class="two wide field"><div role="listbox" aria-expanded="false" class="ui dropdown" tabindex="0"><div class="text" role="alert" aria-live="polite" aria-atomic="true"></div><i aria-hidden="true" class="dropdown icon"></i><div class="menu transition"><div style="pointer-events: all;" role="option" aria-checked="false" aria-selected="true" class="selected item">abc</div><div style="pointer-events: all;" role="option" aria-checked="false" aria-selected="false" class="item"><span class="text">def</span></div></div></div></div></div>"""
        )
      }
    }
  }
}
