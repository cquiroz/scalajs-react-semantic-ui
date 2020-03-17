package react.semanticui.addons.portal

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common._
import japgolly.scalajs.react.vdom.TagMod

final case class Portal(
  child:                    js.UndefOr[VdomNode]         = js.undefined,
  closeOnDocumentClick:     js.UndefOr[Boolean]          = js.undefined,
  closeOnEscape:            js.UndefOr[Boolean]          = js.undefined,
  closeOnPortalMouseLeave:  js.UndefOr[Boolean]          = js.undefined,
  closeOnTriggerBlur:       js.UndefOr[Boolean]          = js.undefined,
  closeOnTriggerClick:      js.UndefOr[Boolean]          = js.undefined,
  closeOnTriggerMouseLeave: js.UndefOr[Boolean]          = js.undefined,
  defaultOpen:              js.UndefOr[Boolean]          = js.undefined,
  eventPool:                js.UndefOr[String]           = js.undefined,
  mouseEnterDelay:          js.UndefOr[JsNumber]         = js.undefined,
  mouseLeaveDelay:          js.UndefOr[JsNumber]         = js.undefined,
  onCloseE:                 js.UndefOr[Portal.OnClose]   = js.undefined,
  onClose:                  js.UndefOr[Callback]         = js.undefined,
  onMountE:                 js.UndefOr[Portal.OnMount]   = js.undefined,
  onMount:                  js.UndefOr[Callback]         = js.undefined,
  onOpenE:                  js.UndefOr[Portal.OnOpen]    = js.undefined,
  onOpen:                   js.UndefOr[Callback]         = js.undefined,
  onUnmountE:               js.UndefOr[Portal.OnUnmount] = js.undefined,
  onUnmount:                js.UndefOr[Callback]         = js.undefined,
  open:                     js.UndefOr[Boolean]          = js.undefined,
  openOnTriggerClick:       js.UndefOr[Boolean]          = js.undefined,
  openOnTriggerFocus:       js.UndefOr[Boolean]          = js.undefined,
  openOnTriggerMouseEnter:  js.UndefOr[Boolean]          = js.undefined,
  trigger:                  js.UndefOr[VdomNode]         = js.undefined,
  override val modifiers:   Seq[TagMod]                  = Seq.empty
) extends GenericComponentPAC[Portal.PortalProps, Portal] {
  override protected def cprops    = Portal.props(this)
  override protected val component = Portal.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Portal {
  type RawOnClose   = js.Function2[ReactMouseEvent, Portal.PortalProps, Unit]
  type OnClose      = (ReactMouseEvent, Portal.PortalProps) => Callback
  type RawOnOpen    = js.Function2[ReactMouseEvent, Portal.PortalProps, Unit]
  type OnOpen       = (ReactMouseEvent, Portal.PortalProps) => Callback
  type RawOnMount   = js.Function2[Any, Portal.PortalProps, Unit]
  type OnMount      = (Any, Portal.PortalProps) => Callback
  type RawOnUnmount = js.Function2[Any, Portal.PortalProps, Unit]
  type OnUnmount    = (Any, Portal.PortalProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Portal")
  object RawComponent extends js.Object

  @js.native
  trait PortalProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Controls whether or not the portal should close on a click outside. */
    var closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should close when escape is pressed is displayed. */
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined

    /**
      * Controls whether or not the portal should close when mousing out of the portal.
      * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
      * gap from the trigger to the portal.
      */
    var closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should close on blur of the trigger. */
    var closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should close on click of the trigger. */
    var closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should close when mousing out of the trigger. */
    var closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined

    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined

    /** Event pool namespace that is used to handle component events. */
    var eventPool: js.UndefOr[String] = js.undefined

    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[Any] = js.undefined

    /** Milliseconds to wait before opening on mouse over */
    var mouseEnterDelay: js.UndefOr[JsNumber] = js.undefined

    /** Milliseconds to wait before closing on mouse leave */
    var mouseLeaveDelay: js.UndefOr[JsNumber] = js.undefined

    /**
      * Called when a close event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[RawOnClose] = js.undefined

    /**
      * Called when the portal is mounted on the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[RawOnMount] = js.native

    /**
      * Called when an open event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[RawOnOpen] = js.undefined

    /**
      * Called when the portal is unmounted from the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[RawOnUnmount]

    /** Controls whether or not the portal is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should open when the trigger is clicked. */
    var openOnTriggerClick: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should open on focus of the trigger. */
    var openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined

    /** Controls whether or not the portal should open when mousing over the trigger. */
    var openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined

    /** Element to be rendered in-place where the portal is defined. */
    var trigger: js.UndefOr[React.Node] = js.undefined

    ///** Called with a ref to the trigger node. */
    // var triggerRef: js.UndefOr[Ref]
  }

  def props(q: Portal): PortalProps =
    rawprops(
      q.child,
      q.closeOnDocumentClick,
      q.closeOnEscape,
      q.closeOnPortalMouseLeave,
      q.closeOnTriggerBlur,
      q.closeOnTriggerClick,
      q.closeOnTriggerMouseLeave,
      q.defaultOpen,
      q.eventPool,
      q.mouseEnterDelay,
      q.mouseLeaveDelay,
      q.onCloseE,
      q.onClose,
      q.onMountE,
      q.onMount,
      q.onOpenE,
      q.onOpen,
      q.onUnmountE,
      q.onUnmount,
      q.open,
      q.openOnTriggerClick,
      q.openOnTriggerFocus,
      q.openOnTriggerMouseEnter,
      q.trigger
    )

  def rawprops(
    children:                 js.UndefOr[VdomNode]         = js.undefined,
    closeOnDocumentClick:     js.UndefOr[Boolean]          = js.undefined,
    closeOnEscape:            js.UndefOr[Boolean]          = js.undefined,
    closeOnPortalMouseLeave:  js.UndefOr[Boolean]          = js.undefined,
    closeOnTriggerBlur:       js.UndefOr[Boolean]          = js.undefined,
    closeOnTriggerClick:      js.UndefOr[Boolean]          = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean]          = js.undefined,
    defaultOpen:              js.UndefOr[Boolean]          = js.undefined,
    eventPool:                js.UndefOr[String]           = js.undefined,
    mouseEnterDelay:          js.UndefOr[JsNumber]         = js.undefined,
    mouseLeaveDelay:          js.UndefOr[JsNumber]         = js.undefined,
    onCloseE:                 js.UndefOr[Portal.OnClose]   = js.undefined,
    onClose:                  js.UndefOr[Callback]         = js.undefined,
    onMountE:                 js.UndefOr[Portal.OnMount]   = js.undefined,
    onMount:                  js.UndefOr[Callback]         = js.undefined,
    onOpenE:                  js.UndefOr[Portal.OnOpen]    = js.undefined,
    onOpen:                   js.UndefOr[Callback]         = js.undefined,
    onUnmountE:               js.UndefOr[Portal.OnUnmount] = js.undefined,
    onUnmount:                js.UndefOr[Callback]         = js.undefined,
    open:                     js.UndefOr[Boolean]          = js.undefined,
    openOnTriggerClick:       js.UndefOr[Boolean]          = js.undefined,
    openOnTriggerFocus:       js.UndefOr[Boolean]          = js.undefined,
    openOnTriggerMouseEnter:  js.UndefOr[Boolean]          = js.undefined,
    trigger:                  js.UndefOr[VdomNode]         = js.undefined
  ): PortalProps = {
    val p = (new js.Object).asInstanceOf[PortalProps]
    p.children                 = children.toJs
    p.closeOnDocumentClick     = closeOnDocumentClick
    p.closeOnEscape            = closeOnEscape
    p.closeOnPortalMouseLeave  = closeOnPortalMouseLeave
    p.closeOnTriggerBlur       = closeOnTriggerBlur
    p.closeOnTriggerClick      = closeOnTriggerClick
    p.closeOnTriggerMouseLeave = closeOnTriggerMouseLeave
    p.defaultOpen              = defaultOpen
    p.eventPool                = eventPool
    p.mouseEnterDelay          = mouseEnterDelay
    p.mouseLeaveDelay          = mouseLeaveDelay
    p.onClose                  = (onCloseE, onClose).toJs
    p.onMount                  = (onMountE, onMount).toJs
    p.onOpen                   = (onOpenE, onOpen).toJs
    p.onUnmount                = (onUnmountE, onUnmount).toJs
    p.open                     = open
    p.openOnTriggerClick       = openOnTriggerClick
    p.openOnTriggerFocus       = openOnTriggerFocus
    p.openOnTriggerMouseEnter  = openOnTriggerMouseEnter
    p.trigger                  = trigger.toJs
    p
  }

  private val component =
    JsComponent[PortalProps, Children.Varargs, Null](RawComponent)

  def apply(content: TagMod*): Portal =
    new Portal(modifiers = content)
}
