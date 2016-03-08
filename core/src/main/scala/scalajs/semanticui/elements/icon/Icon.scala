package scalajs.semanticui.elements.icon

import japgolly.scalajs.react.{ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

object Icon {
  case class Props(id: String)

  def component = ReactComponentB[Props]("Icon")
    .stateless
    .renderPC((_, p, c) =>
      <.i(
        ^.cls := s"${p.id} icon",
        c
      )
    )
    .build


  def apply(id: String, children: ReactNode*) = component(Props(id), children: _*)
}
