package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.widths._

object FormFieldTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormField()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="field"></div>""")
      }
    }
    test("width") {
      val form = FormField(width = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="two wide field"></div>""")
      }
    }
  }
}
