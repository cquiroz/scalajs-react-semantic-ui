package react.semanticui.elements

import scala.scalajs.js.|

package label {
  sealed trait LabelAttached {
    def value: String
  }

  object LabelAttached {
    case object Top extends LabelAttached {
      val value = "top"
    }
    case object Bottom extends LabelAttached {
      val value = "bottom"
    }
    case object TopRight extends LabelAttached {
      val value = "top right"
    }
    case object TopLeft extends LabelAttached {
      val value = "top left"
    }
    case object BottomLeft extends LabelAttached {
      val value = "bottom left"
    }
    case object BottomRight extends LabelAttached {
      val value = "bottom right"
    }
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
