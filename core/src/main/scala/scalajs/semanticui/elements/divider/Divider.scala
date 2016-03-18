package scalajs.semanticui.elements.divider

import japgolly.scalajs.react.{ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

object Divider {
  case class Props(vertical: Boolean = false)

  def component = ReactComponentB[Props]("Divider")
    .renderPC((_, p, c) =>
      <.div(
        ^.cls := "ui divider",
        ^.classSet(
          "vertical" -> p.vertical
        ),
        c
      )
    ).build

  def apply(children: ReactNode*) = component(Props(), children: _*)
  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
}
