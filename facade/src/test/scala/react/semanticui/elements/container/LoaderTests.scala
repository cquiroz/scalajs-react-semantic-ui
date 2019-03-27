package react.semanticui.elements.container

import utest._
import japgolly.scalajs.react.test._

object ContainerTest extends TestSuite {
  val tests = Tests {
    'render - {
      val loader = Container(Container.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        loader.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui container"></div></div>""")
      }
    }
    'renderAs - {
      val loader = Container(Container.props(as = "a", fluid = true))
      ReactTestUtils.withNewBodyElement { mountNode =>
        loader.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(mountNode.outerHTML == """<div><div class="ui fluid container"></div></div>""")
      }
    }
  }
}
