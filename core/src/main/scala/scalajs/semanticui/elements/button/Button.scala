package scalajs.semanticui.elements.button

import japgolly.scalajs.react.{Callback, ReactComponentB, ReactNode}
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js.UndefOr
import scala.scalajs.js

object Button {
  sealed trait ButtonState
  case object Active extends ButtonState
  case object Inactive extends ButtonState

  case class Props(state: ButtonState, onClick: Callback = Callback.empty)

  def component = ReactComponentB[Props]("Button")
    .renderPC((_, p, c) =>
      <.button(
        ^.cls := "ui button",
        ^.classSet(
          "active" -> (p.state == Active)
        ),
        ^.onClick --> p.onClick,
        c
      )
    ).build

  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
}
