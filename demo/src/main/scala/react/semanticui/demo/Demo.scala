package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object Demo {

  private val component =
    ScalaComponent
      .builder[Unit]("Demo")
      .render { _ =>
        <.div(
          ^.cls := "app",
          <.div(
            ^.cls := "menu",
            "Menu"
          ),
          <.div(
            ^.cls := "body",
            "Body"
          ),
          <.div(
            ^.cls := "footer",
            "Footer"
          )
        )
      }
      .build

  def apply() = component()
}
