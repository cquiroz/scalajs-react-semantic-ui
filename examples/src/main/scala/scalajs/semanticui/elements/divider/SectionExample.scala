package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object SectionExample {

  def component = ReactComponentB[Unit]("InvertedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Section"
        ),
        <.p("A divider can provide greater margins to divide sections of content"),
        <.h3(
          ^.cls :="ui header",
          "Section One"
        ),
        ShortParagraph(),
        Divider(Divider.Props(section = true)),
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
