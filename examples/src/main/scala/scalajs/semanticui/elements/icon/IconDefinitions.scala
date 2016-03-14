package scalajs.semanticui.elements.icon

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common._
import scalajs.semanticui.elements.icon.Icon.{Clockwise, CounterClockwise, Horizontally, Vertically}

object IconDefinitions {

  def component = ReactComponentB[Unit]("IconDefinitions")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "ui tab",
        dataTab := "definition",
        <.h2(
          ^.cls := "ui dividing header",
          "States"),
        IconExample(
          IconExample.Props("Disabled", "An icon can show that it is disabled"),
          Icon(Icon.Props("users", disabled = true))
        ),
        IconExample(
          IconExample.Props("Loading", "An icon can be used as a simple loader"),
          Icon(Icon.Props("spinner", loading = true)),
          Icon(Icon.Props("notched circle", loading = true)),
          Icon(Icon.Props("asterisk", loading = true))
        ),
        <.h2(
          ^.cls := "ui dividing header",
          "Variations"),
        IconExample(
          IconExample.Props("Fitted", "An icon can be fitted, without any space to the left or right of it."),
          "Tight spacing",
          Icon(Icon.Props("help", fitted = true)),
          "Tight spacing"
        ),
        IconExample(
          IconExample.Props("Size", "An icon can vary in size"),
          Icon(Icon.Props("home", mini = true)),
          Icon(Icon.Props("home", tiny = true)),
          Icon(Icon.Props("home", small = true)),
          <.br(),
          Icon(Icon.Props("home")),
          <.br(),
          Icon(Icon.Props("home", large = true)),
          <.br(),
          Icon(Icon.Props("home", big = true)),
          <.br(),
          Icon(Icon.Props("home", huge = true)),
          <.br(),
          Icon(Icon.Props("home", massive = true))
        ),
        IconExample(
          IconExample.Props("Link", "An icon can be formatted as a link"),
          Icon(Icon.Props("close", link = true)),
          Icon(Icon.Props("help", link = true))
        ),
        IconExample(
          IconExample.Props("Flipped", "An icon can be flipped"),
          Icon(Icon.Props("cloud", flipped = Horizontally)),
          Icon(Icon.Props("cloud", flipped = Vertically))
        ),
        IconExample(
          IconExample.Props("Rotated", "An icon can be rotated"),
          Icon(Icon.Props("cloud", rotated = Clockwise)),
          Icon(Icon.Props("cloud", rotated = CounterClockwise))
        ),
        IconExample(
          IconExample.Props("Circular", "An icon can be formatted to appear circular"),
          Icon(Icon.Props("users", circular = true)),
          Icon(Icon.Props("users", circular = true, color = Some("teal"))),
          Icon(Icon.Props("users", circular = true, inverted = true)),
          Icon(Icon.Props("users", circular = true, inverted = true, color = Some("teal")))
        ),
        IconExample(
          IconExample.Props("Bordered", "An icon can be formatted to appear bordered"),
          Icon(Icon.Props("users", bordered = true)),
          Icon(Icon.Props("users", bordered = true, color = Some("teal"))),
          Icon(Icon.Props("users", bordered = true, inverted = true)),
          Icon(Icon.Props("users", bordered = true, inverted = true, color = Some("teal")))
        ),
        IconExample(
          IconExample.Props("Colored", "An icon can be formatted with different colors"),
          Icon(Icon.Props("users", color = Some("red"))),
          Icon(Icon.Props("users", color = Some("orange"))),
          Icon(Icon.Props("users", color = Some("yellow"))),
          Icon(Icon.Props("users", color = Some("olive"))),
          Icon(Icon.Props("users", color = Some("green"))),
          Icon(Icon.Props("users", color = Some("teal"))),
          Icon(Icon.Props("users", color = Some("blue"))),
          Icon(Icon.Props("users", color = Some("violet"))),
          Icon(Icon.Props("users", color = Some("purple"))),
          Icon(Icon.Props("users", color = Some("pink"))),
          Icon(Icon.Props("users", color = Some("brown"))),
          Icon(Icon.Props("users", color = Some("grey"))),
          Icon(Icon.Props("users", color = Some("black")))
        ),
        IconExample(
          IconExample.Props("Inverted", "An icon can have its colors inverted for contrast", inverted = true),
          Icon(Icon.Props("users", inverted = true)),
          Icon(Icon.Props("users", inverted = true, color = Some("red"))),
          Icon(Icon.Props("users", inverted = true, color = Some("orange"))),
          Icon(Icon.Props("users", inverted = true, color = Some("yellow"))),
          Icon(Icon.Props("users", inverted = true, color = Some("olive"))),
          Icon(Icon.Props("users", inverted = true, color = Some("green"))),
          Icon(Icon.Props("users", inverted = true, color = Some("teal"))),
          Icon(Icon.Props("users", inverted = true, color = Some("blue"))),
          Icon(Icon.Props("users", inverted = true, color = Some("violet"))),
          Icon(Icon.Props("users", inverted = true, color = Some("purple"))),
          Icon(Icon.Props("users", inverted = true, color = Some("pink"))),
          Icon(Icon.Props("users", inverted = true, color = Some("brown"))),
          Icon(Icon.Props("users", inverted = true, color = Some("grey"))),
          Icon(Icon.Props("users", inverted = true, color = Some("black")))
        ),
        <.h2(
          ^.cls := "ui dividing header",
          "Groups")
      )
    ).buildU

  def apply() = component()
}
