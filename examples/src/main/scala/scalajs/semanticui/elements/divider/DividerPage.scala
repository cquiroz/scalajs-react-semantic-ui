package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object DividerPage {

  def component = ReactComponentB[Unit]("DividerPage")
    .render(_ =>
      <.div(
        ^.cls := "main ui container",
        <.h2(
          ^.cls := "ui dividing header",
          "Types"
        ),
        DividerExample(),
        VerticalDividerExample(),
        AnotherVerticalDividerExample(),
        HorizontalDividerExample(),
        AnotherHorizontalDividerExample()
      )
    )
    .buildU

  def apply() = component()
}
