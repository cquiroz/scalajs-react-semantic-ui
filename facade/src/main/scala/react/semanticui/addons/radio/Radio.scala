package react.semanticui.addons.radio

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.modules.checkbox._

final case class Radio(
  as:                   js.UndefOr[AsC]               = js.undefined,
  checked:              js.UndefOr[Boolean]           = js.undefined,
  className:            js.UndefOr[String]            = js.undefined,
  clazz:                js.UndefOr[Css]               = js.undefined,
  defaultChecked:       js.UndefOr[Boolean]           = js.undefined,
  defaultIndeterminate: js.UndefOr[Boolean]           = js.undefined,
  disabled:             js.UndefOr[Boolean]           = js.undefined,
  fitted:               js.UndefOr[Boolean]           = js.undefined,
  id:                   js.UndefOr[JsNumber | String] = js.undefined,
  indeterminate:        js.UndefOr[Boolean]           = js.undefined,
  label:                js.UndefOr[VdomNode]          = js.undefined,
  name:                 js.UndefOr[String]            = js.undefined,
  onChangeE:            js.UndefOr[Radio.Event]       = js.undefined,
  onChange:             js.UndefOr[Callback]          = js.undefined,
  onClickE:             js.UndefOr[Radio.Event]       = js.undefined,
  onClick:              js.UndefOr[Callback]          = js.undefined,
  onMouseDownE:         js.UndefOr[Radio.Event]       = js.undefined,
  onMouseDown:          js.UndefOr[Callback]          = js.undefined,
  onMouseUpE:           js.UndefOr[Radio.Event]       = js.undefined,
  onMouseUp:            js.UndefOr[Callback]          = js.undefined,
  radio:                js.UndefOr[Boolean]           = js.undefined,
  readOnly:             js.UndefOr[Boolean]           = js.undefined,
  slider:               js.UndefOr[Boolean]           = js.undefined,
  tabIndex:             js.UndefOr[JsNumber | String] = js.undefined,
  toggle:               js.UndefOr[Boolean]           = js.undefined,
  `type`:               js.UndefOr[CheckboxType]      = CheckboxType.Radio,
  value:                js.UndefOr[String | JsNumber] = js.undefined
) extends GenericComponentP[Radio.RadioProps] {
  override def cprops = Radio.props(this)
  @inline def render  = Radio.component(Radio.props(this))
}

object Radio {
  type Event            = (ReactMouseEvent, RadioProps) => Callback
  private type RawEvent = js.Function2[ReactMouseEvent, RadioProps, Unit]

  @js.native
  @JSImport("semantic-ui-react", "Radio")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait RadioProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Whether or not checkbox is checked. */
    var checked: js.UndefOr[Boolean] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** The initial value of checked. */
    var defaultChecked: js.UndefOr[Boolean] = js.native

    /** Whether or not checkbox is indeterminate. */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.native

    /** A checkbox can appear disabled and be unable to change states */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Removes padding for a label. Auto applied when there is no label. */
    var fitted: js.UndefOr[Boolean] = js.native

    /** A unique identifier. */
    var id: js.UndefOr[JsNumber | String] = js.native

    /** Whether or not checkbox is indeterminate. */
    var indeterminate: js.UndefOr[Boolean] = js.native

    /** The text of the associated label element. */
    var label: js.UndefOr[VdomNode] = js.native

    /** The HTML input name. */
    var name: js.UndefOr[String] = js.native

    /**
      * Called when the user attempts to change the checked state.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed checked/indeterminate state.
      */
    var onChange: js.UndefOr[RawEvent] = js.native

    /**
      * Called when the checkbox or label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onClick: js.UndefOr[RawEvent] = js.native

    /**
      * Called when the user presses down on the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onMouseDown: js.UndefOr[RawEvent] = js.native

    /**
      * Called when the user releases the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    var onMouseUp: js.UndefOr[RawEvent] = js.native

    /** Format as a radio element. This means it is an exclusive option. */
    var radio: js.UndefOr[Boolean] = js.native

    /** A checkbox can be read-only and unable to change states. */
    var readOnly: js.UndefOr[Boolean] = js.native

