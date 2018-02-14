package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.router._
import scala.scalajs.js
import js.annotation._

@JSImport("images/logo.png", JSImport.Default)
@js.native
object Logo extends js.Object

object Layout {
  final case class Props(c: RouterCtl[Page], r: Resolution[Page])

  private val component =
    ScalaComponent
      .builder[Props]("Demo")
      .render_P { p =>
        <.div(
          ^.cls := "app",
          <.div(
            ^.cls := "menu",
            ^.cls := "ui inverted vertical left fixed menu",
            <.div(
              ^.cls := "item",
              <.img(
                ^.cls := "ui mini right spaced image",
                ^.src := Logo.asInstanceOf[String]
              ),
              <.strong(
                "ScalaJS SUI React ",
                <.small(
                  <.em("0.0.1")
                )
              )
            ),
            <.div(
              ^.cls := "item",
              <.div(
                ^.cls := "header",
                "Elements"
              ),
              <.div(
                ^.cls := "item",
                "Icons"
              )
            )
          ),
          <.div(
            ^.cls := "body",
            p.r.render()
          ),
          <.div(
            ^.cls := "footer"
          )
        )
      }
      .build

  def apply(p: Props) = component(p)
}
