package react.semanticui.elements.label

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.colors._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import react.semanticui.elements.icon.Icon
import react.semanticui.elements.icon.UnmountedIcon

object Label {

  type OnClick = (ReactMouseEvent, LabelProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Label")
  object RawComponent extends js.Object

  @js.native
  trait LabelProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    var as: js.UndefOr[AsT]                                  = js.native
    var active: js.UndefOr[Boolean]                          = js.native
    var attached: js.UndefOr[String]                         = js.native
    var basic: js.UndefOr[Boolean]                           = js.native
    var children: js.UndefOr[React.Node]                     = js.native
    var circular: js.UndefOr[Boolean]                        = js.native
    var className: js.UndefOr[String]                        = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS]             = js.native
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
    var corner: js.UndefOr[Boolean | String]                 = js.native
    var detail: js.UndefOr[suiraw.SemanticShorthandItem[LabelDetail.LabelDetailProps]] =
      js.native
    var empty: js.UndefOr[js.Any]       = js.native
    var floating: js.UndefOr[Boolean]   = js.native
    var horizontal: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]] =
      js.native
    var image: js.UndefOr[js.Any] = js.native
    var onClick: js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]] =
      js.native
    var onRemove: js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]] =
      js.native
    var pointing: js.UndefOr[Boolean | String] = js.native
    var removeIcon: js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]] =
      js.native
    var ribbon: js.UndefOr[Boolean | String]   = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
    var tag: js.UndefOr[Boolean]               = js.native
  }

  def props(
    as:         js.UndefOr[AsC]                                                 = js.undefined,
    active:     js.UndefOr[Boolean]                                             = js.undefined,
    attached:   js.UndefOr[LabelAttached]                                       = js.undefined,
    basic:      js.UndefOr[Boolean]                                             = js.undefined,
    children:   js.UndefOr[React.Node]                                          = js.undefined,
    circular:   js.UndefOr[Boolean]                                             = js.undefined,
    className:  js.UndefOr[String]                                              = js.undefined,
    clazz:      js.UndefOr[Css]                                                 = js.undefined,
    color:      js.UndefOr[SemanticColor]                                       = js.undefined,
    content:    js.UndefOr[SemanticShortHandContent]                            = js.undefined,
    corner:     js.UndefOr[LabelCorner]                                         = js.undefined,
    detail:     js.UndefOr[SemanticShortHandItem[LabelDetail.LabelDetailProps]] = js.undefined,
    empty:      js.UndefOr[Boolean]                                             = js.undefined,
    floating:   js.UndefOr[Boolean]                                             = js.undefined,
    horizontal: js.UndefOr[Boolean]                                             = js.undefined,
    icon:       js.UndefOr[UnmountedIcon]                                       = js.undefined,
    image:      js.UndefOr[Boolean]                                             = js.undefined,
    onClickE:   js.UndefOr[OnClick]                                             = js.undefined,
    onClick:    js.UndefOr[Callback]                                            = js.undefined,
    onRemove:   js.UndefOr[OnClick]                                             = js.undefined,
    pointing:   js.UndefOr[LabelPointing]                                       = js.undefined,
    removeIcon: js.UndefOr[UnmountedIcon]                                       = js.undefined,
    ribbon:     js.UndefOr[LabelRibbon]                                         = js.undefined,
    size:       js.UndefOr[SemanticSize]                                        = js.undefined,
    tag:        js.UndefOr[Boolean]                                             = js.undefined
  ): LabelProps = {
    val p = as.toJsObject[LabelProps]
    p.as         = as.toJs
    p.active     = active
    p.attached   = attached.toJs
    p.basic      = basic
    p.children   = children
    p.circular   = circular
    p.className  = (className, clazz).toJs
    p.color      = color.toJs
    p.content    = content.toRaw
    p.corner     = corner.toJs
    p.detail     = detail.toRaw
    p.empty      = empty.map(_.asInstanceOf[js.Any])
    p.floating   = floating
    p.horizontal = horizontal
    p.icon       = icon.map(_.props)
    p.image      = image.map(_.asInstanceOf[js.Any])
    p.onClick    = (onClickE, onClick).toJs
    p.onRemove   = onRemove.toJs
    p.pointing   = pointing.toJs
    p.removeIcon = removeIcon.map(_.props)
    p.ribbon     = ribbon.toJs
    p.size       = size.toJs
    p.tag        = tag
    p
  }

  private val component =
    JsComponent[LabelProps, Children.Varargs, Null](RawComponent)

  def apply(
    p:        LabelProps,
    children: VdomNode*
  ): UnmountedMapped[Id, LabelProps, Null, RawMounted[LabelProps, Null], LabelProps, Null] =
    component(p)(children: _*)

  def apply(
    children: VdomNode*
  ): UnmountedMapped[Id, LabelProps, Null, RawMounted[LabelProps, Null], LabelProps, Null] =
    component(props())(children: _*)
}