    /** Format to emphasize the current selection state. */
    var slider: js.UndefOr[Boolean] = js.native

    /** A checkbox can receive focus. */
    var tabIndex: js.UndefOr[JsNumber | String] = js.native

    /** Format to show an on or off choice. */
    var toggle: js.UndefOr[Boolean] = js.native

    /** HTML input type, either checkbox or radio. */
    var `type`: js.UndefOr[String] = js.native

    /** The HTML input value. */
    var value: js.UndefOr[String | JsNumber] = js.native
  }

  def props(q: Radio): RadioProps =
    rawprops(
      q.as,
      q.checked,
      q.className,
      q.clazz,
      q.defaultChecked,
      q.defaultIndeterminate,
      q.disabled,
      q.fitted,
      q.id,
      q.indeterminate,
      q.label,
      q.name,
      q.onChangeE,
      q.onChange,
      q.onClickE,
      q.onClick,
      q.onMouseDownE,
      q.onMouseDown,
      q.onMouseUpE,
      q.onMouseUp,
      q.radio,
      q.readOnly,
      q.slider,
      q.tabIndex,
      q.toggle,
      q.`type`,
      q.value
    )

  def rawprops(
    as:                   js.UndefOr[AsC]               = js.undefined,
    checked:              js.UndefOr[Boolean]           = js.undefined,
    className:            js.UndefOr[String]            = js.undefined,
    clazz:                js.UndefOr[Css]               = js.undefined,
    defaultChecked:       js.UndefOr[Boolean]           = js.undefined,
    defaultIndeterminate: js.UndefOr[Boolean]           = js.undefined,
    disabled:             js.UndefOr[Boolean]           = js.undefined,
    fitted:               js.UndefOr[Boolean]           = js.undefined,
    id:                   js.UndefOr[JsNumber | String] = js.undefined,
    indeterminate:        js.UndefOr[Boolean]           = js.undefined,
    label:                js.UndefOr[VdomNode]          = js.undefined,
    name:                 js.UndefOr[String]            = js.undefined,
    onChangeE:            js.UndefOr[Event]             = js.undefined,
    onChange:             js.UndefOr[Callback]          = js.undefined,
    onClickE:             js.UndefOr[Event]             = js.undefined,
    onClick:              js.UndefOr[Callback]          = js.undefined,
    onMouseDownE:         js.UndefOr[Event]             = js.undefined,
    onMouseDown:          js.UndefOr[Callback]          = js.undefined,
    onMouseUpE:           js.UndefOr[Event]             = js.undefined,
    onMouseUp:            js.UndefOr[Callback]          = js.undefined,
    radio:                js.UndefOr[Boolean]           = js.undefined,
    readOnly:             js.UndefOr[Boolean]           = js.undefined,
    slider:               js.UndefOr[Boolean]           = js.undefined,
    tabIndex:             js.UndefOr[JsNumber | String] = js.undefined,
    toggle:               js.UndefOr[Boolean]           = js.undefined,
    `type`:               js.UndefOr[CheckboxType]      = js.undefined,
    value:                js.UndefOr[String | JsNumber] = js.undefined
  ): RadioProps = {
    val p = as.toJsObject[RadioProps]
    p.as                   = as.toJs
    p.checked              = checked
    p.className            = (className, clazz).toJs
    p.defaultChecked       = defaultChecked
    p.defaultIndeterminate = defaultIndeterminate
    p.disabled             = disabled
    p.fitted               = fitted
    p.id                   = id
    p.indeterminate        = indeterminate
    p.label                = label
    p.name                 = name
    p.onChange             = (onChangeE, onChange).toJs
    p.onClick              = (onClickE, onClick).toJs
    p.onMouseDown          = (onMouseDownE, onMouseDown).toJs
    p.onMouseUp            = (onMouseUpE, onMouseUp).toJs
    p.radio                = radio
    p.readOnly             = readOnly
    p.slider               = slider
    p.tabIndex             = tabIndex
    p.toggle               = toggle
    p.`type`               = `type`.toJs
    p.value                = value
    p
  }

  private val component =
    JsComponent[RadioProps, Children.None, Null](RawComponent)

  val Default: Radio = Radio()

  val defaultProps: RadioProps = props(Default)

}
