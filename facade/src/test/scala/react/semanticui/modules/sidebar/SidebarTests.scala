package react.semanticui.modules.sidebar

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react._
import react.semanticui.collections.menu.Menu
import react.semanticui.As

object SidebarTests extends TestSuite {
  val DoubleComp = ScalaComponent.builder[Int]("Doubler")
  .render_P(i => <.p(s"$i + $i = ${i << 1}"))
  .build

  val tests = Tests {
    'pusher - {
      val pusher = Sidebar.Pusher(Sidebar.Pusher.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="pusher">Abc</div></div>""")
      }
    }
    'pushable - {
      val pushable = Sidebar.Pushable(Sidebar.Pushable.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pushable.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="pushable">Abc</div></div>""")
      }
    }
    'pushableAs - {
      val pushable = Sidebar.Pushable(Sidebar.Pushable.props(as = As.Segment()), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pushable.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui segment pushable">Abc</div></div>""")
      }
    }
    'sidebar - {
      val sidebar = Sidebar(Sidebar.props(), "Abc")
      ReactTestUtils.withRenderedIntoDocument(sidebar) { m =>
        assert(m.outerHtmlScrubbed == """<div class="ui left sidebar">Abc</div>""")
      }
    }
    'sidebarAs - {
      val sidebar = Sidebar(Sidebar.props(as = As.Menu(Menu.props(inverted = true))), "Abc")
      ReactTestUtils.withRenderedIntoDocument(sidebar) { m =>
        assert(m.outerHtmlScrubbed == """<div class="ui inverted ui left sidebar menu">Abc</div>""")
      }
    }
  }
}
