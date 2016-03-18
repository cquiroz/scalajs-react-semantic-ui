package scalajs.semanticui.common

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

object SideBarItem {
  case class Props(link: String, name: String)

  val component =  ReactComponentB[Props]("SideBarSection")
    .stateless
    .render_P(p =>
      <.a(
        ^.cls := "item",
        ^.href := p.link,
        p.name
      )
    ).build

  def apply(p: Props) = component(p)
}

object SideBarSection {
  case class Props(title: String, items: List[(String, String)])

  val component =  ReactComponentB[Props]("SideBarSection")
    .stateless
    .render_P(p =>
      <.div(
        ^.cls := "item",
        <.div(
          ^.cls := "header",
          p.title
        ),
        <.div(
          ^.cls := "menu",
          p.items.map {
            case (x, y) => SideBarItem(SideBarItem.Props(x, y))
          }
        )
      )
    ).build

  def apply(p: Props) = component(p)
}

object SideBarHead {
  val component = ReactComponentB[Unit]("SideBarHead")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "item",
        <.a(
          ^.cls := "ui logo icon image",
          ^.href := "/",
          <.img(
            ^.src := "images/logo.png"
          )
        ),
        <.a(
          ^.href := "/",
          <.b("UI Docs")
        )
      )
    ).buildU

  def apply() = component()
}

object SideBar {
  case class Props(sticky: Boolean, sidebar: Boolean, id: Option[String])

  val component =  ReactComponentB[Props]("SideBar")
      .stateless
      .render_P(p =>
        <.div(
          ^.cls := "ui vertical inverted menu",
          ^.classSet(
            "sticky"  -> p.sticky,
            "sidebar" -> p.sidebar
          ),
          ^.id := p.id,
          SideBarHead(),
          SideBarSection(SideBarSection.Props("Elements", List(
            "/elements/button.html" -> "Button",
            "/elements/container.html" -> "Container",
            "/elements/divider.html" -> "Divider",
            "/elements/flag.html" -> "Flag",
            "/elements/header.html" -> "Header",
            "/elements/icon.html" -> "Icon",
            "/elements/image.html" -> "Image",
            "/elements/input.html" -> "Input",
            "/elements/label.html" -> "Label",
            "/elements/list.html" -> "List",
            "/elements/loader.html" -> "Loader",
            "/elements/rail.html" -> "Rail",
            "/elements/reveal.html" -> "Reveal",
            "/elements/segment.html" -> "Segment",
            "/elements/step.html" -> "Step",
            "/introduction/build-tools.html" -> "Build Tools",
            "/introduction/advanced-usage.html" -> "Recipes",
            "/introduction/glossary.html" -> "Glossary"
          ))),
          SideBarSection(SideBarSection.Props("Collections", List(
            "/collections/breadcrumb.html" -> "Breadcrumb",
            "/collections/form.html" -> "Form",
            "/collections/grid.html" -> "Grid",
            "/collections/menu.html" -> "Menu",
            "/collections/message.html" -> "Message",
            "/collections/table.html" -> "Table"
          ))),
          SideBarSection(SideBarSection.Props("Views", List(
            "/views/advertisement.html" -> "Advertisement",
            "/views/card.html" -> "Card",
            "/views/comment.html" -> "Comment",
            "/views/feed.html" -> "Feed",
            "/views/item.html" -> "Item",
            "/views/statistic.html" -> "Statistic"
          ))),
          SideBarSection(SideBarSection.Props("Modules", List(
            "/modules/accordion.html" -> "Accordion",
            "/modules/checkbox.html" -> "Checkbox",
            "/modules/dimmer.html" -> "Dimmer",
            "/modules/dropdown.html" -> "Dropdown",
            "/modules/embed.html" -> "Embed",
            "/modules/modal.html" -> "Modal",
            "/modules/nag.html" -> "Nag",
            "/modules/popup.html" -> "Popup",
            "/modules/progress.html" -> "Progress",
            "/modules/rating.html" -> "Rating",
            "/modules/search.html" -> "Search",
            "/modules/shape.html" -> "Shape",
            "/modules/sidebar.html" -> "Sidebar",
            "/modules/sticky.html" -> "Sticky",
            "/modules/tab.html" -> "Tab",
            "/modules/transition.html" -> "Transition"
          )))
        )
      ).build
  def apply(p: Props) = component(p)
}
