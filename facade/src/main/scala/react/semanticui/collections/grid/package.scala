package react.semanticui.collections

import react.common.EnumValue

package grid {
  sealed trait GridOnly extends Product with Serializable
  object GridOnly {
    implicit val enum: EnumValue[GridOnly] = EnumValue.instance {
      case Value(str)   => str
      case Computer     => "computer"
      case LargeScreen  => "largeScreen"
      case Mobile       => "mobile"
      case TabletMobile => "tablet mobile"
      case Tablet       => "tablet"
      case WideScreen   => "widescreen"

    }

    final case class Value(str: String) extends GridOnly
    case object Computer extends GridOnly
    case object LargeScreen extends GridOnly
    case object Mobile extends GridOnly
    case object TabletMobile extends GridOnly
    case object Tablet extends GridOnly
    case object WideScreen extends GridOnly
  }

  sealed trait GridReversed extends Product with Serializable
  object GridReversed {
    implicit val enum: EnumValue[GridReversed] = EnumValue.instance {
      case Value(str)         => str
      case Computer           => "computer"
      case ComputerVertically => "computer vertically"
      case Mobile             => "mobile"
      case MobileVertically   => "mobile vertically"
      case Tablet             => "tablet"
      case TabletVertically   => "tablet vertically"

    }

    final case class Value(str: String) extends GridReversed
    case object Computer extends GridReversed
    case object ComputerVertically extends GridReversed
    case object Mobile extends GridReversed
    case object MobileVertically extends GridReversed
    case object Tablet extends GridReversed
    case object TabletVertically extends GridReversed
  }

}

package object grid
