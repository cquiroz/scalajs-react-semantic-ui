package react.semanticui.modules.progress

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.colors._
import react.semanticui.sizes._
import react.semanticui.elements.label.Label.LabelProps

final case class Progress(
  as:                    js.UndefOr[AsC]               = js.undefined,
  active:                js.UndefOr[Boolean]           = js.undefined,
  attached:              js.UndefOr[String]            = js.undefined,
  autoSuccess:           js.UndefOr[Boolean]           = js.undefined,
  child:                 js.UndefOr[VdomNode]          = js.undefined,
  className:             js.UndefOr[String]            = js.undefined,
  clazz:                 js.UndefOr[Css]               = js.undefined,
  color:                 js.UndefOr[SemanticColor]     = js.undefined,
  content:               js.UndefOr[VdomNode]          = js.undefined,
  error:                 js.UndefOr[Boolean]           = js.undefined,
  indicating:            js.UndefOr[Boolean]           = js.undefined,
  inverted:              js.UndefOr[Boolean]           = js.undefined,
  label:                 js.UndefOr[LabelProps]        = js.undefined,
  percent:               js.UndefOr[JsNumber | String] = js.undefined,
  precision:             js.UndefOr[JsNumber]          = js.undefined,
  progress:              js.UndefOr[Boolean | String]  = js.undefined,
  size:                  js.UndefOr[SemanticSize]      = js.undefined,
  success:               js.UndefOr[Boolean]           = js.undefined,
  total:                 js.UndefOr[JsNumber | String] = js.undefined,
  value:                 js.UndefOr[JsNumber | String] = js.undefined,
  warning:               js.UndefOr[Boolean]           = js.undefined,
  override val children: CtorType.ChildrenArgs         = Seq.empty
) extends GenericComponentPC[Progress.ProgressProps, Progress] {
  override protected def cprops = Progress.props(this)
  @inline def renderWith        = Progress.component(Progress.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object Progress {
  type Event = (ReactMouseEvent, js.Object) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Progress")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ProgressProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A progress bar can show activity. */
    var active: js.UndefOr[Boolean] = js.native

    /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
    var attached: js.UndefOr[String] = js.native

    /** Whether success state should automatically trigger when progress completes. */
    var autoSuccess: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** A progress bar can have different colors. */
    var color: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** A progress bar be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** A progress bar can show a error state. */
    var error: js.UndefOr[Boolean] = js.native

    /** An indicating progress bar visually indicates the current level of progress of a task. */
    var indicating: js.UndefOr[Boolean] = js.native

    /** A progress bar can have its colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Can be set to either to display progress as percent or ratio. */
    var label: js.UndefOr[suiraw.SemanticShorthandItem[LabelProps]] = js.native

    /** Current percent complete. */
    var percent: js.UndefOr[JsNumber | String] = js.native

    /** Decimal point precision for calculated progress. */
    var precision: js.UndefOr[JsNumber] = js.native

    /** A progress bar can contain a text value indicating current progress. */
    var progress: js.UndefOr[Boolean | String] = js.native

    /** A progress bar can vary in size. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** A progress bar can show a success state. */
    var success: js.UndefOr[Boolean] = js.native

    /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
    var total: js.UndefOr[JsNumber | String] = js.native

    /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
    var value: js.UndefOr[JsNumber | String] = js.native

    /** A progress bar can show a warning state. */
    var warning: js.UndefOr[Boolean] = js.native
  }

  def props(q: Progress): ProgressProps =
    rawprops(
      q.as,
      q.active,
      q.attached,
      q.autoSuccess,
      q.child,
      q.className,
      q.clazz,
      q.color,
      q.content,
      q.error,
      q.indicating,
      q.inverted,
      q.label,
      q.percent,
      q.precision,
      q.progress,
      q.size,
      q.success,
      q.total,
      q.value,
      q.warning
    )

  def rawprops(
    as:          js.UndefOr[AsC]               = js.undefined,
    active:      js.UndefOr[Boolean]           = js.undefined,
    attached:    js.UndefOr[String]            = js.undefined,
    autoSuccess: js.UndefOr[Boolean]           = js.undefined,
    children:    js.UndefOr[VdomNode]          = js.undefined,
    className:   js.UndefOr[String]            = js.undefined,
    clazz:       js.UndefOr[Css]               = js.undefined,
    color:       js.UndefOr[SemanticColor]     = js.undefined,
    content:     js.UndefOr[VdomNode]          = js.undefined,
    error:       js.UndefOr[Boolean]           = js.undefined,
    indicating:  js.UndefOr[Boolean]           = js.undefined,
    inverted:    js.UndefOr[Boolean]           = js.undefined,
    label:       js.UndefOr[LabelProps]        = js.undefined,
    percent:     js.UndefOr[JsNumber | String] = js.undefined,
    precision:   js.UndefOr[JsNumber]          = js.undefined,
    progress:    js.UndefOr[Boolean | String]  = js.undefined,
    size:        js.UndefOr[SemanticSize]      = js.undefined,
    success:     js.UndefOr[Boolean]           = js.undefined,
    total:       js.UndefOr[JsNumber | String] = js.undefined,
    value:       js.UndefOr[JsNumber | String] = js.undefined,
    warning:     js.UndefOr[Boolean]           = js.undefined
  ): ProgressProps = {
    val p = as.toJsObject[ProgressProps]
    p.as          = as.toJs
    p.active      = active
    p.attached    = attached
    p.autoSuccess = autoSuccess
    p.children    = children.toJs
    p.className   = (className, clazz).toJs
    p.color       = color.toJs
    p.content     = content.toJs
    p.error       = error
    p.indicating  = indicating
    p.inverted    = inverted
    p.label       = label
    p.percent     = percent
    p.precision   = precision
    p.progress    = progress
    p.size        = size.toJs
    p.success     = success
    p.total       = total
    p.value       = value
    p.warning     = warning
    p
  }

  private val component =
    JsComponent[ProgressProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): Progress =
    Progress(children = content)
}
