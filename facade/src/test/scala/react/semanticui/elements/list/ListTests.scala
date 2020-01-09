package react.semanticui.elements.list

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object ListTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val item1 = ListItem("a")
      val item2 = ListItem("b")
      val list  = List(item1 :: item2 :: Nil)
      ReactTestUtils.withNewBodyElement { mountNode =>
        list.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div role="list" class="ui list"><div role="listitem" class="item">a</div><div role="listitem" class="item">b</div></div>"""
        )
      }
    }
    test("renderAs") {
      // val item = ListItem(as = "a")
      // ReactTestUtils.withNewBodyElement { mountNode =>
      //   item.renderIntoDOM(mountNode)
      //println(mountNode.innerHTML)
      //   assert(mountNode.innerHTML == """<a role="listitem" class="item"></a>""")
      // }
    }
    // test("icon") {
    //   val item = ListItem(icon = ListIcon("home"))
    //   ReactTestUtils.withNewBodyElement { mountNode =>
    //     item.renderIntoDOM(mountNode)
    //     assert(
    //       mountNode.innerHTML == """<div role="listitem" class="item"><i aria-hidden="true" class="home icon"></i></div>"""
    //     )
    //   }
    // }
    // test("icon2") {
    //   val item = ListItem(icon = <.div("valid"))
    //   ReactTestUtils.withNewBodyElement { mountNode =>
    //     item.renderIntoDOM(mountNode)
    //     assert(
    //       mountNode.innerHTML == """<div role="listitem" class="item"><div>valid</div></div>"""
    //     )
    //   }
    // }
    // test("header") {
    //   val item = ListItem(header = ListHeader("value"))
    //   ReactTestUtils.withNewBodyElement { mountNode =>
    //     item.renderIntoDOM(mountNode)
    //     assert(
    //       mountNode.innerHTML == """<div role="listitem" class="item"><div class="header">value</div></div>"""
    //     )
    //   }
    // }
  }
}