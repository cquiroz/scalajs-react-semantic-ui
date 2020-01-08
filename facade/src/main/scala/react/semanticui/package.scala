package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom._
import react.common.GenericFnComponentPC
import react.common.GenericComponentPC

package semanticui {
  sealed trait As {
    type P <: js.Object // props
    val props: P
  }

  object As {
    import elements.segment.{ Segment => SUISegment }
    import collections.menu.{ Menu => SUIMenu }
    import modules.sidebar.{ SidebarPushable => SUISidebarPushable }
    import modules.sidebar.{ SidebarPusher => SUISidebarPusher }
    import modules.checkbox.{ Checkbox => SUICheckbox }
    import elements.header.{ Header => SUIHeader }
    import elements.image.{ Image => SUIImage }
    import elements.divider.{ Divider => SUIDivider }
    import elements.loader.{ Loader => SUILoader }
    import elements.container.{ Container => SUIContainer }

    final case class Segment(segment: SUISegment = SUISegment.Default) extends As {
      override type P = SUISegment.SegmentProps
      override val props = SUISegment.props(segment)
    }
    final case class SidebarPushable(pushable: SUISidebarPushable = SUISidebarPushable.Default)
        extends As {
      override type P = SUISidebarPushable.SidebarPushableProps
      override val props = SUISidebarPushable.props(pushable)
    }
    final case class SidebarPusher(pusher: SUISidebarPusher) extends As {
      override type P = SUISidebarPusher.SidebarPusherProps
      override val props = SUISidebarPusher.props(pusher)
    }
    final case class Header(props: SUIHeader.HeaderProps) extends As {
      override type P = SUIHeader.HeaderProps
    }
    final case class Menu(menu: SUIMenu = SUIMenu.Default) extends As {
      override type P = SUIMenu.MenuProps
      override val props = SUIMenu.props(menu)
    }
    final case class Image(image: SUIImage = SUIImage.Default) extends As {
      override type P = SUIImage.ImageProps
      override val props = SUIImage.props(image)
    }
    final case class Divider(divider: SUIDivider = SUIDivider.Default) extends As {
      override type P = SUIDivider.DividerProps
      override val props = SUIDivider.props(divider)
    }
    final case class Checkbox(check: SUICheckbox = SUICheckbox.Default) extends As {
      override type P = SUICheckbox.CheckboxProps
      override val props = SUICheckbox.props(check)
    }
    final case class Loader(loader: SUILoader = SUILoader.Default) extends As {
      override type P = SUILoader.LoaderProps
      override val props = SUILoader.props(loader)
    }
    final case class Container(
      container: SUIContainer = SUIContainer.Default
    ) extends As {
      override type P = SUIContainer.ContainerProps
      override val props = SUIContainer.props(container)
    }

    def asFn(a: As): AsT = a match {
      case Segment(_)         => SUISegment.RawComponent
      case SidebarPushable(_) => SUISidebarPushable.RawComponent
      case SidebarPusher(_)   => SUISidebarPusher.RawComponent
      case Header(_)          => SUIHeader.RawComponent
      case Menu(_)            => SUIMenu.RawComponent
      case Image(_)           => SUIImage.RawComponent
      case Divider(_)         => SUIDivider.RawComponent
      case Checkbox(_)        => SUICheckbox.RawComponent
      case Loader(_)          => SUILoader.RawComponent
      case Container(_)       => SUIContainer.RawComponent
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

  implicit class HandItem2ItemB[T](val c: Boolean | SemanticShortHandItem[T]) extends AnyVal {
    def toRaw: Boolean | raw.SemanticShorthandItem[T] =
      (c: Any) match {
        case o: Boolean  => o
        case o: VdomNode => o.rawNode.asInstanceOf[Boolean | raw.SemanticShorthandItem[T]]
        case f           => f.asInstanceOf[Boolean | raw.SemanticShorthandItem[T]]
      }
  }

  implicit class HandItem2ItemBUndef[T](val c: js.UndefOr[Boolean | SemanticShortHandItem[T]])
      extends AnyVal {
    def toRaw: js.UndefOr[Boolean | raw.SemanticShorthandItem[T]] =
      c.map(_.toRaw)
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

  def fnToRawOrProps[P <: js.Object](
    c: js.UndefOr[VdomNode | GenericFnComponentPC[P]]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[GenericFnComponentPC[P]].props
      }
    }

  def toRawOrProps[P <: js.Object](
    c: js.UndefOr[VdomNode | GenericComponentPC[P]]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[GenericComponentPC[P]].props
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
