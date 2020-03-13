package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class DimmerDimmable(
  as:                    js.UndefOr[AsC]       = js.undefined,
  blurring:              js.UndefOr[Boolean]   = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  dimmed:                js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[DimmerDimmable.DimmerDimmableProps] {
  override def cprops = DimmerDimmable.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    DimmerDimmable.component(DimmerDimmable.props(this))
}

object DimmerDimmable {
  @js.native
  @JSImport("semantic-ui-react", "DimmerDimmable")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DimmerDimmableProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A dimmable element can blur its contents. */
    var blurring: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Controls whether or not the dim is displayed. */
    var dimmed: js.UndefOr[Boolean] = js.native
  }

  def props(q: DimmerDimmable): DimmerDimmableProps =
    rawprops(q.as, q.blurring, q.child, q.className, q.clazz, q.content, q.dimmed)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    blurring:  js.UndefOr[Boolean]  = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    dimmed:    js.UndefOr[Boolean]  = js.undefined
  ): DimmerDimmableProps = {
    val p = as.toJsObject[DimmerDimmableProps]
    p.as        = as.toJs
    p.blurring  = blurring
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.dimmed    = dimmed
    p
  }

  private val component =
    JsFnComponent[DimmerDimmableProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): DimmerDimmable =
    new DimmerDimmable(children = content)
}
