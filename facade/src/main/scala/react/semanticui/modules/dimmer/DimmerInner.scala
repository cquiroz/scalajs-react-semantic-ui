package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class DimmerInner(
  as:                    js.UndefOr[AsC]                        = js.undefined,
  active:                js.UndefOr[Boolean]                    = js.undefined,
  child:                 js.UndefOr[VdomNode]                   = js.undefined,
  className:             js.UndefOr[String]                     = js.undefined,
  clazz:                 js.UndefOr[Css]                        = js.undefined,
  content:               js.UndefOr[VdomNode]                   = js.undefined,
  disabled:              js.UndefOr[Boolean]                    = js.undefined,
  onClickE:              js.UndefOr[DimmerInner.OnClick]        = js.undefined,
  onClick:               js.UndefOr[Callback]                   = js.undefined,
  onClickOutsideE:       js.UndefOr[DimmerInner.OnClickOutside] = js.undefined,
  onClickOutside:        js.UndefOr[Callback]                   = js.undefined,
  inverted:              js.UndefOr[Boolean]                    = js.undefined,
  page:                  js.UndefOr[Boolean]                    = js.undefined,
  simple:                js.UndefOr[Boolean]                    = js.undefined,
  verticalAlign:         js.UndefOr[DimmerVerticalAlign]        = js.undefined,
  override val children: CtorType.ChildrenArgs                  = Seq.empty
) extends GenericComponentPC[DimmerInner.DimmerInnerProps] {
  override def cprops    = DimmerInner.props(this)
  @inline def renderWith = DimmerInner.component(DimmerInner.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

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

  def props(q: DimmerInner): DimmerInnerProps =
    rawprops(
      q.as,
      q.active,
      q.child,
      q.className,
      q.clazz,
      q.content,
      q.disabled,
      q.onClickE,
      q.onClick,
      q.onClickOutsideE,
      q.onClickOutside,
      q.inverted,
      q.page,
      q.simple,
      q.verticalAlign
    )

  def rawprops(
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

  def apply(content: VdomNode*): DimmerInner =
    new DimmerInner(children = content)
}
