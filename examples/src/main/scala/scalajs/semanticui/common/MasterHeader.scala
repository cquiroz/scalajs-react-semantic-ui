package scalajs.semanticui.common

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object MasterHeader {
  case class Props(name: String, description: String)

  val component =  ReactComponentB[Props]("MasterHeader")
    .stateless
    .render_P(p =>
      <.div(
        ^.cls := "ui masthead vertical tab segment",
        <.div(
          ^.cls := "ui container",
          <.div(
            ^.cls := "introduction",
            <.h1(
              ^.cls := "ui header",
              p.name),
            <.div(
              ^.cls := "sub header",
              p.description
            )
          )
          /*,
          <.div(
            ^.cls := "ui two item stackable tabs menu",
            <.a(
              ^.cls := "active item",
              dataTab := "icons",
              "Icons"
            ),
            <.a(
              ^.cls := "item",
              dataTab :="definition",
              "Definition"
            )
          )*/
        )
      )
    ).build

  def apply(p: Props) = component(p)
}
