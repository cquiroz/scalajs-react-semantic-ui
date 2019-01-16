package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode

package semanticui {
  sealed trait As {
    type P <: js.Object // props
    val props: P
  }

  object As {
    import elements.segment.{ Segment => SUISegment }
    import collections.menu.{ Menu => SUIMenu }

    final case class Segment(props: SUISegment.SegmentProps = SUISegment.props()) extends As {
      override type P = SUISegment.SegmentProps
    }
    final case class SidebarPushable(props: modules.sidebar.Sidebar.Pushable.PushableProps)
        extends As {
      override type P = modules.sidebar.Sidebar.Pushable.PushableProps
    }
    final case class SidebarPusher(props: modules.sidebar.Sidebar.Pusher.PusherProps) extends As {
      override type P = modules.sidebar.Sidebar.Pusher.PusherProps
    }
    final case class Header(props: elements.header.Header.HeaderProps) extends As {
      override type P = elements.header.Header.HeaderProps
    }
    final case class Menu(props: SUIMenu.MenuProps = SUIMenu.props()) extends As {
      override type P = SUIMenu.MenuProps
    }

    def asFn(a: As): AsT = a match {
      case Segment(_)         => elements.segment.Segment.RawComponent
      case SidebarPushable(_) => modules.sidebar.Sidebar.Pushable.RawComponent
      case SidebarPusher(_)   => modules.sidebar.Sidebar.Pusher.RawComponent
      case Header(_)          => elements.header.Header.RawComponent
      case Menu(_)            => collections.menu.Menu.RawComponent
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

    def toJsObject[A <: js.Object]: A =
      c.map { d =>
          (d: Any) match {
            case o: As =>
              o.props.asInstanceOf[A]
            case _: String => (new js.Object).asInstanceOf[A]
          }
        }
        .getOrElse((new js.Object).asInstanceOf[A])
  }

  private[semanticui] object raw {
    type SemanticCOLORS           = String
    type SemanticICONS            = String
    type SemanticSIZES            = String
    type SemanticWIDTHS           = String
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
