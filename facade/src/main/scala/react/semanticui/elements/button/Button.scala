package react.semanticui.elements.button

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.colors._
import react.semanticui.floats._
import react.semanticui.elements.label.Label.LabelProps
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon

object Button {
  type OnClick = (ReactMouseEvent, ButtonProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Button")
  object RawComponent extends js.Object

  @js.native
  trait ButtonProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[js.Any]                               = js.native
    var active: js.UndefOr[Boolean]                          = js.native
    var animated: js.UndefOr[Boolean | String]               = js.native
    var attached: js.UndefOr[Boolean | String]               = js.native
    var basic: js.UndefOr[Boolean]                           = js.native
    var children: js.UndefOr[React.Node]                     = js.native
    var circular: js.UndefOr[Boolean]                        = js.native
    var className: js.UndefOr[String]                        = js.native
    var color: js.UndefOr[String]                            = js.native
    var compact: js.UndefOr[Boolean]                         = js.native
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
    var disabled: js.UndefOr[Boolean]                        = js.native
    var floated: js.UndefOr[suiraw.SemanticFLOATS]           = js.native
    var fluid: js.UndefOr[Boolean]                           = js.native
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] =
      js.native
    var inverted: js.UndefOr[Boolean]                                         = js.native
    var label: js.UndefOr[suiraw.SemanticShorthandItem[LabelProps]]           = js.native
    var labelPosition: js.UndefOr[String]                                     = js.native
    var loading: js.UndefOr[Boolean]                                          = js.native
    var negative: js.UndefOr[Boolean]                                         = js.native
    var onClick: js.UndefOr[js.Function2[ReactMouseEvent, ButtonProps, Unit]] = js.native
    var positive: js.UndefOr[Boolean]                                         = js.native
    var primary: js.UndefOr[Boolean]                                          = js.native
    var role: js.UndefOr[Boolean]                                             = js.native
    var secondary: js.UndefOr[Boolean]                                        = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES]                                = js.native
    var tabIndex: js.UndefOr[Double | String]                                 = js.native
    var toggle: js.UndefOr[Boolean]                                           = js.native
  }

  def props(
    as:            js.UndefOr[js.Any]                            = js.undefined,
    active:        js.UndefOr[Boolean]                           = js.undefined,
    animated:      js.UndefOr[ButtonAnimated]                    = js.undefined,
    attached:      js.UndefOr[ButtonAttached]                    = js.undefined,
    basic:         js.UndefOr[Boolean]                           = js.undefined,
    children:      js.UndefOr[VdomNode]                          = js.undefined,
    circular:      js.UndefOr[Boolean]                           = js.undefined,
    className:     js.UndefOr[String]                            = js.undefined,
    color:         js.UndefOr[SemanticColor]                     = js.undefined,
    compact:       js.UndefOr[Boolean]                           = js.undefined,
    content:       js.UndefOr[VdomNode]                          = js.undefined,
    disabled:      js.UndefOr[Boolean]                           = js.undefined,
    floated:       js.UndefOr[SemanticFloats]                    = js.undefined,
    fluid:         js.UndefOr[Boolean]                           = js.undefined,
    icon:          js.UndefOr[UnmountedIcon]  = js.undefined,
    inverted:      js.UndefOr[Boolean]                           = js.undefined,
    label:         js.UndefOr[SemanticShortHandItem[LabelProps]] = js.undefined,
    labelPosition: js.UndefOr[String]                            = js.undefined,
    loading:       js.UndefOr[Boolean]                           = js.undefined,
    negative:      js.UndefOr[Boolean]                           = js.undefined,
    onClick:       js.UndefOr[OnClick]                           = js.undefined,
    positive:      js.UndefOr[Boolean]                           = js.undefined,
    primary:       js.UndefOr[Boolean]                           = js.undefined,
    role:          js.UndefOr[Boolean]                           = js.undefined,
    secondary:     js.UndefOr[Boolean]                           = js.undefined,
    size:          js.UndefOr[suiraw.SemanticSIZES]              = js.undefined,
    tabIndex:      js.UndefOr[Double | String]                   = js.undefined,
    toggle:        js.UndefOr[Boolean]                           = js.undefined
  ): ButtonProps = {
    val p = (new js.Object).asInstanceOf[ButtonProps]
    p.as            = as
    p.active        = active
    p.animated      = animated.map(_.value)
    p.attached      = attached.map(_.value)
    p.basic         = basic
    p.children      = children.map(_.rawNode)
    p.circular      = circular
    p.className     = className
    p.color         = color.map(_.value)
    p.compact       = compact
    p.content       = content.map(_.rawNode)
    p.disabled      = disabled
    p.floated       = floated.map(_.value)
    p.fluid         = fluid
    p.icon          = icon.map(_.props)
    p.inverted      = inverted
    p.label         = label.toRaw
    p.labelPosition = labelPosition
    p.loading       = loading
    p.negative      = negative
    p.onClick = onClick.map { c => (e, p) =>
      c(e, p).runNow()
    }
    p.positive  = positive
    p.primary   = primary
    p.role      = role
    p.secondary = secondary
    p.size      = size
    p.tabIndex  = tabIndex
    p.toggle    = toggle
    p
  }
  // @js.native
  // @JSGlobal
  // class Button extends React.Component[ButtonProps, js.Any] {
  //   var focus: js.Function0[Unit] = js.native
  // }
  //
  // @js.native
  // @JSGlobal
  // object Button extends js.Object {
  //   var Content: ButtonContent.type = js.native
  //   var Group: ButtonGroup.type     = js.native
  //   var Or: ButtonOr.type           = js.native
  // }

}
