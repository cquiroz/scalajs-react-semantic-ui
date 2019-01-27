package react.semanticui.elements.header

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.sizes._
import react.semanticui.colors._
import react.semanticui.floats._
import react.semanticui.textalignment._

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
    var subheader: js.UndefOr[Boolean] = js.native

    /** Align header content. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native

  }

  def props(
    as:        js.UndefOr[AsC]                   = js.undefined,
    attached:  js.UndefOr[HeaderAttached]        = js.undefined,
    block:     js.UndefOr[Boolean]               = js.undefined,
    children:  js.UndefOr[VdomNode]              = js.undefined,
    className: js.UndefOr[String]                = js.undefined,
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
    subheader: js.UndefOr[Boolean]               = js.undefined,
    textAlign: js.UndefOr[SemanticTextAlignment] = js.undefined
  ): HeaderProps = {
    val p = as.toJsObject[HeaderProps]
    p.as        = as.toJs
    p.attached  = attached.toJs
    p.block     = block
    p.children  = children.toJs
    p.className = className
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
    p.subheader = subheader
    p.textAlign = textAlign.toJs
    p
  }

  private val component =
    JsFnComponent[HeaderProps, Children.Varargs](RawComponent)

  def apply(p:        HeaderProps,
            children: VdomNode*): UnmountedWithRoot[HeaderProps, Unit, HeaderProps] =
    component(p)(children: _*)
}
