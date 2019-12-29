package react.semanticui.elements.flag

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import react.common._
import react.semanticui._
import react.common.style._
import react.common.syntax._

final case class Flag(
  as:                    js.UndefOr[AsC]       = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  name:                  js.UndefOr[String]    = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericComponentPC[Flag.FlagProps] {
  @inline def renderWith = Flag.component(Flag.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object Flag {
  @js.native
  @JSImport("semantic-ui-react", "Flag")
  private[semanticui] object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait FlagProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Flag name, can use the two digit country code, the full name, or a common alias. */
    var name: js.UndefOr[String] = js.native
  }

  def props(
    q: Flag
  ): FlagProps = {
    val p = q.as.toJsObject[FlagProps]
    p.as        = q.as.toJs
    p.className = (q.className, q.clazz).toJs
    p.name      = q.name
    p
  }

  private val component =
    JsComponent[FlagProps, Children.Varargs, Null](RawComponent)

  def apply(
    name: String
  ): Flag =
    new Flag(name = name)
}
