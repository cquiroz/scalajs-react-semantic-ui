package scalajs.semanticui.common

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Footer {

  val component =  ReactComponentB[Unit]("Footer")
      .stateless
      .render(_ =>
        <.div(
          ^.cls := "ui black inverted vertical footer segment",
          <.div(
            ^.cls := "ui center aligned container",
            <.div(
              ^.cls := "ui stackable inverted grid",
              <.div(
                ^.cls := "three wide column",
                <.h4(
                  ^.cls := "ui inverted header",
                  "Community"),
                <.div(
                  ^.cls := "ui inverted link list",
                  <.a(
                    ^.cls := "item",
                    ^.href := "https://github.com/cquiroz/scalajs-react-semantic-ui",
                    ^.target := "_blank",
                    "GitHub Repo"),
                  <.a(
                    ^.cls := "item",
                    ^.href := "https://github.com/cquiroz/scalajs-react-semantic-ui/issues",
                    ^.target := "_blank",
                    "Submit an Issue")
                )
              )
            ),
            <.div(
              ^.cls := "ui inverted section divider")
          )
        )
      ).buildU

  def apply() = component()
}
