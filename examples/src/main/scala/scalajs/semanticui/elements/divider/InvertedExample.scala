package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object InvertedExample {

  def component = ReactComponentB[Unit]("InvertedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Inverted"
        ),
        <.p("A divider can have its colors inverted"),
        <.div(
          ^.cls := "ui inverted segment",
          ShortParagraph(),
          Divider(Divider.Props(inverted = true)),
          ShortParagraph(),
          // TODO Have a divider with h4 tag
          <.h4(
            ^.cls := "ui horizontal inverted divider",
            "Horizontal")
        )
      )
    )
    .buildU

  def apply() = component()
}
