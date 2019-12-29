package react.semanticui.modules.sidebar

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common._
import react.semanticui.raw._
import react.semanticui._

final case class SidebarPusher(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  dimmed:                js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[SidebarPusher.SidebarPusherProps] {
  @inline def renderWith = SidebarPusher.component(SidebarPusher.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object SidebarPusher {
  @js.native
  @JSImport("semantic-ui-react", "SidebarPusher")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait SidebarPusherProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                           = js.native
    var children: js.UndefOr[React.Node]              = js.native
    var className: js.UndefOr[String]                 = js.native
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    var dimmed: js.UndefOr[Boolean]                   = js.native
  }

  def props(q: SidebarPusher): SidebarPusherProps =
    rawprops(q.as, q.child, q.className, q.content, q.dimmed)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    dimmed:    js.UndefOr[Boolean]  = js.undefined
  ): SidebarPusherProps = {
    val p = as.toJsObject[SidebarPusherProps]
    p.as        = as.toJs
    p.children  = children.map(_.rawNode)
    p.className = className
    p.content   = content.map(_.rawNode)
    p.dimmed    = dimmed
    p
  }

  private val component =
    JsFnComponent[SidebarPusherProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): SidebarPusher =
    new SidebarPusher(children = content)
}
