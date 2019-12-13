package react.semanticui.elements.label

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react.Children
import japgolly.scalajs.react.JsComponent
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui._
import react.semanticui.raw._
import react.common.syntax._
import react.common.style._

object LabelDetail {
  @js.native
  @JSImport("semantic-ui-react", "LabelDetail")
  object RawComponent extends js.Object

  @js.native
  trait LabelDetailProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                           = js.native
    var children: js.UndefOr[React.Node]              = js.native
    var className: js.UndefOr[String]                 = js.native
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined
  ): LabelDetailProps = {
    val p = as.toJsObject[LabelDetailProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p
  }

  private val component =
    JsComponent[LabelDetailProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        LabelDetailProps,
    children: VdomNode*
  ): UnmountedMapped[Id, LabelDetailProps, Null, RawMounted[
    LabelDetailProps,
    Null
  ], LabelDetailProps, Null] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedMapped[Id, LabelDetailProps, Null, RawMounted[
    LabelDetailProps,
    Null
  ], LabelDetailProps, Null] =
    component(props())(children: _*)
}
