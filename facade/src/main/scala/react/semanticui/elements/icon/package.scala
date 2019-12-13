package react.semanticui.elements

import react.common._
import react.semanticui.sizes._
import react.semanticui.colors._

package icon {
  sealed trait IconFlip extends Product with Serializable
  object IconFlip {
    implicit val enum: EnumValue[IconFlip] = EnumValue.toLowerCaseString

    case object Horizontally extends IconFlip
    case object Vertically extends IconFlip
  }

  sealed trait IconRotated extends Product with Serializable
  object IconRotated {
    implicit val enum: EnumValue[IconRotated] = EnumValue.toLowerCaseString
    case object Clockwise extends IconRotated
    case object CounterClockwise extends IconRotated
  }

  sealed trait IconCorner extends Product with Serializable
  object IconCorner {
    implicit val enum: EnumValueB[IconCorner] = EnumValueB.instance {
      case BottomRight => "bottom right"
      case TopRight    => "top right"
      case TopLeft     => "top left"
      case BottomLeft  => "bottom left"
    }

    case object BottomRight extends IconCorner
    case object TopRight extends IconCorner
    case object TopLeft extends IconCorner
    case object BottomLeft extends IconCorner
  }
}

package object icon {

  implicit class CopyIconOps(val i: Icon) extends AnyVal {
    def size(s: SemanticSize): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = s,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def color(s: SemanticColor): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = s,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def flipped(s: IconFlip): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = s,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def rotated(s: IconRotated): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = s,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def bordered(): Icon =
      new Icon(as        = i.as,
               bordered  = true,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def circular(): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = true,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def className(c: String): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = c,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def corner(c: IconCorner): Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = c,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def disabled: Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = true,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def fitted: Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = true,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def inverted: Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = true,
               link      = i.link,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def link: Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = true,
               loading   = i.loading,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)

    def loading: Icon =
      new Icon(as        = i.as,
               bordered  = i.bordered,
               circular  = i.circular,
               className = i.className,
               clazz     = i.clazz,
               color     = i.color,
               corner    = i.corner,
               disabled  = i.disabled,
               fitted    = i.fitted,
               flipped   = i.flipped,
               inverted  = i.inverted,
               link      = i.link,
               loading   = true,
               name      = i.name,
               rotated   = i.rotated,
               size      = i.size,
               ariaLabel = i.ariaLabel,
               children  = i.children)
  }
}
