package react.semanticui.addons.portal

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
// import japgolly.scalajs.react.Ref
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common._

final case class PortalInner(
  child: js.UndefOr[VdomNode] = js.undefined,
  // innerRef:             js.UndefOr[Ref[html.Element]]                     = js.undefined,
  onMountE:              js.UndefOr[PortalInner.OnMount]   = js.undefined,
  onMount:               js.UndefOr[Callback]              = js.undefined,
  onUnmountE:            js.UndefOr[PortalInner.OnUnmount] = js.undefined,
  onUnmount:             js.UndefOr[Callback]              = js.undefined,
  override val children: CtorType.ChildrenArgs             = Seq.empty
) extends GenericComponentPC[PortalInner.PortalInnerProps] {
  override def cprops    = PortalInner.props(this)
  @inline def renderWith = PortalInner.component(PortalInner.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object PortalInner {
  type RawOnMount   = js.Function2[Any, PortalInner.PortalInnerProps, Unit]
  type OnMount      = (Any, PortalInner.PortalInnerProps) => Callback
  type RawOnUnmount = js.Function2[Any, PortalInner.PortalInnerProps, Unit]
  type OnUnmount    = (Any, PortalInner.PortalInnerProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "PortalInner")
  object RawComponent extends js.Object

  @js.native
  trait PortalInnerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Called with a ref to the inner node. */
    // var innerRef: js.UndefOr[Ref] = js.native

    /** The node where the portal should mount. */
    // var mountNode?: any

    /**
      * Called when the PortalInner is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[RawOnMount] = js.native

    /**
      * Called when the PortalInner is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[RawOnUnmount]
  }

  def props(q: PortalInner): PortalInnerProps =
    rawprops(
      q.child,
      // q.innerRef,
      q.onMountE,
      q.onMount,
      q.onUnmountE,
      q.onUnmount
    )

  def rawprops(
    children: js.UndefOr[VdomNode] = js.undefined,
    // innerRef:             js.UndefOr[Ref]                     = js.undefined,
    onMountE:   js.UndefOr[OnMount]   = js.undefined,
    onMount:    js.UndefOr[Callback]  = js.undefined,
    onUnmountE: js.UndefOr[OnUnmount] = js.undefined,
    onUnmount:  js.UndefOr[Callback]  = js.undefined
  ): PortalInnerProps = {
    val p = (new js.Object).asInstanceOf[PortalInnerProps]
    p.children = children.toJs
    // p.innerRef = innerRef
    p.onMount   = (onMountE, onMount).toJs
    p.onUnmount = (onUnmountE, onUnmount).toJs
    p
  }

  private val component =
    JsComponent[PortalInnerProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): PortalInner =
    new PortalInner(children = content)
}
