package react.semanticui.modules.tab

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.raw._

final case class TabPane(
  as:                    js.UndefOr[AsC]       = js.undefined,
  active:                js.UndefOr[Boolean]   = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  loading:               js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[TabPane.TabPaneProps, TabPane] {
  override protected def cprops = TabPane.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    TabPane.component(TabPane.props(this))
}

object TabPane {
  @js.native
  @JSImport("semantic-ui-react", "TabPane")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait TabPaneProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A tab pane can be active. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native

    /** Additional classes. */
    var loading: js.UndefOr[Boolean] = js.native
  }

  def props(
    q: TabPane
  ): TabPaneProps = {
    val p = q.as.toJsObject[TabPaneProps]
    p.as        = q.as.toJs
    p.active    = q.active
    p.children  = q.child.toJs
    p.className = (q.className, q.clazz).toJs
    p.content   = q.content.toJs
    p.loading   = q.loading
    p
  }

  private val component =
    JsFnComponent[TabPaneProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): TabPane =
    new TabPane(children = content)
}
