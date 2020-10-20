package react.semanticui.modules.accordion

import japgolly.scalajs.react.test._
import utest._

object AccordionContentTests extends TestSuite {
  val tests = Tests {
    test("content") {
      val content = AccordionContent(content = "polka")
      ReactTestUtils.withNewBodyElement { mountNode =>
        content.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">polka</div>""")
      }
    }
    test("apply") {
      val content = AccordionContent("zydeco")
      ReactTestUtils.withNewBodyElement { mountNode =>
        content.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content">zydeco</div>""")
      }
    }
    test("active") {
      val content = AccordionContent(content = "disco", active = true)
      ReactTestUtils.withNewBodyElement { mountNode =>
        content.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="content active">disco</div>""")
      }
    }
  }
}
