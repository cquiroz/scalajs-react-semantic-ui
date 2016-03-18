package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object DividerExample {

  def component = ReactComponentB[Unit]("AnimatedExample")
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
        <.img(
          ^.cls := "ui wireframe image",
          ^.src := "images/wireframe/short-paragraph.png"
        ),
        Divider(),
        <.img(
          ^.cls := "ui wireframe image",
          ^.src := "images/wireframe/short-paragraph.png"
        )
      )
    )
    .buildU

  def apply() = component()
}
