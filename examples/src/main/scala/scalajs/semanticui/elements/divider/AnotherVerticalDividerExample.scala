package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph
import scalajs.semanticui.elements.icon.Icon

object AnotherVerticalDividerExample {

  def component = ReactComponentB[Unit]("AnotherVerticalDividerExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another example",
        <.div(
          ^.cls := "ui two column middle aligned very relaxed stackable grid",
          <.div(
            ^.cls:="column",
            <.div(
              ^.cls:="ui form",
                <.div(
                  ^.cls:="field",
                  <.label("Username"),
                  <.div(
                    ^.cls:="ui left icon input",
                    <.input(
                      ^.`type` := "text",
                      ^.placeholder :="Username"
                    ),
                    Icon("user")
                  ),
                  <.div(
                    ^.cls := "field",
                    <.label("Password"),
                    <.div(
                      ^.cls:="ui left icon input",
                      <.input(
                        ^.`type` := "password"
                      ),
                      Icon("lock")
                    )
                  ),
                  <.div(
                    ^.cls := "ui blue submit button",
                    "Login"
                  )
                )
            )
          ),
          Divider(Divider.Props(vertical = true), "Or"),
          <.div(
            ^.cls :="center aligned column",
            <.div(
              ^.cls :="ui big green labeled icon button",
              Icon("signup"),
              "Sign Up"
            )
          )
        )
      )
    )
    .buildU

  def apply() = component()
}
