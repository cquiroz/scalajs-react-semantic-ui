package react.semanticui.modules.checkbox

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object CheckboxTests extends TestSuite {
  val tests = Tests {
    'pusher - {
      val pusher = Checkbox(Checkbox.props(), "Abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        pusher.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(
          mountNode.outerHTML == """<div><div class="ui fitted checkbox"><input class="hidden" readonly="" tabindex="0" type="checkbox" value=""><label></label></div></div>""")
      }
    }
  }
}
