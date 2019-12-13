package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui._
import react.common.style._
import react.common.syntax._

object DropdownSearchInput {
  @js.native
  @JSImport("semantic-ui-react", "DropdownSearchInput")
  object RawComponent extends js.Object

  @js.native
  trait DropdownSearchInputProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** An input can have the auto complete. */
    var autoComplete: js.UndefOr[String] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** An input can receive focus. */
    var tabIndex: js.UndefOr[String | JsNumber] = js.native

    /** The HTML input type. */
    var `type`: js.UndefOr[String] = js.native

    /** Stored value. */
    var value: js.UndefOr[JsNumber | String] = js.native
  }

  def props(
    as:           js.UndefOr[AsC]               = js.undefined,
    autoComplete: js.UndefOr[String]            = js.undefined,
    className:    js.UndefOr[String]            = js.undefined,
    clazz:        js.UndefOr[Css]               = js.undefined,
    tabIndex:     js.UndefOr[String | JsNumber] = js.undefined,
    `type`:       js.UndefOr[String]            = js.undefined,
    value:        js.UndefOr[JsNumber | String] = js.undefined
  ): DropdownSearchInputProps = {
    val p = as.toJsObject[DropdownSearchInputProps]
    p.as           = as.toJs
    p.autoComplete = autoComplete
    p.className    = (className, clazz).toJs
    p.tabIndex     = tabIndex
    p.`type`       = `type`
    p.value        = value
    p
  }

  private val component =
    JsComponent[DropdownSearchInputProps, Children.None, Null](RawComponent)

  def apply(
    p: DropdownSearchInputProps
  ): UnmountedMapped[Id, DropdownSearchInputProps, Null, RawMounted[
    DropdownSearchInputProps,
    Null
  ], DropdownSearchInputProps, Null] =
    component(p)

  def apply: UnmountedMapped[Id, DropdownSearchInputProps, Null, RawMounted[
    DropdownSearchInputProps,
    Null
  ], DropdownSearchInputProps, Null] =
    component(props())
}
