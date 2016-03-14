package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object AnotherExample {

  def component = ReactComponentB[Unit]("AnotherExample")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "example",
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
