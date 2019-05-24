package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.semanticui.{ raw => suiraw }
import react.semanticui.raw._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon
import react.semanticui._

object DropdownHeader {
  @js.native
  @JSImport("semantic-ui-react", "DropdownHeader")
  object RawComponent extends js.Object

  @js.native
  trait DropdownHeaderProps extends js.Object {

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
    var content: js.UndefOr[SemanticShorthandContent] = js.native

    /** Shorthand for Icon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]           = js.undefined,
    children:  js.UndefOr[VdomNode]      = js.undefined,
    className: js.UndefOr[String]        = js.undefined,
    content:   js.UndefOr[VdomNode]      = js.undefined,
    icon:      js.UndefOr[UnmountedIcon] = js.undefined,
  ): DropdownHeaderProps = {
    val p = as.toJsObject[DropdownHeaderProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = className
    p.content   = content.toJs
    p.icon      = icon.map(_.props)
    p
  }

  private val component =
    JsComponent[DropdownHeaderProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        DropdownHeaderProps,
    children: VdomNode*
  ): UnmountedMapped[Id,
                     DropdownHeaderProps,
                     Null,
                     RawMounted[DropdownHeaderProps, Null],
                     DropdownHeaderProps,
                     Null] =
    component(p)(children: _*)

}
