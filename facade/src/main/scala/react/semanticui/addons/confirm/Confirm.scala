package react.semanticui.addons.confirm

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.semanticui._
import react.semanticui.elements.button.Button
import react.semanticui.modules.modal._
import react.semanticui.{ raw => suiraw }

object Confirm {
  type RawOnCancel  = js.Function2[ReactMouseEvent, Confirm.ModalProps, Unit]
  type OnCancel     = (ReactMouseEvent, Confirm.ModalProps) => Callback
  type RawOnConfirm = RawOnCancel
  type OnConfirm    = OnCancel

  @js.native
  @JSImport("semantic-ui-react", "Confirm")
  object RawComponent extends js.Object

  @js.native
  trait ModalProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** The cancel button text. */
    var cancelButton: js.UndefOr[suiraw.SemanticShorthandItem[Button.ButtonProps]] = js.native

    /** The OK button text. */
    var confirmButton: js.UndefOr[suiraw.SemanticShorthandItem[Button.ButtonProps]] = js.native

    /** The ModalContent text. */
    var content: js.UndefOr[suiraw.SemanticShorthandItem[ModalContent.ModalContentProps]] =
      js.native

    /** The ModalHeader text. */
    var header: js.UndefOr[suiraw.SemanticShorthandItem[ModalHeader.ModalHeaderProps]] = js.native

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

    /** Whether or not the modal is visible. */
    var open: js.UndefOr[Boolean] = js.native

    /** A modal can vary in size. */
    //size?: 'mini' | 'tiny' | 'small' | 'large' | 'fullscreen'
    var size: js.UndefOr[String] = js.native
  }

  def props(
    cancelButton:  js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
    confirmButton: js.UndefOr[VdomNode | Button.ButtonProps]             = js.undefined,
    content:       js.UndefOr[VdomNode | ModalContent.ModalContentProps] = js.undefined,
    header:        js.UndefOr[VdomNode | ModalHeader.ModalHeaderProps]   = js.undefined,
    onCancelE:     js.UndefOr[OnCancel]                                  = js.undefined,
    onCancel:      js.UndefOr[Callback]                                  = js.undefined,
    onConfirmE:    js.UndefOr[OnConfirm]                                 = js.undefined,
    onConfirm:     js.UndefOr[Callback]                                  = js.undefined,
    open:          js.UndefOr[Boolean]                                   = js.undefined,
    size:          js.UndefOr[ModalSize]                                 = js.undefined
  ): ModalProps = {
    val p = (new js.Object).asInstanceOf[ModalProps]
    p.cancelButton  = cancelButton.toRaw
    p.confirmButton = confirmButton.toRaw
    p.content       = content.toRaw
    p.header        = header.toRaw
    p.onCancel      = (onCancelE, onCancel).toJs
    p.onConfirm     = (onConfirmE, onConfirm).toJs
    p.open          = open
    p.size          = size.toJs
    p
  }

  private val component =
    JsComponent[ModalProps, Children.Varargs, Null](RawComponent)

  def apply(p: ModalProps, children: VdomNode*): UnmountedMapped[
    Id,
    ModalProps,
    Null,
    RawMounted[ModalProps, Null],
    ModalProps,
    Null
  ] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedMapped[
    Id,
    ModalProps,
    Null,
    RawMounted[ModalProps, Null],
    ModalProps,
    Null
  ] =
    component(props())(children: _*)
}
