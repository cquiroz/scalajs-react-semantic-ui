package scalajs.semanticui

import japgolly.scalajs.react.ReactDOM

import scala.scalajs.js.JSApp
import org.scalajs.dom

import scalajs.semanticui.components.{IconPage, IconSets}

@scala.scalajs.js.annotation.JSExport("ExampleApp")
object ExampleApp extends JSApp {
  override def main(): Unit = {
    ReactDOM.render(IconPage(), dom.document.getElementById("example-icons-payment"))
  }
}
