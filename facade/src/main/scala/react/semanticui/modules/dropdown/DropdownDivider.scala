package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui._
import react.common.style._
import react.common._

final case class DropdownDivider(
  as:                    js.UndefOr[AsC]       = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[DropdownDivider.DropdownDividerProps] {
  override def cprops    = DropdownDivider.props(this)
  @inline def renderWith = DropdownDivider.component(DropdownDivider.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object DropdownDivider {
  @js.native
  @JSImport("semantic-ui-react", "DropdownDivider")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait DropdownDividerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
  }

  def props(q: DropdownDivider): DropdownDividerProps =
    rawprops(q.as, q.className, q.clazz)

  def rawprops(
    as:        js.UndefOr[AsC]    = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    clazz:     js.UndefOr[Css]    = js.undefined
  ): DropdownDividerProps = {
    val p = as.toJsObject[DropdownDividerProps]
    p.as        = as.toJs
    p.className = (className, clazz).toJs
    p
  }

  private val component =
    JsFnComponent[DropdownDividerProps, Children.Varargs](RawComponent)

  def apply(
    children: VdomNode*
  ): DropdownDivider =
    new DropdownDivider(children = children)
}
