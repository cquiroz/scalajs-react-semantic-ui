package react.semanticui.elements.input

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.test.ReactTestUtils
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.Callback
import react.semanticui.elements.icon.Icon

object InputTests extends TestSuite {
  val tests = Tests {
    'render - {
      val input = Input(Input.props())
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="text"></div>""")
      }
    }
    'actionBool - {
      val input = Input(Input.props(action = true))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui action input"><input type="text"></div>"""
        )
      }
    }
    'actionItem - {
      val input = Input(Input.props(action = Icon(Icon.props(name = "comment")).vdomElement))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui action input"><input type="text"><i aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    'icon - {
      val input = Input(Input.props(icon = Icon(Icon.props(name = "comment"))))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui icon input"><input type="text"><i aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    'iconAndText - {
      val input = Input(Input.props(), Icon(Icon.props(name = "comment")), "23")
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui input"><i aria-hidden="true" class="comment icon"></i>23</div>"""
        )
      }
    }
    'input - {
      val input = Input(Input.props(input = Icon(Icon.props(name = "comment")).vdomElement))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui input"><i type="text" aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    'typePassword - {
      val input = Input(Input.props(`type` = "password"))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="password"></div>""")
      }
    }
    'onChange - {
      val input = Input(Input.props(onChange = Callback.log("abc")))
      ReactTestUtils.withRenderedIntoDocument(input) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui input"><input type="text"></div>""")
      }
    }
  }
}
