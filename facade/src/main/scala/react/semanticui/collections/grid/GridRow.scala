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
import react.semanticui.colors._
import react.semanticui.textalignment._
import react.semanticui.verticalalignment._

final case class GridRow(
  as:                    js.UndefOr[AsC]                       = js.undefined,
  centered:              js.UndefOr[Boolean]                   = js.undefined,
  child:                 js.UndefOr[VdomNode]                  = js.undefined,
  className:             js.UndefOr[String]                    = js.undefined,
  clazz:                 js.UndefOr[Css]                       = js.undefined,
  color:                 js.UndefOr[SemanticColor]             = js.undefined,
  divided:               js.UndefOr[Boolean]                   = js.undefined,
  only:                  js.UndefOr[GridOnly]                  = js.undefined,
  reversed:              js.UndefOr[GridReversed]              = js.undefined,
  stretched:             js.UndefOr[Boolean]                   = js.undefined,
  textAlign:             js.UndefOr[SemanticTextAlignment]     = js.undefined,
  verticalAlign:         js.UndefOr[SemanticVerticalAlignment] = js.undefined,
  override val children: CtorType.ChildrenArgs                 = Seq.empty
) extends GenericFnComponentPC[GridRow.GridRowProps] {
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    GridRow.component(GridRow.props(this))
}

object GridRow {
  @js.native
  @JSImport("semantic-ui-react", "GridRow")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait GridRowProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A row can have its columns centered. */
    var centered: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** A grid row can be colored. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.native

    /** Represents column count per line in Row. */
    var columns: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A row can have dividers between its columns. */
    var divided: js.UndefOr[Boolean] = js.native

    /** A row can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[String] = js.native

    /** A  row can specify that its columns should reverse order at different device sizes. */
    var reversed: js.UndefOr[String] = js.native

    /** An can stretch its contents to take up the entire column height. */
    var stretched: js.UndefOr[Boolean] = js.native

    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native

    /** A row can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[suiraw.SemanticVERTICALALIGNMENTS] = js.native
  }

  def props(q: GridRow): GridRowProps =
    rawprops(q.as,
             q.centered,
             q.child,
             q.className,
             q.clazz,
             q.color,
             q.divided,
             q.only,
             q.reversed,
             q.stretched,
             q.textAlign,
             q.verticalAlign)

  def rawprops(
    as:            js.UndefOr[AsC]                       = js.undefined,
    centered:      js.UndefOr[Boolean]                   = js.undefined,
    children:      js.UndefOr[VdomNode]                  = js.undefined,
    className:     js.UndefOr[String]                    = js.undefined,
    clazz:         js.UndefOr[Css]                       = js.undefined,
    color:         js.UndefOr[SemanticColor]             = js.undefined,
    divided:       js.UndefOr[Boolean]                   = js.undefined,
    only:          js.UndefOr[GridOnly]                  = js.undefined,
    reversed:      js.UndefOr[GridReversed]              = js.undefined,
    stretched:     js.UndefOr[Boolean]                   = js.undefined,
    textAlign:     js.UndefOr[SemanticTextAlignment]     = js.undefined,
    verticalAlign: js.UndefOr[SemanticVerticalAlignment] = js.undefined
  ): GridRowProps = {
    val p = (new js.Object).asInstanceOf[GridRowProps]
    p.as            = as.toJs
    p.centered      = centered
    p.children      = children.toJs
    p.className     = (className, clazz).toJs
    p.color         = color.toJs
    p.divided       = divided
    p.only          = only.toJs
    p.reversed      = reversed.toJs
    p.stretched     = stretched
    p.textAlign     = textAlign.toJs
    p.verticalAlign = verticalAlign.toJs
    p
  }

  private val component =
    JsFnComponent[GridRowProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): GridRow =
    new GridRow(children = content)
}
