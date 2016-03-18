package scalajs.semanticui.elements.icon

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object IconPage {
  def component = ReactComponentB[Unit]("IconSets")
    .render(_ =>
      <.div(
        ^.cls := "main ui container",
        IconSets(),
        IconDefinitions())
    )
    .buildU

  def apply() = component()
}