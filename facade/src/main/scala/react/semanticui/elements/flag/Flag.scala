package react.semanticui.elements.flag

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui._
import react.common.style._
import react.common.syntax._

object Flag {

  @js.native
  @JSImport("semantic-ui-react", "Flag")
  private[semanticui] object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait FlagProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Flag name, can use the two digit country code, the full name, or a common alias. */
    var name: js.UndefOr[String] = js.native
  }

  def props(
    as:        js.UndefOr[AsC] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    clazz:     js.UndefOr[Css] = js.undefined,
    name:      js.UndefOr[String]
  ): FlagProps = {
    val p = as.toJsObject[FlagProps]
    p.as        = as.toJs
    p.className = (className, clazz).toJs
    p.name      = name
    p
  }

  private val component =
    JsComponent[FlagProps, Children.Varargs, Null](RawComponent)

  def apply(p: FlagProps, children: VdomNode*)
    : UnmountedMapped[Id, FlagProps, Null, RawMounted[FlagProps, Null], FlagProps, Null] =
    component(p)(children: _*)
}
