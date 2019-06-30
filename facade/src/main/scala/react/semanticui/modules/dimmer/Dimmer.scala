package react.semanticui.modules.dimmer

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id

object Dimmer {

  @js.native
  @JSImport("semantic-ui-react", "Dimmer")
  object RawComponent extends js.Object

  @js.native
  trait DimmerProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.native

    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.native

  }

  def props(
    active: js.UndefOr[Boolean] = js.undefined,
    page:   js.UndefOr[Boolean] = js.undefined
  ): DimmerProps = {
    val p = (new js.Object).asInstanceOf[DimmerProps]
    p.active = active
    p.page   = page
    p
  }

  private val component =
    JsComponent[DimmerProps, Children.Varargs, Null](RawComponent)

  def apply(p: DimmerProps, children: VdomNode*): UnmountedMapped[
    Id,
    DimmerProps,
    Null,
    RawMounted[DimmerProps, Null],
    DimmerProps,
    Null
  ] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedMapped[
    Id,
    DimmerProps,
    Null,
    RawMounted[DimmerProps, Null],
    DimmerProps,
    Null
  ] =
    component(props())(children: _*)

}
