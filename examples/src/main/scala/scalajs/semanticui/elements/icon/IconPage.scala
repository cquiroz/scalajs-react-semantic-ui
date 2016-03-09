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
    .componentDidMount { _ => Callback {
        val semReady = js.Dynamic.global.semantic.ready
        semReady()
        val iconReady = js.Dynamic.global.semantic.icon.ready
        iconReady()
      }
    }
    .buildU

  def apply() = component()
}