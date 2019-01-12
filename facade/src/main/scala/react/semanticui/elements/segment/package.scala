package react.semanticui.elements

import react.common.EnumValueB

package segment {
  sealed trait SegmentAttached

  object SegmentAttached {
    implicit val enum: EnumValueB[SegmentAttached] = EnumValueB.toLowerCaseStringT(Attached)
    case object Attached extends SegmentAttached
    case object Top extends SegmentAttached
    case object Bottom extends SegmentAttached
  }

  sealed trait SegmentPadded

  object SegmentPadded {
    implicit val enum: EnumValueB[SegmentPadded] = EnumValueB.toLowerCaseStringT(Padded)
    case object Padded extends SegmentPadded
    case object Very extends SegmentPadded
  }
}

package object segment
