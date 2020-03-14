package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom._
import react.common.filterProps
import react.common.GenericFnComponentPC
import react.common.GenericFnComponentPAC
import react.common.GenericComponentP
import react.common.GenericComponentPC
import react.common.GenericComponentPAC

package semanticui {
  sealed trait As extends Product with Serializable {
    type P <: js.Object // props
    val props: P
  }

  object As {
    import elements.segment.{ Segment => SUISegment }
    import collections.menu.{ Menu => SUIMenu }
    import collections.grid.{ Grid => SUIGrid }
    import collections.form.{ Form => SUIForm }
    import modules.sidebar.{ SidebarPushable => SUISidebarPushable }
    import modules.sidebar.{ SidebarPusher => SUISidebarPusher }
    import modules.checkbox.{ Checkbox => SUICheckbox }
    import elements.header.{ Header => SUIHeader }
    import elements.image.{ Image => SUIImage }
    import elements.divider.{ Divider => SUIDivider }
    import elements.loader.{ Loader => SUILoader }
    import elements.container.{ Container => SUIContainer }

    protected def removeAs[P <: js.Object](p: P): P =
      filterProps(p, "as")

    final case class Segment(segment: SUISegment = SUISegment.Default) extends As {
      override type P = SUISegment.SegmentProps
      override val props = removeAs(segment.props)
    }
    final case class SidebarPushable(pushable: SUISidebarPushable = SUISidebarPushable.Default)
        extends As {
      override type P = SUISidebarPushable.SidebarPushableProps
      override val props = removeAs(pushable.props)
    }
    final case class SidebarPusher(pusher: SUISidebarPusher) extends As {
      override type P = SUISidebarPusher.SidebarPusherProps
      override val props = removeAs(pusher.props)
    }
    final case class Header(props: SUIHeader.HeaderProps) extends As {
      override type P = SUIHeader.HeaderProps
    }
    final case class Menu(menu: SUIMenu = SUIMenu.Default) extends As {
      override type P = SUIMenu.MenuProps
      override val props = removeAs(menu.props)
    }
    final case class Grid(grid: SUIGrid = SUIGrid.Default) extends As {
      override type P = SUIGrid.GridProps
      override val props = removeAs(grid.props)
    }
    final case class Form(form: SUIForm = SUIForm.Default) extends As {
      override type P = SUIForm.FormProps
      override val props = removeAs(form.props)
    }
    final case class Image(image: SUIImage = SUIImage.Default) extends As {
      override type P = SUIImage.ImageProps
      override val props = removeAs(image.props)
    }
    final case class Divider(divider: SUIDivider = SUIDivider.Default) extends As {
      override type P = SUIDivider.DividerProps
      override val props = removeAs(divider.props)
    }
    final case class Checkbox(check: SUICheckbox = SUICheckbox.Default) extends As {
      override type P = SUICheckbox.CheckboxProps
      override val props = removeAs(check.props)
    }
    final case class Loader(loader: SUILoader = SUILoader.Default) extends As {
      override type P = SUILoader.LoaderProps
      override val props = removeAs(loader.props)
    }
    final case class Container(
      container: SUIContainer = SUIContainer.Default
    ) extends As {
      override type P = SUIContainer.ContainerProps
      override val props = removeAs(container.props)
    }

    def asFn(a: As): AsT = a match {
      case Segment(_)         => SUISegment.RawComponent
      case SidebarPushable(_) => SUISidebarPushable.RawComponent
      case SidebarPusher(_)   => SUISidebarPusher.RawComponent
      case Header(_)          => SUIHeader.RawComponent
      case Menu(_)            => SUIMenu.RawComponent
      case Grid(_)            => SUIGrid.RawComponent
      case Form(_)            => SUIForm.RawComponent
      case Image(_)           => SUIImage.RawComponent
      case Divider(_)         => SUIDivider.RawComponent
      case Checkbox(_)        => SUICheckbox.RawComponent
      case Loader(_)          => SUILoader.RawComponent
      case Container(_)       => SUIContainer.RawComponent
    }
  }
}

package object semanticui
    extends Floats
    with Widths
    with Colors
    with Sizes
    with TextAlignment
    with VerticalAlignment
    with Transitions {
  type SemanticShortHandItem[T] = VdomNode | T
  type SemanticShortHandContent = VdomNode
  type TabIndex                 = Double | String

  val floats            = SemanticFloat
  val widths            = SemanticWidth
  val colors            = SemanticColor
  val sizes             = SemanticSize
  val textalignment     = SemanticTextAlignment
  val verticalalignment = SemanticVerticalAlignment
  val transitions       = SemanticTransition

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
      c.map(_.toRaw)
  }

  implicit class HandItemSeq2ArrayUndef[T](val c: js.UndefOr[Seq[SemanticShortHandItem[T]]])
      extends AnyVal {
    def toRaw: js.UndefOr[js.Array[raw.SemanticShorthandItem[T]]] =
      c.map(_.map(_.toRaw).toJSArray)
  }

  implicit class HandSeq2OrArrayUndef[T](val c: js.UndefOr[Seq[VdomNode] | T]) extends AnyVal {
    def toRaw: js.UndefOr[raw.SemanticShorthandOrArray[T]] =
      (c: Any) match {
        case s: Seq[_] =>
          s.map(_.asInstanceOf[VdomNode].rawNode)
            .toJSArray
            .asInstanceOf[raw.SemanticShorthandOrArray[T]]
        case f => f.asInstanceOf[T]
      }
  }

  def fnToRawOrPropsPC[P <: js.Object, A <: GenericFnComponentPC[P, A]](
    c: js.UndefOr[VdomNode | A]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[A].props
      }
    }

  def fnToRawOrPropsPAC[P <: js.Object, A <: GenericFnComponentPAC[P, A]](
    c: js.UndefOr[VdomNode | A]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[A].props
      }
    }

  def toRawOrPropsP[P <: js.Object](
    c: js.UndefOr[VdomNode | GenericComponentP[P]]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[GenericComponentP[P]].props
      }
    }

  def toRawOrPropsPC[P <: js.Object, A <: GenericComponentPC[P, A]](
    c: js.UndefOr[VdomNode | A]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[A].props
      }
    }

  def toRawOrPropsPAC[P <: js.Object, A <: GenericComponentPAC[P, A]](
    c: js.UndefOr[VdomNode | A]
  ): js.UndefOr[raw.SemanticShorthandItem[P]] =
    c.map { d =>
      (d: Any) match {
        case o: VdomNode =>
          o.rawNode.asInstanceOf[raw.SemanticShorthandItem[P]]
        case f => f.asInstanceOf[A].props
      }
    }

  type AsFn  = js.Function1[js.Any, js.Any]
  type AsObj = js.Object
  type AsT   = String | AsFn | AsObj
  type AsC   = String | As

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
    type SemanticCOLORS              = String
    type SemanticICONS               = String
    type SemanticSIZES               = String
    type SemanticWIDTHS              = String
    type IconSizeProp                = String
    type SemanticFLOATS              = String
    type SemanticTEXTALIGNMENTS      = String
    type SemanticVERTICALALIGNMENTS  = String
    type SemanticShorthandContent    = React.Node
    type SemanticShorthandItem[T]    = React.Node | T
    type SemanticShorthandItemSB[T]  = String | Boolean | SemanticShortHandItem[T]
    type SemanticShorthandArray[T]   = js.Array[SemanticShorthandItem[T]]
    type SemanticShorthandOrArray[T] = js.Array[React.Node] | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
