package react.semanticui.elements.divider

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.common.style._
import react.semanticui.{ raw => suiraw }
import react.semanticui._

object Divider {
  @js.native
  @JSImport("semantic-ui-react", "Divider")
  private[semanticui] object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DividerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Divider can clear the content above it. */
    var clearing: js.UndefOr[Boolean] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Divider can be fitted without any space above or below it. */
    var fitted: js.UndefOr[Boolean] = js.native

    /** Divider can divide content without creating a dividing line. */
    var hidden: js.UndefOr[Boolean] = js.native

    /** Divider can segment content horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native

    /** Divider can have its colours inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Divider can provide greater margins to divide sections of content. */
    var section: js.UndefOr[Boolean] = js.native

    /** Divider can segment content vertically. */
    var vertical: js.UndefOr[Boolean] = js.native
  }

  def props(
    as:         js.UndefOr[AsC]      = js.undefined,
    children:   js.UndefOr[VdomNode] = js.undefined,
    className:  js.UndefOr[String]   = js.undefined,
    clazz:      js.UndefOr[Css]      = js.undefined,
    clearing:   js.UndefOr[Boolean]  = js.undefined,
    content:    js.UndefOr[VdomNode] = js.undefined,
    fitted:     js.UndefOr[Boolean]  = js.undefined,
    hidden:     js.UndefOr[Boolean]  = js.undefined,
    horizontal: js.UndefOr[Boolean]  = js.undefined,
    inverted:   js.UndefOr[Boolean]  = js.undefined,
    section:    js.UndefOr[Boolean]  = js.undefined,
    vertical:   js.UndefOr[Boolean]  = js.undefined
  ): DividerProps = {
    val p = as.toJsObject[DividerProps]
    p.as         = as.toJs
    p.children   = children.toJs
    p.className  = (className, clazz).toJs
    p.clearing   = clearing
    p.content    = content.toJs
    p.fitted     = fitted
    p.hidden     = hidden
    p.horizontal = horizontal
    p.inverted   = inverted
    p.section    = section
    p.vertical   = vertical
    p
  }

  private val component =
    JsComponent[DividerProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        DividerProps,
    children: VdomNode*
  ): UnmountedMapped[Id, DividerProps, Null, RawMounted[DividerProps, Null], DividerProps, Null] =
    component(p)(children: _*)

  def apply(
    children: VdomNode*
  ): UnmountedMapped[Id, DividerProps, Null, RawMounted[DividerProps, Null], DividerProps, Null] =
    component(props())(children: _*)
}
