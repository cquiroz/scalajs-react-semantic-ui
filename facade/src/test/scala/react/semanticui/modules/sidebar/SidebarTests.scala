package react.semanticui.modules.sidebar

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react._
import react.semanticui.collections.menu.Menu
import react.semanticui.As

object SidebarTests extends TestSuite {
  val DoubleComp = ScalaComponent
    .builder[Int]("Doubler")
    .render_P(i => <.p(s"$i + $i = ${i << 1}"))
    .build

  val tests = Tests {
    'pusher - {
      val pusher = SidebarPusher("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="pusher">Abc</div>""")
      }
    }
    'pushable - {
      val pushable = SidebarPushable("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pushable.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="pushable">Abc</div>""")
      }
    }
    'pushableAs - {
      val pushable = SidebarPushable(as = As.Segment())("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pushable.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui segment pushable">Abc</div>""")
      }
    }
    'sidebar - {
      val sidebar = Sidebar(DoubleComp(1))
      ReactTestUtils.withRenderedIntoDocument(sidebar) { m =>
        assert(m.outerHtmlScrubbed == """<div class="ui left sidebar"><p>1 + 1 = 2</p></div>""")
      }
    }
    'sidebarAs - {
      val sidebar = Sidebar(as = As.Menu(Menu(inverted = true)))("Abc")
      ReactTestUtils.withRenderedIntoDocument(sidebar) { m =>
        assert(m.outerHtmlScrubbed == """<div class="ui inverted ui left sidebar menu">Abc</div>""")
      }
    }
  }
}
