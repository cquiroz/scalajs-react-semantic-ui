package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon._

object HomeComponent {

  private val component =
    ScalaComponent
      .builder[Unit]("Home")
      .render { _ =>
        <.div(
          ^.cls := "body",
          "ScalaJS React Semantic UI",
          Icon(Icon.props(name = "browser"))
        )
      }
      .build

  def apply() = component()
}
