package react.semanticui.elements.loader

import utest._
import japgolly.scalajs.react.test._

object LoaderTest extends TestSuite {
  val tests = Tests {
    'render - {
      val loader = Loader(Loader.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        loader.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><div class="ui loader"></div></div>""")
      }
    }
    'renderAs - {
      val loader = Loader(Loader.props(as = "a", inverted = true))
      ReactTestUtils.withNewBodyElement { mountNode =>
        loader.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><a class="ui inverted loader"></a></div>""")
      }
    }
  }
}
