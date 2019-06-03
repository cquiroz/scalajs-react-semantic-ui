package react.semanticui.modules.tab

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import react.common.syntax._
// import react.semanticui.elements.menu.Menu.MenuPros
import react.semanticui._

object Tab {
  private type RawOnTabChange = js.Function2[ReactMouseEvent, TabProps, Unit]
  type OnTabChange            = (ReactMouseEvent, TabProps) => Callback

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
    // var menu: js.UndefOr[MenuProps]

    /** Align vertical menu */
    // var menuPosition: js.UndefOr['left' | 'right']
    var menuPosition: js.UndefOr[String]

    /** Shorthand props for the Grid. */
    // var grid: js.UndefOr[any]

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
    as:                 js.UndefOr[AsC]               = js.undefined,
    defaultActiveIndex: js.UndefOr[JsNumber | String] = js.undefined,
    activeIndex:        js.UndefOr[JsNumber | String] = js.undefined,
    // menu:        js.UndefOr[MenuProps]                              = js.undefined,
    menuPosition:     js.UndefOr[TabMenuPosition]      = js.undefined,
    onTabChangeE:     js.UndefOr[OnTabChange]          = js.undefined,
    onTabChange:      js.UndefOr[TabProps => Callback] = js.undefined,
    renderActiveOnly: js.UndefOr[Boolean]              = js.undefined,
  ): TabProps = {
    val p = as.toJsObject[TabProps]
    p.as                 = as.toJs
    p.defaultActiveIndex = defaultActiveIndex
    p.activeIndex        = activeIndex
    // p.menu= menu
    p.menuPosition = menuPosition.toJs
    // p.onBlur               = (onBlurE, onBlur).toJs
    // p.onChange             = onChange.toJs
    p.onTabChange =
      onTabChangeE.toJs.orElse(onTabChange.map(t => (_: ReactEvent, b: TabProps) => t(b).runNow))
    p.renderActiveOnly = renderActiveOnly
    p
  }

  private val component =
    JsComponent[TabProps, Children.None, Null](RawComponent)

  def apply(
    p: TabProps
  ): UnmountedMapped[Id, TabProps, Null, RawMounted[TabProps, Null], TabProps, Null] =
    component(p)

}
