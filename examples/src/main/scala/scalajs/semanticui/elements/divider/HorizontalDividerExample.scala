package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.common.ShortParagraph
import scalajs.semanticui.elements.icon.Icon

object HorizontalDividerExample {

  def component = ReactComponentB[Unit]("HorizontalDividerExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          "Horizontal Divider"
        ),
        <.p("A divider can segment content horizontally"),
        <.div(
          ^.cls := "ignored ui message",
          "Horizontal dividers can also be used in combination with ",
          <.a(
            ^.href := "/elements/header.html",
            "headers"),
          " and ",
          <.a(
            ^.href := "/elements/icon.html",
            "icons"),
          " to create different styles of dividers."
        ),
        <.div(
          ^.cls := "ignored ui info message",
          "Dividers will automatically vary the size of their dividing rules to match the length of your text"
        ),
        <.div(
          ^.cls := "ui center aligned basic segment",
          <.div(
            ^.cls := "ui left icon action input",
            Icon("search"),
            <.input(
              ^.`type` :="text",
              ^.placeholder := "Order #"
            ),
            <.div(
              ^.cls := "ui blue submit button",
              "Search"
            )
          ),
          Divider(Divider.Props(horizontal = true), "Or"),
          <.div(
            ^.cls := "ui teal labeled icon button",
            "Create New Order",
            Icon("add")
          )
        )
      )
    )
    .buildU

  def apply() = component()
}
