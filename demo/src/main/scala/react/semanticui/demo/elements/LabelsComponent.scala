package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icons.{IconNewspaper, IconDelete}
import react.semanticui.elements.label.{Label, LabelDetail}
import react.semanticui.colors._

object LabelsComponent {
  def section(title: String, description: String)(items: TagMod): TagMod =
    <.div(
      ^.cls := "equal width row",
      <.div(
        ^.cls := "ui padded one column grid",
        <.div(
          ^.cls := "column",
          <.h2(
            ^.cls := "ui header",
            title
          ),
          <.p(description)
        ),
        <.div(
          ^.cls := "center aligned column",
          <.div(
            ^.cls := "ui doubling five column grid",
            items
          )
        )
      )
    )

  private val component =
    ScalaComponent
      .builder[Unit]("Labels")
      .render { _ =>
        <.div(
          ^.cls := "ui grid",
          <.div(
            ^.cls := "equal width row",
            <.div(
              ^.cls := "column",
              <.h1(
                ^.cls := "ui header",
                "Labels",
                <.div(
                  ^.cls := "sub header",
                  "A label displays content classification."
                )
              )
            )
          ),
          section("Samples", "A label") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              Label(Label.props(), IconNewspaper, "23")
            )
          },
          section("Image", "As a link and an image") {
            List(
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(as = "a", image = true),
                  <.img(
                    ^.src := WebpackResources.AdaAvatar.resource
                  ),
                  "Ade"
                )
              ),
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(as = "a", image = true, color = Blue),
                  <.img(
                    ^.src := WebpackResources.AdaAvatar.resource
                  ),
                  "Ade",
                  LabelDetail(LabelDetail.props(), "Friend")
                )
              ),
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(as = "a", image = true),
                  <.img(
                    ^.src := WebpackResources.AdaAvatar.resource
                  ),
                  "Ade",
                  IconDelete
                )
              )
            ).toTagMod
          },
          section("Tag", "A label can be formated as a tag") {
            List(
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(as = "a", tag = true),
                  "New"
                )
              ),
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(color = Red, as = "a", tag = true),
                  "Upcoming"
                )
              ),
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(color = Teal, as = "a", tag = true),
                  "Featured"
                )
              )
            ).toTagMod
          },
          section("Callback", "A label can have a callback") {
            List(
              <.div(
                ^.cls := "column docs-icon-set-column",
                Label(Label.props(as = "a", onClick = (e: ReactMouseEvent, p: Label.LabelProps) => Callback.log(s"${e.screenX} $p")),
                  "Callback"
                )
              )
            ).toTagMod
          }
        )
      }
      .build

  def apply() = component()
}
