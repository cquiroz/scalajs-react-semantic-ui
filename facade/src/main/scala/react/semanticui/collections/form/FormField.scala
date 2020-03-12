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
import react.semanticui.elements.label.Label
import react.semanticui.{ raw => suiraw }

final case class FormField(
  as:                    js.UndefOr[AsC]             = js.undefined,
  child:                 js.UndefOr[VdomNode]        = js.undefined,
  className:             js.UndefOr[String]          = js.undefined,
  clazz:                 js.UndefOr[Css]             = js.undefined,
  content:               js.UndefOr[VdomNode]        = js.undefined,
  disabled:              js.UndefOr[Boolean]         = js.undefined,
  error:                 js.UndefOr[Label]           = js.undefined,
  inline:                js.UndefOr[Boolean]         = js.undefined,
  label:                 js.UndefOr[Label]           = js.undefined,
  required:              js.UndefOr[Boolean | Label] = js.undefined,
  `type`:                js.UndefOr[String]          = js.undefined,
  width:                 js.UndefOr[SemanticWidth]   = js.undefined,
  override val children: CtorType.ChildrenArgs       = Seq.empty
) extends GenericComponentPC[FormField.FormFieldProps] {
  override def cprops = FormField.props(this)
  @inline def renderWith =
    FormField.component(FormField.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object FormField {

  @js.native
  @JSImport("semantic-ui-react", "FormField")
  object RawComponent extends js.Object

  @js.native
  trait FormFieldProps extends js.Object {
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

    /**
      * A form control component (i.e. Dropdown) or HTML tagName (i.e. 'input').
      * Extra FormField props are passed to the control component.
      * Mutually exclusive with children.
      */
    // control?: any

    /** Individual fields may be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Individual fields may display an error state along with a message. */
    var error: js.UndefOr[Boolean | suiraw.SemanticShorthandItem[Label.LabelProps]] = js.native

    /** A field can have its label next to instead of above it. */
    var inline: js.UndefOr[Boolean] = js.native

    /** Mutually exclusive with children. */
    var label: js.UndefOr[suiraw.SemanticShorthandItem[Label.LabelProps]] = js.native

    /** A field can show that input is mandatory.  Requires a label. */
    var required: js.UndefOr[Boolean | suiraw.SemanticShorthandItem[Label.LabelProps]] = js.native

    /** Passed to the control component (i.e. <input type='password' />) */
    var `type`: js.UndefOr[String] = js.native

    /** A field can specify its width in grid columns */
    var width: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'
  }

  def props(q: FormField): FormFieldProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.content,
      q.disabled,
      q.error,
      q.inline,
      q.label,
      q.required,
      q.`type`,
      q.width
    )

  def rawprops(
    as:        js.UndefOr[AsC]             = js.undefined,
    child:     js.UndefOr[VdomNode]        = js.undefined,
    className: js.UndefOr[String]          = js.undefined,
    clazz:     js.UndefOr[Css]             = js.undefined,
    content:   js.UndefOr[VdomNode]        = js.undefined,
    disabled:  js.UndefOr[Boolean]         = js.undefined,
    error:     js.UndefOr[Label]           = js.undefined,
    inline:    js.UndefOr[Boolean]         = js.undefined,
    label:     js.UndefOr[Label]           = js.undefined,
    required:  js.UndefOr[Boolean | Label] = js.undefined,
    `type`:    js.UndefOr[String]          = js.undefined,
    width:     js.UndefOr[SemanticWidth]   = js.undefined
  ): FormFieldProps = {
    val p = (new js.Object).asInstanceOf[FormFieldProps]
    p.as        = as.toJs
    p.children  = child.toJs
    p.className = (className, clazz).toJs
    p.disabled  = disabled
    p.error     = error.map(_.props)
    p.inline    = inline
    p.label     = label.map(_.props)
    p.required = required.map {
      (_: Any) match {
        case b: Boolean => b
        case l: Label   => l.props
      }
    }
    p.`type` = `type`
    p.width  = width.toJs
    p
  }

  private val component =
    JsComponent[FormFieldProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): FormField =
    new FormField(children = content)
}
