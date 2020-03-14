package react.semanticui.elements.list

import japgolly.scalajs.react._
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.elements.icon._
import scala.scalajs.js
import js.annotation._

final case class ListIcon(
  as:            js.UndefOr[AsC]                       = js.undefined,
  bordered:      js.UndefOr[Boolean]                   = js.undefined,
  circular:      js.UndefOr[Boolean]                   = js.undefined,
  className:     js.UndefOr[String]                    = js.undefined,
  clazz:         js.UndefOr[Css]                       = js.undefined,
  color:         js.UndefOr[SemanticColor]             = js.undefined,
  corner:        js.UndefOr[IconCorner]                = js.undefined,
  disabled:      js.UndefOr[Boolean]                   = js.undefined,
  fitted:        js.UndefOr[Boolean]                   = js.undefined,
  flipped:       js.UndefOr[IconFlip]                  = js.undefined,
  inverted:      js.UndefOr[Boolean]                   = js.undefined,
  link:          js.UndefOr[Boolean]                   = js.undefined,
  loading:       js.UndefOr[Boolean]                   = js.undefined,
  name:          js.UndefOr[suiraw.SemanticICONS]      = js.undefined,
  rotated:       js.UndefOr[IconRotated]               = js.undefined,
  size:          js.UndefOr[SemanticSize]              = js.undefined,
  ariaLabel:     js.UndefOr[String]                    = js.undefined,
  verticalAlign: js.UndefOr[SemanticVerticalAlignment] = js.undefined
) extends GenericComponentP[ListIcon.ListIconProps] {
  override protected def cprops = ListIcon.props(this)
  @inline def render            = ListIcon.component(ListIcon.props(this))
}

object ListIcon {
  @js.native
  @JSImport("semantic-ui-react", "ListIcon")
  object RawComponent extends js.Object

  @js.native
  trait ListIconProps extends Icon.IconProps {

    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[suiraw.SemanticVERTICALALIGNMENTS] = js.native
  }

  def props(
    q: ListIcon
  ): ListIconProps = {
    val p = q.as.toJsObject[ListIconProps]
    p.as            = q.as.toJs
    p.bordered      = q.bordered
    p.circular      = q.circular
    p.className     = (q.className, q.clazz).toJs
    p.color         = q.color.toJs
    p.corner        = q.corner.toJs
    p.disabled      = q.disabled
    p.fitted        = q.fitted
    p.flipped       = q.flipped.toJs
    p.inverted      = q.inverted
    p.link          = q.link
    p.loading       = q.loading
    p.name          = q.name
    p.rotated       = q.rotated.toJs
    p.size          = q.size.toJs
    p.`aria-label`  = q.ariaLabel
    p.verticalAlign = q.verticalAlign.toJs
    p
  }

  private val component =
    JsComponent[ListIconProps, Children.None, Null](RawComponent)

  def apply(name: String): ListIcon =
    new ListIcon(as            = js.undefined,
                 bordered      = js.undefined,
                 circular      = js.undefined,
                 className     = js.undefined,
                 clazz         = js.undefined,
                 color         = js.undefined,
                 corner        = js.undefined,
                 disabled      = js.undefined,
                 fitted        = js.undefined,
                 flipped       = js.undefined,
                 inverted      = js.undefined,
                 link          = js.undefined,
                 loading       = js.undefined,
                 name          = name,
                 rotated       = js.undefined,
                 size          = js.undefined,
                 ariaLabel     = js.undefined,
                 verticalAlign = js.undefined)
}
