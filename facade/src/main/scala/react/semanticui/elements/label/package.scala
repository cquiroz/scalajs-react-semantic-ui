package react.semanticui.elements

import react.common.EnumValue
import react.common.EnumValueB

package label {
  sealed trait LabelAttached extends Product with Serializable
  object LabelAttached {
    implicit val enum: EnumValue[LabelAttached] = EnumValue.instance {
      case Top         => "top"
      case Bottom      => "bottom"
      case TopRight    => "top right"
      case TopLeft     => "top left"
      case BottomLeft  => "bottom left"
      case BottomRight => "bottom right"
    }

    case object Top extends LabelAttached
    case object Bottom extends LabelAttached
    case object TopRight extends LabelAttached
    case object TopLeft extends LabelAttached
    case object BottomLeft extends LabelAttached
    case object BottomRight extends LabelAttached
  }

  sealed trait LabelCorner extends Product with Serializable
  object LabelCorner {
    implicit val enum: EnumValueB[LabelCorner] = EnumValueB.toLowerCaseStringT(Corner)
    case object Corner extends LabelCorner
    case object Left extends LabelCorner
    case object Right extends LabelCorner
  }

  sealed trait LabelPointing extends Product with Serializable
  object LabelPointing {
    implicit val enum: EnumValueB[LabelPointing] = EnumValueB.toLowerCaseStringT(Default)
    case object Default extends LabelPointing
    case object Above extends LabelPointing
    case object Below extends LabelPointing
    case object Left extends LabelPointing
    case object Right extends LabelPointing
  }

  sealed trait LabelRibbon extends Product with Serializable
  object LabelRibbon {
    implicit val enum: EnumValueB[LabelRibbon] = EnumValueB.toLowerCaseStringT(Default)
    case object Default extends LabelRibbon
    case object Right extends LabelRibbon
  }
}

package object label {
  type UnmountedLabel = japgolly.scalajs.react.component.Js.UnmountedMapped[
    japgolly.scalajs.react.internal.Effect.Id,
    Label.LabelProps,
    Null,
    japgolly.scalajs.react.component.Js.RawMounted[Label.LabelProps, Null],
    Label.LabelProps,
    Null
  ]
}
