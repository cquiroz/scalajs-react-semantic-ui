package scalajs.semanticui.common

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object MasterHeader {

  val component =  ReactComponentB[Unit]("MasterHeader")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "ui masthead vertical tab segment",
        <.div(
          ^.cls := "ui container",
          <.div(
            ^.cls := "introduction",
            <.h1(
              ^.cls := "ui header",
              "Icon")
          ),
          <.div(
            ^.cls := "ui two item stackable tabs menu",
            <.a(
              ^.cls := "active item",
              dataTabAttr := "icons",
              "Icons"
            ),
            <.a(
              ^.cls := "item",
              dataTabAttr :="definition",
              "Definition"
            )
          )
        )
      )
    ).buildU

  def apply() = component()
}
