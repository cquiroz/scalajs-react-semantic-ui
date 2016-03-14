package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js
import scalajs.semanticui.elements.icon.{IconDefinitions, IconSets}

object ButtonPage {
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
        ^.cls := "main ui container",
        <.h2(
          ^.cls := "ui dividing header",
          "Types"
        ),
        <.div(
          ^.cls := "follow example",
          <.h4(
            ^.cls := "ui header",
            "Button"
          ),
          <.p("A standard button"),
          Button(
            Button.Props(
              s.s,
              onClick = click),
            s.text
          )
        )
      )
    }
  }

  def component = ReactComponentB[Unit]("ButtonPage")
    .initialState(State(Button.Inactive, "Text"))
    .renderBackend[Backend]
    .componentDidMount { _ => Callback {
        val semReady = js.Dynamic.global.semantic.ready
        //semReady()
        val buttonReady = js.Dynamic.global.semantic.button.ready
        //buttonReady()
      }
    }
    .buildU

  def apply() = component()
}