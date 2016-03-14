package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common._
import scalajs.semanticui.elements.button.Button.{Animated, Fade, Vertical}
import scalajs.semanticui.elements.icon.Icon

object IconExample {

  def component = ReactComponentB[Unit]("IconExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Icon"
        ),
        <.p("A button can have only an icon"),
        Button(
          Button.Props(icon = Button.IconButton),
          Icon("cloud")
        )
      )
    )
    .buildU

  def apply() = component()
}
