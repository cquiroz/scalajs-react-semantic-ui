package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.vdom.html_<^._
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui.raw._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.IconShorthand
import react.semanticui.elements.flag.Flag.FlagProps
import react.semanticui.elements.flag.Flag
import react.semanticui.elements.label.Label.LabelProps
import react.semanticui.elements.label.Label
import react.semanticui.elements.image.Image.ImageProps
import react.semanticui.elements.image.Image
import react.semanticui._

final case class DropdownItem(
  as:                    js.UndefOr[AsC]                         = js.undefined,
  active:                js.UndefOr[Boolean]                     = js.undefined,
  child:                 js.UndefOr[VdomNode]                    = js.undefined,
  className:             js.UndefOr[String]                      = js.undefined,
  clazz:                 js.UndefOr[Css]                         = js.undefined,
  content:               js.UndefOr[VdomNode]                    = js.undefined,
  description:           js.UndefOr[String]                      = js.undefined,
  disable:               js.UndefOr[Boolean]                     = js.undefined,
  flag:                  js.UndefOr[VdomNode | Flag]             = js.undefined,
  icon:                  js.UndefOr[IconShorthand]               = js.undefined,
  image:                 js.UndefOr[VdomNode | Image]            = js.undefined,
  label:                 js.UndefOr[VdomNode | Label]            = js.undefined,
  onClickE:              js.UndefOr[DropdownItem.OnClick]        = js.undefined,
  onClick:               js.UndefOr[Callback]                    = js.undefined,
  selected:              js.UndefOr[Boolean]                     = js.undefined,
  text:                  js.UndefOr[VdomNode]                    = js.undefined,
  value:                 js.UndefOr[Boolean | JsNumber | String] = js.undefined,
  override val children: CtorType.ChildrenArgs                   = Seq.empty
) extends GenericComponentPC[DropdownItem.DropdownItemProps] {
  override def cprops    = DropdownItem.props(this)
  @inline def renderWith = DropdownItem.component(DropdownItem.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

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
    var icon: js.UndefOr[suiraw.SemanticShorthandItemSB[IconProps]] = js.native

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
    q: DropdownItem
  ): DropdownItemProps = {
    val p = q.as.toJsObject[DropdownItemProps]
    p.as          = q.as.toJs
    p.active      = q.active
    p.children    = q.child.toJs
    p.className   = (q.className, q.clazz).toJs
    p.content     = q.content.toJs
    p.description = q.description
    p.disable     = q.disable
    p.flag        = toRawOrPropsP(q.flag)
    p.icon        = q.icon.toJs
    p.image       = fnToRawOrPropsPC(q.image)
    p.label       = toRawOrPropsPC(q.label)
    p.onClick     = (q.onClickE, q.onClick).toJs
    p.selected    = q.selected
    p.text        = q.text.toJs
    p.value       = q.value
    p
  }

  private val component =
    JsComponent[DropdownItemProps, Children.Varargs, Null](RawComponent)

  def apply(
    value: Boolean | JsNumber | String
  ): DropdownItem =
    DropdownItem(value = value, children = Seq(value.toString))

}
