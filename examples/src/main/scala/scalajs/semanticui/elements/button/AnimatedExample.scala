package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common._
import scalajs.semanticui.elements.button.Button.{Animated, Fade, Primary, Vertical}
import scalajs.semanticui.elements.icon.Icon

object AnimatedExample {

  def component = ReactComponentB[Unit]("AnimatedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another example",
        dataClass := "animated fade, animated",
        <.h4(
          ^.cls := "ui header",
          "Animated"
        ),
        <.p("A button can animate to show hidden content"),
        <.div(
          ^.cls := "ui ignored message",
          "The button will be automatically sized according to the visible content size. Make sure there is enough room for the hidden content to show"
        ),
        Button(
          Button.Props(animated = Animated, tabIndex = Some(0)),
          <.div(
            ^.cls := "visible content",
            "Next"
          ),
          <.div(
            ^.cls := "hidden content",
            Icon("right arrow")
          )
        ),
        Button(
          Button.Props(animated = Vertical, tabIndex = Some(0)),
          <.div(
            ^.cls := "hidden content",
            "Shop"
          ),
          <.div(
            ^.cls := "visible content",
            Icon("shop")
          )
        ),
        Button(
          Button.Props(animated = Fade, tabIndex = Some(0)),
          <.div(
            ^.cls := "hidden content",
            "$12.99 a month"
          ),
          <.div(
            ^.cls := "visible content",
            "Sign-up for a Pro account"
          )
        )
      )
    )
    .buildU

  def apply() = component()
}
