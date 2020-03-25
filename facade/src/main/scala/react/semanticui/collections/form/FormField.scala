package react.semanticui.collections.form

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.elements.label.Label
import react.semanticui.{ raw => suiraw }
import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.vdom.VdomNode

final case class FormField(
  as:                     js.UndefOr[AsC]                  = js.undefined,
  className:              js.UndefOr[String]               = js.undefined,
  clazz:                  js.UndefOr[Css]                  = js.undefined,
  content:                js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  control:                js.UndefOr[String]               = js.undefined,
  disabled:               js.UndefOr[Boolean]              = js.undefined,
  error:                  js.UndefOr[ShorthandB[Label]]    = js.undefined,
  inline:                 js.UndefOr[Boolean]              = js.undefined,
  label:                  js.UndefOr[ShorthandS[String]]   = js.undefined,
  required:               js.UndefOr[Boolean]              = js.undefined,
  tpe:                    js.UndefOr[String]               = js.undefined,
  width:                  js.UndefOr[SemanticWidth]        = js.undefined,
  override val modifiers: Seq[TagMod]                      = Seq.empty
) extends GenericComponentPAC[FormField.FormFieldProps, FormField] {
  override protected def cprops    = FormField.props(this)
  override protected val component = FormField.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
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
    var control: js.UndefOr[String]

    /** Individual fields may be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Individual fields may display an error state along with a message. */
    var error: js.UndefOr[suiraw.SemanticShorthandItemB[Label.LabelProps]] = js.native

    /** A field can have its label next to instead of above it. */
    var inline: js.UndefOr[Boolean] = js.native

    /** Mutually exclusive with children. */
    var label: js.UndefOr[suiraw.SemanticShorthandItemS[Label.LabelProps]] = js.native

    /** A field can show that input is mandatory.  Requires a label. */
    var required: js.UndefOr[Boolean] = js.native

    /** Passed to the control component (i.e. <input type='password' />) */
    var `type`: js.UndefOr[String] = js.native

    /** A field can specify its width in grid columns */
    var width: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'
  }

  def props(q: FormField): FormFieldProps =
    rawprops(
      q.as,
      q.className,
      q.clazz,
      q.content,
      q.control,
      q.disabled,
      q.error,
      q.inline,
      q.label,
      q.required,
      q.tpe,
      q.width
    )

  def rawprops(
    as:        js.UndefOr[AsC]                  = js.undefined,
    className: js.UndefOr[String]               = js.undefined,
    clazz:     js.UndefOr[Css]                  = js.undefined,
    content:   js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
    control:   js.UndefOr[String]               = js.undefined,
    disabled:  js.UndefOr[Boolean]              = js.undefined,
    error:     js.UndefOr[ShorthandB[Label]]    = js.undefined,
    inline:    js.UndefOr[Boolean]              = js.undefined,
    label:     js.UndefOr[ShorthandS[Label]]    = js.undefined,
    required:  js.UndefOr[Boolean]              = js.undefined,
    tpe:       js.UndefOr[String]               = js.undefined,
    width:     js.UndefOr[SemanticWidth]        = js.undefined
  ): FormFieldProps = {
    val p = as.toJsObject[FormFieldProps]
    p.as        = as.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.control   = control
    p.disabled  = disabled
    p.error     = error.toJs
    p.inline    = inline
    p.label     = label.toJs
    p.required  = required
    p.`type`    = tpe
    p.width     = width.toJs
    p
  }

  private val component =
    JsComponent[FormFieldProps, Children.Varargs, Null](RawComponent)

  def apply(modifiers: TagMod*): FormField =
    FormField(modifiers = modifiers)
}