package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.widths._

object FormGroupTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = FormGroup()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="fields"></div>""")
      }
    }
    test("width") {
      val form = FormGroup(widths = Two)
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="two fields"></div>""")
      }
    }
  }
}
