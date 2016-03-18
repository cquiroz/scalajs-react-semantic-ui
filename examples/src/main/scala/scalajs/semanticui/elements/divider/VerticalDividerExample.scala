package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph

object VerticalDividerExample {

  def component = ReactComponentB[Unit]("VerticalDividerExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Vertical Divider"
        ),
        <.p("A divider can segment content vertically"),
        <.div(
          ^.cls := "ignored ui message",
          "Vertical dividers requires ",
          <.code("position: relative"),
          " on the element that you would like to contain the divider"
        ),
        <.div(
          ^.cls := "ignored ui info message",
          "A vertical divider will automatically swap to a horizontal divider at mobile resolutions when used inside a ",
          <.a(
            ^.href := "/collections/grid.html#stackable-grid",
            <.code("stackable grid")
          )
        ),
        <.div(
          ^.cls := "ui three column very relaxed grid",
          <.div(
            ^.cls := "column",
            (0 until 4).map(_ => ShortParagraph())
          ),
          Divider(Divider.Props(vertical = true), "and"),
          <.div(
            ^.cls := "column",
            (0 until 4).map(_ => ShortParagraph())
          ),
          Divider(Divider.Props(vertical = true), "not"),
          <.div(
            ^.cls := "column",
            (0 until 4).map(_ => ShortParagraph())
          )
        )
      )
    )
    .buildU

  def apply() = component()
}
