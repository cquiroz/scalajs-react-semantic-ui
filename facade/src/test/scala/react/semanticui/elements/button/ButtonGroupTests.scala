package react.semanticui.elements.button

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ButtonGroupTests extends TestSuite {
  val tests = Tests {
    'render - {
      val buttonGroup = ButtonGroup(ButtonGroup.props(), "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonGroup.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui buttons">abc</div></div>""")
      }
    }
    'buttons - {
      val buttonGroup =
        ButtonGroup(ButtonGroup.props(), Button(Button.props(), "1"), Button(Button.props(), "2"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        buttonGroup.renderIntoDOM(mountNode)
        assert(
          mountNode.outerHTML == """<div><div class="ui buttons"><button class="ui button">1</button><button class="ui button">2</button></div></div>""")
      }
    }
  }
}
