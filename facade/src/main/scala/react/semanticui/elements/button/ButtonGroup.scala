package react.semanticui.elements.button

import scala.scalajs.js
import js.annotation._
import js.|
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._

final case class ButtonGroup(
  as:                    js.UndefOr[AsC]                      = js.undefined,
  attached:              js.UndefOr[Boolean | String]         = js.undefined,
  basic:                 js.UndefOr[Boolean]                  = js.undefined,
  buttons:               js.UndefOr[List[Button.ButtonProps]] = js.undefined,
  child:                 js.UndefOr[VdomNode]                 = js.undefined,
  className:             js.UndefOr[String]                   = js.undefined,
  clazz:                 js.UndefOr[Css]                      = js.undefined,
  color:                 js.UndefOr[SemanticColor]            = js.undefined,
  compact:               js.UndefOr[Boolean]                  = js.undefined,
  content:               js.UndefOr[VdomNode]                 = js.undefined,
  floated:               js.UndefOr[SemanticFloat]            = js.undefined,
  fluid:                 js.UndefOr[Boolean]                  = js.undefined,
  icon:                  js.UndefOr[Boolean]                  = js.undefined,
  inverted:              js.UndefOr[Boolean]                  = js.undefined,
  labeled:               js.UndefOr[Boolean]                  = js.undefined,
  negative:              js.UndefOr[Boolean]                  = js.undefined,
  positive:              js.UndefOr[Boolean]                  = js.undefined,
  primary:               js.UndefOr[Boolean]                  = js.undefined,
  secondary:             js.UndefOr[Boolean]                  = js.undefined,
  size:                  js.UndefOr[SemanticSize]             = js.undefined,
  toggle:                js.UndefOr[Boolean]                  = js.undefined,
  vertical:              js.UndefOr[Boolean]                  = js.undefined,
  widths:                js.UndefOr[SemanticWidth]            = js.undefined,
  override val children: CtorType.ChildrenArgs                = Seq.empty
) extends GenericComponentPC[ButtonGroup.ButtonGroupProps] {
  override def cprops = ButtonGroup.props(this)
  @inline def renderWith =
    ButtonGroup.component(ButtonGroup.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object ButtonGroup {
  @js.native
  @JSImport("semantic-ui-react", "ButtonGroup")
  object RawComponent extends js.Object

  @js.native
  trait ButtonGroupProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Groups can be attached to other content. */
    var attached: js.UndefOr[Boolean | String] = js.native

    /** Groups can be less pronounced. */
    var basic: js.UndefOr[Boolean] = js.native

    /** Array of shorthand ButtonGroup values. */
    var buttons: js.UndefOr[js.Array[suiraw.SemanticShorthandItem[Button.ButtonProps]]] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Groups can have a shared color. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** Groups can reduce their padding to fit into tighter spaces. */
    var compact: js.UndefOr[Boolean] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Groups can be aligned to the left or right of its container. */
    var floated: js.UndefOr[suiraw.SemanticFLOATS] = js.native

    /** Groups can take the width of their container. */
    var fluid: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted as icons. */
    var icon: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted to appear on dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted as labeled icon buttons. */
    var labeled: js.UndefOr[Boolean] = js.native

    /** Groups can hint towards a negative consequence. */
    var negative: js.UndefOr[Boolean] = js.native

    /** Groups can hint towards a positive consequence. */
    var positive: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted to show different levels of emphasis. */
    var primary: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted to show different levels of emphasis. */
    var secondary: js.UndefOr[Boolean] = js.native

    /** Groups can have different sizes. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** Groups can be formatted to toggle on and off. */
    var toggle: js.UndefOr[Boolean] = js.native

    /** Groups can be formatted to appear vertically. */
    var vertical: js.UndefOr[Boolean] = js.native

    /** Groups can have their widths divided evenly. */
    var widths: js.UndefOr[suiraw.SemanticWIDTHS] = js.native
  }

  def props(q: ButtonGroup): ButtonGroupProps =
    rawprops(
      q.as,
      q.attached,
      q.basic,
      q.buttons,
      q.child,
      q.className,
      q.clazz,
      q.color,
      q.compact,
      q.content,
      q.floated,
      q.fluid,
      q.icon,
      q.inverted,
      q.labeled,
      q.negative,
      q.positive,
      q.primary,
      q.secondary,
      q.size,
      q.toggle,
      q.vertical,
      q.widths
    )

  def rawprops(
    as:        js.UndefOr[AsC]                      = js.undefined,
    attached:  js.UndefOr[Boolean | String]         = js.undefined,
    basic:     js.UndefOr[Boolean]                  = js.undefined,
    buttons:   js.UndefOr[List[Button.ButtonProps]] = js.undefined,
    children:  js.UndefOr[VdomNode]                 = js.undefined,
    className: js.UndefOr[String]                   = js.undefined,
    clazz:     js.UndefOr[Css]                      = js.undefined,
    color:     js.UndefOr[SemanticColor]            = js.undefined,
    compact:   js.UndefOr[Boolean]                  = js.undefined,
    content:   js.UndefOr[VdomNode]                 = js.undefined,
    floated:   js.UndefOr[SemanticFloat]            = js.undefined,
    fluid:     js.UndefOr[Boolean]                  = js.undefined,
    icon:      js.UndefOr[Boolean]                  = js.undefined,
    inverted:  js.UndefOr[Boolean]                  = js.undefined,
    labeled:   js.UndefOr[Boolean]                  = js.undefined,
    negative:  js.UndefOr[Boolean]                  = js.undefined,
    positive:  js.UndefOr[Boolean]                  = js.undefined,
    primary:   js.UndefOr[Boolean]                  = js.undefined,
    secondary: js.UndefOr[Boolean]                  = js.undefined,
    size:      js.UndefOr[SemanticSize]             = js.undefined,
    toggle:    js.UndefOr[Boolean]                  = js.undefined,
    vertical:  js.UndefOr[Boolean]                  = js.undefined,
    widths:    js.UndefOr[SemanticWidth]            = js.undefined
  ): ButtonGroupProps = {
    val p = as.toJsObject[ButtonGroupProps]
    p.as       = as.toJs
    p.attached = attached
    p.basic    = basic
    p.buttons = buttons.map(x =>
      x.map((y: Button.ButtonProps) => y: suiraw.SemanticShorthandItem[Button.ButtonProps])
        .toJSArray
    )
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.color     = color.toJs
    p.compact   = compact
    p.content   = content.toJs
    p.floated   = floated.toJs
    p.icon      = icon
    p.inverted  = inverted
    p.labeled   = labeled
    p.negative  = negative
    p.positive  = positive
    p.primary   = primary
    p.secondary = secondary
    p.size      = size.toJs
    p.toggle    = toggle
    p.vertical  = vertical
    p.widths    = widths.toJs
    p
  }

  private val component =
    JsComponent[ButtonGroupProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): ButtonGroup =
    new ButtonGroup(children = content)
}
