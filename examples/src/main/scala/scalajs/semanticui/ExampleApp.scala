package scalajs.semanticui

import japgolly.scalajs.react.ReactDOM

import scala.scalajs.js.JSApp
import org.scalajs.dom
import org.scalajs.dom.ext._

import scalajs.semanticui.common.{Footer, MasterHeader, SideBar, SideBarSection}
import scalajs.semanticui.elements.button.ButtonPage
import scalajs.semanticui.elements.icon.IconPage

@scala.scalajs.js.annotation.JSExport("ExampleApp")
object ExampleApp extends JSApp {
  override def main(): Unit = {
    //ReactDOM.render(IconPage(), dom.document.getElementById("example-icons-payment"))
    //ReactDOM.render(ButtonPage(), dom.document.getElementById("example-buttons"))
    //ReactDOM.render(MasterHeader(), dom.document.getElementById("master-header"))
    ReactDOM.render(SideBar(SideBar.Props(sticky = false, sidebar = true, Some("toc"))), dom.document.getElementById("menu-toc"))
    dom.document.getElementsByClassName("toc").foreach(ReactDOM.render(SideBar(SideBar.Props(sticky = true, sidebar = false, None)), _))
    ReactDOM.render(Footer(), dom.document.getElementById("footer"))
  }
}
