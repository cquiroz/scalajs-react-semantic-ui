package react.semanticui.elements.image

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon.Icon

object ImageTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val image = Image()
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<img class="ui image">""")
      }
    }
    test("renderInside") {
      val image = <.div(Image(src = "http://fig1.jpg", className = "draggable"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div><img src="http://fig1.jpg" class="ui image draggable"></div>"""
        )
      }
    }
    test("renderAs") {
      val image = Image(as = "a", href = "abc")
      ReactTestUtils.withNewBodyElement { mountNode =>
        image.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="ui image" href="abc"><img></a>""")
      }
    }
    test("renderChild") {
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
