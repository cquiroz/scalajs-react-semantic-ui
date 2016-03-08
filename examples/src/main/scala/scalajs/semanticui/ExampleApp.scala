package scalajs.semanticui

import japgolly.scalajs.react.ReactDOM

import scala.scalajs.js.JSApp
import org.scalajs.dom

import scalajs.semanticui.components.IconsPage

@scala.scalajs.js.annotation.JSExport("ExampleApp")
object ExampleApp extends JSApp {
  override def main(): Unit = {
    ReactDOM.render(IconsPage(), dom.document.getElementById("example-icons-payment"))
  }
}
