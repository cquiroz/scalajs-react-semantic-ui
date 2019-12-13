package react.semanticui.elements.container

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.textalignment._

object Container {
  @js.native
  @JSImport("semantic-ui-react", "Container")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ContainerProps extends js.Object {
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

    /** Container has no maximum width. */
    var fluid: js.UndefOr[Boolean] = js.native

    /** Reduce maximum width to more naturally accommodate text. */
    var text: js.UndefOr[Boolean] = js.native

    /** Align container text. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]                   = js.undefined,
    children:  js.UndefOr[VdomNode]              = js.undefined,
    className: js.UndefOr[String]                = js.undefined,
    clazz:     js.UndefOr[Css]                   = js.undefined,
    content:   js.UndefOr[VdomNode]              = js.undefined,
    fluid:     js.UndefOr[Boolean]               = js.undefined,
    text:      js.UndefOr[Boolean]               = js.undefined,
    textAlign: js.UndefOr[SemanticTextAlignment] = js.undefined
  ): ContainerProps = {
    val p = as.toJsObject[ContainerProps]
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.fluid     = fluid
    p.text      = text
    p.textAlign = textAlign.toJs
    p
  }

  private val component =
    JsFnComponent[ContainerProps, Children.Varargs](RawComponent)

  def apply(
    p:        ContainerProps,
    children: VdomNode*
  ): UnmountedWithRoot[ContainerProps, Unit, ContainerProps] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedWithRoot[ContainerProps, Unit, ContainerProps] =
    component(props())(children: _*)
}
