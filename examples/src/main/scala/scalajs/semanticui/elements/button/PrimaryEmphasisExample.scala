package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.button.Button.Primary
import scalajs.semanticui.common._

object PrimaryEmphasisExample {

  def component = ReactComponentB[Unit]("EmphasisExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another example",
        dataClass := "primary, secondary",
        <.h4(
          ^.cls := "ui header",
          "Emphasis"
        ),
        <.p("A button can be formatted to show different levels of emphasis"),
        <.div(
          ^.cls := "ui ignored info message",
          "Setting your brand colors to primary and secondary color variables in ",
          <.a(
            ^.href := "/usage/theming.html",
            <.code("site.variables")
          ),
          " will allow you to use your color theming for UI elements"
        ),
        Button(
          Button.Props(emphasis = Primary),
          "Save"
        ),
        Button(
          "Discard"
        )
      )
    )
    .buildU

  def apply() = component()
}
