package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import scalajs.semanticui.common.ShortParagraph

object DividerExample {

  def component = ReactComponentB[Unit]("DividerExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Divider"
        ),
        <.p("A standard divider"),
        <.div(
          ^.cls := "ignored ui warning message",
          "To add a divider between parts of a grid use a ",
          <.a(
            ^.href := "/collections/grid.html#divided",
            <.code("divided grid")
          ),
          " variation."
        ),
        ShortParagraph(),
        Divider(),
        ShortParagraph()
      )
    )
    .buildU

  def apply() = component()
}
