package react.semanticui.elements.input

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.test.ReactTestUtils
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.Callback
import react.semanticui.elements.icon.Icon

object InputTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val input = Input()
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="text"></div>""")
      }
    }
    test("actionBool") {
      val input = Input(action = true)
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui action input"><input type="text"></div>"""
        )
      }
    }
    test("actionItem") {
      val input = Input(action = Icon(name = "comment").vdomElement)
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui action input"><input type="text"><i aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    test("icon") {
      val input = Input(icon = Icon(name = "comment"))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui icon input"><input type="text"><i aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    test("iconAndText") {
      val input = Input()(Icon(name = "comment"), "23")
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui input"><i aria-hidden="true" class="comment icon"></i>23</div>"""
        )
      }
    }
    test("input") {
      val input = Input(input = Icon(name = "comment").vdomElement)
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui input"><i type="text" aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    test("typePassword") {
      val input = Input(`type` = "password")
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="password"></div>""")
      }
    }
    test("onChange") {
      val input = Input(onChange = Callback.log("abc"))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="text"></div>""")
      }
    }
  }
}
