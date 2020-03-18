package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon._
import react.common.style.Css

object MenuItemTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val menuItem = MenuItem()
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="item"></div>""")
      }
    }
    test("renderAs") {
      val button = MenuItem(as = "a")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="item"></a>""")
      }
    }
    test("renderAsTag") {
      val button = MenuItem(as = <.a, icon = Icon(name = "comment"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<a class="icon item"><i aria-hidden="true" class="comment icon"></i></a>"""
        )
      }
    }
    test("apply") {
      val menuItem = MenuItem(clazz = Css("my-class"))(<.div, <.span)
      ReactTestUtils.withRenderedIntoDocument(menuItem) { m =>
        val html = m.outerHtmlScrubbed()
        assert(html == """<div class="item my-class"><div></div><span></span></div>""")
      }
    }
  }
}
