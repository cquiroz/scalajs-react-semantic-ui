package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.widths._

object FormInputTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormInput()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="field"><div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div></div>"""
        )
      }
    }
    test("width") {
      val form = FormInput(width = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        println(mountNode.innerHTML)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><div class="ui input"><input type="text"></div></div>"""
        )
      }
    }
    test("inverted") {
      val form = FormInput(width = Two, inverted = true, focus = true, value = "test")
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><div class="ui focus inverted input"><input type="text" value="test"></div></div>"""
        )
      }
    }
  }
}
