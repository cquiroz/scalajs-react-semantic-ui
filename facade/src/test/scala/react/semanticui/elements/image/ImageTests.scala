package react.semanticui.elements.image

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.elements.icon.Icon

object ImageTests extends TestSuite {
  val tests = Tests {
    'render - {
      val image = Image()
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<img class="ui image">""")
      }
    }
    'renderAs - {
      val image = Image(as = "a", href = "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="ui image" href="abc"><img></a>""")
      }
    }
    'renderChild - {
      val image = Image(as = "a", circular = true)(Icon(name = "help"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<a class="ui circular image"><i aria-hidden="true" class="help icon"></i></a>"""
        )
      }
    }
  }
}
