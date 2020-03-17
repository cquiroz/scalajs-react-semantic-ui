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

final case class PopupHeader(
  as:                     js.UndefOr[AsC]                  = js.undefined,
  className:              js.UndefOr[String]               = js.undefined,
  clazz:                  js.UndefOr[Css]                  = js.undefined,
  content:                js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  override val modifiers: Seq[TagMod]                      = Seq.empty
) extends GenericFnComponentPAC[PopupHeader.PopupHeaderProps, PopupHeader] {
  override protected def cprops    = PopupHeader.props(this)
  override protected val component = PopupHeader.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object PopupHeader {
  @js.native
  @JSImport("semantic-ui-react", "PopupHeader")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait PopupHeaderProps extends js.Object {
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

  def props(q: PopupHeader): PopupHeaderProps =
    rawprops(q.as, q.className, q.clazz, q.content)

  def rawprops(
    as:        js.UndefOr[AsC]                  = js.undefined,
    className: js.UndefOr[String]               = js.undefined,
    clazz:     js.UndefOr[Css]                  = js.undefined,
    content:   js.UndefOr[ShorthandS[VdomNode]] = js.undefined
  ): PopupHeaderProps = {
    val p = as.toJsObject[PopupHeaderProps]
    p.as        = as.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p
  }

  private val component =
    JsFnComponent[PopupHeaderProps, Children.Varargs](RawComponent)

  def apply(modifiers: TagMod*): PopupHeader =
    new PopupHeader(modifiers = modifiers)
}
