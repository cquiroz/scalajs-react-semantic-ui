package react.semanticui.collections.grid

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.floats._
import react.semanticui.widths._
import react.semanticui.colors._
import react.semanticui.textalignment._
import react.semanticui.verticalalignment._

final case class GridColumn(
  as:                    js.UndefOr[AsC]                       = js.undefined,
  child:                 js.UndefOr[VdomNode]                  = js.undefined,
  className:             js.UndefOr[String]                    = js.undefined,
  clazz:                 js.UndefOr[Css]                       = js.undefined,
  color:                 js.UndefOr[SemanticColor]             = js.undefined,
  computer:              js.UndefOr[SemanticWidth]             = js.undefined,
  floated:               js.UndefOr[SemanticFloats]            = js.undefined,
  largeScreen:           js.UndefOr[SemanticWidth]             = js.undefined,
  mobile:                js.UndefOr[SemanticWidth]             = js.undefined,
  only:                  js.UndefOr[GridOnly]                  = js.undefined,
  stretched:             js.UndefOr[Boolean]                   = js.undefined,
  tablet:                js.UndefOr[SemanticWidth]             = js.undefined,
  textAlign:             js.UndefOr[SemanticTextAlignment]     = js.undefined,
  verticalAlign:         js.UndefOr[SemanticVerticalAlignment] = js.undefined,
  widescreen:            js.UndefOr[SemanticWidth]             = js.undefined,
  width:                 js.UndefOr[SemanticWidth]             = js.undefined,
  override val children: CtorType.ChildrenArgs                 = Seq.empty
) extends GenericFnComponentPC[GridColumn.GridColumnProps] {
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    GridColumn.component(GridColumn.props(this))
}

object GridColumn {
  @js.native
  @JSImport("semantic-ui-react", "GridColumn")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait GridColumnProps extends js.Object {
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

    /** A grid column can be colored. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** A column can specify a width for a computer. */
    var computer: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A column can sit flush against the left or right edge of a row. */
    var floated: js.UndefOr[suiraw.SemanticFLOATS] = js.native

    /** A column can specify a width for a large screen device. */
    var largeScreen: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A column can specify a width for a mobile device. */
    var mobile: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A column can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[String] = js.native

    /** An can stretch its contents to take up the entire grid or row height. */
    var stretched: js.UndefOr[Boolean] = js.native

    /** A column can specify a width for a tablet device. */
    var tablet: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native

    /** A column can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[suiraw.SemanticVERTICALALIGNMENTS] = js.native

    /** A column can specify a width for a wide screen device. */
    var widescreen: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** Represents width of column. */
    var width: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'
  }

  def props(q: GridColumn): GridColumnProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.color,
      q.computer,
      q.floated,
      q.largeScreen,
      q.mobile,
      q.only,
      q.stretched,
      q.tablet,
      q.textAlign,
      q.verticalAlign,
      q.widescreen,
      q.width
    )

  def rawprops(
    as:            js.UndefOr[AsC]                       = js.undefined,
    children:      js.UndefOr[VdomNode]                  = js.undefined,
    className:     js.UndefOr[String]                    = js.undefined,
    clazz:         js.UndefOr[Css]                       = js.undefined,
    color:         js.UndefOr[SemanticColor]             = js.undefined,
    computer:      js.UndefOr[SemanticWidth]             = js.undefined,
    floated:       js.UndefOr[SemanticFloats]            = js.undefined,
    largeScreen:   js.UndefOr[SemanticWidth]             = js.undefined,
    mobile:        js.UndefOr[SemanticWidth]             = js.undefined,
    only:          js.UndefOr[GridOnly]                  = js.undefined,
    stretched:     js.UndefOr[Boolean]                   = js.undefined,
    tablet:        js.UndefOr[SemanticWidth]             = js.undefined,
    textAlign:     js.UndefOr[SemanticTextAlignment]     = js.undefined,
    verticalAlign: js.UndefOr[SemanticVerticalAlignment] = js.undefined,
    widescreen:    js.UndefOr[SemanticWidth]             = js.undefined,
    width:         js.UndefOr[SemanticWidth]             = js.undefined
  ): GridColumnProps = {
    val p = (new js.Object).asInstanceOf[GridColumnProps]
    p.as            = as.toJs
    p.children      = children.toJs
    p.className     = (className, clazz).toJs
    p.color         = color.toJs
    p.computer      = computer.toJs
    p.floated       = floated.toJs
    p.largeScreen   = largeScreen.toJs
    p.mobile        = mobile.toJs
    p.only          = only.toJs
    p.stretched     = stretched
    p.tablet        = tablet.toJs
    p.textAlign     = textAlign.toJs
    p.verticalAlign = verticalAlign.toJs
    p.widescreen    = widescreen.toJs
    p.width         = width.toJs
    p
  }

  private val component =
    JsFnComponent[GridColumnProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): GridColumn =
    new GridColumn(children = content)
}
