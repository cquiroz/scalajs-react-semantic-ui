package react.semanticui.modules.sidebar

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.segment.Segment

object SidebarTests extends TestSuite {
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
      val pushable = Sidebar.Pushable(Sidebar.Pushable.props(as = Segment.As), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pushable.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(mountNode.outerHTML == """<div><div class="ui segment pushable">Abc</div></div>""")
      }
    }
    'sidebar - {
      val sidebar = Sidebar(Sidebar.props(), "Abc")
      ReactTestUtils.withRenderedIntoDocument(sidebar) { m =>
        assert(m.outerHtmlScrubbed == """<div class="ui left sidebar">Abc</div>""")
      }
    }
  }
}
