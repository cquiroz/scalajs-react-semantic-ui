package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui._

object DropdownDivider {
  type OnHide = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "DropdownDivider")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DropdownDividerProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]           = js.native
    var className: js.UndefOr[String] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]    = js.undefined,
    className: js.UndefOr[String] = js.undefined,
  ): DropdownDividerProps = {
    val p = as.toJsObject[DropdownDividerProps]
    p.as        = as.toJs
    p.className = className
    p
  }

  private val component =
    JsFnComponent[DropdownDividerProps, Children.Varargs](RawComponent)

  def apply(
    p:        DropdownDividerProps,
    children: VdomNode*): UnmountedWithRoot[DropdownDividerProps, Unit, DropdownDividerProps] =
    component(p)(children: _*)

}
