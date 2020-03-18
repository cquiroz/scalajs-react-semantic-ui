package react.semanticui.collections.menu

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.common.style.Css

object MenuTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val menu = Menu()
      ReactTestUtils.withRenderedIntoDocument(menu) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui menu"></div>""")
      }
    }
    test("renderAs") {
      val menu = Menu(as = <.a)
      ReactTestUtils.withRenderedIntoDocument(menu) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui menu"></a>""")
      }
    }
    test("applyItems") {
      val menu = Menu(
        MenuHeader(),
        MenuItem(clazz = Css("my-class"))(<.div, <.span)
      )
      ReactTestUtils.withRenderedIntoDocument(menu) { m =>
        val html = m.outerHtmlScrubbed()
        assert(
          html == """<div class="ui menu"><div class="header"></div><div class="item my-class"><div></div><span></span></div></div>"""
        )
      }
    }
  }
}
