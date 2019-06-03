package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import js.|
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.internal.Effect.Id
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.semanticui.{ raw => suiraw }
import react.semanticui.raw._
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.UnmountedIcon
import react.semanticui.elements.label.Label
import react.semanticui._

object Dropdown {
  type Value =
    String | JsNumber | Boolean | js.Array[JsNumber] | js.Array[String] | js.Array[Boolean]
  private type RawAdditionLabel = JsNumber | String | SemanticShorthandContent
  type AdditionLabel            = JsNumber | String | VdomNode
  private type RawSearchFunction = js.Function2[js.Array[DropdownItem.DropdownItemProps],
                                                String,
                                                js.Array[DropdownItem.DropdownItemProps]]
  type SearchFunction = (List[DropdownItem.DropdownItemProps],
                         String) => CallbackTo[List[DropdownItem.DropdownItemProps]]
  private type RawRenderLabel =
    js.Function3[DropdownItem.DropdownItemProps, Int, Label.LabelProps, Label.LabelProps]
  type RenderLabel =
    (DropdownItem.DropdownItemProps, Int, Label.LabelProps) => CallbackTo[Label.LabelProps]
  private type RawOnAddItem      = js.Function2[ReactKeyboardEvent, DropdownProps, Unit]
  type OnAddItem                 = (ReactKeyboardEvent, DropdownProps) => Callback
  private type RawOnBlur         = RawOnAddItem
  type OnBlur                    = OnAddItem
  private type RawOnChange       = js.Function2[ReactEvent, DropdownProps, Unit]
  type OnChange                  = (ReactEvent, DropdownProps) => Callback
  private type RawOnClick        = js.Function2[ReactMouseEvent, DropdownProps, Unit]
  type OnClick                   = (ReactMouseEvent, DropdownProps) => Callback
  private type RawOnClose        = RawOnChange
  type OnClose                   = OnChange
  private type RawOnFocus        = RawOnChange
  type OnFocus                   = OnChange
  private type RawOnOpen         = RawOnChange
  type OnOpen                    = OnChange
  private type RawOnLabelClick   = js.Function2[ReactMouseEvent, Label.LabelProps, Unit]
  type OnLabelClick              = (ReactMouseEvent, Label.LabelProps) => Callback
  private type RawOnMouseDown    = RawOnLabelClick
  type OnMouseDown               = OnLabelClick
  private type RawOnSearchChange = js.Function2[ReactEvent, DropdownOnSearchChangeData, Unit]
  type OnSearchChangeE           = (ReactEvent, DropdownOnSearchChangeData) => Callback
  type OnSearchChange            = DropdownOnSearchChangeData => Callback

  @js.native
  @JSImport("semantic-ui-react", "Dropdown")
  object RawComponent extends js.Object

  @js.native
  @JSImport("semantic-ui-react", "DropdownOnSearchChangeData")
  class DropdownOnSearchChangeData extends js.Object {
    val searchQuery: String = js.native
  }

  @js.native
  trait DropdownProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Label prefixed to an option added by a user. */
    var additionLabel: js.UndefOr[JsNumber | String | SemanticShorthandContent] = js.native

    /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
    var additionPosition: js.UndefOr[String]

    /**
      * Allow user additions to the list of options (boolean).
      * Requires the use of `selection`, `options` and `search`.
      */
    var allowAdditions: js.UndefOr[Boolean] = js.native

    /** A Dropdown can reduce its complexity. */
    var basic: js.UndefOr[Boolean] = js.native

    /** Format the Dropdown to appear as a button. */
    var button: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Using the clearable setting will let users remove their selection from a dropdown. */
    var clearable: js.UndefOr[Boolean] = js.native

    /** Whether or not the menu should close when the dropdown is blurred. */
    var closeOnBlur: js.UndefOr[Boolean] = js.native

