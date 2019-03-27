package react.semanticui.elements.loader

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.sizes._

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
    as:            js.UndefOr[AsC]          = js.undefined,
    active:        js.UndefOr[Boolean]      = js.undefined,
    children:      js.UndefOr[VdomNode]     = js.undefined,
    className:     js.UndefOr[String]       = js.undefined,
    content:       js.UndefOr[VdomNode]     = js.undefined,
    disabled:      js.UndefOr[Boolean]      = js.undefined,
    indeterminate: js.UndefOr[Boolean]      = js.undefined,
    inline:        js.UndefOr[LoaderInline] = js.undefined,
    inverted:      js.UndefOr[Boolean]      = js.undefined,
    size:          js.UndefOr[SemanticSize] = js.undefined,
  ): LoaderProps = {
    val p = as.toJsObject[LoaderProps]
    p.as            = as.toJs
    p.active        = active
    p.children      = children.toJs
    p.className     = className
    p.content       = content.toJs
    p.disabled      = disabled
    p.indeterminate = indeterminate
    p.inline        = inline.toJs
    p.inverted      = inverted
    p.size          = size.toJs
    p
  }

  private val component =
    JsFnComponent[LoaderProps, Children.Varargs](RawComponent)

  def apply(p:        LoaderProps,
            children: VdomNode*): UnmountedWithRoot[LoaderProps, Unit, LoaderProps] =
    component(p)(children: _*)
}
