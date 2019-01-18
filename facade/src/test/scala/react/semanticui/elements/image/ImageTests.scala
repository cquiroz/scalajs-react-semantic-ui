package react.semanticui.elements.image

import utest._
import japgolly.scalajs.react.test._

object ImageTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Image(Image.props())
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.outerHTML == """<div><img class="ui image"></div>""")
      }
    }
    'renderAs - {
      val menuItem = Image(Image.props(as = "a", href = "abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        println(mountNode.outerHTML)
        assert(mountNode.outerHTML == """<div><a class="ui image" href="abc"><img></a></div>""")
      }
    }
  }
}
