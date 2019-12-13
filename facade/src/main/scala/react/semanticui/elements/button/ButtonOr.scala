package react.semanticui.elements.button

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui._
import react.common.style._
import react.common.syntax._

object ButtonOr {
  @js.native
  @JSImport("semantic-ui-react", "ButtonOr")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }
  @js.native
  trait ButtonOrProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Or buttons can have their text localized, or adjusted by using the text prop. */
    var text: js.UndefOr[JsNumber | String] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]               = js.undefined,
    className: js.UndefOr[String]            = js.undefined,
    clazz:     js.UndefOr[Css]               = js.undefined,
    text:      js.UndefOr[JsNumber | String] = js.undefined
  ): ButtonOrProps = {
    val p = as.toJsObject[ButtonOrProps]
    p.as        = as.toJs
    p.className = (className, clazz).toJs
    p.text      = text
    p
  }

  private val component =
    JsComponent[ButtonOrProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        ButtonOrProps,
    children: VdomNode*
  ): UnmountedMapped[Id, ButtonOrProps, Null, RawMounted[ButtonOrProps, Null], ButtonOrProps, Null] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedMapped[Id, ButtonOrProps, Null, RawMounted[
    ButtonOrProps,
    Null
  ], ButtonOrProps, Null] =
    component(props())(children: _*)
}
