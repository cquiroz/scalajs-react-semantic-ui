package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.widths._

object FormTextAreaTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormTextArea()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="field"><textarea rows="3"></textarea></div>"""
        )
      }
    }
    test("width") {
      val form = FormTextArea(width = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><textarea rows="3"></textarea></div>"""
        )
      }
    }
    test("value") {
      val form = FormTextArea(width = Two, value = "test")
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><textarea rows="3">test</textarea></div>"""
        )
      }
    }
  }
}