    /**
      * Whether or not the menu should close when a value is selected from the dropdown.
      * By default, multiple selection dropdowns will remain open on change, while single
      * selection dropdowns will close on change.
      */
    var closeOnChange: js.UndefOr[Boolean] = js.native

    /** A compact dropdown has no minimum width. */
    var compact: js.UndefOr[Boolean] = js.native

    /** Whether or not the dropdown should strip diacritics in options and input search */
    var deburr: js.UndefOr[Boolean] = js.native

    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.native

    /** Initial value of searchQuery. */
    var defaultSearchQuery: js.UndefOr[String] = js.native

    /** Currently selected label in multi-select. */
    var defaultSelectedLabel: js.UndefOr[JsNumber | String] = js.native

    /** Initial value of upward. */
    var defaultUpward: js.UndefOr[Boolean] = js.native

    /** Initial value or value array if multiple. */
    var defaultValue: js.UndefOr[Value] = js.native

    /** A dropdown menu can open to the left or to the right. */
    var direction: js.UndefOr[String] = js.native

    /** A disabled dropdown menu or item does not allow user interaction. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** An errored dropdown can alert a user to a problem. */
    var error: js.UndefOr[Boolean] = js.native

    /** A dropdown menu can contain floated content. */
    var floating: js.UndefOr[Boolean] = js.native

    /** A dropdown can take the full width of its parent */
    var fluid: js.UndefOr[Boolean] = js.native

    /** A dropdown menu can contain a header. */
    var header: js.UndefOr[React.Node] = js.native

    /** Shorthand for Icon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] = js.native

    /** A dropdown can be formatted to appear inline in other content. */
    var inline: js.UndefOr[Boolean] = js.native

    /** A dropdown can be formatted as a Menu item. */
    var item: js.UndefOr[Boolean] = js.native

    /** A dropdown can be labeled. */
    var labeled: js.UndefOr[Boolean] = js.native

    /** A dropdown can defer rendering its options until it is open. */
    var lazyLoad: js.UndefOr[Boolean] = js.native

    /** A dropdown can show that it is currently loading data. */
    var loading: js.UndefOr[Boolean] = js.native

    /** The minimum characters for a search to begin showing results. */
    var minCharacters: js.UndefOr[JsNumber] = js.native

    /** A selection dropdown can allow multiple selections. */
    var multiple: js.UndefOr[Boolean] = js.native

    /** Message to display when there are no results. */
    var noResultsMessage: js.UndefOr[React.Node] = js.native

    /**
      * Called when a user adds a new item. Use this to update the options list.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and the new item's value.
      */
    var onAddItem: js.UndefOr[RawOnAddItem] = js.native

    /**
      * Called on blur.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBlur: js.UndefOr[RawOnBlur] = js.native

    /**
      * Called when the user attempts to change the value.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed value.
      */
    var onChange: js.UndefOr[RawOnChange] = js.undefined

    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[RawOnClick]

    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[RawOnClose] = js.undefined

    /**
      * Called on focus.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onFocus: js.UndefOr[RawOnFocus] = js.undefined

    /**
      * Called when a multi-select label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All label props.
      */
    var onLabelClick: js.UndefOr[RawOnLabelClick] = js.undefined

    /**
      * Called on mousedown.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onMouseDown: js.UndefOr[RawOnMouseDown] = js.undefined

    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[RawOnOpen] = js.undefined

    /**
      * Called on search input change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props, includes current value of searchQuery.
      */
    var onSearchChange: js.UndefOr[RawOnSearchChange] = js.undefined

    /** Controls whether or not the dropdown menu is displayed. */
    var open: js.UndefOr[Boolean] = js.native

    /** Whether or not the menu should open when the dropdown is focused. */
    var openOnFocus: js.UndefOr[Boolean] = js.native

    /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
    var options: js.UndefOr[js.Array[DropdownItem.DropdownItemProps]] = js.native

    /** Placeholder text. */
    var placeholder: js.UndefOr[String] = js.native

