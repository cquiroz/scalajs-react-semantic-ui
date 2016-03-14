package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.button.Button.Secondary

object SecondaryEmphasisExample {

  def component = ReactComponentB[Unit]("EmphasisExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another example",
        Button(
          Button.Props(emphasis = Secondary),
          "Okay"
        ),
        Button(
          "Cancel"
        )
      )
    )
    .buildU

  def apply() = component()
}
