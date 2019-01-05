package react.semanticui.demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import react.semanticui.elements.icon._
import react.semanticui.sizes._
import react.semanticui.sizes
import react.semanticui.colors

object IconsComponent {
  val IconMailOutline     = Icon(Icon.props(name = "mail outline"))
  val IconSearch          = Icon(Icon.props(name = "search"))
  val IconFeed            = Icon(Icon.props(name = "feed"))
  val IconCloudUpload     = Icon(Icon.props(name = "cloud upload"))
  val IconEdit            = Icon(Icon.props(name = "edit"))
  val IconDashboard       = Icon(Icon.props(name = "dashboard"))
  val IconNewspaper       = Icon(Icon.props(name = "newspaper"))
  val IconAreaChart       = Icon(Icon.props(name = "area chart"))
  val IconTwitter         = Icon(Icon.props(name = "twitter"))
  val IconAdd             = Icon(Icon.props(name = "add"))
  val IconCircleThin      = Icon(Icon.props(name = "circle thin"))
  val IconUser            = Icon(Icon.props(name = "user"))
  private val sampleIcons = Map("mail outline" -> IconMailOutline, "search" -> IconSearch)

  def section(title: String, description: String)(icons: TagMod): TagMod =
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
            icons
          )
        )
      )
    )

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
          section("Samples", "An icon set contains an arbitrary number of glyphs.") {
            sampleIcons.map {
              case (name, icon) =>
                <.div(
                  ^.cls := "column docs-icon-set-column",
                  icon.size(Big),
                  <.p(
                    ^.cls := "name",
                    name
                  )
                ),
            }.toTagMod
          },
          section("Sizes", "An icon can vary in size") {
            sizes.all.map {
              case s =>
                <.div(
                  ^.cls := "column docs-icon-set-column",
                  IconFeed.size(s),
                  <.p(
                    ^.cls := "name",
                    s.value
                  )
                ),
            }.toTagMod
          },
          section("Flipped", "An icon can be flipped") {
            List(Horizontally, Vertically).map {
              case o =>
                <.div(
                  ^.cls := "column docs-icon-set-column",
                  IconCloudUpload.flipped(o),
                  <.p(
                    ^.cls := "name",
                    o.value
                  )
                )
            }.toTagMod
          },
          section("Colors", "Icons support colors") {
            colors.all.map {
              case o =>
                <.div(
                  ^.cls := "column docs-icon-set-column",
                  IconEdit.color(o),
                  <.p(
                    ^.cls := "name",
                    o.value
                  )
                ),
            }.toTagMod
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
              Icon.Group(Icon.Group.props(size = Huge), IconCircleThin.size(Big), IconUser),
              <.p(
                ^.cls := "name",
                "icon group"
              )
            )
          },
          section("Corner Icon", "An icon can be in a corner") {
            <.div(
              ^.cls := "column docs-icon-set-column",
              Icon.Group(
                Icon.Group.props(size = Large,
                                 children = <.div(
                                   IconTwitter,
                                   IconAdd.corner
                                 ): VdomNode)),
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
