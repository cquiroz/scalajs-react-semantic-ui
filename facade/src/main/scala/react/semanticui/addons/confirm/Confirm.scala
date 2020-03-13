package react.semanticui.addons.confirm

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import react.common._
import react.semanticui._
import react.semanticui.elements.button.Button
import react.semanticui.elements.icon.Icon
import react.semanticui.modules.modal._
import react.semanticui.{ raw => suiraw }

final case class Confirm(
  as:                    js.UndefOr[AsC]                                       = js.undefined,
  actions:               js.UndefOr[VdomNode | ModalActions.ModalActionsProps] = js.undefined,
  basic:                 js.UndefOr[Boolean]                                   = js.undefined,
  cancelButton:          js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
  centered:              js.UndefOr[Boolean]                                   = js.undefined,
  child:                 js.UndefOr[VdomNode]                                  = js.undefined,
  className:             js.UndefOr[String]                                    = js.undefined,
  clazz:                 js.UndefOr[Css]                                       = js.undefined,
  closeIcon:             js.UndefOr[Icon]                                      = js.undefined,
  closeOnDimmerClick:    js.UndefOr[Boolean]                                   = js.undefined,
  closeOnDocumentClick:  js.UndefOr[Boolean]                                   = js.undefined,
  confirmButton:         js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
  content:               js.UndefOr[VdomNode | ModalContent.ModalContentProps] = js.undefined,
  defaultOpen:           js.UndefOr[Boolean]                                   = js.undefined,
  dimmer:                js.UndefOr[ModalDimmer]                               = js.undefined,
  eventPool:             js.UndefOr[String]                                    = js.undefined,
  header:                js.UndefOr[VdomNode | ModalHeader.ModalHeaderProps]   = js.undefined,
  onActionClickE:        js.UndefOr[Modal.OnActionClick]                       = js.undefined,
  onActionClick:         js.UndefOr[Callback]                                  = js.undefined,
  onCancelE:             js.UndefOr[Confirm.OnCancel]                          = js.undefined,
  onCancel:              js.UndefOr[Callback]                                  = js.undefined,
  onCloseE:              js.UndefOr[Modal.OnClose]                             = js.undefined,
  onClose:               js.UndefOr[Callback]                                  = js.undefined,
  onConfirmE:            js.UndefOr[Confirm.OnConfirm]                         = js.undefined,
  onConfirm:             js.UndefOr[Callback]                                  = js.undefined,
  onOpenE:               js.UndefOr[Modal.OnOpen]                              = js.undefined,
  onOpen:                js.UndefOr[Callback]                                  = js.undefined,
  onMountE:              js.UndefOr[Modal.OnMount]                             = js.undefined,
  onMount:               js.UndefOr[Callback]                                  = js.undefined,
  open:                  js.UndefOr[Boolean]                                   = js.undefined,
  size:                  js.UndefOr[ModalSize]                                 = js.undefined,
  style:                 js.UndefOr[Style]                                     = js.undefined,
  trigger:               js.UndefOr[VdomNode]                                  = js.undefined,
  override val children: CtorType.ChildrenArgs                                 = Seq.empty
) extends GenericComponentPC[Confirm.ConfirmProps] {
  override def cprops    = Confirm.props(this)
  @inline def renderWith = Confirm.component(Confirm.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object Confirm {
  type RawOnCancel  = js.Function2[ReactMouseEvent, Confirm.ConfirmProps, Unit]
  type OnCancel     = (ReactMouseEvent, Confirm.ConfirmProps) => Callback
  type RawOnConfirm = RawOnCancel
  type OnConfirm    = OnCancel

  @js.native
  @JSImport("semantic-ui-react", "Confirm")
  object RawComponent extends js.Object

  @js.native
  trait ConfirmProps extends Modal.ModalProps {

    /** The cancel button text. */
    var cancelButton: js.UndefOr[suiraw.SemanticShorthandItem[Button.ButtonProps]] = js.native

    /** The OK button text. */
    var confirmButton: js.UndefOr[suiraw.SemanticShorthandItem[Button.ButtonProps]] = js.native

    /**
      * Called when the Modal is closed without clicking confirm.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onCancel: js.UndefOr[RawOnCancel] = js.native

    /**
      * Called when the OK button is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onConfirm: js.UndefOr[RawOnCancel] = js.native

  }

  def props(q: Confirm): ConfirmProps =
    rawprops(
      q.as,
      q.actions,
      q.basic,
      q.cancelButton,
      q.centered,
      q.child,
      q.className,
      q.clazz,
      q.closeIcon,
      q.closeOnDimmerClick,
      q.closeOnDocumentClick,
      q.confirmButton,
      q.content,
      q.defaultOpen,
      q.dimmer,
      q.eventPool,
      q.header,
      q.onActionClickE,
      q.onActionClick,
      q.onCancelE,
      q.onCancel,
      q.onCloseE,
      q.onClose,
      q.onConfirmE,
      q.onConfirm,
      q.onOpenE,
      q.onOpen,
      q.onMountE,
      q.onMount,
      q.open,
      q.size,
      q.style,
      q.trigger
    )

  def rawprops(
    as:                   js.UndefOr[AsC]                                       = js.undefined,
    actions:              js.UndefOr[VdomNode | ModalActions.ModalActionsProps] = js.undefined,
    basic:                js.UndefOr[Boolean]                                   = js.undefined,
    cancelButton:         js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
    centered:             js.UndefOr[Boolean]                                   = js.undefined,
    children:             js.UndefOr[VdomNode]                                  = js.undefined,
    className:            js.UndefOr[String]                                    = js.undefined,
    clazz:                js.UndefOr[Css]                                       = js.undefined,
    closeIcon:            js.UndefOr[Icon]                                      = js.undefined,
    closeOnDimmerClick:   js.UndefOr[Boolean]                                   = js.undefined,
    closeOnDocumentClick: js.UndefOr[Boolean]                                   = js.undefined,
    confirmButton:        js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
    content:              js.UndefOr[VdomNode | ModalContent.ModalContentProps] = js.undefined,
    defaultOpen:          js.UndefOr[Boolean]                                   = js.undefined,
    dimmer:               js.UndefOr[ModalDimmer]                               = js.undefined,
    eventPool:            js.UndefOr[String]                                    = js.undefined,
    header:               js.UndefOr[VdomNode | ModalHeader.ModalHeaderProps]   = js.undefined,
    onActionClickE:       js.UndefOr[Modal.OnActionClick]                       = js.undefined,
    onActionClick:        js.UndefOr[Callback]                                  = js.undefined,
    onCancelE:            js.UndefOr[Confirm.OnCancel]                          = js.undefined,
    onCancel:             js.UndefOr[Callback]                                  = js.undefined,
    onCloseE:             js.UndefOr[Modal.OnClose]                             = js.undefined,
    onClose:              js.UndefOr[Callback]                                  = js.undefined,
    onConfirmE:           js.UndefOr[Confirm.OnConfirm]                         = js.undefined,
    onConfirm:            js.UndefOr[Callback]                                  = js.undefined,
    onOpenE:              js.UndefOr[Modal.OnOpen]                              = js.undefined,
    onOpen:               js.UndefOr[Callback]                                  = js.undefined,
    onMountE:             js.UndefOr[Modal.OnMount]                             = js.undefined,
    onMount:              js.UndefOr[Callback]                                  = js.undefined,
    open:                 js.UndefOr[Boolean]                                   = js.undefined,
    size:                 js.UndefOr[ModalSize]                                 = js.undefined,
    style:                js.UndefOr[Style]                                     = js.undefined,
    trigger:              js.UndefOr[VdomNode]                                  = js.undefined
  ): ConfirmProps = {
    val p = as.toJsObject[ConfirmProps]
    p.as                   = as.toJs
    p.actions              = actions.toRaw
    p.basic                = basic
    p.cancelButton         = cancelButton.toRaw
    p.centered             = centered
    p.children             = children.toJs
    p.className            = (className, clazz).toJs
    p.closeIcon            = closeIcon.map(_.props)
    p.closeOnDimmerClick   = closeOnDimmerClick
    p.closeOnDocumentClick = closeOnDocumentClick
    p.confirmButton        = confirmButton.toRaw
    p.content              = content.toRaw
    p.defaultOpen          = defaultOpen
    p.dimmer               = dimmer.toJs
    p.eventPool            = eventPool
    p.header               = header.toRaw
    p.onActionClick        = (onActionClickE, onActionClick).toJs
    p.onCancel             = (onCancelE, onCancel).toJs
    p.onClose              = (onCloseE, onClose).toJs
    p.onConfirm            = (onConfirmE, onConfirm).toJs
    p.onMount              = (onMountE, onMount).toJs.map(f => (_, p: Modal.ModalProps) => f(p))
    p.open                 = open
    p.size                 = size.toJs
    p.style                = style.map(_.toJsObject)
    p.trigger              = trigger.toJs
    p
  }

  private val component =
    JsComponent[ConfirmProps, Children.Varargs, Null](RawComponent)

}
