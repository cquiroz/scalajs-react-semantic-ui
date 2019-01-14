package react.semanticui.collections.menu

import scala.scalajs.js
import js.annotation._
import react.common.syntax._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React

object MenuHeader {
  type OnClick = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "MenuHeader")
  object RawComponent extends js.Object

  @js.native
  trait MenuHeaderProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
  ): MenuHeaderProps = {
    val p = (new js.Object).asInstanceOf[MenuHeaderProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = className
    p.content   = content.toJs
    p
  }

  private val component =
    JsFnComponent[MenuHeaderProps, Children.Varargs](RawComponent)

  def apply(p: MenuHeaderProps, children: VdomNode*): UnmountedWithRoot[
    MenuHeaderProps,
    Unit,
    MenuHeaderProps
  ] =
    component(p)(children: _*)

}
