package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.widths._
// import react.semanticui.elements.label.Label
// import react.semanticui.elements.button.LabelPosition

object FormCheckboxTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormCheckbox()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="field"><div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div></div>"""
        )
      }
    }
    test("width") {
      val form = FormCheckbox(width = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div></div>"""
        )
      }
    }
    test("value") {
      val form = FormCheckbox(width = Two, value = 1, slider = true)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        println(mountNode.innerHTML)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><div class="ui fitted slider checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value="1"><label></label></div></div>"""
        )
      }
    }
  }
}
