package scalajs.semanticui.elements.icon

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{ReactComponentB, ReactNode}

object IconExample {
  case class Props(header: String, description: String, inverted: Boolean = false)

  def component = ReactComponentB[Props]("IconExample")
    .stateless
    .renderPC((_, p, c) =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          p.header),
        <.p(p.description),
        if (p.inverted) <.div(
          ^.cls := "ui inverted segment",
          c) else c
      )
    ).build

  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
}
