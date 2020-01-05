package react.semanticui.elements.image

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
import react.semanticui.floats._
import react.semanticui.verticalalignment._

final case class Image(
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
  floated:               js.UndefOr[SemanticFloats]            = js.undefined,
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
) extends GenericFnComponentPC[Image.ImageProps] {
  override def cprops = Image.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    Image.component(Image.props(this))
}

object Image {
  @js.native
  @JSImport("semantic-ui-react", "Image")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ImageProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** An image may be formatted to appear inline with text as an avatar. */
    var avatar: js.UndefOr[Boolean] = js.native

    /** An image may include a border to emphasize the edges of white or transparent content. */
    var bordered: js.UndefOr[Boolean] = js.native

    /** An image can appear centered in a content block. */
    var centered: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** An image may appear circular. */
    var circular: js.UndefOr[Boolean] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** An image can show that it is disabled and cannot be selected. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Shorthand for Dimmer. */
    var dimmer: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** An image can sit to the left or right of other content. */
    var floated: js.UndefOr[suiraw.SemanticFLOATS] = js.native

    /** An image can take up the width of its container. */
    var fluid: js.UndefOr[Boolean | String] = js.native

    /** An image can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.native

    /** Renders the Image as an <a> tag with this href. */
    var href: js.UndefOr[String] = js.native

    /** An image may appear inline. */
    var inline: js.UndefOr[Boolean] = js.native

    /** Shorthand for Label. */
    var label: js.UndefOr[suiraw.SemanticShorthandContent]

    /** An image may appear rounded. */
    var rounded: js.UndefOr[Boolean] = js.native

    /** An image may appear at different sizes. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** An image can specify that it needs an additional spacing to separate it from nearby content. */
    var spaced: js.UndefOr[Boolean | String] = js.native

    var src: js.UndefOr[String] = js.native

    /** Whether or not to add the ui className. */
    var ui: js.UndefOr[Boolean] = js.native

    /** An image can specify its vertical alignment. */
    var verticalAlign: js.UndefOr[suiraw.SemanticVERTICALALIGNMENTS] = js.native

    /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
    var wrapped: js.UndefOr[Boolean] = js.native
  }

  def props(
    q: Image
  ): ImageProps = {
    val p = q.as.toJsObject[ImageProps]
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
    JsFnComponent[ImageProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): Image = new Image(children = content)

  val Default: Image = Image()

  val defaultProps: ImageProps = props(Default)
}
