package react.semanticui.modules.popup

import scala.scalajs.js
import js.annotation._
import js.|
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.sizes._
import react.semanticui.{ raw => suiraw }

final case class Popup(
  as:                    js.UndefOr[AsC]                            = js.undefined,
  basic:                 js.UndefOr[Boolean]                        = js.undefined,
  child:                 js.UndefOr[VdomNode]                       = js.undefined,
  className:             js.UndefOr[String]                         = js.undefined,
  clazz:                 js.UndefOr[Css]                            = js.undefined,
  content:               js.UndefOr[PopupContent.PopupContentProps] = js.undefined,
  disabled:              js.UndefOr[Boolean]                        = js.undefined,
  flowing:               js.UndefOr[Boolean]                        = js.undefined,
  header:                js.UndefOr[PopupHeader.PopupHeaderProps]   = js.undefined,
  hideOnScroll:          js.UndefOr[Boolean]                        = js.undefined,
  hoverable:             js.UndefOr[Boolean]                        = js.undefined,
  inverted:              js.UndefOr[Boolean]                        = js.undefined,
  offset:                js.UndefOr[JsNumber | String]              = js.undefined,
  on:                    js.UndefOr[PopupOn | List[PopupOn]]        = js.undefined,
  onCloseE:              js.UndefOr[Popup.OnClose]                  = js.undefined,
  onClose:               js.UndefOr[Callback]                       = js.undefined,
  onOpenE:               js.UndefOr[Popup.OnOpen]                   = js.undefined,
  onOpen:                js.UndefOr[Callback]                       = js.undefined,
  pinned:                js.UndefOr[Boolean]                        = js.undefined,
  position:              js.UndefOr[PopupPosition]                  = js.undefined,
  popperModifiers:       js.UndefOr[js.Object]                      = js.undefined,
  size:                  js.UndefOr[SemanticSize]                   = js.undefined,
  style:                 js.UndefOr[Style]                          = js.undefined,
  trigger:               js.UndefOr[VdomNode]                       = js.undefined,
  wide:                  js.UndefOr[PopupWide]                      = js.undefined,
  override val children: CtorType.ChildrenArgs                      = Seq.empty
) extends GenericComponentPC[Popup.PopupProps] {
  override def cprops    = Popup.props(this)
  @inline def renderWith = Popup.component(Popup.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object Popup {
  private type RawOnClose = js.Function2[ReactMouseEvent, PopupProps, Unit]
  type OnClose            = (ReactMouseEvent, PopupProps) => Callback
  private type RawOnOpen  = RawOnClose
  type OnOpen             = OnClose

  @js.native
  @JSImport("semantic-ui-react", "Popup")
  object RawComponent extends js.Object

  @js.native
  trait PopupProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Display the popup without the pointing arrow */
    var basic: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Simple text content for the popover. */
    var content: js.UndefOr[suiraw.SemanticShorthandItem[PopupContent.PopupContentProps]] =
      js.native

    /** Existing element the pop-up should be bound to. */
    // context?: object | React.RefObject<HTMLElement>

    /** A disabled popup only renders its trigger. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** A flowing Popup has no maximum width and continues to flow to fit its content. */
    var flowing: js.UndefOr[Boolean] = js.native

    /** Header displayed above the content in bold. */
    var header: js.UndefOr[suiraw.SemanticShorthandItem[PopupHeader.PopupHeaderProps]] = js.native

    /** Hide the Popup when scrolling the window. */
    var hideOnScroll: js.UndefOr[Boolean] = js.native

    /** Whether the popup should not close on hover. */
    var hoverable: js.UndefOr[Boolean] = js.native

    /** Invert the colors of the popup */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Offset value to apply to rendered popup. Accepts the following units:
      * - px or unit-less, interpreted as pixels
      * - %, percentage relative to the length of the trigger element
      * - %p, percentage relative to the length of the popup element
      * - vw, CSS viewport width unit
      * - vh, CSS viewport height unit
      */
    var offset: js.UndefOr[JsNumber | String] = js.native

    /** Events triggering the popup. */
    var on: js.UndefOr[String | js.Array[String]] = js.native

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
    // onMount?: (nothing: null, data: PopupProps) => void

    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[RawOnOpen] = js.native

    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    // onUnmount?: (nothing: null, data: PopupProps) => void

    /** Disables automatic repositioning of the component, it will always be placed according to the position value. */
    var pinned: js.UndefOr[Boolean] = js.native

    /** Position for the popover. */
    var position: js.UndefOr[String] = js.native

    /** An object containing custom settings for the Popper.js modifiers. */
    var popperModifiers: js.UndefOr[js.Object] = js.native

    /** A popup can have dependencies which update will schedule a position update. */
    //popperDependencies?: any[]

    /** Popup size. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** Custom Popup style. */
    var style: js.UndefOr[js.Object] = js.native

    /** Element to be rendered in-place where the popup is defined. */
    var trigger: js.UndefOr[React.Node] = js.native

    /** Popup width. */
    var wide: js.UndefOr[Boolean | String] = js.native
  }

  def props(q: Popup): PopupProps =
    rawprops(
      q.as,
      q.basic,
      q.child,
      q.className,
      q.clazz,
      q.content,
      q.disabled,
      q.flowing,
      q.header,
      q.hideOnScroll,
      q.hoverable,
      q.inverted,
      q.offset,
      q.on,
      q.onCloseE,
      q.onClose,
      q.onOpenE,
      q.onOpen,
      q.pinned,
      q.position,
      q.popperModifiers,
      q.size,
      q.style,
      q.trigger,
      q.wide
    )

  def rawprops(
    as:              js.UndefOr[AsC]                            = js.undefined,
    basic:           js.UndefOr[Boolean]                        = js.undefined,
    children:        js.UndefOr[VdomNode]                       = js.undefined,
    className:       js.UndefOr[String]                         = js.undefined,
    clazz:           js.UndefOr[Css]                            = js.undefined,
    content:         js.UndefOr[PopupContent.PopupContentProps] = js.undefined,
    disabled:        js.UndefOr[Boolean]                        = js.undefined,
    flowing:         js.UndefOr[Boolean]                        = js.undefined,
    header:          js.UndefOr[PopupHeader.PopupHeaderProps]   = js.undefined,
    hideOnScroll:    js.UndefOr[Boolean]                        = js.undefined,
    hoverable:       js.UndefOr[Boolean]                        = js.undefined,
    inverted:        js.UndefOr[Boolean]                        = js.undefined,
    offset:          js.UndefOr[JsNumber | String]              = js.undefined,
    on:              js.UndefOr[PopupOn | List[PopupOn]]        = js.undefined,
    onCloseE:        js.UndefOr[OnClose]                        = js.undefined,
    onClose:         js.UndefOr[Callback]                       = js.undefined,
    onOpenE:         js.UndefOr[OnOpen]                         = js.undefined,
    onOpen:          js.UndefOr[Callback]                       = js.undefined,
    pinned:          js.UndefOr[Boolean]                        = js.undefined,
    position:        js.UndefOr[PopupPosition]                  = js.undefined,
    popperModifiers: js.UndefOr[js.Object]                      = js.undefined,
    size:            js.UndefOr[SemanticSize]                   = js.undefined,
    style:           js.UndefOr[Style]                          = js.undefined,
    trigger:         js.UndefOr[VdomNode]                       = js.undefined,
    wide:            js.UndefOr[PopupWide]                      = js.undefined
  ): PopupProps = {
    val p = as.toJsObject[PopupProps]
    p.as           = as.toJs
    p.basic        = basic
    p.children     = children.toJs
    p.className    = (className, clazz).toJs
    p.content      = content
    p.disabled     = disabled
    p.flowing      = flowing
    p.header       = header
    p.hideOnScroll = hideOnScroll
    p.hoverable    = hoverable
    p.inverted     = inverted
    p.offset       = offset
    p.on = on.map { x =>
      (x: Any) match {
        case p: PopupOn => p.toJs
        case p          => p.asInstanceOf[List[PopupOn]].map(_.toJs).toJSArray
      }
    }
    p.onClose         = (onCloseE, onClose).toJs
    p.onOpen          = (onOpenE, onOpen).toJs
    p.pinned          = pinned
    p.position        = position.toJs
    p.popperModifiers = popperModifiers
    p.size            = size.toJs
    p.style           = style.map(_.toJsObject)
    p.trigger         = trigger.toJs
    p.wide            = wide.toJs
    p
  }

  private val component =
    JsComponent[PopupProps, Children.Varargs, Null](RawComponent)

  def apply(
    content: VdomNode*
  ): Popup =
    new Popup(children = content)
}
