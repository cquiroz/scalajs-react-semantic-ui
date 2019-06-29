package react.semanticui.modules.modal

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon
import react.semanticui.{ raw => suiraw }

object Modal {
  type RawOnActionClick = js.Function2[ReactMouseEvent, Modal.ModalProps, Unit]
  type OnActionClick    = (ReactMouseEvent, Modal.ModalProps) => Callback
  type RawOnClose       = js.Function2[ReactMouseEvent, Modal.ModalProps, Unit]
  type OnClose          = (ReactMouseEvent, Modal.ModalProps) => Callback
  type RawOnOpen        = js.Function2[ReactMouseEvent, Modal.ModalProps, Unit]
  type OnOpen           = (ReactMouseEvent, Modal.ModalProps) => Callback
  type RawOnMount       = js.Function2[Unit, Modal.ModalProps, Unit]
  type OnMount          = Modal.ModalProps => Callback
  type RawOnUnmount     = js.Function2[Unit, Modal.ModalProps, Unit]
  type OnUnmount        = Modal.ModalProps => Callback

  @js.native
  @JSImport("semantic-ui-react", "Modal")
  object RawComponent extends js.Object

  @js.native
  trait ModalProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
    var actions: js.UndefOr[suiraw.SemanticShorthandItem[ModalActions.ModalActionsProps]] =
      js.native

    /** A Modal can reduce its complexity */
    var basic: js.UndefOr[Boolean] = js.native

    /** A modal can be vertically centered in the viewport */
    var centered: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Icon. */
    var closeIcon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]]

    /** Whether or not the Modal should close when the dimmer is clicked. */
    var closeOnDimmerClick: js.UndefOr[Boolean] = js.native

    /** Whether or not the Modal should close when the document is clicked. */
    var closeOnDocumentClick: js.UndefOr[Boolean] = js.native

    /** A Modal can be passed content via shorthand. */
    var content: js.UndefOr[suiraw.SemanticShorthandItem[ModalContent.ModalContentProps]] =
      js.native

    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.native

    /** A modal can appear in a dimmer. */
    var dimmer: js.UndefOr[Boolean | String] = js.native

    /** Event pool namespace that is used to handle component events */
    var eventPool: js.UndefOr[String] = js.native

    /** A Modal can be passed header via shorthand. */
    var header: js.UndefOr[suiraw.SemanticShorthandItem[ModalHeader.ModalHeaderProps]] = js.native

    /** The node where the modal should mount. Defaults to document.body. */
    // mountNode?: any

    /**
      * Action onClick handler when using shorthand `actions`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onActionClick: js.UndefOr[RawOnActionClick] = js.native

    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[RawOnClose] = js.native

    /**
      * Called when the portal is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[RawOnMount] = js.native

    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[RawOnClose] = js.native

    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[RawOnUnmount] = js.native

    /** Controls whether or not the Modal is displayed. */
    var open: js.UndefOr[Boolean] = js.native

    /** A modal can vary in size. */
    //size?: 'mini' | 'tiny' | 'small' | 'large' | 'fullscreen'
    var size: js.UndefOr[String] = js.native

    /** Custom styles. */
    var style: js.UndefOr[js.Object] = js.native

    /** Element to be rendered in-place where the portal is defined. */
    var trigger: js.UndefOr[React.Node] = js.native
  }

  def props(
    as:                   js.UndefOr[AsC]                                       = js.undefined,
    actions:              js.UndefOr[VdomNode | ModalActions.ModalActionsProps] = js.undefined,
    basic:                js.UndefOr[Boolean]                                   = js.undefined,
    centered:             js.UndefOr[Boolean]                                   = js.undefined,
    children:             js.UndefOr[VdomNode]                                  = js.undefined,
    className:            js.UndefOr[String]                                    = js.undefined,
    clazz:                js.UndefOr[Css]                                       = js.undefined,
    closeIcon:            js.UndefOr[UnmountedIcon]                             = js.undefined,
    closeOnDimmerClick:   js.UndefOr[Boolean]                                   = js.undefined,
    closeOnDocumentClick: js.UndefOr[Boolean]                                   = js.undefined,
    content:              js.UndefOr[VdomNode | ModalContent.ModalContentProps] = js.undefined,
    defaultOpen:          js.UndefOr[Boolean]                                   = js.undefined,
    dimmer:               js.UndefOr[ModalDimmer]                               = js.undefined,
    eventPool:            js.UndefOr[String]                                    = js.undefined,
    header:               js.UndefOr[VdomNode | ModalHeader.ModalHeaderProps]   = js.undefined,
    onActionClickE:       js.UndefOr[OnActionClick]                             = js.undefined,
    onActionClick:        js.UndefOr[Callback]                                  = js.undefined,
    onCloseE:             js.UndefOr[OnClose]                                   = js.undefined,
    onClose:              js.UndefOr[Callback]                                  = js.undefined,
    onOpenE:              js.UndefOr[OnOpen]                                    = js.undefined,
    onOpen:               js.UndefOr[Callback]                                  = js.undefined,
    onMountE:             js.UndefOr[OnMount]                                   = js.undefined,
    onMount:              js.UndefOr[Callback]                                  = js.undefined,
    open:                 js.UndefOr[Boolean]                                   = js.undefined,
    size:                 js.UndefOr[ModalSize]                                 = js.undefined,
    style:                js.UndefOr[Style]                                     = js.undefined,
    trigger:              js.UndefOr[VdomNode]                                  = js.undefined
  ): ModalProps = {
    val p = (new js.Object).asInstanceOf[ModalProps]
    p.as                   = as.toJs
    p.actions              = actions.toRaw
    p.basic                = basic
    p.centered             = centered
    p.children             = children.toJs
    p.className            = (className, clazz).toJs
    p.closeIcon            = closeIcon.map(_.props)
    p.closeOnDimmerClick   = closeOnDimmerClick
    p.closeOnDocumentClick = closeOnDocumentClick
    p.centered             = centered
    p.content              = content.toRaw
    p.defaultOpen          = defaultOpen
    p.dimmer               = dimmer.toJs
    p.eventPool            = eventPool
    p.header               = header.toRaw
    p.onActionClick        = (onActionClickE, onActionClick).toJs
    p.onClose              = (onCloseE, onClose).toJs
    p.onMount = (onMountE, onMount).toJs.map { f => (_, p: Modal.ModalProps) =>
      f(p)
    }
    p.open    = open
    p.size    = size.toJs
    p.style   = style.map(_.toJsObject)
    p.trigger = trigger.toJs
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
