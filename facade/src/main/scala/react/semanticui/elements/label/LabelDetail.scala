package react.semanticui.elements.label

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui._
import react.semanticui.raw._
import react.common.style._
import react.common._

final case class LabelDetail(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericComponentPC[LabelDetail.LabelDetailProps, LabelDetail] {
  override protected def cprops = LabelDetail.props(this)
  @inline def renderWith =
    LabelDetail.component(LabelDetail.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

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
    q: LabelDetail
  ): LabelDetailProps = {
    val p = q.as.toJsObject[LabelDetailProps]
    p.as        = q.as.toJs
    p.children  = q.child.toJs
    p.className = (q.className, q.clazz).toJs
    p.content   = q.content.toJs
    p
  }

  private val component =
    JsComponent[LabelDetailProps, Children.Varargs, Null](RawComponent)

  def apply(
    content: VdomNode*
  ): LabelDetail =
    new LabelDetail(children = content)
}
