package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon.Icon
import react.semanticui.elements.label.Label
import react.semanticui.colors._
import react.semanticui.floats
import react.semanticui.sizes._

object ButtonTests extends TestSuite {
  val tests = Tests {
    'render - {
      val button = Button(Button.props())
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button"></button>""")
      }
    }
    'renderAs - {
      val button = Button(Button.props(as = "a"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui button" role="button"></a>""")
      }
    }
    'attached - {
      val button = Button(Button.props(attached = ButtonAttached.Top))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<div class="ui top attached button" role="button" tabindex="0"></div>""")
      }
    }
    'color - {
      val button = Button(Button.props(color = Blue))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui blue button"></button>""")
      }
    }
    'active - {
      val button = Button(Button.props(active = true))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui active button"></button>""")
      }
    }
    'icon - {
      val button = Button(Button.props(icon = Icon(Icon.props(name = "comment"))))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui icon button"><i aria-hidden="true" class="comment icon"></i></button>""")
      }
    }
    'label - {
      val button = Button(Button.props(label = Label(Label.props(), "Label")))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        println(m.outerHtmlScrubbed())

        assert(
          m.outerHtmlScrubbed() == """<div class="ui labeled button"><button class="ui button" tabindex="0"> </button><div class="ui label">Label</div></div>""")
      }
    }
    'iconAndText - {
      val button = Button(Button.props(), Icon(Icon.props(name = "comment")), "23")
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui button"><i aria-hidden="true" class="comment icon"></i>23</button>""")
      }
    }
    'toggle - {
      val button = Button(Button.props(toggle = true))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui toggle button" aria-pressed="false"></button>""")
      }
    }
    'tabIndex - {
      val button = Button(Button.props(tabIndex = 2))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button" tabindex="2"></button>""")
      }
    }
    'floated - {
      val button = Button(Button.props(floated = floats.Right))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui right floated button"></button>""")
      }
    }
    'circular - {
      val button = Button(Button.props(circular = true))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui circular button"></button>""")
      }
    }
    'secondary - {
      val button = Button(Button.props(secondary = true, circular = true))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(
          m.outerHtmlScrubbed() == """<button class="ui circular secondary button"></button>""")
      }
    }
    'basic - {
      val button = Button(Button.props(basic = true))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui basic button"></button>""")
      }
    }
    'className - {
      val button = Button(Button.props(className = "extra"))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui button extra"></button>""")
      }
    }
    'size - {
      val button = Button(Button.props(size = Big))
      ReactTestUtils.withRenderedIntoDocument(button) { m =>
        assert(m.outerHtmlScrubbed() == """<button class="ui big button"></button>""")
      }
    }
  }
}
