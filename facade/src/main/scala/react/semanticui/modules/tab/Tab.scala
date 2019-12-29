package react.semanticui.modules.tab

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import react.common.syntax._
import react.common._
import react.semanticui.collections.menu.Menu
import react.semanticui.collections.grid.Grid
import react.semanticui._

final case class Tab(
  as:                 js.UndefOr[AsC]                      = js.undefined,
  defaultActiveIndex: js.UndefOr[JsNumber | String]        = js.undefined,
  activeIndex:        js.UndefOr[JsNumber | String]        = js.undefined,
  menu:               js.UndefOr[Menu.MenuProps]           = js.undefined,
  menuPosition:       js.UndefOr[TabMenuPosition]          = js.undefined,
  grid:               js.UndefOr[Grid.GridProps]           = js.undefined,
  onTabChangeE:       js.UndefOr[Tab.OnTabChange]          = js.undefined,
  onTabChange:        js.UndefOr[Tab.TabProps => Callback] = js.undefined,
  renderActiveOnly:   js.UndefOr[Boolean]                  = js.undefined
) extends GenericFnComponentP[Tab.TabProps] {
  @inline def render =
    Tab.component(Tab.props(this))
}

object Tab {
  type RawOnTabChange = js.Function2[ReactMouseEvent, TabProps, Unit]
  type OnTabChange    = (ReactMouseEvent, TabProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Tab")
  object RawComponent extends js.Object

  @js.native
  trait TabProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** The initial activeIndex. */
    var defaultActiveIndex: js.UndefOr[JsNumber | String]

    /** Index of the currently active tab. */
    var activeIndex: js.UndefOr[JsNumber | String]

    /** Shorthand props for the Menu. */
    var menu: js.UndefOr[Menu.MenuProps]

    /** Align vertical menu */
    var menuPosition: js.UndefOr[String]

    /** Shorthand props for the Grid. */
    var grid: js.UndefOr[Grid.GridProps]

    /**
      * Called on tab change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {data} data - The proposed new Tab.Pane.
      * @param {activeIndex} data.activeIndex - The new proposed activeIndex.
      * @param {panes} data.panes - Props of the new proposed active pane.
      */
    var onTabChange: js.UndefOr[RawOnTabChange]

    /**
      * Array of objects describing each Menu.Item and Tab.Pane:
      * {
      *   menuItem: 'Home',
      *   render: () => <Tab.Pane>Welcome!</Tab.Pane>,
      * }
      * or
      * {
      *   menuItem: 'Home',
      *   pane: 'Welcome',
      * }
      */
    //  var panes: js.UndefOr[{]
    //   pane?: SemanticShorthandItem<TabPaneProps>;
    //   menuItem?: any;
    //   render?: () => React.ReactNode;
    // }[]

    /** A Tab can render only active pane. */
    var renderActiveOnly: js.UndefOr[Boolean]
  }

  def props(
    q: Tab
  ): TabProps = {
    val p = q.as.toJsObject[TabProps]
    p.as                 = q.as.toJs
    p.defaultActiveIndex = q.defaultActiveIndex
    p.activeIndex        = q.activeIndex
    p.menu               = q.menu
    p.menuPosition       = q.menuPosition.toJs
    p.grid               = q.grid
    p.onTabChange = q.onTabChangeE.toJs
      .orElse(q.onTabChange.map(t => (_: ReactEvent, b: TabProps) => t(b).runNow))
    p.renderActiveOnly = q.renderActiveOnly
    p
  }

  private val component =
    JsComponent[TabProps, Children.None, Null](RawComponent)
}
