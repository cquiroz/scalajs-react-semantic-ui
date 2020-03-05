package react.semanticui.collections.message

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class MessageHeader(
  as:                    js.UndefOr[AsC]                                         = js.undefined,
  child:                 js.UndefOr[VdomNode]                                    = js.undefined,
  className:             js.UndefOr[String]                                      = js.undefined,
  clazz:                 js.UndefOr[Css]                                         = js.undefined,
  content:               js.UndefOr[VdomNode | MessageHeader.MessageHeaderProps] = js.undefined,
  override val children: CtorType.ChildrenArgs                                   = Seq.empty
) extends GenericComponentPC[MessageHeader.MessageHeaderProps] {
  override def cprops = MessageHeader.props(this)
  @inline def renderWith =
    MessageHeader.component(MessageHeader.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object MessageHeader {
  @js.native
  @JSImport("semantic-ui-react", "MessageHeader")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait MessageHeaderProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.undefined

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.undefined

    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandItem[MessageHeader.MessageHeaderProps]] =
      js.undefined
  }

  def props(q: MessageHeader): MessageHeaderProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.content
    )

  def rawprops(
    as:        js.UndefOr[AsC]                                         = js.undefined,
    children:  js.UndefOr[VdomNode]                                    = js.undefined,
    className: js.UndefOr[String]                                      = js.undefined,
    clazz:     js.UndefOr[Css]                                         = js.undefined,
    content:   js.UndefOr[VdomNode | MessageHeader.MessageHeaderProps] = js.undefined
  ): MessageHeaderProps = {
    val p = (new js.Object).asInstanceOf[MessageHeaderProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toRaw
    p
  }

  private val component =
    JsComponent[MessageHeaderProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): MessageHeader =
    new MessageHeader(children = content)
}
