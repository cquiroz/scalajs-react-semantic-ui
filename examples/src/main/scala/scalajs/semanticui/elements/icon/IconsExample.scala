package scalajs.semanticui.elements.icon

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

object IconsExample {

  case class Props(icons: List[(String, String)], title: String, description: String)

  def component = ReactComponentB[Props]("IconsPage")
    .stateless
    .render_P(p =>
      <.div(
        ^.cls := "icon example",
        <.h4(
          ^.cls := "ui header",
          p.title),
        <.p(p.description),
        <.div(
          ^.cls := "ui doubling five column grid",
          p.icons.map { case (i, n) =>
            <.div(
              ^.cls := "column",
              Icon(i),
              n
            )
          }
        ),
        <.div(
          ^.cls := "existing code",
          p.icons.map { case (i, n) =>
            <.i(
              ^.cls := s"$i icon"
            )
          }
        )
      )
    )
    .build

  def apply(p: Props) = component(p)
}
