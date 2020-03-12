package react.semanticui.collections.form

import scala.scalajs.js
import js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class FormGroup(
  as:                    js.UndefOr[AsC]                        = js.undefined,
  child:                 js.UndefOr[VdomNode]                   = js.undefined,
  className:             js.UndefOr[String]                     = js.undefined,
  clazz:                 js.UndefOr[Css]                        = js.undefined,
  content:               js.UndefOr[VdomNode]                   = js.undefined,
  grouped:               js.UndefOr[Boolean]                    = js.undefined,
  inline:                js.UndefOr[Boolean]                    = js.undefined,
  unstackable:           js.UndefOr[Boolean]                    = js.undefined,
  widths:                js.UndefOr[SemanticWidth | FormWidths] = js.undefined,
  override val children: CtorType.ChildrenArgs                  = Seq.empty
) extends GenericComponentPC[FormGroup.FormGroupProps] {
  override def cprops = FormGroup.props(this)
  @inline def renderWith =
    FormGroup.component(FormGroup.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object FormGroup {

  @js.native
  @JSImport("semantic-ui-react", "FormGroup")
  object RawComponent extends js.Object

  @js.native
  trait FormGroupProps extends js.Object {
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
    var content: js.UndefOr[suiraw.SemanticShorthandContent] =
      js.undefined

    var grouped: js.UndefOr[Boolean] = js.native

    /** Multiple fields may be inline in a row. */
    var inline: js.UndefOr[Boolean] = js.native

    /** A form group can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native

    /** Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. */
    var widths: js.UndefOr[String] = js.native
  }

  def props(q: FormGroup): FormGroupProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.content,
      q.grouped,
      q.inline,
      q.unstackable,
      q.widths
    )

  def rawprops(
    as:          js.UndefOr[AsC]                        = js.undefined,
    child:       js.UndefOr[VdomNode]                   = js.undefined,
    className:   js.UndefOr[String]                     = js.undefined,
    clazz:       js.UndefOr[Css]                        = js.undefined,
    content:     js.UndefOr[VdomNode]                   = js.undefined,
    grouped:     js.UndefOr[Boolean]                    = js.undefined,
    inline:      js.UndefOr[Boolean]                    = js.undefined,
    unstackable: js.UndefOr[Boolean]                    = js.undefined,
    widths:      js.UndefOr[SemanticWidth | FormWidths] = js.undefined
  ): FormGroupProps = {
    val p = (new js.Object).asInstanceOf[FormGroupProps]
    p.as          = as.toJs
    p.children    = child.toJs
    p.className   = (className, clazz).toJs
    p.grouped     = grouped
    p.inline      = inline
    p.unstackable = unstackable
    p.widths = widths.map {
      (_: Any) match {
        case w: FormWidths => w.toJs
        case w             => w.asInstanceOf[SemanticWidth].toJs
      }
    }
    p
  }

  private val component =
    JsComponent[FormGroupProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): FormGroup =
    new FormGroup(children = content)
}
