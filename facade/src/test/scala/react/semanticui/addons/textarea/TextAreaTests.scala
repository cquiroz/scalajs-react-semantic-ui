package react.semanticui.addons.textarea

import utest._
import japgolly.scalajs.react.test._

object TextAreaTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val check = TextArea()
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<textarea rows="3"></textarea>"""
        )
      }
    }
    test("value") {
      val check = TextArea(rows = 10, value = "Some text")
      ReactTestUtils.withNewBodyElement { mountNode =>
        check.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<textarea rows="10">Some text</textarea>"""
        )
      }
    }
  }
}
