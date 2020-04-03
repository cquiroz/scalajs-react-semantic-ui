package react.semanticui.addons.select

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import js.annotation._
import js.|
import js.JSConverters._
import react.common._
import react.common.style._
import react.semanticui._
import react.semanticui.elements.icon.Icon
import react.semanticui.elements.label.Label
import react.semanticui.modules.dropdown._
import react.semanticui.modules.dropdown.Dropdown._

final case class Select(
  as:                     js.UndefOr[AsC] = js.undefined,
  additionLabel:          js.UndefOr[Dropdown.AdditionLabel] = js.undefined,
  additionPosition:       js.UndefOr[AdditionPosition] = js.undefined,
  allowAdditions:         js.UndefOr[Boolean] = js.undefined,
  basic:                  js.UndefOr[Boolean] = js.undefined,
  button:                 js.UndefOr[Boolean] = js.undefined,
  className:              js.UndefOr[String] = js.undefined,
  clazz:                  js.UndefOr[Css] = js.undefined,
  clearable:              js.UndefOr[Boolean] = js.undefined,
  closeOnBlur:            js.UndefOr[Boolean] = js.undefined,
  closeOnEscape:          js.UndefOr[Boolean] = js.undefined,
  closeOnChange:          js.UndefOr[Boolean] = js.undefined,
  compact:                js.UndefOr[Boolean] = js.undefined,
  deburr:                 js.UndefOr[Boolean] = js.undefined,
  defaultOpen:            js.UndefOr[Boolean] = js.undefined,
  defaultSearchQuery:     js.UndefOr[String] = js.undefined,
  defaultSelectedLabel:   js.UndefOr[JsNumber | String] = js.undefined,
  defaultUpward:          js.UndefOr[Boolean] = js.undefined,
  defaultValue:           js.UndefOr[Dropdown.Value] = js.undefined,
  direction:              js.UndefOr[Direction] = js.undefined,
  disabled:               js.UndefOr[Boolean] = js.undefined,
  error:                  js.UndefOr[Boolean] = js.undefined,
  floating:               js.UndefOr[Boolean] = js.undefined,
  fluid:                  js.UndefOr[Boolean] = js.undefined,
  header:                 js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  icon:                   js.UndefOr[ShorthandS[Icon]] = js.undefined,
  inline:                 js.UndefOr[Boolean] = js.undefined,
  item:                   js.UndefOr[Boolean] = js.undefined,
  labeled:                js.UndefOr[Boolean] = js.undefined,
  lazyLoad:               js.UndefOr[Boolean] = js.undefined,
  loading:                js.UndefOr[Boolean] = js.undefined,
  minCharacters:          js.UndefOr[JsNumber] = js.undefined,
  multiple:               js.UndefOr[Boolean] = js.undefined,
  noResultsMessage:       js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  onAddItem:              js.UndefOr[Dropdown.OnAddItem] = js.undefined,
  onBlurE:                js.UndefOr[Dropdown.OnBlur] = js.undefined,
  onBlur:                 js.UndefOr[Callback] = js.undefined,
  onClickE:               js.UndefOr[Dropdown.OnClick] = js.undefined,
  onClick:                js.UndefOr[Callback] = js.undefined,
  onChange:               js.UndefOr[Dropdown.OnChange] = js.undefined,
  onCloseE:               js.UndefOr[Dropdown.OnClose] = js.undefined,
  onClose:                js.UndefOr[Callback] = js.undefined,
  onFocusE:               js.UndefOr[Dropdown.OnFocus] = js.undefined,
  onFocus:                js.UndefOr[Callback] = js.undefined,
  onLabelClickE:          js.UndefOr[Dropdown.OnLabelClick] = js.undefined,
  onLabelClick:           js.UndefOr[Callback] = js.undefined,
  onMouseDownE:           js.UndefOr[Dropdown.OnMouseDown] = js.undefined,
  onMouseDown:            js.UndefOr[Callback] = js.undefined,
  onOpenE:                js.UndefOr[Dropdown.OnOpen] = js.undefined,
  onOpen:                 js.UndefOr[Callback] = js.undefined,
  onSearchChangeE:        js.UndefOr[Dropdown.OnSearchChangeE] = js.undefined,
  onSearchChange:         js.UndefOr[Dropdown.OnSearchChange] = js.undefined,
  open:                   js.UndefOr[Boolean] = js.undefined,
  openOnFocus:            js.UndefOr[Boolean] = js.undefined,
  placeholder:            js.UndefOr[String] = js.undefined,
  pointing:               js.UndefOr[Pointing] = js.undefined,
  renderLabel:            js.UndefOr[Dropdown.RenderLabel] = js.undefined,
  scrolling:              js.UndefOr[Boolean] = js.undefined,
  search:                 js.UndefOr[Boolean | Dropdown.SearchFunction] = js.undefined,
  searchInput:            js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  searchQuery:            js.UndefOr[String] = js.undefined,
  selectOnBlur:           js.UndefOr[Boolean] = js.undefined,
  selectOnNavigation:     js.UndefOr[Boolean] = js.undefined,
  selectedLabel:          js.UndefOr[JsNumber | String] = js.undefined,
  selection:              js.UndefOr[Boolean] = js.undefined,
  simple:                 js.UndefOr[Boolean] = js.undefined,
  tabIndex:               js.UndefOr[String | JsNumber] = js.undefined,
  text:                   js.UndefOr[String] = js.undefined,
  trigger:                js.UndefOr[VdomNode] = js.undefined,
  value:                  js.UndefOr[Dropdown.Value] = js.undefined,
  upward:                 js.UndefOr[Boolean] = js.undefined,
  wrapSelection:          js.UndefOr[Boolean] = js.undefined,
  override val modifiers: Seq[TagMod] = Seq.empty,
  options:                Seq[DropdownItem]
) extends GenericComponentPA[Select.SelectProps, Select] {
  override protected def cprops    = Select.props(this)
  override protected val component = Select.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Select {
  type SelectItem = DropdownItem

  @js.native
  @JSImport("semantic-ui-react", "Select")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait SelectProps extends Dropdown.DropdownProps {}

  def props(q: Select): SelectProps =
    rawprops(
      q.as,
      q.additionLabel,
      q.additionPosition,
      q.allowAdditions,
      q.basic,
      q.button,
      q.className,
      q.clazz,
      q.clearable,
      q.closeOnBlur,
      q.closeOnEscape,
      q.closeOnChange,
      q.compact,
      q.deburr,
      q.defaultOpen,
      q.defaultSearchQuery,
      q.defaultSelectedLabel,
      q.defaultUpward,
      q.defaultValue,
      q.direction,
      q.disabled,
      q.error,
      q.floating,
      q.fluid,
      q.header,
      q.icon,
      q.inline,
      q.item,
      q.labeled,
      q.lazyLoad,
      q.loading,
      q.minCharacters,
      q.multiple,
      q.noResultsMessage,
      q.onAddItem,
      q.onBlurE,
      q.onBlur,
      q.onClickE,
      q.onClick,
      q.onChange,
      q.onCloseE,
      q.onClose,
      q.onFocusE,
      q.onFocus,
      q.onLabelClickE,
      q.onLabelClick,
      q.onMouseDownE,
      q.onMouseDown,
      q.onOpenE,
      q.onOpen,
      q.onSearchChangeE,
      q.onSearchChange,
      q.open,
      q.openOnFocus,
      q.options,
      q.placeholder,
      q.pointing,
      q.renderLabel,
      q.scrolling,
      q.search,
      q.searchInput,
      q.searchQuery,
      q.selectOnBlur,
      q.selectOnNavigation,
      q.selectedLabel,
      q.selection,
      q.simple,
      q.tabIndex,
      q.text,
      q.trigger,
      q.value,
      q.upward,
      q.wrapSelection
    )

  def rawprops(
    as:                   js.UndefOr[AsC]                      = js.undefined,
    additionLabel:        js.UndefOr[AdditionLabel]            = js.undefined,
    additionPosition:     js.UndefOr[AdditionPosition]         = js.undefined,
    allowAdditions:       js.UndefOr[Boolean]                  = js.undefined,
    basic:                js.UndefOr[Boolean]                  = js.undefined,
    button:               js.UndefOr[Boolean]                  = js.undefined,
    className:            js.UndefOr[String]                   = js.undefined,
    clazz:                js.UndefOr[Css]                      = js.undefined,
    clearable:            js.UndefOr[Boolean]                  = js.undefined,
    closeOnBlur:          js.UndefOr[Boolean]                  = js.undefined,
    closeOnEscape:        js.UndefOr[Boolean]                  = js.undefined,
    closeOnChange:        js.UndefOr[Boolean]                  = js.undefined,
    compact:              js.UndefOr[Boolean]                  = js.undefined,
    deburr:               js.UndefOr[Boolean]                  = js.undefined,
    defaultOpen:          js.UndefOr[Boolean]                  = js.undefined,
    defaultSearchQuery:   js.UndefOr[String]                   = js.undefined,
    defaultSelectedLabel: js.UndefOr[JsNumber | String]        = js.undefined,
    defaultUpward:        js.UndefOr[Boolean]                  = js.undefined,
    defaultValue:         js.UndefOr[Value]                    = js.undefined,
    direction:            js.UndefOr[Direction]                = js.undefined,
    disabled:             js.UndefOr[Boolean]                  = js.undefined,
    error:                js.UndefOr[Boolean]                  = js.undefined,
    floating:             js.UndefOr[Boolean]                  = js.undefined,
    fluid:                js.UndefOr[Boolean]                  = js.undefined,
    header:               js.UndefOr[ShorthandS[VdomNode]]     = js.undefined,
    icon:                 js.UndefOr[ShorthandS[Icon]]         = js.undefined,
    inline:               js.UndefOr[Boolean]                  = js.undefined,
    item:                 js.UndefOr[Boolean]                  = js.undefined,
    labeled:              js.UndefOr[Boolean]                  = js.undefined,
    lazyLoad:             js.UndefOr[Boolean]                  = js.undefined,
    loading:              js.UndefOr[Boolean]                  = js.undefined,
    minCharacters:        js.UndefOr[JsNumber]                 = js.undefined,
    multiple:             js.UndefOr[Boolean]                  = js.undefined,
    noResultsMessage:     js.UndefOr[ShorthandS[VdomNode]]     = js.undefined,
    onAddItem:            js.UndefOr[OnAddItem]                = js.undefined,
    onBlurE:              js.UndefOr[OnBlur]                   = js.undefined,
    onBlur:               js.UndefOr[Callback]                 = js.undefined,
    onClickE:             js.UndefOr[OnClick]                  = js.undefined,
    onClick:              js.UndefOr[Callback]                 = js.undefined,
    onChange:             js.UndefOr[OnChange]                 = js.undefined,
    onCloseE:             js.UndefOr[OnClose]                  = js.undefined,
    onClose:              js.UndefOr[Callback]                 = js.undefined,
    onFocusE:             js.UndefOr[OnFocus]                  = js.undefined,
    onFocus:              js.UndefOr[Callback]                 = js.undefined,
    onLabelClickE:        js.UndefOr[OnLabelClick]             = js.undefined,
    onLabelClick:         js.UndefOr[Callback]                 = js.undefined,
    onMouseDownE:         js.UndefOr[OnMouseDown]              = js.undefined,
    onMouseDown:          js.UndefOr[Callback]                 = js.undefined,
    onOpenE:              js.UndefOr[OnOpen]                   = js.undefined,
    onOpen:               js.UndefOr[Callback]                 = js.undefined,
    onSearchChangeE:      js.UndefOr[OnSearchChangeE]          = js.undefined,
    onSearchChange:       js.UndefOr[OnSearchChange]           = js.undefined,
    open:                 js.UndefOr[Boolean]                  = js.undefined,
    openOnFocus:          js.UndefOr[Boolean]                  = js.undefined,
    options:              js.UndefOr[Seq[DropdownItem]]        = js.undefined,
    placeholder:          js.UndefOr[String]                   = js.undefined,
    pointing:             js.UndefOr[Pointing]                 = js.undefined,
    renderLabel:          js.UndefOr[RenderLabel]              = js.undefined,
    scrolling:            js.UndefOr[Boolean]                  = js.undefined,
    search:               js.UndefOr[Boolean | SearchFunction] = js.undefined,
    searchInput:          js.UndefOr[ShorthandS[VdomNode]]     = js.undefined,
    searchQuery:          js.UndefOr[String]                   = js.undefined,
    selectOnBlur:         js.UndefOr[Boolean]                  = js.undefined,
    selectOnNavigation:   js.UndefOr[Boolean]                  = js.undefined,
    selectedLabel:        js.UndefOr[JsNumber | String]        = js.undefined,
    selection:            js.UndefOr[Boolean]                  = js.undefined,
    simple:               js.UndefOr[Boolean]                  = js.undefined,
    tabIndex:             js.UndefOr[String | JsNumber]        = js.undefined,
    text:                 js.UndefOr[String]                   = js.undefined,
    trigger:              js.UndefOr[VdomNode]                 = js.undefined,
    value:                js.UndefOr[Value]                    = js.undefined,
    upward:               js.UndefOr[Boolean]                  = js.undefined,
    wrapSelection:        js.UndefOr[Boolean]                  = js.undefined
  ): SelectProps = {
    val p = as.toJsObject[SelectProps]
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
          b.rawNode.asInstanceOf[Dropdown.RawAdditionLabel]
      }
    }
    p.additionPosition     = additionPosition.toJs
    p.allowAdditions       = allowAdditions
    p.basic                = basic
    p.button               = button
    p.className            = (className, clazz).toJs
    p.clearable            = clearable
    p.closeOnBlur          = closeOnBlur
    p.closeOnEscape        = closeOnEscape
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
    p.icon                 = icon.toJs
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
    p.onSearchChange = onSearchChangeE.toJs.orElse(
      onSearchChange.map(t => (_: ReactEvent, b: DropdownOnSearchChangeData) => t(b).runNow)
    )
    p.onAddItem   = onAddItem.toJs
    p.open        = open
    p.openOnFocus = openOnFocus
    p.options     = options.map(_.map(_.props).toJSArray)
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
    JsComponent[SelectProps, Children.None, Null](RawComponent)

}
