package react.semanticui.modules.tab

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.raw._

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
    as:        js.UndefOr[AsC]      = js.undefined,
    active:    js.UndefOr[Boolean]  = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    loading:   js.UndefOr[Boolean]  = js.undefined,
  ): TabPaneProps = {
    val p = as.toJsObject[TabPaneProps]
    p.as        = as.toJs
    p.active    = active
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.loading   = loading
    p
  }

  private val component =
    JsFnComponent[TabPaneProps, Children.Varargs](RawComponent)

  def apply(p:        TabPaneProps,
            children: VdomNode*): UnmountedWithRoot[TabPaneProps, Unit, TabPaneProps] =
    component(p)(children: _*)

}
