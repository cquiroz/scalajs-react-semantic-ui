package react.semanticui.modules.sidebar

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.raw._
import react.semanticui._
import japgolly.scalajs.react.vdom.TagMod

final case class Sidebar(
  as:                     js.UndefOr[AsC]              = js.undefined,
  animation:              js.UndefOr[SidebarAnimation] = js.undefined,
  className:              js.UndefOr[String]           = js.undefined,
  clazz:                  js.UndefOr[Css]              = js.undefined,
  content:                js.UndefOr[VdomNode]         = js.undefined,
  direction:              js.UndefOr[SidebarDirection] = js.undefined,
  onHideE:                js.UndefOr[Sidebar.OnHide]   = js.undefined,
  onHide:                 js.UndefOr[Callback]         = js.undefined,
  onHidden:               js.UndefOr[Callback]         = js.undefined,
  onShow:                 js.UndefOr[Callback]         = js.undefined,
  onVisible:              js.UndefOr[Callback]         = js.undefined,
  target:                 js.UndefOr[Ref]              = js.undefined,
  visible:                js.UndefOr[Boolean]          = js.undefined,
  width:                  js.UndefOr[SidebarWidth]     = js.undefined,
  override val modifiers: Seq[TagMod]                  = Seq.empty
) extends GenericComponentPAC[Sidebar.SidebarProps, Sidebar] {
  override protected def cprops    = Sidebar.props(this)
  override protected val component = Sidebar.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Sidebar {
  type OnHide = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "Sidebar")
  object RawComponent extends js.Object

  @js.native
  trait SidebarProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                                = js.native
    var animation: js.UndefOr[String]                      = js.native
    var children: js.UndefOr[React.Node]                   = js.native
    var className: js.UndefOr[String]                      = js.native
    var content: js.UndefOr[SemanticShorthandContent]      = js.native
    var direction: js.UndefOr[String]                      = js.native
    var onHide: js.UndefOr[js.Function1[ReactEvent, Unit]] = js.native
    var onHidden: js.UndefOr[js.Function0[Unit]]           = js.native
    var onShow: js.UndefOr[js.Function0[Unit]]             = js.native
    var onVisible: js.UndefOr[js.Function0[Unit]]          = js.native
    var target: js.UndefOr[js.Object | Ref]                = js.native
    var visible: js.UndefOr[Boolean]                       = js.native
    var width: js.UndefOr[String]                          = js.native
  }

  def props(q: Sidebar): SidebarProps =
    rawprops(q.as,
             q.animation,
             q.className,
             q.clazz,
             q.content,
             q.direction,
             q.onHideE,
             q.onHide,
             q.onHidden,
             q.onShow,
             q.onVisible,
             q.target,
             q.visible,
             q.width)

  def rawprops(
    as:        js.UndefOr[AsC]              = js.undefined,
    animation: js.UndefOr[SidebarAnimation] = js.undefined,
    className: js.UndefOr[String]           = js.undefined,
    clazz:     js.UndefOr[Css]              = js.undefined,
    content:   js.UndefOr[VdomNode]         = js.undefined,
    direction: js.UndefOr[SidebarDirection] = js.undefined,
    onHideE:   js.UndefOr[OnHide]           = js.undefined,
    onHide:    js.UndefOr[Callback]         = js.undefined,
    onHidden:  js.UndefOr[Callback]         = js.undefined,
    onShow:    js.UndefOr[Callback]         = js.undefined,
    onVisible: js.UndefOr[Callback]         = js.undefined,
    target:    js.UndefOr[Ref]              = js.undefined,
    visible:   js.UndefOr[Boolean]          = js.undefined,
    width:     js.UndefOr[SidebarWidth]     = js.undefined
  ): SidebarProps = {
    val p = as.toJsObject[SidebarProps]
    p.as        = as.toJs
    p.animation = animation.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.direction = direction.toJs
    p.onHide    = (onHideE, onHide).toJs
    p.onHidden  = onHidden.toJs
    p.onShow    = onShow.toJs
    p.onVisible = onVisible.toJs
    p.target    = target
    p.visible   = visible
    p.width     = width.toJs
    p
  }

  private val component =
    JsComponent[SidebarProps, Children.Varargs, Null](RawComponent)

  def apply(modifiers: TagMod*): Sidebar =
    new Sidebar(modifiers = modifiers)

}
