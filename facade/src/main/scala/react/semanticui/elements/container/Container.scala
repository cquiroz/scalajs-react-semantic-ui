package react.semanticui.elements.container

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import japgolly.scalajs.react.vdom.TagMod

final case class Container(
  as:                     js.UndefOr[AsC]                   = js.undefined,
  child:                  js.UndefOr[VdomNode]              = js.undefined,
  className:              js.UndefOr[String]                = js.undefined,
  clazz:                  js.UndefOr[Css]                   = js.undefined,
  content:                js.UndefOr[VdomNode]              = js.undefined,
  fluid:                  js.UndefOr[Boolean]               = js.undefined,
  text:                   js.UndefOr[Boolean]               = js.undefined,
  textAlign:              js.UndefOr[SemanticTextAlignment] = js.undefined,
  override val modifiers: Seq[TagMod]                       = Seq.empty
) extends GenericFnComponentPAC[Container.ContainerProps, Container] {
  override protected def cprops    = Container.props(this)
  override protected val component = Container.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Container {
  @js.native
  @JSImport("semantic-ui-react", "Container")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ContainerProps extends js.Object {
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

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Container has no maximum width. */
    var fluid: js.UndefOr[Boolean] = js.native

    /** Reduce maximum width to more naturally accommodate text. */
    var text: js.UndefOr[Boolean] = js.native

    /** Align container text. */
    var textAlign: js.UndefOr[suiraw.SemanticTEXTALIGNMENTS] = js.native
  }

  def props(
    q: Container
  ): ContainerProps = {
    val p = q.as.toJsObject[ContainerProps]
    p.children  = q.child.toJs
    p.className = (q.className, q.clazz).toJs
    p.content   = q.content.toJs
    p.fluid     = q.fluid
    p.text      = q.text
    p.textAlign = q.textAlign.toJs
    p
  }

  private val component =
    JsFnComponent[ContainerProps, Children.Varargs](RawComponent)

  def apply(content: TagMod*): Container =
    new Container(modifiers = content)

  val Default: Container = Container()

  val defaultProps: ContainerProps = props(Default)
}
