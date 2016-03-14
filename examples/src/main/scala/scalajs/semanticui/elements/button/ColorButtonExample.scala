package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.icon.Icon

trait ColorExample {

  val colors = List(
      "red",
      "orange",
      "yellow",
      "olive",
      "green",
      "teal",
      "blue",
      "violet",
      "purple",
      "pink",
      "brown",
      "grey",
      "black")
}

object ColorButtonExample extends ColorExample {

  def component = ReactComponentB[Unit]("ColorButtonExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another spaced example",
        <.h4(
          ^.cls := "ui header",
          "Colored Buttons"
        ),
        <.p("A basic button with color"),
        colors.map(c =>
          Button(
            Button.Props(basic = true, color = Some(c)),
            Character.toUpperCase(c.charAt(0)) + c.substring(1)
          )
        )
      )
    )
    .buildU

  def apply() = component()
}

object InvertedColorButtonExample extends ColorExample {

  def component = ReactComponentB[Boolean]("ColorButtonExample")
    .stateless
    .render_P(p =>
      <.div(
        ^.cls := "spaced example",
        <.h4(
          ^.cls := "ui header",
          "Inverted"
        ),
        <.p("A button can be formatted to appear on dark backgrounds"),
        <.div(
          ^.cls := "ui inverted segment",
          colors.map(c =>
            Button(
              Button.Props(basic = p, inverted = true, color = Some(c)),
              Character.toUpperCase(c.charAt(0)) + c.substring(1)
            )
          )
      )
      )
    )
    .build

  def apply(basic: Boolean) = component(basic)
}
