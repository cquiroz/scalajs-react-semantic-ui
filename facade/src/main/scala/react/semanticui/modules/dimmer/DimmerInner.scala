package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

object DimmerInner {
  type RawOnClick        = js.Function2[ReactMouseEvent, DimmerInner.DimmerInnerProps, Unit]
  type OnClick           = (ReactMouseEvent, DimmerInner.DimmerInnerProps) => Callback
  type RawOnClickOutside = RawOnClick
  type OnClickOutside    = OnClick

  @js.native
  @JSImport("semantic-ui-react", "DimmerInner")
  object RawComponent extends js.Object

  @js.native
  trait DimmerInnerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] =
      js.native

    /** A disabled dimmer cannot be activated */
    var disabled: js.UndefOr[Boolean] = js.native

    /**
      * Called when the dimmer is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[RawOnClick] = js.native

    /**
      * Handles click outside Dimmer's content, but inside Dimmer area.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClickOutside: js.UndefOr[RawOnClickOutside] = js.native

    /** A dimmer can be formatted to have its colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.native

    /** A dimmer can be controlled with simple prop. */
    var simple: js.UndefOr[Boolean] = js.native

    /** A dimmer can have its content top or bottom aligned. */
    var verticalAlign: js.UndefOr[String] = js.native
  }

  def props(
    as:              js.UndefOr[AsC]                 = js.undefined,
    active:          js.UndefOr[Boolean]             = js.undefined,
    children:        js.UndefOr[VdomNode]            = js.undefined,
    className:       js.UndefOr[String]              = js.undefined,
    clazz:           js.UndefOr[Css]                 = js.undefined,
    content:         js.UndefOr[VdomNode]            = js.undefined,
    disabled:        js.UndefOr[Boolean]             = js.undefined,
    onClickE:        js.UndefOr[OnClick]             = js.undefined,
    onClick:         js.UndefOr[Callback]            = js.undefined,
    onClickOutsideE: js.UndefOr[OnClickOutside]      = js.undefined,
    onClickOutside:  js.UndefOr[Callback]            = js.undefined,
    inverted:        js.UndefOr[Boolean]             = js.undefined,
    page:            js.UndefOr[Boolean]             = js.undefined,
    simple:          js.UndefOr[Boolean]             = js.undefined,
    verticalAlign:   js.UndefOr[DimmerVerticalAlign] = js.undefined
  ): DimmerInnerProps = {
    val p = (new js.Object).asInstanceOf[DimmerInnerProps]
    p.as             = as.toJs
    p.active         = active
    p.children       = children.toJs
    p.className      = (className, clazz).toJs
    p.disabled       = disabled
    p.onClick        = (onClickE, onClick).toJs
    p.onClickOutside = (onClickOutsideE, onClickOutside).toJs
    p.inverted       = inverted
    p.page           = page
    p.simple         = simple
    p.verticalAlign  = verticalAlign.toJs
    p
  }

  private val component =
    JsComponent[DimmerInnerProps, Children.Varargs, Null](RawComponent)

  def apply(p: DimmerInnerProps, children: VdomNode*): UnmountedMapped[
    Id,
    DimmerInnerProps,
    Null,
    RawMounted[DimmerInnerProps, Null],
    DimmerInnerProps,
    Null
  ] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedMapped[
    Id,
    DimmerInnerProps,
    Null,
    RawMounted[DimmerInnerProps, Null],
    DimmerInnerProps,
    Null
  ] =
    component(props())(children: _*)
}
