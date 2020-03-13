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

final case class SidebarPushable(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[SidebarPushable.SidebarPushableProps, SidebarPushable] {
  override protected def cprops = SidebarPushable.props(this)
  @inline def renderWith        = SidebarPushable.component(SidebarPushable.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object SidebarPushable {
  @js.native
  @JSImport("semantic-ui-react", "SidebarPushable")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait SidebarPushableProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                           = js.native
    var children: js.UndefOr[React.Node]              = js.native
    var className: js.UndefOr[String]                 = js.native
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }

  def props(q: SidebarPushable): SidebarPushableProps =
    rawprops(q.as, q.child, q.className, q.content)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined
  ): SidebarPushableProps = {
    val p = as.toJsObject[SidebarPushableProps]
    p.as        = as.toJs
    p.children  = children.map(_.rawNode)
    p.className = className
    p.content   = content.map(_.rawNode)
    p
  }

  private val component =
    JsFnComponent[SidebarPushableProps, Children.Varargs](RawComponent)

  val Default: SidebarPushable = SidebarPushable()

  val defaultProps: SidebarPushableProps = props(Default)

  def apply(content: VdomNode*): SidebarPushable =
    new SidebarPushable(children = content)
}
