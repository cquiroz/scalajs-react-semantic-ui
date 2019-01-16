package react.semanticui.collections.menu

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.colors._
import react.semanticui.sizes._
import react.semanticui.widths._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon

object Menu {
  type OnItemClick = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "Menu")
  object RawComponent extends js.Object

  @js.native
  trait MenuProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** a menu item can be active. */
    var activeIndex: js.UndefOr[Int | String] = js.native

    /** A menu may be attached to other content segments. */
    var attached: js.UndefOr[Boolean | String] = js.native

    /** A menu item or menu can have no borders. */
    var borderless: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Additional colors can be specified. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** A menu can take up only the space necessary to fit its content. */
    var compact: js.UndefOr[Boolean] = js.native

    /** Initial activeIndex value. */
    var defaultActiveIndex: js.UndefOr[Int | String] = js.native

    /** A menu can be floated. */
    var fixed: js.UndefOr[String] = js.native

    /** A menu item or menu can remove element padding, vertically or horizontally. */
    var floated: js.UndefOr[Boolean | String] = js.native

    /** A vertical menu may take the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.native

    /** A menu may have just icons (bool) or labeled icons. */
    var icon: js.UndefOr[Boolean | String] =
      js.native

    /** A menu may have its colors inverted to show greater contrast. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Shorthand array of props for Menu. */
    // items: customPropTypes.collectionShorthand,

    /**
      * onClick handler for MenuItem. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onItemClick: js.UndefOr[js.Function1[ReactEvent, Unit]] = js.native

    /** A pagination menu is specially formatted to present links to pages of content. */
    var pagination: js.UndefOr[Boolean] = js.native

    /** A menu can point to show its relationship to nearby content. */
    var pointing: js.UndefOr[Boolean] = js.native

    /** A menu can adjust its appearance to de-emphasize its contents. */
    var secondary: js.UndefOr[Boolean] = js.native

    /** A menu can vary in size. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** A menu can stack at mobile resolutions. */
    var stackable: js.UndefOr[Boolean] = js.native

    /** A menu can be formatted to show tabs of information. */
    var tabular: js.UndefOr[Boolean | String]

    /** A menu can be formatted for text content. */
    var text: js.UndefOr[Boolean] = js.native

    /** A vertical menu displays elements vertically. */
    var vertical: js.UndefOr[Boolean] = js.native

    /** A menu can vary in size. */
    var widths: js.UndefOr[suiraw.SemanticWIDTHS] = js.native
  }

  def props(
    as:                 js.UndefOr[AsC]           = js.undefined,
    activeIndex:        js.UndefOr[Int | String]  = js.undefined,
    attached:           js.UndefOr[MenuAttached]  = js.undefined,
    borderless:         js.UndefOr[Boolean]       = js.undefined,
    children:           js.UndefOr[VdomNode]      = js.undefined,
    className:          js.UndefOr[String]        = js.undefined,
    color:              js.UndefOr[SemanticColor] = js.undefined,
    compact:            js.UndefOr[Boolean]       = js.undefined,
    defaultActiveIndex: js.UndefOr[Int | String]  = js.undefined,
    fixed:              js.UndefOr[MenuFixed]     = js.undefined,
    floated:            js.UndefOr[MenuFloated]   = js.undefined,
    fluid:              js.UndefOr[Boolean]       = js.undefined,
    icon:               js.UndefOr[MenuIcon]      = js.undefined,
    inverted:           js.UndefOr[Boolean]       = js.undefined,
    onItemClick:        js.UndefOr[OnItemClick]   = js.undefined,
    pagination:         js.UndefOr[Boolean]       = js.undefined,
    pointing:           js.UndefOr[Boolean]       = js.undefined,
    secondary:          js.UndefOr[Boolean]       = js.undefined,
    size:               js.UndefOr[SemanticSize]  = js.undefined,
    stackable:          js.UndefOr[Boolean]       = js.undefined,
    tabular:            js.UndefOr[MenuTabular]   = js.undefined,
    text:               js.UndefOr[Boolean]       = js.undefined,
    vertical:           js.UndefOr[Boolean]       = js.undefined,
    widths:             js.UndefOr[SemanticWidth] = js.undefined
  ): MenuProps = {
    val p = (new js.Object).asInstanceOf[MenuProps]
    p.as                 = as.toJs
    p.activeIndex        = activeIndex
    p.attached           = attached.toJs
    p.borderless         = borderless
    p.children           = children.toJs
    p.className          = className
    p.compact            = compact
    p.defaultActiveIndex = defaultActiveIndex
    p.fixed              = fixed.toJs
    p.floated            = floated.toJs
    p.fluid              = fluid
    p.icon               = icon.toJs
    p.inverted           = inverted
    p.onItemClick        = onItemClick.toJs
    p.pagination         = pagination
    p.pointing           = pointing
    p.secondary          = secondary
    p.size               = size.toJs
    p.stackable          = stackable
    p.tabular            = tabular.toJs
    p.text               = text
    p.vertical           = vertical
    p.widths             = widths.toJs
    p
  }

  private val component =
    JsComponent[MenuProps, Children.Varargs, Null](RawComponent)

  def apply(p: MenuProps, children: VdomNode*)
    : UnmountedMapped[Id, MenuProps, Null, RawMounted[MenuProps, Null], MenuProps, Null] =
    component(p)(children: _*)

  object Header {
    type OnClick = ReactEvent => Callback

    @js.native
    @JSImport("semantic-ui-react", "MenuHeader")
    object RawComponent extends js.Object

    @js.native
    trait HeaderProps extends js.Object {

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

      /** Shorthand for primary content. */
      var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
    }

    def props(
      as:        js.UndefOr[AsC]      = js.undefined,
      children:  js.UndefOr[VdomNode] = js.undefined,
      className: js.UndefOr[String]   = js.undefined,
      content:   js.UndefOr[VdomNode] = js.undefined,
    ): HeaderProps = {
      val p = (new js.Object).asInstanceOf[HeaderProps]
      p.as        = as.toJs
      p.children  = children.toJs
      p.className = className
      p.content   = content.toJs
      p
    }

    private val component =
      JsFnComponent[HeaderProps, Children.Varargs](RawComponent)

    def apply(p: HeaderProps, children: VdomNode*): UnmountedWithRoot[
      HeaderProps,
      Unit,
      HeaderProps
    ] =
      component(p)(children: _*)

  }

  object Item {
    type OnClick = ReactEvent => Callback

    @js.native
    @JSImport("semantic-ui-react", "MenuItem")
    object RawComponent extends js.Object

    @js.native
    trait ItemProps extends js.Object {

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
      var corner: js.UndefOr[Boolean]                          = js.native

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
      var position: js.UndefOr[String]                        = js.native
    }

    def props(
      as:        js.UndefOr[AsC]            = js.undefined,
      active:    js.UndefOr[Boolean]        = js.undefined,
      children:  js.UndefOr[VdomNode]       = js.undefined,
      className: js.UndefOr[String]         = js.undefined,
      color:     js.UndefOr[SemanticColor]  = js.undefined,
      content:   js.UndefOr[VdomNode]       = js.undefined,
      corner:    js.UndefOr[Boolean]        = js.undefined,
      disabled:  js.UndefOr[Boolean]        = js.undefined,
      fitted:    js.UndefOr[MenuItemFitted] = js.undefined,
      header:    js.UndefOr[Boolean]        = js.undefined,
      icon:      js.UndefOr[UnmountedIcon]  = js.undefined,
      index:     js.UndefOr[Int]            = js.undefined,
      link:      js.UndefOr[Boolean]        = js.undefined,
      name:      js.UndefOr[String]         = js.undefined,
      onClickE:  js.UndefOr[OnClick]        = js.undefined,
      onClick:   js.UndefOr[Callback]       = js.undefined,
      position:  js.UndefOr[String]         = js.undefined
    ): ItemProps = {
      val p = (new js.Object).asInstanceOf[ItemProps]
      p.as        = as.toJs
      p.active    = active
      p.children  = children.toJs
      p.className = className
      p.color     = color.toJs
      p.content   = content.toJs
      p.corner    = corner
      p.disabled  = disabled
      p.fitted    = fitted.toJs
      p.header    = header
      p.icon      = icon.map(_.props)
      p.index     = index
      p.link      = link
      p.name      = name
      p.onClick   = onClickE.toJs.orElse(onClick.toJsE)
      p.position  = position
      p
    }

    private val component =
      JsComponent[ItemProps, Children.Varargs, Null](RawComponent)

    def apply(p: ItemProps, children: VdomNode*)
      : UnmountedMapped[Id, ItemProps, Null, RawMounted[ItemProps, Null], ItemProps, Null] =
      component(p)(children: _*)

  }

  object Menu {
    type OnClick = ReactEvent => Callback

    @js.native
    @JSImport("semantic-ui-react", "MenuMenu")
    object RawComponent extends js.Object

    @js.native
    trait MenuProps extends js.Object {

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

      /** Shorthand for primary content. */
      var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

      /** A sub menu can take left or right position. */
      var position: js.UndefOr[String] = js.native
    }

    def props(
      as:        js.UndefOr[AsC]              = js.undefined,
      children:  js.UndefOr[VdomNode]         = js.undefined,
      className: js.UndefOr[String]           = js.undefined,
      content:   js.UndefOr[VdomNode]         = js.undefined,
      position:  js.UndefOr[MenuMenuPosition] = js.undefined,
    ): MenuProps = {
      val p = (new js.Object).asInstanceOf[MenuProps]
      p.as        = as.toJs
      p.children  = children.toJs
      p.className = className
      p.content   = content.toJs
      p.position  = position.toJs
      p
    }

    private val component =
      JsFnComponent[MenuProps, Children.Varargs](RawComponent)

    def apply(p: MenuProps, children: VdomNode*): UnmountedWithRoot[
      MenuProps,
      Unit,
      MenuProps
    ] =
      component(p)(children: _*)

  }
}
