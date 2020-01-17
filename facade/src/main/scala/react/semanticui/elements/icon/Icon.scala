package react.semanticui.elements.icon

import japgolly.scalajs.react._
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._

final case class Icon(
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
) extends GenericComponentP[Icon.IconProps] {
  override def cprops = Icon.props(this)
  @inline def render  = Icon.component(Icon.props(this))
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
    q: Icon
  ): IconProps = {
    val p = q.as.toJsObject[IconProps]
    p.as           = q.as.toJs
    p.bordered     = q.bordered
    p.circular     = q.circular
    p.className    = (q.className, q.clazz).toJs
    p.color        = q.color.toJs
    p.corner       = q.corner.toJs
    p.disabled     = q.disabled
    p.fitted       = q.fitted
    p.flipped      = q.flipped.toJs
    p.inverted     = q.inverted
    p.link         = q.link
    p.loading      = q.loading
    p.name         = q.name
    p.rotated      = q.rotated.toJs
    p.size         = q.size.toJs
    p.`aria-label` = q.ariaLabel
    p
  }

  private val component =
    JsComponent[IconProps, Children.None, Null](RawComponent)

  def apply(name: String): Icon =
    new Icon(as        = js.undefined,
             bordered  = js.undefined,
             circular  = js.undefined,
             className = js.undefined,
             clazz     = js.undefined,
             color     = js.undefined,
             corner    = js.undefined,
             disabled  = js.undefined,
             fitted    = js.undefined,
             flipped   = js.undefined,
             inverted  = js.undefined,
             link      = js.undefined,
             loading   = js.undefined,
             name      = name,
             rotated   = js.undefined,
             size      = js.undefined,
             ariaLabel = js.undefined)
}
