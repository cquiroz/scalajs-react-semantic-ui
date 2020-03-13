package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ListItemTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val item = ListItem()
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div role="listitem" class="item"></div>""")
      }
    }
    test("renderAs") {
      val item = ListItem(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a role="listitem" class="item"></a>""")
      }
    }
    test("icon") {
      val item = ListItem(icon = ListIcon("home"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div role="listitem" class="item"><i aria-hidden="true" class="home icon"></i></div>"""
        )
      }
    }
    test("icon2") {
      val item = ListItem(icon = <.div("valid"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div role="listitem" class="item"><div>valid</div></div>"""
        )
      }
    }
    test("header") {
      val item = ListItem(header = ListHeader(^.color.aqua, "value"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        item.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(
          html == """<div role="listitem" class="item"><div style="color: aqua;" class="header">value</div></div>"""
        )
      }
    }
  }
}
