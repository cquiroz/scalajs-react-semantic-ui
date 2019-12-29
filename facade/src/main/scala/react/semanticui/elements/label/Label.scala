package react.semanticui.elements.label

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.colors._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import react.semanticui.elements.icon.Icon

final case class Label(
  as:                    js.UndefOr[AsC]                      = js.undefined,
  active:                js.UndefOr[Boolean]                  = js.undefined,
  attached:              js.UndefOr[LabelAttached]            = js.undefined,
  basic:                 js.UndefOr[Boolean]                  = js.undefined,
  child:                 js.UndefOr[React.Node]               = js.undefined,
  circular:              js.UndefOr[Boolean]                  = js.undefined,
  className:             js.UndefOr[String]                   = js.undefined,
  clazz:                 js.UndefOr[Css]                      = js.undefined,
  color:                 js.UndefOr[SemanticColor]            = js.undefined,
  content:               js.UndefOr[SemanticShortHandContent] = js.undefined,
  corner:                js.UndefOr[LabelCorner]              = js.undefined,
  detail:                js.UndefOr[LabelDetail]              = js.undefined,
  empty:                 js.UndefOr[Boolean]                  = js.undefined,
  floating:              js.UndefOr[Boolean]                  = js.undefined,
  horizontal:            js.UndefOr[Boolean]                  = js.undefined,
  icon:                  js.UndefOr[Icon]                     = js.undefined,
  image:                 js.UndefOr[Boolean]                  = js.undefined,
  onClickE:              js.UndefOr[Label.OnClick]            = js.undefined,
  onClick:               js.UndefOr[Callback]                 = js.undefined,
  onRemove:              js.UndefOr[Label.OnClick]            = js.undefined,
  pointing:              js.UndefOr[LabelPointing]            = js.undefined,
  removeIcon:            js.UndefOr[Icon]                     = js.undefined,
  ribbon:                js.UndefOr[LabelRibbon]              = js.undefined,
  size:                  js.UndefOr[SemanticSize]             = js.undefined,
  tag:                   js.UndefOr[Boolean]                  = js.undefined,
  override val children: CtorType.ChildrenArgs                = Seq.empty
) extends GenericComponentPC[Label.LabelProps] {
  @inline def renderWith = Label.component(Label.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

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
    q: Label
  ): LabelProps = {
    val p = q.as.toJsObject[LabelProps]
    p.as         = q.as.toJs
    p.active     = q.active
    p.attached   = q.attached.toJs
    p.basic      = q.basic
    p.children   = q.child
    p.circular   = q.circular
    p.className  = (q.className, q.clazz).toJs
    p.color      = q.color.toJs
    p.content    = q.content.toRaw
    p.corner     = q.corner.toJs
    p.detail     = q.detail.map(_.props)
    p.empty      = q.empty.map(_.asInstanceOf[js.Any])
    p.floating   = q.floating
    p.horizontal = q.horizontal
    p.icon       = q.icon.map(_.props)
    p.image      = q.image.map(_.asInstanceOf[js.Any])
    p.onClick    = (q.onClickE, q.onClick).toJs
    p.onRemove   = q.onRemove.toJs
    p.pointing   = q.pointing.toJs
    p.removeIcon = q.removeIcon.map(_.props)
    p.ribbon     = q.ribbon.toJs
    p.size       = q.size.toJs
    p.tag        = q.tag
    p
  }

  private val component =
    JsComponent[LabelProps, Children.Varargs, Null](RawComponent)

  def apply(
    content: VdomNode*
  ): Label =
    new Label(children = content)
}
