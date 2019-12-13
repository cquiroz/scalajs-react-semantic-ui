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
      val label = Label()
      ReactTestUtils.withRenderedIntoDocument(label) { m =>
        assert(m.outerHtmlScrubbed() == """<div class="ui label"></div>""")
      }
    }
    'attached - {
      val label = Label(attached = LabelAttached.Top)
      ReactTestUtils.withNewBodyElement { mountNode =>
        label.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui top attached label"></div>""")
      }
    }
    'color - {
      val label = Label(color = Blue)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui blue label"></div>""")
      }
    }
    'corner_boolean - {
      val label = Label(corner = LabelCorner.Corner)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui corner label"></div>""")
      }
    }
    'corner_string - {
      val label = Label(corner = LabelCorner.Left)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui left corner label"></div>""")
      }
    }
    'detailVdom - {
      val labelDetail = LabelDetail("Detail")
      val label       = Label(detail = labelDetail)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(
          m.innerHTML == """<div class="ui label"><div class="detail">Detail</div></div>"""
        )
      }
    }
    'active - {
      val label = Label(active = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui active label"></div>""")
      }
    }
    'icon - {
      val label = Label(icon = Icon(name = "comment"))
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(
          m.innerHTML == """<div class="ui label"><i aria-hidden="true" class="comment icon"></i></div>"""
        )
      }
    }
    'iconAndText - {
      val label = Label()(Icon(name = "comment"), "23")
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(
          m.innerHTML == """<div class="ui label"><i aria-hidden="true" class="comment icon"></i>23</div>"""
        )
      }
    }
    'imageAndDetail - {
      val label = Label(as = "a", image = true)(<.img(^.src := "image.jpg"), "img")
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(
          m.innerHTML == """<a class="ui image label"><img src="image.jpg">img</a>"""
        )
      }
    }
    'tag - {
      val label = Label(tag = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui tag label"></div>""")
      }
    }
    'horizontal - {
      val label = Label(horizontal = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui horizontal label"></div>""")
      }
    }
    'floating - {
      val label = Label(floating = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui floating label"></div>""")
      }
    }
    'circular - {
      val label = Label(circular = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui circular label"></div>""")
      }
    }
    'empty - {
      val label = Label(empty = true, circular = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui circular empty label"></div>""")
      }
    }
    'pointing - {
      val label = Label(pointing = LabelPointing.Default)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui pointing label"></div>""")
      }
    }
    'pointingBelow - {
      val label = Label(pointing = LabelPointing.Below)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui pointing below label"></div>""")
      }
    }
    'basic - {
      val label = Label(basic = true)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui basic label"></div>""")
      }
    }
    'className - {
      val label = Label(className = "extra")
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui label extra"></div>""")
      }
    }
    'removeIcon - {
      val label = Label(removeIcon = Icon(name = "remove"))
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui label"></div>""")
      }
    }
    'ribbonDefault - {
      val label = Label(ribbon = LabelRibbon.Default)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui ribbon label"></div>""")
      }
    }
    'ribbonRight - {
      val label = Label(ribbon = LabelRibbon.Right)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui right ribbon label"></div>""")
      }
    }
    'size - {
      val label = Label(size = Big)
      ReactTestUtils.withNewBodyElement { m =>
        label.renderIntoDOM(m)
        assert(m.innerHTML == """<div class="ui big label"></div>""")
      }
    }
  }
}
