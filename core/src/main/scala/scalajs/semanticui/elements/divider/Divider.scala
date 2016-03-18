package scalajs.semanticui.elements.divider

import japgolly.scalajs.react.{ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

object Divider {
  def component = ReactComponentB[Unit]("Divider")
    .render_C(c =>
      <.div(
        ^.cls := "ui divider",
        c
      )
    ).buildU

  def apply(children: ReactNode*) = component(children: _*)
}
