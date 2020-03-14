package react.semanticui.elements.button

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class ButtonContent(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  hidden:                js.UndefOr[Boolean]   = js.undefined,
  visible:               js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericComponentPC[ButtonContent.ButtonContentProps, ButtonContent] {
  override protected def cprops = ButtonContent.props(this)
  @inline def renderWith =
    ButtonContent.component(ButtonContent.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object ButtonContent {
  @js.native
  @JSImport("semantic-ui-react", "ButtonContent")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }
  @js.native
  trait ButtonContentProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Initially hidden, visible on hover. */
    var hidden: js.UndefOr[Boolean] = js.native

    /** Initially visible, hidden on hover. */
    var visible: js.UndefOr[Boolean] = js.native
  }

  def props(
    q: ButtonContent
  ): ButtonContentProps =
    rawprops(q.as, q.child, q.className, q.clazz, q.content, q.hidden, q.visible)
  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    hidden:    js.UndefOr[Boolean]  = js.undefined,
    visible:   js.UndefOr[Boolean]  = js.undefined
  ): ButtonContentProps = {
    val p = as.toJsObject[ButtonContentProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.hidden    = hidden
    p.visible   = visible
    p
  }

  private val component =
    JsComponent[ButtonContentProps, Children.Varargs, Null](RawComponent)

  def apply(
    content: VdomNode*
  ): ButtonContent =
    new ButtonContent(children = content)
}
