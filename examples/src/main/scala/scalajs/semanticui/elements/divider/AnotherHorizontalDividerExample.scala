package scalajs.semanticui.elements.divider

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.icon.Icon

object AnotherHorizontalDividerExample {

  def component = ReactComponentB[Unit]("AnotherHorizontalDividerExample")
    .stateless
    .render(_ =>
      // TODO Figure out a way te make a divider displayed with another tag, e.g. h4
      <.div(
        ^.cls := "another example",
        <.h4(
          ^.cls := "ui horizontal divider header",
          Icon("tag"),
          "Description"
        ),
        <.p("Doggie treats are good for all times of the year. Proven to be eaten by 99.9% of all dogs worldwide."),
        <.h4(
          ^.cls := "ui horizontal divider header",
          Icon("bar chart"),
          "Specifications"
        ),
        <.table(
          ^.cls := "ui definition table",
          <.tbody(
            <.tr(
              <.td(
                ^.cls := "two wide column",
                "Size"
              ),
              <.td("""1" x 2"""")
            ),
            <.tr(
              <.td(
                "Weight"
              ),
              <.td("6 ounces")
            ),
            <.tr(
              <.td(
                "Color"
              ),
              <.td("Yellowish")
            ),
            <.tr(
              <.td(
                "Odor"
              ),
              <.td("Not Much Usually")
            )
          )
        )
      )
    )
    .buildU

  def apply() = component()
}
