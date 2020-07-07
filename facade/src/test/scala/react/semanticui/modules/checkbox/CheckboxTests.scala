package react.semanticui.modules.checkbox

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.Callback

object CheckboxTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val check = Checkbox()
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div>"""
        )
      }
    }
    test("boolean callback") {
      val cb    = (b: Boolean) => Callback.log(b)
      val check = Checkbox(onChange = cb)
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div>"""
        )
      }
    }
  }
}
