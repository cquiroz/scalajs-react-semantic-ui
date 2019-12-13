package react.semanticui.modules.checkbox

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ProgressTest extends TestSuite {
  val tests = Tests {
    'progress - {
      val progress = Progress("Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        progress.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui progress" data-percent="0"><div class="bar" style="width: 0%;"></div><div class="label">Abc</div></div>"""
        )
      }
    }
  }
}
