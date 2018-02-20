package react.semanticui.elements.icon

import scala.scalajs.js
import js.annotation._
import react.semanticui._
import react.semanticui.sizes._
// import react.semanticui.colors._
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.{RawMounted, UnmountedMapped}
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.ReactNode

object IconGroup {

  @js.native
  @JSImport("semantic-ui-react", "IconGroup")
  object RawComponent extends js.Object

  @js.native
  trait IconGroupProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native
    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[js.Any] = js.native
    var children: js.UndefOr[ReactNode] = js.native
    var className: js.UndefOr[String] = js.native
    var content: js.UndefOr[ReactNode] = js.native
    var size: js.UndefOr[IconSizeProp] = js.native
  }

  def props(
    children: js.UndefOr[VdomNode] = js.undefined,
    as: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    content: js.UndefOr[VdomNode] = js.undefined,
    size: js.UndefOr[SemanticSize] = js.undefined
  ): IconGroupProps =
    rawprops(as, children.map(_.rawNode), className, content.map(_.rawNode), size.map(_.value))

  private[semanticui] def rawprops(
    as: js.UndefOr[js.Any] = js.undefined,
    children: js.UndefOr[ReactNode] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    content: js.UndefOr[ReactNode] = js.undefined,
    size: js.UndefOr[IconSizeProp] = js.undefined
  ): IconGroupProps = {
    val p = (new js.Object).asInstanceOf[IconGroupProps]
    p.as = as
    p.children = children
    p.content = content
    p.className = className
    p.content = content
    p.size = size
    p
  }

  private val component = JsComponent[IconGroupProps, Children.Varargs, Null](RawComponent)

  def apply(p: IconGroupProps, children: VdomNode*): UnmountedMapped[Id, IconGroupProps, Null, RawMounted, IconGroupProps, Null] = component(p)(children: _*)
}
