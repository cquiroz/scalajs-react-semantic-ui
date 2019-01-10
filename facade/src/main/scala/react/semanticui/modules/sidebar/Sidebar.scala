package react.semanticui.modules.sidebar

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui.raw._
import react.semanticui._

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
    var as: js.UndefOr[js.Any]                             = js.native
    var animation: js.UndefOr[String]                      = js.native
    var children: js.UndefOr[React.Node]                   = js.native
    var className: js.UndefOr[String]                      = js.native
    var content: js.UndefOr[SemanticShorthandContent]      = js.native
    var direction: js.UndefOr[String]                      = js.native
    var onHide: js.UndefOr[js.Function1[ReactEvent, Unit]] = js.native
    var onHidden: js.UndefOr[js.Function0[Unit]]           = js.native
    var onShow: js.UndefOr[js.Function0[Unit]]             = js.native
    var onVisible: js.UndefOr[js.Function0[Unit]]          = js.native
    // var target: js.UndefOr[js.Object] = js.native
    var visible: js.UndefOr[Boolean] = js.native
    var width: js.UndefOr[String]    = js.native
  }

  def props(
    as:        js.UndefOr[js.Any]           = js.undefined,
    animation: js.UndefOr[SidebarAnimation] = js.undefined,
    children:  js.UndefOr[VdomNode]         = js.undefined,
    className: js.UndefOr[String]           = js.undefined,
    content:   js.UndefOr[VdomNode]         = js.undefined,
    direction: js.UndefOr[SidebarDirection] = js.undefined,
    onHide:    js.UndefOr[OnHide]           = js.undefined,
    onHidden:  js.UndefOr[Callback]         = js.undefined,
    onShow:    js.UndefOr[Callback]         = js.undefined,
    onVisible: js.UndefOr[Callback]         = js.undefined,
    visible:   js.UndefOr[Boolean]          = js.undefined,
    width:     js.UndefOr[SidebarWidth]     = js.undefined
  ): SidebarProps = {
    val p = (new js.Object).asInstanceOf[SidebarProps]
    p.as        = as
    p.children  = children.toJs
    p.animation = animation.toJs
    p.className = className
    p.content   = content.toJs
    p.direction = direction.toJs
    p.onHide    = onHide.toJs
    p.onHidden  = onHidden.toJs
    p.onShow    = onShow.toJs
    p.onVisible = onVisible.toJs
    p.visible   = visible
    p.width     = width.toJs
    p
  }

  private val component =
    JsComponent[SidebarProps, Children.Varargs, Null](RawComponent)

  def apply(p: SidebarProps, children: VdomNode*)
    : UnmountedMapped[Id, SidebarProps, Null, RawMounted[SidebarProps, Null], SidebarProps, Null] =
    component(p)(children: _*)

  object Pushable {
    @js.native
    @JSImport("semantic-ui-react", "SidebarPushable")
    object RawComponent extends js.Object

    @js.native
    trait PushableProps extends js.Object {

      @JSBracketAccess
      def apply(key: String): js.Any = js.native

      @JSBracketAccess
      def update(key: String, v: js.Any): Unit = js.native
      var as: js.UndefOr[js.Any]                        = js.native
      var children: js.UndefOr[React.Node]              = js.native
      var className: js.UndefOr[String]                 = js.native
      var content: js.UndefOr[SemanticShorthandContent] = js.native
    }

    def props(
      as:        js.UndefOr[js.Any]   = js.undefined,
      children:  js.UndefOr[VdomNode] = js.undefined,
      className: js.UndefOr[String]   = js.undefined,
      content:   js.UndefOr[VdomNode] = js.undefined
    ): PushableProps = {
      val p = (new js.Object).asInstanceOf[PushableProps]
      p.as        = as
      p.children  = children.map(_.rawNode)
      p.className = className
      p.content   = content.map(_.rawNode)
      p
    }

    private val component =
      JsFnComponent[PushableProps, Children.Varargs](RawComponent)

    def apply(p: PushableProps, children: VdomNode*): UnmountedWithRoot[
      PushableProps,
      Unit,
      PushableProps,
    ] =
      component(p)(children: _*)
  }

  object Pusher {
    @js.native
    @JSImport("semantic-ui-react", "SidebarPusher")
    object RawComponent extends js.Object

    @js.native
    trait PusherProps extends js.Object {

      @JSBracketAccess
      def apply(key: String): js.Any = js.native

      @JSBracketAccess
      def update(key: String, v: js.Any): Unit = js.native
      var as: js.UndefOr[js.Any]                        = js.native
      var children: js.UndefOr[React.Node]              = js.native
      var className: js.UndefOr[String]                 = js.native
      var content: js.UndefOr[SemanticShorthandContent] = js.native
    }

    def props(
      as:        js.UndefOr[js.Any]   = js.undefined,
      children:  js.UndefOr[VdomNode] = js.undefined,
      className: js.UndefOr[String]   = js.undefined,
      content:   js.UndefOr[VdomNode] = js.undefined
    ): PusherProps = {
      val p = (new js.Object).asInstanceOf[PusherProps]
      p.as        = as
      p.children  = children.map(_.rawNode)
      p.className = className
      p.content   = content.map(_.rawNode)
      p
    }

    private val component =
      JsFnComponent[PusherProps, Children.Varargs](RawComponent)

    def apply(p: PusherProps, children: VdomNode*): UnmountedWithRoot[
      PusherProps,
      Unit,
      PusherProps,
    ] =
      component(p)(children: _*)
  }

}
