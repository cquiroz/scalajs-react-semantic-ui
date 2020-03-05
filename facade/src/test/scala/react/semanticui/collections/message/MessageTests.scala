package react.semanticui.collections.message

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object MessageTests extends TestSuite {
  val tests = Tests {
    test("render") {
      val message = Message()
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"></div>""")
      }
    }

    test("header") {
      val message = Message(
        MessageHeader()
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"><div class="header"></div></div>""")
      }
    }

    test("headerShorthand") {
      val message = Message(
        header = "": VdomNode
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"><div class="content"><div class="header"></div></div></div>""")
      }
    }

    test("content") {
      val message = Message(
        MessageContent()
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"><div class="content"></div></div>""")
      }
    }

    test("contentShorthand") {
      val message = Message(
        content = "*": VdomNode
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message">*</div>""")
      }
    }

    test("list") {
      val message = Message(
        MessageList(
          MessageItem(""),
          MessageItem("")
        )
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"><ul class="list"><li class="content"></li><li class="content"></li></ul></div>""")
      }
    }

    test("listShorthand") {
      val message = Message(
        list = List[VdomNode]("", "")
      )
      ReactTestUtils.withNewBodyElement { mountNode =>
        message.renderIntoDOM(mountNode)
        val html = mountNode.innerHTML
        assert(html == """<div class="ui message"><div class="content"><ul class="list"><li class="content"></li><li class="content"></li></ul></div></div>""")
      }
    }
  } 
}
