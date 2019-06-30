package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

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

  def props(
    as:        js.UndefOr[AsC]      = js.undefined,
    blurring:  js.UndefOr[Boolean]  = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    dimmed:    js.UndefOr[Boolean]  = js.undefined
  ): DimmerDimmableProps = {
    val p = (new js.Object).asInstanceOf[DimmerDimmableProps]
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

  def apply(p: DimmerDimmableProps, children: VdomNode*): UnmountedWithRoot[
    DimmerDimmableProps,
    Unit,
    DimmerDimmableProps
  ] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedWithRoot[
    DimmerDimmableProps,
    Unit,
    DimmerDimmableProps
  ] =
    component(props())(children: _*)

}
