package react.semanticui.elements

import scala.scalajs.js.|

package segment {
  sealed trait SegmentAttached {
    def value: Boolean | String
  }

  object SegmentAttached {
    case object Attached extends SegmentAttached {
      val value = true
    }
    case object Top extends SegmentAttached {
      val value = "top"
    }
    case object Bottom extends SegmentAttached {
      val value = "bottom"
    }
  }

  sealed trait SegmentPadded {
    def value: Boolean | String
  }

  object SegmentPadded {
    case object Padded extends SegmentPadded {
      val value = true
    }
    case object Very extends SegmentPadded {
      val value = "very"
    }
  }
}

package object segment
