package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object ClearingExample {

  def component = ReactComponentB[Unit]("InvertedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Clearing"
        ),
        <.p("A divider can clear the contents above it"),
        <.div(
          ^.cls :="ui segment",
          <.h2(
            ^.cls := "ui right floated header",
            "Floated Content"
          ),
          Divider(Divider.Props(clearing = true)),
          ShortParagraph()
        )
      )
    )
    .buildU

  def apply() = component()
}
