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
    import modules.sidebar.Sidebar.{ Pushable => SUIPushable }
    import modules.sidebar.Sidebar.{ Pusher => SUIPusher }
    import elements.header.{ Header => SUIHeader }
    import elements.image.{ Image => SUIImage }
    import elements.divider.{ Divider => SUIDivider }

    final case class Segment(props: SUISegment.SegmentProps = SUISegment.props()) extends As {
      override type P = SUISegment.SegmentProps
    }
    final case class SidebarPushable(props: SUIPushable.PushableProps) extends As {
      override type P = SUIPushable.PushableProps
    }
    final case class SidebarPusher(props: SUIPusher.PusherProps) extends As {
      override type P = SUIPusher.PusherProps
    }
    final case class Header(props: SUIHeader.HeaderProps) extends As {
      override type P = SUIHeader.HeaderProps
    }
    final case class Menu(props: SUIMenu.MenuProps = SUIMenu.props()) extends As {
      override type P = SUIMenu.MenuProps
    }
    final case class Image(props: SUIImage.ImageProps = SUIImage.props()) extends As {
      override type P = SUIImage.ImageProps
    }
    final case class Divider(props: SUIDivider.DividerProps = SUIDivider.props()) extends As {
      override type P = SUIDivider.DividerProps
    }

    def asFn(a: As): AsT = a match {
      case Segment(_)         => SUISegment.RawComponent
      case SidebarPushable(_) => SUIPushable.RawComponent
      case SidebarPusher(_)   => SUIPusher.RawComponent
      case Header(_)          => SUIHeader.RawComponent
      case Menu(_)            => SUIMenu.RawComponent
      case Image(_)           => SUIImage.RawComponent
      case Divider(_)         => SUIDivider.RawComponent
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
    type SemanticCOLORS             = String
    type SemanticICONS              = String
    type SemanticSIZES              = String
    type SemanticWIDTHS             = String
    type IconSizeProp               = String
    type SemanticFLOATS             = String
    type SemanticTEXTALIGNMENTS     = String
    type SemanticVERTICALALIGNMENTS = String
    type SemanticShorthandContent   = React.Node
    type SemanticShorthandItem[T]   = React.Node | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
