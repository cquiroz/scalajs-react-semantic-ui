package scalajs.semanticui.elements.icon

import japgolly.scalajs.react.{ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

object Icon {
  case class Props(id: String, disabled: Boolean = false)

  def component = ReactComponentB[Props]("Icon")
    .stateless
    .renderPC((_, p, c) =>
      <.i(
        ^.cls := s"${p.id} icon",
        ^.classSet(
          "disabled" -> p.disabled
        ),
        c
      )
    )
    .build


  def apply(id: String, children: ReactNode*) = component(Props(id), children: _*)
  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
}