    /** A dropdown can be formatted so that its menu is pointing. */
    var pointing: js.UndefOr[Boolean | String] = js.native

    /**
      * Mapped over the active items and returns shorthand for the active item Labels.
      * Only applies to `multiple` Dropdowns.
      *
      * @param {object} item - A currently active dropdown item.
      * @param {number} index - The current index.
      * @param {props} defaultLabelProps - The default props for an active item Label.
      * @return {*} Shorthand for a Label.
      */
    var renderLabel: js.UndefOr[RawRenderLabel] = js.native

    /** A dropdown can have its menu scroll. */
    var scrolling: js.UndefOr[Boolean] = js.native

    /**
      * A selection dropdown can allow a user to search through a large list of choices.
      * Pass a function here to replace the default search.
      */
    var search: js.UndefOr[Boolean | RawSearchFunction] = js.native

    /** A shorthand for a search input. */
    var searchInput: js.UndefOr[React.Node] = js.native

    /** Current value of searchQuery. Creates a controlled component. */
    var searchQuery: js.UndefOr[String] = js.native

    /** Define whether the highlighted item should be selected on blur. */
    var selectOnBlur: js.UndefOr[Boolean] = js.native

    /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
    var selectOnNavigation: js.UndefOr[Boolean] = js.native

    /** Currently selected label in multi-select. */
    var selectedLabel: js.UndefOr[JsNumber | String]

    /** A dropdown can be used to select between choices in a form. */
    var selection: js.UndefOr[Boolean]

    /** A simple dropdown can open without Javascript. */
    var simple: js.UndefOr[Boolean] = js.native

    /** A dropdown can receive focus. */
    var tabIndex: js.UndefOr[String | JsNumber] = js.native

    /** The text displayed in the dropdown, usually for the active item. */
    var text: js.UndefOr[String] = js.native

    /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
    var trigger: js.UndefOr[React.Node]

    /** Current value or value array if multiple. Creates a controlled component. */
    var value: js.UndefOr[Value] = js.native

    /** Controls whether the dropdown will open upward. */
    var upward: js.UndefOr[Boolean] = js.native

