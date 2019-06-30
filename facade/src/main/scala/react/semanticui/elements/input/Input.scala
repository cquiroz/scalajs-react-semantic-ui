package react.semanticui.elements.input

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.common.style._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon
import react.semanticui.sizes._

object Input {
  type OnChange = ReactEventFromInput => Callback

  @js.native
  @JSImport("semantic-ui-react", "Input")
  object RawComponent extends js.Object

  @js.native
  trait InputProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** An Input can be formatted to alert the user to an action they may perform. */
    var action: js.UndefOr[Boolean | suiraw.SemanticShorthandItem[js.Any]] = js.native

    /** An action can appear along side an Input on the left or right. */
    var actionPosition: js.UndefOr[String] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** An Input field can show that it is disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** An Input field can show the data contains errors. */
    var error: js.UndefOr[Boolean] = js.native

    /** Take on the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.native

    /** An Input field can show a user is currently interacting with it. */
    var focus: js.UndefOr[Boolean] = js.native

    /** Optional Icon to display inside the Input. */
    var icon: js.UndefOr[Boolean | suiraw.SemanticShorthandItem[IconProps]] = js.native

    /** An Icon can appear inside an Input on the left or right. */
    var iconPosition: js.UndefOr[String]

    /** Shorthand for creating the HTML Input. */
    var input: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Format to appear on dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Optional Label to display along side the Input. */
    var label: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** A Label can appear outside an Input on the left or right. */
    var labelPosition: js.UndefOr[String] = js.native

    /** An Icon Input field can show that it is currently loading data. */
    var loading: js.UndefOr[Boolean] = js.native

    /**
      * Called on change.
      *
      * @param {ChangeEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and a proposed value.
      */
    var onChange: js.UndefOr[js.Function1[ReactEventFromInput, Unit]]

    /** An Input can vary in size. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** An Input can receive focus. */
    var tabIndex: js.UndefOr[String | JsNumber] = js.native

    /** Transparent Input has no background. */
    var transparent: js.UndefOr[Boolean] = js.native

    /** The HTML input type. */
    var `type`: js.UndefOr[String] = js.native

  }

  def props(
    as:             js.UndefOr[AsC]                                     = js.undefined,
    action:         js.UndefOr[Boolean | SemanticShortHandItem[js.Any]] = js.undefined,
    actionPosition: js.UndefOr[ActionPosition]                          = js.undefined,
    children:       js.UndefOr[VdomNode]                                = js.undefined,
    className:      js.UndefOr[String]                                  = js.undefined,
    clazz:          js.UndefOr[Css]                                     = js.undefined,
    disabled:       js.UndefOr[Boolean]                                 = js.undefined,
    error:          js.UndefOr[Boolean]                                 = js.undefined,
    fluid:          js.UndefOr[Boolean]                                 = js.undefined,
    focus:          js.UndefOr[Boolean]                                 = js.undefined,
    icon:           js.UndefOr[Boolean | UnmountedIcon]                 = js.undefined,
    iconPosition:   js.UndefOr[IconPosition]                            = js.undefined,
    input:          js.UndefOr[VdomNode]                                = js.undefined,
    inverted:       js.UndefOr[Boolean]                                 = js.undefined,
    label:          js.UndefOr[VdomNode]                                = js.undefined,
    labelPosition:  js.UndefOr[LabelPosition]                           = js.undefined,
    loading:        js.UndefOr[Boolean]                                 = js.undefined,
    onChangeE:      js.UndefOr[OnChange]                                = js.undefined,
    onChange:       js.UndefOr[Callback]                                = js.undefined,
    size:           js.UndefOr[SemanticSize]                            = js.undefined,
    tabIndex:       js.UndefOr[String | JsNumber]                       = js.undefined,
    transparent:    js.UndefOr[Boolean]                                 = js.undefined,
    `type`:         js.UndefOr[String]                                  = js.undefined
  ): InputProps = {
    val p = as.toJsObject[InputProps]
    p.as             = as.toJs
    p.action         = action.toRaw
    p.actionPosition = actionPosition.toJs
    p.children       = children.toJs
    p.className      = (className, clazz).toJs
    p.disabled       = disabled
    p.error          = error
    p.fluid          = fluid
    p.focus          = focus
    p.icon = icon.map {
      (_: Any) match {
        case b: Boolean => b
        case c          => c.asInstanceOf[UnmountedIcon].props
      }
    }
    p.iconPosition  = iconPosition.toJs
    p.input         = input.toJs
    p.inverted      = inverted
    p.label         = label.toJs
    p.labelPosition = labelPosition.toJs
    p.loading       = loading
    p.onChange      = (onChangeE, onChange).toJs
    p.size          = size.toJs
    p.tabIndex      = tabIndex
    p.transparent   = transparent
    p.`type`        = `type`
    p
  }

  private val component =
    JsComponent[InputProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        InputProps,
    children: VdomNode*
  ): UnmountedMapped[Id, InputProps, Null, RawMounted[InputProps, Null], InputProps, Null] =
    component(p)(children: _*)

  def apply(
    children: VdomNode*
  ): UnmountedMapped[Id, InputProps, Null, RawMounted[InputProps, Null], InputProps, Null] =
    component(props())(children: _*)
}
