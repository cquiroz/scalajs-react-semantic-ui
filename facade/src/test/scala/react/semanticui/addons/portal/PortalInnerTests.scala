package react.semanticui.addons.portal

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object PortalInnerTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val portal = PortalInner(child = <.div("Abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        portal.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div></div>""")
      }
    }
  }
}
