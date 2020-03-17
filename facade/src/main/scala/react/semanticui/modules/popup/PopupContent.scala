package react.semanticui.modules.popup

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import japgolly.scalajs.react.vdom.TagMod

final case class PopupContent(
  as:                     js.UndefOr[AsC]      = js.undefined,
  child:                  js.UndefOr[VdomNode] = js.undefined,
  className:              js.UndefOr[String]   = js.undefined,
  clazz:                  js.UndefOr[Css]      = js.undefined,
  content:                js.UndefOr[VdomNode] = js.undefined,
  override val modifiers: Seq[TagMod]          = Seq.empty
) extends GenericFnComponentPAC[PopupContent.PopupContentProps, PopupContent] {
  override protected def cprops    = PopupContent.props(this)
  override protected val component = PopupContent.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object PopupContent {
  @js.native
  @JSImport("semantic-ui-react", "PopupContent")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait PopupContentProps extends js.Object {
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
  }

  def props(q: PopupContent): PopupContentProps =
    rawprops(q.as, q.child, q.className, q.clazz, q.content)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined
  ): PopupContentProps = {
    val p = as.toJsObject[PopupContentProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs

    p.content = content.toJs
    p
  }

  private val component =
    JsFnComponent[PopupContentProps, Children.Varargs](RawComponent)

  def apply(content: TagMod*): PopupContent =
    new PopupContent(modifiers = content)
}
