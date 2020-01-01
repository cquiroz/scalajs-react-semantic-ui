package react.semanticui.toasts

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import react.common.syntax._
import react.common.style._
import react.common._

final case class SemanticToastContainer(
  position:              js.UndefOr[ContainerPosition] = js.undefined,
  animation:             js.UndefOr[SemanticAnimation] = js.undefined,
  className:             js.UndefOr[String]            = js.undefined,
  clazz:                 js.UndefOr[Css]               = js.undefined,
  override val children: CtorType.ChildrenArgs         = Seq.empty
) extends GenericComponentPC[SemanticToastContainer.SemanticToastContainerProps] {
  @inline def renderWith = SemanticToastContainer.component(SemanticToastContainer.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object SemanticToastContainer {
  @js.native
  @JSImport("react-semantic-toasts", "SemanticToastContainer")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait SemanticToastContainerProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    var position: js.UndefOr[String] = js.native

    var animation: js.UndefOr[String] = js.native

    var className: js.UndefOr[String] = js.native

  }

  def props(q: SemanticToastContainer): SemanticToastContainerProps =
    rawprops(
      q.position,
      q.animation,
      q.className,
      q.clazz
    )

  def rawprops(
    position:  js.UndefOr[ContainerPosition] = js.undefined,
    animation: js.UndefOr[SemanticAnimation] = js.undefined,
    className: js.UndefOr[String]            = js.undefined,
    clazz:     js.UndefOr[Css]               = js.undefined
  ): SemanticToastContainerProps = {
    val p = (new js.Object).asInstanceOf[SemanticToastContainerProps]
    p.position  = position.toJs
    p.animation = animation.toJs
    p.className = (className, clazz).toJs
    p
  }

  private val component =
    JsComponent[SemanticToastContainerProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): SemanticToastContainer =
    SemanticToastContainer(children = content)
}
