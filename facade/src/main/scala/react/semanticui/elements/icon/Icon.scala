package react.semanticui.elements.icon

import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import react.semanticui.colors._
import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._

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
    var as: js.UndefOr[AsT]                      = js.native
    var bordered: js.UndefOr[Boolean]            = js.native
    var circular: js.UndefOr[Boolean]            = js.native
    var className: js.UndefOr[String]            = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native
    var corner: js.UndefOr[Boolean | String]     = js.native
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
    as:        js.UndefOr[AsC]                  = js.undefined,
    bordered:  js.UndefOr[Boolean]              = js.undefined,
    circular:  js.UndefOr[Boolean]              = js.undefined,
    className: js.UndefOr[String]               = js.undefined,
    clazz:     js.UndefOr[Css]                  = js.undefined,
    color:     js.UndefOr[SemanticColor]        = js.undefined,
    corner:    js.UndefOr[IconCorner]           = js.undefined,
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
    val p = as.toJsObject[IconProps]
    p.as           = as.toJs
    p.bordered     = bordered
    p.circular     = circular
    p.className    = (className, clazz).toJs
    p.color        = color.toJs
    p.corner       = corner.toJs
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
    as:           js.UndefOr[AsT]                   = js.undefined,
    bordered:     js.UndefOr[Boolean]               = js.undefined,
    circular:     js.UndefOr[Boolean]               = js.undefined,
    className:    js.UndefOr[String]                = js.undefined,
    clazz:        js.UndefOr[Css]                   = js.undefined,
    color:        js.UndefOr[suiraw.SemanticCOLORS] = js.undefined,
    corner:       js.UndefOr[Boolean | String]      = js.undefined,
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
    p.as        = as
    p.bordered  = bordered
    p.circular  = circular
    p.className = (className, clazz).toJs

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

  def apply(
    p:        IconProps,
    children: VdomNode*
  ): UnmountedMapped[Id, IconProps, Null, RawMounted[IconProps, Null], IconProps, Null] =
    component(p)(children: _*)

  def apply(
    name:     String,
    children: VdomNode*
  ): UnmountedMapped[Id, IconProps, Null, RawMounted[IconProps, Null], IconProps, Null] =
    component(props(name = name))(children: _*)
}
