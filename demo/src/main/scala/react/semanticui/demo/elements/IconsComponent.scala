package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.icons._
import react.semanticui.sizes._

object IconsComponent {
  private val sampleIcons = Map("mail outline" -> MailOutline, "search" -> Search)

  private val component =
    ScalaComponent
      .builder[Unit]("Home")
      .render { _ =>
        <.div(
          ^.cls := "ui grid",
          <.div(
            ^.cls := "equal width row",
            <.div(
              ^.cls := "column",
              <.h1(
                ^.cls := "ui header",
                "Icons",
                <.div(
                  ^.cls := "sub header",
                  "An icon is a glyph used to represent something else."
                )
              )
            )
          ),
          <.div(
            ^.cls := "equal width row",
            <.div(
              ^.cls := "ui padded one column grid",
              <.div(
                ^.cls := "column",
                <.h2(
                  ^.cls := "ui header",
                   "Icon Set"
                ),
                <.p("An icon set contains an arbitrary number of glyphs.")
              ),
              <.div(
                ^.cls := "center aligned column",
                <.div(
                  ^.cls := "ui doubling five column grid",
                  <.div(
                    ^.cls := "sixteen wide column",
                    <.h3(
                      ^.cls := "ui dividing left aligned header",
                      "Samples"
                    )
                  ),
                  sampleIcons.map {
                    case (name, icon) =>
                      <.div(
                        ^.cls := "column docs-icon-set-column",
                        icon.withSize(Big),
                        <.p(
                          ^.cls := "name",
                          name
                        )
                      ),
                  }.toTagMod
                )
              )
            )
          )
        )
      }
      .build

  def apply() = component()
}
