package react.semanticui.collections.form

import utest._
import japgolly.scalajs.react.test._

object FormTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val form = Form()
      ReactTestUtils.withNewBodyElement { mountNode =>
        form.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<form class="ui form"></form>""")
      }
    }

  }
}
