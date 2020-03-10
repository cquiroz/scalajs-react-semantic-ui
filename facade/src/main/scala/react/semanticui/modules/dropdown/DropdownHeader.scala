package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui.raw._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.IconShorthand
import react.semanticui._

final case class DropdownHeader(
  as:                    js.UndefOr[AsC]           = js.undefined,
  child:                 js.UndefOr[VdomNode]      = js.undefined,
  className:             js.UndefOr[String]        = js.undefined,
  clazz:                 js.UndefOr[Css]           = js.undefined,
  content:               js.UndefOr[VdomNode]      = js.undefined,
  icon:                  js.UndefOr[IconShorthand] = js.undefined,
  override val children: CtorType.ChildrenArgs     = Seq.empty
) extends GenericComponentPC[DropdownHeader.DropdownHeaderProps] {
  override def cprops    = DropdownHeader.props(this)
  @inline def renderWith = DropdownHeader.component(DropdownHeader.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object DropdownHeader {
  @js.native
  @JSImport("semantic-ui-react", "DropdownHeader")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DropdownHeaderProps extends js.Object {
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
    var content: js.UndefOr[SemanticShorthandContent] = js.native

    /** Shorthand for Icon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItemSB[IconProps]] = js.native
  }

  def props(q: DropdownHeader): DropdownHeaderProps =
    rawprops(q.as, q.child, q.className, q.clazz, q.content, q.icon)

  def rawprops(
    as:        js.UndefOr[AsC]           = js.undefined,
    children:  js.UndefOr[VdomNode]      = js.undefined,
    className: js.UndefOr[String]        = js.undefined,
    clazz:     js.UndefOr[Css]           = js.undefined,
    content:   js.UndefOr[VdomNode]      = js.undefined,
    icon:      js.UndefOr[IconShorthand] = js.undefined
  ): DropdownHeaderProps = {
    val p = as.toJsObject[DropdownHeaderProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.icon      = icon.toJs
    p
  }

  private val component =
    JsComponent[DropdownHeaderProps, Children.Varargs, Null](RawComponent)

  def apply(
    content: VdomNode*
  ): DropdownHeader =
    new DropdownHeader(as        = js.undefined,
                       child     = js.undefined,
                       className = js.undefined,
                       clazz     = js.undefined,
                       content   = js.undefined,
                       icon      = js.undefined,
                       children  = content)
}
