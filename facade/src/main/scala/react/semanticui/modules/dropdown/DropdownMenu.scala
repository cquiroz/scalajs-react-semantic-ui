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
import react.semanticui.raw._
import react.semanticui._

object DropdownMenu {
  @js.native
  @JSImport("semantic-ui-react", "DropdownMenu")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DropdownMenuProps extends js.Object {

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

    /** A dropdown menu can open to the left or to the right. */
    var direction: js.UndefOr[String] = js.native

    /** Whether or not the dropdown menu is displayed. */
    var open: js.UndefOr[Boolean] = js.native

    /** A dropdown menu can scroll. */
    var scrolling: js.UndefOr[Boolean] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]           = js.undefined,
    children:  js.UndefOr[VdomNode]      = js.undefined,
    className: js.UndefOr[String]        = js.undefined,
    content:   js.UndefOr[VdomNode]      = js.undefined,
    direction: js.UndefOr[MenuDirection] = js.undefined,
    open:      js.UndefOr[Boolean]       = js.undefined,
    scrolling: js.UndefOr[Boolean]       = js.undefined,
  ): DropdownMenuProps = {
    val p = as.toJsObject[DropdownMenuProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = className
    p.content   = content.toJs
    p.direction = direction.toJs
    p.open      = open
    p.scrolling = scrolling
    p
  }

  private val component =
    JsComponent[DropdownMenuProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        DropdownMenuProps,
    children: VdomNode*
  ): UnmountedMapped[Id,
                     DropdownMenuProps,
                     Null,
                     RawMounted[DropdownMenuProps, Null],
                     DropdownMenuProps,
                     Null] =
    component(p)(children: _*)

}
