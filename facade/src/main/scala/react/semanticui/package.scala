package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import js.JSConverters._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom._
import react.common.filterProps
import react.common.Render
import react.common.RenderFn

package semanticui {

  sealed trait As extends Product with Serializable {
    type P <: js.Object // props
    val props: P
  }

  object As               {
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
    import elements.placeholder.{ Placeholder => SUIPlaceholder }
    import elements.placeholder.{ PlaceholderParagraph => SUIPlaceholderParagraph }
    import elements.placeholder.{ PlaceholderImage => SUIPlaceholderImage }
    import elements.placeholder.{ PlaceholderLine => SUIPlaceholderLine }
    import elements.placeholder.{ PlaceholderHeader => SUIPlaceholderHeader }

    protected def removeAs[P <: js.Object](p: P): P =
      filterProps(p, "as")

    final case class AsTag[N <: TopNode](tagOf: TagOf[N]) extends As {
      override type P = js.Object
      override val props =
        js.Object.assign(js.Object(), tagOf.rawElement.asInstanceOf[React.DomElement].props)
    }

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
    final case class Placeholder(loader: SUIPlaceholder = SUIPlaceholder.Default) extends As {
      override type P = SUIPlaceholder.PlaceholderProps
      override val props = removeAs(loader.props)
    }
    final case class PlaceholderImage(loader: SUIPlaceholderImage = SUIPlaceholderImage.Default)
        extends As {
      override type P = SUIPlaceholderImage.PlaceholderImageProps
      override val props = removeAs(loader.props)
    }
    final case class PlaceholderParagraph(
      loader: SUIPlaceholderParagraph = SUIPlaceholderParagraph.Default
    ) extends As {
      override type P = SUIPlaceholderParagraph.PlaceholderParagraphProps
      override val props = removeAs(loader.props)
    }
    final case class PlaceholderHeader(
      loader: SUIPlaceholderHeader = SUIPlaceholderHeader.Default
    ) extends As {
      override type P = SUIPlaceholderHeader.PlaceholderHeaderProps
      override val props = removeAs(loader.props)
    }
    final case class PlaceholderLine(
      loader: SUIPlaceholderLine = SUIPlaceholderLine.Default
    ) extends As {
      override type P = SUIPlaceholderLine.PlaceholderLineProps
      override val props = removeAs(loader.props)
    }
    final case class Container(
      container: SUIContainer = SUIContainer.Default
    ) extends As {
      override type P = SUIContainer.ContainerProps
      override val props = removeAs(container.props)
    }

    def asFn(a: As): AsT =
      a match {
        case AsTag(tagOf)            => tagOf.tag
        case Segment(_)              => SUISegment.RawComponent
        case SidebarPushable(_)      => SUISidebarPushable.RawComponent
        case SidebarPusher(_)        => SUISidebarPusher.RawComponent
        case Header(_)               => SUIHeader.RawComponent
        case Menu(_)                 => SUIMenu.RawComponent
        case Grid(_)                 => SUIGrid.RawComponent
        case Form(_)                 => SUIForm.RawComponent
        case Image(_)                => SUIImage.RawComponent
        case Divider(_)              => SUIDivider.RawComponent
        case Checkbox(_)             => SUICheckbox.RawComponent
        case Loader(_)               => SUILoader.RawComponent
        case Container(_)            => SUIContainer.RawComponent
        case Placeholder(_)          => SUIPlaceholder.RawComponent
        case PlaceholderImage(_)     => SUIPlaceholderImage.RawComponent
        case PlaceholderHeader(_)    => SUIPlaceholderHeader.RawComponent
        case PlaceholderParagraph(_) => SUIPlaceholderParagraph.RawComponent
        case PlaceholderLine(_)      => SUIPlaceholderLine.RawComponent
      }
  }
}

