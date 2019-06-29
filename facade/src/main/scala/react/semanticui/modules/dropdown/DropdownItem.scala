package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEvent
import japgolly.scalajs.react.Children
import japgolly.scalajs.react.JsComponent
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.semanticui.{ raw => suiraw }
import react.semanticui.raw._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon
import react.semanticui.elements.flag.Flag.FlagProps
import react.semanticui.elements.flag.UnmountedFlag
import react.semanticui.elements.label.Label.LabelProps
import react.semanticui.elements.label.UnmountedLabel
import react.semanticui.elements.image.Image.ImageProps
import react.semanticui.elements.image.UnmountedImage
import react.semanticui._

object DropdownItem {
  type OnClick = (ReactMouseEvent, DropdownItemProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "DropdownItem")
  object RawComponent extends js.Object

  @js.native
  trait DropdownItemProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Style as the currently chosen item. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native

    /** Additional text with less emphasis. */
    var description: js.UndefOr[suiraw.SemanticShorthandItem[String]] = js.native

    /** A dropdown item can be disabled. */
    var disable: js.UndefOr[Boolean] = js.native

    /** Shorthand for Flag. */
    var flag: js.UndefOr[suiraw.SemanticShorthandItem[FlagProps]] = js.native

    /** Shorthand for Icon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] = js.native

    /** Shorthand for Image. */
    var image: js.UndefOr[suiraw.SemanticShorthandItem[ImageProps]] = js.native

    /** Shorthand for Label. */
    var label: js.UndefOr[suiraw.SemanticShorthandItem[LabelProps]] = js.native

    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[js.Function2[ReactMouseEvent, DropdownItemProps, Unit]] = js.native

    /**
      * The item currently selected by keyboard shortcut.
      * This is not the active item.
      */
    var selected: js.UndefOr[Boolean] = js.native

    /** Display text. */
    var text: js.UndefOr[SemanticShorthandContent] = js.native

    /** Stored value. */
    var value: js.UndefOr[Boolean | JsNumber | String] = js.native

  }

  def props(
    as:          js.UndefOr[AsC]                         = js.undefined,
    active:      js.UndefOr[Boolean]                     = js.undefined,
    children:    js.UndefOr[VdomNode]                    = js.undefined,
    className:   js.UndefOr[String]                      = js.undefined,
    clazz:       js.UndefOr[Css]                         = js.undefined,
    content:     js.UndefOr[VdomNode]                    = js.undefined,
    description: js.UndefOr[String]                      = js.undefined,
    disable:     js.UndefOr[Boolean]                     = js.undefined,
    flag:        js.UndefOr[UnmountedFlag]               = js.undefined,
    icon:        js.UndefOr[UnmountedIcon]               = js.undefined,
    image:       js.UndefOr[UnmountedImage]              = js.undefined,
    label:       js.UndefOr[UnmountedLabel]              = js.undefined,
    onClickE:    js.UndefOr[OnClick]                     = js.undefined,
    onClick:     js.UndefOr[Callback]                    = js.undefined,
    selected:    js.UndefOr[Boolean]                     = js.undefined,
    text:        js.UndefOr[VdomNode]                    = js.undefined,
    value:       js.UndefOr[Boolean | JsNumber | String] = js.undefined
  ): DropdownItemProps = {
    val p = as.toJsObject[DropdownItemProps]
    p.as          = as.toJs
    p.active      = active
    p.children    = children.toJs
    p.className   = (className, clazz).toJs
    p.content     = content.toJs
    p.description = description
    p.disable     = disable
    p.flag        = flag.map(_.props)
    p.icon        = icon.map(_.props)
    p.image       = image.map(_.props)
    p.label       = label.map(_.props)
    p.onClick     = (onClickE, onClick).toJs
    p.selected    = selected
    p.text        = text.toJs
    p.value       = value
    p
  }

  private val component =
    JsComponent[DropdownItemProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        DropdownItemProps,
    children: VdomNode*
  ): UnmountedMapped[Id, DropdownItemProps, Null, RawMounted[DropdownItemProps, Null], DropdownItemProps, Null] =
    component(p)(children: _*)

  def apply(
    children: VdomNode*
  ): UnmountedMapped[Id, DropdownItemProps, Null, RawMounted[DropdownItemProps, Null], DropdownItemProps, Null] =
    component(props())(children: _*)

}
