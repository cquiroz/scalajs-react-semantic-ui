package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.icon.Icon

object BasicButtonExample {

  def component = ReactComponentB[Unit]("BasicButtonExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Basic"
        ),
        <.p("A basic button is less pronounced"),
        Button(
          Button.Props(basic = true),
          Icon("user"),
          "Add Friend"
        )
      )
    )
    .buildU

  def apply() = component()
}
