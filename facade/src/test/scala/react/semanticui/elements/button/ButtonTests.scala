package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon.Icon
import react.semanticui.elements.label.Label
import react.semanticui.colors._
import react.semanticui.floats
import react.semanticui.sizes._
import react.semanticui._

object ButtonTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val button = Button()
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button"></button>""")
      }
    }
    test("renderAs") {
      val button = Button(as = "a")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui button" role="button"></a>""")
      }
    }
    test("attached") {
      val button = Button(attached = ButtonAttached.Top)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui top attached button" role="button" tabindex="0"></div>"""
        )
      }
    }
    test("color") {
      val button = Button(color = Blue)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui blue button"></button>""")
      }
    }
    test("active") {
      val button = Button(active = true)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui active button"></button>""")
      }
    }
    test("icon") {
      val button = Button(icon = Icon(name = "comment"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui icon button"><i aria-hidden="true" class="comment icon"></i></button>"""
        )
      }
    }
    test("label") {
      val button = Button(label = Label("Label"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui labeled button"><button class="ui button" tabindex="0"> </button><div class="ui label">Label</div></div>"""
        )
      }
    }
    test("iconAndText") {
      val button = Button()(Icon(name = "comment"), "23")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui button"><i aria-hidden="true" class="comment icon"></i>23</button>"""
        )
      }
    }
    test("toggle") {
      val button = Button(toggle = true)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui toggle button" aria-pressed="false"></button>"""
        )
      }
    }
    test("tabIndex") {
      val button = Button(tabIndex = 2)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button" tabindex="2"></button>""")
      }
    }
    test("floated") {
      val button = Button(floated = floats.Right)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui right floated button"></button>""")
      }
    }
    test("circular") {
      val button = Button(circular = true)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui circular button"></button>""")
      }
    }
    test("secondary") {
      val button = Button(secondary = true, circular = true)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui circular secondary button"></button>"""
        )
      }
    }
    test("basic") {
      val button = Button(basic = true)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui basic button"></button>""")
      }
    }
    test("className") {
      val button = Button(className = "extra")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button extra"></button>""")
      }
    }
    test("size") {
      val button = Button(size = Big)
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui big button"></button>""")
      }
    }
  }
}
