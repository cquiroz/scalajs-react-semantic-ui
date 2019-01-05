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
import react.semanticui.raw._

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
    var as: js.UndefOr[js.Any]                        = js.native
    var children: js.UndefOr[React.Node]              = js.native
    var className: js.UndefOr[String]                 = js.native
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }

  def props(
    children:  js.UndefOr[VdomNode] = js.undefined,
    as:        js.UndefOr[js.Any]   = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
  ): LabelDetailProps =
    rawprops(as, children.map(_.rawNode), className, content.map(_.rawNode))

  private[semanticui] def rawprops(
    as:        js.UndefOr[js.Any]     = js.undefined,
    children:  js.UndefOr[React.Node] = js.undefined,
    className: js.UndefOr[String]     = js.undefined,
    content:   js.UndefOr[React.Node] = js.undefined,
  ): LabelDetailProps = {
    val p = (new js.Object).asInstanceOf[LabelDetailProps]
    p.as        = as
    p.children  = children
    p.content   = content
    p.className = className
    p.content   = content
    p
  }

  private val component =
    JsComponent[LabelDetailProps, Children.Varargs, Null](RawComponent)

  def apply(p:        LabelDetailProps,
            children: VdomNode*): UnmountedMapped[Id,
                                                  LabelDetailProps,
                                                  Null,
                                                  RawMounted[LabelDetailProps, Null],
                                                  LabelDetailProps,
                                                  Null] =
    component(p)(children: _*)

}
