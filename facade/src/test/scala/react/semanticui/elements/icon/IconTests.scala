package react.semanticui.elements.icon

import utest._
import japgolly.scalajs.react.test._
import react.semanticui.sizes._
import react.semanticui.colors._

object IconTests extends TestSuite {
  val tests = Tests {
    'render - {
      val icon = Icon(Icon.props(name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit icon"></i>""")
      }
    }
    'renderFitted - {
      val icon = Icon(Icon.props(fitted = true, name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit fitted icon"></i>""")
      }
    }
    'renderClassName - {
      val icon = Icon(Icon.props(className = "another", name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit icon another"></i>""")
      }
    }
    'size - {
      val icon = Icon(Icon.props(size = Big, name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit big icon"></i>""")
      }
    }
    'flipped - {
      val icon = Icon(Icon.props(flipped = IconFlip.Horizontally, name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(
          m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit horizontally flipped icon"></i>"""
        )
      }
    }
    'color - {
      val icon = Icon(Icon.props(color = Blue, name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(m.outerHtmlScrubbed() == """<i aria-hidden="true" class="blue edit icon"></i>""")
      }
    }
    'rotated - {
      val icon = Icon(Icon.props(rotated = IconRotated.Clockwise, name = "edit"))
      ReactTestUtils.withRenderedIntoDocument(icon) { m =>
        assert(
          m.outerHtmlScrubbed() == """<i aria-hidden="true" class="edit clockwise rotated icon"></i>"""
        )
      }
    }
    // 'group - {
    //   val icon = Icon.Group(Icon.Group.props(), Icon(Icon.props(rotated = Clockwise, name = "edit")).vdomElement)
    //   ReactTestUtils.withRenderedIntoDocument(icon) { m =>
    //     assert(m.outerHtmlScrubbed() == "")
    //   }
    // }
  }
}
