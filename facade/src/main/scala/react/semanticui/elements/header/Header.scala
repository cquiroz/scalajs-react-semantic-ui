package react.semanticui.elements.header

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.sizes._
import react.semanticui.colors._
import react.semanticui.floats._
import react.semanticui.textalignment._

final case class Header(
  as:                    js.UndefOr[AsC]                   = js.undefined,
  attached:              js.UndefOr[HeaderAttached]        = js.undefined,
  block:                 js.UndefOr[Boolean]               = js.undefined,
  child:                 js.UndefOr[VdomNode]              = js.undefined,
  className:             js.UndefOr[String]                = js.undefined,
  clazz:                 js.UndefOr[Css]                   = js.undefined,
  color:                 js.UndefOr[SemanticColor]         = js.undefined,
  content:               js.UndefOr[VdomNode]              = js.undefined,
  disabled:              js.UndefOr[Boolean]               = js.undefined,
  dividing:              js.UndefOr[Boolean]               = js.undefined,
  floated:               js.UndefOr[SemanticFloats]        = js.undefined,
  icon:                  js.UndefOr[Boolean]               = js.undefined,
  image:                 js.UndefOr[Boolean]               = js.undefined,
  inverted:              js.UndefOr[Boolean]               = js.undefined,
  size:                  js.UndefOr[SemanticSize]          = js.undefined,
  sub:                   js.UndefOr[Boolean]               = js.undefined,
  subheader:             js.UndefOr[HeaderSubheader]       = js.undefined,
  textAlign:             js.UndefOr[SemanticTextAlignment] = js.undefined,
  override val children: CtorType.ChildrenArgs             = Seq.empty
) extends GenericFnComponentPC[Header.HeaderProps] {
  override def cprops = Header.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    Header.component(Header.props(this))
}

object Header {
  @js.native
  @JSImport("semantic-ui-react", "Header")
  private[semanticui] object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait HeaderProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Attach header  to other content, like a segment. */
    var attached: js.UndefOr[Boolean | String] = js.native

    /** Format header to appear inside a content block. */
    var block: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Color of the header. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Show that the header is inactive. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Divide header from the content below it. */
    var dividing: js.UndefOr[Boolean] = js.native

    /** Header can sit to the left or right of other content. */
    var floated: js.UndefOr[suiraw.SemanticFLOATS] = js.native

    /** Add an icon by icon name or pass an Icon. */
    var icon: js.UndefOr[Boolean] = js.native

    /** Add an image by img src or pass an Image. */
    var image: js.UndefOr[Boolean] = js.native

    /** Inverts the color of the header for dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** Content headings are sized with em and are based on the font-size of their container. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** Headers may be formatted to label smaller or de-emphasized content. */
    var sub: js.UndefOr[Boolean] = js.native

    /** Shorthand for Header.Subheader. */
    var subheader: js.UndefOr[suiraw.SemanticShorthandItem[HeaderSubheader.HeaderSubheaderProps]] =
      js.native

    /** Align header content. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native
  }

  def props(q: Header): HeaderProps =
    rawprops(
      as        = q.as,
      attached  = q.attached,
      block     = q.block,
      children  = q.child,
      className = q.className,
      clazz     = q.clazz,
      color     = q.color,
      content   = q.content,
      disabled  = q.disabled,
      dividing  = q.dividing,
      floated   = q.floated,
      icon      = q.icon,
      image     = q.image,
      inverted  = q.inverted,
      size      = q.size,
      sub       = q.sub,
      subheader = q.subheader,
      textAlign = q.textAlign
    )

  def rawprops(
    as:        js.UndefOr[AsC]                   = js.undefined,
    attached:  js.UndefOr[HeaderAttached]        = js.undefined,
    block:     js.UndefOr[Boolean]               = js.undefined,
    children:  js.UndefOr[VdomNode]              = js.undefined,
    className: js.UndefOr[String]                = js.undefined,
    clazz:     js.UndefOr[Css]                   = js.undefined,
    color:     js.UndefOr[SemanticColor]         = js.undefined,
    content:   js.UndefOr[VdomNode]              = js.undefined,
    disabled:  js.UndefOr[Boolean]               = js.undefined,
    dividing:  js.UndefOr[Boolean]               = js.undefined,
    floated:   js.UndefOr[SemanticFloats]        = js.undefined,
    icon:      js.UndefOr[Boolean]               = js.undefined,
    image:     js.UndefOr[Boolean]               = js.undefined,
    inverted:  js.UndefOr[Boolean]               = js.undefined,
    size:      js.UndefOr[SemanticSize]          = js.undefined,
    sub:       js.UndefOr[Boolean]               = js.undefined,
    subheader: js.UndefOr[HeaderSubheader]       = js.undefined,
    textAlign: js.UndefOr[SemanticTextAlignment] = js.undefined
  ): HeaderProps = {
    val p = as.toJsObject[HeaderProps]
    p.as        = as.toJs
    p.attached  = attached.toJs
    p.block     = block
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.color     = color.toJs
    p.content   = content.toJs
    p.disabled  = disabled
    p.dividing  = dividing
    p.floated   = floated.toJs
    p.icon      = icon
    p.image     = image
    p.inverted  = inverted
    p.size      = size.toJs
    p.sub       = sub
    p.subheader = subheader.map(_.props)
    p.textAlign = textAlign.toJs
    p
  }

  private val component =
    JsFnComponent[HeaderProps, Children.Varargs](RawComponent)

  def apply(
    content: VdomNode*
  ): Header =
    new Header(children = content)
}
