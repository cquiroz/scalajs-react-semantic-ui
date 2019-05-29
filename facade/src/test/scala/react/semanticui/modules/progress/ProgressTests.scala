package react.semanticui.modules.checkbox

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ProgressTest extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = Progress(Progress.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="ui progress" data-percent="0"><div class="bar" style="width: 0%;"></div><div class="label">Abc</div></div></div>""")
      }
    }
  }
}
