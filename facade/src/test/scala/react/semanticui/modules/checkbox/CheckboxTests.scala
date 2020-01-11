package react.semanticui.modules.checkbox

import utest._
import japgolly.scalajs.react.test._

object CheckboxTests extends TestSuite {
  val tests = Tests {
    test("pusher") {
      val check = Checkbox()
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div>"""
        )
      }
    }
  }
}
