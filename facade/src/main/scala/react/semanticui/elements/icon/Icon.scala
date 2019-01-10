package react.semanticui.elements.icon

import scala.scalajs.js
import js.annotation._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import react.semanticui.colors._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React

object Icon {

  @js.native
  @JSImport("semantic-ui-react", "Icon")
  object RawComponent extends js.Object

  @js.native
  trait IconProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[js.Any]                   = js.native
    var bordered: js.UndefOr[Boolean]            = js.native
    var circular: js.UndefOr[Boolean]            = js.native
    var className: js.UndefOr[String]            = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native
    var corner: js.UndefOr[Boolean]              = js.native
    var disabled: js.UndefOr[Boolean]            = js.native
    var fitted: js.UndefOr[Boolean]              = js.native
    var flipped: js.UndefOr[String]              = js.native
    var inverted: js.UndefOr[Boolean]            = js.native
    var link: js.UndefOr[Boolean]                = js.native
    var loading: js.UndefOr[Boolean]             = js.native
    var name: js.UndefOr[suiraw.SemanticICONS]   = js.native
    var rotated: js.UndefOr[String]              = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES]   = js.native
    var `aria-label`: js.UndefOr[String]         = js.native
  }

  def props(
    as:        js.UndefOr[js.Any]               = js.undefined,
    bordered:  js.UndefOr[Boolean]              = js.undefined,
    circular:  js.UndefOr[Boolean]              = js.undefined,
    className: js.UndefOr[String]               = js.undefined,
    color:     js.UndefOr[SemanticColor]        = js.undefined,
    corner:    js.UndefOr[Boolean]              = js.undefined,
    disabled:  js.UndefOr[Boolean]              = js.undefined,
    fitted:    js.UndefOr[Boolean]              = js.undefined,
    flipped:   js.UndefOr[IconFlip]             = js.undefined,
    inverted:  js.UndefOr[Boolean]              = js.undefined,
    link:      js.UndefOr[Boolean]              = js.undefined,
    loading:   js.UndefOr[Boolean]              = js.undefined,
    name:      js.UndefOr[suiraw.SemanticICONS] = js.undefined,
    rotated:   js.UndefOr[IconRotated]          = js.undefined,
    size:      js.UndefOr[SemanticSize]         = js.undefined,
    ariaLabel: js.UndefOr[String]               = js.undefined
  ): IconProps = {
    val p = (new js.Object).asInstanceOf[IconProps]
    p.as           = as
    p.bordered     = bordered
    p.circular     = circular
    p.className    = className
    p.color        = color.toJs
    p.corner       = corner
    p.disabled     = disabled
    p.fitted       = fitted
    p.flipped      = flipped.toJs
    p.inverted     = inverted
    p.link         = link
    p.loading      = loading
    p.name         = name
    p.rotated      = rotated.toJs
    p.size         = size.toJs
    p.`aria-label` = ariaLabel
    p
  }

  private[semanticui] def rawprops(
    as:           js.UndefOr[js.Any]                = js.undefined,
    bordered:     js.UndefOr[Boolean]               = js.undefined,
    circular:     js.UndefOr[Boolean]               = js.undefined,
    className:    js.UndefOr[String]                = js.undefined,
    color:        js.UndefOr[suiraw.SemanticCOLORS] = js.undefined,
    corner:       js.UndefOr[Boolean]               = js.undefined,
    disabled:     js.UndefOr[Boolean]               = js.undefined,
    fitted:       js.UndefOr[Boolean]               = js.undefined,
    flipped:      js.UndefOr[String]                = js.undefined,
    inverted:     js.UndefOr[Boolean]               = js.undefined,
    link:         js.UndefOr[Boolean]               = js.undefined,
    loading:      js.UndefOr[Boolean]               = js.undefined,
    name:         js.UndefOr[suiraw.SemanticICONS]  = js.undefined,
    rotated:      js.UndefOr[String]                = js.undefined,
    size:         js.UndefOr[suiraw.SemanticSIZES]  = js.undefined,
    `aria-label`: js.UndefOr[String]                = js.undefined
  ): IconProps = {
    val p = (new js.Object).asInstanceOf[IconProps]
    p.as           = as
    p.bordered     = bordered
    p.circular     = circular
    p.className    = className
    p.color        = color
    p.corner       = corner
    p.disabled     = disabled
    p.fitted       = fitted
    p.flipped      = flipped
    p.inverted     = inverted
    p.link         = link
    p.loading      = loading
    p.name         = name
    p.rotated      = rotated
    p.size         = size
    p.`aria-label` = `aria-label`
    p
  }

  private val component =
    JsComponent[IconProps, Children.Varargs, Null](RawComponent)

  def apply(p: IconProps, children: VdomNode*)
    : UnmountedMapped[Id, IconProps, Null, RawMounted[IconProps, Null], IconProps, Null] =
    component(p)(children: _*)

  object Group {

    @js.native
    @JSImport("semantic-ui-react", "Icon.Group")
    object RawComponent extends js.Object

    @js.native
    trait GroupProps extends js.Object {

      @JSBracketAccess
      def apply(key: String): js.Any = js.native

      @JSBracketAccess
      def update(key: String, v: js.Any): Unit = js.native
      var as: js.UndefOr[js.Any]                 = js.native
      var children: js.UndefOr[React.Node]       = js.native
      var className: js.UndefOr[String]          = js.native
      var content: js.UndefOr[React.Node]        = js.native
      var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
    }

    def props(
      children:  js.UndefOr[VdomNode]     = js.undefined,
      as:        js.UndefOr[js.Any]       = js.undefined,
      className: js.UndefOr[String]       = js.undefined,
      content:   js.UndefOr[VdomNode]     = js.undefined,
      size:      js.UndefOr[SemanticSize] = js.undefined
    ): GroupProps =
      rawprops(as, children.map(_.rawNode), className, content.map(_.rawNode), size.map(_.value))

    private[semanticui] def rawprops(
      as:        js.UndefOr[js.Any]               = js.undefined,
      children:  js.UndefOr[React.Node]           = js.undefined,
      className: js.UndefOr[String]               = js.undefined,
      content:   js.UndefOr[React.Node]           = js.undefined,
      size:      js.UndefOr[suiraw.SemanticSIZES] = js.undefined
    ): GroupProps = {
      val p = (new js.Object).asInstanceOf[GroupProps]
      p.as        = as
      p.children  = children
      p.content   = content
      p.className = className
      p.content   = content
      p.size      = size
      p
    }

    private val component =
      JsComponent[GroupProps, Children.Varargs, Null](RawComponent)

    def apply(p: GroupProps, children: VdomNode*)
      : UnmountedMapped[Id, GroupProps, Null, RawMounted[GroupProps, Null], GroupProps, Null] =
      component(p)(children: _*)
  }
}
