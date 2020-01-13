package react.semanticui.addons.radio

import utest._
import japgolly.scalajs.react.test._

object RadioTests extends TestSuite {
  val tests = Tests {
    test("pusher") {
      val check = Radio()
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui fitted radio checkbox"><input class="hidden" readonly="" tabindex="0" type="radio" value=""><label></label></div>"""
        )
      }
    }
  }
}
