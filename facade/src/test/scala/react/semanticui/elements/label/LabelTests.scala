package react.semanticui.elements.label

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon.Icon
import react.semanticui.colors._
import react.semanticui.sizes._

object LabelTests extends TestSuite {
  val tests = Tests {
    'render - {
      val label = Label(Label.props())
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"></div>""")
      }
    }
    'attached - {
      val label = Label(Label.props(attached = TopAttached))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui top attached label"></div>""")
      }
    }
    'color - {
      val label = Label(Label.props(color = Blue))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui blue label"></div>""")
      }
    }
    'corner_boolean - {
      val label = Label(Label.props(corner = Corner))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui corner label"></div>""")
      }
    }
    'corner_string - {
      val label = Label(Label.props(corner = LeftCorner))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui left corner label"></div>""")
      }
    }
    'detailVdom - {
      val labelDetail = LabelDetail(LabelDetail.props(), "Detail")
      val label = Label(Label.props(detail = labelDetail.vdomElement))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><div class="detail">Detail</div></div>""")
      }
    }
    'detailProps - {
      val labelDetail = LabelDetail.props(className = "test", content = <.div("Detail"): VdomElement)
      val label = Label(Label.props(detail = labelDetail))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><div class="detail test"><div>Detail</div></div></div>""")
      }
    }
    'active - {
      val label = Label(Label.props(active = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui active label"></div>""")
      }
    }
    'icon - {
      val label = Label(Label.props(icon = Icon.props(name = "comment")))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><i aria-hidden="true" class="comment icon"></i></div>""")
      }
    }
    'iconAndText - {
      val label = Label(Label.props(), Icon(Icon.props(name = "comment")), "23")
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"><i aria-hidden="true" class="comment icon"></i>23</div>""")
      }
    }
    'imageAndDetail - {
      val label = Label(Label.props(as = "a", image = true), <.img(^.src := "image.jpg"), "img")
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<a class="ui image label"><img src="image.jpg">img</a>""")
      }
    }
    'tag - {
      val label = Label(Label.props(tag = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui tag label"></div>""")
      }
    }
    'horizontal - {
      val label = Label(Label.props(horizontal = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui horizontal label"></div>""")
      }
    }
    'floating - {
      val label = Label(Label.props(floating = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui floating label"></div>""")
      }
    }
    'circular - {
      val label = Label(Label.props(circular = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui circular label"></div>""")
      }
    }
    'empty - {
      val label = Label(Label.props(empty = true, circular = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui circular empty label"></div>""")
      }
    }
    'pointing - {
      val label = Label(Label.props(pointing = PointingDefault))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui pointing label"></div>""")
      }
    }
    'pointingBelow - {
      val label = Label(Label.props(pointing = PointingBelow))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui pointing below label"></div>""")
      }
    }
    'basic - {
      val label = Label(Label.props(basic = true))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui basic label"></div>""")
      }
    }
    'className - {
      val label = Label(Label.props(className = "extra"))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label extra"></div>""")
      }
    }
    'removeIcon - {
      val label = Label(Label.props(removeIcon = Icon.props(name = "remove")))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"></div>""")
      }
    }
    'ribbonDefault - {
      val label = Label(Label.props(ribbon = DefaultRibbon))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui ribbon label"></div>""")
      }
    }
    'ribbonRight - {
      val label = Label(Label.props(ribbon = RightRibbon))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui right ribbon label"></div>""")
      }
    }
    'size - {
      val label = Label(Label.props(size = Big))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui big label"></div>""")
      }
    }
    'attached2 - {
      val label = Label(Label.props(attached = TopAttached))
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        println(m.outerHtmlScrubbed)
        assert(m.outerHtmlScrubbed() == """<div class="ui top attached label"></div>""")
      }
    }
  }
}
