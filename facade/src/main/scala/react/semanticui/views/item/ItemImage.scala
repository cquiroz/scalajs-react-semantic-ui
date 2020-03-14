package react.semanticui.views.item

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.elements.image._
import react.semanticui.elements.image.Image._

final case class ItemImage(
  as:                    js.UndefOr[AsC]                       = js.undefined,
  avatar:                js.UndefOr[Boolean]                   = js.undefined,
  bordered:              js.UndefOr[Boolean]                   = js.undefined,
  centered:              js.UndefOr[Boolean]                   = js.undefined,
  child:                 js.UndefOr[VdomNode]                  = js.undefined,
  circular:              js.UndefOr[Boolean]                   = js.undefined,
  className:             js.UndefOr[String]                    = js.undefined,
  clazz:                 js.UndefOr[Css]                       = js.undefined,
  content:               js.UndefOr[VdomNode]                  = js.undefined,
  disabled:              js.UndefOr[Boolean]                   = js.undefined,
  dimmer:                js.UndefOr[VdomNode]                  = js.undefined,
  floated:               js.UndefOr[SemanticFloat]             = js.undefined,
  fluid:                 js.UndefOr[Boolean | String]          = js.undefined,
  hidden:                js.UndefOr[Boolean]                   = js.undefined,
  href:                  js.UndefOr[String]                    = js.undefined,
  inline:                js.UndefOr[Boolean]                   = js.undefined,
  label:                 js.UndefOr[VdomNode]                  = js.undefined,
  rounded:               js.UndefOr[Boolean]                   = js.undefined,
  size:                  js.UndefOr[SemanticSize]              = js.undefined,
  spaced:                js.UndefOr[ImageSpaced]               = js.undefined,
  src:                   js.UndefOr[String]                    = js.undefined,
  ui:                    js.UndefOr[Boolean]                   = js.undefined,
  verticalAlign:         js.UndefOr[SemanticVerticalAlignment] = js.undefined,
  wrapped:               js.UndefOr[Boolean]                   = js.undefined,
  override val children: CtorType.ChildrenArgs                 = Seq.empty
) extends GenericFnComponentPC[ItemImage.ItemImageProps, ItemImage] {
  override protected def cprops = ItemImage.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    ItemImage.component(ItemImage.props(this))
}

object ItemImage {
  @js.native
  @JSImport("semantic-ui-react", "ItemImage")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ItemImageProps extends ImageProps {}

  def props(
    q: ItemImage
  ): ItemImageProps = {
    val p = q.as.toJsObject[ItemImageProps]
    p.as            = q.as.toJs
    p.avatar        = q.avatar
    p.bordered      = q.bordered
    p.centered      = q.centered
    p.children      = q.child.toJs
    p.circular      = q.circular
    p.className     = (q.className, q.clazz).toJs
    p.content       = q.content.toJs
    p.disabled      = q.disabled
    p.dimmer        = q.dimmer.toJs
    p.floated       = q.floated.toJs
    p.fluid         = q.fluid
    p.hidden        = q.hidden
    p.href          = q.href
    p.inline        = q.inline
    p.label         = q.label.toJs
    p.rounded       = q.rounded
    p.size          = q.size.toJs
    p.spaced        = q.spaced.toJs
    p.src           = q.src
    p.ui            = q.ui
    p.verticalAlign = q.verticalAlign.toJs
    p.wrapped       = q.wrapped
    p
  }

  private val component =
    JsFnComponent[ItemImageProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): ItemImage = new ItemImage(children = content)

}
