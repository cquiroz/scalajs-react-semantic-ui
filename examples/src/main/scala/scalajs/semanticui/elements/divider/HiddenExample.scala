package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object HiddenExample {

  def component = ReactComponentB[Unit]("InvertedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Hidden"
        ),
        <.p("A hidden divider divides content without creating a dividing line"),
        <.h3(
          ^.cls :="ui header",
          "Section One"
        ),
        ShortParagraph(),
        Divider(Divider.Props(hidden = true)),
        <.h3(
          ^.cls :="ui header",
          "Section Two"
        ),
        ShortParagraph()
      )
    )
    .buildU

  def apply() = component()
}
