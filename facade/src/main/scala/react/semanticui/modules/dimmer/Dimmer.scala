package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import react.common._

final case class Dimmer(
  active: js.UndefOr[Boolean] = js.undefined,
  page:   js.UndefOr[Boolean] = js.undefined
) extends GenericComponentP[Dimmer.DimmerProps] {
  override protected def cprops = Dimmer.props(this)
  @inline def render            = Dimmer.component(Dimmer.props(this))
}

object Dimmer {
  @js.native
  @JSImport("semantic-ui-react", "Dimmer")
  object RawComponent extends js.Object

  @js.native
  trait DimmerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.native

    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.native
  }

  def props(q: Dimmer): DimmerProps =
    rawprops(q.active, q.page)

  def rawprops(
    active: js.UndefOr[Boolean] = js.undefined,
    page:   js.UndefOr[Boolean] = js.undefined
  ): DimmerProps = {
    val p = (new js.Object).asInstanceOf[DimmerProps]
    p.active = active
    p.page   = page
    p
  }

  private val component =
    JsComponent[DimmerProps, Children.None, Null](RawComponent)

}
