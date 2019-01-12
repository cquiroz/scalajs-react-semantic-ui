package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import scala.language.reflectiveCalls

package semanticui {
  sealed trait As

  object As {
    case object Segment extends As
    case object SidebarPushable extends As
    case object SidebarPusher extends As

    def asFn(a: As): AsT = a match {
      case Segment         => elements.segment.Segment.RawComponent
      case SidebarPushable => modules.sidebar.Sidebar.Pushable.RawComponent
      case SidebarPusher   => modules.sidebar.Sidebar.Pusher.RawComponent
    }
  }
}

package object semanticui {
  type SemanticShortHandItem[T] = VdomNode | T
  type SemanticShortHandContent = VdomNode
  type TabIndex                 = Double | String

  implicit class HandContent2Content(val c: SemanticShortHandContent) extends AnyVal {
    def toRaw: raw.SemanticShorthandContent = c.rawNode
  }

  implicit class ValueOps[A <: { def value: String }](val c: js.UndefOr[A]) extends AnyVal {
    def toJs: js.UndefOr[String] = c.map(_.value)
  }

  implicit class ValueOpsB[A <: { def value: Boolean | String }](val c: js.UndefOr[A])
      extends AnyVal {
    def toJs: js.UndefOr[Boolean | String] = c.map(_.value)
  }

  implicit class HandContent2ContentUndef(val c: js.UndefOr[SemanticShortHandContent])
      extends AnyVal {
    def toRaw: js.UndefOr[raw.SemanticShorthandContent] = c.map(_.rawNode)
  }

  implicit class HandItem2Item[T](val c: SemanticShortHandItem[T]) extends AnyVal {
    def toRaw: raw.SemanticShorthandItem[T] =
      (c: Any) match {
        case o: VdomNode => o.rawNode.asInstanceOf[raw.SemanticShorthandItem[T]]
        case f           => f.asInstanceOf[T]
      }
  }

  implicit class HandItem2ItemUndef[T](val c: js.UndefOr[SemanticShortHandItem[T]]) extends AnyVal {
    def toRaw: js.UndefOr[raw.SemanticShorthandItem[T]] =
      c.map { d =>
        (d: Any) match {
          case o: VdomNode =>
            o.rawNode.asInstanceOf[raw.SemanticShorthandItem[T]]
          case f => f.asInstanceOf[T]
        }
      }
  }

  type AsFn = js.Function1[js.Any, js.Any]
  type AsT  = String | AsFn
  type AsC  = String | As

  implicit class AsCUndef[T](val c: js.UndefOr[AsC]) extends AnyVal {
    def toJs: js.UndefOr[AsT] =
      c.map { d =>
        (d: Any) match {
          case o: As =>
            As.asFn(o)
          case f: String => f
        }
      }
  }

  private[semanticui] object raw {
    type SemanticCOLORS           = String
    type SemanticICONS            = String
    type SemanticSIZES            = String
    type IconSizeProp             = String
    type SemanticFLOATS           = String
    type SemanticTEXTALIGNMENTS   = String
    type SemanticShorthandContent = React.Node
    type SemanticShorthandItem[T] = React.Node | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
