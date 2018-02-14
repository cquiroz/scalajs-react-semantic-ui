package react.semanticui.demo

import org.scalajs.dom
import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._, vdom.all._, extra.router._

@JSExportTopLevel("react.semanticui.demo.SUIMain")
object SUiMain {
  @JSExport
  def main(): Unit = {
    val container =
      dom.document.getElementById("app")

    Router(BaseUrl.fromWindowOrigin_/, Routing.config)().renderIntoDOM(
      container
    )

    ()
  }
}

sealed trait ElementItem
case object IconsElement extends ElementItem

sealed trait Page
case object Home extends Page
case class Element(e: ElementItem) extends Page

object Routing {
  val config: RouterConfig[Page] = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      trimSlashes
        | staticRoute(root, Home) ~>
          render(HomeComponent.apply)
    ).notFound(redirectToPage(Home)(Redirect.Replace))
      .renderWith(layout)
      .logToConsole
  }

  private def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(Layout.Props(c, r))
}
