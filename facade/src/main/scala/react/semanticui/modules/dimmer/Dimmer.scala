package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import react.common._

final case class Dimmer(
  active:                js.UndefOr[Boolean]   = js.undefined,
  page:                  js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericComponentPC[Dimmer.DimmerProps] {
  @inline def renderWith = Dimmer.component(Dimmer.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
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
    JsComponent[DimmerProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): Dimmer =
    new Dimmer(children = content)
}
