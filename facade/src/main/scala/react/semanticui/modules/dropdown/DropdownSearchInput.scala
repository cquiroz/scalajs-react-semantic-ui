package react.semanticui.modules.dropdown

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.vdom.VdomNode
import react.semanticui._
import react.common.style._
import react.common.syntax._
import react.common._

final case class DropdownSearchInput(
  as:                    js.UndefOr[AsC]               = js.undefined,
  autoComplete:          js.UndefOr[String]            = js.undefined,
  className:             js.UndefOr[String]            = js.undefined,
  clazz:                 js.UndefOr[Css]               = js.undefined,
  tabIndex:              js.UndefOr[String | JsNumber] = js.undefined,
  `type`:                js.UndefOr[String]            = js.undefined,
  value:                 js.UndefOr[JsNumber | String] = js.undefined,
  override val children: CtorType.ChildrenArgs         = Seq.empty
) extends GenericComponentPC[DropdownSearchInput.DropdownSearchInputProps] {
  @inline def renderWith = DropdownSearchInput.component(DropdownSearchInput.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object DropdownSearchInput {
  @js.native
  @JSImport("semantic-ui-react", "DropdownSearchInput")
  object RawComponent extends js.Object

  @js.native
  trait DropdownSearchInputProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** An input can have the auto complete. */
    var autoComplete: js.UndefOr[String] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** An input can receive focus. */
    var tabIndex: js.UndefOr[String | JsNumber] = js.native

    /** The HTML input type. */
    var `type`: js.UndefOr[String] = js.native

    /** Stored value. */
    var value: js.UndefOr[JsNumber | String] = js.native
  }

  def props(q: DropdownSearchInput): DropdownSearchInputProps =
    rawprops(q.as, q.autoComplete, q.className, q.clazz, q.tabIndex, q.`type`, q.value)

  def rawprops(
    as:           js.UndefOr[AsC]               = js.undefined,
    autoComplete: js.UndefOr[String]            = js.undefined,
    className:    js.UndefOr[String]            = js.undefined,
    clazz:        js.UndefOr[Css]               = js.undefined,
    tabIndex:     js.UndefOr[String | JsNumber] = js.undefined,
    `type`:       js.UndefOr[String]            = js.undefined,
    value:        js.UndefOr[JsNumber | String] = js.undefined
  ): DropdownSearchInputProps = {
    val p = as.toJsObject[DropdownSearchInputProps]
    p.as           = as.toJs
    p.autoComplete = autoComplete
    p.className    = (className, clazz).toJs
    p.tabIndex     = tabIndex
    p.`type`       = `type`
    p.value        = value
    p
  }

  private val component =
    JsComponent[DropdownSearchInputProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): DropdownSearchInput =
    DropdownSearchInput(children = content)
}
