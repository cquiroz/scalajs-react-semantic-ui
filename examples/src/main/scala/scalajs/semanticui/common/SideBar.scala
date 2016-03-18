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
  /*<!--div class="item">
    <a class="ui logo icon image" href="/">
      <img src="images/logo.png">
    </a>
    <a href="/"><b>UI Docs</b></a>
  </div>
  "/introduction/getting-started.html" -> "<",b>Getting Started</b>
  </a>
  <div class="item">
    <div class="header">Introduction</div>
    <div class="menu">

        <a class="item" href="/introduction/integrations.html">
          Integrations
        </a>

        <a class="item" href="/introduction/build-tools.html">
          Build Tools
        </a>

        <a class="item" href="/introduction/advanced-usage.html">
          Recipes
        </a>

        <a class="item" href="/introduction/glossary.html">
          Glossary
        </a>

    </div>
  </div>
  <div class="item">
    <div class="header">Usage</div>
    <div class="menu">

        <a class="item" href="/usage/theming.html">
          Theming
        </a>

        <a class="item" href="/usage/layout.html">
          Layouts
        </a>

    </div>
  </div>
  <div class="item">
    <div class=" header">Globals</div>
    <div class="menu">

        <a class="item" href="/globals/reset.html">
          Reset

        </a>

        <a class="item" href="/globals/site.html">
          Site

        </a>

    </div>
  </div>
  <div class="item">
    <div class="active  header">Elements</div>
    <div class="menu">

        <a class="active item" href="/elements/button.html">
          Button

        </a>

        <a class="item" href="/elements/container.html">
          Container

        </a>

        <a class="item" href="/elements/divider.html">
          Divider

        </a>

        <a class="item" href="/elements/flag.html">
          Flag

        </a>

        <a class="item" href="/elements/header.html">
          Header

        </a>

        <a class="item" href="/elements/icon.html">
          Icon

        </a>

        <a class="item" href="/elements/image.html">
          Image

        </a>

        <a class="item" href="/elements/input.html">
          Input

        </a>

        <a class="item" href="/elements/label.html">
          Label

        </a>

        <a class="item" href="/elements/list.html">
          List

        </a>

        <a class="item" href="/elements/loader.html">
          Loader

        </a>

        <a class="item" href="/elements/rail.html">
          Rail

        </a>

        <a class="item" href="/elements/reveal.html">
          Reveal

        </a>

        <a class="item" href="/elements/segment.html">
          Segment

        </a>

        <a class="item" href="/elements/step.html">
          Step

        </a>

    </div>
  </div>
  <div class="item">
    <div class=" header">Collections</div>
    <div class="menu">

        <a class="item" href="/collections/breadcrumb.html">
          Breadcrumb

        </a>

        <a class="item" href="/collections/form.html">
          Form

        </a>

        <a class="item" href="/collections/grid.html">
          Grid

        </a>

        <a class="item" href="/collections/menu.html">
          Menu

        </a>

        <a class="item" href="/collections/message.html">
          Message

        </a>

        <a class="item" href="/collections/table.html">
          Table

        </a>

    </div>
  </div>
  <div class="item">
    <div class=" header">Views</div>
    <div class="menu">

        <a class="item" href="/views/advertisement.html">
          Advertisement

        </a>

        <a class="item" href="/views/card.html">
          Card

        </a>

        <a class="item" href="/views/comment.html">
          Comment

        </a>

        <a class="item" href="/views/feed.html">
          Feed

        </a>

        <a class="item" href="/views/item.html">
          Item

        </a>

        <a class="item" href="/views/statistic.html">
          Statistic

        </a>

    </div>
  </div>
  <div class="item">
    <div class=" header">Modules</div>
    <div class="menu">

        <a class="item" href="/modules/accordion.html">
          Accordion

        </a>

        <a class="item" href="/modules/checkbox.html">
          Checkbox

        </a>

        <a class="item" href="/modules/dimmer.html">
          Dimmer

        </a>

        <a class="item" href="/modules/dropdown.html">
          Dropdown

        </a>

        <a class="item" href="/modules/embed.html">
          Embed

        </a>

        <a class="item" href="/modules/modal.html">
          Modal

        </a>

        <a class="item" href="/modules/nag.html">
          Nag

        </a>

        <a class="item" href="/modules/popup.html">
          Popup

        </a>

        <a class="item" href="/modules/progress.html">
          Progress

        </a>

        <a class="item" href="/modules/rating.html">
          Rating

        </a>

        <a class="item" href="/modules/search.html">
          Search

        </a>

        <a class="item" href="/modules/shape.html">
          Shape

        </a>

        <a class="item" href="/modules/sidebar.html">
          Sidebar

        </a>

        <a class="item" href="/modules/sticky.html">
          Sticky

        </a>

        <a class="item" href="/modules/tab.html">
          Tab

        </a>

        <a class="item" href="/modules/transition.html">
          Transition

        </a>

    </div>
  </div>
  <div class="item">
    <div class=" header">Behaviors</div>
    <div class="menu">

        <a class="item" href="/behaviors/api.html">
          API

        </a>

        <a class="item" href="/behaviors/form.html">
          Form Validation

        </a>

        <a class="item" href="/behaviors/visibility.html">
          Visibility

        </a>

    </div>
  </div>
  </div*/
}
