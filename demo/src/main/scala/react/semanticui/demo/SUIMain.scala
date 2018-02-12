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

sealed trait Page
case object Home extends Page

object Routing {
  val config: RouterConfig[Page] = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      trimSlashes
        | staticRoute(root, Home) ~>
          renderR(renderDemoDefault)
    ).notFound(redirectToPage(Home)(Redirect.Replace))
      .renderWith((page, router) => layout(page, router))
  }

  private def renderDemoDefault(router: RouterCtl[Page]): VdomElement =
    Demo()

  private def layout(c: RouterCtl[Page], r: Resolution[Page]) = r.render()
}
