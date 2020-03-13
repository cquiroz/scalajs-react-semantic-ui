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

final case class MessageList(
  as:                    js.UndefOr[AsC]                                          = js.undefined,
  child:                 js.UndefOr[VdomNode]                                     = js.undefined,
  className:             js.UndefOr[String]                                       = js.undefined,
  clazz:                 js.UndefOr[Css]                                          = js.undefined,
  items:                 js.UndefOr[Seq[VdomNode | MessageItem.MessageItemProps]] = js.undefined,
  override val children: CtorType.ChildrenArgs                                    = Seq.empty
) extends GenericComponentPC[MessageList.MessageListProps] {
  override def cprops = MessageList.props(this)
  @inline def renderWith =
    MessageList.component(MessageList.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object MessageList {
  @js.native
  @JSImport("semantic-ui-react", "MessageList")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait MessageListProps extends js.Object {
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
    var items: js.UndefOr[suiraw.SemanticShorthandArray[MessageItem.MessageItemProps]] =
      js.undefined
  }

  def props(q: MessageList): MessageListProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.items
    )

  def rawprops(
    as:        js.UndefOr[AsC]                                          = js.undefined,
    children:  js.UndefOr[VdomNode]                                     = js.undefined,
    className: js.UndefOr[String]                                       = js.undefined,
    clazz:     js.UndefOr[Css]                                          = js.undefined,
    items:     js.UndefOr[Seq[VdomNode | MessageItem.MessageItemProps]] = js.undefined
  ): MessageListProps = {
    val p = as.toJsObject[MessageListProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.items     = items.toRaw
    p
  }

  private val component =
    JsComponent[MessageListProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): MessageList =
    new MessageList(children = content)
}
