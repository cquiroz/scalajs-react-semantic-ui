package react.semanticui.elements.icon

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import scala.scalajs.js
import js.annotation._

final case class IconGroup(
  as:                    js.UndefOr[AsC]          = js.undefined,
  child:                 js.UndefOr[VdomNode]     = js.undefined,
  className:             js.UndefOr[String]       = js.undefined,
  clazz:                 js.UndefOr[Css]          = js.undefined,
  content:               js.UndefOr[VdomNode]     = js.undefined,
  size:                  js.UndefOr[SemanticSize] = js.undefined,
  override val children: CtorType.ChildrenArgs    = Seq.empty
) extends GenericComponentPC[IconGroup.IconGroupProps] {
  override def cprops = IconGroup.props(this)
  @inline def renderWith =
    IconGroup.component(IconGroup.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

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
    q: IconGroup
  ): IconGroupProps = {
    val p = q.as.toJsObject[IconGroupProps]
    p.as        = q.as.toJs
    p.children  = q.child.toJs
    p.content   = q.content.toJs
    p.className = (q.className, q.clazz).toJs
    p.content   = q.content.toJs
    p.size      = q.size.toJs
    p
  }

  private val component =
    JsComponent[IconGroupProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): IconGroup =
    new IconGroup(children = content)
}
