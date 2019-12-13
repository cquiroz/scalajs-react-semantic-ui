package react.semanticui.elements.divider

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
// import react.semanticui.elements.image.Image
// import react.semanticui._
import react.common._

object DividerTests extends TestSuite {
  val tests = Tests {
    'render - {
      val divider = Divider()
      ReactTestUtils.withNewBodyElement { mountNode =>
        divider.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui divider"></div>""")
      }
    }
    'renderAs - {
      val divider = Divider(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        divider.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="ui divider"></a>""")
      }
    }
    //   'children - {
    //     val divider = Divider(vertical = true)(<.div("abc"), Image(href = "cde"))
    //     ReactTestUtils.withNewBodyElement { mountNode =>
    //       divider.renderIntoDOM(mountNode)
    //       assert(
    //         mountNode.innerHTML == """<div class="ui vertical divider"><div>abc</div><a class="ui image" href="cde"><img></a></div>"""
    //       )
    //     }
    //   }
  }
}
