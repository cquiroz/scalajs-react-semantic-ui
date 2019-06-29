package react.semanticui.views.item

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

object ItemGroup {

  @js.native
  @JSImport("semantic-ui-react", "ItemGroup")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ItemGroupProps extends js.Object {

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
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Items can be divided to better distinguish between grouped content. */
    var divided: js.UndefOr[Boolean] = js.native

    /** Shorthand array of props for Item. */
    // var items: js.Array[suiraw.SemanticShorthandItem[Item.ItemProps]] = js.native

    /** An item can be formatted so that the entire contents link to another page. */
    var link: js.UndefOr[Boolean] = js.native

    /** A group of items can relax its padding to provide more negative space. */
    var relaxed: js.UndefOr[Boolean | String] = js.native

    /** Prevent items from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native
  }

  def props(
    as:          js.UndefOr[AsC]         = js.undefined,
    children:    js.UndefOr[VdomNode]    = js.undefined,
    className:   js.UndefOr[String]      = js.undefined,
    clazz:       js.UndefOr[Css]         = js.undefined,
    content:     js.UndefOr[VdomNode]    = js.undefined,
    divided:     js.UndefOr[Boolean]     = js.undefined,
    link:        js.UndefOr[Boolean]     = js.undefined,
    relaxed:     js.UndefOr[ItemRelaxed] = js.undefined,
    unstackable: js.UndefOr[Boolean]     = js.undefined
  ): ItemGroupProps = {
    val p = (new js.Object).asInstanceOf[ItemGroupProps]
    p.as          = as.toJs
    p.children    = children.toJs
    p.className   = (className, clazz).toJs
    p.content     = content.toJs
    p.divided     = divided
    p.link        = link
    p.relaxed     = relaxed.toJs
    p.unstackable = unstackable
    p
  }

  private val component =
    JsFnComponent[ItemGroupProps, Children.Varargs](RawComponent)

  def apply(p: ItemGroupProps, children: VdomNode*): UnmountedWithRoot[
    ItemGroupProps,
    Unit,
    ItemGroupProps
  ] =
    component(p)(children: _*)

}
