package react.semanticui.elements.icon

import utest._
import japgolly.scalajs.react.test._
import react.common._
import react.semanticui.elements.icon.IconRotated._
import react.semanticui.sizes._
import react.semanticui.colors._

object IconTests extends TestSuite {
  val tests = Tests {
    'render - {
      val icon = Icon(name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<i aria-hidden="true" class="edit icon"></i>""")
      }
    }
    'renderFitted - {
      val icon = Icon(fitted = true, name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="edit fitted icon"></i>"""
        )
      }
    }
    'renderClassName - {
      val icon = Icon(className = "another", name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="edit icon another"></i>"""
        )
      }
    }
    'size - {
      val icon = Icon(size = Big, name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="edit big icon"></i>"""
        )
      }
    }
    'flipped - {
      val icon = Icon(flipped = IconFlip.Horizontally, name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="edit horizontally flipped icon"></i>"""
        )
      }
    }
    'color - {
      val icon = Icon(color = Blue, name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="blue edit icon"></i>"""
        )
      }
    }
    'colorCopy - {
      val icon = Icon(color = Blue, name = "edit").color(Red)
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="red edit icon"></i>"""
        )
      }
    }
    'rotated - {
      val icon = Icon(rotated = IconRotated.Clockwise, name = "edit")
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i aria-hidden="true" class="edit clockwise rotated icon"></i>"""
        )
      }
    }
    'group - {
      val icon = IconGroup(Icon(rotated = Clockwise, name = "edit"), Icon(name = "copy"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        icon.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<i class="icons"><i aria-hidden="true" class="edit clockwise rotated icon"></i><i aria-hidden="true" class="copy icon"></i></i>"""
        )
      }
    }
  }
}