package object semanticui {

  type SemanticWidth             = widths.SemanticWidth
  type SemanticFloat             = floats.SemanticFloat
  type SemanticColor             = colors.SemanticColor
  type SemanticSize              = sizes.SemanticSize
  type SemanticVerticalAlignment = verticalalignment.SemanticVerticalAlignment
  type SemanticTextAlignment     = textalignment.SemanticTextAlignment
  type SemanticTransition        = transitions.SemanticTransition

  type TabIndex       = Double | String
  type ShorthandS[C]  = String | C
  type ShorthandB[C]  = Boolean | C
  type ShorthandSB[C] = String | Boolean | C

  implicit class CompFnToPropsS[P <: js.Object, C](c: js.UndefOr[ShorthandS[C]])(implicit
    render:                                           C => RenderFn[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemS[P]] =
      c.map { d =>
        (d: Any) match {
          case s: String => s
          case c         => c.asInstanceOf[C].props
        }
      }
  }

  implicit class CompFnToPropsB[P <: js.Object, C](c: js.UndefOr[ShorthandB[C]])(implicit
    render:                                           C => RenderFn[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemB[P]] =
      c.map { d =>
        (d: Any) match {
          case b: Boolean => b
          case c          => c.asInstanceOf[C].props
        }
      }
  }

  implicit class CompFnToPropsSB[P <: js.Object, C](c: js.UndefOr[ShorthandSB[C]])(implicit
    render:                                            C => RenderFn[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemSB[P]] =
      c.map { d =>
        (d: Any) match {
          case s: String  => s
          case b: Boolean => b
          case c          => c.asInstanceOf[C].props
        }
      }
  }

  def compToPropS[P <: js.Object, C](c: ShorthandS[C])(implicit
    render:                             C => Render[P]
  ): raw.SemanticShorthandItemS[P] =
    (c: Any) match {
      case s: String => s
      case _         => c.asInstanceOf[C].props
    }

  implicit class CompToPropsS[P <: js.Object, C](c: js.UndefOr[ShorthandS[C]])(implicit
    render:                                         C => Render[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemS[P]] =
      c.map(d => compToPropS(d)(render))
  }

  implicit class CompToPropsB[P <: js.Object, C](c: js.UndefOr[ShorthandB[C]])(implicit
    render:                                         C => Render[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemB[P]] =
      c.map { d =>
        (d: Any) match {
          case b: Boolean => b
          case c          => c.asInstanceOf[C].props
        }
      }
  }

  implicit class CompToPropsSB[P <: js.Object, C](c: js.UndefOr[ShorthandSB[C]])(implicit
    render:                                          C => Render[P]
  ) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemSB[P]] =
      c.map { d =>
        (d: Any) match {
          case s: String  => s
          case b: Boolean => b
          case c          => c.asInstanceOf[C].props
        }
      }
  }

  implicit class CompSeqToArray[P <: js.Object, C](val c: js.UndefOr[Seq[ShorthandS[C]]])(implicit
    render:                                               C => Render[P]
  ) {
    def toJs: js.UndefOr[js.Array[raw.SemanticShorthandItemS[P]]] =
      c.map(_.map(d => compToPropS(d)(render)).toJSArray)
  }

  implicit class VdomNodeToReactNodeS[P <: js.Object](c: js.UndefOr[ShorthandS[VdomNode]]) {
    def toJs: js.UndefOr[raw.SemanticShorthandContent] =
      c.map { d =>
        (d: Any) match {
          case s: String   => s
          case v: VdomNode => v.rawNode
        }
      }
  }

  implicit class VdomNodeToReactNodeSB[P <: js.Object](c: js.UndefOr[ShorthandSB[VdomNode]]) {
    def toJs: js.UndefOr[raw.SemanticShorthandContentB] =
      c.map { d =>
        (d: Any) match {
          case s: String   => s
          case b: Boolean  => b
          case v: VdomNode => v.rawNode
        }
      }
  }

  type AsFn  = js.Function1[js.Any, js.Any]
  type AsObj = js.Object
  type AsT   = String | AsFn | AsObj
  type AsC   = String | As

  implicit def tagOf2AsC[T, N <: TopNode](tagOf: T)(implicit ev: T => TagOf[N]): js.UndefOr[AsC] =
    As.AsTag(ev(tagOf))

  implicit class AsCUndef[T](val c: js.UndefOr[AsC]) extends AnyVal {
    def toJs: js.UndefOr[AsT] =
      c.map { d =>
        (d: Any) match {
          case o: As     =>
            As.asFn(o)
          case f: String => f
        }
      }

    def toJsObject[A <: js.Object]: A =
      c.map { d =>
        (d: Any) match {
          case o: As     =>
            o.props.asInstanceOf[A]
          case _: String => (new js.Object).asInstanceOf[A]
        }
      }.getOrElse((new js.Object).asInstanceOf[A])
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
    type SemanticShorthandContentB   = Boolean | React.Node
    type SemanticShorthandItemS[T]   = String | T
    type SemanticShorthandItemB[T]   = Boolean | T
    type SemanticShorthandItemSB[T]  = String | Boolean | T
    type SemanticShorthandArray[T]   = js.Array[SemanticShorthandItemS[T]]
    type SemanticShorthandOrArray[T] = js.Array[React.Node] | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
