package scalajs.semanticui

import japgolly.scalajs.react.ReactDOM

import scala.scalajs.js.JSApp
import org.scalajs.dom

import scalajs.semanticui.common.{Footer, MasterHeader}
import scalajs.semanticui.elements.button.ButtonPage
import scalajs.semanticui.elements.icon.IconPage

@scala.scalajs.js.annotation.JSExport("ExampleApp")
object ExampleApp extends JSApp {
  override def main(): Unit = {
    //ReactDOM.render(IconPage(), dom.document.getElementById("example-icons-payment"))
    //ReactDOM.render(ButtonPage(), dom.document.getElementById("example-buttons"))
    //ReactDOM.render(MasterHeader(), dom.document.getElementById("master-header"))
    ReactDOM.render(Footer(), dom.document.getElementById("footer"))
  }
}
