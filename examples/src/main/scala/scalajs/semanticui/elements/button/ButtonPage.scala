package scalajs.semanticui.elements.button

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js

object ButtonPage {

  def component = ReactComponentB[Unit]("ButtonPage")
    .render(_ =>
      <.div(
        ^.cls := "main ui container",
        <.h2(
          ^.cls := "ui dividing header",
          "Types"
        ),
        FollowExample(),
        AnotherExample(),
        PrimaryEmphasisExample(),
        SecondaryEmphasisExample(),
        AnimatedExample(),
        IconExample(),
        BasicButtonExample(),
        ColorButtonExample(),
        InvertedColorButtonExample(false),
        InvertedColorButtonExample(true),
        <.h2(
          ^.cls := "ui dividing header",
          "Groups"
        )
      )
    )
    .componentDidMount { _ => Callback {
        val semReady = js.Dynamic.global.semantic.ready
        //semReady()
        val buttonReady = js.Dynamic.global.semantic.button.ready
        //buttonReady()
      }
    }
    .buildU

  def apply() = component()
}