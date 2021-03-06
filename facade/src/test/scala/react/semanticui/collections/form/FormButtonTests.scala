package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.widths._
import react.semanticui.elements.label.Label
import react.semanticui.elements.button.LabelPosition

object FormButtonTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormButton()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="field"><button class="ui button"></button></div>"""
        )
      }
    }
    test("width") {
      val form = FormButton(width = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><button class="ui button"></button></div>"""
        )
      }
    }
    test("label") {
      val form =
        FormButton(width = Two,
                   label = Label(content = "label"),
                   labelPosition = LabelPosition.Left
        )("Press")
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="two wide field"><label content="label"></label><button class="ui left labeled button">Press</button></div>"""
        )
      }
    }
  }
}
