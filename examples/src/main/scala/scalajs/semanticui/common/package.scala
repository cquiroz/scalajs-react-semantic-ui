package scalajs.semanticui

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

package object common {
  val dataTab   = "data-tab"  .reactAttr
  val dataClass = "data-class".reactAttr

  object ShortParagraph {
    def component = ReactComponentB[Unit]("ShortParagraphImg")
      .stateless
      .render( _ =>
        <.img(
          ^.cls := "ui wireframe image",
          ^.src := "images/wireframe/short-paragraph.png"
        )
      ).buildU

    def apply() = component()
  }
}
