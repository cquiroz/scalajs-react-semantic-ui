package react.semanticui.elements.loader

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.sizes._

final case class Loader(
  as:                    js.UndefOr[AsC]          = js.undefined,
  active:                js.UndefOr[Boolean]      = js.undefined,
  child:                 js.UndefOr[VdomNode]     = js.undefined,
  className:             js.UndefOr[String]       = js.undefined,
  clazz:                 js.UndefOr[Css]          = js.undefined,
  content:               js.UndefOr[VdomNode]     = js.undefined,
  disabled:              js.UndefOr[Boolean]      = js.undefined,
  indeterminate:         js.UndefOr[Boolean]      = js.undefined,
  inline:                js.UndefOr[LoaderInline] = js.undefined,
  inverted:              js.UndefOr[Boolean]      = js.undefined,
  size:                  js.UndefOr[SemanticSize] = js.undefined,
  override val children: CtorType.ChildrenArgs    = Seq.empty
) extends GenericFnComponentPC[Loader.LoaderProps] {
  override def cprops = Loader.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    Loader.component(Loader.props(this))
}

object Loader {
  @js.native
  @JSImport("semantic-ui-react", "Loader")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait LoaderProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A loader can be active or visible. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** A loader can be disabled or hidden. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** A loader can show it's unsure of how long a task will take. */
    var indeterminate: js.UndefOr[Boolean] = js.native

    /** Loaders can appear inline with content. */
    var inline: js.UndefOr[Boolean | String] = js.native

    /** Loaders can have their colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Loaders can have different sizes. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
  }

  def props(
    q: Loader
  ): LoaderProps = {
    val p = q.as.toJsObject[LoaderProps]
    p.as            = q.as.toJs
    p.active        = q.active
    p.children      = q.child.toJs
    p.className     = (q.className, q.clazz).toJs
    p.content       = q.content.toJs
    p.disabled      = q.disabled
    p.indeterminate = q.indeterminate
    p.inline        = q.inline.toJs
    p.inverted      = q.inverted
    p.size          = q.size.toJs
    p
  }

  private val component =
    JsFnComponent[LoaderProps, Children.Varargs](RawComponent)

  val Default: Loader = Loader()

  val defaultProps: LoaderProps = props(Default)

  def apply(
    content: VdomNode*
  ): Loader =
    new Loader(children = content)
}
