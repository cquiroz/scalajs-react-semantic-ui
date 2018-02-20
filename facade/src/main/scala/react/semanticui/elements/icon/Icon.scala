package react.semanticui.elements.icon

import scala.scalajs.js
import js.annotation._
import react.semanticui._
import react.semanticui.sizes._
import react.semanticui.colors._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.{RawMounted, UnmountedMapped}
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.ReactNode

sealed trait IconFlip {
  val value: String
}
case object Horizontally extends IconFlip {
  val value = "horizontally"
}
case object Vertically extends IconFlip {
  val value = "vertically"
}

sealed trait IconRotated {
  val value: String
}
case object Clockwise extends IconRotated {
  val value = "clockwise"
}
case object CounterClockwise extends IconRotated {
  val value = "counterclockwise"
}

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
    var as: js.UndefOr[js.Any]               = js.native
    var bordered: js.UndefOr[Boolean]        = js.native
    var circular: js.UndefOr[Boolean]        = js.native
    var className: js.UndefOr[String]        = js.native
    var color: js.UndefOr[SemanticCOLORS]    = js.native
    var corner: js.UndefOr[Boolean]          = js.native
    var disabled: js.UndefOr[Boolean]        = js.native
    var fitted: js.UndefOr[Boolean]          = js.native
    var flipped: js.UndefOr[String]          = js.native
    var inverted: js.UndefOr[Boolean]        = js.native
    var link: js.UndefOr[Boolean]            = js.native
    var loading: js.UndefOr[Boolean]         = js.native
    var name: js.UndefOr[SemanticICONS]      = js.native
    var rotated: js.UndefOr[String]          = js.native
    var size: js.UndefOr[IconSizeProp]       = js.native
  }

  def props(
      as: js.UndefOr[js.Any] = js.undefined,
      bordered: js.UndefOr[Boolean] = js.undefined,
      circular: js.UndefOr[Boolean] = js.undefined,
      className: js.UndefOr[String] = js.undefined,
      color: js.UndefOr[SemanticColor] = js.undefined,
      corner: js.UndefOr[Boolean] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      fitted: js.UndefOr[Boolean] = js.undefined,
      flipped: js.UndefOr[IconFlip] = js.undefined,
      inverted: js.UndefOr[Boolean] = js.undefined,
      link: js.UndefOr[Boolean] = js.undefined,
      loading: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[SemanticICONS] = js.undefined,
      rotated: js.UndefOr[IconRotated] = js.undefined,
      size: js.UndefOr[SemanticSize] = js.undefined
  ): IconProps = {
    val p = (new js.Object).asInstanceOf[IconProps]
    p.as = as
    p.bordered = bordered
    p.circular = circular
    p.className = className
    p.color = color.map(_.value)
    p.corner = corner
    p.disabled = disabled
    p.fitted = fitted
    p.flipped = flipped.map(_.value)
    p.inverted = inverted
    p.link = link
    p.loading = loading
    p.name = name
    p.rotated = rotated.map(_.value)
    p.size = size.map(_.value)
    p
  }

  private[semanticui] def rawprops(
      as: js.UndefOr[js.Any] = js.undefined,
      bordered: js.UndefOr[Boolean] = js.undefined,
      circular: js.UndefOr[Boolean] = js.undefined,
      className: js.UndefOr[String] = js.undefined,
      color: js.UndefOr[SemanticCOLORS] = js.undefined,
      corner: js.UndefOr[Boolean] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      fitted: js.UndefOr[Boolean] = js.undefined,
      flipped: js.UndefOr[String] = js.undefined,
      inverted: js.UndefOr[Boolean] = js.undefined,
      link: js.UndefOr[Boolean] = js.undefined,
      loading: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[SemanticICONS] = js.undefined,
      rotated: js.UndefOr[String] = js.undefined,
      size: js.UndefOr[IconSizeProp] = js.undefined
  ): IconProps = {
    val p = (new js.Object).asInstanceOf[IconProps]
    p.as = as
    p.bordered = bordered
    p.circular = circular
    p.className = className
    p.color = color
    p.corner = corner
    p.disabled = disabled
    p.fitted = fitted
    p.flipped = flipped
    p.inverted = inverted
    p.link = link
    p.loading = loading
    p.name = name
    p.rotated = rotated
    p.size = size
    p
  }

  private val component = JsComponent[IconProps, Children.Varargs, Null](RawComponent)

  def apply(
      p: IconProps,
      children: VdomNode*): UnmountedMapped[Id, IconProps, Null, RawMounted, IconProps, Null] =
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
      var as: js.UndefOr[js.Any]               = js.native
      var children: js.UndefOr[ReactNode]      = js.native
      var className: js.UndefOr[String]        = js.native
      var content: js.UndefOr[ReactNode]       = js.native
      var size: js.UndefOr[IconSizeProp]       = js.native
    }

    def props(
        children: js.UndefOr[VdomNode] = js.undefined,
        as: js.UndefOr[js.Any] = js.undefined,
        className: js.UndefOr[String] = js.undefined,
        content: js.UndefOr[VdomNode] = js.undefined,
        size: js.UndefOr[SemanticSize] = js.undefined
    ): GroupProps =
      rawprops(as, children.map(_.rawNode), className, content.map(_.rawNode), size.map(_.value))

    private[semanticui] def rawprops(
        as: js.UndefOr[js.Any] = js.undefined,
        children: js.UndefOr[ReactNode] = js.undefined,
        className: js.UndefOr[String] = js.undefined,
        content: js.UndefOr[ReactNode] = js.undefined,
        size: js.UndefOr[IconSizeProp] = js.undefined
    ): GroupProps = {
      val p = (new js.Object).asInstanceOf[GroupProps]
      p.as = as
      p.children = children
      p.content = content
      p.className = className
      p.content = content
      p.size = size
      p
    }

    private val component = JsComponent[GroupProps, Children.Varargs, Null](RawComponent)

    def apply(p: GroupProps, children: VdomNode*)
      : UnmountedMapped[Id, GroupProps, Null, RawMounted, GroupProps, Null] =
      component(p)(children: _*)
  }
}
