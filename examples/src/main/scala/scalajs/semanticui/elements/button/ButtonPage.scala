package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

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

  def component = ReactComponentB[Unit]("ButtonPage")
    .initialState(State(Button.Inactive, "Text"))
    .renderBackend[Backend]
    .buildU

  def apply() = component()
}

object AnotherExample {

  def component = ReactComponentB[Unit]("ButtonPage")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "another example",
        <.div(
          ^.cls := "ui ignored warning message",
          "Although any tag can be used for a button, it will only be ",
          <.a(
            ^.href := "http://webaim.org/techniques/keyboard/tabindex",
            " keyboard focusable"),
          "if you use a ",
          <.code("<button>"),
          "tag or you add the property ",
          <.code("""tabindex="0""""),
          ". Keyboard accessible buttons will preserve focus styles after click, which may be visually jarring."
        ),
        <.p("A standard button"),
        Button(
          "Button"
        ),
        Button(
          Button.Props(tabIndex = Some(0)),
          "Focusable"
        )
      )
    )
    .buildU

  def apply() = component()
}

object ButtonPage {

  def component = ReactComponentB[Unit]("ButtonPage")
    .render(_ =>
      <.div(
        ^.cls := "main ui container",
        <.h2(
          ^.cls := "ui dividing header",
          "Types"
        ),
        FollowExample(),
        AnotherExample()
      )
    )
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