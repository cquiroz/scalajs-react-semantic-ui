package react.semanticui.collections.grid

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class Grid(
  as:                    js.UndefOr[AsC]                       = js.undefined,
  celled:                js.UndefOr[GridCelled]                = js.undefined,
  centered:              js.UndefOr[Boolean]                   = js.undefined,
  child:                 js.UndefOr[VdomNode]                  = js.undefined,
  className:             js.UndefOr[String]                    = js.undefined,
  clazz:                 js.UndefOr[Css]                       = js.undefined,
  columns:               js.UndefOr[SemanticWidth]             = js.undefined,
  container:             js.UndefOr[Boolean]                   = js.undefined,
  divided:               js.UndefOr[GridDivided]               = js.undefined,
  doubling:              js.UndefOr[Boolean]                   = js.undefined,
  inverted:              js.UndefOr[Boolean]                   = js.undefined,
  padded:                js.UndefOr[GridPadded]                = js.undefined,
  relaxed:               js.UndefOr[GridRelaxed]               = js.undefined,
  reversed:              js.UndefOr[GridReversed]              = js.undefined,
  stackable:             js.UndefOr[Boolean]                   = js.undefined,
  stretched:             js.UndefOr[Boolean]                   = js.undefined,
  textAlign:             js.UndefOr[SemanticTextAlignment]     = js.undefined,
  verticalAlign:         js.UndefOr[SemanticVerticalAlignment] = js.undefined,
  override val children: CtorType.ChildrenArgs                 = Seq.empty
) extends GenericFnComponentPC[Grid.GridProps] {
  override def cprops = Grid.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    Grid.component(Grid.props(this))
}

object Grid {
  @js.native
  @JSImport("semantic-ui-react", "Grid")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait GridProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A grid can have rows divided into cells. */
    var celled: js.UndefOr[Boolean | String] = js.native

    /** A grid can have its columns centered. */
    var centered: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Represents column count per row in Grid. */
    var columns: js.UndefOr[suiraw.SemanticWIDTHS] = js.native // | 'equal'

    /** A grid can be combined with a container to use avaiable layout and alignment. */
    var container: js.UndefOr[Boolean] = js.native

    /** A grid can have dividers between its columns. */
    var divided: js.UndefOr[Boolean | String] = js.native

    /** A grid can double its column width on tablet and mobile sizes. */
    var doubling: js.UndefOr[Boolean] = js.native

    /** A grid's colors can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.native

    /** A grid can preserve its vertical and horizontal gutters on first and last columns. */
    var padded: js.UndefOr[Boolean | String] = js.native

    /** A grid can increase its gutters to allow for more negative space. */
    var relaxed: js.UndefOr[Boolean | String] = js.native

    /** A grid can specify that its columns should reverse order at different device sizes. */
    var reversed: js.UndefOr[String] = js.native

    /** A grid can have its columns stack on-top of each other after reaching mobile breakpoints. */
    var stackable: js.UndefOr[Boolean] = js.native

    /** An can stretch its contents to take up the entire grid height. */
    var stretched: js.UndefOr[Boolean] = js.native

    /** A grid can specify its text alignment. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native

    /** A grid can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[suiraw.SemanticVERTICALALIGNMENTS] = js.native
  }

  def props(q: Grid): GridProps =
    rawprops(
      q.as,
      q.celled,
      q.centered,
      q.child,
      q.className,
      q.clazz,
      q.columns,
      q.container,
      q.divided,
      q.doubling,
      q.inverted,
      q.padded,
      q.relaxed,
      q.reversed,
      q.stackable,
      q.stretched,
      q.textAlign,
      q.verticalAlign
    )

  def rawprops(
    as:            js.UndefOr[AsC]                       = js.undefined,
    celled:        js.UndefOr[GridCelled]                = js.undefined,
    centered:      js.UndefOr[Boolean]                   = js.undefined,
    children:      js.UndefOr[VdomNode]                  = js.undefined,
    className:     js.UndefOr[String]                    = js.undefined,
    clazz:         js.UndefOr[Css]                       = js.undefined,
    columns:       js.UndefOr[SemanticWidth]             = js.undefined,
    container:     js.UndefOr[Boolean]                   = js.undefined,
    divided:       js.UndefOr[GridDivided]               = js.undefined,
    doubling:      js.UndefOr[Boolean]                   = js.undefined,
    inverted:      js.UndefOr[Boolean]                   = js.undefined,
    padded:        js.UndefOr[GridPadded]                = js.undefined,
    relaxed:       js.UndefOr[GridRelaxed]               = js.undefined,
    reversed:      js.UndefOr[GridReversed]              = js.undefined,
    stackable:     js.UndefOr[Boolean]                   = js.undefined,
    stretched:     js.UndefOr[Boolean]                   = js.undefined,
    textAlign:     js.UndefOr[SemanticTextAlignment]     = js.undefined,
    verticalAlign: js.UndefOr[SemanticVerticalAlignment] = js.undefined
  ): GridProps = {
    val p = (new js.Object).asInstanceOf[GridProps]
    p.as            = as.toJs
    p.celled        = celled.toJs
    p.centered      = centered
    p.children      = children.toJs
    p.className     = (className, clazz).toJs
    p.columns       = columns.toJs
    p.container     = container
    p.divided       = divided.toJs
    p.doubling      = doubling
    p.inverted      = inverted
    p.padded        = padded.toJs
    p.relaxed       = relaxed.toJs
    p.reversed      = reversed.toJs
    p.stackable     = stackable
    p.stretched     = stretched
    p.textAlign     = textAlign.toJs
    p.verticalAlign = verticalAlign.toJs
    p
  }

  private val component =
    JsFnComponent[GridProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): Grid =
    new Grid(children = content)
}
