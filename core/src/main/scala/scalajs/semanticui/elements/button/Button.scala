package scalajs.semanticui.elements.button

import japgolly.scalajs.react.{Callback, ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

object Button {
  sealed trait ButtonState
  case object Active extends ButtonState
  case object Inactive extends ButtonState

  case class Props(state: ButtonState = Inactive, tabIndex: Option[Int] = None, onClick: Callback = Callback.empty)

  def component = ReactComponentB[Props]("Button")
    .renderPC((_, p, c) =>
      <.button(
        ^.cls := "ui button",
        ^.tabIndex := p.tabIndex,
        ^.classSet(
          "active" -> (p.state == Active)
        ),
        ^.onClick --> p.onClick,
        c
      )
    ).build

  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
  def apply(text: String) = component(Props(), text)
}
