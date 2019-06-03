package react.semanticui.collections.menu

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.colors._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon

object MenuItem {
  type OnClick = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "MenuItem")
  object RawComponent extends js.Object

  @js.native
  trait MenuItemProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A menu item can be active. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Additional colors can be specified. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** A menu item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** A menu item or menu can remove element padding, vertically or horizontally. */
    var fitted: js.UndefOr[Boolean | String] = js.native

    /** A menu item may include a header or may itself be a header. */
    var header: js.UndefOr[Boolean] = js.native

    /** Item can be only icon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] =
      js.native

    /** Item index inside Menu. */
    var index: js.UndefOr[Int] = js.native

    /** A menu item can be link. */
    var link: js.UndefOr[Boolean] = js.native

    /** Internal name of the Item. */
    var name: js.UndefOr[String] = js.native

    /**
      * Called on click. When passed, the component will render as an `a`
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[js.Function1[ReactEvent, Unit]] = js.native

    /** A menu item can take left or right position. */
    var position: js.UndefOr[String] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]              = js.undefined,
    active:    js.UndefOr[Boolean]          = js.undefined,
    children:  js.UndefOr[VdomNode]         = js.undefined,
    className: js.UndefOr[String]           = js.undefined,
    color:     js.UndefOr[SemanticColor]    = js.undefined,
    content:   js.UndefOr[VdomNode]         = js.undefined,
    disabled:  js.UndefOr[Boolean]          = js.undefined,
    fitted:    js.UndefOr[MenuItemFitted]   = js.undefined,
    header:    js.UndefOr[Boolean]          = js.undefined,
    icon:      js.UndefOr[UnmountedIcon]    = js.undefined,
    index:     js.UndefOr[Int]              = js.undefined,
    link:      js.UndefOr[Boolean]          = js.undefined,
    name:      js.UndefOr[String]           = js.undefined,
    onClickE:  js.UndefOr[OnClick]          = js.undefined,
    onClick:   js.UndefOr[Callback]         = js.undefined,
    position:  js.UndefOr[MenuItemPosition] = js.undefined
  ): MenuItemProps = {
    val p = (new js.Object).asInstanceOf[MenuItemProps]
    p.as        = as.toJs
    p.active    = active
    p.children  = children.toJs
    p.className = className
    p.color     = color.toJs
    p.content   = content.toJs
    p.disabled  = disabled
    p.fitted    = fitted.toJs
    p.header    = header
    p.icon      = icon.map(_.props)
    p.index     = index
    p.link      = link
    p.name      = name
    p.onClick   = (onClickE, onClick).toJs
    p.position  = position.toJs
    p
  }

  private val component =
    JsComponent[MenuItemProps, Children.Varargs, Null](RawComponent)

  def apply(p: MenuItemProps, children: VdomNode*): UnmountedMapped[Id,
                                                                    MenuItemProps,
                                                                    Null,
                                                                    RawMounted[MenuItemProps, Null],
                                                                    MenuItemProps,
                                                                    Null] =
    component(p)(children: _*)

}
