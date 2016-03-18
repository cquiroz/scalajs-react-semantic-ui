package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object FittedExample {

  def component = ReactComponentB[Unit]("InvertedExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Fitted"
        ),
        <.p("A divider can be fitted, without any space above or below it."),
        <.div(
          ^.cls := "ui segment",
          "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattiseros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.",
          Divider(Divider.Props(fitted = true)),
          "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattiseros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede."
        )
      )
    )
    .buildU

  def apply() = component()
}
