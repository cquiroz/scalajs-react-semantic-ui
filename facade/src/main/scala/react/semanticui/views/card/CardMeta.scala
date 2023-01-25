package react.semanticui.views.card

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.facade.React
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class CardMeta(
  as:                     js.UndefOr[AsC] = js.undefined,
  className:              js.UndefOr[String] = js.undefined,
  clazz:                  js.UndefOr[Css] = js.undefined,
  content:                js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  textAlign:              js.UndefOr[SemanticTextAlignment] = js.undefined,
  override val modifiers: Seq[TagMod] = Seq.empty
) extends GenericFnComponentPAC[CardMeta.CardMetaProps, CardMeta] {
  override protected def cprops    = CardMeta.props(this)
  override protected val component = CardMeta.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object CardMeta {
  @js.native
  @JSImport("semantic-ui-react", "CardMeta")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait CardMetaProps extends js.Object {
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

    /** A card meta can adjust its text alignment. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native
  }

  def props(q: CardMeta): CardMetaProps =
    rawprops(q.as, q.className, q.clazz, q.content, q.textAlign)

  def rawprops(
    as:        js.UndefOr[AsC] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    clazz:     js.UndefOr[Css] = js.undefined,
    content:   js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
    textAlign: js.UndefOr[SemanticTextAlignment] = js.undefined
  ): CardMetaProps = {
    val p = as.toJsObject[CardMetaProps]
    as.toJs.foreach(v => p.as = v)
    (className, clazz).toJs.foreach(v => p.className = v)
    content.toJs.foreach(v => p.content = v)
    textAlign.toJs.foreach(v => p.textAlign = v)
    p
  }

  private val component =
    JsFnComponent[CardMetaProps, Children.Varargs](RawComponent)

  def apply(modifiers: TagMod*): CardMeta =
    new CardMeta(modifiers = modifiers)
}
