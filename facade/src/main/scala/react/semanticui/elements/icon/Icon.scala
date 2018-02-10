package react.semanticui.elements.icon

import scala.scalajs.js
import js.annotation._
import react.semanticui._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.{RawMounted, UnmountedMapped}
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode

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
    var as: js.UndefOr[js.Any] = js.native
    var bordered: js.UndefOr[Boolean] = js.native
    var circular: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var color: js.UndefOr[SemanticCOLORS] = js.native
    var corner: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var fitted: js.UndefOr[Boolean] = js.native
    var flipped: js.UndefOr[String] = js.native
    var inverted: js.UndefOr[Boolean] = js.native
    var link: js.UndefOr[Boolean] = js.native
    var loading: js.UndefOr[Boolean] = js.native
    var name: js.UndefOr[SemanticICONS] = js.native
    var rotated: js.UndefOr[String] = js.native
    var size: js.UndefOr[IconSizeProp] = js.native
  }

  def props(
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

  def apply(p: IconProps, children: VdomNode*): UnmountedMapped[Id, IconProps, Null, RawMounted, IconProps, Null] = component(p)(children: _*)
}
