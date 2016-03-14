package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object FollowExample {
  case class State(s: Button.ButtonState, t: String) {
    def text: String = s match {
      case Button.Inactive => "Follow"
      case Button.Active   => "Following"
    }

    def flip = s match {
      case Button.Inactive => copy(s = Button.Active)
      case Button.Active   => copy(s = Button.Inactive)
    }

  }

  class Backend($: BackendScope[Unit, State]) {
    def click = $.modState(s => s.flip)

    def render(s: State) = {
      <.div(
        ^.cls := "follow example",
        <.h4(
          ^.cls := "ui header",
          "Button"
        ),
        Button(
          Button.Props(
            s.s,
            onClick = click),
          s.text
        )
      )
    }
  }

  def component = ReactComponentB[Unit]("FollowExample")
    .initialState(State(Button.Inactive, "Text"))
    .renderBackend[Backend]
    .buildU

  def apply() = component()
}
