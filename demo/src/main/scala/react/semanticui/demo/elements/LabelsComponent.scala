package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon._
import react.semanticui.elements.icons.{IconDashboard, IconNewspaper, IconAreaChart}
import react.semanticui.elements.icons.{IconTwitter, IconDelete, IconAdd, IconCircleThin, IconUser}
import react.semanticui.elements.label.{Label, LabelDetail}
import react.semanticui.sizes._
// import react.semanticui.sizes
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
          section("Rotated", "Icons can be rotated") {
            List(Clockwise, CounterClockwise).map {
              case o =>
                <.div(
                  ^.cls := "column docs-icon-set-column",
                  IconDashboard.rotated(o),
                  <.p(
                    ^.cls := "name",
                    o.value
                  )
                ),
            }.toTagMod
          },
          section("Bordered", "Icons can have a border") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              IconNewspaper.bordered,
              <.p(
                ^.cls := "name",
                "bordered"
              )
            )
          },
          section("Circular", "Icons can be circular") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              IconAreaChart.circular,
              <.p(
                ^.cls := "name",
                "circular"
              )
            )
          },
          section("Icon Group", "Icons can be grouped") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              Icon.Group(Icon.Group.props(size = Huge),
                IconCircleThin.size(Big),
                IconUser
              ),
              <.p(
                ^.cls := "name",
                "icon group"
              )
            )
          },
          section("Corner Icon", "An icon can be in a corner") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              Icon.Group(Icon.Group.props(size = Large, children =
                <.div(
                  IconTwitter,
                  IconAdd.corner
                ): VdomNode
              )),
              <.p(
                ^.cls := "name",
                "icon group"
              )
            )
          }
        )
      }
      .build

  def apply() = component()
}
