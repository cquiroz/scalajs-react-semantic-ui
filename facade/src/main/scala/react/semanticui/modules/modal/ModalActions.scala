package react.semanticui.modules.modal

import scala.scalajs.js
import js.annotation._
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.elements.button.Button
import react.semanticui.{ raw => suiraw }

final case class ModalActions(
  as:                    js.UndefOr[AsC]                        = js.undefined,
  actions:               js.UndefOr[List[Button.ButtonProps]]   = js.undefined,
  child:                 js.UndefOr[VdomNode]                   = js.undefined,
  className:             js.UndefOr[String]                     = js.undefined,
  clazz:                 js.UndefOr[Css]                        = js.undefined,
  content:               js.UndefOr[VdomNode]                   = js.undefined,
  onActionClickE:        js.UndefOr[ModalActions.OnActionClick] = js.undefined,
  onActionClick:         js.UndefOr[Callback]                   = js.undefined,
  override val children: CtorType.ChildrenArgs                  = Seq.empty
) extends GenericComponentPC[ModalActions.ModalActionsProps] {
  override def cprops    = ModalActions.props(this)
  @inline def renderWith = ModalActions.component(ModalActions.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object ModalActions {
  type RawOnActionClick = js.Function2[ReactMouseEvent, Button.ButtonProps, Unit]
  type OnActionClick    = (ReactMouseEvent, Button.ButtonProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "ModalActions")
  object RawComponent extends js.Object

  @js.native
  trait ModalActionsProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Array of shorthand buttons. */
    var actions: js.UndefOr[js.Array[suiraw.SemanticShorthandItem[Button.ButtonProps]]] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /**
      * onClick handler for an action. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onActionClick: js.UndefOr[RawOnActionClick] = js.native
  }

  def props(q: ModalActions): ModalActionsProps =
    rawprops(q.as,
             q.actions,
             q.child,
             q.className,
             q.clazz,
             q.content,
             q.onActionClickE,
             q.onActionClick)

  def rawprops(
    as:             js.UndefOr[AsC]                      = js.undefined,
    actions:        js.UndefOr[List[Button.ButtonProps]] = js.undefined,
    children:       js.UndefOr[VdomNode]                 = js.undefined,
    className:      js.UndefOr[String]                   = js.undefined,
    clazz:          js.UndefOr[Css]                      = js.undefined,
    content:        js.UndefOr[VdomNode]                 = js.undefined,
    onActionClickE: js.UndefOr[OnActionClick]            = js.undefined,
    onActionClick:  js.UndefOr[Callback]                 = js.undefined
  ): ModalActionsProps = {
    val p = (new js.Object).asInstanceOf[ModalActionsProps]
    p.as = as.toJs
    p.actions = actions.map(x =>
      x.map((y: Button.ButtonProps) => y: suiraw.SemanticShorthandItem[Button.ButtonProps])
        .toJSArray
    )
    p.children      = children.toJs
    p.className     = (className, clazz).toJs
    p.content       = content.toJs
    p.onActionClick = (onActionClickE, onActionClick).toJs
    p
  }

  private val component =
    JsComponent[ModalActionsProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): ModalActions =
    new ModalActions(children = content)
}
