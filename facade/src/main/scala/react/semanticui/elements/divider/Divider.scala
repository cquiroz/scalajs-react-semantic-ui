package react.semanticui.elements.divider

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.vdom.VdomNode

final case class Divider(
  as:                     js.UndefOr[AsC]                  = js.undefined,
  className:              js.UndefOr[String]               = js.undefined,
  clazz:                  js.UndefOr[Css]                  = js.undefined,
  clearing:               js.UndefOr[Boolean]              = js.undefined,
  content:                js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  fitted:                 js.UndefOr[Boolean]              = js.undefined,
  hidden:                 js.UndefOr[Boolean]              = js.undefined,
  horizontal:             js.UndefOr[Boolean]              = js.undefined,
  inverted:               js.UndefOr[Boolean]              = js.undefined,
  section:                js.UndefOr[Boolean]              = js.undefined,
  vertical:               js.UndefOr[Boolean]              = js.undefined,
  override val modifiers: Seq[TagMod]                      = Seq.empty
) extends GenericComponentPAC[Divider.DividerProps, Divider] {
  override protected def cprops    = Divider.props(this)
  override protected val component = Divider.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Divider {
  @js.native
  @JSImport("semantic-ui-react", "Divider")
  private[semanticui] object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DividerProps extends js.Object {
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

    /** Divider can clear the content above it. */
    var clearing: js.UndefOr[Boolean] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Divider can be fitted without any space above or below it. */
    var fitted: js.UndefOr[Boolean] = js.native

    /** Divider can divide content without creating a dividing line. */
    var hidden: js.UndefOr[Boolean] = js.native

    /** Divider can segment content horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native

    /** Divider can have its colours inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Divider can provide greater margins to divide sections of content. */
    var section: js.UndefOr[Boolean] = js.native

    /** Divider can segment content vertically. */
    var vertical: js.UndefOr[Boolean] = js.native
  }

  def props(
    q: Divider
  ): DividerProps = {
    val p = q.as.toJsObject[DividerProps]
    p.as         = q.as.toJs
    p.className  = (q.className, q.clazz).toJs
    p.clearing   = q.clearing
    p.content    = q.content.toJs
    p.fitted     = q.fitted
    p.hidden     = q.hidden
    p.horizontal = q.horizontal
    p.inverted   = q.inverted
    p.section    = q.section
    p.vertical   = q.vertical
    p
  }

  private val component =
    JsComponent[DividerProps, Children.Varargs, Null](RawComponent)

  val Default: Divider = Divider()

  val defaultProps: DividerProps = props(Default)

  def apply(modifiers: TagMod*): Divider =
    new Divider(modifiers = modifiers)
}
