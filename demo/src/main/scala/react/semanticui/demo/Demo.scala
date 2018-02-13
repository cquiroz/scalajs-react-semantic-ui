package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import scala.scalajs.js
import js.annotation._

@JSImport("images/logo.png", JSImport.Default)
@js.native
object Logo extends js.Object

object Demo {

  private val component =
    ScalaComponent
      .builder[Unit]("Demo")
      .render { _ =>
        <.div(
          ^.cls := "app",
          <.div(
            ^.cls := "menu",
            ^.cls := "ui inverted vertical left fixed menu",
            <.div(
              ^.cls :="item",
              <.img(
                ^.src := Logo.asInstanceOf[String],
                ^.cls := "ui mini right spaced image"
              ),
              <.strong(
                "ScalaJS SUI React ",
                <.small(
                  <.em("0.0.1")
                )
              )
            )
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
