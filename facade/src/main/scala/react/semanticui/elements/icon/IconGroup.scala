package react.semanticui.elements.icon

import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import scala.scalajs.js
import js.annotation._

object IconGroup {

  @js.native
  @JSImport("semantic-ui-react", "Icon.Group")
  object RawComponent extends js.Object

  @js.native
  trait IconGroupProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                    = js.native
    var children: js.UndefOr[React.Node]       = js.native
    var className: js.UndefOr[String]          = js.native
    var content: js.UndefOr[React.Node]        = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
  }

  def props(
    as:        js.UndefOr[AsC]          = js.undefined,
    children:  js.UndefOr[VdomNode]     = js.undefined,
    className: js.UndefOr[String]       = js.undefined,
    clazz:     js.UndefOr[Css]          = js.undefined,
    content:   js.UndefOr[VdomNode]     = js.undefined,
    size:      js.UndefOr[SemanticSize] = js.undefined
  ): IconGroupProps = {
    val p = as.toJsObject[IconGroupProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.content   = content.toJs
    p.className = (className, clazz).toJs

    p.content = content.toJs
    p.size    = size.toJs
    p
  }

  private val component =
    JsComponent[IconGroupProps, Children.Varargs, Null](RawComponent)

  def apply(p:        IconGroupProps,
            children: VdomNode*): UnmountedMapped[Id,
                                                  IconGroupProps,
                                                  Null,
                                                  RawMounted[IconGroupProps, Null],
                                                  IconGroupProps,
                                                  Null] =
    component(p)(children: _*)
}