    /**
      * A dropdown will go to the last element when ArrowUp is pressed on the first,
      * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
      */
    var wrapSelection: js.UndefOr[Boolean] = js.native

  }

  def props(
    as:                   js.UndefOr[AsC]                                  = js.undefined,
    additionLabel:        js.UndefOr[AdditionLabel]                        = js.undefined,
    additionPosition:     js.UndefOr[AdditionPosition]                     = js.undefined,
    allowAdditions:       js.UndefOr[Boolean]                              = js.undefined,
    basic:                js.UndefOr[Boolean]                              = js.undefined,
    button:               js.UndefOr[Boolean]                              = js.undefined,
    children:             js.UndefOr[VdomNode]                             = js.undefined,
    className:            js.UndefOr[String]                               = js.undefined,
    clearable:            js.UndefOr[Boolean]                              = js.undefined,
    closeOnBlur:          js.UndefOr[Boolean]                              = js.undefined,
    closeOnChange:        js.UndefOr[Boolean]                              = js.undefined,
    compact:              js.UndefOr[Boolean]                              = js.undefined,
    deburr:               js.UndefOr[Boolean]                              = js.undefined,
    defaultOpen:          js.UndefOr[Boolean]                              = js.undefined,
    defaultSearchQuery:   js.UndefOr[String]                               = js.undefined,
    defaultSelectedLabel: js.UndefOr[JsNumber | String]                    = js.undefined,
    defaultUpward:        js.UndefOr[Boolean]                              = js.undefined,
    defaultValue:         js.UndefOr[Value]                                = js.undefined,
    direction:            js.UndefOr[Direction]                            = js.undefined,
    disabled:             js.UndefOr[Boolean]                              = js.undefined,
    error:                js.UndefOr[Boolean]                              = js.undefined,
    floating:             js.UndefOr[Boolean]                              = js.undefined,
    fluid:                js.UndefOr[Boolean]                              = js.undefined,
    header:               js.UndefOr[VdomNode]                             = js.undefined,
    icon:                 js.UndefOr[UnmountedIcon]                        = js.undefined,
    inline:               js.UndefOr[Boolean]                              = js.undefined,
    item:                 js.UndefOr[Boolean]                              = js.undefined,
    labeled:              js.UndefOr[Boolean]                              = js.undefined,
    lazyLoad:             js.UndefOr[Boolean]                              = js.undefined,
    loading:              js.UndefOr[Boolean]                              = js.undefined,
    minCharacters:        js.UndefOr[JsNumber]                             = js.undefined,
    multiple:             js.UndefOr[Boolean]                              = js.undefined,
    noResultsMessage:     js.UndefOr[VdomNode]                             = js.undefined,
    onAddItem:            js.UndefOr[OnAddItem]                            = js.undefined,
    onBlurE:              js.UndefOr[OnBlur]                               = js.undefined,
    onBlur:               js.UndefOr[Callback]                             = js.undefined,
    onClickE:             js.UndefOr[OnClick]                              = js.undefined,
    onClick:              js.UndefOr[Callback]                             = js.undefined,
    onChange:             js.UndefOr[OnChange]                             = js.undefined,
    onCloseE:             js.UndefOr[OnClose]                              = js.undefined,
    onClose:              js.UndefOr[Callback]                             = js.undefined,
    onFocusE:             js.UndefOr[OnFocus]                              = js.undefined,
    onFocus:              js.UndefOr[Callback]                             = js.undefined,
    onLabelClickE:        js.UndefOr[OnLabelClick]                         = js.undefined,
    onLabelClick:         js.UndefOr[Callback]                             = js.undefined,
    onMouseDownE:         js.UndefOr[OnMouseDown]                          = js.undefined,
    onMouseDown:          js.UndefOr[Callback]                             = js.undefined,
    onOpenE:              js.UndefOr[OnOpen]                               = js.undefined,
    onOpen:               js.UndefOr[Callback]                             = js.undefined,
    onSearchChangeE:      js.UndefOr[OnSearchChangeE]                      = js.undefined,
    onSearchChange:       js.UndefOr[OnSearchChange]                       = js.undefined,
    open:                 js.UndefOr[Boolean]                              = js.undefined,
    openOnFocus:          js.UndefOr[Boolean]                              = js.undefined,
    options:              js.UndefOr[List[DropdownItem.DropdownItemProps]] = js.undefined,
    placeholder:          js.UndefOr[String]                               = js.undefined,
    pointing:             js.UndefOr[Pointing]                             = js.undefined,
    renderLabel:          js.UndefOr[RenderLabel]                          = js.undefined,
    scrolling:            js.UndefOr[Boolean]                              = js.undefined,
    search:               js.UndefOr[Boolean | SearchFunction]             = js.undefined,
    searchInput:          js.UndefOr[VdomNode]                             = js.undefined,
    searchQuery:          js.UndefOr[String]                               = js.undefined,
    selectOnBlur:         js.UndefOr[Boolean]                              = js.undefined,
    selectOnNavigation:   js.UndefOr[Boolean]                              = js.undefined,
    selectedLabel:        js.UndefOr[JsNumber | String]                    = js.undefined,
    selection:            js.UndefOr[Boolean]                              = js.undefined,
    simple:               js.UndefOr[Boolean]                              = js.undefined,
    tabIndex:             js.UndefOr[String | JsNumber]                    = js.undefined,
    text:                 js.UndefOr[String]                               = js.undefined,
    trigger:              js.UndefOr[VdomNode]                             = js.undefined,
    value:                js.UndefOr[Value]                                = js.undefined,
    upward:               js.UndefOr[Boolean]                              = js.undefined,
    wrapSelection:        js.UndefOr[Boolean]                              = js.undefined
  ): DropdownProps = {
    val p = as.toJsObject[DropdownProps]
    p.as = as.toJs
    p.additionLabel = additionLabel.map {
      (_: Any) match {
        case b: String => b
        case b: Byte   => b
        case b: Short  => b
        case b: Int    => b
        case b: Float  => b
        case b: Double => b
        case b: VdomNode =>
          b.rawNode.asInstanceOf[RawAdditionLabel]
      }
    }
    p.additionPosition     = additionPosition.toJs
    p.allowAdditions       = allowAdditions
    p.basic                = basic
    p.button               = button
    p.children             = children.toJs
    p.className            = className
    p.clearable            = clearable
    p.closeOnBlur          = closeOnBlur
    p.closeOnChange        = closeOnChange
    p.compact              = compact
    p.deburr               = deburr
    p.defaultOpen          = defaultOpen
    p.defaultSearchQuery   = defaultSearchQuery
    p.defaultSelectedLabel = defaultSelectedLabel
    p.defaultUpward        = defaultUpward
    p.defaultValue         = defaultValue
    p.direction            = direction.toJs
    p.disabled             = disabled
    p.error                = error
    p.floating             = floating
    p.fluid                = fluid
    p.header               = header.toJs
    p.icon                 = icon.map(_.props)
    p.inline               = inline
    p.item                 = item
    p.labeled              = labeled
    p.lazyLoad             = lazyLoad
    p.loading              = loading
    p.minCharacters        = minCharacters
    p.multiple             = multiple
    p.noResultsMessage     = noResultsMessage.toJs
    p.onAddItem            = onAddItem.toJs
    p.onBlur               = (onBlurE, onBlur).toJs
    p.onChange             = onChange.toJs
    p.onClick              = (onClickE, onClick).toJs
    p.onClose              = (onCloseE, onClose).toJs
    p.onFocus              = (onFocusE, onFocus).toJs
    p.onLabelClick         = (onLabelClickE, onLabelClick).toJs
    p.onMouseDown          = (onMouseDownE, onMouseDown).toJs
    p.onOpen               = (onOpenE, onOpen).toJs
    p.onSearchChange = onSearchChangeE.toJs.orElse(onSearchChange.map(t =>
      (_: ReactEvent, b: DropdownOnSearchChangeData) => t(b).runNow))
    p.onAddItem   = onAddItem.toJs
    p.open        = open
    p.openOnFocus = openOnFocus
    p.options     = options.map(_.toJSArray)
    p.placeholder = placeholder
    p.pointing    = pointing.toJs
    p.renderLabel = renderLabel.map {
      b => (item: DropdownItem.DropdownItemProps, index: Int, defaultProps: Label.LabelProps) =>
        b(item, index, defaultProps).runNow
    }
    p.scrolling = scrolling
    p.search = search.map {
      (_: Any) match {
        case b: Boolean => b
        case b =>
          val sf = b.asInstanceOf[SearchFunction]
          val rsf: RawSearchFunction = (l: js.Array[DropdownItem.DropdownItemProps], s: String) =>
            sf(l.toList, s).runNow.toJSArray
          rsf
      }
    }
    p.searchInput        = searchInput.toJs
    p.searchQuery        = searchQuery
    p.selectOnBlur       = selectOnBlur
    p.selectOnNavigation = selectOnNavigation
    p.selectedLabel      = selectedLabel
    p.selection          = selection
    p.simple             = simple
    p.tabIndex           = tabIndex
    p.text               = text
    p.trigger            = trigger.toJs
    p.value              = value
    p.upward             = upward
    p.wrapSelection      = wrapSelection
    p
  }

  private val component =
    JsComponent[DropdownProps, Children.None, Null](RawComponent)

  def apply(
    p: DropdownProps
  ): UnmountedMapped[Id,
                     DropdownProps,
                     Null,
                     RawMounted[DropdownProps, Null],
                     DropdownProps,
                     Null] =
    component(p)

}
