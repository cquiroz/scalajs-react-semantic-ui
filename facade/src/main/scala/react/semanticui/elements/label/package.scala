package react.semanticui.elements

import react.common.EnumValue
import scala.scalajs.js.|

package label {
  sealed trait LabelAttached

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

  sealed trait LabelCorner {
    def value: Boolean | String
  }
  object LabelCorner {
    case object Corner extends LabelCorner {
      val value = true
    }
    case object Left extends LabelCorner {
      val value = "left"
    }
    case object Right extends LabelCorner {
      val value = "right"
    }
  }

  sealed trait LabelPointing {
    def value: Boolean | String
  }

  object LabelPointing {
    case object Default extends LabelPointing {
      val value = true
    }
    case object Above extends LabelPointing {
      val value = "above"
    }
    case object Below extends LabelPointing {
      val value = "below"
    }
    case object Left extends LabelPointing {
      val value = "left"
    }
    case object Right extends LabelPointing {
      val value = "right"
    }
  }

  sealed trait LabelRibbon {
    def value: Boolean | String
  }
  object LabelRibbon {
    case object Default extends LabelRibbon {
      val value = true
    }
    case object Right extends LabelRibbon {
      val value = "right"
    }
  }
}

package object label {

  type UnmountedLabel = japgolly.scalajs.react.component.Js.UnmountedMapped[
    japgolly.scalajs.react.internal.Effect.Id,
    Label.LabelProps,
    Null,
    japgolly.scalajs.react.component.Js.RawMounted[Label.LabelProps, Null],
    Label.LabelProps,
    Null]

}
