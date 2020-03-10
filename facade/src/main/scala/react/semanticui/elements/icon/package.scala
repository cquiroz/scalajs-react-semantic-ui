package react.semanticui.elements

import react.common._
import react.semanticui._
import scala.scalajs.js
import scala.scalajs.js.|

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
  type IconShorthand = Boolean | String | Icon

  implicit class IconShorthandOpsUndef(icon: js.UndefOr[IconShorthand]) {
    def toJs: js.UndefOr[raw.SemanticShorthandItemSB[Icon.IconProps]] =
      icon.map(i =>
        (i: Any) match {
          case s: String  => s
          case b: Boolean => b
          case obj: Icon  => obj.props
        }
      )
  }

  implicit class CopyIconOps(val i: Icon) extends AnyVal {
    def size(s: SemanticSize): Icon =
      i.copy(size = s)

    def color(s: SemanticColor): Icon =
      i.copy(color = s)

    def flipped(s: IconFlip): Icon =
      i.copy(flipped = s)

    def rotated(s: IconRotated): Icon =
      i.copy(rotated = s)

    def bordered(): Icon =
      i.copy(bordered = true)

    def circular(): Icon =
      i.copy(circular = true)

    def className(c: String): Icon =
      i.copy(className = c)

    def corner(c: IconCorner): Icon =
      i.copy(corner = c)

    def disabled: Icon =
      i.copy(disabled = true)

    def fitted: Icon =
      i.copy(fitted = true)

    def inverted: Icon =
      i.copy(inverted = true)

    def link: Icon =
      i.copy(link = true)

    def loading: Icon =
      i.copy(loading = true)
  }
}
