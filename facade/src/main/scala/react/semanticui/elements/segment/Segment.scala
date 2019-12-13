package react.semanticui.elements.segment

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui.{ raw => suiraw }
import react.common.syntax._
import react.common.style._
import react.semanticui.sizes._
import react.semanticui.colors._
import react.semanticui.floats._
import react.semanticui.textalignment._
import react.semanticui.raw._
import react.semanticui._

object Segment {
  type OnHide = ReactEvent => Callback

  @js.native
  @JSImport("semantic-ui-react", "Segment")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait SegmentProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                                  = js.native
    var attached: js.UndefOr[Boolean | String]               = js.native
    var basic: js.UndefOr[Boolean]                           = js.native
    var children: js.UndefOr[React.Node]                     = js.native
    var circular: js.UndefOr[Boolean]                        = js.native
    var className: js.UndefOr[String]                        = js.native
    var clearing: js.UndefOr[Boolean]                        = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS]             = js.native
    var compact: js.UndefOr[Boolean]                         = js.native
    var content: js.UndefOr[SemanticShorthandContent]        = js.native
    var disabled: js.UndefOr[Boolean]                        = js.native
    var floated: js.UndefOr[suiraw.SemanticFLOATS]           = js.native
    var inverted: js.UndefOr[Boolean]                        = js.native
    var loading: js.UndefOr[Boolean]                         = js.native
    var padded: js.UndefOr[String]                           = js.native
    var placeholder: js.UndefOr[Boolean]                     = js.native
    var piled: js.UndefOr[Boolean]                           = js.native
    var raised: js.UndefOr[Boolean]                          = js.native
    var secondary: js.UndefOr[Boolean]                       = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES]               = js.native
    var stacked: js.UndefOr[Boolean]                         = js.native
    var tertiary: js.UndefOr[Boolean]                        = js.native
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native
    var vertical: js.UndefOr[Boolean]                        = js.native
  }

  def props(
    as:          js.UndefOr[AsC]                   = js.undefined,
    attached:    js.UndefOr[SegmentAttached]       = js.undefined,
    basic:       js.UndefOr[Boolean]               = js.undefined,
    children:    js.UndefOr[VdomNode]              = js.undefined,
    circular:    js.UndefOr[Boolean]               = js.undefined,
    className:   js.UndefOr[String]                = js.undefined,
    clazz:       js.UndefOr[Css]                   = js.undefined,
    clearing:    js.UndefOr[Boolean]               = js.undefined,
    color:       js.UndefOr[SemanticColor]         = js.undefined,
    compact:     js.UndefOr[Boolean]               = js.undefined,
    content:     js.UndefOr[VdomNode]              = js.undefined,
    disabled:    js.UndefOr[Boolean]               = js.undefined,
    floated:     js.UndefOr[SemanticFloats]        = js.undefined,
    inverted:    js.UndefOr[Boolean]               = js.undefined,
    loading:     js.UndefOr[Boolean]               = js.undefined,
    padded:      js.UndefOr[String]                = js.undefined,
    placeholder: js.UndefOr[Boolean]               = js.undefined,
    piled:       js.UndefOr[Boolean]               = js.undefined,
    raised:      js.UndefOr[Boolean]               = js.undefined,
    secondary:   js.UndefOr[Boolean]               = js.undefined,
    size:        js.UndefOr[SemanticSize]          = js.undefined,
    stacked:     js.UndefOr[Boolean]               = js.undefined,
    tertiary:    js.UndefOr[Boolean]               = js.undefined,
    textAlign:   js.UndefOr[SemanticTextAlignment] = js.undefined,
    vertical:    js.UndefOr[Boolean]               = js.undefined
  ): SegmentProps = {
    val p = as.toJsObject[SegmentProps]
    p.as          = as.toJs
    p.attached    = attached.toJs
    p.basic       = basic
    p.children    = children.toJs
    p.circular    = circular
    p.className   = (className, clazz).toJs
    p.clearing    = clearing
    p.color       = color.toJs
    p.compact     = compact
    p.content     = content.toJs
    p.disabled    = disabled
    p.floated     = floated.toJs
    p.inverted    = inverted
    p.loading     = loading
    p.padded      = padded
    p.placeholder = placeholder
    p.piled       = piled
    p.raised      = raised
    p.secondary   = secondary
    p.size        = size.toJs
    p.stacked     = stacked
    p.tertiary    = tertiary
    p.textAlign   = textAlign.toJs
    p.vertical    = vertical
    p
  }

  private val component =
    JsFnComponent[SegmentProps, Children.Varargs](RawComponent)

  def apply(
    p:        SegmentProps,
    children: VdomNode*
  ): UnmountedWithRoot[SegmentProps, Unit, SegmentProps] =
    component(p)(children: _*)

  def apply(children: VdomNode*): UnmountedWithRoot[SegmentProps, Unit, SegmentProps] =
    component(props())(children: _*)
}
