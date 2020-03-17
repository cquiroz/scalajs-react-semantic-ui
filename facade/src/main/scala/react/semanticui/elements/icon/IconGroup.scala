package react.semanticui.elements.icon

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.vdom.VdomNode

final case class IconGroup(
  as:                     js.UndefOr[AsC]                  = js.undefined,
  className:              js.UndefOr[String]               = js.undefined,
  clazz:                  js.UndefOr[Css]                  = js.undefined,
  content:                js.UndefOr[ShorthandS[VdomNode]] = js.undefined,
  size:                   js.UndefOr[SemanticSize]         = js.undefined,
  override val modifiers: Seq[TagMod]                      = Seq.empty
) extends GenericComponentPAC[IconGroup.IconGroupProps, IconGroup] {
  override protected def cprops    = IconGroup.props(this)
  override protected val component = IconGroup.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object IconGroup {
  @js.native
  @JSImport("semantic-ui-react", "Icon.Group")
  object RawComponent extends js.Object

  @js.native
  trait IconGroupProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.UndefOr[AsT]                    = js.native
    var children: js.UndefOr[React.Node]       = js.native
    var className: js.UndefOr[String]          = js.native
    var content: js.UndefOr[React.Node]        = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
  }

  def props(
    q: IconGroup
  ): IconGroupProps = {
    val p = q.as.toJsObject[IconGroupProps]
    p.as        = q.as.toJs
    p.className = (q.className, q.clazz).toJs
    p.content   = q.content.toJs
    p.size      = q.size.toJs
    p
  }

  private val component =
    JsComponent[IconGroupProps, Children.Varargs, Null](RawComponent)

  def apply(modifiers: TagMod*): IconGroup =
    new IconGroup(modifiers = modifiers)
}
